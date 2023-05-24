package ast.expresions;

import semantic.Visitor;

public class RecordNavigation extends AbstractExpression{

    private String fieldName;
    private Expression expression;

    public RecordNavigation(int line, int column, String name, Expression expression) {
        super(line, column);
        this.expression= expression;
        this.fieldName=name;
    }

    public String getName()
    {
        return fieldName;
    }

    public Expression getExpression()
    {
        return expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }


}
