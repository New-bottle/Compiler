package IR;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IRRoot extends IRInstruction {
    public Map<String, Function> functions = new LinkedHashMap<>();
    public Map<String, StaticString> stringPool = new LinkedHashMap<>();
    public List<StaticData> dataList = new ArrayList<>();

    public IRRoot() {
        stringPool.put("\\n", new StaticString("\\n"));
    }

    public Function builtinPrintString;
    public Function builtinPrintlnString;
    public Function builtinPrintInt;
    public Function builtinPrintlnInt;
    public Function builtinToString;
    public Function builtinGetString;
    public Function builtinGetInt;
    public Function builtinStringConcat;
    public Function builtinStringEqual;
    public Function builtinStringLess;
    public Function builtinStringParseInt;
    public Function builtinStringSubString;
    public List<Function> builtinFunctions = new ArrayList<>();

    @Override
    public void accept(IRVisitor visitor) {
        visitor.visit(this);
    }
}
