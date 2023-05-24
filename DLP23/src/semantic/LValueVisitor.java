package semantic;

import ast.expresions.*;
import ast.expresions.Variable;
import ast.statements.*;
import ast.types.*;

public class LValueVisitor extends  AbstractVisitor<Void,Void>{


    @Override
    public Void visit(Assignment node, Void params) {
        node.getLeft().accept(this, params);
        node.getRight().accept(this, params);
        if(!node.getLeft().getLValue())
            new ErrorType(node.getLine(),node.getColumn(),"Error LValue Assignation");
        node.getRight().accept(this, params);

        return null;
    }

    @Override
    public Void visit(Input node,Void params)
    {
        boolean correctInput=true;

        for(Expression e:node.getExpressions()) {
            e.accept(this, params);
            if(!e.getLValue())
                correctInput=false;
        }
        if(!correctInput)
            new ErrorType(node.getLine(),node.getColumn(),"Error LValue Input");
        return null;
    }


    @Override
    public Void visit(Variable var, Void params)
    {
        var.setLValue(true);
        return null;
    }

    @Override
    public Void visit (Arithmetic arithmetic, Void param)
    {
        arithmetic.getLeft().accept(this, null);
        arithmetic.getRight().accept(this, null);
        arithmetic.setLValue(false);
        return null;
    }


    @Override
    public Void visit(ArrayIndexer node,Void params)
    {
        node.setLValue(true);
        node.getLeft().accept(this,params);
        node.getRight().accept(this,params);
        return null;
    }

    @Override
    public Void visit(Cast node,Void params)
    {
        node.setLValue(false);
        node.getType().accept(this,params);
        node.getExpression().accept(this,params);
        return null;
    }

    @Override
    public Void visit(CharLiteral node, Void params)
    {
        node.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Comparison node,Void params)
    {
        node.setLValue(false);
        node.getRight().accept(this,params);
        node.getLeft().accept(this,params);
        return null;
    }

    @Override
    public Void visit(DoubleLiteral node, Void params)
    {
        node.setLValue(false);
        return null;
    }

    @Override
    public Void visit(RecordNavigation node,Void params)
    {
        node.setLValue(true);
        node.getExpression().accept(this,params);
        return null;
    }

    @Override
    public Void visit(FunctionInvocExpression node, Void params)
    {
        node.setLValue(false);
        node.getName().accept(this,params);
        for(Expression e:node.getArguments())
            e.accept(this,params);
        return null;

    }

    @Override
    public Void visit(IntLiteral node, Void params)
    {
        node.setLValue(false);
        return null;
    }

    @Override
    public Void visit(Logic node, Void params)
    {
        node.setLValue(false);
        node.getLeft().accept(this,params);
        node.getRight().accept(this,params);
        return null;
    }

    @Override
    public Void visit(Not node,Void params)
    {
        node.setLValue(false);
        node.getExpression().accept(this,params);
        return null;
    }

    @Override
    public Void visit(UnaryMinus node, Void params)
    {
        node.setLValue(false);
        node.getExpression().accept(this,params);
        return null;
    }













}
