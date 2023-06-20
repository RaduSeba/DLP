package codegenerator;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expresions.Expression;
import ast.expresions.FunctionInvocExpression;
import ast.statements.*;
import ast.types.FunctionType;
import ast.types.IntType;
import ast.types.VoidType;

public class ExecuteCGVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;
    private CodeGenerator codeGenerator;

    public ExecuteCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
        addressCGVisitor = new AddressCGVisitor(codeGenerator);
        valueCGVisitor = new ValueCGVisitor(codeGenerator);
        addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
    }

    @Override
    public Void visit(Program node, FuncDefinition params) {
        /*
        Execute[[Program: Program -> Definition*]]()=
                FOR (Definition de : definition*)
                    if instance of VarDefinition
                        Execute[[de]]()
                <Call MAIN>
	            <HALT>
                FOR(Definition de : definition*)
                    if instance of FuncDefinition
                        execute[[de]]()
         */
        for (Definition de : node.getDefinitions()){
            if (de instanceof VarDefinition){
                de.accept(this, params);
            }
        }
        codeGenerator.functionComment("Invocation to the main function");
        codeGenerator.call("main");
        codeGenerator.halt();
        for(Definition de : node.getDefinitions()){
            if (de instanceof FuncDefinition){
                de.accept(this, params);
            }
        }
        return null;
    }

    @Override
    public Void visit(VarDefinition node, FuncDefinition params) {
        codeGenerator.commentVariables(node.getType() + " " + node.getName() +
                " (offset " + node.getOffSet() + ")");
        return null;
    }

    @Override
    public Void visit(FuncDefinition node, FuncDefinition params) {
         /*
        Execute[[FuncDefinition : definition -> name : String type statements*]]()=
            <ENTER> definition.localVariablesBytes
            for (VarDefinition varDefinition : ((FunctionType) funcDefinition.getType()).parameters)
                Execute[[varDefinition]]
            for (VarDefinition varDefinition : funcDefinition.variables)
                Execute[[varDefinition]]
            for (Statements state : statements*)
                Execute[[state]]
            if (type.returnType instance of VoidType)
                <RET> 0 <,> definition.localVariablesBytes <,> type.numberOfBytes
         */
        codeGenerator.line(node.getLine());
        codeGenerator.label(node.getName());

        codeGenerator.commentVariables("Parameters");
        for (Definition varDefinition : ((FunctionType) node.getType()).getParameters()){
            varDefinition.accept(this, params);
        }
        codeGenerator.commentVariables("Local variables");
        for (Definition varDefinition : node.getVarDefinitions()){
            varDefinition.accept(this, params);
        }

        codeGenerator.enter(node.getLocalVariablesBytes() );

        for (Statement state : node.getStatements()){
            state.accept(this, node);
        }
        if (((FunctionType)node.getType()).getType() instanceof VoidType){
            codeGenerator.ret(0, node.getLocalVariablesBytes() ,
                    node.getType().numberOfBytes());
        }
        return null;
    }

    @Override
    public Void visit(Assignment node, FuncDefinition params) {
         /*
        Execute[[Assignment : statement -> left : expr right : expr]]()=
            Address[[left]]
            Value[[right]]
            <STORE> left.type
         */
        codeGenerator.line(node.getLine());
        codeGenerator.commentVariables("Assignment");
        node.getLeft().accept(addressCGVisitor, params);
        node.getRight().accept(valueCGVisitor, params);
        codeGenerator.store(node.getLeft().getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocExpression node, FuncDefinition params) {
        /*
        Execute[[FunctionInvocation: statement -> var : Variable expression*]]()
	        Value[[(expression)statement]]()
	        if(((expression)statement).type instance of Void)
		        <POP>((expression)statement).type
         */
        codeGenerator.line(node.getLine());
        node.accept(valueCGVisitor, params);
        if (!(node.getType() instanceof VoidType)){
            codeGenerator.pop(node.getType());
        }
        return null;
    }

    @Override
    public Void visit(Condition node, FuncDefinition params) {
        /*
        Execute[[IfElse : statement -> expr ifBody: statement* elseBody: statement*]]()=
	        int else = cg.getLabel();
            int end = cg.getLabel();
            Value[[expr]]()
            <JZ label_> else
            for(statement st: ifBody)
                Execute[[st]]()
            <JMP label_> end
            <LABEL_> else <:>
            for(statement st: elseBody)
                Execute[[st]]()
            <JMP label_> end
            <LABEL_> end <:>
         */
        codeGenerator.line(node.getLine());
        int elseN = codeGenerator.getLabel();
        int end = codeGenerator.getLabel();
        node.getCondition().accept(valueCGVisitor, params);
        codeGenerator.jz("else" + elseN);
        for (Statement st : node.getIfBody()){
            st.accept(this, params);
        }
        codeGenerator.jmp("end" + end);
        codeGenerator.label("else" + elseN);
        for (Statement st : node.getElseBody()){
            st.accept(this, params);
        }
        codeGenerator.jmp("end" + end);
        codeGenerator.label("end" + end);
        return null;
    }

    @Override
    public Void visit(Input node, FuncDefinition params) {
         /*
        Execute[[Input : Statement -> expression]]()=
		    Address[[expression]]()
		    <IN> expression.type
		    <STORE> expression.type
         */
        codeGenerator.line(node.getLine());
        for (Expression expr : node.getExpressions()){
            codeGenerator.commentVariables("Read");
            expr.accept(addressCGVisitor, params);
            codeGenerator.in(expr.getType());
            codeGenerator.store(expr.getType());
        }
        return null;
    }

    @Override
    public Void visit(Print node, FuncDefinition params) {
        /*
        Execute[[Print : Statement -> expression]]()=
		    Value[[expression]]()
		    <OUT> expression.type.suffix
         */
        for(Expression expr : node.getExpressions()){
            codeGenerator.line(node.getLine());
            codeGenerator.commentVariables("Write");
            expr.accept(valueCGVisitor, params);
            codeGenerator.out(expr.getType());
        }
        return null;
    }

    @Override
    public Void visit(Return node, FuncDefinition params) {
         /*
        Execute[[Return: statement -> expression]](FunctionDefinition)=
	        Value[[expression]]()
	        <RET> expression.type.numberOfBytes <,> funcDefinition.localVariableBytes <,>
	            funcDefinition.type.numberOfBytes
         */
        codeGenerator.line(node.getLine());
        codeGenerator.commentVariables("Return");
        node.getExpression().accept(valueCGVisitor, params);
        codeGenerator.ret(node.getExpression().getType().numberOfBytes(), params.getLocalVariablesBytes(),
                ((FunctionType)params.getType()).parameters());
        return null;
    }

    @Override
    public Void visit(While node, FuncDefinition params) {

        /*
        execute[[While: statement -> expression statements*]]()=
            int condition = cg.getLabel();
            int end = cg.getLabel();
            <LABEL_> condition <:>
            Value[[expression]]()
            <JZ label_> end
            for(statement st: statements*)
                Execute[[st]]()
            <JMP label_> condition
            <LABEL_> end <:>
         */
        codeGenerator.line(node.getLine());
        int condition = codeGenerator.getLabel();
        int end = codeGenerator.getLabel();
        codeGenerator.label("label" + condition);
        node.getCondition().accept(valueCGVisitor, params);
        codeGenerator.jz("label" + end);
        for (Statement state : node.getBody()){
            state.accept(this, params);
        }
        codeGenerator.jmp("label" + condition);
        codeGenerator.label("label" + end);
        return null;
    }

    @Override
    public Void visit(Increment node, FuncDefinition params) {


        codeGenerator.line(node.getLine());
        codeGenerator.commentVariables("Assignment");
        node.getExpression().accept(addressCGVisitor, params);
        node.getExpression().accept(valueCGVisitor, params);
        codeGenerator.push(1);
        codeGenerator.add(IntType.getInstance());
        codeGenerator.store(node.getExpression().getType());
        return null;
    }

    @Override
    public Void visit(Forloop node, FuncDefinition params) {
        codeGenerator.line(node.getLine());
        int start = codeGenerator.getLabel();
        int end = codeGenerator.getLabel();
        node.getStatementAssign().accept(this,params);

        codeGenerator.label("label" + start);
        node.getCondition().accept(valueCGVisitor,params);
        codeGenerator.jz("label" + end);
        for (Statement state : node.getBody()){
            state.accept(this, params);

        }
        node.getStatementIncrement().accept(this,params);
        codeGenerator.jmp("label" + start);
        codeGenerator.label("label" + end);

        return null;
    }
}
