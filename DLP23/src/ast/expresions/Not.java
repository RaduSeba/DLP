package ast.expresions;

import semantic.Visitor;

public class Not extends  AbstractExpression{

    private Expression expression;

    public Not(int line, int column, Expression expression) {
        super(line,column);
        this.expression = expression;
    }


    public Expression getExpression()
    {
        return  expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }


}
