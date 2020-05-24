package org.selem;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelemSample7Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//multiple windows - handle
		
		System.out.println("HI, I m multiple windows element !");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface ... s		

		//maximize
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		Thread.sleep(5000);
		
		System.out.println("URL of parent page : "+driver.getCurrentUrl());
		
		//window handle
		
		String handleOfParentWindow = driver.getWindowHandle();
		
		System.out.println("handleOfParentWindow :: "+handleOfParentWindow);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Thread.sleep(2000);
		//two window... 
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		System.out.println("Size of windowHandles :: "+ allWindowHandles.size());		
		
		for (String windowHandle : allWindowHandles) {
			System.out.println(" Each handle >> "+ windowHandle);
			if (!(windowHandle.equals(handleOfParentWindow))) {
				driver.switchTo().window(windowHandle);				
			}			
		}
		
		System.out.println("URL title post click :: "+driver.getCurrentUrl());
				
		//single close
		driver.close();
		
		driver.switchTo().window(handleOfParentWindow);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Thread.sleep(2000);
		
		//all instance close
		driver.quit();
		
		
		//visible
		driver.findElement(By.xpath("")).isDisplayed();
		
		
		//enabled or not
		driver.findElement(By.xpath("")).isEnabled();
		
		driver.findElement(By.xpath("")).getCssValue("");
		
		// colour of element - sele
		
		//input / button / click / checkbox / radio button / select / alerts / multiple windows / click / frames / file upload..
		
		//mouse hover/ - keybord / right click / scroll / 
		
		
		//Testing frameworks - Junit / TestNG

	}

}
