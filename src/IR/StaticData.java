package IR;

public abstract class StaticData extends Register {
    private String hintName;
    public StaticData(String hintName) {
        this.hintName = hintName;
    }
    public abstract int getRegisterSize();
}
