package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import com.test.WrapperClass;

public class Login extends WrapperClass {

	            @BeforeSuite(alwaysRun = true)
				public void login() throws IOException, InterruptedException {
				String[][] data = getlogin();
				String emailId= data[0][0];
				String password= data[0][1];
				browser = data [0][2];
				String Url = data [0][3];
				
				//LaunchBrowser 		
				launchBroswer(browser,Url);
				Reporter.log("Broser Launched successfully | ");
				Thread.sleep(5000);
				Thread.sleep(5000);
							    
				//Enter EmailID in Textbox
				assertTextXpath("//*[@id='lEmail']");
				sendvaluebyxpath("//*[@id='lEmail']", emailId);
				Reporter.log("Enter EmailID successfully | ");
				Thread.sleep(3000);
				
				//Enter Password in Textbox
				assertTextXpath("//*[@id='lPass']");
				sendvaluebyxpath("//*[@id='lPass']", password);
				Reporter.log("Enter Password successfully | ");
				Thread.sleep(8000);
				Thread.sleep(8000);
				Thread.sleep(8000);
				
			
				//Click on SignIN button
				try {
				assertTextXpath("//*[@id='signIn']");
				clickByXpath("//*[@id='signIn']");  
				Reporter.log("Click on SignIN button successfully | ");
				}catch(Exception e)
				{
					   e.printStackTrace();
					  Reporter.log("SignIN doesn't work | ");
					}
				Thread.sleep(3000);
				Thread.sleep(3000);
				//Thread.sleep(5000);
				//Thread.sleep(5000);
			
	
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



