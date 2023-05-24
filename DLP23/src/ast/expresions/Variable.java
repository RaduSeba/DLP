package ast.expresions;

import ast.definitions.Definition;
import semantic.Visitor;

public class Variable extends AbstractExpression{

    private String name;
    private Definition definition;

    public Variable(int line, int column, String name) {

        super(line, column);

        this.name=name;
    }

    public String getName()
    {
        return this.name;
    }

    public Definition getDefinition()
    {
        return this.definition;
    }

    public void setDefinition(Definition definition)
    {
        this.definition= definition;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }


}
