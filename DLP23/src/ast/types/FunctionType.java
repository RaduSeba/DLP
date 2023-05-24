package ast.types;

import ast.ASTNode;
import ast.definitions.Definition;
import ast.expresions.Expression;
import semantic.Visitor;

import java.util.List;
public class FunctionType extends AbstractType{

    private Type returnType;
    private List<Definition> parameters;
    public FunctionType(int line, int column, Type returnT , List<Definition> parameters) {

        super(line, column);
        this.returnType=returnT;
        this.parameters=parameters;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<Definition> getParameters(){
        return  parameters;
    }

    @Override
    public Type parenthesis(List<Expression> types, ASTNode node) {
        if(types.size()==parameters.size()){
            for(int i=0;i<types.size();i++)
            {
                if(parameters.get(i).getType().promotesTo(types.get(i).getType(),node) instanceof
                        ErrorType )
                    return null;
            }
            return returnType;
        }
        return super.parenthesis(types,node);
    }


    public int parameters(){
        int total = 0;
        for (Definition parameter : parameters){
            total += parameter.getType().numberOfBytes();
        }

        return total;
    }
    @Override
    public int numberOfBytes() {
        int total = 0;
        for (Definition parameter : parameters){
            total += parameter.getType().numberOfBytes();
        }
        total += returnType.numberOfBytes();
        return  total;
    }

    public Type getType() {
        return returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> v, TP params) {
        return v.visit(this,params);
    }
}
