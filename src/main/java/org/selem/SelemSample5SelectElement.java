package org.selem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelemSample5SelectElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("HI, I m Selecy element !");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface ... s		

		//maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(5000);
		
		WebElement selectElement = driver.findElement(By.id("searchLanguage"));
		
		Select myCountrySelectObject = new Select(selectElement);
		
		WebElement myFirstSelectedOptions = myCountrySelectObject.getFirstSelectedOption();
		//will print text of selected option
		System.out.println(myFirstSelectedOptions.getText());
		
		//returns all options of a select element
		List<WebElement> listOfSelectOptions = myCountrySelectObject.getOptions();
		
		System.out.println("Total no of options :"+ listOfSelectOptions.size());
		
		for (WebElement eachWebElement : listOfSelectOptions) {
			System.out.println(eachWebElement.getAttribute("value")+" :: "+eachWebElement.getText());			
		}		
		
		//select a desired options
		myCountrySelectObject.selectByIndex(6);
		Thread.sleep(2000);
		System.out.println(myCountrySelectObject.getFirstSelectedOption().getText());
		
		myCountrySelectObject.selectByValue("da");
		Thread.sleep(2000);
		System.out.println(myCountrySelectObject.getFirstSelectedOption().getText());
		
		myCountrySelectObject.selectByVisibleText("Nederlands");
		Thread.sleep(2000);	
		System.out.println(myCountrySelectObject.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
