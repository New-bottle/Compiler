package Symbols;

import AST.ClassType;
import AST.FunctionType;

public class GlobalScope extends SymbolTable {
    public GlobalScope() {
        super(null);
        initTypeSystem();
    }

    public void initTypeSystem() {
        BuiltInTypeSymbol intType = new BuiltInTypeSymbol(Symbol.Types.INT);
        define("INT", intType);
        BuiltInTypeSymbol boolType = new BuiltInTypeSymbol(Symbol.Types.BOOL);
        define("BOOL", boolType);
        BuiltInTypeSymbol voidType = new BuiltInTypeSymbol(Symbol.Types.VOID);
        define("VOID", voidType);

        // String builtin function
        ClassTypeSymbol strSymbol = new ClassTypeSymbol("string");
        strSymbol.members = new LocalScope("string", this);
        // 1. int String.length()
        FunctionTypeSymbol length = new FunctionTypeSymbol(intType, "length");
        strSymbol.members.define("length", length);
        // 2. string String.substring(startpos, endpos)
        FunctionTypeSymbol substring = new FunctionTypeSymbol(strSymbol, "substring");
        substring.addArg(intType, "startpos");
        substring.addArg(intType, "endpos");
        strSymbol.members.define("substring", substring);
        // 3. int String.parseInt()
        FunctionTypeSymbol parseInt = new FunctionTypeSymbol(intType, "parseInt");
        strSymbol.members.define("parseInt", parseInt);
        // 4. int String.ord(int pos)
        FunctionTypeSymbol ord = new FunctionTypeSymbol(intType, "ord");
        ord.addArg(intType, "pos");
        strSymbol.members.define("ord", ord);
        define("STRING", strSymbol);
        define("string", strSymbol);


        // Builtin functions
        // 1. void print(string str)
        FunctionTypeSymbol print = new FunctionTypeSymbol(voidType, "print");
        print.addArg(strSymbol, "str");
        define("print", print);

        // 2. void println(string str)
        FunctionTypeSymbol println = new FunctionTypeSymbol(voidType, "println");
        println.addArg(strSymbol, "str");
        define("println", println);

        // 3. string getString()
        FunctionTypeSymbol getString = new FunctionTypeSymbol(strSymbol, "getString");
        define("getString", getString);

        // 4. int getInt()
        FunctionTypeSymbol getInt = new FunctionTypeSymbol(intType, "getInt");
        define("getInt", getInt);

        // 5. string toString(int i)
        FunctionTypeSymbol toString = new FunctionTypeSymbol(strSymbol, "toString");
        toString.addArg(intType, "i");
        define("toString", toString);
    }
}
