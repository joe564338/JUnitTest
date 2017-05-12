import main.Area;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joe on 5/12/2017.
 */
public class AreaTest3 {
    private static final double DELTA = 1e-15;
    @Test
    public void areaOfCircle() throws Exception {
        assertEquals(Math.PI*5*5, Area.areaOfCircle(5), DELTA);
    }

}