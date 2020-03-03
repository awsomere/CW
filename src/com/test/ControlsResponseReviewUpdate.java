package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ControlsResponseReviewUpdate extends WrapperClass {

	public WebDriver driver;
	  String browser=null;

	  
	  @Test(priority=367, enabled =true)
	  public void NavigatePage_ControlsResponseReview() throws InterruptedException, IOException {
		
		   Thread.sleep(8000);
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
		        
	        //Click on Controls Response Review Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/ul/li[3]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[5]/ul/li[3]/a");
	        Reporter.log("Click on Controls Response Review Sub-module | ");
	        Thread.sleep(8000);
	        Thread.sleep(8000);
	        //Thread.sleep(3000);
	      
       }
	
	@Test(priority=368, enabled =true)
	  public void PageHearder_ControlsResponseReview() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Controls Response Review");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=369, enabled = true)
	   public void PanelBar_ControlsResponseReview() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Response Controls Response Review");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   // Click on Page breadcrumb
		   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 2 of 2 entries");
		   //Reporter.log("Showing 7 of 7 entries");
		   //Thread.sleep(2000);
		   //mouseHoverByXpath("//ol");
		   //Thread.sleep(1000); 
		   
	   }
	   
	 @Test(priority=370, enabled = true)
	 public void PageLevelHelp_ControlsResponseReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
	     clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(3000);
		   // Thread.sleep(3000);
		   
	 }
		
	 @Test(priority=371, enabled = true)
	 public void RiskManagementMap_ControlsResponseReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("//div[4]/div/div/div[2]/button");
		   Thread.sleep(3000);
		   Thread.sleep(8000);
	 }
	 
	 @Test(priority=372, enabled = true)
	   public void GlobalExpand_ControlsResponseReview() throws IOException, InterruptedException {
		  
		
		 //Click on GlobalExpand
		 clickByXpath("//tr[2]/td/span");
		   Thread.sleep(6000);
		 
		   //Click on GlobalExpand
		   clickByXpath("//tr[2]/td/span");
		   Thread.sleep(5000);
		
	 }
	 
	 @Test(priority=373, enabled = true)
	   public void HelpIcon_ControlsResponseReview() throws IOException, InterruptedException {
		  
		
		 //Click on Help Icon
		 clickByXpath("//div[2]/span/span/i");
		   Thread.sleep(8000);
		  // Thread.sleep(5000);
		 
		   //Click on Close button
		   clickByXpath("html/body/div[4]/div/div/div[3]/button");
		   Thread.sleep(8000);
		
	 }
	 
	 @Test(priority=374, enabled = true)
	   public void NIST_ControlsResponseReview() throws IOException, InterruptedException {
		 
		 Thread.sleep(4000);
		 
		//Click on Help Icon
		 clickByXpath("//cw-info-nist/div/div/span");
		   Thread.sleep(8000);
		   //Thread.sleep(5000);
		 
		   //Click on Close button
		   clickByXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
		   Thread.sleep(8000);
		
	 }
	 
	 
	 @Test(priority=375, enabled = true)
	   public void ControlTags_ControlsResponseReview() throws IOException, InterruptedException {
		 
		 Thread.sleep(8000);
		 
		//Click on Control Tag Icon
		 clickByXpath("//a/span/strong");
		   Thread.sleep(8000);
		  // Thread.sleep(5000);
	
		   //Click on CheckBox
		   clickByXpath("html/body/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/label");
		   Thread.sleep(8000);
		   
		   //Click on Close button
		   clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
		   Thread.sleep(8000);
		
	 } 
	 
	 @Test(priority=376, enabled =true)
	  public void ClearDate_RiskResponseList() throws InterruptedException, IOException {
		 
		        Thread.sleep(4000);
		        
		        ArrowLeft();
		        ArrowLeft();
		        ArrowLeft();
		        Thread.sleep(6000);
		        
		      //Click on Close Button
				   assertTextXpath("//td[20]/span");
				   clickByXpath("//td[20]/span");
				   Reporter.log("Select the option from drop-down | ");
				   Thread.sleep(8000);
				   clickByXpath("html/body/div[5]/div/div/div[3]/button[1]");
				   Thread.sleep(6000);
		        
		        
	 }
	 

	 @Test(priority=377, enabled =true)
	  public void Action_RiskResponseList() throws InterruptedException, IOException {
			   
		 Thread.sleep(8000);
		 
		 ArrowDown();
		   ArrowDown();
		   Thread.sleep(8000);
		   
		 // Click on Treat & Evaluate
		   assertEquals("//*[@id='tab_selector_simple']/a/span", "Simple");
		   Reporter.log("Click on Treat & Evaluate | ");
		   Thread.sleep(5000);
		   clickByXpath("//*[@id='tab_selector_simple']/a/span");
		   Reporter.log("Select the Treat & Evaluate | ");
		   Thread.sleep(8000);
		   
		   //Click on Action drop-down
			 assertTextXpath("//td[10]/div/div/button");
			 clickByXpath("//td[10]/div/div/button");
			 Reporter.log("Click on Action drop-down | ");
			 Thread.sleep(6000);
		   
		      //Select the option from drop-down
			 	assertTextXpath("//td[10]/div/div/ul/li[2]/a");
			   clickByXpath("//td[10]/div/div/ul/li[2]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   
	 }

	 @Test(priority=378, enabled =true)
	  public void ImplementationManager_RiskResponseList() throws InterruptedException, IOException {
		
		        Thread.sleep(6000);	 
			 //Click on Implementation Manager drop-down
			   assertTextXpath("//td[17]/div[1]/div/ul/li[1]/div/button/span[3]");
			   clickByXpath("//td[17]/div[1]/div/ul/li[1]/div/button/span[3]");
			   Reporter.log("Click on Implementation Manager drop-down | ");
			   Thread.sleep(6000);
			   
			// Enter the value
			    assertTextXpath("//li[4]/div/input");
			    sendvaluebyxpath("//li[4]/div/input", "Uma M");
			    Reporter.log("Enter the value | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);	
			 			   
			  //Select the option from drop-down
			    clickByXpath("//*[@id='content']/tr[2]/td[17]/div[1]/div/ul/li[1]/div/ul/li[6]");
				   Reporter.log("Select the option from drop-down | ");
				   Thread.sleep(8000);
			   Thread.sleep(8000);
			   
	 }
	 
	 @Test(priority=379, enabled =true)
	  public void ArrowIcon_RiskResponseList() throws InterruptedException, IOException {
		
		   
		 //Click on Email Arrow Icon
		   assertTextXpath("//td[17]/div/div/ul/li[2]/span/i");
		   clickByXpath("//td[17]/div/div/ul/li[2]/span/i");
		   Reporter.log("Click on Email Arrow Icon| ");
		   Thread.sleep(6000);
		  
		   
		   //Click on Close Button
		   //assertTextXpath("html/body/div[5]/div/div/div[1]/button");
		   clickByXpath("html/body/div[5]/div/div/div[1]/button");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
		   
	 }
	 
	 @Test(priority=380, enabled =false)
	  public void Global_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 
			 //Click on Global Checkbox
			   assertTextXpath("//*[@id='content']/tr[2]/td[11]/div/label");
			   clickByXpath("//*[@id='content']/tr[2]/td[11]/div/label");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(8000);
			   Thread.sleep(2000);
			   
			   //Click on yes button 
			   clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(6000);
			   
	 }
	
	 
	 @Test(priority=381, enabled =true)
	  public void Date_RiskResponseList() throws InterruptedException, IOException {
		 
		        Thread.sleep(3000);
		   
		        // Enter the Due date value
		        clickByXpath("//td[18]/div[1]/div/div[2]/label/i");
		        Thread.sleep(3000);
		        clickBylinktext("12");		        
			    Reporter.log("Enter the Date value | ");
			    Thread.sleep(8000);
			   // clickByXpath("//*[@id='tab_selector_simple']/a/span");
			    Thread.sleep(8000);	
			    
			 // Enter the Completed value
			    clickByXpath("//td[19]/div/cw-date-field/div[2]/label/i");
			    Thread.sleep(3000);
			    clickBylinktext("19");
			    Reporter.log("Enter the Date value | ");
			    Thread.sleep(8000);
			   // clickByXpath("//*[@id='tab_selector_simple']/a/span");
			    Thread.sleep(8000);	
			    
	 }
	 
	       @Test(priority=382, enabled =true)
	       public void SimpleNotes_RiskResponseList() throws InterruptedException, IOException {
			    
	    	   Thread.sleep(8000);	
	    	   
			    // Click on Notes button 
				  assertTextXpath("//*[@id='content']/tr[2]/td[21]/ul/li[1]/div[2]/a/strong");
				  clickByXpath("//*[@id='content']/tr[2]/td[21]/ul/li[1]/div[2]/a/strong");
				  Reporter.log("Click on Notes button | ");
				  Thread.sleep(8000);
				  Thread.sleep(3000);
				  
				  // Click on New Button in Notes pop-up window
				  assertTextXpath("//div[@id='note-details-table_wrapper']/div/div/div/a/span");
				  clickByXpath("//div[@id='note-details-table_wrapper']/div/div/div/a/span");
				  Reporter.log("Click on New Button in Notes pop-up window | ");
				  Thread.sleep(7000);
				  Thread.sleep(3000);
				  
				  // Enter some text in notes Editor 
				  assertTextXpath("//*[@id='DTE_Field_text']");
				  sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample notes");
				  Reporter.log("Enter some text in notes Editor | ");
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  
				  //Click on Create Button in Create Note pop-up window
				  assertTextXpath("//div[4]/div[3]/button[1]");
				  clickByXpath("//div[4]/div[3]/button[1]");
				  Reporter.log("Click on Create Button in Create Note pop-up window | ");
				  Thread.sleep(8000);
				  Thread.sleep(3000);
				  
				  //Click on listed notes		 
				  assertTextXpath("//*[@id='note-details-table']/tbody/tr/td[2]");
				  clickByXpath("//*[@id='note-details-table']/tbody/tr/td[2]");
				  Reporter.log("Click on Create Button in Create Note pop-up window | ");
				  Thread.sleep(8000);
				  
				  //Click on listed notes		 
				  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[2]/span");
				  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[2]/span");
				  Reporter.log("Click on Create Button in Create Note pop-up window | ");
				  Thread.sleep(8000);
				  Thread.sleep(3000);
				  
				  // Enter some text in notes Editor 
				  assertTextXpath("//*[@id='DTE_Field_text']");
				  sendvaluebyxpath("//*[@id='DTE_Field_text']", "Edit notes");
				  Reporter.log("Enter some text in notes Editor | ");
				  Thread.sleep(5000);
				  Thread.sleep(3000);
				  
				  //Click on Create Button in Create Note pop-up window
				  assertTextXpath("//div[4]/div[3]/button[1]");
				  clickByXpath("//div[4]/div[3]/button[1]");
				  Reporter.log("Click on Create Button in Create Note pop-up window | ");
				  Thread.sleep(8000);
				  Thread.sleep(3000);		
				  
				  //Click on listed notes		 
				  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[3]/span");
				  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[3]/span");
				  Reporter.log("Click on Create Button in Create Note pop-up window | ");
				  Thread.sleep(8000);
				  Thread.sleep(3000);
				  
				 //Click on Close button in popup
				  clickBycssSelector(".modal-footer > button");
				 Reporter.log("Click on Close button in popup | ");
				 Thread.sleep(8000);
				 Thread.sleep(8000);
				 Thread.sleep(6000);
	 }
	 
	 @Test(priority=383, enabled =false)
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
	 
	 @Test(priority=384, enabled =true)
	  public void TreatEvaluate_RiskResponseList() throws InterruptedException, IOException {
			   
		 Thread.sleep(8000);
		 
			   // Click on Treat & Evaluate
			   assertEquals("//*[@id='tab_selector_treatEvaluate']/a/span", "Treat & Evaluate *");
			   Reporter.log("Click on Treat & Evaluate | ");
			   Thread.sleep(5000);
			   clickByXpath("//*[@id='tab_selector_treatEvaluate']/a/span");
			   Reporter.log("Select the Treat & Evaluate | ");
			   Thread.sleep(8000);
			   
			  //Click on Effectiveness drop-down
			   assertTextXpath("//td[7]/div/div/button");
			   clickByXpath("//td[7]/div/div/button");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(6000);
			   	
			   //Select the option from drop-down
			   assertTextXpath("//td[7]/div/div/ul/li[3]/a");
			   clickByXpath("//td[7]/div/div/ul/li[3]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   	
			 //Click on Feasibility drop-down
			   assertTextXpath("//td[9]/div/div/button");
			   clickByXpath("//td[9]/div/div/button");
			   Reporter.log("Click on Action drop-down | ");
			   Thread.sleep(6000);
			   	
			   //Select the option from drop-down
			   assertTextXpath("//td[9]/div/div/ul/li[3]/a");
			   clickByXpath("//td[9]/div/div/ul/li[3]/a");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(6000);
			   
			   // Enter the value
			    assertTextXpath("//td[8]/div/input");
			    sendvaluebyxpath("//td[8]/div/input", "2101");
			    Reporter.log("Enter the value | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);	
			   	
			    
	 }
	 
	 @Test(priority=385, enabled =true)
	  public void RiskAction_RiskResponseList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		
		 
			   // Click on Risk Action Plan *
			    assertEquals("//*[@id='tab_selector_riskActionPlan']/a/span", "Risk Action Plan *");
			    Reporter.log("Click on Risk Action Plan | ");
			    Thread.sleep(5000);
			    clickByXpath("//*[@id='tab_selector_riskActionPlan']/a/span");
			    Reporter.log("Select the Risk Action Plan | ");
			    Thread.sleep(8000);
			    
			 // Enter Text for Description textarea
			    
			    assertTextXpath("//td[13]/div/textarea");
			    sendvaluebyxpath("//td[13]/div/textarea", "Description");
			    Reporter.log("Enter Text for Note textarea | ");
			    Thread.sleep(8000);
			    //Thread.sleep(8000);
			    
			 // Enter Text for Plans  textarea
			    assertTextXpath("//td[14]/div/textarea");
			    sendvaluebyxpath("//td[14]/div/textarea", "Plans");
			    Reporter.log("Enter Text for Note textarea | ");
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    
			    //Click on Enhance drop-down
			    assertTextXpath("//td[15]/div/div/div/div/button");
			    clickByXpath("//td[15]/div/div/div/div/button");
			    Reporter.log("Click on Action drop-down | ");
			    Thread.sleep(6000);
			    	
				//Select the option from drop-down
			    assertTextXpath("//td[15]/div/div/div/div/ul/li[2]/a");
			    clickByXpath("//td[15]/div/div/div/div/ul/li[2]/a");
				Reporter.log("Select the option from drop-down | ");
				Thread.sleep(6000);
				
			    
	 }
	 
	
	 @Test(priority=386, enabled = true)
	  public void RiskResponseLinkNavigate_ControlsResponseReview() throws InterruptedException {	  		
		  	 
	   Thread.sleep(8000);
	   
	   ArrowLeft();
	   ArrowLeft();
	   ArrowLeft();
	   ArrowLeft();
	   Thread.sleep(8000);
	   
	   //Click on GlobalExpand
		 clickByXpath("//tr[2]/td/span");
		 Thread.sleep(8000);
		Thread.sleep(8000);
		   
		   ArrowLeft();
		   ArrowLeft();
		   ArrowLeft();
		   ArrowLeft();
		   Thread.sleep(8000);
		   
		  //Get the vul link
		   gettext("//td[3]/span");
		   Thread.sleep(8000);
		  
	   //Click on RiskResponse Link
       assertTextXpath("//td[8]/strong/a");
 		clickByXpath("//td[8]/strong/a");
 		Reporter.log("Click on Filter Button on Controls Response Review page | ");
 		Thread.sleep(3000);
 		 Thread.sleep(8000);
 		 Thread.sleep(8000); 		
 		
 		 //Click on GlobalExpand
		   clickByXpath("//*[@id='risk_0']/td[1]/span");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   //clickByXpath("//*[@id='risk_0']/td[1]/span");
		   
		 //Get the vul link
		   GetText("//*[@id='risk_0']/td[7]/a");
		   Thread.sleep(8000);
		   
		 //Click on Controls Response Review Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/ul/li[3]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[5]/ul/li[3]/a");
	        Reporter.log("Click on Controls Response Review Sub-module | ");
	        Thread.sleep(8000);
		   
		  
	 }
	 
		   
      @Test(priority=387, enabled = true)
    public void CompareVulLink_ControlsResponseReview() throws InterruptedException {	  		
				  	 
			   Thread.sleep(8000);
		
		   //Compare the Vul Link
		   CompareTextValue("gettext","GetText");
		   Thread.sleep(8000);
	   
	 }
	 
      @Test(priority=388, enabled = true)
	  public void Export_ControlsResponseReview() throws InterruptedException {
		        	       
				  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button/span[1]/i");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button/span[1]/i");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(5000);
		  // Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button/span[1]/i");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button/span[1]/i");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(5000);
		  // Thread.sleep(3000);
		  
		   //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(3000);
			  Thread.sleep(3000);
   
	      }
  
	   @Test(priority=389, enabled = true)
		  public void Filter_ControlsResponseReview() throws InterruptedException {	  		
			  	 
		   Thread.sleep(3000);
		   Thread.sleep(8000);
		       	        
			  		// Click on Filter Button on Controls Response Review
			        assertTextXpath("//cw-filter/div/span/i");
			  		clickByXpath("//cw-filter/div/span/i");
			  		Reporter.log("Click on Filter Button on Controls Response Review page | ");
			  		Thread.sleep(3000);
			  		Thread.sleep(3000);
			        //Thread.sleep(3000);
			  		
			  	//Click on Asset Drop-down
			  		clickByXpath("//div[4]/div/div/ul/li/input");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(5000);
			  		//Thread.sleep(3000);
			  		clickByXpath("//div[4]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
		       
			  		//Click on Media Drop-down
			  		clickByXpath("//div[5]/div/div/ul/li/input");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(5000);
			  		//Thread.sleep(3000);
			  		clickByXpath("//div[5]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  	    //Click on Submit button in Filter Pop-up
			  		
			  			assertTextXpath("//div[3]/button[2]");
			  			clickByXpath("//div[3]/button[2]");
			  			Reporter.log("Click on Submit button in Filter Pop-up | ");
			  			Thread.sleep(3000);
			  	
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
			        
		  }
	 
	   
	   @Test(priority=390, enabled =true)
		  public void ColumnHeaders_ControlsResponseReview() throws InterruptedException, IOException {
			
			//TestCases RRL - 2
			// Click on Progress bar column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[2]/span/span", "Control Advisory");
			Thread.sleep(2000);
						
			// Click on Media/label column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[3]/span/span", "Control or Recommendation");
			Thread.sleep(2000);
			
			// Click on Asset Name column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[4]/span/span", "Component Group");
			Thread.sleep(2000);
			
			// Click on Threat Source/Event column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[5]/span/span", "Control Tags");
			Thread.sleep(2000);
			
			// Click on Vulnerability column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[6]/span/span", "Control Response");
			Thread.sleep(2000);
			
			// Click on Risk Rating column Header 			
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[10]", "Action");
			Thread.sleep(2000);
			
			// Click on Residual Rating column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[11]", "Global");
			Thread.sleep(2000);
			
			// Click on Treatment column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[17]", "Implementation Manager");
			Thread.sleep(2000);
			
			// Click on Evaluation column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[18]", "Due Date");
			Thread.sleep(2000);

			// Click on ImplPlanning column Header 
			assertEquals("//*[@id='controls-response-review-table']/thead/tr/th[19]", "Implemented Date");
			Thread.sleep(2000);
		
			
		}
	   
	   @Test(priority=391, enabled =true)
		  public void MultiSelect_ControlsResponseReview() throws InterruptedException, IOException {
			
		   
		   //Click on Multi Select Checkbox
		 //  assertTextXpath("//*[@id='controls-response-review-table']/thead/tr/th[22]/div/label");
 			clickByXpath("//*[@id='controls-response-review-table']/thead/tr/th[22]/div/label");
 			Thread.sleep(8000);
 			Thread.sleep(2000);
 			
 			  //Click on Action drop-down
			 assertTextXpath("//*[@id='content']/tr[1]/td[5]/div/div[1]/button");
			 clickByXpath("//*[@id='content']/tr[1]/td[5]/div/div[1]/button");
			 Reporter.log("Click on Action drop-down | ");
			 Thread.sleep(8000);
			 Thread.sleep(2000);
		   
		      //Select the option from drop-down
			 	assertTextXpath("//*[@id='content']/tr[1]/td[5]/div/div[1]/ul/li[2]");
			   clickByXpath("//*[@id='content']/tr[1]/td[5]/div/div[1]/ul/li[2]");
			   Reporter.log("Select the option from drop-down | ");
			   Thread.sleep(8000);
			   Thread.sleep(2000);
			   
			   //Click on Multi Select Checkbox
			 //  assertTextXpath("//*[@id='controls-response-review-table']/thead/tr/th[22]/div/label");
	 			clickByXpath("//*[@id='controls-response-review-table']/thead/tr/th[22]/div/label");
	 			Thread.sleep(8000);
	   
	   
	   }
}