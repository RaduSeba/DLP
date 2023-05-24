package ast.types;

import ast.ASTNode;
import semantic.Visitor;

public class DoubleType extends AbstractType{


    private static DoubleType instance;
    public DoubleType(int line, int column) {
        super(line, column);
    }

    public static DoubleType getInstance(int line, int column)
    {
        if(instance==null)
            instance = new DoubleType(line, column);
        return instance;
    }


    @Override
    public Type arithmetic(Type other,ASTNode node) {
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
    public Type comparison(Type other, ASTNode node) {
        if(this.equals(other))
            return IntType.getInstance();

        else if(other instanceof ErrorType)
            return other;
        else
            return super.comparison(other,node);
    }
    @Override
    public boolean isBuiltinType() {
        return true;
    }

    @Override
    public Type cast(Type type,ASTNode node) {
        if (type.isBuiltinType()) {
            return this;
        } else if (type instanceof ErrorType)
            return type;
        else
            return super.cast(type,node);
    }

    @Override
    public Type promotesTo(Type type,ASTNode node) {
        if(this.equals(type))
            return this;
        else if(type instanceof ErrorType)
            return type;
        else
            return super.promotesTo(type,node);
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
