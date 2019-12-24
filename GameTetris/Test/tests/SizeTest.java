
package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import gametetris.GameTetris;

public class SizeTest {
    
    @Test
    public void testStart() throws Exception {
        GameTetris gt = new GameTetris();
        int expected = 210;
        int actual;
        actual = gt.panel.getWidth();
        assertEquals("a", expected, actual);
    }
    
    @Test
    public void testA() throws Exception {
        GameTetris gt = new GameTetris();
        int expected1 = 453;
        int actual1;
        actual1 = gt.panel.getHeight();
        assertEquals("a", expected1, actual1);
    }
}