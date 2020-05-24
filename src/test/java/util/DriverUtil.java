package util;

import java.util.Properties;import org.apache.commons.collections4.map.PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy;
import org.openqa.selenium.WebDriver;

import general.ConstatntsValues;

public class DriverUtil {
	
	private WebDriver driverUntilDriver ;
	private Properties objectProp;
	private Properties configProp;
	
	
	public DriverUtil(WebDriver driver) {
		this.driverUntilDriver = driver;		
	}
	
	public DriverUtil(WebDriver driver,Properties objectProp, Properties configProp) {
		this.driverUntilDriver = driver;	
		this.configProp = configProp;
		this.objectProp = objectProp;
	}
	
	public String returnPageTitle() {
		return driverUntilDriver.getTitle();
	}
	
	public String returnPageCurrentUrl() {
		return driverUntilDriver.getCurrentUrl();
	}
	
	
	//consider anything..
	public static boolean isTrue(boolean b) {
		
		System.out.println(ConstatntsValues.myVaribale);
		if(b = true) {
			return true;
		} else {
			return false;
		}
	}
	
	public void m1() {
		objectProp.getProperty("MYKEY");
	}

}
