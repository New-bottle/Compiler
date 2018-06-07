package AST;

import Symbols.Symbol;
import CompilerOptions.CompilerOptions;

public class ClassType extends Type {
    public String name;
    public ClassType(String name) {
        this.name = name;
    }


    public Symbol.Types getType() {
        return Symbol.Types.STRUCT;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }

    public boolean equals(ClassType rhs) {
        return name == rhs.name;
    }

    @Override
    public String toString() {
        return "<ClassType:"+name+">";
    }

    @Override
    public int getRegisterSize() {
        return CompilerOptions.getSizePointer();
    }
}
