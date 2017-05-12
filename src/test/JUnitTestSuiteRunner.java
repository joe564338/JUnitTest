/**
 * Created by Joe on 5/12/2017.
 */
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitTestSuiteRunner {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(JUnitTestSuite.class);
        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests finished successfully...");
        }
    }
}
