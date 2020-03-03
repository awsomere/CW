package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.test.WrapperClass;

public class RiskQuestionnaireListUpdate extends WrapperClass{
	
	 public WebDriver driver;
	  String browser=null;
	
	  @Test(priority=115, enabled =true)
	  public void NavigatePage_RiskQuestionnaireList() throws InterruptedException {
		    
	        Thread.sleep(8000);
		 
		    		           	        
		   //Select Risk Determination sidebar-left Module		    
		   	assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	    clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	    Reporter.log("Select Risk Determination sidebar-left Module | ");
	        Thread.sleep(8000);
	        //Thread.sleep(8000);
	        
		    //Click on Risk Questionnaire List Page
			  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
			  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
			  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);
		    Thread.sleep(8000);
		   
}
	  
	@Test(priority=116, enabled = false)
   public void PageHearder_RiskQuestionnaireList() throws InterruptedException {
		
		 Thread.sleep(8000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Risk Questionnaire List");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=117, enabled = false)
	   public void PanelBar_RiskQuestionnaireList() throws InterruptedException {
			   
		   Thread.sleep(8000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Risk Questionnaire List");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   // Click on Page breadcrumb
		  // assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 13 of 13 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
	   }
	   
	 @Test(priority=118, enabled = false)
	 public void PageLevelHelp_RiskQuestionnaireList() throws InterruptedException {
		   
		   Thread.sleep(8000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(8000);
		    //Thread.sleep(8000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
	     clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(8000);
		   // Thread.sleep(8000);
		   
	 }
		
	 @Test(priority=119, enabled = false)
	 public void RiskManagementMap_RiskQuestionnaireList() throws InterruptedException {
		   
		   Thread.sleep(8000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(8000);
		   clickByXpath("html/body/div[4]/div/div/div[2]/button");
		   Thread.sleep(8000);
	 }
	
	
	@Test(priority=120, enabled =true)
	  public void ContinueButton_RiskQuestionnaireForm() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		   
		 
		   
		// Click on 'continue' button of component Groups
		 assertTextXpath("//*[@id='content']/tr[2]/td[7]/div/div[1]/span");
	 	        clickByXpath("//*[@id='content']/tr[2]/td[7]/div/div[1]/span");
	 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
     	        Thread.sleep(8000);
	        Thread.sleep(5000);
	        Thread.sleep(8000);
	        
	        
	}
	
	@Test(priority=121, enabled =false)
	  public void PageHearder_RiskQuestionnaireForm() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Risk Questionnaire Form");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=122, enabled =false)
	   public void PanelBar_RiskQuestionnaireForm() throws IOException, InterruptedException {
			   
		   Thread.sleep(2000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Risk Questionnaire List Risk Questionnaire Form");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   
	   }
	   
	 @Test(priority=123, enabled = false)
	 public void PageLevelHelp_RiskQuestionnaireForm() throws IOException, InterruptedException {
		   
		   Thread.sleep(8000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(8000);
		  Thread.sleep(8000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
	     clickByXpath("html/body/div[3]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(8000);
		  Thread.sleep(8000);
		   
	 }
		
	 @Test(priority=124, enabled = false)
	 public void RiskManagementMap_RiskQuestionnaireForm() throws IOException, InterruptedException {
		   
		   Thread.sleep(8000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(8000);
		   clickByXpath("html/body/div[3]/div/div/div[2]/button");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
	 }
	 
	 
	 @Test(priority=125, enabled =false)
	  public void ReturnToRiskQuestionarieList_RiskQuestionnaireForm() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);	
		 
		// Click on 'Return to Risk Questionnaire List' button of 
	        	assertTextXpath("//*[@id='rMedia']");
	 	        clickByXpath("//*[@id='rMedia']");
	 	        Reporter.log("Click on 'Return to Risk Questionnaire List' button | ");
	        Thread.sleep(8000);
	        Thread.sleep(8000);  
	  
	        //Click on Leave Page button 
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Leave Page button | ");
	       Thread.sleep(8000); 
	       
	 }
	 
	 @Test(priority=126, enabled = true)
	  public void IRMA8332_ChkPercentageBarFirstControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {

		
		 Thread.sleep(8000); 
		 Thread.sleep(8000); 
		 Thread.sleep(8000); 
		 
		//Check the pecentage text
		   assertEquals("//*[@id='uniqueMedia']/tbody/tr/td[1]/div/p", "0%");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
	 }
	 
	 @Test(priority=127, enabled = true)
	  public void IRMA8409_DataFetchedOrNot_FirstControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {

		 Thread.sleep(8000); 
		 
		/*//1st page
        //Select 'Yes' option in Response choice of listed Controls
	  	assertTextXpath("//label[2]");
 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);
	     
	    // Select 'Yes' option in Response choice of listed Controls	 
 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
	 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
	 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	Thread.sleep(8000);
	 	//Thread.sleep(8000);
	 	    
	 	  //Select 'Yes' option in Response choice of listed Controls	
	 	 assertTextXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
		 	clickByXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
		 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 
		 	 assertTextXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
			 	clickByXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
			 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			 	Thread.sleep(8000);
		    Thread.sleep(5000);*/
		    
	 }
	 
	 @Test(priority=128, enabled = false)
	 public void IRMA8990_LowerSectionHelpIcon_RiskQuestionnaireForm() throws InterruptedException, IOException {
		 
		 Thread.sleep(8000); 
		 Thread.sleep(8000); 
	 
		 //Click on Risk rating Help Icon 
		 clickByXpath("//span/button");
		 Thread.sleep(8000);
		 clickBycssSelector(".bootbox-close-button");    
	      Thread.sleep(8000);

		 //Click on Risk notes help icon
		 clickByXpath("//th[5]/span/button");
		 Thread.sleep(8000);
		 clickBycssSelector(".bootbox-close-button");    
	      Thread.sleep(8000);
		 
		 //Click on Risk Likelihood	Help icon
		 clickByXpath("//td/span/button");
		 Thread.sleep(8000);
		 clickBycssSelector(".bootbox-close-button");    
	      Thread.sleep(8000);	 
		 
		 //Click on Risk Impact Help Icon
		 clickByXpath("//tr[2]/td/span/button");
		 Thread.sleep(8000);
		 clickBycssSelector(".bootbox-close-button");    
	      Thread.sleep(8000);
	      
	 }
	 
	/* @Test(priority=129, enabled = true)
	 public void UpdatedRiskRating_RiskQuestionnaireForm() throws InterruptedException, IOException {
		 
		 Thread.sleep(8000); 
		 Thread.sleep(8000); 
		 
	      //Click on RiskLikehood drop-down
		 Thread.sleep(8000);
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
	           Thread.sleep(8000);
	          //Thread.sleep(8000);
	     
	        //Select 'Moderate' option from Likehood drop-down	 
	           assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	      // Click on RiskImpact drop-down
	      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
	 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
	      Thread.sleep(8000);
	     // Thread.sleep(8000);
	     
	      //Select 'Major' option from Impact drop-down	      
	      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
	     
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	      
	 }*/
	 
	
	 @Test(priority=132, enabled = true)
	  public void SecondControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {
	  
	  
		 Thread.sleep(8000);       
	       
		//1st page
        //Select 'Yes' option in Response choice of listed Controls
	  	assertTextXpath("//label[2]");
 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);

	 	    
	 }
	 
	 
	 @Test(priority=134, enabled = true)
	 public void Notes_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	Thread.sleep(8000); 
   
   //Click on Notes button to add text
   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[7]/div/a/strong");
   clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[7]/div/a/strong");
   Reporter.log("Click on Notes button to add text | ");
   Thread.sleep(8000);
   Thread.sleep(8000);
   
   //Click on New button in Notes pop-up window  
    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
   clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
   Reporter.log("Click on New button in Notes pop-up window | ");
   Thread.sleep(8000);
   //Thread.sleep(8000);
   
   // Enter Text for Note textarea
   assertTextXpath("//textarea");
   sendvaluebyxpath("//textarea", "created notes");
   Reporter.log("Enter Text for Note textarea | ");
   Thread.sleep(8000);
   Thread.sleep(8000);
   
   // Click on Create Button
   assertTextXpath("//div[4]/div[3]/button[1]");
   clickByXpath("//div[4]/div[3]/button[1]");
   Reporter.log("Click on Create Button | ");
   Thread.sleep(8000);
   Thread.sleep(8000);  
   
	 }
	 
	 @Test(priority=135, enabled =true)
	  public void IRMA4934_ChkResponseInNotes_RQL() throws InterruptedException, IOException {
	  
		  Thread.sleep(8000);
		  
	   // Click on Page breadcrumb
		assertEquals("html/body/div[3]/div/div/div[2]/div/div[1]/table/tbody/tr[8]/td[2]/span", "In progress");
	   Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(8000);
	   
	 //Click on Close button in popup
	    clickBycssSelector(".modal-footer > .pull-right");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(8000);
	    Thread.sleep(8000); 
   
	 }
		 
	 @Test(priority=137, enabled = true)
	  public void HelpIcon_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000);
		 Thread.sleep(8000);
	      
		      
		    // Click ? Button
		 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[3]/div/span[3]/cw-message-help/button/i");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[3]/div/span[3]/cw-message-help/button/i");
		    Reporter.log("Click ? Button | ");
		    Thread.sleep(8000);
	        
		    // Click on Close button in ? Pop-up
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
		    clickByXpath("html/body/div[3]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in ? Pop-up | ");
		    //clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Thread.sleep(8000);    
  
		 
	 }
	 
	 @Test(priority=138, enabled = true)
	  public void NIST_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000);
		 
		  // Click NIST Button
		    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[3]/div/span[4]/div/div[1]/span");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[3]/div/span[4]/div/div[1]/span");
		    Reporter.log("Click ? Button | ");
		    Thread.sleep(8000);
	        
		    // Click on Close button in ? Pop-up
		  //*[@id="info-nist-modal"]/div/div/div[3]/button
		    assertTextXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
		    clickByXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
		    Reporter.log("Click on Close button in ? Pop-up | ");
		    //clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Thread.sleep(8000);    
	 
		 
	 }
	 
	 @Test(priority=139, enabled = true)
	  public void ExpandsSubControls_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000); 
		 Thread.sleep(5000); 
   
 //Expand the Controls
   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span/i");
   clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span/i");
   Reporter.log("Expand the Controls | ");
   Thread.sleep(8000);
   
     // Select 'Inprogress' option in Response choice of listed Controls
  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/cw-asset-response-selector/div/ul/li[2]/div/label[3]");
   clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td/table/tbody/tr[2]/td[5]/cw-asset-response-selector/div/ul/li[2]/div/label[3]");
     Reporter.log("Select 'Inprogress' option in Response choice of listed Controls | ");
   Thread.sleep(8000);
       
	 }
	 
	 @Test(priority=140, enabled = true)
	  public void CloseExpandsSubControls_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000); 
       
		//Expand the Controls
		   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span/i");
		   clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span/i");
		   Reporter.log("Expand the Controls | ");
		   Thread.sleep(8000);
     Thread.sleep(8000);
     
	 }
	 
	 @Test(priority=141, enabled = false)
	  public void IRMA9448_AddCustomControls_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

		 Thread.sleep(8000); 
		 Thread.sleep(8000); 
		 
   // 1st page	           
   // Click on Add a Custom Control
		 assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
	    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
	    Reporter.log("Click on Add a Custom Control	| ");
	    Thread.sleep(8000); 
	    Thread.sleep(2000);

  // Click on Add a Custom Control textbox		  
	    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
	    clickByXpath("//cw-add-custom-control/div/div/div/div/div[1]/input");
	    Reporter.log("Click on Add a Custom Control tetbox| ");
	    Thread.sleep(4000); 

  // Enter the New Custom Control
	    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
	    sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div[1]/input", "TestControls");
	    Reporter.log("Enter the New Custom Controls| ");
	    Thread.sleep(8000); 

	    // Click from listed add custom controls	
	    //assertTextXpath("//div/strong");
	    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/div/div/div[2]/div");
	    Reporter.log("Click from listed add custom controls | ");
	    Thread.sleep(8000); 
	    Thread.sleep(8000);
	    
	    //Expand the Controls
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span[1]/i");
	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span[1]/i");
	    Reporter.log("Expand the Controls | ");
	    Thread.sleep(8000);
	    Thread.sleep(8000);
	    
	    //Expand the Controls
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span[1]/i");
	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[2]/span[1]/i");
	    Reporter.log("Expand the Controls | ");
	    Thread.sleep(8000);
	    Thread.sleep(8000);
	
	    
	 }	
	 
	 @Test(priority=142, enabled = false)
	  public void IRMA9302_NoteDocCountAfterAdded_RiskQuestionnaireForm() throws InterruptedException, IOException {

		 Thread.sleep(8000);
		 
		  // Select 'Yes' option in Response choice of listed Controls	 
	 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
		 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
		 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	Thread.sleep(8000);
		 	//Thread.sleep(8000);
		    Thread.sleep(8000);
		    
		 Thread.sleep(8000);
		
		
		
	 }
		 
	 @Test(priority=143, enabled = false)
	  public void NoteDocCount_AddCustomControls_RiskQuestionnaireForm() throws InterruptedException, IOException {

		 Thread.sleep(8000); 
	 
		// Click on Page header Title
			assertEquals("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div/a/strong", "0");
			Thread.sleep(5000);
					 
			// Click on Page header Title
			assertEquals("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[9]/a/a", "0");
			Thread.sleep(5000);
	 }
	 
	 @Test(priority=144, enabled = false)
	  public void CustomControlNotes_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000); 
 
 //Click on Notes button to add text
assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div/a/strong");
 clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div/a/strong");
 Reporter.log("Click on Notes button to add text | ");
 Thread.sleep(8000);
 //Thread.sleep(8000);
 
 //Click on New button in Notes pop-up window  
 assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
 clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
 Reporter.log("Click on New button in Notes pop-up window | ");
 Thread.sleep(8000);
 //Thread.sleep(8000);
 
 // Enter Text for Note textarea
 assertTextXpath("//textarea");
 sendvaluebyxpath("//textarea", "created notes");
 Reporter.log("Enter Text for Note textarea | ");
 Thread.sleep(8000);
 //Thread.sleep(8000);
 
 
 // Click on Create Button
 assertTextXpath("//div[4]/div[3]/button[1]");
 clickByXpath("//div[4]/div[3]/button[1]");
 Reporter.log("Click on Create Button | ");
 Thread.sleep(8000);
 Thread.sleep(8000);  
 
//Click on Close button in popup
 assertTextXpath("//div[3]/div/div/div[3]/button");
 clickByXpath("//div[3]/div/div/div[3]/button");
 Reporter.log("Click on Close button in popup | ");
 Thread.sleep(8000);
 Thread.sleep(8000);
 
	 }

	 
	 @Test(priority=145, enabled = false)
	  public void IRMA6295_NoteDocCountAfterGlobalChecked_RiskQuestionnaireForm() throws InterruptedException, IOException {

		 Thread.sleep(8000); 
		 
		// Click on Page header Title
			assertEquals("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div/a/strong", "0");
			Thread.sleep(5000);
					 
			// Click on Page header Title
			assertEquals("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[9]/a/a", "0");
			Thread.sleep(5000);
		
	 }
	 
	 @Test(priority=146, enabled = false)
	  public void Expand_AddCustomControls_RiskQuestionnaireForm() throws InterruptedException, IOException {

		 Thread.sleep(8000); 
	    
	    
	    //Expand the Control
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span/i");
	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span/i");
	     Reporter.log("Expand the Controls | ");
	     Thread.sleep(8000);
	     
	     //Expand the Controls
	     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span/i");
	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span/i");
	      Reporter.log("Expand the Controls | ");
	      Thread.sleep(8000);
	    
	    Thread.sleep(8000);
	    
	 }
  
   	      
	 @Test(priority=147, enabled = true)
	  public void RiskRatingvalues_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {
		 
	    Thread.sleep(8000);
	    Thread.sleep(8000);
	   
	    //Click on RiskLikehood drop-down
      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
           Thread.sleep(8000);
          //Thread.sleep(8000);
     
        //Select 'Moderate' option from Likehood drop-down	     
      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
      Thread.sleep(8000);
      Thread.sleep(8000);
      
      // Click on RiskImpact drop-down
      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
      Thread.sleep(8000);
     // Thread.sleep(8000);
     
      //Select 'Major' option from Impact drop-down	      
      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
      Thread.sleep(8000);
      Thread.sleep(8000);
      
	 }
	 
	 @Test(priority=130, enabled = true)
	  public void RiskRatingNotes_FirstControlsResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	    			  
	    			 Thread.sleep(8000); 
	    	   
	    	  //Click on Notes button to add text
	           assertTextXpath("//*[@id='body-content']/div[1]/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a");
	    	    clickByXpath("//*[@id='body-content']/div[1]/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a");
	    	    Reporter.log("Click on Notes button to add text | ");
	    	    Thread.sleep(8000);
	    	    //Thread.sleep(8000);
	    	    
	    	    //Click on New button in Notes pop-up window
		    	    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    	    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    	    Reporter.log("Click on New button in Notes pop-up window | ");
	    	    Thread.sleep(8000);
	    	    //Thread.sleep(8000);
	    	    
	    	    // Enter Text for Note textarea
	    	    assertTextXpath("//textarea");
	    	    sendvaluebyxpath("//textarea", "created Risk notes");
	    	    Reporter.log("Enter Text for Note textarea | ");
	    	    Thread.sleep(8000);
	    	    //Thread.sleep(8000);
	    	    
	    		    // Click on Create Button
	    	   //html/body/div[5]/div/div/div/div[4]/div[3]/button[1]
	    		    assertTextXpath("//div[4]/div[3]/button");
	    		    clickByXpath("//div[4]/div[3]/button");
	    		    Reporter.log("Click on Create Button | ");
	    		    Thread.sleep(8000);
	    		    //Thread.sleep(8000);   
	    		    
	    		    
	    		   //Click on New button in Notes pop-up window
	    		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    		    Reporter.log("Click on New button in Notes pop-up window | ");
	    		    Thread.sleep(8000);
	    		    //Thread.sleep(8000);
	    		    
	    		    // Enter Text for Note textarea
	    		    assertTextXpath("//textarea");
	    		    sendvaluebyxpath("//textarea", "created second Risk notes");
	    		    Reporter.log("Enter Text for Note textarea | ");
	    		    Thread.sleep(8000);
	    		    //Thread.sleep(8000);
	    		    
	    		    // Click on Create Button
	    		    assertTextXpath("//div[4]/div[3]/button");
	    		    clickByXpath("//div[4]/div[3]/button");
	    		    Reporter.log("Click on Create Button | ");
	    		    Thread.sleep(8000);
	    		    //Thread.sleep(8000);
	    		    	  	   
	    		    //Click on Close button in popup
	    		    clickBycssSelector(".modal-footer > .pull-right");
	    		    Reporter.log("Click on Close button in popup | ");
	    		    Thread.sleep(8000);
	    		    Thread.sleep(8000); 
	    		    
	    		    
	 }
	 
	 @Test(priority=131, enabled = true)
	  public void IRMA9469_RiskRatingNotesCount_FirstControlsResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	    			  
	    			 Thread.sleep(8000); 
	    		    // Click on Page breadcrumb
	     			   assertEquals("//*[@id='body-content']/div[1]/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a", "2");
	    			   Reporter.log("Click on Page breadcrumb | ");
	    			   Thread.sleep(8000);
	    			  //assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div/b[1]", "2"); 
	    			   Thread.sleep(8000);
	 
	 }
	 
	
	 
	 @Test(priority=149, enabled = true)
	  public void ThirdControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {

		 Thread.sleep(8000);
		 
		 // Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
			//1st page
	       //Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
		     
		    // Select 'Yes' option in Response choice of listed Controls	 
	 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	Thread.sleep(8000);
		 	//Thread.sleep(8000);
		 	    
		 	  //Select 'Yes' option in Response choice of listed Controls	
		 	 assertTextXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	clickByXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			 	Thread.sleep(8000);
		 	    //Thread.sleep(8000);
		     
		      // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	clickByXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			    Thread.sleep(5000);
			     
			    //Click on RiskLikehood drop-down
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	     
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
		      Thread.sleep(8000);
		      Thread.sleep(8000);
	     
	             
	 }
	 
	 @Test(priority=148, enabled = true)
	  public void IRMA9469_ThirdRiskRatingNotesCount_SecondControlsResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	    			  
	    Thread.sleep(8000); 
	    // Click on Page breadcrumb
	  //*[@id="body-content"]/div/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a/strong
		   assertEquals("//*[@id='body-content']/div[1]/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a/strong", "0");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(8000);
	    	
	     
	       
	 }
	 
	 @Test(priority=150, enabled = true)
	  public void FourControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {

		// Click on 'GoTo next Thread' button
	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
		 //1st page
		//Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
		     
		    // Select 'Yes' option in Response choice of listed Controls	 
	 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	Thread.sleep(8000);
		 	//Thread.sleep(8000);
		 	    
		 	  //Select 'Yes' option in Response choice of listed Controls	
		 	 assertTextXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	clickByXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			 	Thread.sleep(8000);
		 	    //Thread.sleep(8000);
		     
		      // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	clickByXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			    Thread.sleep(5000);
	    
			    // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[5]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
				 	clickByXpath("//tr[5]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
	
				 	 // Select 'Yes' option in Response choice of listed Controls	 
				 	 assertTextXpath("//tr[6]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
					 	clickByXpath("//tr[6]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
					 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
					 	Thread.sleep(8000); 
					 	Thread.sleep(5000);
					 	
					    //Click on RiskLikehood drop-down
				      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
				 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
				 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
				           Thread.sleep(8000);
				          //Thread.sleep(8000);
				     
				        //Select 'Moderate' option from Likehood drop-down	     
				      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
				 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
				 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
				      Thread.sleep(8000);
				      Thread.sleep(8000);
				      
				      // Click on RiskImpact drop-down
				      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
				 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
				      Thread.sleep(8000);
				     // Thread.sleep(8000);
				     
				      //Select 'Major' option from Impact drop-down	      
				      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[2]/a");
				 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[2]/a");
				 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
				      Thread.sleep(8000);
				      Thread.sleep(8000);
	      
	     
	      // Click on 'GoTo next Thread' button
	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
	 }
	 
	 @Test(priority=151, enabled = true)
	  public void FifthControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {

		//1st page
		//Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
		     
		    // Select 'Yes' option in Response choice of listed Controls	 
	 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	Thread.sleep(8000);
		 	//Thread.sleep(8000);
		 	    
		 	  //Select 'Yes' option in Response choice of listed Controls	
		 	 assertTextXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	clickByXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			 	Thread.sleep(8000);
		 	    //Thread.sleep(8000);
		     
		      // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	clickByXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			     Thread.sleep(5000);
			     
			  // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[5]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	clickByXpath("//tr[5]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			     Thread.sleep(5000);
				     
				    //Click on RiskLikehood drop-down
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
			           Thread.sleep(8000);
			          //Thread.sleep(8000);
			     
			        //Select 'Moderate' option from Likehood drop-down	     
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
			 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
			 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
			      // Click on RiskImpact drop-down
			      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
			 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
			      Thread.sleep(8000);
			     // Thread.sleep(8000);
			     
			      //Select 'Major' option from Impact drop-down	      
			      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
			      Thread.sleep(8000);
			      Thread.sleep(8000);
	     
	      // Click on 'GoTo next Thread' button
	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
	 }
	 
	 @Test(priority=152, enabled = true)
	  public void ClearResponse_SixthControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {

		//1st page
		//Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
		     
		    // Click on Clear button to clear the response
	 	 //*[@id="cgControl.control_response.id"]/div/span/i
			  assertTextXpath("//*[@id='cgControl.control_response.id']/div/span/i");
			  clickByXpath("//*[@id='cgControl.control_response.id']/div/span/i");
			  Reporter.log("Click on Clear button to clear the response | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);
			 
			  
	 }
	 
	 @Test(priority=153, enabled = true)
	  public void SelectedAgainResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000); 
			  
			//1st page
		//Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
		     
		    //Click on RiskLikehood drop-down
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
	           Thread.sleep(8000);
	          //Thread.sleep(8000);
	     
	        //Select 'Moderate' option from Likehood drop-down	     
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
	 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
	 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	      // Click on RiskImpact drop-down
	      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
	 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
	      Thread.sleep(8000);
	     // Thread.sleep(8000);
	     
	      //Select 'Major' option from Impact drop-down	      
	      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	     
	      // Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
	 }
	 
	 @Test(priority=154, enabled = true)
	  public void IRMA7970_IRMA7668_DeleteCustomControl_SeventhControlsResponse() throws InterruptedException, IOException  {

		//1st page
		//Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);   
		    Thread.sleep(5000);
		    
		 // 1st page	           
		    // Click on Add a Custom Control
		       assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
			    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
			    Reporter.log("Click on Add a Custom Control	| ");
			    Thread.sleep(8000); 

		  // Click on Add a Custom Control textbox		  
			    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
			    clickByXpath("//cw-add-custom-control/div/div/div/div/div[1]/input");
			    Reporter.log("Click on Add a Custom Control tetbox| ");
			    Thread.sleep(2000); 

		  // Enter the New Custom Control
			    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
			    sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div[1]/input", "DeleteControls");
			    Reporter.log("Enter the New Custom Controls| ");
			    Thread.sleep(8000); 

			    // Click from listed add custom controls	
			    //assertTextXpath("//div/strong");
			    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/div/div/div[2]/div");
			    Reporter.log("Click from listed add custom controls | ");
			    Thread.sleep(8000); 
			    Thread.sleep(8000);
		 	    
		 	    //Delete the Custom controls
			  //*[@id="riskQuestionsControls"]/tbody/tr[2]/td[9]/cw-remove-custom-control/span/i
		 	   clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[9]/cw-remove-custom-control/span/i");
		 	  Thread.sleep(8000); 
		 	 Thread.sleep(8000); 
		 	Thread.sleep(8000); 
		     
	 }
	 
	 @Test(priority=155, enabled = true)
	 public void SelectRiskRatingValues_RiskQuestionnaireForm() throws InterruptedException, IOException {
		 
		 Thread.sleep(8000); 
	 
		    //Click on RiskLikehood drop-down
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
	           Thread.sleep(8000);
	          //Thread.sleep(8000);
	     
	        //Select 'Moderate' option from Likehood drop-down	     
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
	 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
	 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	      // Click on RiskImpact drop-down
	      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
	 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
	      Thread.sleep(8000);
	     // Thread.sleep(8000);
	     
	      //Select 'Major' option from Impact drop-down	      
	      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	     
	      // Click on 'GoTo next Thread' button
	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
	 }
	 
	 @Test(priority=156, enabled = true)
	  public void EightControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {

		//1st page
		 //Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
		     
		    // Select 'Yes' option in Response choice of listed Controls	 
	 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	Thread.sleep(8000);
		 	//Thread.sleep(8000);
		 	    
		 	  //Select 'Yes' option in Response choice of listed Controls	
		 	 assertTextXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	clickByXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			 	Thread.sleep(8000);
		 	    //Thread.sleep(8000);
		     
		      // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	clickByXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			    Thread.sleep(5000);
			    
			    // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[5]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	clickByXpath("//tr[5]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			    Thread.sleep(5000);
			    
			    //Click on RiskLikehood drop-down
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	     
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
		      Thread.sleep(8000);
		      Thread.sleep(8000);
	     
	      // Click on 'GoTo next Thread' button
	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
	 }
	 
	 @Test(priority=157, enabled = true)
	  public void NinthControlsResponse_RQLBackUp_RiskQuestionnaireForm() throws InterruptedException  {

		//1st page
		 //Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
		     
		    // Select 'Yes' option in Response choice of listed Controls	 
	 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
		 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	Thread.sleep(8000);
		 	//Thread.sleep(8000);
		 	    
		 	  //Select 'Yes' option in Response choice of listed Controls	
		 	 assertTextXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	clickByXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			 	Thread.sleep(8000);
		 	    //Thread.sleep(8000);
		     
		      // Select 'Yes' option in Response choice of listed Controls	 
			 	 assertTextXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	clickByXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			    Thread.sleep(5000);
			    
			  
			    //Click on RiskLikehood drop-down
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	     
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[4]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
		      Thread.sleep(8000);
		      Thread.sleep(8000);
	     
	      // Click on 'GoTo next Thread' button
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
				    
	 }
	
	  
	  @Test(priority=169, enabled = true)
		 public void TenthControlResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {
			 
			 Thread.sleep(8000); 
			 //Select 'Yes' option in Response choice of listed Controls
			  	assertTextXpath("//label[2]");
		 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	    Thread.sleep(8000);
		 	    //Thread.sleep(8000);
			 
				     
		   //Click on RiskLikehood drop-down
		  	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		    Reporter.log("Click on RiskLikehood drop-down | ");	    
		    Thread.sleep(8000);
		   //Thread.sleep(8000);
			     
		   //Select 'Moderate' option from Likehood drop-down	     
		  	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[2]/a");
		   clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[2]/a");
		   Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		    Thread.sleep(8000);
		   Thread.sleep(8000);
			      
		   // Click on RiskImpact drop-down
		  assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		 Thread.sleep(8000);
		 // Thread.sleep(8000);
			     
	     //Select 'Major' option from Impact drop-down	      
		 assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		 clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		Reporter.log("Select 'Major' option from Impact drop-down | ");     
		Thread.sleep(8000);
		Thread.sleep(8000);
			      
	     
		 // Click on 'GoTo next Thread' button
      	assertTextXpath("//*[@id='pVuln']");
          clickByXpath("//*[@id='pVuln']");
          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
     
       Thread.sleep(8000);
       Thread.sleep(8000);
	          
	      
	       
	 }
	  
	  @Test(priority=169, enabled = true)
		 public void ElevenControlResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {
			 
			 Thread.sleep(8000); 
			 //Select 'Yes' option in Response choice of listed Controls
			  	assertTextXpath("//label[2]");
		 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	    Thread.sleep(8000);
		 	    //Thread.sleep(8000);
			 
		 	// Select 'Yes' option in Response choice of listed Controls	 
		 	    assertTextXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
			 	clickByXpath("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[3]");
			 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			 	Thread.sleep(8000);
			 	//Thread.sleep(8000);
			 	    
			 	  //Select 'Yes' option in Response choice of listed Controls	
			 	 assertTextXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
				 	clickByXpath("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
				 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
				 	Thread.sleep(8000);
			 	    //Thread.sleep(8000);
			     
			      // Select 'Yes' option in Response choice of listed Controls	 
				 	 assertTextXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
					 	clickByXpath("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
					 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
					 	Thread.sleep(8000);
				    Thread.sleep(5000);
				     
		   //Click on RiskLikehood drop-down
		  	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		    Reporter.log("Click on RiskLikehood drop-down | ");	    
		    Thread.sleep(8000);
		   //Thread.sleep(8000);
			     
		   //Select 'Moderate' option from Likehood drop-down	     
		  	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[2]/a");
		   clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[2]/a");
		   Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		    Thread.sleep(8000);
		   Thread.sleep(8000);
			      
		   // Click on RiskImpact drop-down
		  assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		 Thread.sleep(8000);
		 // Thread.sleep(8000);
			     
	     //Select 'Major' option from Impact drop-down	      
		 assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		 clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		Reporter.log("Select 'Major' option from Impact drop-down | ");     
		Thread.sleep(8000);
		Thread.sleep(8000);
		    
	          
	 }
	 
	  
	  @Test(priority=170, enabled =true)
	  public void AllFields_RiskQuestionnaireList() throws InterruptedException, IOException {
     
		  Thread.sleep(8000);
		  	        
 	        // Click on Return to RQL button
 	        clickByXpath("//*[@id='rMedia']");
 	        Thread.sleep(8000);
 	        Thread.sleep(8000);
 	       Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
             
      //Click on Media/Asset drop-down
      assertTextXpath("//*[@id='control-type']");
	     Thread.sleep(8000);
	         
	    // Click on Filter Button 
	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]/i");
	   Thread.sleep(8000);
	   
	  	//Click on Export Button
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
	  Thread.sleep(8000);
	   
	   // Click on Columns Header 
	  assertTextXpath("//*[@id='column_selector_button']");
	 Thread.sleep(8000);
 }
	  
	  
	  @Test(priority=171, enabled =false)
	  public void IRMA8948_PhysicalLocProgressBar_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		  Thread.sleep(8000);
		  
		  ArrowDown();
		  ArrowDown();
		  ArrowDown();
		  ArrowDown();
		  ArrowDown();
		  Thread.sleep(8000);
		  
		// Click on 'continue' button of Media/Asset
      	assertTextXpath("//*[@id='content']/tr[11]/td[7]/div/div[1]/span");
	        clickByXpath("//*[@id='content']/tr[11]/td[7]/div/div[1]/span");
	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
	        Thread.sleep(8000);
      Thread.sleep(8000);
      Thread.sleep(8000);
      Thread.sleep(8000);
      
    //1st page
      //Select 'Yes' option in Response choice of listed Controls
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	     
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	    
	 	  //Select 'Yes' option in Response choice of listed Controls	 
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    Thread.sleep(8000); 
			 
		      //Click on RiskLikehood drop-down
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	     
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
		     
		      Thread.sleep(8000);
		      Thread.sleep(8000);


	              // Click on 'GoTo next Thread' button	      
		      	assertTextXpath("//*[@id='pVuln']");
		          clickByXpath("//*[@id='pVuln']");
		          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
		       Thread.sleep(8000);
		       Thread.sleep(8000);
		       Thread.sleep(8000);
		    
		    
		    //2nd
	        //Select 'Yes' option in Response choice of listed Controls
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		 	    Thread.sleep(8000);
		 	    //Thread.sleep(8000);
		     
		      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		     
		 	    Thread.sleep(8000);
		 	    //Thread.sleep(8000);
		 	    
		 	  //Select 'Yes' option in Response choice of listed Controls	 
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
		 	    
		 	   Thread.sleep(8000); 
				 
			      //Click on RiskLikehood drop-down
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
			           Thread.sleep(8000);
			          //Thread.sleep(8000);
			     
			        //Select 'Moderate' option from Likehood drop-down	     
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
			      // Click on RiskImpact drop-down
			      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
			 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
			      Thread.sleep(8000);
			     // Thread.sleep(8000);
			     
			      //Select 'Major' option from Impact drop-down	      
			      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
			     
			      Thread.sleep(8000);
			      Thread.sleep(8000);


		              // Click on 'GoTo next Thread' button	      
			      	assertTextXpath("//*[@id='pVuln']");
			          clickByXpath("//*[@id='pVuln']");
			          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
			       Thread.sleep(8000);
			       Thread.sleep(8000);
		     
		 //3rd
		 	   //Select 'Yes' option in Response choice of listed Controls
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	     
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	    
	 	  //Select 'Yes' option in Response choice of listed Controls	 
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	 	    

		      // Select 'Yes' option in Response choice of listed Controls	 	
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
		 	    
		 	   Thread.sleep(8000); 
				 
			      //Click on RiskLikehood drop-down
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
			           Thread.sleep(8000);
			          //Thread.sleep(8000);
			     
			        //Select 'Moderate' option from Likehood drop-down	     
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
			      // Click on RiskImpact drop-down
			      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
			 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
			      Thread.sleep(8000);
			     // Thread.sleep(8000);
			     
			      //Select 'Major' option from Impact drop-down	      
			      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
			     
			      Thread.sleep(8000);
			      Thread.sleep(8000);


		              // Click on 'GoTo next Thread' button	      
			      	assertTextXpath("//*[@id='pVuln']");
			          clickByXpath("//*[@id='pVuln']");
			          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
			       Thread.sleep(8000);
			       Thread.sleep(8000);
		 	    

	//4th
		 	   //Select 'Yes' option in Response choice of listed Controls
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	     
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	    
	 	  //Select 'Yes' option in Response choice of listed Controls	 
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	 	    
	 	   Thread.sleep(8000); 
			 
		      //Click on RiskLikehood drop-down
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	     
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
		     
		      Thread.sleep(8000);
		      Thread.sleep(8000);


	              // Click on 'GoTo next Thread' button	      
		      	assertTextXpath("//*[@id='pVuln']");
		          clickByXpath("//*[@id='pVuln']");
		          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
		       Thread.sleep(8000);
		       Thread.sleep(8000);
	 	    
//5th
	 	   //Select 'Yes' option in Response choice of listed Controls
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);
     
      // Select 'Yes' option in Response choice of listed Controls	 	
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);
 	    
 	  //Select 'Yes' option in Response choice of listed Controls	 
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
 	    Thread.sleep(5000);
 	    //Thread.sleep(8000);
     
      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
 	    Thread.sleep(5000);
 	    //Thread.sleep(8000);
 	    

	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	 	    
	 	   Thread.sleep(8000); 
			 
		      //Click on RiskLikehood drop-down
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	     
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
		     
		      Thread.sleep(8000);
		      Thread.sleep(8000);


	              // Click on 'GoTo next Thread' button	      
		      	assertTextXpath("//*[@id='pVuln']");
		          clickByXpath("//*[@id='pVuln']");
		          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
		       Thread.sleep(8000);
		       Thread.sleep(8000);
	 	    

//6th
	 	   //Select 'Yes' option in Response choice of listed Controls
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);
     
      // Select 'Yes' option in Response choice of listed Controls	 	
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);
 	    
 	  //Select 'Yes' option in Response choice of listed Controls	 
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
 	    Thread.sleep(5000);
 	    //Thread.sleep(8000);
     
      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
 	    Thread.sleep(5000);
 	    //Thread.sleep(8000);
 	    
 	   Thread.sleep(8000); 
		 
	      //Click on RiskLikehood drop-down
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
	           Thread.sleep(8000);
	          //Thread.sleep(8000);
	     
	        //Select 'Moderate' option from Likehood drop-down	     
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	      // Click on RiskImpact drop-down
	      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
	 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
	      Thread.sleep(8000);
	     // Thread.sleep(8000);
	     
	      //Select 'Major' option from Impact drop-down	      
	      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
	     
	      Thread.sleep(8000);
	      Thread.sleep(8000);


           // Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	       Thread.sleep(8000);
	       Thread.sleep(8000);
 	    

	//7th
 	   //Select 'Yes' option in Response choice of listed Controls
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
 
  // Select 'Yes' option in Response choice of listed Controls	 	
 	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	  //Select 'Yes' option in Response choice of listed Controls	 
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	    Thread.sleep(5000);
	    //Thread.sleep(8000);
 
  // Select 'Yes' option in Response choice of listed Controls	 	
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	    Thread.sleep(5000);
	    //Thread.sleep(8000);
	    
	    Thread.sleep(8000); 
		 
	      //Click on RiskLikehood drop-down
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
	           Thread.sleep(8000);
	          //Thread.sleep(8000);
	     
	        //Select 'Moderate' option from Likehood drop-down	     
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	      // Click on RiskImpact drop-down
	      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
	 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
	      Thread.sleep(8000);
	     // Thread.sleep(8000);
	     
	      //Select 'Major' option from Impact drop-down	      
	      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
	     
	      Thread.sleep(8000);
	      Thread.sleep(8000);


            // Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	    
