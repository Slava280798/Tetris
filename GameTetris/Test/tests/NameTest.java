
package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import gametetris.GameTetris;

public class NameTest {
    
    @Test
    public void testStart() throws Exception {
        GameTetris gt = new GameTetris();
        String expected = "Tetris";
        String actual;
        actual = gt.TITLE_OF_PROGRAM;
        assertEquals("a", expected, actual);
    }
    
}