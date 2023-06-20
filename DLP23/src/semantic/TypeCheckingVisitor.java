package semantic;

import ast.definitions.FuncDefinition;
import ast.expresions.*;
import ast.statements.*;
import ast.types.*;

public class TypeCheckingVisitor extends AbstractVisitor<Type,Void>{

    @Override
    public Void visit(Variable node, Type params) {
       // super.visit(node,params);
        node.setLValue(true);
        node.setType(node.getDefinition().getType());
        return null;
    }

    @Override
    public Void visit(Arithmetic node, Type params) {
        node.setLValue(false);
        super.visit(node,params);
        node.setType(node.getLeft().getType().arithmetic(node.getRight().getType(),node));
        return null;
    }

    @Override
    public Void visit(Assignment node, Type params) {

         super.visit(node, params);
        if (!node.getLeft().getLValue()){
            new ErrorType(node.getLine(), node.getColumn(), "Error in assignment");
        }
         node.getLeft().setType(node.getRight().getType().promotesTo(node.getLeft().getType(),node));

         return null;
    }

    @Override
    public Void visit(ArrayIndexer node, Type params) {
        node.setLValue(true);
         super.visit(node, params);
         node.setType(node.getLeft().getType().squareBrackets(node.getRight().getType(),node));
         return null;
    }

    @Override
    public Void visit(Cast node, Type params) {
        node.setLValue(false);
        super.visit(node, params);
        node.setType(node.getExpression().getType().cast(node.getType(),node));
        return null;
    }


    @Override
    public Void visit(CharLiteral node, Type params) {
        node.setLValue(false);
         super.visit(node, params);

         node.setType(CharType.getInstance());
         return null;
    }

    @Override
    public Void visit(DoubleLiteral node, Type params) {
        node.setLValue(false);
         super.visit(node, params);
         node.setType(DoubleType.getInstance());
         return null;
    }

    @Override
    public Void visit(Comparison node, Type params) {
        node.setLValue(false);
         super.visit(node, params);
         if(node.getLeft().getType() instanceof StructType)
         {
             new ErrorType(node.getLine(), node.getColumn(), "Cannot compare a struct");
         }
         node.setType(IntType.getInstance());
         return null;
    }



    @Override
    public Void visit(IntLiteral node, Type params) {
        node.setLValue(false);
        super.visit(node, params);
        node.setType(IntType.getInstance());
        return null;
    }

    @Override
    public Void visit(RecordNavigation node, Type params) {
        node.setLValue(true);
        super.visit(node, params);
        node.setType(node.getExpression().getType().dot(node.getName(),node));
        return null;
    }

    @Override
    public Void visit(FunctionInvocExpression node, Type params) {
        node.setLValue(false);
        super.visit(node, params);
        node.setType(node.getName().getType().parenthesis(node.getArguments(),node));
        return null;
    }

    @Override
    public Void visit(Logic node, Type params) {
        node.setLValue(false);
        super.visit(node, params);
        node.setType(node.getLeft().getType().logical(node.getRight().getType(),node));
        return null;
    }

    @Override
    public Void visit(Not node, Type params) {
        node.setLValue(false);
        super.visit(node, params);
        node.setType(node.getExpression().getType().logical(node));
        return null;
    }

    @Override
    public Void visit(UnaryMinus node, Type params) {
        node.setLValue(false);
        super.visit(node, params);
        node.setType(node.getType().arithmetic(node.getType(),node));
        return null;
    }

    @Override
    public Void visit(Input node, Type params) {
        super.visit(node, params);
        node.getExpressions().forEach(expression -> {
            if (!expression.getLValue()){
                new ErrorType(expression.getLine(), expression.getColumn(), "Cannot input this");
            }
        });
        return null;
    }



    @Override
    public Void visit(Condition node, Type params) {
         super.visit(node, params);
        if(!node.getCondition().getType().isLogical()){
            new ErrorType(node.getCondition().getLine(), node.getCondition().getColumn(), "Expected a logical argument in condition statement");
        }
         return null;
    }

    @Override
    public Void visit(While node, Type params) {
        super.visit(node, params);
        if (!node.getCondition().getType().isLogical()){
            new ErrorType(node.getCondition().getLine(), node.getCondition().getColumn(), "Expected a logical argument in while statement");
        }
        return null;
    }

    @Override
    public Void visit(Forloop node, Type params) {

        super.visit(node, params);

        if (!node.getCondition().getType().isLogical()){
            new ErrorType(node.getCondition().getLine(), node.getCondition().getColumn(), "Expected a logical argument in forloop statement");
        }





        return null;
    }

    @Override
    public Void visit(Increment node, Type params) {

        super.visit(node, params);
        if (!node.getExpression().getLValue()){
            new ErrorType(node.getLine(), node.getColumn(), "Error in increment");
        }

        return null;

    }

    @Override
    public Void visit(Return node, Type params) {
         super.visit(node, params);
         node.getExpression().setType(node.getExpression().getType().promotesTo(params,node));
         return null;
    }

    @Override
    public Void visit(FuncDefinition node, Type params) {
        super.visit(node, ((FunctionType)node.getType()).getType());
        return null;
    }


}
