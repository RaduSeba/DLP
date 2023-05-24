package ast.types;

import semantic.Visitor;

public class VoidType extends AbstractType{

    private static VoidType instance;

    public VoidType(int line, int column) {
        super(line, column);
    }

    public static VoidType getInstance(int line,int column)
    {
        if(instance==null)
            instance= new VoidType(line, column);
        return instance;
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
