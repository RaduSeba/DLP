package ast.statements;

import ast.expresions.Expression;
import semantic.Visitor;

import java.util.List;

public class Forloop extends  AbstractStatement{


    private Expression condition;
    private List<Statement> body;

    private Statement statementassign;

    private Statement statementincrement;

    public Forloop(int line, int column,Statement s1,Expression condition, Statement s2, List<Statement> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
        this.statementassign=s1;
        this.statementincrement=s2;
    }

    public Expression getCondition() {
        return condition;
    }

    public List<Statement> getBody() {
        return body;
    }

    public Statement getStatementAssign(){
        return statementassign;
    }

    public Statement getStatementIncrement() {
        return statementincrement;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
       return v.visit(this,params);
    }
}
