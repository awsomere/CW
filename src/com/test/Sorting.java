package com.test;


import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;


public class Sorting extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	    
	  @Test( priority= 41, enabled = true)
	  public void  AssetInventoryListSort() throws InterruptedException, IOException {
	  
		  	//Select the Asset module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
		    Reporter.log("Selected the Asset module at sidebar-left | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
	  		Thread.sleep(5000);	
		
		    //Select Asset Inventory List Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    Reporter.log("Selected Asset Inventory List Sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
	    
		    // Click on Asset Name column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[2]");
		    Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);	
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[2]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Asset Name column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[2]");
		    Reporter.log("Click on Asset Name column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[2]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on Asset Description column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[3]");
		    Reporter.log("Click on Asset Description column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[3]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Asset Description column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[3]");
		    Reporter.log("Click on Asset Description column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[3]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on Owner column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[5]");
		    Reporter.log("Click on Owner column column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[5]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Owner column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[5]");
		    Reporter.log("Click on Owner column column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[5]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on Status column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[8]");
		    Reporter.log("Click on Status column column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[8]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Status column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[8]");
		    Reporter.log("Click on Status column column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[8]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on Records column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[4]");
		    Reporter.log("Click on Records column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[4]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Records column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[4]");
		    Reporter.log("Click on Records column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[4]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on Created column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[6]");
		    Reporter.log("Click on Created column column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[6]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Created column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[6]");
		    Reporter.log("Click on Created column column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[6]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on Modified column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[7]");
		    Reporter.log("Click on Modified column column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[7]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Modified column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[7]");
		    Reporter.log("Click on Modified column column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[7]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    // Click on Asset ID column Header to sort for Ascending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[1]");
		    Reporter.log("Click on Asset ID column Header to sort for Ascending order  | ");
		    Thread.sleep(5000);
		    sortascen("//*[@id='assets']/tbody/tr[*]/td[1]"); //Get the Column count and values
		    Thread.sleep(5000);			    
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    
		    // Click on Asset ID column Header to sort for Descending order
		    clickByXpath("//*[@id='assets']/thead/tr/th[1]");
		    Reporter.log("Click on Asset ID column Header to sort for Descending order  | ");
		    Thread.sleep(5000);	
		    sortdesc("//*[@id='assets']/tbody/tr[*]/td[1]"); //Get the Column count and values
		    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		    Thread.sleep(5000);
		    Thread.sleep(5000);
}

		@Test (priority=42, enabled = true)
		public void RiskdeterminationSort() throws IOException, InterruptedException {

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
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);
			
		    // Click on Risk Questionnaire List sub-module
			clickBylinktext("Risk Questionnaire List");
			Reporter.log("Click on Risk Questionnaire List sub-module |");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Information Asset column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Total Sensitive Records column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Total Sensitive Records column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Total Sensitive Records column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Total Sensitive Records Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Risk Analyst column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Risk Analyst column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//tbody[@id='content']/tr[*]/td[5]/div/cw-risk-analyst-choices/select"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			
			// Click on Risk Analyst column Header to sort for Ascending order
			clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Risk Analyst column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//tbody[@id='content']/tr[*]/td[5]/div/cw-risk-analyst-choices/select"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
		}
		@Test (priority=43, enabled = true)
		public void ControlsReviewSort() throws IOException, InterruptedException {
			
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
			//Click on Controls Review sub-module
			clickBylinktext("Controls Review");
			Reporter.log("Select Controls Review sidebar-left Module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[1]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[1]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Controls column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Controls column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Controls column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Controls column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Response column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[9]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Response column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[9]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Clear column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[10]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
				
			// Click on Clear column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[10]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Global column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[11]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Global column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[11]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Notes column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[12]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
					
			// Click on Notes column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[12]/span[1]/span");
			Reporter.log("Click on Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			
		}
		
		@Test (priority=44, enabled = true)
		public void RatingReviewSort() throws IOException, InterruptedException {
			
			//Click on Rating Review sub-module
			clickBylinktext("Rating Review");
			Reporter.log("Select Rating Review sidebar-left Module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[1]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[1]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Thread Event column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Event column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Thread Event column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Event column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Vulnerability column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Vulnerability column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Vulnerability column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Vulnerability column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Risk Likelihood column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Risk Likelihood column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
	}
		
		   @Test(priority=45, enabled = true)
		   public void RiskResponseSort() throws IOException, InterruptedException {
			    
			//Click on Risk Response Module
			assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        Reporter.log("Click on Risk Response Module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
		 	    
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
			
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Residual Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Residual Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Residual Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Residual Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			//Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Treatment column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Treatment column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Treatment column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Treatment column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Evaluation column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[9]/span[1]/span");
			Reporter.log("Click on Evaluation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Evaluation column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[9]/span[1]/span");
			Reporter.log("Click on Evaluation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Impl Planning column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[10]/span[1]/span");
			Reporter.log("Click on Impl Planning column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[10]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Impl Planning column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[10]/span[1]/span");
			Reporter.log("Click on Impl Planning column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[10]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Action Plan column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[11]/span[1]/span");
			Reporter.log("Click on Action Plan column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[11]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Action Plan column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[11]/span[1]/span");
			Reporter.log("Click on Action Plan column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[11]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Reconciliation column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[12]/span[1]/span");
			Reporter.log("Click on Reconciliation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[12]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
					
			// Click on Reconciliation column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[12]/span[1]/span");
			Reporter.log("Click on Reconciliation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[12]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
		   }
		   
		   @Test(priority=46, enabled = true)
		   public void ControlsResponseReviewSort() throws IOException, InterruptedException {
			
	        //Click on Controls Response Review Sub-module
	        assertTextLink("Controls Response Review");
	        clickBylinktext("Controls Response Review");
	        Reporter.log("Click on Controls Response Review Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Control Response drop-down to Select All Option
	        clickByid("crr-control-responses");
	        Thread.sleep(5000);
	        clickBylinktext("All");
	        Reporter.log("Click on Control Response drop-down to Select All Option");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
			/*// Click on Control or Recommendation  column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Control or Recommendation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='container-body']/tr[*]/td[1]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Control or Recommendation column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Control or Recommendation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='container-body']/tr[*]/td[1]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
			
			// Click on Media/Label column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortdesc("//*[@id='container-body']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Media/Label column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
			sortascen("//*[@id='container-body']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Control Response column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Control Response  column Header to sort for Ascending order  | ");
			Thread.sleep(5000);
			sortdesc("//*[@id='container-body']/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Control Response column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Control Response column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='container-body']/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Asset(s) column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Asset column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='container-body']/tr[*]/td[5]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset(s) column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Asset column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='container-body']/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Effectiveness column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Effectiveness column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='container-body']/tr[*]/td[6]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Effectiveness column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Effectiveness column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='container-body']/tr[*]/td[6]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Cost column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Cost column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='container-body']/tr[*]/td[7]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Cost column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Cost column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='container-body']/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Feasibility column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Feasibility column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='container-body']/tr[*]/td[8]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Feasibility column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Feasibility column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='container-body']/tr[*]/td[8]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Action column Header to sort for Ascending order
			//clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[10]/span[1]/span");
			Reporter.log("Click on Action column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='container-body']/tr[*]/td[10]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Action column Header to sort for Ascending order
			clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[10]/span[1]/span");
			Reporter.log("Click on Action column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='container-body']/tr[*]/td[10]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	 
			Thread.sleep(5000);	
			Thread.sleep(5000);		
			
		   }
		   
		   @Test(priority = 47, enabled = true)
		   public void ResidualRatingReviewSort() throws IOException, InterruptedException {
			
			//Click on Residual Rating Review sub-module
			clickBylinktext("Residual Rating Review");
			Reporter.log("Select Residual Rating Review sub-module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Media/label column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Thread Event column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[5]/span[1]/span");
			Reporter.log("Click on Thread Event column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Thread Event column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[5]/span[1]/span");
			Reporter.log("Click on Thread Event column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Vulnerability column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[6]/span[1]/span");
			Reporter.log("Click on Vulnerability column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Vulnerability column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[6]/span[1]/span");
			Reporter.log("Click on Vulnerability column Heade r to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[9]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[9]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Risk Treatment column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[10]/span[1]/span");
			Reporter.log("Click on Risk Treatment column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[10]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Risk Treatment column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[10]/span[1]/span");
			Reporter.log("Click on Risk Treatment column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[10]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[11]/span[1]/span");
			Reporter.log("Click on Risk Likelihood column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[11]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[11]/span[1]/span");
			Reporter.log("Click on Risk Likelihood column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[11]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

	        // Click on Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[12]/span[1]/span");
			Reporter.log("Click on Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[12]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[12]/span[1]/span");
			Reporter.log("Click on Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[12]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

	        // Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

	        // Click on Evaluated column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Evaluated column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Evaluated column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Evaluated column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

	        // Click on Approved column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Approved column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Approved column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Approved column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

	        // Click on + column Header to sort for Ascending order
			clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[1]/span");
			Reporter.log("Click on + column Header to Expand  | ");
			Thread.sleep(5000);	
	        clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[1]/span");
			Reporter.log("Click on + column Header to Expand  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
		   }
		   
		   
		   @Test(priority = 48, enabled = true)
		   public void RiskActionPlanSort() throws IOException, InterruptedException {
			   
			//Click on Risk Action Plan sub-module
			clickBylinktext("Risk Action Plan");
			Reporter.log("Select Risk Action Plan sub-module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			
			/*// Click on Control or Recommendation column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Control or Recommendation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
	    	        Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Control or Recommendation column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Control or Recommendation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
			
			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Implementation Manager column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Implementation Manager column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Implementation Manager column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Implementation Manager column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Priority column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Priority column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Priority column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Priority  column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Due Date column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Due Date column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Due Date column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Due Date column Heade r to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Completion Date column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Completion Date column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Completion Date column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Completion Date column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			/*// Click on Plan Status column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[9]/span[1]/span");
			Reporter.log("Click on Plan Status column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Plan Status column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[9]/span[1]/span");
			Reporter.log("Click on Plan Status column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[9]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);*/
		    
		   }
		   
		   @Test(priority = 49, enabled = true)
		   public void RiskReconciliationSort() throws IOException, InterruptedException {
			   
            //Click on Risk Reconciliation sub-module
			clickBylinktext("Risk Reconciliation");
			Reporter.log("Select Risk Reconciliation sub-module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 

			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[2]/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[2]/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			// Click on Asset Names column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Names column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			// Click on Asset Names column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Names column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Thread Source/Thread Event column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Source/Thread Event column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Thread Source/Thread Event column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Source/Thread Event column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Vulnerability column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[5]/span[1]/span");
			Reporter.log("Click on Vulnerability column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			// Click on Vulnerability column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[5]/span[1]/span");
			Reporter.log("Click on Vulnerability column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Prior risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[6]/span[1]/span");
			Reporter.log("Click on Prior Risk Likelihood column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Prior Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[6]/span[1]/span");
			Reporter.log("Click on Prior Risk Likelihood column Heade r to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			//sortdesc("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			// Click on Prior Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[7]/span[1]/span");
			Reporter.log("Click on Prior Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			//sortascen("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			// Click on Prior Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[7]/span[1]/span");
			Reporter.log("Click on Prior Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Prior Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[8]/span[1]/span");
			Reporter.log("Click on Prior Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Prior Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[8]/span[1]/span");
			Reporter.log("Click on Prior Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[11]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[11]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[11]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[11]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Residual Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[12]/span[1]/span");
			Reporter.log("Click on Residual Likelihood column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[12]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Residual Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[12]/span[1]/span");
			Reporter.log("Click on Residual Likelihood column Heade r to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[12]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);			

			// Click on Residual Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Residual Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

				// Click on Residual Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[13]/span[1]/span");
			Reporter.log("Click on Residual Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[13]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Residual Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[14]/span[1]/span");
			Reporter.log("Click on Residual Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[14]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	

			// Click on Residual Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[14]/span[1]/span");
			Reporter.log("Click on Residual Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[14]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Reconciled Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[15]/span[1]/span");
			Reporter.log("Click on Reconciled Risk Likelihood column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Reconciled Risk Likelihood column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[15]/span[1]/span");
			Reporter.log("Click on Reconciled Risk Likelihood column Heade r to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			//sortdesc("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Reconciled Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[16]/span[1]/span");
			Reporter.log("Click on Reconciled Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			//sortascen("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Reconciled Risk Impact column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[16]/span[1]/span");
			Reporter.log("Click on Reconciled Risk Impact column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[8]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Reconciled  Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[17]/span[1]/span");
			Reporter.log("Click on Reconciled Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[17]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Reconciled Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[17]/span[1]/span");
			Reporter.log("Click on Reconciled Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[17]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			Thread.sleep(5000);	
			Thread.sleep(5000);
	
			// Click on Reconciliation column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[18]/span[1]/span");
			Reporter.log("Click on Reconciliation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[18]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Reconciliation column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[18]/span[1]/span");
			Reporter.log("Click on Reconciliation column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[18]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			Thread.sleep(5000);	
			Thread.sleep(5000);

			// Click on Date Reconciled column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[19]/span[1]/span");
			Reporter.log("Click on Date Reconciled column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[19]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Date Reconciled column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[19]/span[1]/span");
			Reporter.log("Click on Date Reconciled  column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[19]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);

            // Click on + column Header to sort for Ascending order
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[1]/span");
			Reporter.log("Click on + column Header to Expand  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			clickByXpath("//*[@id='risk-reconciliations-table']/thead/tr[2]/th[1]/span");
			Reporter.log("Click on - column Header to close Expand  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000); 	    
			
}	
		   
			  @Test( priority= 50, enabled = true)
			  public void  DocumentSort() throws InterruptedException, IOException {
				  
		    //Click on Documents Module
			clickBylinktext("Documents");
			Reporter.log("Select Documents Module | ");
			Thread.sleep(5000);	  
			Thread.sleep(5000);	 
			
			// Click on File Name column Header to sort for Ascending order
			clickByXpath("//*[@id='file_name']/span[1]/span");
			Reporter.log("Click on File Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
		        Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on File Name column Header to sort for Ascending order
			clickByXpath("//*[@id='file_name']/span[1]/span");
			Reporter.log("Click on File Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Controls Name column Header to sort for Ascending order
			clickByXpath("//*[@id='control']/span[1]/span");
			Reporter.log("Click on Controls Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Controls Name column Header to sort for Ascending order
			clickByXpath("//*[@id='control']/span[1]/span");
			Reporter.log("Click on Controls Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='media']/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='media']/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Asset name column Header to sort for Ascending order
			clickByXpath("//*[@id='assets']/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='assets']/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			  }
		 
  @Test( priority= 51, enabled = true)
  public void  EntityManagementSort() throws InterruptedException, IOException {
				  
				//Click on Manage Account Module
			    assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
			    clickByXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
			    Reporter.log("Click on Manage Account Module | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);
					
			    //Expand the Entity Management Sub-Module
			    assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a/span[2]");
			    clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/a/span[2]");
			    Reporter.log("Expand the Entity Management Sub-Module | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);			
			    Thread.sleep(5000);
			    Thread.sleep(5000);
			    
			    //Click on Entity List
			    assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[1]/a");
			    clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[1]/a");
			    Reporter.log("Click on Entity List | ");
			    Thread.sleep(5000);
			    Thread.sleep(5000);
			    Thread.sleep(5000);
			    Thread.sleep(5000);
			
			// Click on Entity ID column Header to sort for Ascending order
			//clickByXpath("//*[@id='locations']/thead/tr/th[1]");
			Reporter.log("Click on Entity ID column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='locations']/tbody/tr[*]/td[1]"); //Get the Column count and values
		    Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Entity ID column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[1]");
			Reporter.log("Click on Entity ID column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[1]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Entity Name column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[2]");
			Reporter.log("Click on Entity Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='locations']/tbody/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Entity Name column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[2]");
			Reporter.log("Click on Entity Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Street column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[3]");
			Reporter.log("Click on Street column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='locations']/tbody/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Street column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[3]");
			Reporter.log("Click on Street column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[3]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on City column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[4]");
			Reporter.log("Click on City column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='locations']/tbody/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on City column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[4]");
			Reporter.log("Click on City column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Zip column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[5]");
			Reporter.log("Click on Zip column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='locations']/tbody/tr[*]/td[5]"); //Get the Column count and values
		    Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Zip column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[5]");
			Reporter.log("Click on Zip column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[5]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on State column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[6]");
			Reporter.log("Click on State column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	  
			sortascen("//*[@id='locations']/tbody/tr[*]/td[6]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on State column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[6]");
			Reporter.log("Click on State column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[6]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Parent column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[7]");
			Reporter.log("Click on Parent column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='locations']/tbody/tr[*]/td[7]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
						
			// Click on Parent column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[7]");
			Reporter.log("Click on Parent column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
			// Click on Created column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[8]");
			Reporter.log("Click on Created column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortascen("//*[@id='locations']/tbody/tr[*]/td[8]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Created column Header to sort for Ascending order
			clickByXpath("//*[@id='locations']/thead/tr/th[8]");
			Reporter.log("Click on Created column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			sortdesc("//*[@id='locations']/tbody/tr[*]/td[8]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
			
				// Click on Cascading  column Header to sort for Ascending order
				clickByXpath("//*[@id='locations']/thead/tr/th[9]");
				Reporter.log("Click on Cascading column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortascen("//*[@id='locations']/tbody/tr[*]/td[9]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
				// Click on Cascading column Header to sort for Ascending order
				clickByXpath("//*[@id='locations']/thead/tr/th[9]");
				Reporter.log("Click on Cascading column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortdesc("//*[@id='locations']/tbody/tr[*]/td[9]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
				
  }
  
  @Test( priority= 52, enabled = true)
  public void  EntityTagsSort() throws InterruptedException, IOException {
	  
			     //Click on Entity Tags
			     assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
			     clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
			     Reporter.log("Click on Entity Tags | ");
			     Thread.sleep(5000);
			     Thread.sleep(5000);
			     Thread.sleep(5000);	  
				
				// Click on Entity Tag ID column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[1]");
				Reporter.log("Click on Entity Tag ID column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	  
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-tags-list']/tbody/tr[*]/td[1]"); //Get the Column count and values
			        Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);
							
				// Click on Entity Tag ID column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[1]");
				Reporter.log("Click on Entity Tag ID column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);				
				sortdesc("//*[@id='entity-tags-list']/tbody/tr[*]/td[1]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
				// Click on Entity Tags Name column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[2]");
				Reporter.log("Click on Entity Tags Name column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	  
				sortascen("//*[@id='entity-tags-list']/tbody/tr[*]/td[2]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
				// Click on Entity Tags Name column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[2]");
				Reporter.log("Click on Entity Tags Name column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				sortdesc("//*[@id='entity-tags-list']/tbody/tr[*]/td[2]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
				
				// Click on Entity Tags Description column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[3]");
				Reporter.log("Click on Entity Tags Description column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-tags-list']/tbody/tr[*]/td[3]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
							
				// Click on Entity Tags Description column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[3]");
				Reporter.log("Click on Entity Tags Description column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortdesc("//*[@id='entity-tags-list']/tbody/tr[*]/td[3]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
				
				// Click on Entity Tags Category column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[4]");
				Reporter.log("Click on Entity Tags Category column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-tags-list']/tbody/tr[*]/td[4]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
				// Click on Entity Tags Category column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[4]");
				Reporter.log("Click on Entity Tags Category column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortdesc("//*[@id='entity-tags-list']/tbody/tr[*]/td[4]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
				
				// Click on Created Date column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[5]");
				Reporter.log("Click on Created Date column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	  
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-tags-list']/tbody/tr[*]/td[5]"); //Get the Column count and values
			    Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);
							
				// Click on Created Date column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[5]");
				Reporter.log("Click on Created Date column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);				
				sortdesc("//*[@id='entity-tags-list']/tbody/tr[*]/td[5]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);		
				
				// Click on Last Updated column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[6]");
				Reporter.log("Click on Last Updated column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	  
				sortascen("//*[@id='entity-tags-list']/tbody/tr[*]/td[6]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
				// Click on Last Updated column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-tags-list']/thead/tr/th[6]");
				Reporter.log("Click on Last Updated column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				sortdesc("//*[@id='entity-tags-list']/tbody/tr[*]/td[6]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
				
  }
  
  @Test( priority= 53, enabled = true)
  public void  EntityTagsCategorySort() throws InterruptedException, IOException {
			  
			     //Click on Entity Tags Category
			     assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[3]/a");
			     clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[3]/a");
			     Reporter.log("Click on Entity Tags Category | ");
			     Thread.sleep(5000);
			     Thread.sleep(5000);
			     Thread.sleep(5000);	  
				
				// Click on Entity Tags Category ID column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[1]");
				Reporter.log("Click on Entity Tags Category ID column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	  
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[1]"); //Get the Column count and values
			    Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);
							
				// Click on Entity Tags Category ID column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[1]");
				Reporter.log("Click on Entity Tags Category ID column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);				
				sortdesc("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[1]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
			    // Click on Entity Tags Category column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[2]");
				Reporter.log("Click on Entity Tags Category column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[2]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
							
				// Click on Entity Tags Category column Header to sort for Ascending order
				clickByXpath(".//*[@id='entity-category-tags-list']/thead/tr/th[2]");
				Reporter.log("Click on Entity Tags Category column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortdesc("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[2]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
				
				// Click on Entity Tags Category Description column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[3]");
				Reporter.log("Click on Entity Tags Category Description column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[3]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
				// Click on Entity Tags Category Description column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[3]");
				Reporter.log("Click on Entity Tags Category Description column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				sortdesc("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[3]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
				
				// Click on Created Date column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[4]");
				Reporter.log("Click on Created Date column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	  
				Thread.sleep(5000);	
				sortascen("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[4]"); //Get the Column count and values
			    Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);
							
				// Click on Created Date column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[4]");
				Reporter.log("Click on Created Date column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				Thread.sleep(5000);				
				sortdesc("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[4]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);		
				
				// Click on Last Updated column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[5]");
				Reporter.log("Click on Last Updated column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	  
				sortascen("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[5]"); //Get the Column count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				
				// Click on Last Updated column Header to sort for Ascending order
				clickByXpath("//*[@id='entity-category-tags-list']/thead/tr/th[5]");
				Reporter.log("Click on Last Updated column Header to sort for Ascending order  | ");
				Thread.sleep(5000);	
				Thread.sleep(5000);	
				sortdesc("//*[@id='entity-category-tags-list']/tbody/tr[*]/td[5]"); //Get the Column count and values
				//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
				Thread.sleep(5000);	
				Thread.sleep(5000);
  }
  
  @Test( priority= 54, enabled = true)
  public void UserListSort() throws InterruptedException, IOException {
	  
	 Thread.sleep(5000);
	 Thread.sleep(5000);
	 Thread.sleep(5000);
	 
	    //Click on Manage Account Module
		assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
		clickByXpath("//*[@id='sidebar-left']/ul/li[8]/a/span[2]");
		Reporter.log("Click on Manage Account Module | ");
		Thread.sleep(5000);
		Thread.sleep(5000);
		   
		//Click on User management Sub-Module
		assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a/span[2]");
		clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[3]/a/span[2]");
		Reporter.log("Click on User management Sub-Module | ");
		Thread.sleep(5000);
		Thread.sleep(5000);				
			
		//Click on User List under User management Sub-Module
		assertTextLink("User List");
		clickBylinktext("User List");
		Reporter.log("Click on User List under User management Sub-Module | ");
		Thread.sleep(5000);
		
		
 	    // Click on User Name column Header to sort for Ascending order
 	    //clickByXpath("//*[@id='user-management']/thead/tr/th[1]");
 	    Reporter.log("Click on User Name column Header to sort for Ascending order  | ");
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	  
 	    Thread.sleep(5000);	
 	    sortascen("//*[@id='user-management']/tbody/tr[*]/td[1]"); //Get the Column count and values
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);
		
 	    // Click on User Name column Header to sort for Ascending order
 	    clickByXpath("//*[@id='user-management']/thead/tr/th[1]");
 	    Reporter.log("Click on User Name column Header to sort for Ascending order  | ");
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);				
 	    sortdesc("//*[@id='user-management']/tbody/tr[*]/td[1]"); //Get the Column count and values
 	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	
 	   
 	    // Click on Email Address column Header to sort for Ascending order
 	    clickByXpath("//*[@id='user-management']/thead/tr/th[2]");
 	    Reporter.log("Click on Email Address column Header to sort for Ascending order  | ");
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	  
 	    sortdesc("//*[@id='user-management']/tbody/tr[*]/td[2]"); //Get the Column count and values
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	

 	    // Click on Email Address column Header to sort for Ascending order
 	    clickByXpath("//*[@id='user-management']/thead/tr/th[2]");
 	    Reporter.log("Click on Email Address column Header to sort for Ascending order  | ");
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	
 	    //sortascen("//*[@id='user-management']/tbody/tr[*]/td[2]"); //Get the Column count and values
 	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);

 	    // Click on Phone Number column Header to sort for Ascending order
 	    clickByXpath("//*[@id='user-management']/thead/tr/th[3]");
 	    Reporter.log("Click on Phone Number column Header to sort for Ascending order  | ");
 	    Thread.sleep(5000);	
 	    sortascen("//*[@id='user-management']/tbody/tr[*]/td[3]"); //Get the Column count and values
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);	
		
 	    // Click on Phone Number column Header to sort for Ascending order
 	    clickByXpath("//*[@id='user-management']/thead/tr/th[3]");
 	    Reporter.log("Click on Phone Number column Header to sort for Ascending order  | ");
 	    Thread.sleep(5000);
 	    sortdesc("//*[@id='user-management']/tbody/tr[*]/td[3]"); //Get the Column count and values
 	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);
 	    Thread.sleep(5000);	
 	    Thread.sleep(5000);
  }
 	    
  @Test( priority= 55, enabled = true)
  public void ManageRolesSort() throws InterruptedException, IOException {
	  
 	 //Click on Manage Roles under User management Sub-Module
		assertTextLink("Manage Roles");
		clickBylinktext("Manage Roles");
		Reporter.log("Click on Manage Roles under User management Sub-Module | ");
		Thread.sleep(5000);
                    Thread.sleep(5000);	
                    Thread.sleep(5000);	
                    Thread.sleep(5000);

//Click on Product column Header to sort for Ascending order
//clickByXpath("//*[@id='role-management']/thead/tr/th[1]");
Reporter.log("Click on Product column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
Thread.sleep(5000);	  
Thread.sleep(5000);	
sortascen("//*[@id='role-management']/tbody/tr[*]/td[1]"); //Get the Column count and values
Thread.sleep(5000);	
Thread.sleep(5000);	
Thread.sleep(5000);
		
//Click on Product column Header to sort for Ascending order
clickByXpath("//*[@id='role-management']/thead/tr/th[1]");
Reporter.log("Click on Product column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
Thread.sleep(5000);	
Thread.sleep(5000);				
sortdesc("//*[@id='role-management']/tbody/tr[*]/td[1]"); //Get the Column count and values
//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
Thread.sleep(5000);	
Thread.sleep(5000);	

//Click on Role Names column Header to sort for Ascending order
clickByXpath("//*[@id='role-management']/thead/tr/th[2]");
Reporter.log("Click on Role Names column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
Thread.sleep(5000);	  
sortascen("//*[@id='role-management']/tbody/tr[*]/td[2]"); //Get the Column count and values
Thread.sleep(5000);	
Thread.sleep(5000);	

//Click on Role Names column Header to sort for Ascending order
clickByXpath("//*[@id='role-management']/thead/tr/th[2]");
Reporter.log("Click on Role Names column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
Thread.sleep(5000);	
sortdesc("//*[@id='role-management']/tbody/tr[*]/td[2]"); //Get the Column count and values
//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
Thread.sleep(5000);	
Thread.sleep(5000);

//Click on Description column Header to sort for Ascending order
clickByXpath("//*[@id='role-management']/thead/tr/th[3]");
Reporter.log("Click on Description column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
sortascen("//*[@id='role-management']/tbody/tr[*]/td[3]"); //Get the Column count and values
Thread.sleep(5000);	
Thread.sleep(5000);	
		
//Click on Description column Header to sort for Ascending order
clickByXpath("//*[@id='role-management']/thead/tr/th[3]");
Reporter.log("Click on Description column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
sortdesc("//*[@id='role-management']/tbody/tr[*]/td[3]"); //Get the Column count and values
//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
Thread.sleep(5000);	
Thread.sleep(5000);
Thread.sleep(5000);	
Thread.sleep(5000);

//Click on Role Type column Header to sort for Ascending order
clickByXpath("//*[@id='role-management']/thead/tr/th[4]");
Reporter.log("Click on Role Type column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
sortascen("//*[@id='role-management']/tbody/tr[*]/td[4]"); //Get the Column count and values
Thread.sleep(5000);	
Thread.sleep(5000);	
Thread.sleep(5000);	
Thread.sleep(5000);

//Click on Role Type column Header to sort for Ascending order
clickByXpath("//*[@id='role-management']/thead/tr/th[4]");
Reporter.log("Click on Role Type column Header to sort for Ascending order  | ");
Thread.sleep(5000);	
sortdesc("//*[@id='role-management']/tbody/tr[*]/td[4]"); //Get the Column count and values
//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
Thread.sleep(5000);	
Thread.sleep(5000);

	
  }
	
	  
}

