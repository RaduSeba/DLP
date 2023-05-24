package ast.types;

import ast.ASTNode;
import semantic.Visitor;

public class IntType extends AbstractType {


    private static IntType instance;

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
        return false;
    }

    @Override
    public Type arithmetic(Type other, ASTNode node) {
        if(this.equals(other))
        {
            return this;
        }
        else if(other instanceof ErrorType)
            return other;
        else
            return super.arithmetic(other,node);
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return this;
    }

    @Override
    public Type comparison(Type type,ASTNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.comparison(type, node);
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type.equals(this) || type instanceof ErrorType){
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
        if(type.isBuiltinType())
        {
            return  this;
        }
        else if (type instanceof ErrorType)
            return type;
        else
            return super.cast(type,node);
    }

    @Override
    public char suffix() {
        return 'i';
    }



    @Override
    public Type promotesTo(Type type,ASTNode node) {
        if (type.equals(this) || type instanceof ErrorType){
            return type;
        }

        return super.promotesTo(type, node);
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
