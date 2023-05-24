package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.definitions.FieldDefinition;
import ast.expresions.Expression;

import java.util.List;


public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {

        super(line, column);
        checkParams(line,column);
    }


    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type other, ASTNode node) {
       return new ErrorType(node.getLine(), node.getColumn(),"Can't do operation between left and right");
    }

    @Override
    public Type arithmetic(ASTNode node) {

        return new ErrorType(node.getLine(), node.getColumn(),"Can't do operation between left and right");

    }

    @Override
    public Type comparison(Type other,ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't compare this expression");

    }

    @Override
    public Type logical(Type other,ASTNode node) {

        return new ErrorType(node.getLine(), node.getColumn(), "Can't perform this logical operation");

    }

    @Override
    public Type logical(ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't perform this logical operation");

    }

    @Override
    public Type dot(String field,ASTNode node)
    {

        return new ErrorType(node.getLine(), node.getColumn(), "Can't access this field");

    }



    @Override
    public boolean isBuiltinType() {
        return false;
    }

    @Override
    public Type cast(Type type,ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't be casted");
    }

    @Override
    public Type squareBrackets(Type type,ASTNode node)
    {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't access");
    }


    @Override
    public Type promotesTo(Type type,ASTNode node) {
        return new ErrorType(node.getLine(), node.getColumn(), "Can't promote this");
    }

    @Override
    public Type parenthesis(List<Expression> types, ASTNode node) {

        return new ErrorType(node.getLine(), node.getColumn(), "Can't analyze the parenthesis");
    }


    @Override
    public FieldDefinition getFieldDefinition(String name) {
        return null;
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public char suffix() {
        throw new IllegalStateException();
    }

    /**
     * Check the params of the constructor
     * @param line, at least 0
     * @param column, at least 0
     */
    private void checkParams(int line, int column) {
        if (line < 0) {
            throw new IllegalArgumentException("The line must be at least 0");
        }
        if (column < 0) {
            throw new IllegalArgumentException("The size must be at least 0");
        }
    }
}
