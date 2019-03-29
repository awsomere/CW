package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ResidualRatingReviewTestcases extends WrapperClass{

	public WebDriver driver;
	  String browser=null;
	
	@Test(priority=200, enabled =true)
	public void NavigatePage_ResidualRatingReview() throws InterruptedException, IOException {
	        
	 Thread.sleep(5000);
		 
	   //Click on Residual Rating Review Sub-module
	    assertTextLink("Residual Rating Review");
	    clickBylinktext("Residual Rating Review");
	    Reporter.log("Click on Residual Rating Review Sub-module | ");
	    Thread.sleep(5000);
	    Thread.sleep(5000);
	    Thread.sleep(5000);
	    Thread.sleep(5000);
	    Thread.sleep(5000);
	        
     }
	
	@Test(priority=201, enabled =true)
	  public void PageHearder_ResidualRatingReview() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Residual Rating Review");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=202, enabled = true)
	   public void PanelBar_ResidualRatingReview() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Response Residual Rating Review");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   /*// Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 1 of 1 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); */
		   
	   }
	   
	 @Test(priority=203, enabled = true)
	 public void PageLevelHelp_ResidualRatingReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(5000);
		    //Thread.sleep(3000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
	     clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(3000);
		   // Thread.sleep(3000);
		   
	 }
		
	 @Test(priority=204, enabled = true)
	 public void RiskManagementMap_ResidualRatingReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("//div[4]/div/div/div[2]/button");
		   Thread.sleep(3000);
	 }
	
 @Test(priority=205, enabled =true)
public void Functions_ResidualRatingReview() throws InterruptedException, IOException {
		 		    	        
	    Thread.sleep(5000);
	    
	  //Click on Quick Column Selector Filter drop-down
	     clickByXpath("//*[@id='risk-treatment-option']");
	     Thread.sleep(3000);
	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[6]/a");
	     Thread.sleep(3000);
	     //Thread.sleep(3000);
	     Thread.sleep(8000);
	     Thread.sleep(5000);
            
   // Click on Expand Button 
      assertTextXpath("//*[@id='content']/tr[1]/td[1]/span");
		clickByXpath("//*[@id='content']/tr[1]/td[1]/span");
		Reporter.log("Click on Filter Button | ");
		Thread.sleep(5000);
		//Thread.sleep(3000);
		  
	/*// Click on Filter Button 
		assertTextXpath("//*[@id='content']/tr[2]/td/table/tbody/tr[1]/td[5]/div/input");
		sendvaluebyxpath("//*[@id='content']/tr[2]/td/table/tbody/tr[1]/td[5]/div/input", "600");
		Reporter.log("Enter Cost Value successfully | ");		
		Thread.sleep(5000);
					
	// Click on Proceed Button 
      assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
		clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		Reporter.log("Click on Filter Button | ");
		Thread.sleep(5000);
		//Thread.sleep(3000);
*/		
	// Click on Expand Button 
      assertTextXpath("//*[@id='content']/tr[1]/td[1]/span");
		clickByXpath("//*[@id='content']/tr[1]/td[1]/span");
		Reporter.log("Click on Filter Button | ");
		Thread.sleep(5000);
		Thread.sleep(3000);
		
 }
 
 @Test(priority=206, enabled =true)
   public void QuickFilter_ResidualRatingReview() throws InterruptedException, IOException {
		
		
	      
   	//Click on Include/Hide Accepted Filter drop-down
 	     clickByXpath("//*[@id='approval-status']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[3]/a");
 	     Thread.sleep(3000);
	     //Thread.sleep(3000);
	     Thread.sleep(5000);
	     Thread.sleep(5000);
	     
	   //Click on Minimize sidebar
	      clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
	      Thread.sleep(5000);
	      Thread.sleep(3000);
	      //Thread.sleep(3000);
	 }
 
   
 @Test(priority=207, enabled = false)
	  public void Filter_ResidualRatingReview() throws InterruptedException {
		  
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

		 /* 		//click on Media label drop-down
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
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		// Click on Risk Treatment drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Risk Treatment Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
*/			  		
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
		  		Thread.sleep(5000);   
		       	       
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
 
 
     @Test(priority=208, enabled = true)
	  public void Export_ResidualRatingReview() throws InterruptedException {
		  	  
	   Thread.sleep(5000);
		//Thread.sleep(3000);
		  
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
		  //Thread.sleep(5000);
		  Thread.sleep(5000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		 Thread.sleep(5000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(5000);
		  Thread.sleep(5000);
		  //Thread.sleep(5000);
	      Thread.sleep(5000);
   }
 
 @Test(priority =209, enabled = true)
 public void Sorting_ResidualRatingReview() throws IOException, InterruptedException {
	
	
	// Click on Media/label column Header to sort for Ascending order
	clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[4]/span[1]/span");
	Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
	Thread.sleep(5000);	
	
				
	// Click on Media/label column Header to sort for Ascending order
	clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[4]/span[1]/span");
	Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
	Thread.sleep(5000);	
	Thread.sleep(5000);	
	
	Thread.sleep(8000);
	//Click on Minimize sidebar
        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
        Thread.sleep(5000);
        Thread.sleep(3000);
        //Thread.sleep(3000); 

	
 }
 

}
