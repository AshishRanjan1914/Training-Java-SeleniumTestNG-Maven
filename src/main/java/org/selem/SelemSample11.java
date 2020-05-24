package org.selem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SelemSample11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Actions
		
		// build - perform
		
		System.out.println("HI, I m multiple windows element !");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface ... s		

		//maximize
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		Thread.sleep(5000);
		
		System.out.println("URL of parent page : "+driver.getCurrentUrl());
		
		Actions action = new Actions(driver);
		//action.
		action.click().perform();
		
		action.click().doubleClick().build().perform();
		
		Actions myBuildedActions = action.click().doubleClick();
		
		myBuildedActions.build().perform();
		
		myBuildedActions.contextClick();
		
		//git - github
		
		//Build Management - maven central.
		//CI / CD - famous - jenkins 
		
		//click - JS/ action / 
		WebElement ele = driver.findElement(By.xpath(""));
		ele.click();
		ele.sendKeys("");
		ele.getAttribute("");
		
		driver.findElement(By.xpath("")).click();
		
		
		//build - more than one action - build().perform(); 
		//perform - man-
		

	}

}
