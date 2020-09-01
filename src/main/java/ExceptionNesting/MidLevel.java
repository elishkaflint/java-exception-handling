package ExceptionNesting;

public class MidLevel {

    private final BottomLevel bottomLevel;

    public MidLevel(BottomLevel bottomLevel) {
        this.bottomLevel = bottomLevel;
    }

    public void call() {
        try {
            bottomLevel.call();
        } catch (BottomLevelException e) {
            throw new MidLevelException("There was an issue at the mid level", e);
        }
    }
}
