package ast.types;

import ast.ASTNode;
import semantic.Visitor;

public class DoubleType extends AbstractType{


    private static DoubleType instance;
    public DoubleType(int line, int column) {
        super(line, column);
    }

    private DoubleType(){
        super(0,0);
    }

    public static DoubleType getInstance()
    {
        if(instance==null)
            instance = new DoubleType();
        return instance;
    }


    @Override
    public Type arithmetic(Type other,ASTNode node) {
        if (other instanceof DoubleType || other instanceof ErrorType){
            return other;
        }

        return super.arithmetic(other, node);
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return this;
    }

    @Override
    public Type comparison(Type other, ASTNode node) {
        if (other instanceof DoubleType || other instanceof ErrorType){
            return other;
        }

        return super.comparison(other, node);
    }
    @Override
    public boolean isBuiltinType() {
        return true;
    }

    @Override
    public Type cast(Type type,ASTNode node) {
        if (type instanceof IntType || type instanceof DoubleType ||
                type instanceof CharType){
            return this;
        }

        return super.cast(type, node);
    }

    @Override
    public Type promotesTo(Type type,ASTNode node) {
        if (type instanceof DoubleType|| type instanceof ErrorType){
            return type;
        }

        return super.promotesTo(type, node);
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public int numberOfBytes() {
        return 4;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
