import junit.framework.TestCase;
import main.StringHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joe on 5/11/2017.
 */
public class StringHelperTest extends TestCase{
    StringHelper s1;
    StringHelper s2;
    StringHelper s3;
    StringHelper s4;
    @Rule
    public void setUp() throws Exception{
        s1 = new StringHelper("racecar");
        s2 = new StringHelper("blue");
        s3 = new StringHelper("Hello");
        s4 = new StringHelper("Rat");
    }
    @After
    public void tearDown() throws Exception{}
    @Test
    public void testIsPalindrome(){
        assertEquals(true, s1.isPalindrome());
    }
    @Test
    public void testIsPalindrome2(){

        assertEquals(false, s2.isPalindrome());
    }
    @Test
    public void testIsSameLength(){
        assertEquals(true, s3.isSameLength("Model"));
    }
    @Test
    public void testIsSameLength2(){
        assertEquals(false, s4.isSameLength("Giant"));
    }
}