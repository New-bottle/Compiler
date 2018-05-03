package AST;

import java.util.List;

public class AST extends Node {
    public List<Node> comps;
    public List<FuncDeclNode> funcs;
    public List<VariableDecl> vars;
    public List<ClassNode>    classes;

    public AST(List<Node> comps, List<FuncDeclNode> funcs, List<VariableDecl> vars, List<ClassNode> classes) {
        this.comps = comps;
        this.funcs = funcs;
        this.vars = vars;
        this.classes = classes;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
/*
    List<Node> children; // oprands
    public AST(Token token) { this.token = token; }
    public AST(int tokenType) { this.token = new Token(tokenType); }
    public void addChild(AST t) {
        if ( children == null ) children = new ArrayList<AST>();
        children.add(t);
    }
    public boolean isNil() { return token == null; }
    public void accept(ASTVisitor visitor) { visitor.visit(this); }

    public String toString() { return token!=null?token.toString():"nil"; }
    public String toStringTree() {
        if (children == null || children.size() == 0) return this.toString();
        StringBuilder buf = new StringBuilder();
        if (!isNil()) {
            buf.append("(");
            buf.append(this.toString());
            buf.append(")");
        }
        for (int i = 0; i < children.size(); i++) {
            AST t = (AST) children.get(i);
            if (i > 0) buf.append(' ');
            buf.append(t.toStringTree());
        }
        if (!isNil()) buf.append(")");
        return buf.toString();
    }
    */
