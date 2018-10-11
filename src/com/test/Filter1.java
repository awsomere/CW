package com.test;

import org.testng.Reporter;
import org.testng.annotations.*;

import java.io.IOException;

import org.openqa.selenium.*;
import com.test.WrapperClass;

public class Filter1 extends WrapperClass{

	  public WebDriver driver;
	  String browser=null;
	  
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
					    
		//Enter EmailID in Textbox
		assertTextXpath("//form/input");
		sendvaluebyxpath("//form/input", emailId);
		Reporter.log("Enter EmailID successfully | ");
		Thread.sleep(3000);
		
		//Enter Password in Textbox
		assertTextXpath("//input[2]");
		sendvaluebyxpath("//input[2]", password);
		Reporter.log("Enter Password successfully | ");
		Thread.sleep(3000);
	
		//Click on SignIN button
		try {
		assertTextXpath("//form/a");
		clickByXpath("//form/a");  
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

	  @Test(priority=36, enabled = true)
	  public void  RiskRatingReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);	
		  		
		  	    //Click on Full screen
		  		clickByXpath("//*[@id='fullscreen']/i");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Report Module
		  		assertTextXpath("//*[@id='sidebar-left']/ul/li[7]/a/span[2]");
		  		clickByXpath("//*[@id='sidebar-left']/ul/li[7]/a/span[2]");
		  		Reporter.log("Click on Report Module| ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  				  	            
		  	    //Select Risk Rating Report
		        clickBylinktext("Risk Rating Report");
		        Reporter.log("Select Risk Rating Report sub-Module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		/*// Click on Filter Button
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
*/			  
			  
		  }
}
