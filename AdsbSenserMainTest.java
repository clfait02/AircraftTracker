import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdsbSentenceDisplayTest.class})

public class AdsbSenserMainTest
{
	/**
	 * AdsbSenserMainTest is the testing environment for the AdsbSenserMain
	 * where we have the main class of the senser part.
	 *
	 * @author damait06
	 *
	 * Test AdsbSenser for the ADS-B sentence we should get
	 */

	//check if we get the ADS-B-sentence we want
	@Test
	public void getSentenceShouldReturnADSBSentence
	{
		AdsbSenserMain tester = new AdsbSenserMain;
		assertNotNull("AS not gotten", tester.getSentence());
	}

	public static void main (String[] args)
	{
		Result result = JUnitCore.runClasses(AdsbSentenceDisplayTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
