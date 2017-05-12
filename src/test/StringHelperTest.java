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
}