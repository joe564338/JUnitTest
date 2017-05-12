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
public class AreaTest {
    double length;
    double width;
    double answer;
    public static int counter;
    @BeforeClass
    public static void initial(){
        counter = 0;
    }
    public AreaTest(int length, int width, int answer){
        this.length = length;
        this.width = width;
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
    @Parameterized.Parameters(name = "{index}: areaOfRectangle({0}*{1}) = {2}")
    public static Collection numbers(){
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {2, 1, 2},
                {3, 4, 12}
        });
    }
    private static final double DELTA = 1e-15;
    @Test
    public void areaOfRectangle() throws Exception {
        //System.out.println(length + " " + width + " " + answer);
        assertEquals(answer, Area.areaOfRectangle(length, width), DELTA);
    }
    @AfterClass
    public static void done(){
        System.out.println("Testing finished!");
    }

}