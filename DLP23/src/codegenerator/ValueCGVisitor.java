package codegenerator;

import ast.definitions.FuncDefinition;

public class ValueCGVisitor  extends AbstractCGVisitor<FuncDefinition,Void>{


    private CodeGenerator codeGenerator;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }
}
