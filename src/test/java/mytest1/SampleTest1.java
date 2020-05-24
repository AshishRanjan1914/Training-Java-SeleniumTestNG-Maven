package mytest1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClassTest;
import util.DriverUtil;

public class SampleTest1 extends BaseClassTest{
	
	WebDriverWait wait;
	
	DriverUtil dUtil = new DriverUtil(driver);
	
	@Test
	public void testVerifyHomePageTitleM1() {
		driver.get(configProp.getProperty("BaseURL"));
		assertEquals(dUtil.returnPageTitle(), configProp.getProperty("BasePageTitle"));
	}
	
	
	@Test
	public void testVerifyHomePageLogoM1() {
		boolean isDisaplaedLogo  = driver.findElement(By.id("divLogo")).isDisplayed();
		assertEquals(isDisaplaedLogo, true);
	}
	
	@Test(dataProvider = "invalidLoginScenarios")
	public void testVerifyInvalidLoginM1(String username, String password, String validationMsg) throws InterruptedException {
		driver.get(configProp.getProperty("BaseURL"));
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(objectProp.getProperty("LoginPanel"))));
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		String errorMsg = driver.findElement(By.id("spanMessage")).getText();
		
		assertEquals(errorMsg, validationMsg);
		
	}
	
	@DataProvider(name = "invalidLoginScenarios")
	public Object[][] passInvalidLoginScenarios() {
	 return new Object[][] {
	   { "", "", "Username cannot be empty"},
	   { "", "ValidPassord", "Username cannot be empty"},
	   { "Admin", "Invalid", "Invalid credentials"},
	   { "InvalidUsername", "ValidPassword", "Invalid credentials"},
	 };
	}

	@Test(priority = 2)
	public void testVerifyValidLoginM1() throws InterruptedException {
		driver.get(configProp.getProperty("BaseURL"));
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(objectProp.getProperty("LoginPanel"))));
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		String validationMsg = driver.findElement(By.xpath(objectProp.getProperty("WelcomeAdmin"))).getText();
		
		assertEquals(validationMsg, "Welcome Admin");
		
	}
	
	

}
