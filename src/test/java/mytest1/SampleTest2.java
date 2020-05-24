package mytest1;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.BaseClassTest;
import util.MathUtill;

public class SampleTest2 extends BaseClassTest{
	
	@Test
	public void testVerifyHomePageTitleM1() {
		driver.get(configProp.getProperty("BaseURL"));
		assertEquals(driver.getTitle(), configProp.getProperty("BasePageTitle"));
	}
	
	
	@Test
	public void testVerifyAdditionM1() {
		int result = MathUtill.add(10, 20);
		assertEquals(result , 30);
	}

}
