import main.Area;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Joe on 5/12/2017.
 */
public class AreaTest4 {
    private static final double DELTA = 1e-15;
    @Test
    public void areaOfRectangle() throws Exception {
        assertEquals(56, Area.areaOfRectangle(7, 8), DELTA);
    }

}