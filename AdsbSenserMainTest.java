import static org.junit.Assert.*;

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
	public void getSentenceShouldReturnADSBSentence()
	{
		AdsbSenserMain tester = new AdsbSenserMain();
		assertNotNull("AS not gotten", tester.getSentence());
		assertNull("AS gotten", tester.getSentence());

		System.out.println("It worked");
	}

}
