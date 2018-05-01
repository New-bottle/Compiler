package AST;

import Symbols.SymbolTable;

abstract public class Node {
    public abstract Object accept(ASTVisitor visitor);
    public SymbolTable scope;
}
