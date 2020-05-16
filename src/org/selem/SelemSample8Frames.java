package org.selem;

import org.openqa.selenium.chrome.ChromeDriver;

public class SelemSample8Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("HI, I m multiple windows element !");

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\chromedriver.exe");

		//ChromeDriver driver = new ChromeDriver();
		//WebDriver is an interface ... s		

		//maximize
		//driver.manage().window().maximize();
		
		//driver.get("http://demo.guru99.com/test/guru99home/");
		
		//Thread.sleep(5000);
		
		String projectPath = "PathOfProject";
		String projectName = "projectName";
		String applicationUrlFileName = "ApplicationURLs";
		String executionProfile = "QA";
		
		String suiteFilePath = String.format("%s\\%s\\resources\\ExecutionProfile\\%s_%s.xlsx", projectPath, projectName, executionProfile, applicationUrlFileName);

		System.out.println(suiteFilePath);
	}

}
