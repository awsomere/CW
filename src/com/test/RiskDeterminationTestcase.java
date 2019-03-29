package com.test;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import com.test.WrapperClass;


public class RiskDeterminationTestcase extends WrapperClass {
	
	 public WebDriver driver;
	  String browser=null;
	
	  @Test(priority=95, enabled =true)
	  public void NavigatePage_RiskQuestionnaireList() throws InterruptedException, IOException {
		  
		   
		    Thread.sleep(8000);	
		    Thread.sleep(8000);	
		    Thread.sleep(8000);	
		    Thread.sleep(8000);	
		    Thread.sleep(8000);	

		    		           	        
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
	        
		    //Click on Risk Questionnaire List Page
	        assertTextLink("Risk Questionnaire List");
            clickBylinktext("Risk Questionnaire List");
		    Reporter.log("Click on Controls Review Page | ");
		    Thread.sleep(8000);
		    Thread.sleep(2000);
		    Thread.sleep(3000);
		    //Thread.sleep(3000); 
			//Thread.sleep(3000);
			//Thread.sleep(3000);	
}
	  
	@Test(priority=96, enabled = true)
	  public void PageHearder_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
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
	
	 @Test(priority=97, enabled = true)
	   public void PanelBar_RiskQuestionnaireList() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Risk Questionnaire List");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   // Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 7 of 7 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
	   }
	   
	 @Test(priority=98, enabled = true)
	 public void PageLevelHelp_RiskQuestionnaireList() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[5]/div/div/div[3]/button");
	     clickByXpath("html/body/div[5]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(3000);
		   // Thread.sleep(3000);
		   
	 }
		
	 @Test(priority=99, enabled = true)
	 public void RiskManagementMap_RiskQuestionnaireList() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[5]/div/div/div[2]/button");
		   Thread.sleep(3000);
	 }
	
	
	@Test(priority=100, enabled =false)
	  public void PageHearder_RiskQuestionnaireForm() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
		// Click on 'continue' button of Media/Asset
	        try {
	        	assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        clickByXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
      }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
		    }
	        Thread.sleep(8000);
	        Thread.sleep(2000);
	        //Thread.sleep(3000);
	        
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
	
	 @Test(priority=101, enabled = false)
	   public void PanelBar_RiskQuestionnaireForm() throws IOException, InterruptedException {
			   
		   Thread.sleep(2000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Risk Questionnaire List Risk Questionnaire Form");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   
	   }
	   
	 @Test(priority=102, enabled = false)
	 public void PageLevelHelp_RiskQuestionnaireForm() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(3000);
		  Thread.sleep(3000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[4]/div/div/div[3]/button");
	     clickByXpath("//div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(3000);
		  Thread.sleep(3000);
		   
	 }
		
	 @Test(priority=103, enabled = false)
	 public void RiskManagementMap_RiskQuestionnaireForm() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[4]/div/div/div[2]/button");
		   Thread.sleep(8000);
		   
		// Click on 'Return to Risk Questionnaire List' button of Media/Asset
	        try {
	        	assertTextXpath("//*[@id='rMedia']");
	 	        clickByXpath("//*[@id='rMedia']");
	 	        Reporter.log("Click on 'Return to Risk Questionnaire List' button | ");
     }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'Return to Risk Questionnaire List' button doesnt work | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);  
	        
	        //Click on Leave Page button 
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Leave Page button | ");
	       Thread.sleep(3000); 
	 }
	 
	 @Test(priority=104, enabled = false)
	  public void RQLBackUp_RiskQuestionnaire() throws InterruptedException, IOException {
  
		  
		 Thread.sleep(3000); 
		 Thread.sleep(3000); 
		 
	        // Click on 'continue' button of Media/Asset
	        try {
	        	assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        clickByXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
        }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	 
     // 1st page	           
     // Click on Add a Custom Control	  
	    assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
	    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
	    Reporter.log("Click on Add a Custom Control	| ");
	    Thread.sleep(3000); 

    // Click on Add a Custom Control textbox		  
	    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
	    clickByXpath("//cw-add-custom-control/div/div/div/div/div/input");
	    Reporter.log("Click on Add a Custom Control tetbox| ");
	    Thread.sleep(2000); 

    // Enter the New Custom Control
	    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
	    sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div/input", "TestControls");
	    Reporter.log("Enter the New Custom Controls| ");
	    Thread.sleep(3000); 

	    // Click from listed add custom controls		  
	    assertTextXpath("//div/strong");
	    clickByXpath("//div/strong");
	    Reporter.log("Click from listed add custom controls | ");
	    Thread.sleep(8000); 
	    
	    // Select 'Yes' option in Response choice of listed Controls
	       try {
	    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        }catch(Exception e)
		   {
		       e.printStackTrace();
		       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		   }
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	       //Thread.sleep(3000);
	       
	    // Select 'Yes' option in Response choice of listed Controls
    try {
 	   //assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
  }catch(Exception e)
	   {
	       e.printStackTrace();
	       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	   }
    Thread.sleep(3000);
    Thread.sleep(8000);
    
   /* //Click on Global checkbox
    assertTextXpath("//tr[2]/td[7]/cw-s-response-global/div/div/label");
    clickByXpath("//tr[2]/td[7]/cw-s-response-global/div/div/label");
    Reporter.log("Click on Global checkbox | ");
    Thread.sleep(3000);
    Thread.sleep(8000);
    
   //Click on Proceed Button In Warning Pop-up
    assertTextXpath("//div[4]/div/div/div[3]/button");
    clickByXpath("//div[4]/div/div/div[3]/button");
    Reporter.log("Click on Proceed Button In Warning Pop-up | ");
    Thread.sleep(8000);
     
   //Click on Proceed Button In Warning Pop-up
     assertTextXpath("//div[4]/div/div/div[3]/button");
     clickByXpath("//div[4]/div/div/div[3]/button");
     Reporter.log("Click on Proceed Button In Warning Pop-up | ");
     Thread.sleep(8000);
     */
    
    /*//Click on Notes button to add text
    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div[1]/a");
    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div[1]/a");
    Reporter.log("Click on Notes button to add text | ");
    Thread.sleep(8000);
    //Thread.sleep(3000);
    
    //Click on New button in Notes pop-up window
    assertTextXpath("//div/a/span");
    clickByXpath("//div/a/span");
    Reporter.log("Click on New button in Notes pop-up window | ");
    Thread.sleep(8000);
    //Thread.sleep(3000);
    
    // Enter Text for Note textarea
    assertTextXpath("//textarea");
    sendvaluebyxpath("//textarea", "created notes");
    Reporter.log("Enter Text for Note textarea | ");
    Thread.sleep(8000);
    //Thread.sleep(8000);
    
    // Click on Create Button
    assertTextXpath("//div[4]/div[3]/button");
    clickByXpath("//div[4]/div[3]/button");
    Reporter.log("Click on Create Button | ");
    Thread.sleep(8000);
    //Thread.sleep(8000);
    
 // Select any one of the Listed Notes
    assertTextXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
    clickByXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
    Reporter.log("Select any one of the Listed Notes | ");
    Thread.sleep(8000);
    //Thread.sleep(8000);
    
 // Click on Edit Button
    assertTextXpath("//a[2]/span");
    clickByXpath("//a[2]/span");
    Reporter.log("Click on Edit Button | ");
    Thread.sleep(8000);
    //Thread.sleep(8000);
    
   // Enter Text for Note textarea
    assertTextXpath("//textarea");
    sendvaluebyxpath("//textarea", "Edit notes");
    Reporter.log("Enter Text for Note textarea | ");
    Thread.sleep(8000);
    //Thread.sleep(8000);
    
    // Click on Save Button
    assertTextXpath("//div[4]/div[3]/button");
    clickByXpath("//div[4]/div[3]/button");
    Reporter.log("Click on Save Button | ");
    Thread.sleep(8000);
    //Thread.sleep(8000);
    
    //Click on Close button in popup
    assertTextXpath("//div[4]/div/div/div[3]/button");
    clickByXpath("//div[4]/div/div/div[3]/button");
    Reporter.log("Click on Close button in popup | ");
    Thread.sleep(5000);
    Thread.sleep(3000);*/
    
    //Expand the Controls
    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
     Reporter.log("Expand the Controls | ");
     Thread.sleep(8000);
     
     //Expand the Controls
     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
      Reporter.log("Expand the Controls | ");
      Thread.sleep(8000);
    
    Thread.sleep(8000);
    
  //Expand the Controls
    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
    Reporter.log("Expand the Controls | ");
    Thread.sleep(8000);
    
      // Select 'Inprogress' option in Response choice of listed Controls
      assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[4]/cw-s-response-choices/div/div/label[2]");
      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[4]/cw-s-response-choices/div/div/label[2]");
      Reporter.log("Select 'Inprogress' option in Response choice of listed Controls | ");
    Thread.sleep(8000);
    
    // Select 'No' option in Response choice of listed Controls
      assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[4]/cw-s-response-choices/div/div/label[3]");
      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[4]/cw-s-response-choices/div/div/label[3]");
      Reporter.log("Select 'NO' option in Response choice of listed Controls | ");
        Thread.sleep(8000);
   
       // Select 'NA' option in Response choice of listed Controls
        assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[4]/cw-s-response-choices/div/div/label[4]");
        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[4]/cw-s-response-choices/div/div/label[4]");
        Reporter.log("Select 'NA' option in Response choice of listed Controls | ");
        Thread.sleep(3000);	
        Thread.sleep(8000);
        
      //Click on Notes button to add text
	    assertTextXpath("//tr[5]/td[7]/div/a/strong");
	    clickByXpath("//tr[5]/td[7]/div/a/strong");
	    Reporter.log("Click on Notes button to add text | ");
	    Thread.sleep(8000);
	    //Thread.sleep(3000);
	    
	    //Click on New button in Notes pop-up window
	    assertTextXpath("//div/a/span");
	    clickByXpath("//div/a/span");
	    Reporter.log("Click on New button in Notes pop-up window | ");
	    Thread.sleep(8000);
	    //Thread.sleep(3000);
	    
	    // Enter Text for Note textarea
	    assertTextXpath("//textarea");
	    sendvaluebyxpath("//textarea", "created notes");
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
	    assertTextXpath("//div[4]/div/div/div[3]/button");
	    clickByXpath("//div[4]/div/div/div[3]/button");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(8000);
	    Thread.sleep(3000);
  	         
      //Expand the Controls
     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
      Reporter.log("Expand the Controls | ");
      Thread.sleep(8000);
      Thread.sleep(8000);
      
    /*//Click on Global checkbox
      assertTextXpath("//cw-s-response-global/div/div/label");
      clickByXpath("//cw-s-response-global/div/div/label");
      Reporter.log("Click on Global checkbox | ");
      Thread.sleep(3000);
      Thread.sleep(8000);
      
     //Click on Proceed Button In Warning Pop-up
      assertTextXpath("//div[4]/div/div/div[3]/button");
      clickByXpath("//div[4]/div/div/div[3]/button");
      Reporter.log("Click on Proceed Button In Warning Pop-up | ");
      Thread.sleep(8000);*/
    	      
    
    /*//Click on Notes button to add text
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[8]/div[1]/a");
	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[8]/div[1]/a");
	    Reporter.log("Click on Notes button to add text | ");
	    Thread.sleep(8000);
	    //Thread.sleep(3000);
	    
	    //Click on New button in Notes pop-up window
	    assertTextXpath("//div/a/span");
	    clickByXpath("//div/a/span");
	    Reporter.log("Click on New button in Notes pop-up window | ");
	    Thread.sleep(8000);
	    //Thread.sleep(3000);
	    
	    // Enter Text for Note textarea
	    assertTextXpath("//textarea");
	    sendvaluebyxpath("//textarea", "created notes");
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
	    assertTextXpath("//div[4]/div/div/div[3]/button");
	    clickByXpath("//div[4]/div/div/div[3]/button");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(8000);
	    Thread.sleep(3000);
	    
	    //Click on Document to upload
	    assertTextXpath("//a[2]/a/strong");
	    clickByXpath("//a[2]/a/strong");
	    Reporter.log("Click on Document to upload | ");
	    Thread.sleep(8000);
	    
	    //Click on New button from document pop-up
	    assertTextXpath("//div/a/span");
	    clickByXpath("//div/a/span");
	    Reporter.log("Click on New button from document pop-up | ");
	    Thread.sleep(8000);
	    
	    //Click on Choose File from document pop-up
	    assertTextXpath("//div/div/div/div/div/div/div/input");
	    clickByXpath("//div/div/div/div/div/div/div/input");
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
	    Thread.sleep(3000);
	    Thread.sleep(3000);
   
	    //Select any one of the listed item
	    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
	    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
	    Reporter.log("Select any one of the listed item | ");
	    Thread.sleep(3000);
	 		    	    	    
	  //Select Delete button in Uploaded Document
	    assertTextXpath("//a[2]/span");
	    clickByXpath("//a[2]/span");
	    Reporter.log("Select Delete button in Uploaded Document | ");
	    Thread.sleep(3000);
	    
	    // Click on Delete button in Deleted Pop-up
	    assertTextXpath("//div[3]/button[1]");
	    clickByXpath("//div[3]/button[1]");
	    Reporter.log("Click on Delete button in Deleted Pop-up | ");
	    Thread.sleep(8000);		    
	  
	    // Click on Close button		  
	    assertTextXpath("//div[4]/div/div/div[3]/button");
	    clickByXpath("//div[4]/div/div/div[3]/button");
	    Reporter.log("Click on CLose Button | ");
	    Thread.sleep(3000); 
	    Thread.sleep(3000); */
	    
    /* //Expand the Controls
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	    Reporter.log("Expand the Controls | ");
	    Thread.sleep(3000);
	    
	    //Expand the Controls
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	    Reporter.log("Expand the Controls | ");
	    Thread.sleep(3000);
	      
	    // Click ? Button
	    assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[3]/i");
	    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[3]/i");
	    Reporter.log("Click ? Button | ");
	    Thread.sleep(8000);
        
	    // Click on Close button in ? Pop-up
	    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
	    clickByXpath("html/body/div[4]/div/div/div[3]/button");
	    Reporter.log("Click on Close button in ? Pop-up | ");
	    //clickByXpath("html/body/div[4]/div/div/div[3]/button");
     Thread.sleep(8000);    */
    	      
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    Thread.sleep(5000);
	    
    //Click on RiskLikehood drop-down
    try {
 	    assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	       Reporter.log("Click on RiskLikehood drop-down | ");
   }catch(Exception e)
	   {
	        e.printStackTrace();
	        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	   }
    Thread.sleep(3000);
    //Thread.sleep(3000);
    
    //Select 'Moderate' option from Likehood drop-down
    try {
 	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	       Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
   }catch(Exception e)
	   {
	        e.printStackTrace();
	        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	   }
    Thread.sleep(3000);
    Thread.sleep(3000);
    
     // Click on RiskImpact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        Reporter.log("Click on RiskImpact drop-down | ");
    }catch(Exception e)
	    {
	          e.printStackTrace();
	          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	   }
    Thread.sleep(3000);
    //Thread.sleep(3000);
    	       
     //Select 'Major' option from Impact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select 'Major' option from Impact drop-down | ");
    }catch(Exception e)
	   {
	        e.printStackTrace();
	        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	   }
    Thread.sleep(3000);
    Thread.sleep(3000);
    
  /*//Click on Notes button to add text
    assertTextXpath("//*[@id='body-content']/div[1]/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/a");
    clickByXpath("//*[@id='body-content']/div[1]/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/a");
    Reporter.log("Click on Notes button to add text | ");
    Thread.sleep(8000);
    //Thread.sleep(8000);
    
    //Click on New button in Notes pop-up window
    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
    Reporter.log("Click on New button in Notes pop-up window | ");
    Thread.sleep(3000);
    //Thread.sleep(8000);
    
    // Enter Text for Note textarea
    assertTextXpath("//textarea");
    sendvaluebyxpath("//textarea", "created Risk notes");
    Reporter.log("Enter Text for Note textarea | ");
    Thread.sleep(3000);
    //Thread.sleep(8000);
    
	    // Click on Create Button
	    assertTextXpath("//div[4]/div[3]/button");
	    clickByXpath("//div[4]/div[3]/button");
	    Reporter.log("Click on Create Button | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);   
	    
	    
	   //Click on New button in Notes pop-up window
	    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    Reporter.log("Click on New button in Notes pop-up window | ");
	    Thread.sleep(3000);
	    //Thread.sleep(8000);
	    
	    // Enter Text for Note textarea
	    assertTextXpath("//textarea");
	    sendvaluebyxpath("//textarea", "created second Risk notes");
	    Reporter.log("Enter Text for Note textarea | ");
	    Thread.sleep(3000);
	    //Thread.sleep(8000);
	    
	    // Click on Create Button
	    assertTextXpath("//div[4]/div[3]/button");
	    clickByXpath("//div[4]/div[3]/button");
	    Reporter.log("Click on Create Button | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    	  	   
	    //Click on Close button in popup
	    assertTextXpath("//div[4]/div/div/div[1]/button");
	    clickByXpath("//div[4]/div/div/div[1]/button");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000); */
	    	    
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
     Thread.sleep(3000);
     Thread.sleep(3000);
     
