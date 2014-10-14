import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import static org.junit.Assert.*;

public class TestAll
{
	public static void main (String[] args)
	{
		Result result = JUnitCore.runClasses(TestSuite.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
