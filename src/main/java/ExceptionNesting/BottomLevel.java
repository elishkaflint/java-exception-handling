package ExceptionNesting;

public class BottomLevel {

    public void call() {
        throw new BottomLevelException("There was an error in the bottom level");
    }
}
