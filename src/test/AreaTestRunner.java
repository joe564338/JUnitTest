import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by Joe on 5/12/2017.
 */
public class AreaTestRunner {
    public static void main(String [] args){
        Result result = JUnitCore.runClasses(AreaTest.class);
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
