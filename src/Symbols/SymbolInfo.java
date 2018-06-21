package Symbols;

import IR.IntValue;
import IR.Register;

public class SymbolInfo {
    public Symbol symbol;
    public int offset;
    public Register reg;
    public SymbolInfo(Symbol symbol, int offset) {
        this.symbol = symbol;
        this.offset = offset;
    }
    public void setReg (Register reg) {
        this.reg = reg;
    }
}
