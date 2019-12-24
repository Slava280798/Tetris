package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import gametetris.GameTetris;
import java.awt.Color;

public class ColorTest {
    
    @Test
    public void testStart() throws Exception {
        GameTetris gt = new GameTetris();
        Color expected = new Color(255,255,182);
        Color actual;
        actual = gt.panel.getBackground();
        assertEquals("a", expected, actual);
    }
    
}