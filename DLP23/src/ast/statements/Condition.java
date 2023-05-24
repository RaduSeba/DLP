package ast.statements;

import ast.expresions.Expression;
import semantic.Visitor;

import java.util.List;
public class Condition extends AbstractStatement{

    private Expression condition;
    private List<Statement> ifBody;
    private List<Statement> elseBody;

    public Condition(int line, int column, Expression condition, List<Statement> ifBody, List<Statement> elseBody) {
        super(line,column);
        this.condition = condition;
        this.ifBody = ifBody;
        this.elseBody = elseBody;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getIfBody() {
        return ifBody;
    }

    public List<Statement> getElseBody() {
        return elseBody;
    }

    public void setElseBody(List<Statement> statements) {
        this.elseBody=statements;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
