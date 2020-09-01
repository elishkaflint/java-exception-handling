package ExceptionNesting;

import org.junit.Before;

import static org.junit.Assert.*;

public class TopLevelTest {

    private TopLevel topLevel;

    @Before
    public void setUp() {
        topLevel = new TopLevel(new MidLevel(new BottomLevel()));
    }

    @org.junit.Test
    public void callAndThrowException_programHalts() {
        topLevel.callAndThrowException();
    }

    @org.junit.Test
    public void callAndLogException_programContinues() {
        topLevel.callAndLogException();
    }

}