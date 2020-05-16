package org.selem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelemSample1 {
	
	public static void nameOfMethod() {
		System.out.println("IMAMethod");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("hi");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface ... s		
				
		//maximize
		driver.manage().window().maximize();
		
		//back
		driver.navigate().back();
		
		//fwd
		driver.navigate().forward();
		
		//refresh
		driver.navigate().refresh();
		
		//page load -timeout set.
		driver.manage().timeouts().pageLoadTimeout(8, TimeUnit.SECONDS);
		
		//manage implicit timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//go to url
		driver.navigate().to("https://www.google.com/");
		
		//page load -timeout set.
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String myPagetitle  = driver.getTitle();	
		
		System.out.println(myPagetitle);
		
		if(myPagetitle.equalsIgnoreCase("OrangeHRM")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		
		WebElement username = driver.findElement(By.name("txtUsername"));
		//type on an element
		username.sendKeys("Admin");
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		//click on an element
		loginButton.click();
		
		WebElement welcomeAdmin =  driver.findElement(By.id("welcome"));
		//get text of element
		String myWelcomeText = welcomeAdmin.getText();
		System.out.println(myWelcomeText);
		
		if(myWelcomeText.equalsIgnoreCase("Welcome Admin")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		//current page url
		String currentPageURL = driver.getCurrentUrl();
		System.out.println(currentPageURL);
		
		if(currentPageURL.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
