package ast.expresions;

import semantic.Visitor;

public class Logic extends AbstractExpression{

    private Expression left, right;


    public Logic(int line, int column, Expression left, Expression right, String operator) {
        super(line,column);
        this.left=left;
        this.right=right;

    }

    public Expression getLeft()
    {
        return left;
    }

    public Expression getRight()
    {
        return right;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }


}
