package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	
	
	public static  WebDriver driver;
	public static Properties pro;
	public BaseClass() {
		
		try {
		
		 pro=new Properties();
		FileInputStream input=new FileInputStream("C:\\Users\\Sai Prasanth\\eclipse-workspace\\PageObjectModel_TestNG\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		pro.load(input);
		
		
		}catch (FileNotFoundException e) {
			
		}catch (Exception e) {
			
		}
		
		/*
		 * String browserName=pro.getProperty("browername");
		 * 
		 * if(browserName.equalsIgnoreCase("chrome")) {
		 * 
		 * driver=new ChromeDriver();
		 * 
		 * 
		 * }else if(browserName.equalsIgnoreCase("edge")) {
		 * System.setProperty("webdriver.edge.driver", pro.getProperty("edgepath"));
		 * driver=new EdgeDriver();
		 * 
		 * 
		 * }
		 */
		
		
		//this.intialize();
		
	}
	
	
	
	public static void intialize() {
		

		String browserName=pro.getProperty("browername");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			driver=new ChromeDriver();

			
		}else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", pro.getProperty("edgepath"));
			driver=new EdgeDriver();
			
			
		}
		
		
		driver.get(pro.getProperty("applicationurl"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	

}
