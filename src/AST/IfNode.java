package AST;

import Symbols.Scope;

public class IfNode extends StmtNode {
    public ExprNode cond;
    public StmtNode then;
    public StmtNode otherwise;
    public Scope otherwiseScope;
    public IfNode(ExprNode cond, StmtNode then, StmtNode otherwise) {
        this.cond = cond;
        this.then = then;
        this.otherwise = otherwise;
        this.otherwiseScope = null;
    }

    @Override
    public Object accept(ASTVisitor visitor) { visitor.visit(this);
        return null;
    }
}
