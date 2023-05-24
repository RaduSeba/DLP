package codegenerator;

import ast.definitions.Definition;
import ast.definitions.FieldDefinition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.types.FunctionType;
import ast.types.StructType;
import semantic.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Boolean,Void> {

    private int beforeGlobal = 0;
     private int beforeParam = 0;
    private int beforeLocal = 0;

    public Void visit(VarDefinition node , Boolean params)
    {
       super.visit(node,params);
        if(node.getScope()==0){
            node.setOffSet(beforeGlobal);
            beforeGlobal+=node.getType().numberOfBytes();

        }
        else if(!params)
        {
            beforeLocal-=node.getType().numberOfBytes();
            node.setOffSet(beforeLocal);
        }else {
            node.setOffSet(beforeParam+4);
        }
        return null;
    }

    @Override
    public Void visit(FunctionType node, Boolean params) {
       beforeParam=0;
       for(int i = node.getParameters().size()-1;i>=0;i--){
           node.getParameters().get(i).accept(this,true);
           beforeParam+=node.getParameters().get(i).getType().numberOfBytes();
       }
       return null;
    }

    @Override
    public Void visit(FieldDefinition node, Boolean params) {
        node.setOffSet(node.numberOfBytes());
        return null;
    }

    @Override
    public Void visit(FuncDefinition node, Boolean params) {
        beforeLocal=0;
        for(Definition varDefinition:node.getVarDefinitions()){
                varDefinition.accept(this,false);

        }
        node.getType().accept(this,params);
        node.setLocalVariablesBytes(-1* beforeLocal);
        return null;
    }

    @Override
    public Void visit(StructType node, Boolean params) {
        int fieldOffset=0;
        for(FieldDefinition field:node.getFields())
        {
            field.accept(this,false);
            field.setOffSet(fieldOffset);
            fieldOffset += field.getType().numberOfBytes();
        }
        return null;
    }
}
