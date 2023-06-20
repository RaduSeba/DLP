package ast.definitions;

import ast.expresions.Expression;
import ast.statements.Statement;
import ast.types.Type;
import semantic.Visitor;

public class AssignDefinition extends AbstractDefinition implements Statement, Definition {

    private Definition definition;

    private Expression expression;

    private int offset;
    private String name;
    private Type type;

    private int scope;
    public AssignDefinition(int line, int column, Expression e,String name, Type type) {
        super(line, column);

        this.expression=e;
        this.name=name;
        this.type=type;
        this.scope=0;
        this.offset=0;
    }



    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {

        this.type=type;
    }

    @Override
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {

        this.scope=scope;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return null;
    }
}
