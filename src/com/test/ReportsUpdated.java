package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsUpdated extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;	     
  
  @Test(priority=505, enabled = true)
  public void Navigate_Reports() throws IOException, InterruptedException {
	  
	  Thread.sleep(8000);
	  Thread.sleep(8000);
	  Thread.sleep(8000);

	  
	   //Click on Full screen
      clickByXpath("//*[@id='fullscreen']/i");
      Thread.sleep(3000);
      Thread.sleep(3000);
 			  	   	  		
 		 //Select Reports sidebar-left Module	    
	    	assertTextXpath("//li[8]/a/span[2]");
	        clickByXpath("//li[8]/a/span[2]");
       Thread.sleep(3000);
       Thread.sleep(5000);
       
  }
  
  @Test(priority=506, enabled = true)
  public void Check_Submenu_Reports() throws IOException, InterruptedException {
	  
	  Thread.sleep(8000);
  
       // Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[1]/a", "Risk Rating Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(1000);     
	    	   
    // Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a", "Risk Rating Detail Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(1000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a", "Asset Inventory Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(1000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[4]/a", "Risk Response Detail Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(1000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[5]/a", "Enterprise Extracts");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(1000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[6]/a", "Version History");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(1000);
	   
  }
  
  @Test(priority=507, enabled = true)
  public void Navigate_RiskRatingReport() throws InterruptedException {
		  
		  Thread.sleep(3000);
		  Thread.sleep(3000);
			        
	      //Click on Risk Rating Report sub-module
			clickBylinktext("Risk Rating Report");
			Reporter.log("Select Risk Rating Report sub-module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			Thread.sleep(3000);	  
			Thread.sleep(3000);	
  }
  
  @Test(priority=508, enabled = true)
  public void PageHearder_RiskRatingReport() throws IOException, InterruptedException {
	   
	   Thread.sleep(5000);
	   
	   // Click on Page header Icon
	   assertTextXpath("//h2/i");
	   Reporter.log("Click on Page header Icon | ");
	   Thread.sleep(1000);
	   mouseHoverByXpath("//h2/i");
	   Thread.sleep(1000);
	   
	   // Click on Page header Title
	   assertEquals("//h2", "Risk Rating Report");
	   Reporter.log("Click on Page header Title | ");
	   Thread.sleep(1000);
	   mouseHoverByXpath("//h2");
	   Thread.sleep(1000);
  }
  
  @Test(priority=509, enabled = true)
  public void PanelBar_RiskRatingReport() throws IOException, InterruptedException {
		   
	   Thread.sleep(6000);
	   // Click on Page breadcrumb
	   assertEquals("//ol", "Reports Risk Rating Report");
	   //assertEquals("//ol", "Assets Asset Inventory List");
	   Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//ol");
	   Thread.sleep(1000); 
	   
  }
  
  @Test(priority=510, enabled = true)
  public void PageLevelHelp_RiskRatingReport() throws IOException, InterruptedException {
	   
	   Thread.sleep(6000);
	   
	   //Click on PageHelp button Icon
	    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	    clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
       Reporter.log("Click on PageHelp button Icon | ");
       Thread.sleep(6000);
	    //Thread.sleep(6000);
	    
	    // Click OK Button in PageHelp pop-up window
	    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
       clickByXpath("html/body/div[3]/div/div/div[3]/button");
       Reporter.log("Click OK Button in PageHelp pop-up window | ");
       Thread.sleep(1000);
	   // Thread.sleep(6000);
	   
  }
	
  @Test(priority=511, enabled = true)
  public void RiskManagementMap_RiskRatingReport() throws IOException, InterruptedException {
	   
	   Thread.sleep(6000); 
	   
	   // Click on Risk Management Map
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   Reporter.log("Click on Risk Management Map | ");
	   Thread.sleep(6000);
	   clickByXpath("html/body/div[3]/div/div/div[2]/button");
	   Thread.sleep(6000);
  }
  
  @Test(priority=512, enabled = true)
  public void Check_ColumnHeader_RiskRatingReport() throws IOException, InterruptedException {
	  
	  Thread.sleep(6000);
	   
	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[1]/span[1]/span", "Scenario Advisory");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[2]/span[1]/span", "Component / Group Name");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
  
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[3]/span[1]/span", "Threat Source/Event");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[4]/span[1]/span", "Vulnerability");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[5]/span[1]/span", "Likelihood");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[6]/span[1]/span", "Impact");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[7]/span[1]/span", "Rating");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
 	  	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[10]/span[1]/span", "Created Date");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[11]/span[1]/span", "Updated Date");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(1000);
   
  }
  
  @Test(priority=513, enabled = true)
  public void IRMA9553_Vulnerability_RiskRatingReport() throws InterruptedException {
		  
	  Thread.sleep(6000);
	  //Click on Vulnerability link
	  GetText("//*[@id='content']/tr[1]/td[4]/div/a");
	  Thread.sleep(3000);
	  clickByXpath("//*[@id='content']/tr[1]/td[4]/div/a");
	  Thread.sleep(5000);
	  Thread.sleep(8000);
	  
	  //Click on Vulnerability link
	  assertEquals("//*[@id='uniqueMedia']/tbody/tr/td[7]",Expvalue);
	  Thread.sleep(8000);
	  Thread.sleep(8000);
	  
	
  }
  
  @Test(priority=514, enabled = true)
  public void ReturnTo_RiskRatingReports() throws IOException, InterruptedException {
	 	  
	  Thread.sleep(8000);
	  
	   //Click on Full screen
      clickByXpath("//*[@id='fullscreen']/i");
      Thread.sleep(3000);
      Thread.sleep(3000);
      
      //
      clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
      Thread.sleep(5000);
      
 		 //Select Reports sidebar-left Module
	    	assertTextXpath("//li[8]/a/span[2]");
	        clickByXpath("//li[8]/a/span[2]");
	        Reporter.log("Select Report sidebar-left Module | ");
      
       Thread.sleep(3000);
      
       
       //Click on Risk Rating Report sub-module
		clickBylinktext("Risk Rating Report");
		Reporter.log("Select Risk Rating Report sub-module | ");
		Thread.sleep(8000);	  
		Thread.sleep(8000);	
       
  }
  
			
  @Test(priority=515, enabled = true)
  public void Export_RiskRatingReport() throws InterruptedException {
		  
	  Thread.sleep(8000);
	  
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
  
  @Test(priority=516, enabled = true)
  public void QuickFilter_RiskRatingReport() throws InterruptedException {
	  
	  		Thread.sleep(3000);
		       
	  		// Click on Scenario Status Filter Button
	        assertTextXpath("//*[@id='report-version']");
	  		clickByXpath("//*[@id='report-version']");
	  		Reporter.log("Click on Filter Button | ");
	  		Thread.sleep(8000);
	  		//Thread.sleep(3000);
	        //Thread.sleep(3000);
       
	  		//Click on Scenario Status Filter Drop-down
	  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li/a");
	  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li/a");
	  		Reporter.log("Click on Media Drop-down | ");
	  		Thread.sleep(8000);
	  		Thread.sleep(3000);
	  	
	  		
  }
	  
	  @Test(priority=517, enabled = true)
	  public void Filter_RiskRatingReport() throws InterruptedException {
		  
		  		Thread.sleep(3000);
			       
		  		// Click on Filter Button
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
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

		  		//click on Media label drop-down
		  		assertTextXpath("//div[3]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000)	 		
		   		
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
	  
	  @Test(priority=518, enabled = true)
	  public void Navigate_RiskRatingDetailReport() throws InterruptedException {
			  
			  Thread.sleep(3000);
			  Thread.sleep(3000);				        
			  
			  //Click on Risk Rating Detail Report sub-module
			  clickBylinktext("Risk Rating Detail Report");
			  Reporter.log("Select Risk Rating Detail Report sub-module | ");
			  Thread.sleep(8000);	  
			  Thread.sleep(5000);	 
			
	  }
	  
	  @Test(priority=519, enabled = true)
	  public void PageHearder_RiskRatingDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(5000);
		   
		   // Click on Page header Icon
		   assertTextXpath("//h2/i");
		   Reporter.log("Click on Page header Icon | ");
		   Thread.sleep(1000);
		   mouseHoverByXpath("//h2/i");
		   Thread.sleep(1000);
		   
		   // Click on Page header Title
		   assertEquals("//h2", "Risk Rating Detail Report");
		   Reporter.log("Click on Page header Title | ");
		   Thread.sleep(1000);
		   mouseHoverByXpath("//h2");
		   Thread.sleep(1000);
	  }
	  
	  @Test(priority=520, enabled = true)
	  public void PanelBar_RiskRatingDetailReport() throws IOException, InterruptedException {
			   
		   Thread.sleep(6000);
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Reports Risk Rating Detail Report");
		   //assertEquals("//ol", "Assets Asset Inventory List");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
	  }
	  
	  @Test(priority=521, enabled = true)
	  public void PageLevelHelp_RiskRatingDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	       clickByXpath("//cw-page-help/button");
	       Reporter.log("Click on PageHelp button Icon | ");
	       Thread.sleep(6000);
		    //Thread.sleep(6000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[3]/div/div/div[3]/button");
	       clickByXpath("//div[3]/div/div/div[3]/button");
	       Reporter.log("Click OK Button in PageHelp pop-up window | ");
	       Thread.sleep(1000);
		   // Thread.sleep(6000);
		   
	  }
		
	  @Test(priority=522, enabled = true)
	  public void RiskManagementMap_RiskRatingDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000); 
		   
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(6000);
		   clickByXpath("//div[3]/div/div/div[2]/button");
		   Thread.sleep(6000);
	  }
	  
	  @Test(priority=523, enabled = true)
	  public void Check_ColumnHeader_RiskRatingDetailReport() throws IOException, InterruptedException {
		  
		  Thread.sleep(6000);
		   
		// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[2]/span[1]/span", "Component / Group Name");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	  
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[3]/span[1]/span", "Threat Source / Event");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[4]/span[1]/span", "Vulnerability");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[5]/span[1]/span", "Likelihood");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[6]/span[1]/span", "Impact");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[7]/span[1]/span", "Rating");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[12]/span/span", "Notes / Answers");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	  }
			
	  @Test(priority=524, enabled = true)
	  public void IRMA9553_Vulnerability_RiskRatingDetailReport() throws InterruptedException {
			  
		  Thread.sleep(6000);
		  //Click on Vulnerability link
		  gettext("//*[@id='content']/tr[1]/td[4]/div/a");
		  Thread.sleep(3000);
		  clickByXpath("//*[@id='content']/tr[1]/td[4]/div/a");
		  Thread.sleep(5000);
		  Thread.sleep(8000);
		  
		  //Click on Vulnerability link
		  assertEquals("//*[@id='uniqueMedia']/tbody/tr/td[7]",actvalue);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  
		
	  }
	  
	  @Test(priority=525, enabled = true)
	  public void ReturnTo_RiskRatingDetailReports() throws IOException, InterruptedException {
		  
		  Thread.sleep(8000);

		  
		   //Click on Full screen
	      clickByXpath("//*[@id='fullscreen']/i");
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //
	      clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
	      Thread.sleep(5000);
	 			  	   	  		
	 		 //Select Reports sidebar-left Module
		    	assertTextXpath("//li[8]/a/span[2]");
		        clickByXpath("//li[8]/a/span[2]");
		        Reporter.log("Select Report sidebar-left Module | ");
	      
	       Thread.sleep(3000);
	     
	       
	       //Click on Risk Rating Detail Report sub-module
			  clickBylinktext("Risk Rating Detail Report");
			  Reporter.log("Select Risk Rating Detail Report sub-module | ");
			  Thread.sleep(8000);	  
			  Thread.sleep(8000);	 
				
				
	       
	  }
	  @Test(priority=526, enabled = true)
	  public void Export_RiskRatingDetailReport() throws InterruptedException {
			  
		  Thread.sleep(3000);	
		  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(5000);
			  
			  
			  //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(5000);
			  Thread.sleep(8000);
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
	  
	  @Test(priority=527, enabled = true)
	  public void QuickFilter_RiskRatingDetailReport() throws InterruptedException {
		  
		  		Thread.sleep(3000);
			       
		  		// Click on History Quick Filter Button
		        assertTextXpath("//*[@id='report-version']");
		  		clickByXpath("//*[@id='report-version']");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(8000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on History Quick Filter Drop-down
		  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li/a");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li/a");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(8000);
		  		Thread.sleep(3000);
		  		
		  
		  		
	  }
		  
		  @Test(priority=528, enabled = true)
		  public void Filter_RiskRatingDetailReport() throws InterruptedException {
			  
			  		Thread.sleep(3000);
				       
			  	// Click on Filter Button
			        assertTextXpath("//cw-filter/div/span/i");
			  		clickByXpath("//cw-filter/div/span/i");
			  		Reporter.log("Click on Filter Button | ");
			  		Thread.sleep(3000);
			  		Thread.sleep(3000);
			        //Thread.sleep(3000);
		       
			  		//Click on Media Drop-down
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

			  		//click on Media label drop-down
			  		assertTextXpath("//div[3]/div/div/ul/li/input");
			  		clickByXpath("//div[3]/div/div/ul/li/input");
			  		Reporter.log("Click on Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[3]/div/div/div/ul/li");
			  		clickByXpath("//div[3]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media label Drop-down | ");
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
			  		
			  	
		  }
		  
		  @Test(priority=529, enabled = true)
		  public void Navigate_AssetInventoryReport() throws InterruptedException {
				  
				  Thread.sleep(3000);
				  Thread.sleep(3000);
					        
				//Click on Asset Inventory Report sub-module
				  clickBylinktext("Asset Inventory Report");
				  Reporter.log("Select Asset Inventory Report sub-module | ");
				  Thread.sleep(3000);	  
				  Thread.sleep(3000);	 
				  Thread.sleep(3000);	  
				  //Thread.sleep(3000);	
		  }
		  
		  @Test(priority=530, enabled = true)
		  public void PageHearder_AssetInventoryReport() throws IOException, InterruptedException {
			   
			   Thread.sleep(5000);
			   
			   // Click on Page header Icon
			   assertTextXpath("//h2/i");
			   Reporter.log("Click on Page header Icon | ");
			   Thread.sleep(1000);
			   mouseHoverByXpath("//h2/i");
			   Thread.sleep(1000);
			   
			   // Click on Page header Title
			   assertEquals("//h2", "Asset Inventory Report");
			   Reporter.log("Click on Page header Title | ");
			   Thread.sleep(1000);
			   mouseHoverByXpath("//h2");
			   Thread.sleep(1000);
		  }
		  
		  @Test(priority=531, enabled = true)
		  public void PanelBar_AssetInventoryReport() throws IOException, InterruptedException {
				   
			   Thread.sleep(6000);
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Reports Asset Inventory Report");
			   //assertEquals("//ol", "Assets Asset Inventory List");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
		  }
		  
		  @Test(priority=532, enabled = true)
		  public void PageLevelHelp_AssetInventoryReport() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000);
			   
			   //Click on PageHelp button Icon
			    assertTextXpath("//cw-page-help/button");
		       clickByXpath("//cw-page-help/button");
		       Reporter.log("Click on PageHelp button Icon | ");
		       Thread.sleep(6000);
			    //Thread.sleep(6000);
			    
			    // Click OK Button in PageHelp pop-up window
			    assertTextXpath("//div[3]/div/div/div[3]/button");
		       clickByXpath("//div[3]/div/div/div[3]/button");
		       Reporter.log("Click OK Button in PageHelp pop-up window | ");
		       Thread.sleep(1000);
			   // Thread.sleep(6000);
			   
		  }
			
		  @Test(priority=533, enabled = true)
		  public void RiskManagementMap_AssetInventoryReport() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000); 
			   
			   // Click on Risk Management Map
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   Reporter.log("Click on Risk Management Map | ");
			   Thread.sleep(6000);
			   clickByXpath("html/body/div[3]/div/div/div[2]/button");
			   Thread.sleep(6000);
		  }
		  
		  @Test(priority=534, enabled = true)
		  public void Check_ColumnHeader_AssetInventoryReport() throws IOException, InterruptedException {
			  
			  Thread.sleep(6000);
			   
			// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[1]/span[1]/span", "Asset ID");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[2]/span[1]/span", "Asset Name");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[3]/span[1]/span", "Status");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		  
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[4]/span[1]/span", "Type(s) of Sensitive Data");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[5]/span[1]/span", "Source of the Sensitive Data");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[6]/span[1]/span", "Component and Storage Devices");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[7]/span[1]/span", "Source of the Sensitive Information");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[8]/span[1]/span", "Where or to Whom the Data is Shared or Sent");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[9]/span[1]/span", "Number of Users");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[10]/span[1]/span", "Physical Location of Asset");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[11]/span[1]/span", "Importance of Asset");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[12]/span[1]/span", "Approximate # of Sensitive Records Stored on this Asset");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[13]/span[1]/span", "Asset Business Owner");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(1000);
		  }
					
		  @Test(priority=535, enabled = true)
		  public void Export_AssetInventoryReport() throws InterruptedException {
				  
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
		  
		  @Test(priority=536, enabled = true)
		  public void QuickFilter_AssetInventoryReport() throws InterruptedException {
			  
			  		Thread.sleep(3000);
				       
			  		// Click on History Button
			        assertTextXpath("//*[@id='report-version']");
			  		clickByXpath("//*[@id='report-version']");
			  		Reporter.log("Click on Filter Button | ");
			  		Thread.sleep(8000);
			  		//Thread.sleep(3000);
			        //Thread.sleep(3000);
		       
			  		//Click on History Drop-down
			  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li/a");
			  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li/a");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(8000);
			  		Thread.sleep(3000);
			  		
		  }
			  
			  @Test(priority=537, enabled = true)
			  public void Filter_AssetInventoryReport() throws InterruptedException {
				  
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
			  		assertTextXpath("//div/ul/li/input");
			  		clickByXpath("//div/ul/li/input");
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
			  		assertTextXpath("//div[2]/div/div/div/ul/li[3]");
			  		clickByXpath("//div[2]/div/div/div/ul/li[3]");
			  		Reporter.log("Select value from Media Drop-down | ");
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
				  		
				  	
			  }
			  
			  @Test(priority=538, enabled = true)
			  public void Navigate_RiskResponseDetailReport() throws InterruptedException {
					  
					  Thread.sleep(3000);
					  Thread.sleep(3000);				        
					  
					//Click on Risk Response Detail Report sub-module
						clickBylinktext("Risk Response Detail Report");
						Reporter.log("Select Risk Response Detail Report sub-module | ");
						Thread.sleep(8000);	  
						Thread.sleep(8000);	 
						Thread.sleep(8000);	  
						Thread.sleep(8000);	
						
						// Click on Risks Include Accepted Button
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/button");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		Thread.sleep(8000);	 
						Thread.sleep(8000);	
			  }
			  
			  @Test(priority=539, enabled = true)
			  public void PageHearder_RiskResponseDetailReport() throws IOException, InterruptedException {
				   
				   Thread.sleep(5000);
				   
				   // Click on Page header Icon
				   assertTextXpath("//h2/i");
				   Reporter.log("Click on Page header Icon | ");
				   Thread.sleep(1000);
				   mouseHoverByXpath("//h2/i");
				   Thread.sleep(1000);
				   
				   // Click on Page header Title
				   assertEquals("//h2", "Risk Response Detail Report");
				   Reporter.log("Click on Page header Title | ");
				   Thread.sleep(1000);
				   mouseHoverByXpath("//h2");
				   Thread.sleep(1000);
			  }
			  
			  @Test(priority=540, enabled = true)
			  public void PanelBar_RiskResponseDetailReport() throws IOException, InterruptedException {
					   
				   Thread.sleep(6000);
				   // Click on Page breadcrumb
				   assertEquals("//ol", "Reports Risk Response Detail Report");
				   //assertEquals("//ol", "Assets Asset Inventory List");
				   Reporter.log("Click on Page breadcrumb | ");
				   Thread.sleep(2000);
				   mouseHoverByXpath("//ol");
				   Thread.sleep(1000); 
				   
			  }
			  
			  @Test(priority=541, enabled = true)
			  public void PageLevelHelp_RiskResponseDetailReport() throws IOException, InterruptedException {
				   
				   Thread.sleep(6000);
				   
				   //Click on PageHelp button Icon
				    assertTextXpath("//cw-page-help/button");
			       clickByXpath("//cw-page-help/button");
			       Reporter.log("Click on PageHelp button Icon | ");
			       Thread.sleep(8000);
				    //Thread.sleep(6000);
				    
				    // Click OK Button in PageHelp pop-up window
			       
				    assertTextXpath("//div[3]/div/div/div[3]/button");
			       clickByXpath("//div[3]/div/div/div[3]/button");
			       Reporter.log("Click OK Button in PageHelp pop-up window | ");
			       Thread.sleep(1000);
				   // Thread.sleep(6000);
				   
			  }
				
			  @Test(priority=542, enabled = true)
			  public void RiskManagementMap_RiskResponseDetailReport() throws IOException, InterruptedException {
				   
				   Thread.sleep(6000); 
				   
				   // Click on Risk Management Map
				   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
				   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
				   Reporter.log("Click on Risk Management Map | ");
				   Thread.sleep(8000);
				   clickByXpath("html/body/div[3]/div/div/div[2]/button");
				   Thread.sleep(6000);
			  }
			  
			  @Test(priority=543, enabled = false)
			  public void Check_ColumnHeader_RiskResponseDetailReport() throws IOException, InterruptedException {
				  
				  Thread.sleep(6000);
				   
				// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[1]/span[1]/span", "Scenario Advisory");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[2]/span[1]/span", "Component / Group Name");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			  
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[3]/span[1]/span", "Asset Name(s)");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[4]/span[1]/span", "Threat Source/Event");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[5]/span[1]/span", "Vulnerability");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[6]/span[1]/span", "Likelihood");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[7]/span[1]/span", "Impact");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[8]/span[1]/span", "Rating");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[10]/span[1]/span", "Created Date");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[11]/span[1]/span", "Updated Date");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[12]/span[1]/span", "Notes / Answers");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(1000);
			 	   
			  }
						
			  @Test(priority=544, enabled = true)
			  public void Export_RiskResponseDetailReport() throws InterruptedException {
					  
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
					  Thread.sleep(8000);
					  Thread.sleep(8000);
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
					  Thread.sleep(8000);
				      Thread.sleep(5000);
					  //Thread.sleep(3000);	  
				      
				  }
			  
			  @Test(priority=545, enabled = true)
			  public void QuickFilter_RiskResponseDetailReport() throws InterruptedException {
				  
				  		Thread.sleep(3000);
					       
				  		// Click on Scenario Status Filter Button
				        assertTextXpath("//*[@id='view-scenario-filter']");
				  		clickByXpath("//*[@id='view-scenario-filter']");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);
				  		
				  		//Click on Scenario Status Filter Drop-down
				  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[1]/a");
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[1]/a");
				  		Reporter.log("Click on Media Drop-down | ");
				  		Thread.sleep(8000);
				  		Thread.sleep(3000);
				  		
				  	// Click on Scenario Status Filter Button
				        assertTextXpath("//*[@id='view-scenario-filter']");
				  		clickByXpath("//*[@id='view-scenario-filter']");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);
				  		
				  	//Click on Scenario Status Filter Drop-down
				  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[2]/a");
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[2]/a");
				  		Reporter.log("Click on Media Drop-down | ");
				  		Thread.sleep(3000);			  		
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				  		
				  	// Click on Controls Show All Button
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/button");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);
				  		
				  	// Click on Controls Show All Button
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/button");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);	
				  		
				  	// Click on Risks Include Accepted Button
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/button");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);
				  		
				  	// Click on Risks Include Accepted Button
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/button");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);		
				  		
				  		
				  	// Click on Control Status filter Button
				        assertTextXpath("//*[@id='view-control-filter']");
				  		clickByXpath("//*[@id='view-control-filter']");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);
			       
				  		//Click on Control Status filter Drop-down
				  		//assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[4]/div/ul/li[1]/a");
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[1]/a");
				  		Reporter.log("Click on Media Drop-down | ");
				  		Thread.sleep(8000);
				  		Thread.sleep(3000);
				  		
				  	// Click on Control Status filter Button
				        assertTextXpath("//*[@id='view-control-filter']");
				  		clickByXpath("//*[@id='view-control-filter']");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(8000);
				  		//Thread.sleep(3000);
				        //Thread.sleep(3000);
				        //Thread.sleep(3000);
				  		
				  	//Click on Control Status filter Drop-down
				  		//assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[4]/div/ul/li[2]/a");
				  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[2]/a");
				  		Reporter.log("Click on Media Drop-down | ");
				  		Thread.sleep(3000);			  		
				  		Thread.sleep(8000);
				  	     Thread.sleep(3000);
			  }
				  
				  @Test(priority=546, enabled = true)
				  public void Filter_RiskResponseDetailReport() throws InterruptedException {
					  
					  Thread.sleep(3000);
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);
				  		//Thread.sleep(3000);
				     		       
				  		// Click on Filter Button 
				        assertTextXpath("//cw-filter/div/span/i");
				  		clickByXpath("//cw-filter/div/span/i");
				  		Reporter.log("Click on Filter Button | ");
				  		Thread.sleep(5000);
				  		//Thread.sleep(3000);
				  		Thread.sleep(3000);
				        //Thread.sleep(3000);
			       
				  		//Click on Media Drop-down
				  		assertTextXpath("//div[2]/div/div/ul/li/input");
				  		clickByXpath("//div[2]/div/div/ul/li/input");
				  		Reporter.log("Click on Media Drop-down | ");
				  		Thread.sleep(3000);
				  		assertTextXpath("//div[2]/div/div/div/ul/li");
				  		clickByXpath("//div[2]/div/div/div/ul/li");
				  		Reporter.log("Select value from Media Drop-down | ");
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);

				  		//click on Media label drop-down
				  		assertTextXpath("//div[3]/div/div/ul/li/input");
				  		clickByXpath("//div[3]/div/div/ul/li/input");
				  		Reporter.log("Click on Media label Drop-down | ");
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);
				  		assertTextXpath("//div[3]/div/div/div/ul/li");
				  		clickByXpath("//div[3]/div/div/div/ul/li");
				  		Reporter.log("Select value from Media label Drop-down | ");
				  		Thread.sleep(3000);
				  		Thread.sleep(3000);			  		
				  		
				  	    //Click on Submit button in Filter Pop-up				  		
				  			assertTextXpath("//div[3]/button[2]");
				  			clickByXpath("//div[3]/button[2]");
				  			Reporter.log("Click on Submit button in Filter Pop-up | ");
				  			Thread.sleep(3000);
				  		
				  		Thread.sleep(3000);   
				  		//Thread.sleep(3000);   
				  		//Thread.sleep(3000);   
				       	       
				  		//Click on 'Clear Filter' Button 				  		
				  			assertTextXpath("//i[2]");
				  			clickByXpath("//i[2]");
				  			Reporter.log("Click on 'Clear Filter' Button  | ");
				  		Thread.sleep(3000);
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);
					  		
					  	
				  }
				  
				  @Test(priority=547, enabled = true)
				  public void Navigate_EnterpriseExtracts() throws InterruptedException {
						  
						  Thread.sleep(3000);
						  Thread.sleep(3000);	
						  
				 	       Thread.sleep(3000);	   
					   	      // Thread.sleep(3000);
					   	       
					   	    
					   	      //Click on Full screen
					 	       clickByXpath("//*[@id='fullscreen']/i");
					 	       Thread.sleep(3000);
					 	       Thread.sleep(3000);
					 	    	   
						  
						  //Select Enterprise Extracts Sub-module
					       assertTextLink("Enterprise Extracts");
					       clickBylinktext("Enterprise Extracts");
						   Reporter.log("Selected Enterprise Extracts Sub-module | ");
						   Thread.sleep(3000);
						   Thread.sleep(3000);	
				  }
				  
				  @Test(priority=548, enabled = true)
				  public void PageHearder_EnterpriseExtracts() throws IOException, InterruptedException {
					   
					   Thread.sleep(5000);
					   
					   // Click on Page header Icon
					   assertTextXpath("//h2/i");
					   Reporter.log("Click on Page header Icon | ");
					   Thread.sleep(1000);
					   mouseHoverByXpath("//h2/i");
					   Thread.sleep(1000);
					   
					   // Click on Page header Title
					   assertEquals("//h2", "Enterprise Extracts");
					   Reporter.log("Click on Page header Title | ");
					   Thread.sleep(1000);
					   mouseHoverByXpath("//h2");
					   Thread.sleep(1000);
				  }
				  
				  @Test(priority=549, enabled = true)
				  public void PanelBar_EnterpriseExtracts() throws IOException, InterruptedException {
						   
					   Thread.sleep(6000);
					   // Click on Page breadcrumb
					   assertEquals("//ol", "Reports Enterprise Extracts");
					   //assertEquals("//ol", "Assets Asset Inventory List");
					   Reporter.log("Click on Page breadcrumb | ");
					   Thread.sleep(2000);
					   mouseHoverByXpath("//ol");
					   Thread.sleep(1000); 
					   
				  }
				  
				  @Test(priority=550, enabled = true)
				  public void PageLevelHelp_EnterpriseExtracts() throws IOException, InterruptedException {
					   
					   Thread.sleep(6000);
					   
					   //Click on PageHelp button Icon
					    assertTextXpath("//cw-page-help/button");
				       clickByXpath("//cw-page-help/button");
				       Reporter.log("Click on PageHelp button Icon | ");
				       Thread.sleep(6000);
					    //Thread.sleep(6000);
					    
					    // Click OK Button in PageHelp pop-up window
					    assertTextXpath("//div[3]/div/div/div[3]/button");
				       clickByXpath("//div[3]/div/div/div[3]/button");
				       Reporter.log("Click OK Button in PageHelp pop-up window | ");
				       Thread.sleep(1000);
					   // Thread.sleep(6000);
					   
				  }
					
				  @Test(priority=551, enabled = true)
				  public void RiskManagementMap_EnterpriseExtracts() throws IOException, InterruptedException {
					   
					   Thread.sleep(6000); 
					   
					   // Click on Risk Management Map
					   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
					   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
					   Reporter.log("Click on Risk Management Map | ");
					   Thread.sleep(6000);
					   clickByXpath("html/body/div[3]/div/div/div[2]/button");
					   Thread.sleep(8000);
				  }
				  
				  @Test(priority=552, enabled = true)
					 public void ExportButtons_EnterpriseExtracts () throws InterruptedException, IOException
						   {
					    	  
					 Thread.sleep(8000);
					   	       		   	       		 	      	  			   
							   		  
					  //Click on risk-response-list-button					 
					  clickByXpath("//*[@id='content']/div[1]/div[2]/div[3]/div[1]/button");
					  Reporter.log("Click on risk-response-list-button | ");
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					  Thread.sleep(8000);
					  Thread.sleep(8000);
										   
					 //Click on risk-action-Plan-button
					   clickByXpath("//div[4]/div[1]/button");  	
					   Reporter.log("Click on risk-action-Plan-button | ");
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
									   	
					  //Click on entity-list-detail-button	 
						clickByXpath("//div[5]/div[1]/button");  	
						 Reporter.log("Click on entity-list-detail-button Button | ");
						 Thread.sleep(8000);
						 Thread.sleep(8000);
						
						 //Click on user-roles-detail-button
						  clickByXpath("//div[6]/div[1]/button");  	
						  Reporter.log("Click on user-roles-detail-button | ");
						  Thread.sleep(8000);
						  Thread.sleep(8000);
						  Thread.sleep(8000);
						  Thread.sleep(8000);
											  
						  //Click on asset-inventory-button
						  clickByXpath("//div[7]/div[1]/button");
						  Reporter.log("Clicked on asset-inventory-button | ");
						  Thread.sleep(8000);
						  Thread.sleep(8000);
						  Thread.sleep(8000);
						  clickByXpath("//button[@class='btn btn-success']");
						 Thread.sleep(8000);
							  			  
						  //Click on risk-rating-detail-button
						  clickByXpath("//div[8]/div[1]/button");
						  Reporter.log("Click on risk-rating-detail-button | ");
						Thread.sleep(8000);
						Thread.sleep(8000);
						Thread.sleep(8000);
						Thread.sleep(8000);
							  
					 //Click on risk-rating-detail-button
					  clickByXpath("//div[9]/div[1]/button");
					 Reporter.log("Click on risk-rating-detail-button | ");
					  Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					  Thread.sleep(8000);
								  
					 //Click on risk-rating-detail-button
					  clickByXpath("//div[10]/div[1]/button");
					  Reporter.log("Click on risk-rating-detail-button | ");
					  Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					   clickByXpath("//button[@class='btn btn-success']");
						 Thread.sleep(8000);
					  	
					  
					//Click on risk-rating-detail-button
					  clickByXpath("//div[11]/div[1]/button");
					  Reporter.log("Click on risk-rating-detail-button | ");
					  Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					   clickByXpath("//button[@class='btn btn-success']");
						 Thread.sleep(8000);
					   Thread.sleep(8000);
					   	
					  
					//Click on risk-rating-detail-button
					  clickByXpath("//div[12]/div[1]/button");
					  Reporter.log("Click on risk-rating-detail-button | ");
					  Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					   Thread.sleep(8000);	
							  
					   }    
				  
				  
				  @Test(priority=553, enabled = true)
				  public void Navigate_VersionHistory() throws InterruptedException {
						  
					  
						  Thread.sleep(8000);
						  Thread.sleep(3000);						
					   	       				 
					   	      //Click on Full screen
					 	       clickByXpath("//*[@id='fullscreen']/i");
					 	       Thread.sleep(8000);
					 	       Thread.sleep(8000);					 	    	   
						  
						  //Select Enterprise Extracts Sub-module
					       assertTextLink("Version History");
					       clickBylinktext("Version History");
						   Reporter.log("Selected Enterprise Extracts Sub-module | ");
						   Thread.sleep(8000);
						   Thread.sleep(8000);	
				  }
				  
				  @Test(priority=554, enabled = true)
				  public void PageHearder_VersionHistory() throws IOException, InterruptedException {
					   
					   Thread.sleep(5000);
					   
					   // Click on Page header Icon
					   assertTextXpath("//h2/i");
					   Reporter.log("Click on Page header Icon | ");
					   Thread.sleep(1000);
					   mouseHoverByXpath("//h2/i");
					   Thread.sleep(1000);
					   
					   // Click on Page header Title
					   assertEquals("//h2", "Version History");
					   Reporter.log("Click on Page header Title | ");
					   Thread.sleep(1000);
					   mouseHoverByXpath("//h2");
					   Thread.sleep(1000);
				  }
				  
				  @Test(priority=555, enabled = true)
				  public void PanelBar_VersionHistory() throws IOException, InterruptedException {
						   
					   Thread.sleep(6000);
					   // Click on Page breadcrumb
					   assertEquals("//ol", "Reports Version History");
					   //assertEquals("//ol", "Assets Asset Inventory List");
					   Reporter.log("Click on Page breadcrumb | ");
					   Thread.sleep(2000);
					   mouseHoverByXpath("//ol");
					   Thread.sleep(1000); 
					   
				  }
				  
				  @Test(priority=556, enabled = true)
				  public void PageLevelHelp_VersionHistory() throws IOException, InterruptedException {
					   
					   Thread.sleep(6000);
					   
					   //Click on PageHelp button Icon
					    assertTextXpath("//cw-page-help/button");
				       clickByXpath("//cw-page-help/button");
				       Reporter.log("Click on PageHelp button Icon | ");
				       Thread.sleep(6000);
					    //Thread.sleep(6000);
					    
					    // Click OK Button in PageHelp pop-up window
					    assertTextXpath("//div[3]/div/div/div[3]/button");
				       clickByXpath("//div[3]/div/div/div[3]/button");
				       Reporter.log("Click OK Button in PageHelp pop-up window | ");
				       Thread.sleep(1000);
					   Thread.sleep(6000);
					   
				  }
					
				  @Test(priority=557, enabled = true)
				  public void RiskManagementMap_VersionHistory() throws IOException, InterruptedException {
					   
					   Thread.sleep(6000); 
					   
					   // Click on Risk Management Map
					   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
					   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
					   Reporter.log("Click on Risk Management Map | ");
					   Thread.sleep(6000);
					   clickByXpath("html/body/div[3]/div/div/div[2]/button");
					   Thread.sleep(6000);
				  }
				  
				  @Test(priority=558, enabled =true)
				  public void IRMA5038_AddVersion_VersionHistory() throws InterruptedException, IOException {
					  
					 Thread.sleep(8000);
				    Thread.sleep(8000);
				    
				    //1st
				    //Click on New button
				    assertTextXpath("//a[2]/span");
				    clickByXpath("//a[2]/span");
				    Reporter.log("Click on Notes button to add text | ");
				    Thread.sleep(8000);
				    //Thread.sleep(3000);
				    
				    // Enter Text for Note textarea
				    assertTextXpath("//div/input");
				    sendvaluebyxpath("//div/input", "New version");
				    Reporter.log("Enter Text for Note textarea | ");
				    Thread.sleep(5000);
				    //Thread.sleep(3000);
				    
				   /* // Click on Check Boc
				    assertTextXpath("//form/div/div[2]/div/div/div/div/label");
				    clickByXpath("//form/div/div[2]/div/div/div/div/label");
				    Reporter.log("Click on Create Button | ");
				    Thread.sleep(8000);
				    Thread.sleep(3000);*/
				    
				 // Click on Save button
				    assertTextXpath("//div[3]/button[1]");
				    clickByXpath("//div[3]/button[1]");
				    Reporter.log("Click on Create Button | ");
				    Thread.sleep(8000);
				    Thread.sleep(8000);
			
				    
			}		
				  
	 @Test(priority=559, enabled =true)
	 public void EditVersion_VersionHistory() throws InterruptedException, IOException {
					  
					 Thread.sleep(8000);
				    Thread.sleep(8000);
				    
				    //Click n Listed Version for Edit
				    assertTextXpath(" //td[3]");
				    clickByXpath(" //td[3]");
				    Reporter.log("Click on Notes button to add text | ");
				    Thread.sleep(8000);
				 
				    
				    //1st
				    //Click on Edit button
				    assertTextXpath("//a[3]/span");
				    clickByXpath("//a[3]/span");
				    Reporter.log("Click on Notes button to add text | ");
				    Thread.sleep(8000);
				    //Thread.sleep(3000);
				    
				    // Enter Text for Note textarea
				    assertTextXpath("//div/input");
				    sendvaluebyxpath("//div/input", "Edit New version");
				    Reporter.log("Enter Text for Note textarea | ");
				    Thread.sleep(5000);
				    //Thread.sleep(3000);
				   				    
				 // Click on Save button
				    assertTextXpath("//div[3]/button");
				    clickByXpath("//div[3]/button");
				    Reporter.log("Click on Create Button | ");
				    Thread.sleep(8000);
				    Thread.sleep(3000);
			
				    
			}					
	 
	 @Test(priority=560, enabled =true)
	 public void DeleteVersion_VersionHistory() throws InterruptedException, IOException {
					  
					 Thread.sleep(8000);
				    Thread.sleep(8000);
				    
				    
				    //1st
				    //Click on Delete button
				    assertTextXpath("//a[4]/span");
				    clickByXpath("//a[4]/span");
				    Reporter.log("Click on Notes button to add text | ");
				    Thread.sleep(8000);
				    //Thread.sleep(3000);
				    
		
				 // Click on Save button
				    assertTextXpath("//div[3]/button");
				    clickByXpath("//div[3]/button");
				    Reporter.log("Click on Create Button | ");
				    Thread.sleep(8000);
				    Thread.sleep(3000);
			
				    
			}	
	 
	 @Test(priority=561, enabled = true)
	  public void Navigate_ComponentGroupsDetailReport() throws InterruptedException {
			  
			  Thread.sleep(3000);
			  Thread.sleep(3000);//Full Creen
			  
			  
				        
			//Click on Asset Inventory Report sub-module
			  clickBylinktext("Component Groups Detail Report");
			  Reporter.log("Select Asset Inventory Report sub-module | ");
			  Thread.sleep(3000);	  
			  Thread.sleep(3000);	 
			  Thread.sleep(3000);	  
			  //Thread.sleep(3000);	
	  }
	  
	  @Test(priority=562, enabled = true)
	  public void PageHearder_ComponentGroupsDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(5000);
		   
		   // Click on Page header Icon
		   assertTextXpath("//h2/i");
		   Reporter.log("Click on Page header Icon | ");
		   Thread.sleep(1000);
		   mouseHoverByXpath("//h2/i");
		   Thread.sleep(1000);
		   
		   // Click on Page header Title
		   assertEquals("//h2", "Component Groups Detail Report");
		   Reporter.log("Click on Page header Title | ");
		   Thread.sleep(1000);
		   mouseHoverByXpath("//h2");
		   Thread.sleep(1000);
	  }
	  
	  @Test(priority=563, enabled = true)
	  public void PanelBar_ComponentGroupsDetailReport() throws IOException, InterruptedException {
			   
		   Thread.sleep(6000);
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Reports Component Groups Detail Report");
		   //assertEquals("//ol", "Assets Asset Inventory List");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
	  }
	  
	  @Test(priority=564, enabled = true)
	  public void PageLevelHelp_ComponentGroupsDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	       clickByXpath("//cw-page-help/button");
	       Reporter.log("Click on PageHelp button Icon | ");
	       Thread.sleep(6000);
		    //Thread.sleep(6000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[3]/div/div/div[3]/button");
	       clickByXpath("//div[3]/div/div/div[3]/button");
	       Reporter.log("Click OK Button in PageHelp pop-up window | ");
	       Thread.sleep(1000);
		   // Thread.sleep(6000);
		   
	  }
		
	  @Test(priority=565, enabled = true)
	  public void RiskManagementMap_ComponentGroupsDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000); 
		   
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(6000);
		   clickByXpath("html/body/div[3]/div/div/div[2]/button");
		   Thread.sleep(6000);
	  }
	  
	  @Test(priority=566, enabled = true)
	  public void Check_ColumnHeader_ComponentGroupsDetailReport() throws IOException, InterruptedException {
		  
		  Thread.sleep(2000);
		   
		// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[1]/span[1]/span", "Component Category");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[2]/span[1]/span", "Component Type");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[3]/span[1]/span", "Default Group?");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[4]/span[1]/span", "Component Groups");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[5]/span[1]/span", "Risk Analyst");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[6]/span[1]/span", "Due Date");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[7]/span[1]/span", "Physical Location");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='component-groups-detail-report-table']/thead/tr/th[8]", "Group Properties");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(1000);
	  }
				
	  @Test(priority=567, enabled = true)
	  public void Export_ComponentGroupsDetailReport() throws InterruptedException {
			  
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
	  
	  @Test(priority=568, enabled = true)
	  public void QuickFilter_ComponentGroupsDetailReport() throws InterruptedException {
		  
		  		Thread.sleep(3000);
			       
		  		// Click on History Button
		        assertTextXpath("//*[@id='report-version']");
		  		clickByXpath("//*[@id='report-version']");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(8000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on History Drop-down
		  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li[2]/a");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li[2]/a");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(8000);
		  		Thread.sleep(3000);
		  		
	  }
		  
		  @Test(priority=569, enabled = false)
		  public void Filter_ComponentGroupsDetailReport() throws InterruptedException {
			  
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
	       
		  		//Click on Asset Drop-down
		  		assertTextXpath("html/body/div[5]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li/input");
		  		clickByXpath("html/body/div[5]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("html/body/div[5]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div/ul/li[1]");
		  		clickByXpath("html/body/div[5]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/div/ul/li[1]");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
  		
		     	//Click on Submit button in Filter Pop-up
		  		assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(3000);
		  		
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
		       	       
		  		//Click on 'Clear Filter' Button 
		  		
		  			assertTextXpath("//i[2]");
		  			clickByXpath("//i[2]");
		  			Reporter.log("Click on 'Clear Filter' Button  | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
			  		
			  	
		  }
		  

}
