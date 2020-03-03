package com.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RepeatedBugs_Reports extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;	     

	
	 @Test(priority=335, enabled = true)
	  public void IRMA5038_VersionHistory_Reports() throws IOException, InterruptedException {
		  
		  Thread.sleep(8000);

		  
		   //Click on Full screen
	      clickByXpath("//*[@id='fullscreen']/i");
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	 			  	   	  		
	 		 //Select Reports sidebar-left Module
		    	assertTextXpath("//li[8]/a/span[2]");
		        clickByXpath("//li[8]/a/span[2]");
		        Reporter.log("Select Report sidebar-left Module | ");	      
	       Thread.sleep(3000);
	       Thread.sleep(5000);
	       
	     //Select Version History Sub-module
	       assertTextLink("Version History");
	       clickBylinktext("Version History");
		   Reporter.log("Selected Version History Sub-module | ");
		   Thread.sleep(8000);
		   Thread.sleep(3000);	
		   
		   //Select New Button
	    	assertTextXpath("//*[@id='report-history_wrapper']/div[1]/div[1]/div/a[2]/span");
	        clickByXpath("//*[@id='report-history_wrapper']/div[1]/div[1]/div/a[2]/span");
	        Thread.sleep(8000);
	        
	      // Enter the Version History  
	        assertTextXpath("//*[@id='DTE_Field_note']");
	        sendvaluebyxpath("//*[@id='DTE_Field_note']", "New Version History");
	        Reporter.log("Enter the Version History | ");      
	        Thread.sleep(6000);
	      
	     
	        //Select CheckBox
	    	assertTextXpath("html/body/div[4]/div/div/div/div[3]/div/form/div/div[2]/div/div[1]/div/div/label");
	        clickByXpath("html/body/div[4]/div/div/div/div[3]/div/form/div/div[2]/div/div[1]/div/div/label");
	        Thread.sleep(8000);
	        
	        //Select Save Button
	    	assertTextXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[1]");
	        clickByXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[1]");
	        Thread.sleep(8000);
	        

}

}