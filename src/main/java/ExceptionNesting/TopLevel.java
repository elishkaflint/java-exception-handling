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
            System.out.println("1. passing exception to println:\n");
            System.out.println(e);
            System.out.println("\n2. calling printStackTrace on the exception:\n");
            e.printStackTrace();
        }
    }

}
