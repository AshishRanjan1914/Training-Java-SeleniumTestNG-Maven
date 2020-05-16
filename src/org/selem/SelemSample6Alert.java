package org.selem;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelemSample6Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("HI, I m Selecy element !");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface ... s		

		//maximize
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/delete_customer.php");

		Thread.sleep(5000);

		driver.findElement(By.name("cusid")).sendKeys("53256");
		//driver.findElement(By.name("submit")).click();

		Thread.sleep(4000);

		try {
		//handling alerts.
		Alert myFirstAlert = driver.switchTo().alert();
		Thread.sleep(2000);		

		//get text over alert
		System.out.println(myFirstAlert.getText());

		//dismiss
		myFirstAlert.dismiss();

		driver.findElement(By.name("submit")).click();
		Thread.sleep(9000);

		//handling alerts.
		Alert mySecondtAlert = driver.switchTo().alert();
		
		Thread.sleep(2000);

		//accept - -
		mySecondtAlert.accept();
		
		//type
		//mySecondtAlert.sendKeys("");
		
		driver.close();
		
		} catch(NoAlertPresentException alertExc) {
			System.out.println("Alert not present - Test Fail");
		}

	}
	
	

}
