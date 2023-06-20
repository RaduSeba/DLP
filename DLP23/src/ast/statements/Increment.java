package ast.statements;

import ast.expresions.Expression;
import semantic.Visitor;

public class Increment extends  AbstractStatement{

    private Expression expression;

    public Increment(int line, int column, Expression exp) {
        super(line, column);
        this.expression = exp;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
