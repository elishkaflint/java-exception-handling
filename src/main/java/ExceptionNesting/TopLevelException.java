package ExceptionNesting;

public class TopLevelException extends RuntimeException {

    public TopLevelException(String message, Exception e) {
        super(message, e);
    }

}
