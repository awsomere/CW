package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RatingReviewUpdated extends WrapperClass {
	
	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=390, enabled =true)
	  public void NavigatePage_RatingReview() throws InterruptedException, IOException {
		  
		  		    Thread.sleep(8000);
		  		  
	      //Click on rating review sub-module
	        assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[5]/a");
			  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[5]/a");
			  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);
		    Thread.sleep(8000);
		 
		   
}
	  
	@Test(priority=391, enabled =true)
	  public void PageHearder_RatingReview() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Rating Review");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=392, enabled = true)
	   public void PanelBar_RatingReview() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Rating Review");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   /*// Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 6 of 6 entries");
		   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 7 of 7 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); */
		   
	   }
	   
	 @Test(priority=393, enabled = false)
	 public void PageLevelHelp_RatingReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	     clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(8000);
		    //Thread.sleep(3000);
		    
		    // Click OK Button in PageHelp pop-up window
	     
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
	     clickByXpath("html/body/div[3]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(3000);
		   // Thread.sleep(3000);
		   
	 }
		
	 @Test(priority=394, enabled = false)
	 public void RiskManagementMap_RatingReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(8000);
		   
		   clickByXpath("html/body/div[3]/div/div/div[2]/button");
		   Thread.sleep(8000);
	 }
	 
	 @Test(priority=395, enabled = true)
	  public void ScenarioAdvisory_RatingReview() throws InterruptedException, IOException {
		  
		    Thread.sleep(8000);
		
		  //Click on Scenario Advisory column Header
		    assertTextXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
		    clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
		    Reporter.log("Click on Scenario Advisory | ");
		    Thread.sleep(8000);
		    
		  //Click on Scenario Advisory column Header
		    assertTextXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
		    clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
		    Reporter.log("Click on Scenario Advisory | ");
		    Thread.sleep(8000);		    
		    Thread.sleep(8000);		    
		 	
		 	//Click on Scenario Advisory
		    //clickByXpath("//*[@id='change_review_id']/label");
		    clickByXpath("//*[@id='content']/tr[1]/td[3]/cw-advisory/a/span");
		    Reporter.log("Click on Scenario Advisory | ");
		    Thread.sleep(3000);
		   Thread.sleep(3000);
		    
			// Click on Save button		    
			  assertTextXpath("html/body/div[3]/div/div/div[3]/button[2]");
			  clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
			  Reporter.log("Click on Save button | ");
			  Thread.sleep(8000);
			  Thread.sleep(2000);	
	 }
	 
			 
	 @Test(priority=396, enabled = true)
	  public void IRMA9553_Vulnerabilitylink_RatingReview() throws InterruptedException, IOException {
		 
		 
		    //Click on Vulnerability link
		    GetText("//*[@id='content']/tr[1]/td[6]/div/a");
		    Thread.sleep(3000);
		    clickByXpath("//*[@id='content']/tr[1]/td[6]/div/a");
		    Reporter.log("Click on 1st Vulnerability link | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(3000);
		    
		  //Click on Vulnerability link
	        assertEquals("//*[@id='uniqueMedia']/tbody/tr/td[7]",Expvalue);
	        Thread.sleep(8000);
	        Thread.sleep(8000);
	        
	        
	 }
	 
	 @Test(priority=397, enabled = true)
	  public void ReturnTo_RatingReview() throws IOException, InterruptedException {
		  
		  Thread.sleep(8000);
		    
		    //Click on rating review sub-module
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[5]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[5]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(8000);
		  clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    
		    
	 }
	 
	 @Test(priority=398, enabled = true)
	  public void ContextHelpIcon_RatingReview() throws InterruptedException, IOException {
	 
		  Thread.sleep(8000);
		  
		    //Click on ContextHelp Icon
		    //assertTextXpath("html/body/section/section/div[4]/div/div[1]/div[2]/table/tbody/tr[2]/td[6]/span/span/i");
		    clickByXpath("//*[@id='review.vulnerability_id']/span/i");
		    Reporter.log("Click on ContextHelp Icon | ");
		    Thread.sleep(8000);
		    
		    //Click on Close button in ContextHelp Pop-up
		    assertTextXpath("//div[3]/div/div/div[3]/button");
		    clickByXpath("//div[3]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in ContextHelp Pop-up | ");
		    Thread.sleep(8000);
		    
	 }
	 
	 @Test(priority=399, enabled = true)
	  public void Notes_RatingReview() throws InterruptedException, IOException {
	 
		    			    		   		    
		    //1st
		    //Click on Notes button to add 
		    assertTextXpath("//*[@id='content']/tr[1]/td[13]/div/a/strong");
		    clickByXpath("//*[@id='content']/tr[1]/td[13]/div/a/strong");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click on Create Button
		   assertTextXpath("html/body/div[5]/div/div/div/div[4]/div[3]/button[1]");
		    clickByXpath("html/body/div[5]/div/div/div/div[4]/div[3]/button[1]");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on Close button in popup
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
		    clickByXpath("html/body/div[3]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(8000);
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		   
		    
	  }
	  
	  @Test(priority=400, enabled =true)
	  public void QuickFilter_RatingReview() throws InterruptedException, IOException {
		 
		  Thread.sleep(3000);
	     //Click on Risk Rating Filter drop-down
  	     clickByXpath("//*[@id='risk-rated']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
  	     Thread.sleep(8000);
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='risk-rated']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[2]/a");
  	     Thread.sleep(8000);
	     Thread.sleep(3000);
	     
	   //Click on My Risk Filter drop-down
  	     clickByXpath("//*[@id='my-risks']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[1]/a");
  	     Thread.sleep(8000);
	     Thread.sleep(2000);  
	     
	   //Click on My Risk Filter drop-down
  	     clickByXpath("//*[@id='advisory-status']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
  	     Thread.sleep(8000);
	     Thread.sleep(2000);    
	     	     
  	 }
	  
	  @Test(priority=401, enabled = true)
	  public void IRMA6213_UnrelatedRisk_ClearIcon_Dated_RatingReview() throws InterruptedException {
	  
	      Thread.sleep(3000);
	      
	     //Click on Risk Rating Filter drop-down
	     clickByXpath("//*[@id='risk-rated']");
	     Thread.sleep(3000);
	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[3]/a");
	     Thread.sleep(8000);
	     Thread.sleep(8000);
	     
	     //Click on Clear Icon to check the date get displayed 
	     clickByXpath("//*[@id='content']/tr[1]/td[12]/span/i");
	     Thread.sleep(8000);
	     
	     //Check the date is Blank
	     assertEquals("//*[@id='content']/tr[1]/td[7]", "");
	    Thread.sleep(6000);
	    
	  //Click on Clear Icon to check the date get displayed 
	     clickByXpath("//*[@id='content']/tr[1]/td[12]/span/i");
	     Thread.sleep(8000);
	    
	    //Check the date is Blank
	     assertEquals("//*[@id='content']/tr[1]/td[8]", "");
	    Thread.sleep(6000);
	    
	     //Click on Risk Rating Filter drop-down
	     clickByXpath("//*[@id='risk-rated']");
	     Thread.sleep(3000);
	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
	     Thread.sleep(8000);
	     Thread.sleep(8000);
	     
	  }
	  
	  @Test(priority=402, enabled = true)
	  public void Filter_RatingReview() throws InterruptedException {
		  
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
		  		Thread.sleep(3000);
		  	    Thread.sleep(3000);   
		  		//Thread.sleep(3000); 
		  	
		  		//Click on Media Drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[3]/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		
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
		  		Thread.sleep(8000);   
		  		//Thread.sleep(3000);   
		  		
	  }
	  
	  @Test(priority=403, enabled = true)
	  public void ClearFilter_RatingReview() throws InterruptedException {
		  		
		  Thread.sleep(8000);   
		  
		  		//Click on 'Clear Filter' Button 		  		
		  			assertTextXpath("//i[2]");
		  			clickByXpath("//i[2]");
		  			Reporter.log("Click on 'Clear Filter' Button  | ");
		  		Thread.sleep(8000);
		  	   Thread.sleep(8000);   
		  	   Thread.sleep(9000); 
	  }
	  
	  @Test(priority=404, enabled = true)
	  public void Export_RatingReview() throws InterruptedException {
		  		
		  Thread.sleep(8000);   
		  					  
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
				   Thread.sleep(3000);
				  //Thread.sleep(3000);
				  
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
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
			  }
	  
	  @Test (priority=405, enabled = true)
		public void Sorting_RatingReview() throws IOException, InterruptedException {
			
		    Thread.sleep(3000);
		  
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			Thread.sleep(8000);	  
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			Thread.sleep(8000);	
		    sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);
			
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			Thread.sleep(8000);	
			sortascen("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);	
						
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
			Thread.sleep(3000);	
			sortdesc("//*[@id='content']/tr[*]/td[4]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);
			
	}
	  
	  @Test (priority=406, enabled = true)
	public void ClearResponse_RatingReview() throws IOException, InterruptedException {
		
		  Thread.sleep(8000);	
		  
		// Click on Clear Response
		  clickByXpath("//*[@id='content']/tr[1]/td[12]/span/i");
		  Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);	
		  
	  }
	  
	  @Test (priority=407, enabled = true)
      public void ReSelect_RatingReview() throws IOException, InterruptedException {
			
			  Thread.sleep(8000);	
		  
		// Select option from Drop-down
		  clickByXpath("//*[@id='content']/tr[1]/td[9]/cw-rr-risk-choices/div/button");
		  Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
		  Thread.sleep(3000);
		  
		// Select option from Drop-down
		  clickByXpath("//*[@id='content']/tr[1]/td[9]/cw-rr-risk-choices/div/ul/li[4]/a");
		  Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);
		  
		// Select option from Drop-down
		  clickByXpath("//*[@id='content']/tr[1]/td[10]/cw-rr-risk-choices/div/button");
		  Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
		  Thread.sleep(3000);
		  
		// Select option from Drop-down
		  clickByXpath("//*[@id='content']/tr[1]/td[10]/cw-rr-risk-choices/div/ul/li[3]/a");
		  Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);
		  
		  
	  }
	  
	  @Test(priority=408, enabled =true)
	  public void RiskRatingInfo_RatingReview() throws InterruptedException, IOException {

		  Thread.sleep(8000);
		  
		  //MouseHover On Risk Rating Value Info
		  mouseHoverByXpath("//*[@id='content']/tr[1]/td[11]/div/div/span");
		  Thread.sleep(2000);
	  }
	  
	  @Test(priority=409, enabled =true)
	  public void AllFields_RatingReview() throws InterruptedException, IOException {
      
		  Thread.sleep(3000);
		  Thread.sleep(3000);
              
		  //Click on Quick Column Selector Filter drop-down
		  assertTextXpath("//*[@id='risk-rated']");
		  Thread.sleep(3000);
		  
		//Click on Control Type Filter drop-down
		  assertTextXpath("//*[@id='my-risks']");
		 Thread.sleep(3000);
		 
		//Click on Response Filter drop-down
		//*[@id="advisory-status"]
		 assertTextXpath("//*[@id='advisory-status']");
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
	  
	  @Test(priority=410, enabled =true)
	  public void ColumnHeader_RatingReview() throws InterruptedException, IOException {

  		
		  Thread.sleep(8000);
		  
  		// Click on Component / Group Name column Header
  		assertEquals("//table[@id='rating_review']/thead/tr/th/span/span", "Component / Group Name");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th/span/span");
  		Thread.sleep(2000);	
  		
  		// Click on Asset Name(s) column Header 
  		assertEquals("//table[@id='rating_review']/thead/tr/th[2]/span/span", "Asset Name(s)");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[2]/span/span");
  		Thread.sleep(2000);	
  		
  		// Click on Control Advisory column Header 
  		assertEquals("//table[@id='rating_review']/thead/tr/th[3]/span/span", "Scenario Advisory");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[3]/span/span");
  		Thread.sleep(2000);	
  		
  		// Click on Control column Header
  		assertEquals("//table[@id='rating_review']/thead/tr/th[4]/span/span", "Threat Source");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[4]/span/span");		
  		Thread.sleep(2000);	
  				
  		assertEquals("//table[@id='rating_review']/thead/tr/th[5]/span/span", "Threat Event");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[5]/span/span");		
  		Thread.sleep(2000);	
  		
  		// Click on Due Date column Header 
  		assertEquals("//table[@id='rating_review']/thead/tr/th[6]/span/span", "Vulnerability");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[6]/span/span");		
  		Thread.sleep(2000);		
  		
  		// Click on Action column Header 
  		assertEquals("//table[@id='rating_review']/thead/tr/th[7]/span/span", "Created Date");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[7]/span/span");		
  		Thread.sleep(2000);		
  		
  		// Click on Multi-selector column Header 
  		assertEquals("//table[@id='rating_review']/thead/tr/th[8]/span/span", "Updated Date");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[8]/span/span");		
  		Thread.sleep(2000);	
  		
  		assertEquals("//table[@id='rating_review']/thead/tr/th[9]", "Risk Likelihood");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[9]");		
  		Thread.sleep(2000);	
  		
  		assertEquals("//table[@id='rating_review']/thead/tr/th[10]/span/span", "Risk Impact");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[10]/span/span");		
  		Thread.sleep(2000);	
  		
  		assertEquals("//table[@id='rating_review']/thead/tr/th[11]/span/span", "Risk Rating");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[11]/span/span");		
  		Thread.sleep(2000);
  		
  		assertEquals("//table[@id='rating_review']/thead/tr/th[12]", "Clear");
  		Thread.sleep(2000);	
  		mouseHoverByXpath("//table[@id='rating_review']/thead/tr/th[12]");		
  		Thread.sleep(2000);
		     
    }
	  
	  @Test(priority=411, enabled =true)
	  public void IRMA6248_MultiSelectCheckBox_RatingReview() throws InterruptedException, IOException {

		  Thread.sleep(8000);
		  
		// Select Multiselect
		  clickByXpath("//*[@id='select-all']/div/label");
		  Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);
		  
		// Select Multiselect
		  clickByXpath("//*[@id='select-all']/div/label");
		  Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);
	  }
}
