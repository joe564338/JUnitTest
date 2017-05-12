import main.StringHelper;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Joe on 5/11/2017.
 */
public class StringHelperTest {
    @Test
    public void isPalindrome(){
        StringHelper s1 = new StringHelper("racecar");
        assertEquals(true, s1.isPalindrome());
    }
    @Test
    public void isPalindrome2(){
        StringHelper s1 = new StringHelper("blue");
        assertEquals(false, s1.isPalindrome());
    }
    @Test
    public void isSameLength(){
        StringHelper s1 = new StringHelper("Hello");
        assertEquals(true, s1.isSameLength("Model"));
    }
    @Test
    public void isSameLength2(){
        StringHelper s1 = new StringHelper("Rat");
        assertEquals(false, s1.isSameLength("Giant"));
    }
}