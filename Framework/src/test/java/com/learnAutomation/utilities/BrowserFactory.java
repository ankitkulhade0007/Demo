package com.learnAutomation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	
	
	public static WebDriver stratApplication(WebDriver driver, String browserName, String appUrl) {
		
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();

		}else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","");
			 driver = new ChromeDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
		
		
	}
	
	
	public static void closeBrowser(WebDriver driver) 
	{
		driver.quit();
		
	} 
}
