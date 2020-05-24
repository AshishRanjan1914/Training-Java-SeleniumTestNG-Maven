package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassTest {
	
	public WebDriver driver;
	public Properties objectProp;
	public Properties configProp;
	
	//CI - Jenkins... 
	
	@BeforeTest
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		
	}
	
	@BeforeSuite
	public void loadObjectProperties() {
		FileInputStream fis = null;
		File objectPropFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\prop\\object.properties");
		try {
			fis = new FileInputStream(objectPropFile);
			objectProp = new Properties();
			objectProp.load(fis);
		} catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			System.out.println(fe.getMessage());
			fe.printStackTrace();
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			System.out.println(ie.getMessage());
			ie.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@BeforeSuite
	public void loadConfigProperties() {
		FileInputStream fis = null;
		File configPropFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\prop\\config.properties");
		try {
			fis = new FileInputStream(configPropFile);
			configProp = new Properties();
			configProp.load(fis);
		} catch (FileNotFoundException fe) {
			// TODO Auto-generated catch block
			System.out.println(fe.getMessage());
			fe.printStackTrace();
		} catch (IOException ie) {
			// TODO Auto-generated catch block
			System.out.println(ie.getMessage());
			ie.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@AfterTest(alwaysRun = true)
	public void closeBrowser() {				
		if(driver!=null) {
			driver.quit();
		}	
		
	}
	
	
	

}
