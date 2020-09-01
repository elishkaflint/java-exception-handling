package ExceptionNesting;

public class TopLevel {

    private final MidLevel midLevel;

    public TopLevel(MidLevel midLevel) {
        this.midLevel = midLevel;
    }

    public void callAndThrowException() {
        try {
            midLevel.call();
        } catch (MidLevelException e) {
            throw new TopLevelException("There was an issue at the top level", e);
        }
    }

    public void callAndLogException() {
        try {
            midLevel.call();
        } catch (MidLevelException e) {
            e.printStackTrace();
        }
    }

}
