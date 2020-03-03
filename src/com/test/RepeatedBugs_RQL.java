package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RepeatedBugs_RQL extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;

	    @Test(priority=1, enabled =true)
		  public void IRMA8948_RQL_PhysicalLocationProgressBar() throws InterruptedException, IOException {
		  
			  Thread.sleep(8000);
			  
        	        
                 //Select Risk Determination sidebar-left Module		    
             	assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
                clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
                   Reporter.log("Select Risk Determination sidebar-left Module | ");
                Thread.sleep(8000);
                //Thread.sleep(8000);

                //Click on Risk Questionnaire List Page
                 assertTextLink("Risk Questionnaire List");
                clickBylinktext("Risk Questionnaire List");
                Reporter.log("Click on Controls Review Page | ");
                 Thread.sleep(8000);
                 Thread.sleep(2000);
                  Thread.sleep(8000);

			  
	    }
	    
	    @Test(priority=1, enabled =true)
		  public void IRMA4934_ChkResponseInNotes_RQL() throws InterruptedException, IOException {
		  
			  Thread.sleep(8000);
			  
			// Click on 'continue' button of Media/Asset
		        	assertTextXpath("//*[@id='content']/tr[3]/td[7]/div/div[1]/span");
		 	        clickByXpath("//*[@id='content']/tr[3]/td[7]/div/div[1]/span");
		 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
		        Thread.sleep(8000);
		        Thread.sleep(5000);
		        Thread.sleep(8000);
		        
		        // Select 'Yes' option in Response choice of listed Controls
		    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		       Thread.sleep(8000);
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      //Click on Notes button to add text
		      assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[8]/div[2]/a");
		      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[8]/div[2]/a");
		      Reporter.log("Click on Notes button to add text | ");
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on Page breadcrumb
			   AssertJUnit.assertEquals("html/body/div[4]/div/div/div[2]/div/div[1]/table/tbody/tr[8]/td[2]/span", "In progress");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(8000);
		      		      
			   //Click on Close button in popup
			    clickBycssSelector(".modal-footer > .pull-right");
			    Reporter.log("Click on Close button in popup | ");
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			  
			  
}
	    @Test(priority=135, enabled = true)
		  public void IRMA7668_DeleteCustomControls_RiskQuestionnaireForm() throws InterruptedException, IOException {
	 
			 Thread.sleep(8000); 
			 Thread.sleep(8000); 
			 
	    // 1st page	           
	    // Click on Add a Custom Control	  
		    assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
		    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[1]");
		    Reporter.log("Click on Add a Custom Control	| ");
		    Thread.sleep(8000); 

	   // Click on Add a Custom Control textbox		  
		    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    clickByXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    Reporter.log("Click on Add a Custom Control tetbox| ");
		    Thread.sleep(2000); 

	   // Enter the New Custom Control
		    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div/input", "TestControls");
		    Reporter.log("Enter the New Custom Controls| ");
		    Thread.sleep(8000); 

		    // Click from listed add custom controls		  
		    assertTextXpath("//div/strong");
		    clickByXpath("//div/strong");
		    Reporter.log("Click from listed add custom controls | ");
		    Thread.sleep(8000); 
		    Thread.sleep(8000);
		    
		 // Click on Delete button for Custom Controls  
		    assertTextXpath("");
		    clickByXpath("");
		    Reporter.log("Click from listed add custom controls | ");
		    Thread.sleep(8000); 
		    Thread.sleep(8000);
		    
	    }
	    
	    @Test(priority=135, enabled = true)
		  public void IRMA8990_lowerSectionHelpIcon_RiskQuestionnaireForm() throws InterruptedException, IOException {
	 
			 Thread.sleep(8000); 
			 Thread.sleep(8000); 
	    
	    }
}