package semantic;

import ast.Program;
import ast.definitions.Definition;
import ast.definitions.FieldDefinition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expresions.*;
import ast.statements.*;
import ast.types.*;

public class AbstractVisitor<TP,TR>  implements  Visitor<TP,TR>{

    @Override
    public TR visit(Program p, TP tp) {

        for(Definition d: p.getDefinitions())
            d.accept(this, tp);
        return null;
    }

    @Override
    public TR visit(FieldDefinition node, TP params) {
        node.getType().accept(this, params);
        return null;
    }



    @Override
    public TR visit(FuncDefinition f, TP tp) {
        f.getType().accept(this, tp);
        f.getVarDefinitions().forEach(varDefinition -> varDefinition.accept(this, tp));
        f.getStatements().forEach(statement -> statement.accept(this, tp));
        return null;
    }

    @Override
    public TR visit(VarDefinition node, TP params) {


        node.getType().accept(this, params);
        return null;
    }

    @Override
    public TR visit(Arithmetic node, TP params) {

        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);
        return null;
    }

    @Override
    public TR visit(ArrayIndexer node, TP params) {

        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);
        return null;
    }

    @Override
    public TR visit(Cast node, TP params) {

        node.getType().accept(this,params);
        node.getExpression().accept(this,params);

        return null;
    }

    @Override
    public TR visit(CharLiteral node, TP params) {
        return null;
    }

    @Override
    public TR visit(Comparison node, TP params) {

        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);

        return null;
    }

    @Override
    public TR visit(DoubleLiteral node, TP params) {
        return null;
    }

    @Override
    public TR visit(FunctionInvocExpression node, TP params) {

        node.getName().accept(this,params);
        for(Expression e:node.getArguments())
            e.accept(this,params);
        return null;
    }

    @Override
    public TR visit(IntLiteral node, TP params) {
        return null;
    }

    @Override
    public TR visit(Logic node, TP params) {
        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);
        return null;
    }

    @Override
    public TR visit(Not node, TP params) {
        node.getExpression().accept(this, params);

        return null;
    }

    @Override
    public TR visit(RecordNavigation node, TP params) {

        node.getExpression().accept(this, params);

        return null;
    }

    @Override
    public TR visit(UnaryMinus node, TP params) {
        node.getExpression().accept(this, params);
        return null;
    }

    @Override
    public TR visit(Variable node, TP params) {
        return null;
    }




    @Override
    public TR visit(Assignment node, TP params) {
        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);

        return null;
    }

    @Override
    public TR visit(Condition node, TP params) {

        node.getCondition().accept(this, params);
        for(Statement s:node.getIfBody())
            s.accept(this, params);
        for(Statement s:node.getElseBody())
            s.accept(this, params);

        return null;
    }

    @Override
    public TR visit(Input node, TP params) {

        node.getExpressions().forEach(expression -> expression.accept(this, params));
        return null;
    }

    @Override
    public TR visit(Print node, TP params) {

        for(Expression e:node.getExpressions())
            e.accept(this, params);

        return null;
    }

    @Override
    public TR visit(Return node, TP params) {

        node.getExpression().accept(this, params);
        return null;
    }

    @Override
    public TR visit(While node, TP params) {

        node.getCondition().accept(this, params);
        for(Statement s:node.getBody())
            s.accept(this,params);

        return null;
    }

    @Override
    public TR visit(ArrayType node, TP params) {
        node.getArrayType().accept(this, params);

        return null;
    }

    @Override
    public TR visit(CharType node, TP params) {
        return null;
    }

    @Override
    public TR visit(DoubleType node, TP params) {
        return null;
    }

    @Override
    public TR visit(FunctionType node, TP params) {

        node.getReturnType().accept(this, params);
        for(Definition d:node.getParameters())
            d.accept(this,params);

        return null;
    }

    @Override
    public TR visit(IntType node, TP params) {
        return null;
    }

    @Override
    public TR visit(StructType node, TP params) {

        for(FieldDefinition f:node.getFields())
            f.accept(this,params);

        return null;
    }

    @Override
    public TR visit(VoidType node, TP params) {
        return null;
    }

    @Override
    public TR visit(ErrorType node, TP params) {
        return null;
    }
}
