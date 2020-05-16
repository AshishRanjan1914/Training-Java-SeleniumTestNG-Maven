package basicTestNG;

import org.testng.annotations.Test;

public class NgSample2 {

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
	public void NgSample2M1() {
		System.out.println("NgSample2M1");
	}
	@Test
	public void NgSample2M2() {
		System.out.println("NgSample2M2");
	}
	@Test(groups= {"Sanity","Login"})
	public void NgSample2M3() {
		System.out.println("NgSample2M3");	
	}
	@Test
	public void NgSample2M4() {
		System.out.println("NgSample2M4");
	}
	
	@Test
	public void NgSample2M5() {
		System.out.println("NgSample2M5");	

	}

}
