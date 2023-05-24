package ast.definitions;

import ast.AbstractASTNode;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    public AbstractDefinition(int line, int column) {
        super(line, column);
    }


}