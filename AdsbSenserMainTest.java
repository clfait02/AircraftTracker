public class AdsbSenserMainTest
{
	/**
	 * AdsbSenserMainTest is the testing environment for the AdsbSenserMain
	 * where we have the main class of the senser part.
	 * @author: damait06
	 *
	 * Test AdsbSenser for the following:
	 * - 
	 * - 
	 * -
	 */

	AdsbSenserMain tester = new AdsbSenserMain;

	// Check if ASM creates the objects it should contain:

	assertNotNull("ASF not created",AdsbSentenceFactory);
	assertNotNull("AS not created",AdsbSentence);
	assertNotNull("ASD not created",AdsbSentenceDisplay);
}
