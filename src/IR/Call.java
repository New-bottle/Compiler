package IR;

import java.util.ArrayList;
import java.util.List;

public class Call extends IRInstruction {
    private Register dest;
    private Function func;
    private List<IntValue> args = new ArrayList<>();

    public Call(VirtualRegister dest, Function func) {
        this.dest = dest;
        this.func = func;
    }

    public Call appendArg(IntValue arg) {
        args.add(arg);
        /*
        if (arg instanceof Register)
            usedRegister.add((Register)arg);
         */
        return this;
    }
    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return dest.toString() + " = [Call :" + func.toString() + "]" + "(" + args.toString() + ")";
    }
}
