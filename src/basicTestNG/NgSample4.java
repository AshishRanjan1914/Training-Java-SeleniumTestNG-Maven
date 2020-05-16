package basicTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NgSample4 {

	// other annotations..
	
	
	
	//BeforeSuite. - > BeforeTest - > BeforeClass - > BeforeMethod - >Test


	@BeforeClass()
	public void NgSample4BeforeClassM1() {
		System.out.println("NgSample4BeforeClassM1"); 
	}
	
	@BeforeSuite()
	public void NgSample4BeforeSuiteM1() {
		System.out.println("NgSample4BeforeSuiteM1"); 
	}
	
	//5 - each...
	@BeforeMethod()
	public void NgSample4BeforeMethodM1() {
		System.out.println("NgSample4BeforeMethodM1"); 
	}
	
	

	@BeforeMethod 
	public void NgSample4BeforeMethodM2() {
		System.out.println("NgSample4BeforeMethodM2"); 
	}

	@AfterMethod 
	public void NgSample4AfterMethodM1() {
		System.out.println("NgSample4AfterMethodM1"); 
	}
	@AfterMethod 
	public void NgSample4AfterMethodM2() {
		System.out.println("NgSample4AfterMethodM2"); 
	}


	//Execution order  = ?

	@Test(priority=1, enabled=false)
	public void NgSample4M3() {
		System.out.println("NgSample4M3");	
	}

	@Test(priority=1, invocationCount = 2)
	public void NgSample4M5() {
		System.out.println("NgSample4M5");

		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } // implicit wait..
		 * 
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * //valid for entire session - before throwing time out execption ..
		 * 
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * 
		 * 
		 * 
		 * //explict wait... dynamic wait..
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, 60); // 500 ms .. // timeout
		 * exception...
		 * wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))))
		 * ;
		 * 
		 * 
		 * driver.close();
		 */
	}


	

	//1
	@BeforeTest
	public void NgSample4BeforeTestM1() {
		System.out.println("NgSample4BeforeTestM1");		

	}

	@AfterTest
	public void NgSample4AfterTestM1() {
		System.out.println("NgSample4AfterTestM1");		

	}


}
