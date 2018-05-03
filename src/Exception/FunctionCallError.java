package Exception;

public class FunctionCallError extends RuntimeException {
    public FunctionCallError(String s) {
        super(s);
    }
}
