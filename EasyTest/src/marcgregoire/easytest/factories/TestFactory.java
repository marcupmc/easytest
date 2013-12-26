package marcgregoire.easytest.factories;

import marcgregoire.easytest.domain.TestUnit;

/**
 * 
 * @author Marc GREGOIRE
 * 26 déc. 2013
 * Description : Contains a factory that build a TestUnit Object
 */
public class TestFactory {

	/**
	 * Build a TestUnit Object from string arguments
	 * Also check all the arguments and TestUnit attributes validity
	 * @return a TestUnit Object
	 */
	public TestUnit buildTestUnit(){
		TestUnit testToBuild = new TestUnit();
		
		return testToBuild;
	}
}
