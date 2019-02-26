package com.learnAutomation.textCase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.learnAutomation.utilities.BrowserFactory;

public class LoginTestCRM {

	WebDriver driver;
	
	@Test
	
	public void loginApp() throws InterruptedException, IOException 
	{
	driver = BrowserFactory.stratApplication(driver, "Chrome","https://www.freecrm.com/index.html");
	driver.get("file:/C:/Users/ankit/Desktop/newFileUpload.html");
	Thread.sleep(3000);
	System.out.println("now will try to upload the file");
	driver.findElement(By.xpath("//*[@id='ankit']")).click();
	Thread.sleep(1000);
	Runtime.getRuntime().exec("C:\\Users\\ankit\\Desktop\\FileUploadAutoItScript.exe");
	System.out.println("upload is done");
	Thread.sleep(1000);
	System.out.println(driver.getTitle());
	
	
		
	}
	
	
	
}
