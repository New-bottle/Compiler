package AST;

import java.util.ArrayList;
import java.util.List;

public abstract class ASTNode {
    Token token;            // node is derived from which token?
    List<ASTNode> children; // oprands
    public ASTNode(Token token) { this.token = token; }
    public ASTNode(int tokenType) { this.token = new Token(tokenType); }
    public void addChild(ASTNode t) {
        if ( children == null ) children = new ArrayList<ASTNode>();
        children.add(t);
    }
    public boolean isNil() { return token == null; }

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
            ASTNode t = (ASTNode) children.get(i);
            if (i > 0) buf.append(' ');
            buf.append(t.toStringTree());
        }
        if (!isNil()) buf.append(")");
        return buf.toString();
    }
}
