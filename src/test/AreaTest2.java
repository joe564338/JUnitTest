import main.Area;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Joe on 5/12/2017.
 */
@RunWith(Parameterized.class)
public class AreaTest2 {
    double radius;
    double answer;
    static int counter;
    @BeforeClass
    public static void initial(){
        counter = 0;
    }
    public AreaTest2(double radius, double answer){
        this.radius = radius;
        this.answer = answer;
    }
    @Before
    public void setUp() throws Exception{
        System.out.println("Test case " + counter + " started");
    }
    @After
    public void tearDown() throws Exception{
        System.out.println("Test case " + counter + " finished");
        counter++;
    }

    @Parameterized.Parameters(name = "{index}: areaOfRectangle({0}*{0}*Math.PI) = {1}")
    public static Collection numbers(){
        return Arrays.asList(new Object[][]{
                {1, Math.PI},
                {2, Math.PI*2*2},
                {3, Math.PI*3*3},

        });
    }
    private static final double DELTA = 1e-15;
    @Test
    public void areaOfCircle() throws Exception {
        assertEquals(answer, Area.areaOfCircle(radius), DELTA);
    }
    @AfterClass
    public static void done(){
        System.out.println("Testing finished!");
    }
}