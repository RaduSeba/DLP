package ast.definitions;
import ast.types.Type;
import semantic.Visitor;

public class FieldDefinition extends AbstractDefinition {

    private String name;
    private Type type;

    private int offset;

    public FieldDefinition(int line, int column,String name , Type type) {
        super(line, column);
        this.name = name;
        this.type=type;
        this.offset=0;
    }


    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type=type;
    }

    @Override
    public int getScope() {
        return 0;
    }

    @Override
    public void setScope(int scope) {

    }

    public int getOffSet() {
        return offset;
    }

    public void setOffSet(int offSet) {
        this.offset=offSet;
    }


    public int numberOfBytes() {
        return type.numberOfBytes();
    }


    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
