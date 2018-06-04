package IR;

public abstract class IRInstruction extends IRBaseClass {
    public IRInstruction prev = null;
    public IRInstruction next = null;
    boolean removed = false;

    public IRInstruction(IRInstruction prev, IRInstruction next) {
        this.prev = prev;
        this.next = next;
    }

    public IRInstruction() {}

    public void linkNext(IRInstruction node) {
        next = node;
        node.prev = this;
    }

    public void linkPrev(IRInstruction node) {
        prev = node;
        node.next = this;
    }

    public void prepend(IRInstruction node) {
        if (prev != null) prev.linkNext(node);
        node.linkNext(this);
    }

    public void append(IRInstruction node) {
        if (next != null) next.linkPrev(node);
        node.linkPrev(this);
    }
}
