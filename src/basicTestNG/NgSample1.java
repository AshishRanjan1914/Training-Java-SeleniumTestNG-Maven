package basicTestNG;

import org.testng.annotations.Test;


public class NgSample1 {

	//junit. - unit testing.
	//annotations ?
	//TestNG ? - test next generation.
	//Benifits of TestNG ? - main , assertion , parallel execution, framework testing
	//Usages of TestNG ? - test framework.


	//framework -
	//TestNg runner configiguration file use .. - execution control.
	//config - xml config file..
	//suite / test/classes / methods// --- include/exculde..
	//We had not created it.. ? - TestNG .. created itself.. - default. .. yes.. 
	//temp.. 

	@Test
	public void NgSample1M1() {
		System.out.println("NgSample1M1");		

	}
	@Test
	public void NgSample1M2() {
		System.out.println("NgSample1M2");
		

	}
	@Test(groups= {"Sanity", "Regression", "Login"})
	public void NgSample1M3() {
		System.out.println("NgSample1M3");		

	}
	@Test(groups= {"Regression"})
	public void NgSample1M4() {
		System.out.println("NgSample1M4");		

	}
	
	@Test(groups= {"Login"})
	public void NgSample1M5() {
		System.out.println("NgSample1M5");		

	}

}
