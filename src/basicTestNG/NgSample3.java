package basicTestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NgSample3 {

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

	
	@BeforeMethod
	public void BeforeMethodSample3() {
		System.out.println("BeforeMethodSample3");
	}
	
	@Test
	public void NgSample3M1() {
		System.out.println("NgSample3M1");
	}
	@Test
	public void NgSample3M2() {
		System.out.println("NgSample3M2");
	}
	@Test
	public void NgSample3M3() {
		System.out.println("NgSample3M3");	
	}
	
	@Test(dataProvider = "DataProvderTest1")
	public void NgSample3M4(String name, String state, Integer age) {
		System.out.println("NgSample3M4");
		System.out.println("name :: "+name +" state :: "+state + "age ::"+ age);
	}
	
	@Parameters({ "my-anotherparamname" })
	@Test
	public void NgSample3M5(String anotherParam) {
		System.out.println("NgSample3M5" + " anotherParam " +anotherParam);		

	}	

	
	@Parameters({ "my-name","my-age" })
	@Test
	public void NgSample3M6(String name, int age) {
		System.out.println("NgSample3M6");
		System.out.println("Name is :"+name + " And age :: "+ age);
	}
	
	
	@DataProvider(name = "DataProvderTest1")
	public Object[][] createData1() {
	 return new Object[][] {
		 //excel read and return in Object[][]
	   { "Persion1", "DELHI", new Integer(36) },
	   { "Person2", "UP", new Integer(37)},
	   { "Person3", "MP", new Integer(38)},
	   { "Person4", "JHK", new Integer(39)},
	   { "Person5", "MH", new Integer(35)},
	 };
	}


}
