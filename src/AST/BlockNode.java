package AST;

import java.util.List;

public class BlockNode extends StmtNode {
    public List<StmtNode> stmts;
    public BlockNode(List<StmtNode> stmts) {
        this.stmts = stmts;
    }

    public Object accept(ASTVisitor visitor) {
        visitor.visit(this);
        return null;
    }
}