//8th
	    //Select 'Yes' option in Response choice of listed Controls
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
 
  // Select 'Yes' option in Response choice of listed Controls	 	
 	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	  //Select 'Yes' option in Response choice of listed Controls	 
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	    Thread.sleep(5000);
	    //Thread.sleep(8000);
	    
	    Thread.sleep(8000); 
		 
	      //Click on RiskLikehood drop-down
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
	           Thread.sleep(8000);
	          //Thread.sleep(8000);
	     
	        //Select 'Moderate' option from Likehood drop-down	     
	      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
	 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	      // Click on RiskImpact drop-down
	      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
	 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
	      Thread.sleep(8000);
	     // Thread.sleep(8000);
	     
	      //Select 'Major' option from Impact drop-down	      
	      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
	     
	      Thread.sleep(8000);
	      Thread.sleep(8000);


            // Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	       Thread.sleep(8000);
	       Thread.sleep(8000);
 
//9th
	    //Select 'Yes' option in Response choice of listed Controls
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
 
  // Select 'Yes' option in Response choice of listed Controls	 	
 	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	  //Select 'Yes' option in Response choice of listed Controls	 
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	    Thread.sleep(5000);
	    //Thread.sleep(8000);
 
  // Select 'Yes' option in Response choice of listed Controls	 	
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	    Thread.sleep(5000);
	    //Thread.sleep(8000);
	    

      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
 	    Thread.sleep(5000);
 	    //Thread.sleep(8000);
 	    

	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
		    Thread.sleep(5000);
		    
		    Thread.sleep(8000); 
			 
		      //Click on RiskLikehood drop-down
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	     
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
		     
		      Thread.sleep(8000);
		      Thread.sleep(8000);


	              // Click on 'GoTo next Thread' button	      
		      	assertTextXpath("//*[@id='pVuln']");
		          clickByXpath("//*[@id='pVuln']");
		          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
		       Thread.sleep(8000);
		       Thread.sleep(8000);
		    
		    
	//10th
		    
		    //Select 'Yes' option in Response choice of listed Controls
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);
     
      // Select 'Yes' option in Response choice of listed Controls	 	
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     
 	    Thread.sleep(8000);
 	    //Thread.sleep(8000);
 	    
 	  //Select 'Yes' option in Response choice of listed Controls	 
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
 	    Thread.sleep(5000);
 	    //Thread.sleep(8000);
     
      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
 	    Thread.sleep(5000);
 	    //Thread.sleep(8000);
 	    

	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	 	    

		      // Select 'Yes' option in Response choice of listed Controls	 	
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
			    Thread.sleep(5000);
			    
			    
			    Thread.sleep(8000); 
				 
			      //Click on RiskLikehood drop-down
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
			           Thread.sleep(8000);
			          //Thread.sleep(8000);
			     
			        //Select 'Moderate' option from Likehood drop-down	     
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
			      // Click on RiskImpact drop-down
			      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
			 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
			      Thread.sleep(8000);
			     // Thread.sleep(8000);
			     
			      //Select 'Major' option from Impact drop-down	      
			      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
			     
			      Thread.sleep(8000);
			      Thread.sleep(8000);


		              // Click on 'GoTo next Thread' button	      
			      	assertTextXpath("//*[@id='pVuln']");
			          clickByXpath("//*[@id='pVuln']");
			          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
			       Thread.sleep(8000);
			       Thread.sleep(8000);
			    
	//11th
	
			    //Select 'Yes' option in Response choice of listed Controls
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	     
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	    
	 	  //Select 'Yes' option in Response choice of listed Controls	 
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	 	    

		      // Select 'Yes' option in Response choice of listed Controls	 	
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
		 	    
		 	   Thread.sleep(8000); 
				 
			      //Click on RiskLikehood drop-down
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
			           Thread.sleep(8000);
			          //Thread.sleep(8000);
			     
			        //Select 'Moderate' option from Likehood drop-down	     
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
			      // Click on RiskImpact drop-down
			      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
			 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
			      Thread.sleep(8000);
			     // Thread.sleep(8000);
			     
			      //Select 'Major' option from Impact drop-down	      
			      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
			     
			      Thread.sleep(8000);
			      Thread.sleep(8000);


		              // Click on 'GoTo next Thread' button	      
			      	assertTextXpath("//*[@id='pVuln']");
			          clickByXpath("//*[@id='pVuln']");
			          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
			       Thread.sleep(8000);
			       Thread.sleep(8000);

	//12th
		 	   //Select 'Yes' option in Response choice of listed Controls
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	     
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	    
	 	  //Select 'Yes' option in Response choice of listed Controls	 
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	 	    

		      // Select 'Yes' option in Response choice of listed Controls	 	
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
		 	    

			      // Select 'Yes' option in Response choice of listed Controls	 	
			 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
			 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
			 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
			 	    Thread.sleep(5000);
			 	    //Thread.sleep(8000);
				    Thread.sleep(5000);

				    // Select 'Yes' option in Response choice of listed Controls	 	
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[13]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[13]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
			    Thread.sleep(5000);
			    
			    Thread.sleep(8000); 
				 
			      //Click on RiskLikehood drop-down
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
			           Thread.sleep(8000);
			          //Thread.sleep(8000);
			     
			        //Select 'Moderate' option from Likehood drop-down	     
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
			      // Click on RiskImpact drop-down
			      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
			 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
			      Thread.sleep(8000);
			     // Thread.sleep(8000);
			     
			      //Select 'Major' option from Impact drop-down	      
			      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
			     
			      Thread.sleep(8000);
			      Thread.sleep(8000);


		              // Click on 'GoTo next Thread' button	      
			      	assertTextXpath("//*[@id='pVuln']");
			          clickByXpath("//*[@id='pVuln']");
			          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
			       Thread.sleep(8000);
			       Thread.sleep(8000);
      
	//13th
			    
			 	   //Select 'Yes' option in Response choice of listed Controls
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	     
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	    
	 	  //Select 'Yes' option in Response choice of listed Controls	 
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	      
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	     
	      // Select 'Yes' option in Response choice of listed Controls	 	
	 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[7]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
	 	    Thread.sleep(5000);
	 	    //Thread.sleep(8000);
	 	    

		      // Select 'Yes' option in Response choice of listed Controls	 	
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[9]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
		 	    

			      // Select 'Yes' option in Response choice of listed Controls	 	
			 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
			 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[11]/td[5]/cw-s-response-choices/div/div/label[2]");
			 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
			 	    Thread.sleep(5000);
			 	    //Thread.sleep(8000);
				    Thread.sleep(5000);

				    // Select 'Yes' option in Response choice of listed Controls	 	
		 	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[13]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[13]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");	     
		 	    Thread.sleep(5000);
		 	    //Thread.sleep(8000);
			    Thread.sleep(5000);
			    
			    Thread.sleep(8000); 
				 
			      //Click on RiskLikehood drop-down
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
			 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
			           Thread.sleep(8000);
			          //Thread.sleep(8000);
			     
			        //Select 'Moderate' option from Likehood drop-down	     
			      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
			 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
			      // Click on RiskImpact drop-down
			      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
			 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
			      Thread.sleep(8000);
			     // Thread.sleep(8000);
			     
			      //Select 'Major' option from Impact drop-down	      
			      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
			 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
			     
			      Thread.sleep(8000);
			      Thread.sleep(8000);
			      
	  }
	  
	  
	@Test(priority=172, enabled =true)
	  public void Return_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		  
		  // Select Risk Questionnaire list sub-module under Risk Determination Module
	        
	        	  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
				  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
	            Reporter.log("Select Risk Questionnaire List | ");
	        Thread.sleep(8000);
	       //Thread.sleep(8000);     	
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  
	}
	
	@Test(priority=173, enabled =true)
	  public void QuickFilter_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
	
		  
		//Click on Media/Asset drop-down
 	     clickByXpath("//*[@id='control-type']");
 	     Thread.sleep(8000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
 	     Thread.sleep(8000);
 	     Thread.sleep(8000);
 	     clickByXpath("//*[@id='control-type']");
 	     Thread.sleep(8000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
 	     Thread.sleep(8000);
 	     Thread.sleep(8000);    
	
	}
	
	@Test(priority=174, enabled =true)
	public void Filters_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		Thread.sleep(8000);
 		Thread.sleep(8000);
      
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
 		//Thread.sleep(8000);
  
 		//Click on Media Drop-down
 		assertTextXpath("//div/ul/li/input");
 		clickByXpath("//div/ul/li/input");
 		Reporter.log("Click on Media Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
 		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
 		Reporter.log("Select value from Media Drop-down | ");
 		Thread.sleep(8000);
 		//Thread.sleep(8000);
 		//Thread.sleep(8000);

 		//click on Media label drop-down
 		assertTextXpath("//div[2]/div/div/ul/li/input");
 		clickByXpath("//div[2]/div/div/ul/li/input");
 		Reporter.log("Click on Media label Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[2]/div/div/div/ul/li");
 		clickByXpath("//div[2]/div/div/div/ul/li");
 		Reporter.log("Select value from Media label Drop-down | ");
 		Thread.sleep(8000);
 		//Thread.sleep(8000);
 		//Thread.sleep(8000);

 		//Click on Assets drop-down
 		assertTextXpath("//div[3]/div/div/ul/li/input");
 		clickByXpath("//div[3]/div/div/ul/li/input");
 		Reporter.log("Click on Asset Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[3]/div/div/div/ul/li");
 		clickByXpath("//div[3]/div/div/div/ul/li");
 		Reporter.log("Select value from Asset Drop-down | ");
 		Thread.sleep(8000);
 		//Thread.sleep(8000);

 		// Click on Thread Source drop-down
 		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
 		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
 		Reporter.log("Click on Thread Source Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
 		clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
 		Reporter.log("Select value from Thread Source Drop-down | ");
 		Thread.sleep(8000);
 		//Thread.sleep(8000);

 		//Click on Thread Event drop-down
 		assertTextXpath("//div[5]/div/div/div/ul/li/input");
 		clickByXpath("//div[5]/div/div/div/ul/li/input");
 		Reporter.log("Click on Thread Event Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[5]/div/div/div/div/ul/li");
 		clickByXpath("//div[5]/div/div/div/div/ul/li");
 		Reporter.log("Select value from Thread Event Drop-down | ");
 		Thread.sleep(8000);
   
 		// Click on Vulnerabilities drop-down
 		assertTextXpath("//div[6]/div/div/div/ul/li/input");
 		clickByXpath("//div[6]/div/div/div/ul/li/input");
 		Reporter.log("Click on Vulnerabilities Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[6]/div/div/div/div/ul/li");
 		clickByXpath("//div[6]/div/div/div/div/ul/li");
 		Reporter.log("Select value from Vulnerabilities Drop-down | ");
 		Thread.sleep(8000);

 		// Click on Controls drop-down
 		assertTextXpath("//div[2]/div/div/ul/li/input");
 		clickByXpath("//div[2]/div/div/ul/li/input");
 		Reporter.log("Click on Controls Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[2]/div/div/div/ul/li");
 		clickByXpath("//div[2]/div/div/div/ul/li");
 		Reporter.log("Select value from Controls Drop-down | ");
 		Thread.sleep(8000);

 		// Click on Control Response drop-down
 		assertTextXpath("//div[4]/div[2]/div/div/ul/li/input");
 		clickByXpath("//div[4]/div[2]/div/div/ul/li/input");
 		Reporter.log("Click on Control Response Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
 		clickByXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
 		Reporter.log("Select value from Control Response Drop-down | ");
 		Thread.sleep(8000);

 		// Click on NIST Family drop-down
 		assertTextXpath("//div[6]/div[2]/div/div/ul/li/input");
 		clickByXpath("//div[6]/div[2]/div/div/ul/li/input");
 		Reporter.log("Click on NIST Family Drop-down | ");
 		Thread.sleep(8000);
 		assertTextXpath("//div[6]/div[2]/div/div/div/ul/li");
 		clickByXpath("//div[6]/div[2]/div/div/div/ul/li");
 		Reporter.log("Select value from NIST Family Drop-down | ");
 		Thread.sleep(8000);
   
 		//Click on Submit button in Filter Pop-up
 		try {
 			assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
 			clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
 			Reporter.log("Click on Submit button in Filter Pop-up | ");
 			Thread.sleep(8000);
 		}catch(Exception e)
 		{
 			e.printStackTrace();
 			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
 		}
 		Thread.sleep(8000); 
 		//Thread.sleep(8000);   
 		//Thread.sleep(8000);   
      
      
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
 		Thread.sleep(8000);
 		Thread.sleep(8000);
		
	}
	@Test(priority=175, enabled =true)
	  public void IRMA8658_Export_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		Thread.sleep(8000);
		Thread.sleep(8000);
		  //Thread.sleep(2000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(8000);
		  // Thread.sleep(8000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		 // Thread.sleep(8000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(8000);
		  //Thread.sleep(8000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
	}
	@Test(priority=176, enabled =true)
	  public void IRMA5015_ProgressBar_ColumnHeaders_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		
		// Click on Progress Bar column Header
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[1]/div[1]/p");
		Thread.sleep(8000);	
		
		// Click on Media/label column Header
		assertEquals("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span", "Component/Group Name");
		Thread.sleep(2000);	
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
		Thread.sleep(2000);	
		
		// Click on Information Assets column Header 
		assertEquals("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span", "Information Assets");
		Thread.sleep(2000);	
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
		Thread.sleep(2000);	
		
		// Click on Total Sensitive Records column Header 
		assertEquals("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[4]/span[1]/span","Total Sensitive Records");
		Thread.sleep(2000);	
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[4]/span[1]/span");
		Thread.sleep(2000);	
		
		// Click on Risk Analyst column Header
		assertEquals("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[5]/span[1]/span","Risk Analyst");
		Thread.sleep(2000);	
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[5]/span[1]/span");		
		Thread.sleep(2000);	
		
		// Click on Due Date column Header 
		assertEquals("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[6]","Due Date");
		Thread.sleep(2000);	
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[6]");
		Thread.sleep(2000);	
		
		// Click on Action column Header 
		assertEquals("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[7]","Action");
		Thread.sleep(2000);	
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[7]");
		Thread.sleep(2000);		
		
		// Click on Multi-selector column Header 
		assertTextXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[8]");
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[8]");
		Thread.sleep(8000);	
		
	}
	
	@Test(priority=177, enabled =true)
	  public void RiskAnalyst_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		// Select the Risk Analyst drop-down		
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select");
		Thread.sleep(8000);
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select/option[3]");
		Thread.sleep(8000);
	}
	
	@Test(priority=178, enabled =true)
	  public void ReviewButton_RiskQuestionnaireList() throws InterruptedException, IOException {
		   
		Thread.sleep(8000);
		
		 // Click on 'Review' button of Media/Asset
       try {
       	assertTextXpath("//*[@id='content']/tr[2]/td[7]/div/div[2]/span");
	        clickByXpath("//*[@id='content']/tr[2]/td[7]/div/div[2]/span");
	        Reporter.log("Click on 'Review' button of Desktop Media/Asset | ");
       }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
	    }
       Thread.sleep(8000);
       Thread.sleep(8000);
       //Thread.sleep(8000);
      
      // 1st page	            
	    	    
       // Click on 'GoTo next Thread' button
       try {
       	assertTextXpath("//*[@id='pVuln']");
           clickByXpath("//*[@id='pVuln']");
           Reporter.log("First page - Click on 'GoTo next Thread' button | ");
       }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
	    }
       Thread.sleep(8000);
              
       //2nd page
       
       ArrowDown();
       ArrowDown();
       ArrowDown();
       ArrowDown();
       ArrowDown();
       ArrowDown();
       Thread.sleep(8000);
      
       // Click on 'GoTo next Thread' button
       try {
       	assertTextXpath("//*[@id='pVuln']");
           clickByXpath("//*[@id='pVuln']");
           Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
        }catch(Exception e)
	     {
	        e.printStackTrace();
	        Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
	     }
        Thread.sleep(6000);
              
        //3rd page       
        
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        Thread.sleep(8000);
        
       // Click on 'GoTo next Thread' button
       try {
       	assertTextXpath("//*[@id='pVuln']");
           clickByXpath("//*[@id='pVuln']");
           Reporter.log("Third Page - Click on 'GoTo next Thread' button | ");
       }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
	    }
       Thread.sleep(8000);
             
       // 4th page

       ArrowDown();
       ArrowDown();
       ArrowDown();
       ArrowDown();
       ArrowDown();
       ArrowDown();
       Thread.sleep(8000);
       
         // Click on 'GoTo next Thread' button
         try {
       	  assertTextXpath("//*[@id='pVuln']");
             clickByXpath("//*[@id='pVuln']");
             Reporter.log("Fourth Page - Click on 'GoTo next Thread' button | ");
         }catch(Exception e)
	      {
	           e.printStackTrace();
	           Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
	      }
         Thread.sleep(6000);
                
        //5th page
         ArrowDown();
         ArrowDown();
         ArrowDown();
         ArrowDown();
         ArrowDown();
         ArrowDown();
         Thread.sleep(8000);
      
         // Click on 'GoTo next Thread' button
         try {
       	  assertTextXpath("//*[@id='pVuln']");
             clickByXpath("//*[@id='pVuln']");
             Reporter.log("Fifth Page - Click on 'GoTo next Thread' button | ");
        }catch(Exception e)
	     {
	          e.printStackTrace();
	          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
	     }
        Thread.sleep(6000);
      
         //6th page
         
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        Thread.sleep(8000);
          // Click on 'GoTo next Thread' button
          try {
       	   assertTextXpath("//*[@id='pVuln']");
              clickByXpath("//*[@id='pVuln']");
              Reporter.log("Sixth Page - Click on 'GoTo next Thread' button | ");
          }catch(Exception e)
	       {
	          e.printStackTrace();
	          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
	       }
          Thread.sleep(6000);
          
        //7th page
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          Thread.sleep(8000);
            // Click on 'GoTo next Thread' button
            try {
         	   assertTextXpath("//*[@id='pVuln']");
                clickByXpath("//*[@id='pVuln']");
                Reporter.log("Sixth Page - Click on 'GoTo next Thread' button | ");
            }catch(Exception e)
 	       {
 	          e.printStackTrace();
 	          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
 	       }
            Thread.sleep(6000);
          
      
          //8th page
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          Thread.sleep(8000);
                
             // Click on 'save' button
             
   	          assertTextXpath("//*[@id='pMedia']");
                 clickByXpath("//*[@id='pMedia']");
                 Reporter.log("Select save button | ");
              Thread.sleep(8000);
              Thread.sleep(8000);
              //Thread.sleep(8000);	
              
              //9th page
              ArrowDown();
              ArrowDown();
              ArrowDown();
              ArrowDown();
              ArrowDown();
              ArrowDown();
              ArrowDown();
              ArrowDown();
              Thread.sleep(8000);
                    
                 // Click on 'save' button                 
       	          assertTextXpath("//*[@id='pMedia']");
                     clickByXpath("//*[@id='pMedia']");
                     Reporter.log("Select save button | ");
                  Thread.sleep(8000);
                  Thread.sleep(8000);
                  
                  //10th page
                  ArrowDown();
                  ArrowDown();
                  ArrowDown();
                  ArrowDown();
                  ArrowDown();
                  ArrowDown();
                  ArrowDown();
                  ArrowDown();
                  Thread.sleep(8000);
                        
                     // Click on 'save' button                     
           	          assertTextXpath("//*[@id='pMedia']");
                         clickByXpath("//*[@id='pMedia']");
                         Reporter.log("Select save button | ");
                      Thread.sleep(8000);
                      Thread.sleep(8000);
                    
                      
           // Select Risk Questionnaire list sub-module under Risk Determination Module
              assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
			  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
	   	        Thread.sleep(8000);
	   	        Thread.sleep(2000);
	   	        Thread.sleep(8000);
	   	        
	            //Click on Leave page Button 
	   	        clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
	   	        Thread.sleep(8000);
	   	        Thread.sleep(8000);
	   	       //Thread.sleep(8000); 
	}	 			      	     

	@Test(priority=179, enabled =false)
	  public void MultiSelector_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		Thread.sleep(8000);
		
		    // Click on Multi Selector Checkbox
	        clickByXpath("//*[@id='controls-review-select-all']");
	        Thread.sleep(8000);
	        
	     // Click on Multi Selector Checkbox
	        selectByXpath_Visibletext("//select", "Uma M");  
	        
	        // Enter Due date for listed Medias
	        sendvaluebyxpath("//cw-due-date-massive/input", "06/07/2018");
	        
	     // Click on Multi Selector Checkbox
	        clickByXpath("//span/img");
	        Thread.sleep(8000);
	}
	
	
	
	 @Test (priority=180, enabled = false)
     public void Sorting_RiskQuestionnaireList() throws IOException, InterruptedException {
	  Thread.sleep(8000);
	    Thread.sleep(8000);
	        //Thread.sleep(8000);
	        Thread.sleep(2000);
		   									
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	  
			Thread.sleep(8000);	
			//sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
	    	Thread.sleep(8000);	
			Thread.sleep(8000);	
											
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
			Thread.sleep(8000);	
			Thread.sleep(8000);				
			//sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);	
			
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
			Thread.sleep(8000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);	
				
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
		    Thread.sleep(8000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);
		
	 }
}