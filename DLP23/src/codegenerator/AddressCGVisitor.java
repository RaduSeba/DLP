package codegenerator;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expresions.ArrayIndexer;
import ast.expresions.RecordNavigation;
import ast.expresions.Variable;
import ast.types.ArrayType;
import ast.types.IntType;
import ast.types.StructType;

public class AddressCGVisitor extends AbstractCGVisitor<FuncDefinition,Void>{

    private CodeGenerator codeGenerator;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    @Override
    public Void visit(Variable node, FuncDefinition params) {
        /*

        adress[[Variable: statement -> expression]]()=

        if (exp.definition.scope==0)
        pusha exp.definition.offset
        else {
        push bp
        pushi exp.definition.offset
        addi
        }
         */
        if (node.getDefinition().getScope() == 0){
            codeGenerator.pusha(((VarDefinition)node.getDefinition()).getOffSet());
        } else {
            codeGenerator.pushbp();
            codeGenerator.push(((VarDefinition)node.getDefinition()).getOffSet());
            codeGenerator.add(IntType.getInstance());
        }
        return null;

    }

    @Override
    public Void visit(ArrayIndexer node, FuncDefinition params) {
        /*
        Address[[Indexing: expression_1 -> expression_2 expression_3]]()=
	        Address[[expression_2]]()
	        Value[[expression_3]]()
	        <PUSHI> expression_1.type.numberofbytes
	        <MULTI>
	        <ADDI>
         */
        node.getLeft().accept(this, params);
        node.getRight().accept(this.valueCGVisitor, params);
        ArrayType array = (ArrayType) node.getLeft().getType();
        codeGenerator.push(array.getArrayType().numberOfBytes());
        codeGenerator.mul(IntType.getInstance());
        codeGenerator.add(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(RecordNavigation node, FuncDefinition params) {

         /*
        Address[[FieldAccess: expression_1 -> expression_2 ID]]()=
	        Address[[expression_2]]()
            <PUSHI> expression_2.type.id.offset
	        <ADDI>
         */
        node.getExpression().accept(this, params);
        StructType type = (StructType)  node.getExpression().getType();
        codeGenerator.push(type.getFieldDDefinition(node.getName()).getOffSet());
        codeGenerator.add(IntType.getInstance());
        return null;
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor){
        this.valueCGVisitor = valueCGVisitor;
    }
}
