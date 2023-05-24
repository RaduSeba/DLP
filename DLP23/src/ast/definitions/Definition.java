package ast.definitions;

import ast.ASTNode;
import ast.types.Type;

public interface Definition extends ASTNode {

    public String getName();

    public Type getType();

    public void setType(Type type);

    public int getScope();
    public void setScope(int scope);






}
