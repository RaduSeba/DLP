package codegenerator;

import ast.definitions.FuncDefinition;

public class ExecuteCGVisitor extends AbstractCGVisitor<FuncDefinition, Void>{

    private AddressCGVisitor addressCGVisitor;
    private ValueCGVisitor valueCGVisitor;
    private CodeGenerator codeGenerator;

    public ExecuteCGVisitor(CodeGenerator codeGenerator){
        this.codeGenerator = codeGenerator;
        addressCGVisitor = new AddressCGVisitor(codeGenerator);
        valueCGVisitor = new ValueCGVisitor(codeGenerator);
        addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
    }
}
