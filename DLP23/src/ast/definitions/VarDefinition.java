package ast.definitions;

import ast.types.Type;
import semantic.Visitor;

public class VarDefinition extends AbstractDefinition {

    private int offset;
    private String name;
    private Type type;

    private int scope;



    public VarDefinition(int line, int column,String name, Type type) {
        super(line, column);
        this.name=name;
        this.type=type;
        this.offset=0;
        this.scope=0;
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


    public int getOffSet() {
        return offset;
    }


    public void setOffSet(int offset) {
        this.offset=offset;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
