package com.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.test.WrapperClass;

public class ExportFiles extends WrapperClass {
		 
	 public WebDriver driver;
	 String browser=null;
	  
	  
      @Test(priority=56, enabled = true)
      public void DFAsset() throws InterruptedException, IOException
	   {
    	  
   	       Thread.sleep(3000);
   	       //Thread.sleep(3000);	   
   	      // Thread.sleep(3000);
   	        	       
		   //Select the Asset module at sidebar-left
   	       assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  
		   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
		   Reporter.log("Selected the Asset module at sidebar-left | ");
		   Thread.sleep(3000);	   
   	       //Thread.sleep(3000);
		   
	       //Select Asset Inventory List Sub-module
		   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		   Reporter.log("Selected Asset Inventory List Sub-module | ");
		   Thread.sleep(3000);
		   Thread.sleep(3000);
		   
		   //Click on Export Button
   	       assertTextXpath("//*[@id='assets_filter']/div/a/span");  
		   clickByXpath("//*[@id='assets_filter']/div/a/span");  	
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(3000);
		   
		   //Click on CSV file to download  
		   assertTextXpath("html/body/ul/li/a");  
		   clickByXpath("html/body/ul/li/a");  	
		   Reporter.log("Click on CSV file to download | ");
		   Thread.sleep(3000);
		   //Thread.sleep(3000);
		  
		  //Click on Asset Inventory Import sub-modules	 
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
		  Reporter.log("Clicked on Asset Inventory Import sub-modules | ");
		  Thread.sleep(5000);
		  
		  //Click on Download Asset Inventory Import Templates
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
		  Reporter.log("Click on Download Asset Inventory Import Templates | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
	   }
	  
 
	  @Test(priority=57, enabled = true)
	  public void DFRiskDetermination() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  Thread.sleep(3000); 
		  
		  //Select Risk Determination sidebar-left Module
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	  Reporter.log("Select Risk Determination sidebar-left Module | ");
	      Thread.sleep(3000);
	             	       
		  //Select Controls - Global/Media sub-module under Risk determination Module 
	      assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);	
		        	       
