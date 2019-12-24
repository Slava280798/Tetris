package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import gametetris.GameTetris;

public class DelayTest {
    
    @Test
    public void testStart() throws Exception {
        GameTetris gt = new GameTetris();
        int expected = 400;
        int actual;
        actual = gt.SHOW_DELAY;
        assertEquals("a", expected, actual);
    }
    
}