/*     //2nd page
     //Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     }catch(Exception e)
		{
		    e.printStackTrace();
		    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		}
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
    
     // Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     }catch(Exception e)
		{
		    e.printStackTrace();
		    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		}
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
    
     //Click on RiskLikehood drop-down
     try {
     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	        Reporter.log("Click on RiskLikehood drop-down | ");
    }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	   }
    Thread.sleep(8000);
    //Thread.sleep(3000);
    
     //Select 'Moderate' option from Likehood drop-down
     try {
     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
    }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	    }
     Thread.sleep(3000);
     Thread.sleep(3000);
     
     // Click on RiskImpact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        Reporter.log("Click on RiskImpact drop-down | ");
    }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	    }
     Thread.sleep(8000);
    // Thread.sleep(3000);
    
     //Select 'Major' option from Impact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select 'Major' option from Impact drop-down | ");
    }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	     }
     Thread.sleep(3000);
     Thread.sleep(3000);
    
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
      Thread.sleep(3000);
      Thread.sleep(3000);*/
    
     //3rd page
     //Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     }catch(Exception e)
		{
		    e.printStackTrace();
		    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		}
	    Thread.sleep(5000);
	    //Thread.sleep(3000);
    
     // Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     }catch(Exception e)
		{
		    e.printStackTrace();
		    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		}
	    Thread.sleep(5000);
	    //Thread.sleep(3000);
    
     // Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     }catch(Exception e)
		{
		    e.printStackTrace();
		    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		}
	    //Thread.sleep(8000);
	    Thread.sleep(3000);
	          		       
     //Click on RiskLikehood drop-down
     try {
     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	        Reporter.log("Click on RiskLikehood drop-down | ");
    }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	   }
    Thread.sleep(8000);
    //Thread.sleep(3000);
    
     //Select 'Moderate' option from Likehood drop-down
     try {
     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
    }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	    }
     Thread.sleep(3000);
     Thread.sleep(3000);
     
     // Click on RiskImpact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        Reporter.log("Click on RiskImpact drop-down | ");
    }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	    }
     Thread.sleep(8000);
    // Thread.sleep(3000);
    
     //Select 'Major' option from Impact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select 'Major' option from Impact drop-down | ");
    }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	     }
     Thread.sleep(3000);
     Thread.sleep(3000);
    
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
      Thread.sleep(3000);
      Thread.sleep(3000);
      
      
      //8rd page       
      
      // Select 'Yes' option in Response choice of listed Controls
	     try {
	    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
       }catch(Exception e)
		  {
		      e.printStackTrace();
		      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		   }
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	       
    
	    // Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
	        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
 }catch(Exception e)
	    {
	    e.printStackTrace();
         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
     }
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
    
 // Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
	        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	    }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	    }
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
    
     // Select 'Yes' option in Response choice of listed Controls
     try {
     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	    }catch(Exception e)
     {
         e.printStackTrace();
	        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	    }
 Thread.sleep(3000);
 //Thread.sleep(3000);
    
 // Select 'Yes' option in Response choice of listed Controls
 try {
 	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
  }catch(Exception e)
  {
     e.printStackTrace();
     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
 }
 Thread.sleep(3000);
 //Thread.sleep(3000);

 // Select 'Yes' option in Response choice of listed Controls
     try {
     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[5]/cw-s-response-choices/div/div/label[2]");
         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[5]/cw-s-response-choices/div/div/label[2]");
         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
     }catch(Exception e)
     {
         e.printStackTrace();
         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
     }
	    //Thread.sleep(8000);
	    Thread.sleep(3000);
    	       
     //Click on RiskLikehood drop-down
     try {
     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	        Reporter.log("Click on RiskLikehood drop-down | ");
 }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	    }
     Thread.sleep(8000);
     //Thread.sleep(3000);
    
     //Select 'Moderate' option from Likehood drop-down
     try {
     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
 }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	    }
     Thread.sleep(3000);
     Thread.sleep(3000);
    
     // Click on RiskImpact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	        Reporter.log("Click on RiskImpact drop-down | ");
 }catch(Exception e)
	    {
	        e.printStackTrace();
	        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	    }
     Thread.sleep(8000);
     //Thread.sleep(3000);
    
     //Select 'Major' option from Impact drop-down
     try {
     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select 'Major' option from Impact drop-down | ");
 }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	    }
     Thread.sleep(3000);
     Thread.sleep(3000);  
     
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
      Thread.sleep(3000);
      Thread.sleep(3000);
          
     // 4th page
     // Select 'Yes' option in Response choice of listed Controls
	    try {
	    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
      }catch(Exception e)
		 {
		    e.printStackTrace();
		    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		 }
	     Thread.sleep(3000);
	     //Thread.sleep(3000);
	     
	     // Click on Clear button to clear the response 
		  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[6]/cw-s-response-clear/div/span/i");
		  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[6]/cw-s-response-clear/div/span/i");
		  Reporter.log("Click on Clear button to clear the response | ");
		  Thread.sleep(8000);
		  //Thread.sleep(3000);
		  
		// Click on Remove button to clear the response 
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  Reporter.log("Click on Remove button to clear the response | ");
		  Thread.sleep(8000);
		 // Thread.sleep(3000);
		  
		// Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	         }catch(Exception e)
			 {
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			 }
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
	  			     
		  /* // Click on Add a Custom Control	  
		     assertTextXpath("//cw-add-custom-control/div/div/span");
		     clickByXpath("//cw-add-custom-control/div/div/span");
		     Reporter.log("Click on Add a Custom Control	| ");
		     Thread.sleep(3000); 

		     // Click on Add a Custom Control textbox		  
		     //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		     clickByXpath("//cw-add-custom-control/div/div/div/div/div/input");
		     Reporter.log("Click on Add a Custom Control tetbox| ");
		     Thread.sleep(3000); 
		     
		     // Enter the New Custom Control
		     //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		     sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div/input", "NewControl");
		     Reporter.log("Enter the New Custom Controls| ");
		     Thread.sleep(3000); 

		     // Click from listed add custom controls		  
		     assertTextXpath("//div/strong");
		     clickByXpath("//div/strong");
		     Reporter.log("Click from listed add custom controls | ");
		     Thread.sleep(8000); 
		     
		     // Click on Custom Button	  
		     assertTextXpath("//span[2]/div/div[2]/span");
		     clickByXpath("//span[2]/div/div[2]/span");
		     Reporter.log("Click on Custom Button | ");
		     Thread.sleep(3000); 
		     
		     // Click on Close button
		     assertTextXpath("//div[4]/div/div/div[3]/button");
		     clickByXpath("//div[4]/div/div/div[3]/button");
		     Reporter.log("Click on Close button | ");
		     Thread.sleep(3000); 
		     
		     // Delete the Added Custom Controls
		     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[10]/cw-remove-custom-control/a/i");
		     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[10]/cw-remove-custom-control/a/i");
		     Reporter.log("Click on Close button | ");
		     Thread.sleep(8000); 
		     //Thread.sleep(8000); 
		     
		     //Click on NST Button
		     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[3]/span/div/div[1]/span");
		     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[3]/span/div/div[1]/span");
		     Reporter.log("Click on Close button | ");
		     Thread.sleep(3000);
		     			     
		     // Click on Close button
		     assertTextXpath("//div[4]/div/div/div[3]/button");
		     clickByXpath("//div[4]/div/div/div[3]/button");
		     Reporter.log("Click on Close button | ");
		     Thread.sleep(3000);
		     //Thread.sleep(8000);
		    
		     //Click on Control Tag Button
		     assertTextXpath("//cw-tag/a/span");
		     clickByXpath("//cw-tag/a/span");
		     Reporter.log("Click on Control Tag button | ");
		     Thread.sleep(3000);
		     			     
		     // Click on Checkbox from tag popup
		     assertTextXpath("html/body/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
		     clickByXpath("html/body/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
		     Reporter.log("Click on Checkbox from tag popup | ");
		     Thread.sleep(8000);
		     //Thread.sleep(8000);
		     
		     // Click on Done button
		     assertTextXpath("//div[3]/button[2]");
		     clickByXpath("//div[3]/button[2]");
		     Reporter.log("Click on Close button | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);		 	     */
    
		     
		     Thread.sleep(2000);
		     
      //Click on RiskLikehood drop-down
      try {
     	 assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	         Reporter.log("Click on RiskLikehood drop-down | ");
      }catch(Exception e)
	      {
	         e.printStackTrace();
	         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	       }
       Thread.sleep(8000);
       //Thread.sleep(3000);
    
       //Select 'Moderate' option from Likehood drop-down
       try {
     	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	          Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
      }catch(Exception e)
	      {
	          e.printStackTrace();
	          Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	      }
       Thread.sleep(3000);
       Thread.sleep(3000);
    
       // Click on RiskImpact drop-down
       try {
     	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	          clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	          Reporter.log("Click on RiskImpact drop-down | ");
       }catch(Exception e)
	       {
	          e.printStackTrace();
	          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	       }
        Thread.sleep(8000);
        //Thread.sleep(3000);
    
       //Select 'Major' option from Impact drop-down
       try {
     	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[4]/a");
	          clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[4]/a");
	          Reporter.log("Select 'Major' option from Impact drop-down | ");
      }catch(Exception e)
	      {
	           e.printStackTrace();
	           Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	      }
       Thread.sleep(3000);
       Thread.sleep(3000);
    
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
       Thread.sleep(3000);
       Thread.sleep(3000);
    
      //5th page
      // Select 'Yes' option in Response choice of listed Controls
	     try {
	    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
       }catch(Exception e)
		  {
		     e.printStackTrace();
		     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		  }
	      Thread.sleep(5000);
	      //Thread.sleep(3000);
	      
	  // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			     e.printStackTrace();
			     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			  }
		      Thread.sleep(3000);
		      //Thread.sleep(3000);
         
       //Click on RiskLikehood drop-down
       try {
     	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	          Reporter.log("Click on RiskLikehood drop-down | ");
      }catch(Exception e)
	      {
	         e.printStackTrace();
	         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	      }
       Thread.sleep(8000);
       //Thread.sleep(3000);
    
      //Select 'Moderate' option from Likehood drop-down
      try {
     	 assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	         Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
     }catch(Exception e)
	     {
	          e.printStackTrace();
	          Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	     }
      Thread.sleep(3000);
      Thread.sleep(3000);
    
      // Click on RiskImpact drop-down
      try {
     	 assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	         Reporter.log("Click on RiskImpact drop-down | ");
     }catch(Exception e)
	     {
	         e.printStackTrace();
	         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	     }
      Thread.sleep(8000);
      //Thread.sleep(3000);
    
      //Select 'Major' option from Impact drop-down
      try {
     	 assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	         Reporter.log("Select 'Major' option from Impact drop-down | ");
     }catch(Exception e)
	     {
	         e.printStackTrace();
	         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	     }
      Thread.sleep(3000);
      Thread.sleep(3000);
    
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
      Thread.sleep(3000);
      Thread.sleep(3000);
    
       //6th page
       // Select 'Yes' option in Response choice of listed Controls
	      try {
	    	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
	 	      Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        }catch(Exception e)
		   {
		       e.printStackTrace();
		       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		   }
	       Thread.sleep(3000);
	      // Thread.sleep(3000);
	      
	    // Select 'Yes' option in Response choice of listed Controls
		      try {
		    	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[3]");
		 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[3]");
		 	      Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			   {
			       e.printStackTrace();
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		      // Thread.sleep(3000);
		       
		    // Select 'Yes' option in Response choice of listed Controls
			      try {
			    	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
			 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
			 	      Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		        }catch(Exception e)
				   {
				       e.printStackTrace();
				       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
				   }
			       Thread.sleep(3000);
			      // Thread.sleep(3000);
	       
    
        //Click on RiskLikehood drop-down
        try {
     	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	           Reporter.log("Click on RiskLikehood drop-down | ");
       }catch(Exception e)
	       {
	           e.printStackTrace();
	           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	       }
        Thread.sleep(8000);
        //Thread.sleep(3000);
    
        //Select 'Moderate' option from Likehood drop-down
        try {
     	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	           Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
       }catch(Exception e)
	       {
	           e.printStackTrace();
	           Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	       }
        Thread.sleep(3000);
       Thread.sleep(3000);
     
        // Click on RiskImpact drop-down
        try {
     	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	           Reporter.log("Click on RiskImpact drop-down | ");
        }catch(Exception e)
	        {
	           e.printStackTrace();
	           Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	        }
         Thread.sleep(8000);
        //Thread.sleep(3000);
    
        //Select 'Major' option from Impact drop-down
        try {
     	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	           Reporter.log("Select 'Major' option from Impact drop-down | ");
       }catch(Exception e)
	       {
	          e.printStackTrace();
	          Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	       }
        Thread.sleep(3000);
        Thread.sleep(3000);
    
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
        Thread.sleep(3000);
        Thread.sleep(3000);
    
        //7th page
        // Select 'Yes' option in Response choice of listed Controls
	       try {
	    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
	 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		   }
	       Thread.sleep(5000);
	       //Thread.sleep(3000);
	       
	       ArrowDown();
	       ArrowDown();
	       Thread.sleep(3000);
	  
        //Click on RiskLikehood drop-down
        try {
     	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	           Reporter.log("Click on RiskLikehood drop-down | ");
       }catch(Exception e)
	       {
	           e.printStackTrace();
	           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
	       }
        Thread.sleep(8000);
        //Thread.sleep(3000);
    
        //Select 'Moderate' option from Likehood drop-down
        try {
     	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[3]/a");
	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[3]/a");
	           Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
       }catch(Exception e)
	       {
	            e.printStackTrace();
	            Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
	       }
        Thread.sleep(3000);
        Thread.sleep(3000);
    
        // Click on RiskImpact drop-down
        try {
     	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	           Reporter.log("Click on RiskImpact drop-down | ");
       }catch(Exception e)
	       {
	           e.printStackTrace();
	           Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
	       }
        Thread.sleep(8000);
        //Thread.sleep(3000);
    
        //Select 'Major' option from Impact drop-down
        try {
     	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	           Reporter.log("Select 'Major' option from Impact drop-down | ");
       }catch(Exception e)
	       {
	            e.printStackTrace();
	            Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
	        }
         Thread.sleep(3000);
         Thread.sleep(3000);
         
           // Click on 'save' button
           try {
 	          assertTextXpath("//*[@id='pMedia']");
               clickByXpath("//*[@id='pMedia']");
               Reporter.log("Select save button | ");
          }catch(Exception e)
	          {
	              e.printStackTrace();
	              Reporter.log("click on save button doesn't work | ");
	           }
            Thread.sleep(3000);
            Thread.sleep(3000);
            //Thread.sleep(3000);	
            
         // Select Risk Questionnaire list sub-module under Risk Determination Module
	   	        try {
	   	        	assertTextLink("Risk Questionnaire List");
	   	            clickBylinktext("Risk Questionnaire List");
	   	            Reporter.log("Select Risk Questionnaire List | ");
	             }catch(Exception e)
	   		    {
	   		        e.printStackTrace();
	   		        Reporter.log("Select Risk Questionnaire List doesn't reached | ");
	   		    }
	   	        Thread.sleep(8000);
	   	        //Thread.sleep(2000);
	   	        //Thread.sleep(3000);
	   	        
	   	        // Click on Leave Page 
	   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	   	        Thread.sleep(3000);
	   	        Thread.sleep(3000);
	   	       //Thread.sleep(3000);     	
	   	        
}
	 
	  @Test(priority=105, enabled = false)
	  public void RQLPager_RiskQuestionnaireForm() throws InterruptedException, IOException {

		  
			 Thread.sleep(3000); 
			 Thread.sleep(3000); 
			 
		        // Click on 'continue' button of Media/Asset
		        try {
		        	assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
		 	        clickByXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
		 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
	        }catch(Exception e)
			    {
			         e.printStackTrace();
			         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
			    }
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		 
	     // 1st page	           
	     // Click on Add a Custom Control	  
		    assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
		    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
		    Reporter.log("Click on Add a Custom Control	| ");
		    Thread.sleep(3000); 

	    // Click on Add a Custom Control textbox		  
		    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    clickByXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    Reporter.log("Click on Add a Custom Control tetbox| ");
		    Thread.sleep(2000); 

	    // Enter the New Custom Control
		    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div/input", "TestControls");
		    Reporter.log("Enter the New Custom Controls| ");
		    Thread.sleep(3000); 

		    // Click from listed add custom controls		  
		    assertTextXpath("//div/strong");
		    clickByXpath("//div/strong");
		    Reporter.log("Click from listed add custom controls | ");
		    Thread.sleep(8000); 
		    
		    // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			   {
			       e.printStackTrace();
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
		    // Select 'Yes' option in Response choice of listed Controls
	    try {
	 	   //assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	  }catch(Exception e)
		   {
		       e.printStackTrace();
		       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		   }
	    Thread.sleep(3000);
	    Thread.sleep(8000);
	    
	   /* //Click on Global checkbox
	    assertTextXpath("//tr[2]/td[7]/cw-s-response-global/div/div/label");
	    clickByXpath("//tr[2]/td[7]/cw-s-response-global/div/div/label");
	    Reporter.log("Click on Global checkbox | ");
	    Thread.sleep(3000);
	    Thread.sleep(8000);
	    
	   //Click on Proceed Button In Warning Pop-up
	    assertTextXpath("//div[4]/div/div/div[3]/button");
	    clickByXpath("//div[4]/div/div/div[3]/button");
	    Reporter.log("Click on Proceed Button In Warning Pop-up | ");
	    Thread.sleep(8000);
	     
	   //Click on Proceed Button In Warning Pop-up
	     assertTextXpath("//div[4]/div/div/div[3]/button");
	     clickByXpath("//div[4]/div/div/div[3]/button");
	     Reporter.log("Click on Proceed Button In Warning Pop-up | ");
	     Thread.sleep(8000);
	     */
	    
	    /*//Click on Notes button to add text
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div[1]/a");
	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[8]/div[1]/a");
	    Reporter.log("Click on Notes button to add text | ");
	    Thread.sleep(8000);
	    //Thread.sleep(3000);
	    
	    //Click on New button in Notes pop-up window
	    assertTextXpath("//div/a/span");
	    clickByXpath("//div/a/span");
	    Reporter.log("Click on New button in Notes pop-up window | ");
	    Thread.sleep(8000);
	    //Thread.sleep(3000);
	    
	    // Enter Text for Note textarea
	    assertTextXpath("//textarea");
	    sendvaluebyxpath("//textarea", "created notes");
	    Reporter.log("Enter Text for Note textarea | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	    // Click on Create Button
	    assertTextXpath("//div[4]/div[3]/button");
	    clickByXpath("//div[4]/div[3]/button");
	    Reporter.log("Click on Create Button | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	 // Select any one of the Listed Notes
	    assertTextXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
	    clickByXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
	    Reporter.log("Select any one of the Listed Notes | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	 // Click on Edit Button
	    assertTextXpath("//a[2]/span");
	    clickByXpath("//a[2]/span");
	    Reporter.log("Click on Edit Button | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	   // Enter Text for Note textarea
	    assertTextXpath("//textarea");
	    sendvaluebyxpath("//textarea", "Edit notes");
	    Reporter.log("Enter Text for Note textarea | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	    // Click on Save Button
	    assertTextXpath("//div[4]/div[3]/button");
	    clickByXpath("//div[4]/div[3]/button");
	    Reporter.log("Click on Save Button | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	    //Click on Close button in popup
	    assertTextXpath("//div[4]/div/div/div[3]/button");
	    clickByXpath("//div[4]/div/div/div[3]/button");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(5000);
	    Thread.sleep(3000);*/
	    
	    //Expand the Controls
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	     Reporter.log("Expand the Controls | ");
	     Thread.sleep(8000);
	     
	     //Expand the Controls
	     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
	      Reporter.log("Expand the Controls | ");
	      Thread.sleep(8000);
	    
	    Thread.sleep(8000);
	    
	  //Expand the Controls
	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
	    Reporter.log("Expand the Controls | ");
	    Thread.sleep(8000);
	    
	      // Select 'Inprogress' option in Response choice of listed Controls
	      assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[4]/cw-s-response-choices/div/div/label[2]");
	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[4]/cw-s-response-choices/div/div/label[2]");
	      Reporter.log("Select 'Inprogress' option in Response choice of listed Controls | ");
	    Thread.sleep(8000);
	    
	    // Select 'No' option in Response choice of listed Controls
	      assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[4]/cw-s-response-choices/div/div/label[3]");
	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[4]/cw-s-response-choices/div/div/label[3]");
	      Reporter.log("Select 'NO' option in Response choice of listed Controls | ");
	        Thread.sleep(8000);
	   
	       // Select 'NA' option in Response choice of listed Controls
	        assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[4]/cw-s-response-choices/div/div/label[4]");
	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[4]/cw-s-response-choices/div/div/label[4]");
	        Reporter.log("Select 'NA' option in Response choice of listed Controls | ");
	        Thread.sleep(3000);	
	        Thread.sleep(8000);
	        
	      //Click on Notes button to add text
		    assertTextXpath("//tr[5]/td[7]/div/a/strong");
		    clickByXpath("//tr[5]/td[7]/div/a/strong");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(8000);
		    //Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div/a/span");
		    clickByXpath("//div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(8000);
		    //Thread.sleep(3000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
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
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(8000);
		    Thread.sleep(3000);
	  	         
	      //Expand the Controls
	     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[2]/span[1]");
	      Reporter.log("Expand the Controls | ");
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	      
	    /*//Click on Global checkbox
	      assertTextXpath("//cw-s-response-global/div/div/label");
	      clickByXpath("//cw-s-response-global/div/div/label");
	      Reporter.log("Click on Global checkbox | ");
	      Thread.sleep(3000);
	      Thread.sleep(8000);
	      
	     //Click on Proceed Button In Warning Pop-up
	      assertTextXpath("//div[4]/div/div/div[3]/button");
	      clickByXpath("//div[4]/div/div/div[3]/button");
	      Reporter.log("Click on Proceed Button In Warning Pop-up | ");
	      Thread.sleep(8000);*/
	    	      
	    
	    /*//Click on Notes button to add text
		    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[8]/div[1]/a");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[8]/div[1]/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(8000);
		    //Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div/a/span");
		    clickByXpath("//div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(8000);
		    //Thread.sleep(3000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
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
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(8000);
		    Thread.sleep(3000);
		    
		    //Click on Document to upload
		    assertTextXpath("//a[2]/a/strong");
		    clickByXpath("//a[2]/a/strong");
		    Reporter.log("Click on Document to upload | ");
		    Thread.sleep(8000);
		    
		    //Click on New button from document pop-up
		    assertTextXpath("//div/a/span");
		    clickByXpath("//div/a/span");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(8000);
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("//div/div/div/div/div/div/div/input");
		    clickByXpath("//div/div/div/div/div/div/div/input");
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
		    Thread.sleep(3000);
		    Thread.sleep(3000);
	   
		    //Select any one of the listed item
		    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the listed item | ");
		    Thread.sleep(3000);
		 		    	    	    
		  //Select Delete button in Uploaded Document
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Select Delete button in Uploaded Document | ");
		    Thread.sleep(3000);
		    
		    // Click on Delete button in Deleted Pop-up
		    assertTextXpath("//div[3]/button[1]");
		    clickByXpath("//div[3]/button[1]");
		    Reporter.log("Click on Delete button in Deleted Pop-up | ");
		    Thread.sleep(8000);		    
		  
		    // Click on Close button		  
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on CLose Button | ");
		    Thread.sleep(3000); 
		    Thread.sleep(3000); */
		    
	    /* //Expand the Controls
		    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    Reporter.log("Expand the Controls | ");
		    Thread.sleep(3000);
		    
		    //Expand the Controls
		    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    Reporter.log("Expand the Controls | ");
		    Thread.sleep(3000);
		      
		    // Click ? Button
		    assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[3]/i");
		    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[3]/i");
		    Reporter.log("Click ? Button | ");
		    Thread.sleep(8000);
	        
		    // Click on Close button in ? Pop-up
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in ? Pop-up | ");
		    //clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Thread.sleep(8000);    */
	    	      
		    ArrowDown();
		    ArrowDown();
		    ArrowDown();
		    ArrowDown();
		    ArrowDown();
		    ArrowDown();
		    Thread.sleep(5000);
		    
	    //Click on RiskLikehood drop-down
	    try {
	 	    assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		       Reporter.log("Click on RiskLikehood drop-down | ");
	   }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		   }
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	    //Select 'Moderate' option from Likehood drop-down
	    try {
	 	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
		       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
		       Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	   }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		   }
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	    }catch(Exception e)
		    {
		          e.printStackTrace();
		          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		   }
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
	    	       
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	    }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		   }
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	    
	  /*//Click on Notes button to add text
	    assertTextXpath("//*[@id='body-content']/div[1]/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/a");
	    clickByXpath("//*[@id='body-content']/div[1]/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/a");
	    Reporter.log("Click on Notes button to add text | ");
	    Thread.sleep(8000);
	    //Thread.sleep(8000);
	    
	    //Click on New button in Notes pop-up window
	    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
	    Reporter.log("Click on New button in Notes pop-up window | ");
	    Thread.sleep(3000);
	    //Thread.sleep(8000);
	    
	    // Enter Text for Note textarea
	    assertTextXpath("//textarea");
	    sendvaluebyxpath("//textarea", "created Risk notes");
	    Reporter.log("Enter Text for Note textarea | ");
	    Thread.sleep(3000);
	    //Thread.sleep(8000);
	    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(8000);
		    //Thread.sleep(8000);   
		    
		    
		   //Click on New button in Notes pop-up window
		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(3000);
		    //Thread.sleep(8000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created second Risk notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(8000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(8000);
		    //Thread.sleep(8000);
		    	  	   
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[1]/button");
		    clickByXpath("//div[4]/div/div/div[1]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000); */
		    	    
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
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	     
	     //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	    
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 }catch(Exception e)
		    {
		    e.printStackTrace();
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	     }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	     // Select 'Yes' option in Response choice of listed Controls
	     try {
	     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	     {
	         e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
	 try {
	 	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	  }catch(Exception e)
	  {
	     e.printStackTrace();
	     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	 }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
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
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	    
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 }catch(Exception e)
		    {
		    e.printStackTrace();
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	     }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	     // Select 'Yes' option in Response choice of listed Controls
	     try {
	     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	     {
	         e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
	 try {
	 	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	  }catch(Exception e)
	  {
	     e.printStackTrace();
	     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	 }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);

	 // Select 'Yes' option in Response choice of listed Controls
	     try {
	     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[5]/cw-s-response-choices/div/div/label[2]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[5]/cw-s-response-choices/div/div/label[2]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	     }catch(Exception e)
	     {
	         e.printStackTrace();
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	     }
		    //Thread.sleep(8000);
		    Thread.sleep(3000);
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
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
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	    
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 }catch(Exception e)
		    {
		    e.printStackTrace();
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	     }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	     // Select 'Yes' option in Response choice of listed Controls
	     try {
	     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	     {
	         e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
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
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
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
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	    
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 }catch(Exception e)
		    {
		    e.printStackTrace();
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	     }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	     // Select 'Yes' option in Response choice of listed Controls
	     try {
	     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	     {
	         e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
	 try {
	 	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[5]/cw-s-response-choices/div/div/label[3]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	  }catch(Exception e)
	  {
	     e.printStackTrace();
	     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	 }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
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
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		      
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
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
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	    
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 }catch(Exception e)
		    {
		    e.printStackTrace();
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	     }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	     // Select 'Yes' option in Response choice of listed Controls
	     try {
	     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	     {
	         e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
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
	      Thread.sleep(3000);
	      Thread.sleep(3000);
	      
	      //8rd page       
	      
	      // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	       }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	    
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	 }catch(Exception e)
		    {
		    e.printStackTrace();
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	     }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	 // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[3]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	    
	     // Select 'Yes' option in Response choice of listed Controls
	     try {
	     	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[5]/cw-s-response-choices/div/div/label[1]");
	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	     {
	         e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
	 Thread.sleep(3000);
	 //Thread.sleep(3000);
	    
	    	       
	     //Click on RiskLikehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskLikehood drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Moderate' option from Likehood drop-down
	     try {
	     	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);
	    
	     // Click on RiskImpact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
		        Reporter.log("Click on RiskImpact drop-down | ");
	 }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	     Thread.sleep(8000);
	     //Thread.sleep(3000);
	    
	     //Select 'Major' option from Impact drop-down
	     try {
	     	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
		        Reporter.log("Select 'Major' option from Impact drop-down | ");
	 }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	     Thread.sleep(3000);
	     Thread.sleep(3000);  
	     
	     // Click on 'save' button
         try {
	          assertTextXpath("//*[@id='pMedia']");
             clickByXpath("//*[@id='pMedia']");
             Reporter.log("Select save button | ");
        }catch(Exception e)
	          {
	              e.printStackTrace();
	              Reporter.log("click on save button doesn't work | ");
	           }
          Thread.sleep(3000);
          Thread.sleep(3000);
          //Thread.sleep(3000);	
          
       // Select Risk Questionnaire list sub-module under Risk Determination Module
	   	        try {
	   	        	assertTextLink("Risk Questionnaire List");
	   	            clickBylinktext("Risk Questionnaire List");
	   	            Reporter.log("Select Risk Questionnaire List | ");
	             }catch(Exception e)
	   		    {
	   		        e.printStackTrace();
	   		        Reporter.log("Select Risk Questionnaire List doesn't reached | ");
	   		    }
	   	        Thread.sleep(8000);
	   	        //Thread.sleep(2000);
	   	        //Thread.sleep(3000);
	   	        
	   	        // Click on Leave Page 
	   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	   	        Thread.sleep(3000);
	   	        Thread.sleep(3000);
	   	       //Thread.sleep(3000);     	
				      	     
	  }   
	  
	  @Test(priority=106, enabled =true)
	  public void AllFields_RiskQuestionnaireList() throws InterruptedException, IOException {
      
		  Thread.sleep(3000);
              
       //Click on Media/Asset drop-down
       assertTextXpath("//*[@id='control-type']");
 	     Thread.sleep(3000);
	         
	    // Click on Filter Button 
 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]/i");
 	   Thread.sleep(3000);
 	   
	  	//Click on Export Button
 	   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
 	  Thread.sleep(3000);
 	   
 	   // Click on Columns Header 
 	  assertTextXpath("//*[@id='column_selector_button']");
 	 Thread.sleep(3000);
  }
	  
	@Test(priority=107, enabled =true)
	  public void QuickFilter_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		//Click on Media/Asset drop-down
  	     clickByXpath("//*[@id='control-type']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
  	     Thread.sleep(8000);
  	     Thread.sleep(8000);
  	     clickByXpath("//*[@id='control-type']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
  	     Thread.sleep(8000);
  	     Thread.sleep(8000);    
	
	}
	
	@Test(priority=108, enabled =true)
	public void Filters_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		Thread.sleep(8000);
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
  		assertTextXpath("//div[2]/div/div/ul/li/input");
  		clickByXpath("//div[2]/div/div/ul/li/input");
  		Reporter.log("Click on Media label Drop-down | ");
  		Thread.sleep(3000);
  		assertTextXpath("//div[2]/div/div/div/ul/li");
  		clickByXpath("//div[2]/div/div/div/ul/li");
  		Reporter.log("Select value from Media label Drop-down | ");
  		Thread.sleep(3000);
  		//Thread.sleep(3000);
  		//Thread.sleep(3000);

  		//Click on Assets drop-down
  		assertTextXpath("//div[3]/div/div/ul/li/input");
  		clickByXpath("//div[3]/div/div/ul/li/input");
  		Reporter.log("Click on Asset Drop-down | ");
  		Thread.sleep(3000);
  		assertTextXpath("//div[3]/div/div/div/ul/li");
  		clickByXpath("//div[3]/div/div/div/ul/li");
  		Reporter.log("Select value from Asset Drop-down | ");
  		Thread.sleep(3000);
  		//Thread.sleep(3000);

  		/*// Click on Thread Source drop-down
  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
  		Reporter.log("Click on Thread Source Drop-down | ");
  		Thread.sleep(3000);
  		assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
  		clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
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
  			assertTextXpath("html/body/div[5]/div/div/div[3]/button[2]");
  			clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
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
	@Test(priority=109, enabled =true)
	  public void Export_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		Thread.sleep(8000);
		  //Thread.sleep(2000);	
		  
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
		  Thread.sleep(8000);
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
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
	}
	@Test(priority=110, enabled =true)
	  public void ProgressBar_ColumnHeaders_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		
		// Click on Progress Bar column Header
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[1]/div[1]/p");
		Thread.sleep(3000);	
		
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
		Thread.sleep(3000);	
		
	}
	
	@Test(priority=111, enabled =true)
	  public void RiskAnalyst_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		// Select the Risk Analyst drop-down		
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select");
		Thread.sleep(3000);
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select/option[3]");
		Thread.sleep(3000);
	}
	
	@Test(priority=112, enabled =false)
	  public void ReviewButton_RiskQuestionnaireList() throws InterruptedException, IOException {
		   
		Thread.sleep(3000);
		
		 // Click on 'Review' button of Media/Asset
        try {
        	assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/div[2]/span");
 	        clickByXpath("//*[@id='content']/tr[1]/td[7]/div/div[2]/span");
 	        Reporter.log("Click on 'Review' button of Desktop Media/Asset | ");
        }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
	    }
        Thread.sleep(8000);
        Thread.sleep(3000);
        //Thread.sleep(3000);
       
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
        Thread.sleep(6000);
              
        // 4th page

       
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
                 
              // Click on 'save' button
              try {
    	          assertTextXpath("//*[@id='pMedia']");
                  clickByXpath("//*[@id='pMedia']");
                  Reporter.log("Select save button | ");
              }catch(Exception e)
	          {
	              e.printStackTrace();
	              Reporter.log("click on save button doesn't work | ");
	           }
               Thread.sleep(8000);
               Thread.sleep(3000);
               //Thread.sleep(3000);	
               
            // Select Risk Questionnaire list sub-module under Risk Determination Module
	   	        try {
	   	        	assertTextLink("Risk Questionnaire List");
	   	            clickBylinktext("Risk Questionnaire List");
	   	            Reporter.log("Select Risk Questionnaire List | ");
	             }catch(Exception e)
	   		    {
	   		        e.printStackTrace();
	   		        Reporter.log("Select Risk Questionnaire List doesn't reached | ");
	   		    }
	   	        Thread.sleep(8000);
	   	        //Thread.sleep(2000);
	   	        //Thread.sleep(3000);
	   	        
	   	        // Click on Leave Page 
	   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	   	        Thread.sleep(8000);
	   	        Thread.sleep(3000);
	   	       //Thread.sleep(3000); 
		    			 			      	     
  }   
	
	@Test(priority=113, enabled =false)
	  public void Multi_Selector() throws InterruptedException, IOException {
		
		    // Click on Multi Selector Checkbox
	        clickByXpath("//div/input");
	        Thread.sleep(8000);
	        
	     // Click on Multi Selector Checkbox
	        selectByXpath_Visibletext("//select", "Uma M");  
	        
	        // Enter Due date for listed Medias
	        sendvaluebyxpath("//cw-due-date-massive/input", "06/07/2018");
	        
	     // Click on Multi Selector Checkbox
	        clickByXpath("//span/img");
	        Thread.sleep(3000);
	}
	
	 @Test (priority=114, enabled = true)
		public void Sorting_RiskdeterminationList() throws IOException, InterruptedException {

 	   //Thread.sleep(8000);
	        //Thread.sleep(8000);
	        //Thread.sleep(3000);
	        Thread.sleep(2000);
		   									
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	  
			Thread.sleep(3000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
	    	Thread.sleep(8000);	
			Thread.sleep(8000);	
											
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			Thread.sleep(8000);	
			Thread.sleep(8000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);	
			
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			Thread.sleep(8000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);	
				
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
		    Thread.sleep(8000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);
		
			
		}
	
}
