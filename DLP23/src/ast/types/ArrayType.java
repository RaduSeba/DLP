package ast.types;

import ast.ASTNode;
import semantic.Visitor;

public class ArrayType extends AbstractType{

    private Type arrayType;
    private int arraySize;

    public ArrayType(int line, int column, Type arrayType, int size) {
        super(line, column);
        checkParams(arrayType);
        this.arraySize= size;

        this.arrayType = arrayType;
    }

    public int getArraySize() {
        return arraySize;
    }

    public Type getArrayType(){

        return arrayType;
    }

    /**
     * Check the params of the constructor
     * @param type, shouldn't be null
     */
    private void checkParams(Type type){
        if (type == null){
            throw new IllegalArgumentException("Type shouldn't be null");
        }
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        if(type instanceof IntType)
        {
            return this.arrayType;
        }
        else if(type instanceof ErrorType)
            return this.arrayType;
        else
           return super.squareBrackets(type,node);

    }

    @Override
    public String toString() {
        return "[" + arraySize + "]" + arrayType.toString();
    }


    @Override
    public int numberOfBytes() {
        return arraySize * arrayType.numberOfBytes();
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
