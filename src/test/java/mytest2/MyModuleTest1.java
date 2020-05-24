package mytest2;

import org.testng.annotations.Test;

import base.BaseClassTest;

public class MyModuleTest1 extends BaseClassTest{
	
	@Test
	public void TestM1() {
		driver.navigate().to("https://www.google.com/");		
	}

}
