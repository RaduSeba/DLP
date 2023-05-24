package ast;

import semantic.Visitor;

public interface ASTNode {


    public int getLine();

    public int getColumn();

    public<TP,TR> TR accept(Visitor<TP,TR> v, TP params);



}
