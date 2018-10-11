package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTestcases extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;	     
  
  @Test(priority=183, enabled = true)
  public void Check_Submenu_Reports() throws IOException, InterruptedException {
	  
	  Thread.sleep(8000);
	  Thread.sleep(8000);
	  
	   //Click on Full screen
      clickByXpath("//*[@id='fullscreen']/i");
      Thread.sleep(3000);
      Thread.sleep(3000);
 			  	   	  		
 		 //Select Reports sidebar-left Module
	    try {
	    	assertTextXpath("//li[8]/a/span[2]");
	        clickByXpath("//li[8]/a/span[2]");
	        Reporter.log("Select Report sidebar-left Module | ");
       }catch(Exception e)
		{
	        e.printStackTrace();
		    Reporter.log("Select Report sidebar-left Module doesn't reached | ");
		}
       Thread.sleep(3000);
       Thread.sleep(5000);
       
       // Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[1]/a", "Risk Rating Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(3000);     
	    	   
    // Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a", "Risk Rating Detail Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(3000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a", "Asset Inventory Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(3000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[4]/a", "Risk Response Detail Report");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(3000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[5]/a", "Enterprise Extracts");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(3000);
 	   
 	// Check sub-menu under Asset Module
 	   assertEquals("//*[@id='sidebar-left']/ul/li[8]/ul/li[6]/a", "Version History");
 	   Reporter.log("Check sub-menu under Asset Module | ");
 	   Thread.sleep(3000);
	   
  }
  
  @Test(priority=184, enabled = true)
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
  
  @Test(priority=185, enabled = true)
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
  
  @Test(priority=186, enabled = true)
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
  
  @Test(priority=187, enabled = true)
  public void PageLevelHelp_RiskRatingReport() throws IOException, InterruptedException {
	   
	   Thread.sleep(6000);
	   
	   //Click on PageHelp button Icon
	    assertTextXpath("//cw-page-help/button");
       clickByXpath("//cw-page-help/button");
       Reporter.log("Click on PageHelp button Icon | ");
       Thread.sleep(6000);
	    //Thread.sleep(6000);
	    
	    // Click OK Button in PageHelp pop-up window
	    assertTextXpath("//div[4]/div/div/div[3]/button");
       clickByXpath("//div[4]/div/div/div[3]/button");
       Reporter.log("Click OK Button in PageHelp pop-up window | ");
       Thread.sleep(1000);
	   // Thread.sleep(6000);
	   
  }
	
  @Test(priority=188, enabled = true)
  public void RiskManagementMap_RiskRatingReport() throws IOException, InterruptedException {
	   
	   Thread.sleep(6000); 
	   
	   // Click on Risk Management Map
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   Reporter.log("Click on Risk Management Map | ");
	   Thread.sleep(6000);
	   clickByXpath("html/body/div[4]/div/div/div[3]/button");
	   Thread.sleep(6000);
  }
  
  @Test(priority=189, enabled = true)
  public void Check_ColumnHeader_RiskRatingReport() throws IOException, InterruptedException {
	  
	  Thread.sleep(6000);
	   
	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[1]/span[1]/span", "Scenario Advisory");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[2]/span[1]/span", "Component / Group Name");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
  
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[3]/span[1]/span", "Asset Name(s)");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[4]/span[1]/span", "Threat Source/Event");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[5]/span[1]/span", "Vulnerability");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[6]/span[1]/span", "Likelihood");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[7]/span[1]/span", "Impact");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[8]/span[1]/span", "Rating");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[10]/span[1]/span", "Created Date");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
 	   
 	// Check ColumnHeader
 	   assertEquals("//*[@id='risk-rating-report-table']/thead/tr/th[11]/span[1]/span", "Updated Date");
 	   Reporter.log("Check ColumnHeader | ");
 	   Thread.sleep(3000);
   
  }
			
  @Test(priority=190, enabled = true)
  public void Export_RiskRatingReport() throws InterruptedException {
		  
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
  
  @Test(priority=191, enabled = true)
  public void QuickFilter_RiskRatingReport() throws InterruptedException {
	  
	  		Thread.sleep(3000);
		       
	  		// Click on Scenario Status Filter Button
	        assertTextXpath("//*[@id='advisory-filter']");
	  		clickByXpath("//*[@id='advisory-filter']");
	  		Reporter.log("Click on Filter Button | ");
	  		Thread.sleep(8000);
	  		//Thread.sleep(3000);
	        //Thread.sleep(3000);
       
	  		//Click on Scenario Status Filter Drop-down
	  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
	  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
	  		Reporter.log("Click on Media Drop-down | ");
	  		Thread.sleep(8000);
	  		Thread.sleep(3000);
	  		
	  	// Click on Scenario Status Filter Button
	        assertTextXpath("//*[@id='advisory-filter']");
	  		clickByXpath("//*[@id='advisory-filter']");
	  		Reporter.log("Click on Filter Button | ");
	  		Thread.sleep(8000);
	  		//Thread.sleep(3000);
	        //Thread.sleep(3000);
	  			  		
	  	//Click on Scenario Status Filter Drop-down
	  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
	  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
	  		Reporter.log("Click on Media Drop-down | ");
	  		Thread.sleep(3000);
	  		Thread.sleep(8000);
	  		//Thread.sleep(3000);
	  		
  }
	  
	  @Test(priority=192, enabled = false)
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
		  		assertTextXpath("//div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/ul/li");
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
		  		
		  	
	  }
	  
	  @Test(priority=193, enabled = true)
	  public void Navigate_RiskRatingDetailReport() throws InterruptedException {
			  
			  Thread.sleep(3000);
			  Thread.sleep(3000);				        
			  
			  //Click on Risk Rating Detail Report sub-module
			  clickBylinktext("Risk Rating Detail Report");
			  Reporter.log("Select Risk Rating Detail Report sub-module | ");
			  Thread.sleep(5000);	  
			  Thread.sleep(5000);	 
				Thread.sleep(3000);	  
				Thread.sleep(3000);	
	  }
	  
	  @Test(priority=194, enabled = true)
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
	  
	  @Test(priority=195, enabled = true)
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
	  
	  @Test(priority=196, enabled = true)
	  public void PageLevelHelp_RiskRatingDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	       clickByXpath("//cw-page-help/button");
	       Reporter.log("Click on PageHelp button Icon | ");
	       Thread.sleep(6000);
		    //Thread.sleep(6000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[4]/div/div/div[3]/button");
	       clickByXpath("//div[4]/div/div/div[3]/button");
	       Reporter.log("Click OK Button in PageHelp pop-up window | ");
	       Thread.sleep(1000);
		   // Thread.sleep(6000);
		   
	  }
		
	  @Test(priority=197, enabled = true)
	  public void RiskManagementMap_RiskRatingDetailReport() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000); 
		   
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(6000);
		   clickByXpath("html/body/div[4]/div/div/div[3]/button");
		   Thread.sleep(6000);
	  }
	  
	  @Test(priority=198, enabled = true)
	  public void Check_ColumnHeader_RiskRatingDetailReport() throws IOException, InterruptedException {
		  
		  Thread.sleep(6000);
		   
		// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[1]/span[1]/span", "Scenario Advisory");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[2]/span[1]/span", "Component / Group Name");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	  
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[3]/span[1]/span", "Asset Name(s)");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[4]/span[1]/span", "Threat Source / Event");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[5]/span[1]/span", "Vulnerability");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[6]/span[1]/span", "Likelihood");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[7]/span[1]/span", "Impact");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[8]/span[1]/span", "Rating");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	/*// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[10]/span[1]/span", "Created Date");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[11]/span[1]/span", "Updated Date");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);*/
	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[12]/span[1]/span", "Notes / Answers");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	  }
				
	  @Test(priority=199, enabled = true)
	  public void Export_RiskRatingDetailReport() throws InterruptedException {
			  
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
	  
	  @Test(priority=200, enabled = true)
	  public void QuickFilter_RiskRatingDetailReport() throws InterruptedException {
		  
		  		Thread.sleep(3000);
			       
		  		// Click on Scenario Status Filter Button
		        assertTextXpath("//*[@id='advisory-filter']");
		  		clickByXpath("//*[@id='advisory-filter']");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(8000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
	       
		  		//Click on Scenario Status Filter Drop-down
		  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(8000);
		  		Thread.sleep(3000);
		  		
		  	// Click on Scenario Status Filter Button
		        assertTextXpath("//*[@id='advisory-filter']");
		  		clickByXpath("//*[@id='advisory-filter']");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(8000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
		  		
		  	//Click on Scenario Status Filter Drop-down
		  		assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(8000);
		  		//Thread.sleep(3000);
		  		
	  }
		  
		  @Test(priority=201, enabled = false)
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
			  		assertTextXpath("//div[7]/div/div/div[2]/div/div[2]/div/div/div/div/ul/li/input");
			  		clickByXpath("//div[7]/div/div/div[2]/div/div[2]/div/div/div/div/ul/li/input");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
			  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
			  		Reporter.log("Select value from Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		//click on Media label drop-down
			  		assertTextXpath("//div[7]/div/div/div[2]/div/div[2]/div/div[2]/div/div/ul/li/input");
			  		clickByXpath("//div[7]/div/div/div[2]/div/div[2]/div/div[2]/div/div/ul/li/input");
			  		Reporter.log("Click on Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[2]/div/div[2]/div/div/div/ul/li");
			  		clickByXpath("//div[2]/div/div[2]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		//Click on Assets drop-down
			  		assertTextXpath("//div[7]/div/div/div[2]/div/div[2]/div/div[3]/div/div/ul/li/input");
			  		clickByXpath("//div[7]/div/div/div[2]/div/div[2]/div/div[3]/div/div/ul/li/input");
			  		Reporter.log("Click on Asset Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[3]/div/div/div/ul/li");
			  		clickByXpath("//div[3]/div/div/div/ul/li");
			  		Reporter.log("Select value from Asset Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		// Click on Risk Likelihood drop-down
			  		assertTextXpath("//div[7]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/ul/li/input");
			  		clickByXpath("//div[7]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/ul/li/input");
			  		Reporter.log("Click on Risk Likelihood Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[5]");
			  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[5]");
			  		Reporter.log("Select value from Risk Likelihood Drop-down | ");
			  		Thread.sleep(5000);
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
		  
		  @Test(priority=202, enabled = true)
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
		  
		  @Test(priority=203, enabled = true)
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
		  
		  @Test(priority=204, enabled = true)
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
		  
		  @Test(priority=205, enabled = true)
		  public void PageLevelHelp_AssetInventoryReport() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000);
			   
			   //Click on PageHelp button Icon
			    assertTextXpath("//cw-page-help/button");
		       clickByXpath("//cw-page-help/button");
		       Reporter.log("Click on PageHelp button Icon | ");
		       Thread.sleep(6000);
			    //Thread.sleep(6000);
			    
			    // Click OK Button in PageHelp pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		       clickByXpath("//div[4]/div/div/div[3]/button");
		       Reporter.log("Click OK Button in PageHelp pop-up window | ");
		       Thread.sleep(1000);
			   // Thread.sleep(6000);
			   
		  }
			
		  @Test(priority=206, enabled = true)
		  public void RiskManagementMap_AssetInventoryReport() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000); 
			   
			   // Click on Risk Management Map
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   Reporter.log("Click on Risk Management Map | ");
			   Thread.sleep(6000);
			   clickByXpath("html/body/div[4]/div/div/div[3]/button");
			   Thread.sleep(6000);
		  }
		  
		  @Test(priority=207, enabled = true)
		  public void Check_ColumnHeader_AssetInventoryReport() throws IOException, InterruptedException {
			  
			  Thread.sleep(6000);
			   
			// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[1]/span[1]/span", "Asset ID");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[2]/span[1]/span", "Asset Name");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[3]/span[1]/span", "Status");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		  
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[4]/span[1]/span", "Asset Description");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[5]/span[1]/span", "Type of Sensitive Data");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[6]/span[1]/span", "Media and Storage Devices");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[7]/span[1]/span", "Source of the Sensitive Information");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[8]/span[1]/span", "Where or to Whom the Data is Shared or Sent");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[9]/span[1]/span", "Number of Users");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[10]/span[1]/span", "Physical Location of Asset");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[11]/span[1]/span", "Importance of Asset");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[12]/span[1]/span", "Approximate # of Sensitive Records Stored on this Asset");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		 	   
		 	// Check ColumnHeader
		 	   assertEquals("//*[@id='asset-inventory-table']/thead/tr/th[13]/span[1]/span", "Asset Business Owner");
		 	   Reporter.log("Check ColumnHeader | ");
		 	   Thread.sleep(3000);
		  }
					
		  @Test(priority=208, enabled = true)
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
		  
		  @Test(priority=209, enabled = true)
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
			  		assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/cw-version-selector/div/ul/li/a");
			  		clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/cw-version-selector/div/ul/li/a");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(8000);
			  		Thread.sleep(3000);
			  		
		  }
			  
			  @Test(priority=210, enabled = false)
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
			  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
			  		clickByXpath("//div[2]/div/div/div/ul/li/input");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
			  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
			  		Reporter.log("Select value from Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		//Click on Importance of Asset drop-down
			  		assertTextXpath("//div[2]/div/div/ul/li/input");
			  		clickByXpath("//div[2]/div/div/ul/li/input");
			  		Reporter.log("Click on Importance of Asset Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[2]/div/div/div/ul/li[3]");
			  		clickByXpath("//div[2]/div/div/div/ul/li[3]");
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
				  		
				  	
			  }
			  
			  @Test(priority=211, enabled = true)
			  public void Navigate_RiskResponseDetailReport() throws InterruptedException {
					  
					  Thread.sleep(3000);
					  Thread.sleep(3000);				        
					  
					//Click on Risk Response Detail Report sub-module
						clickBylinktext("Risk Response Detail Report");
						Reporter.log("Select Risk Response Detail Report sub-module | ");
						Thread.sleep(5000);	  
						Thread.sleep(5000);	 
						//Thread.sleep(3000);	  
						//Thread.sleep(3000);	
			  }
			  
			  @Test(priority=212, enabled = true)
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
			  
			  @Test(priority=213, enabled = true)
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
			  
			  @Test(priority=214, enabled = true)
			  public void PageLevelHelp_RiskResponseDetailReport() throws IOException, InterruptedException {
				   
				   Thread.sleep(6000);
				   
				   //Click on PageHelp button Icon
				    assertTextXpath("//cw-page-help/button");
			       clickByXpath("//cw-page-help/button");
			       Reporter.log("Click on PageHelp button Icon | ");
			       Thread.sleep(6000);
				    //Thread.sleep(6000);
				    
				    // Click OK Button in PageHelp pop-up window
				    assertTextXpath("//div[4]/div/div/div[3]/button");
			       clickByXpath("//div[4]/div/div/div[3]/button");
			       Reporter.log("Click OK Button in PageHelp pop-up window | ");
			       Thread.sleep(1000);
				   // Thread.sleep(6000);
				   
			  }
				
			  @Test(priority=215, enabled = true)
			  public void RiskManagementMap_RiskResponseDetailReport() throws IOException, InterruptedException {
				   
				   Thread.sleep(6000); 
				   
				   // Click on Risk Management Map
				   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
				   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
				   Reporter.log("Click on Risk Management Map | ");
				   Thread.sleep(6000);
				   clickByXpath("html/body/div[4]/div/div/div[3]/button");
				   Thread.sleep(6000);
			  }
			  
			  @Test(priority=216, enabled = false)
			  public void Check_ColumnHeader_RiskResponseDetailReport() throws IOException, InterruptedException {
				  
				  Thread.sleep(6000);
				   
				// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[1]/span[1]/span", "Scenario Advisory");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[2]/span[1]/span", "Component / Group Name");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			  
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[3]/span[1]/span", "Asset Name(s)");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[4]/span[1]/span", "Threat Source/Event");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[5]/span[1]/span", "Vulnerability");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[6]/span[1]/span", "Likelihood");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[7]/span[1]/span", "Impact");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[8]/span[1]/span", "Rating");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[10]/span[1]/span", "Created Date");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[11]/span[1]/span", "Updated Date");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			   
			 	// Check ColumnHeader
			 	   assertEquals("//*[@id='risk-rating-table']/thead/tr/th[12]/span[1]/span", "Notes / Answers");
			 	   Reporter.log("Check ColumnHeader | ");
			 	   Thread.sleep(3000);
			 	   
			  }
						
			  @Test(priority=217, enabled = true)
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
			  
			  @Test(priority=218, enabled = true)
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
				  		//Thread.sleep(3000);
			  }
				  
				  @Test(priority=219, enabled = false)
				  public void Filter_RiskResponseDetailReport() throws InterruptedException {
					  
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
				  		assertTextXpath("//div[2]/div/div/ul/li/input");
				  		clickByXpath("//div[2]/div/div/ul/li/input");
				  		Reporter.log("Click on Media label Drop-down | ");
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);
				  		assertTextXpath("//div[2]/div/div/div/ul/li");
				  		clickByXpath("//div[2]/div/div/div/ul/li");
				  		Reporter.log("Select value from Media label Drop-down | ");
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);

				  		//Click on Assets drop-down
				  		assertTextXpath("//div[3]/div/div/ul/li/input");
				  		clickByXpath("//div[3]/div/div/ul/li/input");
				  		Reporter.log("Click on Asset Drop-down | ");
				  		Thread.sleep(3000);
				  		assertTextXpath("//div[3]/div/div/div/ul/li");
				  		clickByXpath("//div[3]/div/div/div/ul/li");
				  		Reporter.log("Select value from Asset Drop-down | ");
				  		Thread.sleep(5000);
				  		//Thread.sleep(3000);  		
				  	    	  		
				  	    // Click on Implementation Planning drop-down
				  		assertTextXpath("//div[2]/div[3]/div/div/ul/li/input");
				  		clickByXpath("//div[2]/div[3]/div/div/ul/li/input");
				  		Reporter.log("Click on Implementation Planning Drop-down | ");
				  		Thread.sleep(3000);
				  		assertTextXpath("//div[2]/div[3]/div/div/div/ul/li[2]");
				  		clickByXpath("//div[2]/div[3]/div/div/div/ul/li[2]");
				  		Reporter.log("Select value from Implementation Planning Drop-down | ");
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);
				  		
				  	    // Click on Action Plan drop-down
				  		assertTextXpath("//div[2]/div[4]/div/div/ul/li/input");
				  		clickByXpath("//div[2]/div[4]/div/div/ul/li/input");
				  		Reporter.log("Click on Action Plan Drop-down | ");
				  		Thread.sleep(3000);
				  		assertTextXpath("//div[4]/div/div/div/ul/li[2]");
				  		clickByXpath("//div[4]/div/div/div/ul/li[2]");
				  		Reporter.log("Select value from Action Plan Drop-down | ");
				  		Thread.sleep(3000);
				  		//Thread.sleep(3000);
				  		
				  	    // Click on Reconciliation Status drop-down
				  		assertTextXpath("//div[2]/div[5]/div/div/ul/li/input");
				  		clickByXpath("//div[2]/div[5]/div/div/ul/li/input");
				  		Reporter.log("Click on Reconciliation Status Drop-down | ");
				  		Thread.sleep(3000);
				  		assertTextXpath("//div[5]/div/div/div/ul/li[2]");
				  		clickByXpath("//div[5]/div/div/div/ul/li[2]");
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
					  		
					  	
				  }
				  
				  @Test(priority=220, enabled = true)
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
				  
				  @Test(priority=221, enabled = true)
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
				  
				  @Test(priority=222, enabled = true)
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
				  
				  @Test(priority=223, enabled = true)
				  public void PageLevelHelp_EnterpriseExtracts() throws IOException, InterruptedException {
					   
					   Thread.sleep(6000);
					   
					   //Click on PageHelp button Icon
					    assertTextXpath("//cw-page-help/button");
				       clickByXpath("//cw-page-help/button");
				       Reporter.log("Click on PageHelp button Icon | ");
				       Thread.sleep(6000);
					    //Thread.sleep(6000);
					    
					    // Click OK Button in PageHelp pop-up window
					    assertTextXpath("//div[4]/div/div/div[3]/button");
				       clickByXpath("//div[4]/div/div/div[3]/button");
				       Reporter.log("Click OK Button in PageHelp pop-up window | ");
				       Thread.sleep(1000);
					   // Thread.sleep(6000);
					   
				  }
					
				  @Test(priority=224, enabled = true)
				  public void RiskManagementMap_EnterpriseExtracts() throws IOException, InterruptedException {
					   
					   Thread.sleep(6000); 
					   
					   // Click on Risk Management Map
					   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
					   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
					   Reporter.log("Click on Risk Management Map | ");
					   Thread.sleep(6000);
					   clickByXpath("html/body/div[4]/div/div/div[3]/button");
					   Thread.sleep(6000);
				  }
				  
				  @Test(priority=225, enabled = true)
					 public void ExportButtons_EnterpriseExtracts () throws InterruptedException, IOException
						   {
					    	  
					 Thread.sleep(5000);
					   	       		   	       		 	      	  			   
							   		  
					  //Click on risk-response-list-button
					  assertTextName("risk-response-list-button");
					  clickByname("risk-response-list-button");
					  Reporter.log("Click on risk-response-list-button | ");
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					  Thread.sleep(8000);
										   
					 //Click on risk-action-Plan-button
					   assertTextXpath("//div[8]/div/input");  
					   clickByXpath("//div[8]/div/input");  	
					   Reporter.log("Click on risk-action-Plan-button | ");
					   Thread.sleep(8000);
					   Thread.sleep(8000);
					  Thread.sleep(8000);
									   	
					  //Click on entity-list-detail-button	 
						assertTextName("entity-list-detail-button"); 
					   	clickByname("entity-list-detail-button");  	
						 Reporter.log("Click on entity-list-detail-button Button | ");
						 Thread.sleep(8000);
						Thread.sleep(8000);
						 Thread.sleep(8000);
									   
						 //Click on user-roles-detail-button
						  assertTextName("user-roles-detail-button");  
						  clickByname("user-roles-detail-button");  	
						  Reporter.log("Click on user-roles-detail-button | ");
						  Thread.sleep(8000);
						  Thread.sleep(8000);
						  Thread.sleep(8000);
											  
						  //Click on asset-inventory-button
						  assertTextName("asset-inventory-button");
						  clickByname("asset-inventory-button");
						  Reporter.log("Clicked on asset-inventory-button | ");
						  Thread.sleep(8000);
						  Thread.sleep(8000);
						  Thread.sleep(8000);
							  			  
						  //Click on risk-rating-detail-button
						  assertTextName("risk-rating-detail-button");
						  clickByname("risk-rating-detail-button");
						  Reporter.log("Click on risk-rating-detail-button | ");
							  Thread.sleep(8000);
							   Thread.sleep(8000);
							  Thread.sleep(8000);
							  
					   }    

}
