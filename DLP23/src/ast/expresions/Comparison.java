package ast.expresions;

import semantic.Visitor;

public class Comparison extends AbstractExpression{
    private Expression left, right;
    private String operator;

    public Comparison(int line, int column, Expression left, Expression right,String operator) {
        super(line,column);
        this.left=left;
        this.right=right;
        this.operator=operator;

    }

    public Expression getLeft()
    {
        return left;
    }

    public Expression getRight()
    {
        return right;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }


}
