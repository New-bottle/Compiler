package IR;

public class VirtualRegister extends Register {
    private String hintName;

    public VirtualRegister(String hintName) {
        this.hintName = hintName;
    }

    public String getHintName() {
        return hintName;
    }

    @Override
    public String toString() {
        return "<VR: " + hintName + ">";
    }
}