		  //Select Risk Determination List sidebar-left Module under Risk determination Module 
		  assertTextLink("Risk Questionnaire List");
          clickBylinktext("Risk Questionnaire List");
          Reporter.log("Select Risk Determination sidebar-left Module | ");
	      Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  Thread.sleep(3000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(3000);
		   //Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  //Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Controls Review Page
	      assertTextLink("Controls Review");
		  clickBylinktext("Controls Review");
		  Reporter.log("Click on Controls Review Page | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		 // Thread.sleep(3000);
		  //Thread.sleep(3000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(3000);
		  // Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		 // Thread.sleep(3000);
		  
		  //Click on Rating review sub-module
		  assertTextLink("Rating Review");
		  clickBylinktext("Rating Review");
		  Reporter.log("Click on rating review sub-module | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(3000);
		  // Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
	  }
	  
	  @Test(priority=58, enabled = true)
	  public void DFRiskResponse() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		    //Click on Risk Response Module
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        Reporter.log("Click on Risk Response Module | ");
	        Thread.sleep(3000);
	       Thread.sleep(3000);
	        
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       Thread.sleep(3000);
	       Thread.sleep(3000);
	       Thread.sleep(3000);
	             	       
		  
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
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		        	       
		    //Click on Controls Response Review Sub-module
	        assertTextLink("Controls Response Review");
	        clickBylinktext("Controls Response Review");
	        Reporter.log("Click on Controls Response Review Sub-module | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
		  
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
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  Thread.sleep(3000);
	      Thread.sleep(3000);
		  
		//Click on Residual Rating Review Sub-module
	        assertTextLink("Residual Rating Review");
	        clickBylinktext("Residual Rating Review");
	        Reporter.log("Click on Residual Rating Review Sub-module | ");
	        Thread.sleep(3000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
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
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		 Thread.sleep(5000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
	      Thread.sleep(5000);
		  
		  //Click on Risk Action Plan Sub-module
	        assertTextLink("Risk Action Plan");
	        clickBylinktext("Risk Action Plan");
	        Reporter.log("Click on Risk Action Plan Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
		  
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
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  
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
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		    //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
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
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on CSV File | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			 Thread.sleep(5000);
		      Thread.sleep(5000);
	  
	  }
	  	 
	  @Test(priority=59, enabled = true)
	  public void DFReports() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		 //Thread.sleep(3000);	   
  	      // Thread.sleep(3000);
  	       
  	    
  	       //Click on Full screen
	       clickByXpath("//*[@id='fullscreen']/i");
	       Thread.sleep(3000);
	       Thread.sleep(3000);
		 // Thread.sleep(3000);
		  
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
	        Thread.sleep(3000);
	        //Thread.sleep(3000);

	        
	      //Click on Risk Rating Report sub-module
			clickBylinktext("Risk Rating Report");
			Reporter.log("Select Risk Rating Report sub-module | ");
			Thread.sleep(3000);	  
			Thread.sleep(3000);	 
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
		  
		//Click on Risk Rating Detail Report sub-module
		  clickBylinktext("Risk Rating Detail Report");
		  Reporter.log("Select Risk Rating Detail Report sub-module | ");
		  Thread.sleep(3000);	  
		  Thread.sleep(3000);	 
		  //Thread.sleep(3000);	  
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
	      //  Thread.sleep(3000);
		  
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
	  @Test(priority=60, enabled = true)
	  public void DFDocuments() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Select the Document module at sidebar-left
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
		  Reporter.log("Selected the Document module at sidebar-left | ");
		  Thread.sleep(3000);          	       
		  Thread.sleep(3000);
		 // Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);	
	  }

	  @Test(priority=61, enabled = true)
		 public void DFEnterpriseExtracts () throws InterruptedException, IOException
			   {
		    	  
		   	       Thread.sleep(3000);
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
	  
	  @Test(priority = 62, enabled = true)
		 public void DFUserList() throws InterruptedException, IOException
			   {
		    	  
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);	   
		   	     				  
				  //Click on Full screen
		   	       clickByXpath("//*[@id='fullscreen']/i");
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);
		   	       //Thread.sleep(3000);
				  //Thread.sleep(3000);
		   	       		   	       
		   	       //Click on Manage Account Module
		   	       assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
		   	       clickByXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
		   	       Reporter.log("Click on Manage Account Module | ");
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);
		   	       
		   	       		   
		   	       //Click on User management Sub-Module
		   	       assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a/span[2]");
		   	       clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a/span[2]");
		   	       Reporter.log("Click on User management Sub-Module | ");
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);	
		   	       //Thread.sleep(3000);
				  //Thread.sleep(3000);	   	        
		   	       
		   	       //Select User List Module 
		   	       assertTextLink("User List");
		   	       clickBylinktext("User List");
		   	       Reporter.log("Click on User List Page | ");
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
				  Thread.sleep(5000);
				  Thread.sleep(3000);
				  
				   //Click on Full screen
		 	       clickByXpath("//*[@id='fullscreen']/i");
		 	       Thread.sleep(3000);
		 	       Thread.sleep(3000);
		 	       
		 	        //Click on Manage Roles
				      assertTextLink("Manage Roles");
					  clickBylinktext("Manage Roles");
					  Reporter.log("Click on Manage Roles Page | ");
					  Thread.sleep(5000);
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
					  Thread.sleep(5000);
					  Thread.sleep(5000);

					   //Click on Full screen
			  	       clickByXpath("//*[@id='fullscreen']/i");
			  	       Thread.sleep(5000);
			  	       Thread.sleep(3000);
			  	       
			  	   //Click on User Assignment
						  assertTextLink("User Assignment");
						  clickBylinktext("User Assignment");
						  Reporter.log("Click on User Assignment sub-module | ");
						  Thread.sleep(5000);
						 Thread.sleep(3000);
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
						  Thread.sleep(5000);
						  Thread.sleep(5000);
						  Thread.sleep(3000);
						  Thread.sleep(3000);
						  
						   //Click on Full screen
				 	       clickByXpath("//*[@id='fullscreen']/i");
				 	       Thread.sleep(5000);
				 	       Thread.sleep(3000);
				 	     						   
						   //Click on User Import under User management Sub-Module
						   assertTextLink("User Import");
						   clickBylinktext("User Import");
						   Reporter.log("Click on User Import under User management Sub-Module | ");
						   Thread.sleep(5000);   
						   Thread.sleep(3000);
				   	       //Thread.sleep(3000);
				   	       
				   	      //Click on Download User Import Templates
						  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
						  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/a");
						  Reporter.log("Click on Download User Import Templates | ");
						  Thread.sleep(5000);
						  Thread.sleep(3000);
						  //Thread.sleep(3000);	  
						  
			   }
	  
	  @Test(priority = 63, enabled = true)
		 public void DFEntityList() throws InterruptedException, IOException
			   {
		    	  
		   	       Thread.sleep(3000);
		   	       		   	       		 				
		   	      //Click on Full screen
		   	       clickByXpath("//*[@id='fullscreen']/i");
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);
		   	       
		   	       //Expand the Entity Management Sub-Module
		   	       assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a/span[2]");
		   	       clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a/span[2]");
		   	       Reporter.log("Expand the Entity Management Sub-Module | ");
		   	       Thread.sleep(3000);
		   	      Thread.sleep(3000);	   	        
		   	      	   	       
		   	       //Click on Entity List
		   	       assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[1]/a");
		   	       clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[1]/a");
		   	       Reporter.log("Click on Entity List | ");
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);
		   	       Thread.sleep(3000);
				  
