package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RQLUpdated extends WrapperClass{
	
	 public WebDriver driver;
	  String browser=null;
	
	  @Test(priority=300, enabled =true)
	  public void NavigatePage_RiskQuestionnaireList() throws InterruptedException {
		    
	        Thread.sleep(8000);
	              
		    //Click on Risk Questionnaire List Page
			  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
			  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
			  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);
		    Thread.sleep(8000);
		   
}
	  
	@Test(priority=301, enabled = false)
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
	
	 @Test(priority=302, enabled = false)
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
	   
	 @Test(priority=303, enabled = false)
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
		
	 @Test(priority=304, enabled = false)
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
	
	
	@Test(priority=305, enabled =true)
	  public void ContinueButton_RiskQuestionnaireForm() throws InterruptedException, IOException {
		
				 Thread.sleep(8000);
		  	   
		// Click on 'continue' button of component Groups
		 assertTextXpath("//*[@id='content']/tr[2]/td[7]/div/div[1]/span");
	 	        clickByXpath("//*[@id='content']/tr[2]/td[7]/div/div[1]/span");
	 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
    	        Thread.sleep(8000);
	        Thread.sleep(5000);
	        Thread.sleep(8000);
	        
	        
	}
	
	@Test(priority=306, enabled =false)
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
	
	 @Test(priority=307, enabled =false)
	   public void PanelBar_RiskQuestionnaireForm() throws IOException, InterruptedException {
			   
		   Thread.sleep(2000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Risk Questionnaire List Risk Questionnaire Form");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   
	   }
	   
	 @Test(priority=308, enabled = false)
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
		
	 @Test(priority=309, enabled = false)
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
	 
	 
	 @Test(priority=310, enabled =false)
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
	 
	 @Test(priority=311, enabled = true)
	  public void IRMA8332_ChkPercentageBar_RiskQuestionnaireForm() throws InterruptedException  {

		 Thread.sleep(8000); 
		 
		//Check the pecentage text
		  // assertEquals("//p[@class='invert-bar-progress']", "0%");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
	 }
	 
	 @Test(priority=312, enabled = true)
	  public void IRMA8409_DataFetchedOrNot_SecondControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {

		         Thread.sleep(3000);
		 
		         
		       //2nd page ---------------------------
		       //Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	   mouseHoverByXpath("//tr[1]//td[5]//cw-answer-media[1]//div[1]//ul[1]//li[1]//i[1]");
	 	  Thread.sleep(8000);
	 	 
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
				 clickByXpath("//tr[4]//td[5]//cw-answer-media[1]//div[1]//ul[1]//li[1]//i[1]");
				Thread.sleep(5000);
				
				
			    
	 }
	 
	
	 
	 @Test(priority=313, enabled = true)
	 public void Notes_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	Thread.sleep(8000); 
   
   //Click on Notes button to add text
   assertTextXpath("//tr[1]//td[7]//div[1]//a[1]//i[1]");
   clickByXpath("//tr[1]//td[7]//div[1]//a[1]//i[1]");
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
	 
	 @Test(priority=314, enabled =true)
	  public void NewFeature_ChkNoteType_RQL() throws InterruptedException, IOException {
	  
		  Thread.sleep(8000);
		// Click on Page breadcrumb
			assertEquals("//*[@id='note-details-table']/tbody/tr/td[3]", "Media Note");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(8000);
		   
	 }
		  
	
	 @Test(priority=315, enabled =true)
	  public void IRMA4934_ChkResponseInNotes_RQL() throws InterruptedException, IOException {
	  
		  Thread.sleep(8000);
		  
	   // Click on Page breadcrumb
		assertEquals("html/body/div[3]/div/div/div[2]/div/div[1]/table/tbody/tr[11]/td[2]/span", "In progress");
	   Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(8000);
	   
	 //Click on Close button in popup
	    clickBycssSelector(".modal-footer > .pull-right");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(8000);
	    Thread.sleep(8000); 
   
	 }
		 
	 @Test(priority=316, enabled = true)
	  public void HelpIcon_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		       
		    // Click ? Button
		 //assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[3]/div/span[3]/cw-message-help/button/i");
		    clickByXpath("//tr[1]/td[3]/div[1]/span[3]/span[1]/i[1]");
		    Reporter.log("Click ? Button | ");
		    Thread.sleep(8000);
	        
		    // Click on Close button in ? Pop-up
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
		    clickByXpath("html/body/div[3]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in ? Pop-up | ");
		    //clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Thread.sleep(8000);    
  
		 
	 }
	 
	 @Test(priority=317, enabled = true)
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
	 
	 
	 @Test(priority=318, enabled = true)
	  public void RiskRatingvalues_SecondControlresponse_RiskQuestionnaireForm() throws InterruptedException, IOException {
		 
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
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[3]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		     
		       
	 }
	 @Test(priority=319, enabled = true)
	  public void RiskRatingNotes_SecondControlsResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	    			  
	    			 Thread.sleep(8000); 
	    	   
	    	  //Click on Notes button to add text
	           //assertTextXpath("//*[@id='body-content']/div[1]/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a");
	    	    clickByXpath("//*[@id='body-content']/div/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a/strong");
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
	 
	 @Test(priority=320, enabled = true)
	  public void IRMA9469_RiskRatingNotesCount_SecondControlsResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	    			  
	    			 Thread.sleep(8000); 
	    		    // Click on Page breadcrumb
	     			   assertEquals("//*[@id='body-content']/div[1]/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a", "2");
	    			   Reporter.log("Click on Page breadcrumb | ");
	    			   Thread.sleep(2000);
	    			 
	    			   
	 
	 }
	 
	 @Test(priority=321, enabled = true)
	  public void NewFeature_RiskXofY_SecondControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		 //assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 1 of 11"); 
		 Thread.sleep(8000);
		 }
	 
	 @Test(priority=322, enabled = true)
	  public void ThirdControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {

		 Thread.sleep(8000);
		 
		// Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     	       Thread.sleep(8000);
	       Thread.sleep(8000);
	 
		      
		      //3rd page ---------------------
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
						 	 assertTextXpath("//tr[6]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
							 	clickByXpath("//tr[6]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
							 	Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
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
						      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[2]/a");
						 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[2]/a");
						 	        Reporter.log("Select 'Major' option from Impact drop-down | ");     
						      Thread.sleep(8000);
						      Thread.sleep(8000);
						      
	 }
	 
	 @Test(priority=323, enabled = true)
	  public void IRMA9469_RiskRatingNotesCount_ThirdControlsResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

	    			  
	    	 Thread.sleep(8000); 
		    // Click on Page breadcrum
	    	 assertEquals("//*[@id='body-content']/div[1]/div/div[1]/div[3]/div/div[2]/table/tbody/tr[1]/td[5]/div/div/a", "0");
	    	  Reporter.log("Click on Page breadcrumb | ");
	    	  Thread.sleep(8000);
	    	 
	 
	 }
	 
	 @Test(priority=324, enabled = true)
	  public void NewFeature_RiskXofY_ThirdControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		 //assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 2 of 11"); 
		 Thread.sleep(8000);
		 }
	 
	 @Test(priority=325, enabled = true)
	  public void FourControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {

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
	      
	     
	     
	       
	 }
	 
	 @Test(priority=326, enabled = true)
	  public void NewFeature_RiskXofY_FourthControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		// assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 3 of 11"); 
		 Thread.sleep(3000);
		 }
	 
	 @Test(priority=327, enabled = true)
	  public void FifthControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {

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
		     
		  /*  // Select 'Yes' option in Response choice of listed Controls	 
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
			     Thread.sleep(5000);*/
				     
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
	       
	 }
	 
	 @Test(priority=328, enabled = true)
	  public void NewFeature_RiskXofY_FifthControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		// assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 4 of 11"); 
		 Thread.sleep(3000);
		 }
	 
	 @Test(priority=329, enabled = true)
	  public void ClearResponse_SixthControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {

		 Thread.sleep(3000);
		 
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
		     
		    // Click on Clear button to clear the response
			  assertTextXpath("//*[@id='cgControl.control_response.id']/div/span/i");
			  clickByXpath("//*[@id='cgControl.control_response.id']/div/span/i");
			  Reporter.log("Click on Clear button to clear the response | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);
			 
			  
	 }
	 
	 @Test(priority=330, enabled = true)
	  public void SelectedAgainResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000); 
			  
			//1st page
		//Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);
	 	    
	 
	 	    
	 }
	 
	 @Test(priority=330, enabled = true)
	  public void IRMA7970_IRMA7668_DeleteCustomControl_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
		 Thread.sleep(8000); 
	
		     
	 	/*// 1st page	           
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
		 	  Thread.sleep(8000); */
		 	 Thread.sleep(8000); 
		 	Thread.sleep(8000); 
		 	
	 }
	 
	 @Test(priority=331, enabled = true)
	  public void NewFeature_RiskXofY_SixthControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		 //assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 5 of 11"); 
		 Thread.sleep(3000);
		 } 
	  
	 
	 @Test(priority=332, enabled = true)
	  public void SeventhControlsResponse_RiskQuestionnaireForm() throws InterruptedException, IOException  {

		 Thread.sleep(3000);
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
	       
		//1st page
		//Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);
	 	    //Thread.sleep(8000);   
		    Thread.sleep(5000);
		    
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
			    
			       
		 
		     
	 }
	 
	 @Test(priority=333, enabled = true)
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
	     
	 }
	 
	 @Test(priority=334, enabled = true)
	  public void NewFeature_RiskXofY_SeventhControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		// assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 6 of 11"); 
		 Thread.sleep(3000);
		 }
	 
	   @Test(priority=335, enabled = true)
	  public void EightControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {


		  // Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
	       Thread.sleep(8000);
	       
		 //Select 'Yes' option in Response choice of listed Controls
		  	assertTextXpath("//label[2]");
	 	    clickByXpath("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 	    Thread.sleep(8000);	 	    
	 	    //Thread.sleep(8000  
	 	    
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
	     
	      
	       
	 }
	   
	   @Test(priority=336, enabled = true)
		  public void NewFeature_RiskXofY_NinthControlsResponse() throws InterruptedException  {

			 Thread.sleep(3000);		 
			 //assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 7 of 11"); 
			 Thread.sleep(3000);
			 }
	 
	 @Test(priority=337, enabled = false)
	  public void NinthControlsResponse_RiskQuestionnaireForm() throws InterruptedException  {

		 Thread.sleep(3000);
		 
		// Click on 'GoTo next Thread' button	      
	      	assertTextXpath("//*[@id='pVuln']");
	          clickByXpath("//*[@id='pVuln']");
	          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
	     
	       Thread.sleep(8000);
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
	 
	  @Test(priority=338, enabled = false)
	  public void NewFeature_RiskXofY_TenthControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		// assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 8 of 11"); 
		 Thread.sleep(3000);
		 }
	
	  
	  @Test(priority=339, enabled = false)
		 public void TenthControlResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {
			 
			 Thread.sleep(8000); 
			 // Click on 'GoTo next Thread' button
		      	assertTextXpath("//*[@id='pVuln']");
		          clickByXpath("//*[@id='pVuln']");
		          Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
		     
		       Thread.sleep(8000);
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
		      
	 }
	  
	  @Test(priority=340, enabled = false)
	  public void NewFeature_RiskXofY_ElevenControlsResponse() throws InterruptedException  {

		 Thread.sleep(3000);		 
		// assertEquals("//*[@id='body-content']/div/div/div[1]/div[4]/div/div/div[5]/div", "Risk 9 of 11"); 
		 Thread.sleep(3000);
		 }
	  
	  @Test(priority=341, enabled = false)
		 public void ElevenControlResponse_RiskQuestionnaireForm() throws InterruptedException, IOException {
			 
			 Thread.sleep(8000); 
			 
			 // Click on 'GoTo next Thread' button
		     	assertTextXpath("//*[@id='pVuln']");
		         clickByXpath("//*[@id='pVuln']");
		         Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
		    
		      Thread.sleep(8000);
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
		
          
	 } 
	  
	  @Test(priority=342, enabled =true)
	  public void AllFields_RiskQuestionnaireList() throws InterruptedException, IOException {
     
		  Thread.sleep(8000);
		  	        
 	        // Click on Return to RQL button
 	        clickByXpath("//*[@id='rMedia']");
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
	  
	  @Test(priority=343, enabled =true)
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
	
	@Test(priority=344, enabled =true)
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

   
 		//Click on Submit button in Filter Pop-up
 		assertTextXpath("//div[3]/button[2]");
			clickByXpath("//div[3]/button[2]");
			Reporter.log("Click on Submit button in Filter Pop-up | ");
			Thread.sleep(3000);
 		Thread.sleep(8000); 
 		//Thread.sleep(8000);   
 		//Thread.sleep(8000);   
      
      
 		//Click on 'Clear Filter' Button 
 		
 			assertTextXpath("//i[2]");
 			clickByXpath("//i[2]");
 			Reporter.log("Click on 'Clear Filter' Button  | ");
 		
 		Thread.sleep(8000);
 		Thread.sleep(8000);
		
	}
	@Test(priority=345, enabled =true)
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
	@Test(priority=346, enabled =true)
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
	
	@Test(priority=347, enabled =true)
	  public void RiskAnalyst_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		// Select the Risk Analyst drop-down		
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select");
		Thread.sleep(8000);
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select/option[3]");
		Thread.sleep(8000);
	}
	
	@Test(priority=348, enabled =true)
	  public void ReviewButton_RiskQuestionnaireList() throws InterruptedException, IOException {
		   
		Thread.sleep(8000);
		
		 // Click on 'Review' button of Media/Asset
          	assertTextXpath("//*[@id='content']/tr[2]/td[7]/div/div[2]/span");
	        clickByXpath("//*[@id='content']/tr[2]/td[7]/div/div[2]/span");
	        Reporter.log("Click on 'Review' button of Desktop Media/Asset | ");
   
       Thread.sleep(8000);
       Thread.sleep(8000);
       Thread.sleep(8000);
      
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
              
             /* //9th page
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
                      Thread.sleep(8000);*/
                    
                      
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
	   	  
	}	 			      	     

	@Test(priority=349, enabled =false)
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
	
	
	
	 @Test (priority=350, enabled = true)
     public void Sorting_RiskQuestionnaireList() throws IOException, InterruptedException {
	  
		 Thread.sleep(8000);
	  
		   									
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

