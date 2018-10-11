package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class RiskDeterminationStage extends WrapperClass{

	  public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=41, enabled =true)
	  public void NavigatePage_RiskQuestionnaireList() throws InterruptedException, IOException {
		  
		    Thread.sleep(5000);
		  
		    		           	        
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
		    Thread.sleep(5000);
		    Thread.sleep(2000);
		    Thread.sleep(3000);
		    //Thread.sleep(3000); 
			//Thread.sleep(3000);
			//Thread.sleep(3000);	
}
	  
	@Test(priority=42, enabled =true)
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
	
	 @Test(priority=43, enabled = true)
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
	   
	 @Test(priority=44, enabled = true)
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
		
	 @Test(priority=45, enabled = true)
	 public void RiskManagementMap_RiskQuestionnaireList() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[5]/div/div/div[3]/button");
		   Thread.sleep(3000);
	 }
	
	
	@Test(priority=46, enabled =true)
	  public void PageHearder_RiskQuestionnaireForm() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
		// Click on 'continue' button of Media/Asset
	        try {
	        	assertTextXpath("//*[@id='content']/tr[4]/td[7]/div/div[1]/span");
	 	        clickByXpath("//*[@id='content']/tr[4]/td[7]/div/div[1]/span");
	 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
      }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
		    }
	        Thread.sleep(5000);
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
	
	 @Test(priority=47, enabled = true)
	   public void PanelBar_RiskQuestionnaireForm() throws IOException, InterruptedException {
			   
		   Thread.sleep(2000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Risk Questionnaire List Risk Questionnaire Form");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   
	   }
	   
	 @Test(priority=48, enabled = true)
	 public void PageLevelHelp_RiskQuestionnaireForm() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[4]/div/div/div[3]/button");
	     clickByXpath("//div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(3000);
		   // Thread.sleep(3000);
		   
	 }
		
	 @Test(priority=49, enabled = true)
	 public void RiskManagementMap_RiskQuestionnaireForm() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[4]/div/div/div[3]/button");
		   Thread.sleep(3000);
		   
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
	       Thread.sleep(5000); 
	 }
	  
	  @Test(priority=50, enabled =true)
      public void RQLPager() throws InterruptedException, IOException { 
    	     	  
    	   Thread.sleep(5000);

          // Click on 'continue' button of Media/Asset of Pager 
          try {
        	  assertTextXpath("//*[@id='content']/tr[4]/td[7]/div/div[1]/span");
        	  clickByXpath("//*[@id='content']/tr[4]/td[7]/div/div[1]/span");
        	  Reporter.log("Click on 'continue' button of Pager Media/Asset | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on 'continue' button of Pager doesn't work | ");
          }
          Thread.sleep(5000);          
          Thread.sleep(5000);

          //2nd Media/Asset
          //1st Page
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
          Thread.sleep(5000);
     
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
          Thread.sleep(5000);
     
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
          Thread.sleep(5000);
     
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
          Thread.sleep(5000);
          
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
          Thread.sleep(5000);
          Thread.sleep(5000);

            //2nd page
          // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[3]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[3]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
          Thread.sleep(5000);
          
       // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[4]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[4]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
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
          Thread.sleep(5000);
          
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
          	Thread.sleep(5000);
     
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
          	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
        	Thread.sleep(5000);
     
        	// 3rd page
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
        	Thread.sleep(5000);
  
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
        	Thread.sleep(5000);

        	//4th page
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
        	Thread.sleep(5000);

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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
        		
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
        	Thread.sleep(5000);
        	Thread.sleep(5000);
        	
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
        		
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
        	Thread.sleep(5000);
        	Thread.sleep(5000);

        	//7th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[3]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[3]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
        	Thread.sleep(5000);
     
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
        	Thread.sleep(5000);
        	Thread.sleep(5000);
        	
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
   	        Thread.sleep(5000);
   	        //Thread.sleep(2000);
   	        //Thread.sleep(3000);
   	        
   	        // Click on Leave Page 
   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
   	        Thread.sleep(3000);
   	        Thread.sleep(3000);
   	       //Thread.sleep(3000); 
          }  
	  
	  @Test(priority=51, enabled =true)
	  public void AllFields_RiskQuestionnaireList() throws InterruptedException, IOException {
      
		  Thread.sleep(3000);
              
       //Click on Media/Asset drop-down
       assertTextXpath("//*[@id='control-type']");
 	     Thread.sleep(3000);
	         
	    // Click on Filter Button 
 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]/i");
 	   Thread.sleep(3000);
 	   
	  	//Click on Export Button
 	   assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
 	  Thread.sleep(3000);
 	   
 	   // Click on Columns Header 
 	  assertTextXpath("//*[@id='column_selector_button']");
 	 Thread.sleep(3000);
  }
	  
	@Test(priority=52, enabled =true)
	  public void QuickFilter_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		//Click on Media/Asset drop-down
  	     clickByXpath("//*[@id='control-type']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/div/ul/li[2]/a");
  	     Thread.sleep(2000);
  	     Thread.sleep(5000);
  	     clickByXpath("//*[@id='control-type']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/div/ul/li[1]/a");
  	     Thread.sleep(5000);
  	     Thread.sleep(3000);    
	
	}

	@Test(priority=53, enabled =false)
	public void TC147and148() throws InterruptedException, IOException {
		
		// New/Updated Quick Filter is removed from that page
	}
	
	@Test(priority=54, enabled =true)
	public void Filters_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
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
  		Thread.sleep(5000);
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
  		Thread.sleep(5000); 
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
	@Test(priority=55, enabled =true)
	  public void Export_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		  //Thread.sleep(2000);	
		  
		   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(5000);
		  // Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		 // Thread.sleep(5000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(5000);
		  //Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  Thread.sleep(5000);
	}
	@Test(priority=56, enabled =true)
	  public void ProgressBar_ColumnHeaders_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		
		// Click on Progress Bar column Header
		mouseHoverByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[1]/div[1]/p");
		Thread.sleep(3000);	
		
		// Click on Media/label column Header
		assertEquals("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span", "Media/Label");
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
	@Test(priority=57, enabled =false)
	  public void TC153() throws InterruptedException, IOException {
		
		// Default Sorting
		
	}
	@Test(priority=58, enabled =true)
	  public void RiskAnalyst_RiskQuestionnaireList() throws InterruptedException, IOException {
		
		// Select the Risk Analyst drop-down		
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select");
		Thread.sleep(3000);
		clickByXpath("//*[@id='content']/tr[2]/td[5]/div/cw-risk-analyst-choices/select/option[3]");
		Thread.sleep(3000);
	}
	
	@Test(priority=59, enabled =true)
	  public void ReviewButton_RiskQuestionnaireList() throws InterruptedException, IOException {
		   
		Thread.sleep(3000);
		
		 // Click on 'Review' button of Media/Asset
        try {
        	assertTextXpath("//*[@id='content']/tr[4]/td[7]/div/div[2]/span");
 	        clickByXpath("//*[@id='content']/tr[4]/td[7]/div/div[2]/span");
 	        Reporter.log("Click on 'Review' button of Desktop Media/Asset | ");
        }catch(Exception e)
	    {
	         e.printStackTrace();
	         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
	    }
        Thread.sleep(5000);
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
        Thread.sleep(5000);
               
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
               Thread.sleep(5000);
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
	   	        Thread.sleep(5000);
	   	        //Thread.sleep(2000);
	   	        //Thread.sleep(3000);
	   	        
	   	        // Click on Leave Page 
	   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	   	        Thread.sleep(5000);
	   	        Thread.sleep(3000);
	   	       //Thread.sleep(3000); 
		    			 			      	     
  }   
	
	@Test(priority=60, enabled =true)
	  public void Multi_Selector_() throws InterruptedException, IOException {
		
		    // Click on Multi Selector Checkbox
	        clickByXpath("//div/input");
	        Thread.sleep(5000);
	        
	     // Click on Multi Selector Checkbox
	        selectByXpath_Visibletext("//select", "Uma M");  
	        
	        // Enter Due date for listed Medias
	        sendvaluebyxpath("//cw-due-date-massive/input", "06/07/2018");
	        
	     // Click on Multi Selector Checkbox
	        clickByXpath("//span/img");
	        Thread.sleep(3000);
	}
	
	@Test(priority=61, enabled =false)
	  public void TC164() throws InterruptedException, IOException {
		
		//Auto loading functionality
		
	}
	
	 @Test (priority=62, enabled = true)
		public void Sorting_RiskdeterminationList() throws IOException, InterruptedException {

 	   //Thread.sleep(5000);
	        //Thread.sleep(5000);
	        //Thread.sleep(3000);
	        Thread.sleep(2000);
		   									
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	  
			Thread.sleep(3000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
											
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
				
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
		    Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
		
			
		}
	
}

	 	  