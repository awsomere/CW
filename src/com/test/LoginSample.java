package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import com.test.WrapperClass;

public class LoginSample extends WrapperClass {

	public String baseUrl = "https://software-master.clearwatercompliance.com/dashboard#/dashboard" ;
	
	@BeforeSuite(alwaysRun = true)
	public void loginsam() throws IOException, InterruptedException {

 	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	
 	driver = new ChromeDriver();
 	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(baseUrl);
      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
 	
}
	
	@AfterSuite
	public void cleanupSuite() throws InterruptedException, IOException {
		System.out.println("After suite---->Works fine");
		
			   
			   Thread.sleep(3000);
			  						 
			 //Click on Account drop-down
			   assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span");
			   clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span");
			   Reporter.log("Click on Account drop-down  | ");
			   Thread.sleep(5000);
				 
			   //click on Logout button
			   try {
			   assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
			   clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
			   Reporter.log("Click on Logout button  | ");
			   }catch(Exception e)
				{
					   e.printStackTrace();
					  Reporter.log("SignIN doesn't work | ");
					}
			   Thread.sleep(5000);
			   quitBrowser();
			   Reporter.log("Browser Quit | ");
			   Thread.sleep(5000);
		 }

}