				   //Click on Export Button
				   assertTextXpath("//*[@id='locations_filter']/div/a");
				   clickByXpath("//*[@id='locations_filter']/div/a");
				   Reporter.log("Click on Export Button | ");
				   Thread.sleep(3000);
				   Thread.sleep(3000);
				   
				  //Click on CSV File
				  assertTextXpath("html/body/ul/li[1]/a");
				  clickByXpath("html/body/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);
				  
				  //Click on Full screen
				  clickByXpath("//*[@id='fullscreen']/i");
				  Thread.sleep(3000);
				  Thread.sleep(3000);
				  
				  //Click on Entity Tags
				  assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
				  clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
				  Reporter.log("Click on Entity Tags | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);
				  
				  //Click on Export Button
				  assertTextXpath("//*[@id='entity-tags-list_filter']/div/a/span");
				  clickByXpath("//*[@id='entity-tags-list_filter']/div/a/span");
				  Reporter.log("Click on Export Button | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);			  
				  			  
				  //Click on CSV File
				  assertTextXpath("html/body/ul/li[1]/a");
				  clickByXpath("html/body/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);

				   //Click on Full screen
		  	       clickByXpath("//*[@id='fullscreen']/i");
		  	       Thread.sleep(3000);
		  	       Thread.sleep(3000);
		  	       
				  //Click on Entity Tag Categories
				  assertTextLink("Entity Tag Categories");
				  clickBylinktext("Entity Tag Categories");
				  Reporter.log("Click on Entity Tag Categories sub-module | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);
				  Thread.sleep(3000);
				  
				   //Click on Export Button
				   assertTextXpath("//*[@id='entity-category-tags-list_filter']/div/a/span");
				   clickByXpath("//*[@id='entity-category-tags-list_filter']/div/a/span");
				   Reporter.log("Click on Export Button | ");
				   Thread.sleep(3000);
				   Thread.sleep(3000);			 
				  
				  //Click on CSV File
				  assertTextXpath("html/body/ul/li[1]/a");
				  clickByXpath("html/body/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);
			   }
	  
}