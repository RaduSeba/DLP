package ast.types;

import ast.ASTNode;
import semantic.Visitor;

public class CharType extends AbstractType{

    public CharType(int line, int column) {
        super(line,column);
    }

    private  static CharType instance =null;

    private CharType(){
        super(0,0);
    }

    public static  CharType getInstance()
    {
        if(instance==null)
        {
            instance= new CharType();
        }
        return  instance;
    }


    @Override
    public Type arithmetic(Type other, ASTNode node) {
        if(other instanceof CharType)
        {
           return IntType.getInstance();
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
    public Type comparison(Type other,ASTNode node) {
        if (other instanceof CharType || other instanceof ErrorType){
            return IntType.getInstance();
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
        if (type instanceof CharType|| type instanceof ErrorType){
            return type;
        }

        return super.promotesTo(type, node);
    }


    @Override
    public String toString() {
        return "char";
    }

    @Override
    public char suffix() {
        return 'b';
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
