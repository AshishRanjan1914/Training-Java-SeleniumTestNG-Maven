package org.selem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SelemSample3PropFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\config.properties");

		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("MyKey"));
		System.out.println(prop.getProperty("BaseURL"));
		System.out.println(prop.getProperty("x"));
		
		//excel read... Apache - POI 
	}
}
