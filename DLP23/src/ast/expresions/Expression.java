package ast.expresions;

import ast.ASTNode;

import ast.types.Type;

public interface Expression extends ASTNode {

    public boolean getLValue();
    public void setLValue(boolean value);

    public Type getType();
    public void setType(Type type);



}
