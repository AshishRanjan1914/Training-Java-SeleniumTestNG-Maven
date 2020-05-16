package org.selem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelemSample2 {	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");
		
		ChromeDriver driverValue = new ChromeDriver();		
		driverValue.manage().window().maximize();
		driverValue.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driverValue.get("https://opensource-demo.orangehrmlive.com/");
		
		String titileOfThePage = driverValue.getTitle();
		System.out.println(titileOfThePage);
		
		if (titileOfThePage.equals("OrangeHRM")) {
			System.out.println(" -TITLE PASS");			
		} else {
			System.out.println("- TITLE FAIL");
		}
		
		//Locating mechanism - selenium.. - special class.. 8 
		
		//xpath, css - custom .
		//id, classname,tagname,name,linktext, partiallinktest,
		
//		driverValue.findElement(By.name("Username"));
//		driverValue.findElement(By.id("Username"));
//		driverValue.findElement(By.className("login css"));
//		driverValue.findElement(By.tagName("table"));
//		driverValue.findElement(By.tagName("table"));
//		driverValue.findElement(By.linkText("Forgot PWD"));
//		driverValue.findElement(By.partialLinkText("PWD"));
		
		
		WebElement usernameField = driverValue.findElement(By.id("txtUsername"));
		usernameField.sendKeys("Admin");
		
		WebElement passwordField = driverValue.findElement(By.id("txtPassword"));
		passwordField.sendKeys("admin123");
		
		WebElement LoginField = driverValue.findElement(By.id("btnLogin"));
		LoginField.click();
		
		
		WebElement DashboardField = driverValue.findElement(By.tagName("h1"));
		
		String dashboardText = DashboardField.getText();
		if (dashboardText.equals("Dashboard")) {
			System.out.println("Login - PASS");			
		} else {
			System.out.println("LOGIN -FAIL");
		}
		
		Thread.sleep(1000);
		driverValue.close();
		

	}

}
