package ExceptionNesting;

public class MidLevelException extends RuntimeException {

    public MidLevelException(String message, Exception e) {
        super(message, e);
    }

}
