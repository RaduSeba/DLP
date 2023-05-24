package codegenerator;

import ast.Program;
import ast.definitions.FieldDefinition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expresions.*;
import ast.statements.*;
import ast.types.*;
import semantic.Visitor;

public class AbstractCGVisitor<TP,TR> implements Visitor<TP,TR> {
    @Override
    public TR visit(Program node, TP params) {
        return null;
    }

    @Override
    public TR visit(FieldDefinition node, TP params) {
        return null;
    }

    @Override
    public TR visit(FuncDefinition node, TP params) {
        return null;
    }

    @Override
    public TR visit(VarDefinition node, TP params) {
        return null;
    }

    @Override
    public TR visit(Arithmetic node, TP params) {
        return null;
    }

    @Override
    public TR visit(ArrayIndexer node, TP params) {
        return null;
    }

    @Override
    public TR visit(Cast node, TP params) {
        return null;
    }

    @Override
    public TR visit(CharLiteral node, TP params) {
        return null;
    }

    @Override
    public TR visit(Comparison node, TP params) {
        return null;
    }

    @Override
    public TR visit(DoubleLiteral node, TP params) {
        return null;
    }

    @Override
    public TR visit(FunctionInvocExpression node, TP params) {
        return null;
    }

    @Override
    public TR visit(IntLiteral node, TP params) {
        return null;
    }

    @Override
    public TR visit(Logic node, TP params) {
        return null;
    }

    @Override
    public TR visit(Not node, TP params) {
        return null;
    }

    @Override
    public TR visit(RecordNavigation node, TP params) {
        return null;
    }

    @Override
    public TR visit(UnaryMinus node, TP params) {
        return null;
    }

    @Override
    public TR visit(Variable node, TP params) {
        return null;
    }

    @Override
    public TR visit(Assignment node, TP params) {
        return null;
    }

    @Override
    public TR visit(Condition node, TP params) {
        return null;
    }

    @Override
    public TR visit(Input node, TP params) {
        return null;
    }

    @Override
    public TR visit(Print node, TP params) {
        return null;
    }

    @Override
    public TR visit(Return node, TP params) {
        return null;
    }

    @Override
    public TR visit(While node, TP params) {
        return null;
    }

    @Override
    public TR visit(ArrayType node, TP params) {
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
        return null;
    }

    @Override
    public TR visit(IntType node, TP params) {
        return null;
    }

    @Override
    public TR visit(StructType node, TP params) {
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
