package com.test;

import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class Filter extends WrapperClass{

	  public WebDriver driver;
	  String browser=null;
  
	  @Test(priority=27, enabled = true)
	  public void ControlsGlobalMediaFilter() throws InterruptedException {
		  Thread.sleep(3000);
	      Thread.sleep(3000);
	      //Thread.sleep(3000);
	      //Thread.sleep(3000);		  
	      
	      //Select Risk Determination sidebar-left Module
	      try {
	    	  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	    	  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	    	  Reporter.log("Select Risk Determination sidebar-left Module | ");
	      }catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  Reporter.log("Select Risk Determination sidebar-left Module doesn't reached | ");
	      }
	      Thread.sleep(3000);
	      //Thread.sleep(3000);
       
	      //Select Controls - Global/Media sub-module under Risk determination Module 
	      try {	 	
	    	  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
	    	  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
	    	  Reporter.log("Select Controls-Global/Media sub-module under Risk determination Module  | ");
	      }catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  Reporter.log("Select Controls-Global/Media sub-module doesn't reached | ");
	      }
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      //Thread.sleep(3000);
       
	      // Click on Filter Button 
		  try {
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
			  Reporter.log("Click on Filter Button | ");
		  }catch(Exception e)
		  {
			  e.printStackTrace();
			  Reporter.log("Click on Filter Button doesn't clicked | ");
		  }
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
	  
		  /*//Click on Controls drop-down 
		  assertTextXpath("//div/ul/li/input");
		  clickByXpath("//div/ul/li/input");
		  Reporter.log("Click on Controls drop-down ");
		  Thread.sleep(3000);
		  assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  Reporter.log("Select value of Controls drop-down");
		  Thread.sleep(3000);*/
	    
		  /*//Click on Control type drop-down 
		  assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  clickByXpath("//div[3]/div/div/div/ul/li/input");
		  Reporter.log("Click on Control type drop-down ");
		  Thread.sleep(3000);
		  assertTextXpath("//div/div/div/div/ul/li[2]");
		  clickByXpath("//div/div/div/div/ul/li[2]");
		  Reporter.log("Select value of Control type drop-down");
		  Thread.sleep(3000);
		  Thread.sleep(3000);*/
	    
		  //Click on Response drop-down
		  assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  clickByXpath("//div[4]/div/div/div/ul/li/input");
		  Reporter.log("Click on Respons drop-down ");
		  Thread.sleep(3000);
		  assertTextXpath("//div[4]/div/div/div/div/ul/li[2]");
		  clickByXpath("//div[4]/div/div/div/div/ul/li[2]");
		  Reporter.log("Select value of Response drop-down");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
	    
		  //Click on Media drop-down
		  assertTextXpath("//div[2]/div/div/ul/li/input");
		  clickByXpath("//div[2]/div/div/ul/li/input");
		  Reporter.log("Click on Media drop-down ");
		  Thread.sleep(3000);
		  assertTextXpath("//div[2]/div/div/div/ul/li");
		  clickByXpath("//div[2]/div/div/div/ul/li");
		  Reporter.log("Select value of Media drop-down");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
	    
		  //Click on Media/Label drop-down
		  assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  Reporter.log("Click on Media/label drop-down ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/ul/li[2]");
		  clickByXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/ul/li[2]");
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
	       Thread.sleep(3000);   
	       Thread.sleep(3000);   
	       //Thread.sleep(3000);   
		       
		  // FilterText("//tr[*]/td[3]/cw-s-response-choices/div/div/label[1]", "Yes");
		       
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
	  
	  
	  
	  @Test(priority=29, enabled = true)
	  public void ControlsReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);		
		  		
		  		// Select ControlsReview sub-module under Risk Determination Module
		  		try {
		  			assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
		  			clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
		  			Reporter.log("Select ControlsReview sub-module | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Select ControlsReview sub-module doesn't reached | ");
		  		}
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
	       
		  		// Click on Filter Button 
		  		try {
		  			assertTextXpath("//cw-filter/div/span/i");
		  			clickByXpath("//cw-filter/div/span/i");
		  			Reporter.log("Click on Filter Button | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Filter Button doesn't clicked | ");
		  		}
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		/*//Click on Thread Event drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Event Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Event Drop-down | ");
		  		Thread.sleep(3000);
		    
		  		// Click on Vulnerabilities drop-down
		  		assertTextXpath("//div[6]/div/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Vulnerabilities Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[6]/div/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Vulnerabilities Drop-down | ");
		  		Thread.sleep(3000);*/

		  		/*// Click on Controls drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Controls Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Controls Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Control Response drop-down
		  		assertTextXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Control Response Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Control Response Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on NIST Family drop-down
		  		assertTextXpath("//div[6]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on NIST Family Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[6]/div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from NIST Family Drop-down | ");
		  		Thread.sleep(3000);*/
		    
		  		//Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000); 
		  		//Thread.sleep(3000);   
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
		  		Thread.sleep(3000);
		  		
		  
	  }
	  
	  @Test(priority=30, enabled = true)
	  public void RatingReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  		// Select on Rating Review Sub-Module
		  		try {
		  			assertTextLink("Rating Review");
		  			clickBylinktext("Rating Review");
		  			Reporter.log("Select Rating Review sub-Module | ");
		  		}catch(Exception e) 
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Select Rating Review sub-Module doesn't reached | ");
		  		}
		  		Thread.sleep(3000);
	       
		  		// Click on Filter Button 
		  		try {
		  			assertTextXpath("//cw-filter/div/span/i");
		  			clickByXpath("//cw-filter/div/span/i");
		  			Reporter.log("Click on Filter Button | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Filter Button doesn't clicked | ");
		  		}
		  		Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(3000);

		  		/*//Click on Thread Event drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Event Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Event Drop-down | ");
		  		Thread.sleep(3000);
		    
		  		// Click on Vulnerabilities drop-down
		  		assertTextXpath("//div[6]/div/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Vulnerabilities Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[6]/div/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Vulnerabilities Drop-down | ");
		  		Thread.sleep(3000);*/

		  		// Click on Risk Likelihood drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Controls Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Controls Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Risk Impact drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Control Response Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[6]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[6]");
		  		Reporter.log("Select value from Control Response Drop-down | ");
		  		Thread.sleep(3000);

		  		/*// Click on Risk rating drop-down
		  		assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on NIST Family Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div[2]/div/div/div/ul/li[7]");
		  		clickByXpath("//div[3]/div[2]/div/div/div/ul/li[7]");
		  		Reporter.log("Select value from NIST Family Drop-down | ");
		  		Thread.sleep(3000);*/
		    
		  		/*// Click on Created From and To Date
		  		clickByXpath("//div/div/input");
		  		clickBylinktext("8");
		  		clickByXpath("//div[2]/input");
		  		clickBylinktext("16");
		  		Thread.sleep(3000);
		    
		  		// Click on Updated From and To Date
		  		clickByXpath("//div[5]/div[2]/div/div/div/input");
		  		clickBylinktext("29");
		  		clickByXpath("//div[5]/div[2]/div/div/div[2]/input");
		  		clickBylinktext("31");
		  		Thread.sleep(3000);*/
		    
		  		//Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		//Thread.sleep(3000);   
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
	   
	  @Test(priority=31, enabled = true)
	  public void RiskResponseListFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		
		  	    //Click on Risk Response Module
		 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
		        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
		        Reporter.log("Click on Risk Response Module | ");
		        Thread.sleep(3000);
		        //Thread.sleep(3000);		        
		        //Thread.sleep(3000);
		 	    //Thread.sleep(3000);
		 	    
		        //Click on Risk Response List Sub-module
		        assertTextLink("Risk Response List");
		        clickBylinktext("Risk Response List");
		        Reporter.log("Click on Risk Response List Sub-module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		// Click on Filter Button 
		        assertTextXpath("//cw-filter/div/span");
		  		clickByXpath("//cw-filter/div/span");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Risk Treatment drop-down
		  		assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		
		  	    //Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		//Thread.sleep(3000);   
		  		//Thread.sleep(3000);  
		  		//Thread.sleep(3000);
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
		        //Thread.sleep(3000);
	  }
	  
	  @Test(priority=32, enabled = true)
	  public void ControlsResponseReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Controls Response Review Sub-module
		        assertTextLink("Controls Response Review");
		        clickBylinktext("Controls Response Review");
		        Reporter.log("Click on Controls Response Review Sub-module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        
		        //Click on Control Response drop-down to Select All Option
		        clickByid("crr-control-responses");
		        Thread.sleep(3000);
		        clickBylinktext("All");
		        Reporter.log("Click on Control Response drop-down to Select All Option");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        Thread.sleep(3000);
		        
		        //Click on Minimize sidebar
		        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		       	        
		  		// Click on Filter Button on Controls Response Review
		        assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  		Reporter.log("Click on Filter Button on Controls Response Review page | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		/*// Click on Effectiveness drop-down
		  		assertTextXpath("//div[8]/div/div/div/ul/li/input");
		  		clickByXpath("//div[8]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Effectiveness Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[8]/div/div/div/div/ul/li");
		  		clickByXpath("//div[8]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Effectiveness Drop-down | ");
		  		Thread.sleep(3000);*/
		  		
		  	    // Click on Feasibility drop-down
		  		assertTextXpath("//div[10]/div/div/div/ul/li/input");
		  		clickByXpath("//div[10]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Feasibility Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[10]/div/div/div/div/ul/li");
		  		clickByXpath("//div[10]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Feasibility Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	   /* // Click on Priority drop-down
		  		assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Priority Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Priority Drop-down | ");
		  		Thread.sleep(3000);
		  		
		  	    // Click on Action drop-down
		  		assertTextXpath("//div[11]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[11]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Action Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[11]/div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[11]/div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Action Drop-down | ");
		  		Thread.sleep(3000);*/
		  		
		  	    //Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
		  	    Thread.sleep(3000);
		  		//Thread.sleep(3000);
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
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        
		      //Click on Minimize sidebar
		        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
	  }
	  
	  @Test(priority=33, enabled = true)
	  public void  ResidualRatingReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Risk Response List Sub-module
		        assertTextLink("Residual Rating Review");
		        clickBylinktext("Residual Rating Review");
		        Reporter.log("Click on Residual Rating Review Sub-module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        Thread.sleep(5000);
		        Thread.sleep(5000);
		        
		        //Click on Minimize sidebar
		        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		     		       
		  		// Click on Filter Button 
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		// Click on Risk Treatment drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    /*// Click on Evaluated check-box
		  		//assertTextXpath("//div[4]/div[2]/div/label");
		  		clickByXpath("html/body/div[6]/div/div/div[2]/div/div[2]/div[4]/div[2]/div/div/div/div/label");
		  		Reporter.log("Click on Evaluated check-box | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    // Click on Approved check-box
		  		//assertTextXpath("//div[5]/div[2]/div/label");
		  		clickByXpath("html/body/div[6]/div/div/div[2]/div/div[2]/div[5]/div[2]/div/div/div/div/label");
		  		Reporter.log("Click on Approved check-box | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
*/		  		
		  	    //Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
		       	       
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
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
	  }
	  
	  @Test(priority=34, enabled = true)
	  public void RiskActionPlanFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Risk Action Plan Sub-module
		        assertTextLink("Risk Action Plan");
		        clickBylinktext("Risk Action Plan");
		        Reporter.log("Click on Risk Action Plan Sub-module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        Thread.sleep(5000);
		        Thread.sleep(5000);
		     		       
		  		// Click on Filter Button
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button page | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul");
		  		clickByXpath("//div[3]/div/div/div/ul");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Priority drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    // Click on Implementation Status
		  		assertTextXpath("//div/a/span");
		  		clickByXpath("//div/a/span");
		  		Reporter.log("Click on Evaluated check-box | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[5]/div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Click on Approved check-box | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);
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
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
	  }
	  
	  @Test(priority=35, enabled = true)
	  public void RiskReconciliationFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);		  		
		  	            
		  	    //Select Risk Reconciliation List
		        clickBylinktext("Risk Reconciliation");
		        Reporter.log("Select Risk Reconciliation sub-Module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        Thread.sleep(5000);
		        Thread.sleep(5000);
	       
		  		// Click on Filter Button 
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		// Click on Reconciliation Status drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul");
		  		clickByXpath("//div[5]/div/div/div/ul");
		  		Reporter.log("Click on Reconciliation Status Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li[2]");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Reconciliation Status Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		     	//Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
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
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
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
	       
		  		// Click on Filter Button
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li[2]");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    /*// Click on Risk Likelihood drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Likelihood Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		assertTextXpath("//div/div/div/ul/li[5]");
		  		clickByXpath("//div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Risk Likelihood Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		
		  	    // Click on Risk Impact drop-down
		  		assertTextXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Impact Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div[2]/div/div/div/ul/li[6]");
		  		clickByXpath("//div[4]/div[2]/div/div/div/ul/li[6]");
		  		Reporter.log("Select value from Risk Impact Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		
		  	    // Click on Risk Rating drop-down
		  		assertTextXpath("//div[5]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Impact Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		assertTextXpath("//li[12]");
		  		clickByXpath("//li[12]");
		  		Reporter.log("Select value from Risk Impact Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);*/
		  		
		     	//Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		//Thread.sleep(3000);   
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
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
	  }
	  
	  @Test(priority=37, enabled = true)
	  public void RiskRatingDetailReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);		  		
		  	            
		  	    //Select Risk Rating Detail Report
		        clickBylinktext("Risk Rating Detail Report");
		        Reporter.log("Select Risk Rating Detail Report sub-Module | ");
		        Thread.sleep(5000);
		        Thread.sleep(5000);
		        Thread.sleep(5000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		// Click on Filter Button
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		// Click on Risk Likelihood drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Likelihood Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Risk Likelihood Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    /*// Click on Risk Impact drop-down
		  		assertTextXpath("//div[5]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Impact Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div/div/div/ul/li[6]");
		  		clickByXpath("//div/div/div/ul/li[6]");
		  		Reporter.log("Select value from Risk Impact Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
*/		  		
		     	//Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
		       	       
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
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
	  }
	  
	  @Test(priority=38, enabled =true)
	  public void AssetInventoryReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);	
		  				  	  	  	    	  	            
		  	    //Select Asset Inventory Report
		        clickBylinktext("Asset Inventory Report");
		        Reporter.log("Select Asset Inventory Report sub-Module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		// Click on Filter Button 
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Asset Drop-down
		  		assertTextXpath("//div/div/div/div/ul");
		  		clickByXpath("//div/div/div/div/ul");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Importance of Asset drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Importance of Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li[2]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Importance of Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
	  		
		     	//Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		//Thread.sleep(3000);   
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
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
	  }
	  
	  
	  @Test(priority=39, enabled = true)
	  public void RiskResponseDetailReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Risk Response Detail Report Sub-module
		        assertTextLink("Risk Response Detail Report");
		        clickBylinktext("Risk Response Detail Report");
		        Reporter.log("Click on Risk Response Detail Report Sub-module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
		     		       
		  		// Click on Filter Button 
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		/*// Click on Risk Treatment drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		assertTextXpath("//div/div/div/ul/li[5]");
		  		clickByXpath("//div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);*/	
		  		
		  	    // Click on Evaluation Status drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Evaluation Status Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Evaluation Status Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    // Click on Implementation Planning drop-down
		  		assertTextXpath("//div[3]/div[2]/div/div/ul/li");
		  		clickByXpath("//div[3]/div[2]/div/div/ul/li");
		  		Reporter.log("Click on Implementation Planning Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[3]/div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Implementation Planning Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    // Click on Action Plan drop-down
		  		assertTextXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Action Plan Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[4]/div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Action Plan Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    // Click on Reconciliation Status drop-down
		  		assertTextXpath("//div[5]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Reconciliation Status Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div[2]/div/div/div/ul/li[2]");
		  		clickByXpath("//div[5]/div[2]/div/div/div/ul/li[2]");
		  		Reporter.log("Select value from Reconciliation Status Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Submit button in Filter Pop-up
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
		  		Thread.sleep(3000);   
		  		//Thread.sleep(3000);   
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
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
	  }
	  
	}