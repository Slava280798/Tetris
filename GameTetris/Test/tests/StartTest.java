
package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import gametetris.GameTetris;

public class StartTest {
    
    @Test
    public void testStart() throws Exception {
        GameTetris gt = new GameTetris();
        int expected = 180;
        int actual;
        actual = gt.START_LOCATION;
        assertEquals("a", expected, actual);
    }
    
}