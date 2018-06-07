package IR;

import CompilerOptions.CompilerOptions;

public class StaticString extends StaticData {
    public String value;

    public StaticString(String value) {
        super("str");
        this.value = value;
    }
    @Override
    public int getRegisterSize() {
        return CompilerOptions.getSizePointer();
    }
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
