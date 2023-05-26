package codegenerator;

import ast.definitions.FuncDefinition;
import ast.expresions.*;
import ast.types.IntType;
import ast.types.StructType;

public class ValueCGVisitor  extends AbstractCGVisitor<FuncDefinition,Void>{


    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Variable node, FuncDefinition params) {
         /*
        Value[[Variable : expression -> ID]]()=
			Address[[expression]]()
			<LOAD> expression.type
         */
        node.accept(addressCGVisitor, params);
        codeGenerator.load(node.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Arithmetic node, FuncDefinition params) {
         /*
        Value[[Arithmetic : expression -> left: expression right: expression operator: String]]()=
            Value[[left]]()
            Value[[right]]()
            <Arithmetic> expression.left.type <,> operator
         */
        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);
        codeGenerator.arithmetic(node.getOperator(), node.getType());
        return null;
    }


    @Override
    public Void visit(ArrayIndexer node, FuncDefinition params) {

         /*
        Value[[ArrayIndex: expression -> left: expression right: expression]]()=
            Address[[ArrayIndex]]()
            <LOAD> ArrayAccess.type
         */
        node.accept(addressCGVisitor, params);
        codeGenerator.load(node.getType());
        return null;
    }

    @Override
    public Void visit(Cast node, FuncDefinition params) {
          /*
        Value[[Cast: expression -> type : Type expr]]()=
            Value[[Cast]]()
            <CAST> expr <,> cast.type
         */
        node.getExpression().accept(this, params);
        codeGenerator.cast(node.getExpression().getType(), node.getType());
        return null;
    }

    @Override
    public Void visit(CharLiteral node, FuncDefinition params) {
         /*
        Value[[CharLiteral : expression -> literal]]()=
            <PUSHB> CharLiteral.value
         */
        codeGenerator.push(node.getValue());
        return null;
    }

    @Override
    public Void visit(Comparison node, FuncDefinition params) {
        /*
        Value[[Comparison : expression -> left: expression right: expression operator: String]]()=
            Value[[left]]()
            Value[[right]]()
            <COMPARISON> operator <,> comparison.type
         */
        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);
        codeGenerator.comparison(node.getOperator(), node.getLeft().getType());
        return null;
    }

    @Override
    public Void visit(DoubleLiteral node, FuncDefinition params) {
        /*
        Value[[CharLiteral : expression -> literal]]()=
            <PUSHF> CharLiteral.value
         */
        codeGenerator.push(node.getValue());
        return null;
    }


    @Override
    public Void visit(RecordNavigation node, FuncDefinition params) {
        /*
        Value[[FieldAccess : expr -> fieldName : String]]()=
            Address[[expr]]()
            <LOAD> expr.type
         */
        node.accept(addressCGVisitor, params);
        codeGenerator.load(((StructType) node.getExpression().getType()).getFieldDDefinition(node.getName())
                .getType());
        return null;
    }

    @Override
    public Void visit(FunctionInvocExpression node, FuncDefinition params) {
          /*
        Value[[FunctionInvocation: expression_1 -> expression_2 expression_3*]]()
	        for(expression e : expression_3*)
		        value[[e]]()
	    <CALL> expression_2.name
         */
        for (Expression expr : node.getArguments()){
            expr.accept(this, params);
        }
        codeGenerator.call(node.getName().getName());
        return null;
    }

    @Override
    public Void visit(IntLiteral node, FuncDefinition params) {
        /*
        Value[[IntLiteral : expr -> value: int]]()=
            <PUSHI> expr.value
         */
        codeGenerator.push(node.getValue());
        return null;
    }

    @Override
    public Void visit(Logic node, FuncDefinition params) {
         /*
        Value[[Logic : expression -> left: expression right: expression operator: String]]()=
            Value[[left]]()
            Value[[right]]()
            <LOGIC> operator <,> comparison.type
         */
        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);
        codeGenerator.logic(node.getOperator());
        return null;
    }

    @Override
    public Void visit(Not node, FuncDefinition params) {

        /*
        Value[[Not : expression -> expr]]()=
            Value[[expr]]()
            <NOT>
         */
        node.getExpression().accept(this, params);
        codeGenerator.not();
        return null;
    }


    @Override
    public Void visit(UnaryMinus node, FuncDefinition params) {
        /*
        Value[[UnaryMinus : expression -> expr]]()=
            <PUSHI> 0
            <CAST> Int <,> expr.type
            Value[[expr]]()
            <SUB>
         */
        codeGenerator.push(0);
        codeGenerator.cast(IntType.getInstance(), node.getType());
        node.getExpression().accept(this, params);
        codeGenerator.sub(node.getType());
        return null;
    }



    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }
}
