package ast.types;

import ast.ASTNode;
import semantic.Visitor;

public class IntType extends AbstractType {


    private static IntType instance;

    public IntType(int line, int column){
        super(line, column);
    }

    private IntType() {
        super(0,0);
    }

    public static  IntType getInstance(){
        if(instance==null)
            instance= new IntType();
        return instance;
    }


    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type other, ASTNode node) {
        if (other instanceof IntType || other instanceof ErrorType){
            return other;
        }

        return super.arithmetic(other, node);
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return this;
    }

    @Override
    public Type comparison(Type type,ASTNode node) {
        if (type instanceof IntType || type instanceof ErrorType){
            return type;
        }

        return super.comparison(type, node);
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type instanceof IntType || type instanceof ErrorType){
            return type;
        }

        return super.logical(type, node);
    }

    @Override
    public Type logical(ASTNode node) {
        return this;
    }

    @Override
    public boolean isBuiltinType() {
        return true;
    }

    @Override
    public Type cast(Type type, ASTNode node) {
        if (type instanceof IntType || type instanceof DoubleType ||
               type instanceof CharType){
            return this;
        }

        return super.cast(type, node);
    }

    @Override
    public char suffix() {
        return 'i';
    }



    @Override
    public Type promotesTo(Type type,ASTNode node) {
        if (type instanceof IntType || type instanceof ErrorType){
            return type;
        }

        return super.promotesTo(type, node);
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
