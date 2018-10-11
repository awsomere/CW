package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class Reports extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;	     
	 
	  @Test(priority=56, enabled = true)
	  public void VersionHistory() throws InterruptedException, IOException {
		  
		  Thread.sleep(3000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
  	       //Thread.sleep(3000);	   
  	      // Thread.sleep(3000);  	       
  	    
  	       //Click on Full screen
	       clickByXpath("//*[@id='fullscreen']/i");
	       Thread.sleep(3000);
	       Thread.sleep(3000);
	  			  	   	  		
	  		 //Select Reports sidebar-left Module
		    try {
		    	assertTextXpath("//li[7]/a/span[2]");
	 	        clickByXpath("//li[7]/a/span[2]");
	 	        Reporter.log("Select Report sidebar-left Module | ");
	        }catch(Exception e)
			{
		        e.printStackTrace();
			    Reporter.log("Select Report sidebar-left Module doesn't reached | ");
			}
	        Thread.sleep(3000);
	        Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		 		
	  		// Select Version History sub-module 
	  		try {
	  			assertTextLink("Version History");
	  			clickBylinktext("Version History");
	  			Reporter.log("Select Version History sub-module | ");
	  		}catch(Exception e)
	  		{
	  			e.printStackTrace();
	  			Reporter.log("Select Version History sub-module doesn't reached | ");
	  		}
	  		Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		
	  	    //Click on New Button 
	  		assertTextXpath("//*[@id='report-history_wrapper']/div[1]/div[1]/div/a[2]");
	  		clickByXpath(".//*[@id='report-history_wrapper']/div[1]/div[1]/div/a[2]");
	  		Reporter.log("Click on New Button | ");
	  		Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		
	  	    //Enter Version note in Textbox
			sendvaluebyxpath("//*[@id='DTE_Field_note']", "New Version Note");
			Reporter.log("Enter Version note in Textbox | ");
			Thread.sleep(5000);
			//Thread.sleep(5000);
			
			//Select Apply to all Entities check-box
			//assertTextXpath("//div[2]/div/div/div/div/input");
	  		clickByXpath("//*[@id='DTE_Field_apply_to_all_entities_0']");
	  		Reporter.log("Select Apply to all Entities check-box | ");
	  		Thread.sleep(5000);
	  		
	  		//Click on Save button
	  		assertTextXpath("//div[3]/button[1]");
	  		clickByXpath("//div[3]/button[1]");
	  		Reporter.log("Click on Save Button | ");
	  		Thread.sleep(5000);
	  		Thread.sleep(3000);
	  		
	  		 //Click on New Button 
	  		assertTextXpath("//*[@id='report-history_wrapper']/div[1]/div[1]/div/a[2]");
	  		clickByXpath(".//*[@id='report-history_wrapper']/div[1]/div[1]/div/a[2]");
	  		Reporter.log("Click on New Button | ");
	  		Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		
	  	    //Enter Version note in Textbox
			sendvaluebyxpath("//*[@id='DTE_Field_note']", "Sample Version Note");
			Reporter.log("Enter Version note in Textbox | ");
			Thread.sleep(5000);
			//Thread.sleep(5000);
			
			//Select Apply to all Entities check-box
			//assertTextXpath("//div[2]/div/div/div/div/input");
	  		clickByXpath("//*[@id='DTE_Field_apply_to_all_entities_0']");
	  		Reporter.log("Select Apply to all Entities check-box | ");
	  		Thread.sleep(5000);
	  		
	  		//Click on Save button
	  		assertTextXpath("//div[3]/button[1]");
	  		clickByXpath("//div[3]/button[1]");
	  		Reporter.log("Click on Save Button | ");
	  		Thread.sleep(5000);
	  		Thread.sleep(3000);
	  		
	  		//Select the Listed Version from list
	  		assertTextXpath("//td[3]");
	  		clickByXpath("//td[3]");
	  		Reporter.log("Select the Listed Version from list| ");
	  		Thread.sleep(3000);
	  		
	  		//Click on Edit button
	  		assertTextXpath("//a[3]/span");
	  		clickByXpath("//a[3]/span");
	  		Reporter.log("Click on Edit button | ");
	  		Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		
	  		//Edit the Version note
	  		sendvaluebyxpath("//*[@id='DTE_Field_note']", "Edit New Version Note");
			Reporter.log("Edit the Version note | ");
			Thread.sleep(3000);
			
	  		//Click on Updated button
	  		assertTextXpath("//div[3]/button");
	  		clickByXpath("//div[3]/button");
	  		Reporter.log("Click on Updated button | ");
	  		Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		
	  		//Click on Delete Button
	  		assertTextXpath("//a[4]/span");
	  		clickByXpath("//a[4]/span");
	  		Reporter.log("Click on Delete Button | ");
	  		Thread.sleep(5000);
	  		//Thread.sleep(5000);
	  		
	  		//Click on Cancel on Delete confirmation
	  		assertTextXpath("//div[4]/div[3]/button[1]");
	  		clickByXpath("//div[4]/div[3]/button[1]");
	  		Reporter.log("Click on Cancel on Delete confirmation | ");
	  		Thread.sleep(5000);
	  		Thread.sleep(5000);
	  		
	           //Click on Export Button
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			   Reporter.log("Click on Export Button | ");
			   Thread.sleep(5000);
			   Thread.sleep(3000);
			  
			  //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on CSV File | ");
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  Thread.sleep(3000);
		      //Thread.sleep(3000);
		  
}
	  @Test( priority=57, enabled = true)
	  public void  VersionHistorySort() throws InterruptedException, IOException {
	 	  
	 	 Thread.sleep(5000);
	 	 Thread.sleep(5000);
	 	 Thread.sleep(5000);
	 	  
	 	 // Click on Version ID column Header to sort for Ascending order
	 	    //clickByXpath("//*[@id='report-history']/thead/tr/th[1]");
	 	    Reporter.log("Click on Version ID column Header to sort for Ascending order  | ");
	 	    Thread.sleep(5000);	
	 	   
	 		
	 	    // Click on Version ID column Header to sort for Ascending order
	 	    clickByXpath("//*[@id='report-history']/thead/tr/th[1]");
	 	    Reporter.log("Click on Version ID column Header to sort for Ascending order  | ");
	 	    Thread.sleep(5000);	
	 	    
	 	    // Click on Version Number column Header to sort for Ascending order
	 	    clickByXpath("//*[@id='report-history']/thead/tr/th[2]");
	 	    Reporter.log("Click on Version Number column Header to sort for Ascending order  | ");
	 	    Thread.sleep(5000);	
	 	    Thread.sleep(5000);	  
	 	    

	 	    // Click on Version Number column Header to sort for Ascending order
	 	    clickByXpath("//*[@id='report-history']/thead/tr/th[2]");
	 	    Reporter.log("Click on Version Number column Header to sort for Ascending order  | ");
	 	    Thread.sleep(5000);	
	 	     }
	  
	  @Test(priority=58, enabled = true)
	  public void ExportRiskRatingReports() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  Thread.sleep(3000);
			        
	      //Click on Risk Rating Report sub-module
			clickBylinktext("Risk Rating Report");
			Reporter.log("Select Risk Rating Report sub-module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			Thread.sleep(3000);	  
			Thread.sleep(3000);	
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
	      Thread.sleep(5000);
		  //Thread.sleep(3000);	  
	      
	  }
	  
	  @Test(priority=59, enabled = true)
	  public void RiskRatingReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
			       
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
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li[1]");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li[1]");
		  		Reporter.log("Select value from Asset Drop-down | ");
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
		  		
		  	//Click on PageHelp button Icon
		 	    assertTextXpath("//cw-page-help/button");
		        clickByXpath("//cw-page-help/button");
		        Reporter.log("Click on PageHelp button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in PageHelp pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in PageHelp pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	  }
	  
	  @Test(priority=60, enabled = true)
	  public void ExportRiskRatingDetailReport () throws InterruptedException {	  
		
		  Thread.sleep(3000);
	      Thread.sleep(3000);
	      
		  //Click on Risk Rating Detail Report sub-module
		  clickBylinktext("Risk Rating Detail Report");
		  Reporter.log("Select Risk Rating Detail Report sub-module | ");
		  Thread.sleep(5000);	  
		  Thread.sleep(5000);	 
		  //Thread.sleep(3000);	  
		  //Thread.sleep(3000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  Thread.sleep(3000);
	      //  Thread.sleep(3000);
	  }
	  
	  @Test(priority=61, enabled = true)
	  public void RiskRatingDetailReportFilter() throws InterruptedException {
		  
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
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
		  		
		  	//Click on PageHelp button Icon
		 	    assertTextXpath("//cw-page-help/button");
		        clickByXpath("//cw-page-help/button");
		        Reporter.log("Click on PageHelp button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in PageHelp pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in PageHelp pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	  }
	  
	  
	  @Test(priority=62, enabled = true)
	  public void ExportAssetInventoryReport() throws InterruptedException {	  
		  
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		//Click on Asset Inventory Report sub-module
		  clickBylinktext("Asset Inventory Report");
		  Reporter.log("Select Asset Inventory Report sub-module | ");
		  Thread.sleep(3000);	  
		  Thread.sleep(3000);	 
		  Thread.sleep(3000);	  
		  //Thread.sleep(3000);	
			  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(5000);
		   Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	  }
	  
	  @Test(priority=63, enabled =true)
	  public void AssetInventoryReportFilter() throws InterruptedException {
		  
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
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li[3]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li[3]");
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
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	//Click on PageHelp button Icon
		 	    assertTextXpath("//cw-page-help/button");
		        clickByXpath("//cw-page-help/button");
		        Reporter.log("Click on PageHelp button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in PageHelp pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in PageHelp pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	  }
	  
	  
	  
	  @Test(priority=64, enabled = true)
	  public void ExportRiskResponseDetailReport() throws InterruptedException {
		  
		//Click on Risk Response Detail Report sub-module
			clickBylinktext("Risk Response Detail Report");
			Reporter.log("Select Risk Response Detail Report sub-module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			//Thread.sleep(3000);	  
			//Thread.sleep(3000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  Thread.sleep(3000);
	       // Thread.sleep(3000);
		  
	  }
	  
	  @Test(priority=65, enabled = true)
	  public void RiskResponseDetailReportFilter() throws InterruptedException {
		  
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
		  		Thread.sleep(5000);
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
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	//Click on PageHelp button Icon
		 	    assertTextXpath("//cw-page-help/button");
		        clickByXpath("//cw-page-help/button");
		        Reporter.log("Click on PageHelp button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in PageHelp pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in PageHelp pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	  }
	  @Test(priority=66, enabled = true)
		 public void EnterpriseExtracts () throws InterruptedException, IOException
			   {
		    	  
		   	       Thread.sleep(5000);
		   	       Thread.sleep(3000);	   
		   	      // Thread.sleep(3000);
		   	       
		   	    
		   	     /*  //Click on Full screen
		 	       clickByXpath("//*[@id='fullscreen']/i");
		 	       Thread.sleep(3000);
		 	       Thread.sleep(3000);
		 	    	   */
		   	       		   	       		 	      	   
			       //Select Enterprise Extracts Sub-module
			       assertTextLink("Enterprise Extracts");
			       clickBylinktext("Enterprise Extracts");
				   Reporter.log("Selected Enterprise Extracts Sub-module | ");
				   Thread.sleep(3000);
				   Thread.sleep(3000);			   
				   		  
				   //Click on risk-response-list-button
				   assertTextName("risk-response-list-button");
				   clickByname("risk-response-list-button");
				   Reporter.log("Click on risk-response-list-button | ");
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   //Thread.sleep(3000);
							   
				   //Click on risk-action-Plan-button
				   assertTextXpath("//div[8]/div/input");  
				   clickByXpath("//div[8]/div/input");  	
				   Reporter.log("Click on risk-action-Plan-button | ");
				   Thread.sleep(3000);	   
				   Thread.sleep(3000);
				   //Thread.sleep(3000);
						   	
				   //Click on entity-list-detail-button	 
				   assertTextName("entity-list-detail-button"); 
		   	       clickByname("entity-list-detail-button");  	
				   Reporter.log("Click on entity-list-detail-button Button | ");
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   //Thread.sleep(3000);
						   
				   //Click on user-roles-detail-button
				   assertTextName("user-roles-detail-button");  
				   clickByname("user-roles-detail-button");  	
				   Reporter.log("Click on user-roles-detail-button | ");
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   //Thread.sleep(3000);
								  
				   //Click on asset-inventory-button
				   assertTextName("asset-inventory-button");
				   clickByname("asset-inventory-button");
				   Reporter.log("Clicked on asset-inventory-button | ");
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   //Thread.sleep(3000);
				  			  
				  //Click on risk-rating-detail-button
				  assertTextName("risk-rating-detail-button");
				  clickByname("risk-rating-detail-button");
				  Reporter.log("Click on risk-rating-detail-button | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
				  
		   }    
			  
}
