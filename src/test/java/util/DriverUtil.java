package util;

import org.openqa.selenium.WebDriver;

public class DriverUtil {
	
	private static WebDriver driverUntilDriver ;
	
	public DriverUtil(WebDriver driver) {
		this.driverUntilDriver = driver;		
	}
	
	public String returnPageTitle() {
		return driverUntilDriver.getTitle();
	}
	
	public String returnPageCurrentUrl() {
		return driverUntilDriver.getCurrentUrl();
	}
	
	
	//consider anything..
	public static boolean isTrue(boolean b) {
		if(b = true) {
			return true;
		} else {
			return false;
		}
	}

}
