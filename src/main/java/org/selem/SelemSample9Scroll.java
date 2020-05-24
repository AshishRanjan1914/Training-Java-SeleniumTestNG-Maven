package org.selem;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelemSample9Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// (JavascriptExecutor) driver - executeScript - js.executeScript(Script,Arguments);;
		//window.scrollBy(0,1000)
		//window.scrollBy(0,1000)
		//arguments[0].scrollIntoView();
		//window.scrollTo(0, document.body.scrollHeight)
		
		
		System.out.println("HI, I m multiple windows element !");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface ... s		

		//maximize
		driver.manage().window().maximize();
		
		Dimension dim = new Dimension(2000, 2000);
		driver.manage().window().setSize(dim);
		
		//mobile automation - resolution
		//
		
		driver.get("https://it.wikipedia.org/wiki/Sachin_Tendulkar");
		
		Thread.sleep(5000);
		
		System.out.println("URL of parent page : "+driver.getCurrentUrl());
		
		
		/*
		 * double value = 1.8; System.out.println(value);
		 * 
		 * int newValue = (int) value; System.out.println(newValue);
		 */
		//caste driver object into JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		//System.out.println("InnerHight: "+ js.executeScript("window.innerHeight").toString());
		
		//System.out.println("InnerWidth:"+ js.executeScript("window.innerWidth").toString());
		
		
		Thread.sleep(4000);
		
		WebElement myElement = driver.findElement(By.xpath("//span[@id='Biografia']"));
		
		js.executeScript("arguments[0].scrollIntoView();", myElement);
		//click
		//js.executeScript("arguments[0].click();", myElement);
		Thread.sleep(4000);
			
		
		driver.close();
		
		
		

	}

}
