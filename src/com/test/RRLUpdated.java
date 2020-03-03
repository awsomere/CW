package com.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RRLUpdated extends WrapperClass{

	  public WebDriver driver;
	  String browser=null;

	@Test(priority=320, enabled =true)
	  public void IRMA8018_NavigatePage_RiskResponseList() throws InterruptedException, IOException {
			
			
			   Thread.sleep(8000);		  
			   
		  //Click on Full screen
    	    assertTextXpath("//*[@id='fullscreen']/i");
			clickByXpath("//*[@id='fullscreen']/i");
			Thread.sleep(5000);

		   //TestCases RRL - 1				
		    //Click on Risk Response Module
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        Reporter.log("Click on Risk Response Module | ");
	        Thread.sleep(8000);
	        //Thread.sleep(6000);
	        //Thread.sleep(6000);
	        //Thread.sleep(6000);
	        
	      //TestCases RRL - 1
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(8000);
	        Thread.sleep(6000); 
		 
     }
	
	@Test(priority=321, enabled =true)
	  public void PageHearder_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(6000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Risk Response List");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=322, enabled = true)
	   public void PanelBar_RiskResponseList() throws IOException, InterruptedException {
			   
		   Thread.sleep(6000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Response Risk Response List");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   // Click on Page breadcrumb
		  // assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 1 of 1 entries");
		   //Reporter.log("Showing 7 of 7 entries");
		 //  Thread.sleep(2000);
		 //("//ol");
		  // Thread.sleep(1000); 
		   
	   }
	   
	 @Test(priority=323, enabled = true)
	 public void PageLevelHelp_RiskResponseList() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(6000);
		  Thread.sleep(6000);
		    
		    // Click OK Button in PageHelp pop-up window
		 assertTextXpath("html/body/div[3]/div/div/div[3]/button");
	     clickByXpath("html/body/div[3]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(6000);
		  Thread.sleep(6000);
		   
	 }
		
	 @Test(priority=324, enabled = true)
	 public void RiskManagementMap_RiskResponseList() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(8000);
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[3]/div/div/div[2]/button");
		   Thread.sleep(6000);
	 }
	 
	 @Test(priority=325, enabled =true)
	  public void RiskRatingConditions_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);

		//TestCases RRL - 3
		 //RiskRating Conditions
		 mouseHoverByXpath("//*[@id='risk_1']/td[8]/div/div/span");
		   Thread.sleep(6000);
	
		 
	 }
	 @Test(priority=326, enabled =true)
	  public void IRMA7839_GetRiskThersoldValue_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 
		 //Select the Framing/Governance module at sidebar-left
	     assertTextXpath("//*[@id='sidebar-left']/ul/li[2]/a/span[2]");
		 clickByXpath("//*[@id='sidebar-left']/ul/li[2]/a/span[2]");  	
		 Reporter.log("Selected the Framing/Governance module at sidebar-left | ");
		 Thread.sleep(5000);
		 Thread.sleep(2000);
		 
		 //Select RiskThreshold Sub-module
		 assertTextLink("Risk Threshold");
		 clickBylinktext("Risk Threshold");
		 Reporter.log("Selected RiskThreshold Sub-module | ");
		 Thread.sleep(5000);
		 Thread.sleep(2000);	 
	
		  // Click on Risk Thereshold value
		  assertEquals("//*[@id='control-type']/div/div[1]/b", "12");
		  Thread.sleep(5000);
		  
	 }
	 
	 @Test(priority=327, enabled =true)
	  public void IRMA8418_RiskRatingCompare_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 
		   //TestCases RRL - 1				
		    //Click on Risk Response Module
		 assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	     clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	     Reporter.log("Click on Risk Response Module | ");
	     Thread.sleep(8000);
	     //Thread.sleep(6000);
	     //Thread.sleep(6000);
	     //Thread.sleep(6000);
	     
	   //TestCases RRL - 1
	     //Click on Risk Response List Sub-module
	     assertTextLink("Risk Response List");
	     clickBylinktext("Risk Response List");
	     Reporter.log("Click on Risk Response List Sub-module | ");
	     Thread.sleep(8000);
	     Thread.sleep(6000); 
	     
		/*//TestCases RRL - 3
	    // Check the Rating Vaue with Risk Thereshold value
		  assertEquals("//*[@id='risk_0']/td[8]/div/div/span", "12");
		  Thread.sleep(5000);
		 mouseHoverByXpath("//*[@id='risk_0']/td[8]/div/div/span");
		   Thread.sleep(6000);
	
		 //TestCases RRL - 3
		 //RiskRating Conditions
		 mouseHoverByXpath("//*[@id='risk_1']/td[8]/div/div/span");
		 Thread.sleep(6000);*/
		 
	 }
	 
	 @Test(priority=328, enabled =true)
	  public void IRMA8037_IRMA9517_VulnerabilityLink_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 
		 Thread.sleep(6000);
		  //Click on Vulnerability link
		  GetText("//*[@id='risk_0']/td[7]/a");
		  Thread.sleep(3000);
		  clickByXpath("//*[@id='risk_0']/td[7]/a");
		  Thread.sleep(5000);
		  Thread.sleep(8000);
		  
		  //Click on Vulnerability link
		  assertEquals("//*[@id='uniqueMedia']/tbody/tr/td[7]",Expvalue);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
	 }
	 
	 @Test(priority=329, enabled =true)
	  public void IRMA8817_RecordsDisplayed_Expand_RiskResponseList() throws InterruptedException, IOException {
		
	
		//TestCases RRL - 1				
		    //Click on Risk Response Module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	     clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	     Reporter.log("Click on Risk Response Module | ");
	     Thread.sleep(8000);
	     Thread.sleep(6000);

	     clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
		    Thread.sleep(8000);
	        Thread.sleep(6000);
	     
	   //TestCases RRL - 1
	     //Click on Risk Response List Sub-module
	     assertTextLink("Risk Response List");
	     clickBylinktext("Risk Response List");
	     Reporter.log("Click on Risk Response List Sub-module | ");
	     Thread.sleep(8000);
	     Thread.sleep(6000); 
    
		    
		 Thread.sleep(8000);
		//Click on Minimize sidebar
	        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000); 
		 
	        //TestCases RRL - 7
		//Expand the TBO 
		 assertTextXpath("//*[@id='risk_1']/td[1]/span");
		   clickByXpath("//*[@id='risk_1']/td[1]/span");
		   Reporter.log("Expand the TBO | ");
		   Thread.sleep(6000);
		  
		   ArrowDown();
		   ArrowDown();
		   ArrowDown();
		   ArrowDown();
		   Thread.sleep(8000);
		   
	 }
	 
	 @Test(priority=330, enabled =true)
	  public void ChkFields_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
			
		 // Check on Risk Treatment Type
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[1]/label", "Risk Treatment Type");
		  Thread.sleep(5000);
		
		// Check on Risk Owner
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[2]/label", "Risk Owner");
		  Thread.sleep(5000);
		  
		// Check on Risk Notes
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[3]/label", "Risk Notes");
		  Thread.sleep(5000);
		  
		// Check on Status
		   assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[4]/label", "Risk Status");
		  Thread.sleep(5000);
		  
		// Check on Approved?
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[2]/div/div/div/div[2]/table/tbody/tr[1]/td/label", "Approved?");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[9]", "Action");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[10]", "Global");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[16]", "Implementation Manager");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[17]", "Due Date");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[18]", "Implemented Date");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[19]", "Clear");
		  Thread.sleep(5000);
		  
		  //Click on Treat Evaluate
		  clickByXpath("//*[@id='tab_selector_treatEvaluate']");
		   Reporter.log("Expand the TBO | ");
		   Thread.sleep(5000);
	
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[6]", "Effectiveness");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[7]", "Estimated Cost");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[8]", "Feasibility");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[9]", "Action");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[10]", "Global");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[19]", "Clear");
		  Thread.sleep(5000);
		  
		  //Click on RiskAction Plan
		  clickByXpath("//*[@id='tab_selector_riskActionPlan']");
		   Reporter.log("Expand the TBO | ");
		   Thread.sleep(5000);
		
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[12]", "Description");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[13]", "Plan for Monitoring Effectiveness");
		  Thread.sleep(5000);
		  
		// Check on 
		  assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[1]/th[14]", "Plan Status / Priority");
		  Thread.sleep(5000);
		  
		
	 }
		   
		
		@Test(priority=331, enabled =true)
	   public void IRMA9484_RiskTreatment_RiskResponseList() throws InterruptedException, IOException {
				
		
		   //TestCases RRL - 8
		 //Click on Risk Treatment Type drop-down
		 assertTextXpath("//td/div/div/button");
		 clickByXpath("//td/div/div/button");
		 Reporter.log("Click on Risk Treatment Type drop-down | ");
		 Thread.sleep(6000);
	   
		 //---------------------------------------------- 9484
	      //Select the option from drop-down
		 	assertTextXpath("//td/div/div/ul/li[4]/a");
		   clickByXpath("//td/div/div/ul/li[4]/a");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(6000);
	 }
	 
	 @Test(priority=332, enabled =true)
	  public void RiskOwner_RiskResponseList() throws InterruptedException, IOException {
		
		   
		 //Click on Risk Owner Type drop-down
		   assertTextXpath("//td[2]/div/ul/li/div/button");
		   clickByXpath("//td[2]/div/ul/li/div/button");
		   Reporter.log("Click on Risk Owner Type drop-down | ");
		   Thread.sleep(6000);
		   
		   // Enter the value
		    assertTextXpath("//div/input");
		    sendvaluebyxpath("//div/input", "Uma M");
		    Reporter.log("Enter the value | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);	
		   
		   //Select the option from drop-down
		   assertTextXpath("//li/div/ul/li[6]/a");
		   clickByXpath("//li/div/ul/li[6]/a");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(8000);
		   
		   
	 }
	 
	 @Test(priority=333, enabled =true)
	  public void IRMA9288_EmailArrowIcon_RiskResponseList() throws InterruptedException, IOException {
		
		   //-----------------------------------------9288
		 //Click on Email Arrow Icon
		   assertTextXpath("//li[2]/span/i");
		   clickByXpath("//li[2]/span/i");
		   Reporter.log("Click on Email Arrow Icon| ");
		   Thread.sleep(6000);
		   Thread.sleep(8000);
		   
		   //Click on Close Button
		   assertTextXpath("html/body/div[4]/div/div/div[1]/button");
		   clickByXpath("html/body/div[4]/div/div/div[1]/button");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
	 }
	 
	 @Test(priority=334, enabled = false)
	  public void IRMA9461_DeleteNotes_RiskResponseList() throws InterruptedException, IOException {
		
	 //-----------------------------------9461
		   // Click on Notes button 
			  assertTextXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[1]/div/div/div[2]/table/tbody/tr[2]/td[3]/div/a");
			  clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[1]/div/div/div[2]/table/tbody/tr[2]/td[3]/div/a");
			  Reporter.log("Click on Notes button | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);
			  
			  // Click on New Button in Notes pop-up window
			  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
			  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
			  Reporter.log("Click on New Button in Notes pop-up window | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);
			  
			  // Enter some text in notes Editor 
			  assertTextXpath("//*[@id='DTE_Field_text']");
			  sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample notes");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);
			  
			  // Click on Create Button in Create Note pop-up window
			
			  assertTextXpath("//div[4]/div[3]/button[2]");
			  clickByXpath("//div[4]/div[3]/button[2]");
			  Reporter.log("Click on Create Button in Create Note pop-up window | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);
			  
			  //Click on listed Notes
			  clickByXpath("//*[@id='note-details-table']/tbody/tr/td[2]");
			  Reporter.log("Click on Create Button in Create Note pop-up window | ");
			  Thread.sleep(8000);
						  
			// Click on Delete buton
			  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[3]");
			  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[3]");
			  Reporter.log("Click on Create Button in Create Note pop-up window | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);		
			  
			// Click on Delete buton in pop-up
			  assertTextXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
			  clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
			  Reporter.log("Click on Create Button in Create Note pop-up window | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);	
			  
			   //Click on Close button in popup
			    //assertTextXpath("//div[5]/div/div/div[3]/button");
			  clickBycssSelector(".modal-footer > .pull-right");
			    Reporter.log("Click on Close button in popup | ");
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    
			    
	 }
	 
	
	   @Test(priority=335, enabled =true)
	  public void Action_RiskResponseList() throws InterruptedException, IOException {
			   
		 Thread.sleep(8000);
		 
		 ArrowDown();
		   ArrowDown();
		   Thread.sleep(8000);
		   
		 // Click on Treat & Evaluate
		   assertEquals("//div[2]/ul/li/a/span", "Simple");
		   Reporter.log("Click on Treat & Evaluate | ");
		   Thread.sleep(5000);
		   clickByXpath("//div[2]/ul/li/a/span");
		   Reporter.log("Select the Treat & Evaluate | ");
		   Thread.sleep(8000);
		   
		   //Click on Action drop-down
			 assertTextXpath("//td[9]/div/div/button");
			 clickByXpath("//td[9]/div/div/button");
			 Reporter.log("Click on Action drop-down | ");
			 Thread.sleep(6000);
		   
		      //Select the option from drop-down
			 	assertTextXpath("//td[9]/div/div/ul/li[2]/a");
			   clickByXpath("//td[9]/div/div/ul/li[2]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   
	 }
	 
	 @Test(priority=336, enabled =true)
	  public void Global_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(6000);
		 
			 //Click on Global Checkbox
			   assertTextXpath("//td[10]/div/label");
			   clickByXpath("//td[10]/div/label");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(8000);
			   Thread.sleep(4000);
			   
			   //Click on yes button
			   clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(6000);
			   
	 }
	 @Test(priority=337, enabled =true)
	  public void ImplementationManager_RiskResponseList() throws InterruptedException, IOException {
		
		        Thread.sleep(6000);	 
			 //Click on Implementation Manager drop-down
		        
			   assertTextXpath("//td[16]/div/div/ul/li/div/button");
			   clickByXpath("//td[16]/div/div/ul/li/div/button");
			   Reporter.log("Click on Implementation Manager drop-down | ");
			   Thread.sleep(6000);
			  
			// Enter the value
     		    assertTextXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[16]/div[1]/div/ul/li[1]/div/ul/li[4]/div/input");
			    sendvaluebyxpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[16]/div[1]/div/ul/li[1]/div/ul/li[4]/div/input", "Uma M");
			    Reporter.log("Enter the value | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);	
			 			   
			  //Select the option from drop-down
				   //assertTextXpath("//li/div/ul/li[6]/a");
			    clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[16]/div[1]/div/ul/li[1]/div/ul/li[6]");
				   Reporter.log("Select the option from drop-down | ");
				   Thread.sleep(8000);
			   Thread.sleep(8000);
			   
	 }
	 
	 @Test(priority=338, enabled =true)
	  public void ArrowIcon_RiskResponseList() throws InterruptedException, IOException {
		
		   
		 //Click on Email Arrow Icon
		   assertTextXpath("//td[16]/div/div/ul/li[2]/span/i");
		   clickByXpath("//td[16]/div/div/ul/li[2]/span/i");
		   Reporter.log("Click on Email Arrow Icon| ");
		   Thread.sleep(8000);
		   Thread.sleep(2000);
		 
		   //Click on Close Button
		   assertTextXpath("html/body/div[4]/div/div/div[1]/button");
		   clickByXpath("html/body/div[4]/div/div/div[1]/button");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
		   
	 }
	 
	 
	 @Test(priority=339, enabled =true)
	  public void IRMA8215_Date_RiskResponseList() throws InterruptedException, IOException {
		 
		        Thread.sleep(6000);
		   
		        // Enter the Due date value
		                             
		      
		        clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[17]/div[1]/div/div[2]/label/i");
		        Thread.sleep(3000);
		        clickBylinktext("24");		        
			    Reporter.log("Enter the Date value | ");
			    Thread.sleep(8000);
			    //clickByXpath("//div[2]/ul/li/a/span");
			    Thread.sleep(8000);	
			    
			 // Enter the Completed value
			    clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[18]/div/cw-date-field/div[2]/label/i");
			    Thread.sleep(3000);
			    clickBylinktext("19");
			    Reporter.log("Enter the Date value | ");
			    Thread.sleep(8000);
			    //clickByXpath("//div[2]/ul/li/a/span");
			    Thread.sleep(8000);	
			    
	 }
	 
	       @Test(priority=340, enabled =false)
	       public void SimpleNotes_RiskResponseList() throws InterruptedException, IOException {
			    
	    	   Thread.sleep(8000);	
	    	   
			    // Click on Notes button
				  assertTextXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[20]/ul/li[1]/div[2]/a");
				  clickByXpath("//tbody[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[20]/ul/li/div/a/strong");
				  Reporter.log("Click on Notes button | ");
				  Thread.sleep(8000);
				  //Thread.sleep(3000);
				  
				  // Click on New Button in Notes pop-up window
				  assertTextXpath("//div[@id='note-details-table_wrapper']/div/div/div/a/span");
				  clickByXpath("//div[@id='note-details-table_wrapper']/div/div/div/a/span");
				  Reporter.log("Click on New Button in Notes pop-up window | ");
				  Thread.sleep(8000);
				  //Thread.sleep(3000);
				  
				  // Enter some text in notes Editor 
				  assertTextXpath("//*[@id='DTE_Field_text']");
				  sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample notes");
				  Reporter.log("Enter some text in notes Editor | ");
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  
				  // Click on Create Button in Create Note pop-up window
				  assertTextXpath("//div[4]/div[3]/button");
				  clickByXpath("//div[4]/div[3]/button");
				  Reporter.log("Click on Create Button in Create Note pop-up window | ");
				  Thread.sleep(8000);
				  //Thread.sleep(3000);
				  
				   //Click on Close button in popup
				    //assertTextXpath(".modal-footer > .pull-right");
				    clickBycssSelector(".modal-footer > .pull-right");
				    Reporter.log("Click on Close button in popup | ");
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(6000);
	 }
	 
	 @Test(priority=341, enabled =false)
	  public void SimpleDocuments_RiskResponseList() throws InterruptedException, IOException {
		
		 
		// Click on Document button 
		  assertTextXpath("//a/a/i");
		  clickByXpath("//a/a/i");
		  Reporter.log("Click on Documents button | ");
		  Thread.sleep(8000);
		  //Thread.sleep(3000);
		  
		  //Click on New button from document pop-up
		    assertTextXpath("//div/a/span");
		    clickByXpath("//div/a/span");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(8000);
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    Reporter.log("Click on Choose File from document pop-up | ");
		    Thread.sleep(3000);
		    
		    // Using AutoIT
	     Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	     Reporter.log("Given Filepath of pdf file | ");
	     Thread.sleep(8000);
	     Thread.sleep(3000);
	     
	     //Click on Upload button from document pop-up
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Upload button from document pop-up | ");
		    Thread.sleep(5000);
		    Thread.sleep(6000);
	   
		  
		    // Click on Close button		  
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on CLose Button | ");
		    Thread.sleep(8000); 
		    Thread.sleep(3000);
	 }
	 
	 @Test(priority=342, enabled =true)
	  public void IRMA8387_IRMA7781_AddControlTag_RiskResponseList() throws InterruptedException, IOException {
			   
		 Thread.sleep(8000);
		 //Click on Control tag
		 clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[4]/cw-tag/a/span/i");
		    Reporter.log("Click on CLose Button | ");
		    Thread.sleep(8000); 
		    
		    //Click on Close button for Count verification
		    clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		    Reporter.log("Click on CLose Button | ");
		    Thread.sleep(8000);		
	 }
	 
	 
	   @Test(priority=343, enabled =true)
	   public void AddedCustomControls_RiskResponseList() throws InterruptedException, IOException {
				 
		   Thread.sleep(6000);
		   //Check the CustomControls Button
		   assertEquals("//div[3]/div/div[2]/div/div/div/span", "Add a Custom Control or Recommendation");
		   Thread.sleep(8000);
		   
		    // Click on Add a Custom Control textbox		  
		    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    clickByXpath("//div[3]/div/div[2]/div/div/div/span");
		    Reporter.log("Click on Add a Custom Control tetbox| ");
		    Thread.sleep(2000); 

	    // Enter the New Custom Control
		    clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[1]/input");
		    sendvaluebyxpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div[1]/input", "RRLControls");
		    Reporter.log("Enter the New Custom Controls| ");
		    Thread.sleep(5000); 

		    // Click from listed add custom controls		  
		    //doubleclickbyXpath("//td/div/div/div/div[2]");
		    ArrowDown();
		    enter();
		    //clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div/div");
		    Reporter.log(" Click from listed add custom controls | ");
		    Thread.sleep(8000); 
		    Thread.sleep(8000); 
		    Thread.sleep(8000); 
		    Thread.sleep(8000); 
	 }
	 
	 @Test(priority=344, enabled =true)
	  public void IRMA8028_MultiSelectCheckBox_Action_RiskResponseList() throws InterruptedException, IOException {
			
		 Thread.sleep(8000); 
		 
		//Select the MultiSelect Checkbox
		
		 	assertTextXpath("//th[21]/div/label");
		   clickByXpath("//th[21]/div/label");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(6000);
	 
		//Click on Action drop-down
		 assertTextXpath("//td[5]/div/div/button");
		 clickByXpath("//td[5]/div/div/button");
		 Reporter.log("Click on Action drop-down | ");
		 Thread.sleep(6000);
	   
	      //Select the option from drop-down
		 	assertTextXpath("//td[5]/div/div/ul/li[2]/a");
		   clickByXpath("//td[5]/div/div/ul/li[2]/a");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(6000);
		   Thread.sleep(8000); 
		    Thread.sleep(8000); 
	 }
	 
	 @Test(priority=345, enabled =true)
	  public void MultiSelectCheckBox_ImplementationManager_RiskResponseList() throws InterruptedException, IOException {
			
		 Thread.sleep(6000);
	     //Click on Implementation Manager drop-down
		   assertTextXpath("//td[12]/div/div/ul/li/div/button");
		   clickByXpath("//td[12]/div/div/ul/li/div/button");
		   Reporter.log("Click on Implementation Manager drop-down | ");
		   Thread.sleep(8000);
		   
		// Enter the value
		  clickByXpath("//input[@placeholder='search for existing users']");
		   Thread.sleep(3000);	
		    sendvaluebyxpath("//input[@placeholder='search for existing users']", "Uma M");
		    Reporter.log("Enter the value | ");
		    Thread.sleep(8000);
		    Thread.sleep(2000);			 			
		    
		   //Select the option from drop-down
		    clickByXpath("//div[@class='panel-body risk-response-list-body']//li[7]");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   Thread.sleep(8000); 
		    Thread.sleep(8000); 
	 }
	 
	 @Test(priority=346, enabled =true)
	  public void MultiSelectCheckBox_Date_RiskResponseList() throws InterruptedException, IOException {
			
		 Thread.sleep(6000);
		 
				   // Enter the Date value

		             clickByXpath("//*[@id='batch_due_date_simple_']");
		             Thread.sleep(4000); 
		             clickBylinktext("23");
				    Reporter.log("Enter the Date value | ");
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				   // clickByXpath("//div[2]/ul/li/a/span");
				    Thread.sleep(8000);	
				    
				    
				   //Enter the Completed value
				    clickByXpath("//*[@id='batch_completion_date_simple_']");
				    Thread.sleep(4000); 
				    clickBylinktext("19");
				    Reporter.log("Enter the Date value | ");
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				   // clickByXpath("//div[2]/ul/li/a/span");
				    Thread.sleep(8000);	
				    
				  //Close Multi select
				 	assertTextXpath("//th[21]/div/label");
				   clickByXpath("//th[21]/div/label");
				   Reporter.log("Select the option from drop-down | ");
				   Thread.sleep(6000);
				  Thread.sleep(8000);	
				    Thread.sleep(8000); 	  
				  
	 }
	 @Test(priority=347, enabled =false)
	  public void IRMA8323_CustomControlNotesDocCounts_RiskResponseList() throws InterruptedException, IOException {
				 	
		 Thread.sleep(8000); 
	 
		// Click on Page breadcrumb
		   assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[4]/td[20]/ul/li[1]/div[2]/a", "0");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(5000);
		   
		// Click on Page breadcrumb
		   assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[4]/td[20]/ul/li[2]/a[2]/a/strong", "0");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(5000);
	 }
	 
	 @Test(priority=348, enabled =true)
	  public void ViewRelateComponentGroupsLink_SimpleTab_RiskResponseList() throws InterruptedException, IOException {
				 	
		 Thread.sleep(8000); 
		// Click on Page breadcrumb
		   assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[3]/div[2]/a", "View related Component Groups");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(5000);
		   
		    //Click on ViewRelateComponentGroupsLink
		   clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[3]/div[2]/a");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Close the ViewRelateComponentGroups popup
		   clickByXpath("html/body/div[4]/div/div/div[1]/button");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Click on Second ViewRelateComponentGroupsLink
	   clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[4]/td[3]/div[2]/a");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Close the ViewRelateComponentGroups popup
		   clickByXpath("html/body/div[4]/div/div/div[1]/button");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
	 }
	 
	
	 
	 
	 @Test(priority=349, enabled =true)
	  public void ResidualRiskLikelihood_RiskResponseList() throws InterruptedException, IOException {
				 	
		 Thread.sleep(8000); 	  
		  			   
			 //Click on RiskLikelihood drop-down
			   assertTextXpath("//td[2]/div/div/button");
			   clickByXpath("//td[2]/div/div/button");
			   Reporter.log("Click on RiskLikelihood drop-down | ");
			   Thread.sleep(6000);
			   
			   //Select the option from drop-down
			   assertTextXpath("//td[2]/div/div/ul/li[4]/a");
			   clickByXpath("//td[2]/div/div/ul/li[4]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   
			   
	 }
	 
	 @Test(priority=350, enabled =true)
	  public void ResidualRiskImpact_RiskResponseList() throws InterruptedException, IOException {
				 	
		 Thread.sleep(8000); 
			   
			   
			   //Click on RiskImpact drop-down
			   assertTextXpath("//td[3]/div/div/button");
			   clickByXpath("//td[3]/div/div/button");
			   Reporter.log("Click on RiskImpact drop-down | ");
			   Thread.sleep(6000);
			   
			   //Select the option from drop-down
			   assertTextXpath("//td[3]/div/div/ul/li[5]/a");
			   clickByXpath("//td[3]/div/div/ul/li[5]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(8000);
			   Thread.sleep(5000);
			   
	 }
		
	
     @Test(priority=351, enabled =true)
	  public void ApproveCheckBox_RiskResponseList() throws InterruptedException, IOException {
							 
					
		       Thread.sleep(8000);
			   
			   //Select the Approve checkbox
			   assertTextXpath("//div/label");
			   clickByXpath("//div/label");
			   Reporter.log("Select the Approve checkbox | ");
			   Thread.sleep(6000);
			   
	 }
	 
	 @Test(priority=352, enabled =true)
	  public void TreatEvaluate_RiskResponseList() throws InterruptedException, IOException {
			   
		 Thread.sleep(8000);
		 
			   // Click on Treat & Evaluate
			   assertEquals("//div[2]/ul/li[2]/a/span", "Treat & Evaluate *");
			   Reporter.log("Click on Treat & Evaluate | ");
			   Thread.sleep(5000);
			   clickByXpath("//div[2]/ul/li[2]/a/span");
			   Reporter.log("Select the Treat & Evaluate | ");
			   Thread.sleep(8000);
			   
			  //Click on Effectiveness drop-down
			   assertTextXpath("//td[6]/div/div/button");
			   clickByXpath("//td[6]/div/div/button");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(6000);
			   	
			   //Select the option from drop-down
			   assertTextXpath("//td[6]/div/div/ul/li[3]/a");
			   clickByXpath("//td[6]/div/div/ul/li[3]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   	
			 //Click on Feasibility drop-down
			   assertTextXpath("//td[8]/div/div/button");
			   clickByXpath("//td[8]/div/div/button");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(6000);
			   	
			   //Select the option from drop-down
			   assertTextXpath("//td[8]/div/div/ul/li[3]/a");
			   clickByXpath("//td[8]/div/div/ul/li[3]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   
			   // Enter the value
			    assertTextXpath("//td[7]/div/input");
			    sendvaluebyxpath("//td[7]/div/input", "2101");
			    Reporter.log("Enter the value | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);	
			   	
			    
	 }
	 
	 @Test(priority=353, enabled =true)
	  public void ViewRelateComponentGroupsLink_TreatEvaluate_RiskResponseList() throws InterruptedException, IOException {
				 	
		 Thread.sleep(8000); 
		// Click on Page breadcrumb
		   assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[3]/div[2]/a", "View related Component Groups");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(5000);
		   
		  
		   //Click on ViewRelateComponentGroupsLink
		   clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[3]/div[2]/a");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Close the ViewRelateComponentGroups popup
		   clickByXpath("html/body/div[4]/div/div/div[1]/button");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Click on Second ViewRelateComponentGroupsLink
	   clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[4]/td[3]/div[2]/a");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Close the ViewRelateComponentGroups popup
		   clickByXpath("//div[4]/div/div/div/button");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
	 }
	 
	 @Test(priority=354, enabled =true)
	  public void RiskAction_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 
			   // Click on Risk Action Plan *
			    assertEquals("//div[2]/ul/li[3]/a/span", "Risk Action Plan *");
			    Reporter.log("Click on Risk Action Plan | ");
			    Thread.sleep(5000);
			    clickByXpath("//div[2]/ul/li[3]/a/span");
			    Reporter.log("Select the Risk Action Plan | ");
			    Thread.sleep(8000);
			    
			 // Enter Text for Description textarea
			    assertTextXpath("//td[12]/div/textarea");
			    sendvaluebyxpath("//td[12]/div/textarea", "Description");
			    Reporter.log("Enter Text for Note textarea | ");
			    Thread.sleep(8000);
			    //Thread.sleep(8000);
			    
			 // Enter Text for Plans  textarea
			    assertTextXpath("//td[13]/div/textarea");
			    sendvaluebyxpath("//td[13]/div/textarea", "Plans");
			    Reporter.log("Enter Text for Note textarea | ");
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    
			    //Click on Enhance drop-down
			    assertTextXpath("//td[14]/div/div/div/div/button");
			    clickByXpath("//td[14]/div/div/div/div/button");
			    Reporter.log("Click on Action drop-down | ");
			    Thread.sleep(6000);
			    	
				//Select the option from drop-down
			    assertTextXpath("//td[14]/div/div/div/div/ul/li[2]/a");
			    clickByXpath("//td[14]/div/div/div/div/ul/li[2]/a");
				Reporter.log("Select the option from drop-down | ");
				Thread.sleep(6000);
				
				/*// Enter the Date value
			    assertTextXpath("//td[14]/div/div[2]/cw-date-field/div/input");
			    sendvaluebyxpath("//td[14]/div/div[2]/cw-date-field/div/input", "12/12/2018");
			    Reporter.log("Enter the Date value | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);	
			    
			 // Enter the value
			    assertTextXpath("//td[15]/div/div[2]/cw-date-field/div/input");
			    sendvaluebyxpath("//td[15]/div/div[2]/cw-date-field/div/input", "15/12/2018");
			    Reporter.log("Enter the Date value | ");
			    Thread.sleep(8000);
			    Thread.sleep(5000);	*/
			    
	 }
	 

 
 
 
	 @Test(priority=355, enabled =true)
	  public void ViewRelateComponentGroupsLink_RiskAction_RiskResponseList() throws InterruptedException, IOException {
				 	
		 Thread.sleep(8000); 
		// Click on Page breadcrumb
		   assertEquals("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[3]/div[2]/a", "View related Component Groups");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(5000);
		   
		  
		   //Click on ViewRelateComponentGroupsLink
		   clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[3]/td[3]/div[2]/a");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Close the ViewRelateComponentGroups popup
		   clickByXpath("html/body/div[4]/div/div/div[1]/button");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Click on Second ViewRelateComponentGroupsLink
	   clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[3]/div/div[2]/table/tbody/tr[4]/td[3]/div[2]/a");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   //Close the ViewRelateComponentGroups popup
		   clickByXpath("//div[4]/div/div/div/button");
		   Thread.sleep(8000);
		   Thread.sleep(5000);
	 }
	
	
	 @Test(priority=356, enabled =true)
	  public void Reconcilation_RiskResponseList() throws InterruptedException, IOException {
	
		 Thread.sleep(6000);
		 
			 //Click on RiskLikelihood drop-down
			   assertTextXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td/div/div/button");
			   clickByXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td/div/div/button");
			   Reporter.log("Click on RiskLikelihood drop-down | ");
			   Thread.sleep(6000);
			   
			   //Select the option from drop-down
			   assertTextXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td/div/div/ul/li[4]/a");
			   clickByXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td/div/div/ul/li[4]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(8000);
			   Thread.sleep(8000);
			   		   
			   //Click on RiskImpact drop-down
			   assertTextXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]/div/div/button");
			   clickByXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]/div/div/button");
			   Reporter.log("Click on RiskImpact drop-down | ");
			   Thread.sleep(6000);
			   
			   //Select the option from drop-down
			   assertTextXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]/div/div/ul/li[5]/a");
			   clickByXpath("//div[2]/div/div/div[2]/table/tbody/tr[2]/td[2]/div/div/ul/li[5]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(8000);
			   Thread.sleep(8000);

	 }
	 
	 @Test(priority=357, enabled =false)
	  public void IRMA8636_MouseHoverOnResidualRiskRating_RiskResponseList() throws InterruptedException, IOException {
				 	
		 Thread.sleep(8000); 
		
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
  		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 Thread.sleep(8000);
		 Thread.sleep(8000);
	 
		 //Expand the TBO 
		   assertTextXpath("//tr[3]/td/span");
		   clickByXpath("//tr[3]/td/span");
		   Reporter.log("Expand the TBO | ");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
		 //Mousehover on Rating values
		 mouseHoverByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div[2]/table/tbody/tr[2]/td[5]/div/div/div/span");
		 Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		 //Clear the Rating values
		 clickByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div[2]/table/tbody/tr[2]/td[4]/span");
		 Thread.sleep(8000);
		   Thread.sleep(5000);
		   
		   Thread.sleep(8000); 	  
			   
			 //Click on RiskLikelihood drop-down
			   assertTextXpath("//td[2]/div/div/button");
			   clickByXpath("//td[2]/div/div/button");
			   Reporter.log("Click on RiskLikelihood drop-down | ");
			   Thread.sleep(6000);
			   
			   //Select the option from drop-down
			   assertTextXpath("//td[2]/div/div/ul/li[3]/a");
			   clickByXpath("//td[2]/div/div/ul/li[3]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   
			 //Click on RiskImpact drop-down
			   assertTextXpath("//td[3]/div/div/button");
			   clickByXpath("//td[3]/div/div/button");
			   Reporter.log("Click on RiskImpact drop-down | ");
			   Thread.sleep(6000);
			   
			   //Select the option from drop-down
			   assertTextXpath("//td[3]/div/div/ul/li[6]/a");
			   clickByXpath("//td[3]/div/div/ul/li[6]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(8000);
			   Thread.sleep(5000);
			   
				 //Mousehover on Rating values
				 mouseHoverByXpath("//*[@id='content']/tr[4]/td/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div[2]/table/tbody/tr[2]/td[5]/div/div/div/span");
				 Thread.sleep(8000);
				   Thread.sleep(5000);
				   
				  
     
	 }
	 
	 @Test(priority=358, enabled =true)
	  public void ChkEachFields_RiskResponseList() throws InterruptedException, IOException {
		 
		 Thread.sleep(8000);
		 
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 Thread.sleep(8000);
		 
		//Expand the TBO
		   clickByXpath("//tr[3]/td/span");
		   Reporter.log("Expand the TBO | ");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
			 ArrowUp();
			 ArrowUp();
			 ArrowUp();
			 ArrowUp();
			 Thread.sleep(8000);
			 Thread.sleep(8000);
		 
		 
       //Click on Include/Hide Accepted Filter drop-down
     assertTextXpath("//*[@id='risk_treatment_accepted']");
     Thread.sleep(2000);
     
	   //Click on My Risk Filter drop-down
     assertTextXpath("//*[@id='show_my_risks']");
     Thread.sleep(2000);
     
	    // Click on Filter Button 
	    assertTextXpath("//cw-filter/div/span/i");
	    Thread.sleep(2000);
	    
	  	//Click on Export Button
	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
	    Thread.sleep(8000);
}
	 
	 
	 @Test(priority=359, enabled =true)
	  public void QuickFilter_RiskResponseList() throws InterruptedException, IOException {
		
		/*//Click on Edit Mode Filter drop-down
 	     clickByXpath("//*[@id='edit']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/div/ul/li[2]");
 	     Thread.sleep(3000);
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='edit']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/div/ul/li[1]");
 	     Thread.sleep(3000);
	     Thread.sleep(8000);*/
	     
	 	//Click on Include/Hide Accepted Filter drop-down
 	     clickByXpath("//*[@id='risk_treatment_accepted']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
 	     Thread.sleep(8000);
 	    Thread.sleep(5000);
 	     clickByXpath("//*[@id='risk_treatment_accepted']");
 	    Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");
 	     Thread.sleep(8000);
	     Thread.sleep(5000);
	     
		 //Click on My Risk Filter drop-down
 	     clickByXpath("//*[@id='show_my_risks']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
 	     Thread.sleep(8000);
	     Thread.sleep(3000);

	}
	

	@Test(priority=360, enabled =false)
	  public void Filter_RiskResponseList() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
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
		Thread.sleep(8000);
		Thread.sleep(2000);
		//Thread.sleep(3000);

		/*//Click on Media Drop-down
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
*/
		/*//click on Media label drop-down
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
*/
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
		Thread.sleep(8000); 
		//Thread.sleep(3000);   
		//Thread.sleep(3000);   
    
    
		/*//Click on 'Clear Filter' Button 
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
		Thread.sleep(8000);*/
		
	}
	
	@Test(priority=361, enabled =true)
	  public void Export_RiskResponseList() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		Thread.sleep(2000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(8000);
		  // Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(8000);
		 // Thread.sleep(8000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(8000);
		  //Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(8000);
		 
	}
	
	@Test(priority=362, enabled =true)
	  public void IRMA7112_ProgressBar_RiskResponseList() throws InterruptedException, IOException {
		
		// Click on Progress bar column Header 
		mouseHoverByXpath("//span/div/p");
		Thread.sleep(3000);
		
		// Click on Progress bar column Header 
		mouseHoverByXpath("//td[2]/div/div/p");
		Thread.sleep(3000);
		
		// Click on Progress bar column Header 
		mouseHoverByXpath("//tr[3]/td[2]/div/div/p");
		Thread.sleep(3000);
				
		
	}
	
	@Test(priority=363, enabled =true)
	  public void ColumnHeaders_RiskResponseList() throws InterruptedException, IOException {
		
		//TestCases RRL - 2
		// Click on Progress bar column Header 
		assertEquals("//th[3]/span/span", "Component Group");
		Thread.sleep(2000);
		
		
		// Click on Media/label column Header 
		assertEquals("//th[4]/span/span", "Asset Name(s)");
		Thread.sleep(2000);
		
		// Click on Asset Name column Header 
		assertEquals("//th[5]/span/span", "Scenario Advisory");
		Thread.sleep(2000);
		
		// Click on Threat Source/Event column Header 
		assertEquals("//th[6]/span/span", "Threat Source / Threat Event");
		Thread.sleep(2000);
		
		// Click on Vulnerability column Header 
		assertEquals("//th[7]/span/span", "Vulnerability");
		Thread.sleep(2000);
		
		// Click on Risk Rating column Header 
		assertEquals("//th[8]/span/span", "Risk Rating Current");
		Thread.sleep(2000);
		
		// Click on Residual Rating column Header 
		assertEquals("//th[9]/span/span", "Risk Rating Residual");
		Thread.sleep(2000);
		
		// Click on Treatment column Header 
		assertEquals("//th[10]/span/span", "Treatment");
		Thread.sleep(2000);
		
		// Click on Evaluation column Header 
		assertEquals("//th[11]/span/span", "Status");
		Thread.sleep(2000);

		// Click on ImplPlanning column Header 
		assertEquals("//th[12]/span/span", "Reconciliation");
		Thread.sleep(2000);
		
		
	}
	
	@Test(priority=364, enabled =true)
	  public void Sorting_RiskResponseList() throws InterruptedException, IOException {
		
		// Click on Information Asset column Header to sort for Ascending order
		clickByXpath("//th[3]/span/span");
		Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
		Thread.sleep(8000);	  

		
		// Click on Information Asset column Header to sort for Ascending order
		clickByXpath("//th[3]/span/span");
		Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
		Thread.sleep(8000);	
		
		 Thread.sleep(8000);
	     //Click on Minimize sidebar
         clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
	     Thread.sleep(5000);
	     Thread.sleep(3000);
	     //Thread.sleep(3000); 	
	}	
}
