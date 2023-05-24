package ast.expresions;

import ast.AbstractASTNode;

import ast.types.Type;
public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    private boolean lValue;
    private Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return this.lValue;
    }

    @Override
    public void setLValue(boolean value) {
        this.lValue=value;
    }

    @Override
    public Type getType() {
        return this.type;
    }

    @Override
    public void setType(Type type) {
        this.type=type;
    }

}
