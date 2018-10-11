package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample extends WrapperClass{
	
	public WebDriver driver;
	  String browser=null;

	 @Test(priority=1, enabled = true)
	  public void  RiskRatingReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		Thread.sleep(3000);	
		  		
		  	    //Click on Full screen
		  		clickByXpath("//*[@id='fullscreen']/i");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Report Module
		  		assertTextXpath("//*[@id='sidebar-left']/ul/li[7]/a/span[2]");
		  		clickByXpath("//*[@id='sidebar-left']/ul/li[7]/a/span[2]");
		  		Reporter.log("Click on Report Module| ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(3000);
		  				  	            
		  	    //Select Risk Rating Report
		        clickBylinktext("Risk Rating Report");
		        Reporter.log("Select Risk Rating Report sub-Module | ");
		        Thread.sleep(5000);
		        Thread.sleep(5000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		// Click on Filter Button
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
		  		
		  	      //Click on Media drop-down
				  assertTextXpath("//div/div/div/div/ul");
				  clickByXpath("//div/div/div/div/ul");
				  Reporter.log("Click on Media drop-down ");
				  Thread.sleep(3000);
				  assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
				  clickByXpath("//div[2]/div/div/div/div/div/ul/li");
				  Reporter.log("Select value of Media drop-down");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
			    
				  //Click on Media/Label drop-down
				  assertTextXpath("//div[2]/div/div/div/ul/li/input");
				  clickByXpath("//div[2]/div/div/div/ul/li/input");
				  Reporter.log("Click on Media/label drop-down ");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
				  assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
				  clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
				  Reporter.log("Select value of Media/label drop-down");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
			    
				  //Click on Assets drop-down
				  assertTextXpath("//div[3]/div/div/div/ul/li/input");
				  clickByXpath("//div[3]/div/div/div/ul/li/input");
				  Reporter.log("Click on Assets drop-down ");
				  Thread.sleep(3000);
				  assertTextXpath("//div[3]/div/div/div/div/ul/li");
				  clickByXpath("//div[3]/div/div/div/div/ul/li");
				  Reporter.log("Select value of Assets drop-down");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
		  		
				//Click on Media drop-down
				  assertTextXpath("//div[4]/div/div/div/ul/li/input");
				  clickByXpath("//div[4]/div/div/div/ul/li/input");
				  Reporter.log("Click on Media drop-down ");
				  Thread.sleep(3000);
				  assertTextXpath("//div[4]/div/div/div/div/ul/li[2]");
				  clickByXpath("//div[4]/div/div/div/div/ul/li[2]");
				  Reporter.log("Select value of Media drop-down");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
			    
				  //Click on Media/Label drop-down
				  assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
				  clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
				  Reporter.log("Click on Media/label drop-down ");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
				  assertTextXpath("//div[2]/div/div/div/ul/li[5]");
				  clickByXpath("//div[2]/div/div/div/ul/li[5]");
				  Reporter.log("Select value of Media/label drop-down");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
			    
				  //Click on Assets drop-down
				  assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
				  clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
				  Reporter.log("Click on Assets drop-down ");
				  Thread.sleep(3000);
				  assertTextXpath("//div[3]/div[2]/div/div/div/ul/li");
				  clickByXpath("//div[3]/div[2]/div/div/div/ul/li");
				  Reporter.log("Select value of Assets drop-down");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
		  		
				  //Click on Assets drop-down
				  assertTextXpath("//div[4]/div[2]/div/div/ul/li/input");
				  clickByXpath("//div[4]/div[2]/div/div/ul/li/input");
				  Reporter.log("Click on Assets drop-down ");
				  Thread.sleep(3000);
				  assertTextXpath("//div[4]/div[2]/div/div/div/ul/li[6]");
				  clickByXpath("//div[4]/div[2]/div/div/div/ul/li[6]");
				  Reporter.log("Select value of Assets drop-down");
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  
				//Click on Submit button for filters
				  try {
					  assertTextXpath("//div[3]/button[2]");
			     	  clickByXpath("//div[3]/button[2]");
			 		  Reporter.log("Click on Submit button in Filter Pop-up | ");
			 		  Thread.sleep(3000);
			       }catch(Exception e)
			 	   {
			    	   e.printStackTrace();
			    	   Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
			 	   }
			       Thread.sleep(5000);   
			       Thread.sleep(5000);   
			       //Thread.sleep(3000);   				   
				  		       
				       //Click on 'Clear Filter' Button 
				       try {
				    	   assertTextXpath("//i[2]");
				 		   clickByXpath("//i[2]");
				 		   Reporter.log("Click on 'Clear Filter' Button  | ");
				       }catch(Exception e)
				 	   {
				    	   e.printStackTrace();
				    	   Reporter.log("Click on 'Clear Filter' Button doesn't work | ");
				 	   }
				       Thread.sleep(3000);
			  
		  }
}
