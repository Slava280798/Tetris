package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import gametetris.GameTetris;

public class WidthTest {
    
    @Test
    public void testStart() throws Exception {
        GameTetris gt = new GameTetris();
        int expected = 10;
        int actual;
        actual = gt.FIELD_WIDTH;
        assertEquals("a", expected, actual);
    }
    
}