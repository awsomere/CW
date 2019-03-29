package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ControlReviewTestcases extends WrapperClass {
	
	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=130, enabled =true)
	  public void NavigatePage_ControlReview() throws InterruptedException, IOException {
		  
		    Thread.sleep(8000);
		    
	        //Click on Controls Review Page
	        assertTextLink("Controls Review");
		    clickBylinktext("Controls Review");
		    Reporter.log("Click on Controls Review Page | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		   
}
	  
	@Test(priority=131, enabled =true)
	  public void PageHearder_ControlReview() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Controls Review");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=132, enabled = true)
	   public void PanelBar_ControlReview() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Controls Review");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   /*// Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 25 of 45 entries");
		   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 25 of 47 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   */
	   }
	   
	 @Test(priority=133, enabled = true)
	 public void PageLevelHelp_ControlReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	     clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
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
		
	 @Test(priority=134, enabled = true)
	 public void RiskManagementMap_ControlReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[4]/div/div/div[2]/button");
		   Thread.sleep(3000);
	 }
	
	
	@Test(priority=135, enabled =true)
	  public void Notes_ControlReview() throws InterruptedException, IOException {
		  
		 Thread.sleep(3000); 
		 Thread.sleep(8000);
	    Thread.sleep(8000);
	       	       			 		        	
		    		    
		    /*//Click on Control Advisory
		    assertTextXpath("html/body/section/section/div[4]/div/div/div/div[2]/div[2]/div/div/table[2]/tbody/tr[2]/td[1]/cw-advisory[1]/a/span");
		    clickByXpath("html/body/section/section/div[4]/div/div/div/div[2]/div[2]/div/div/table[2]/tbody/tr[2]/td[1]/cw-advisory[1]/a/span");
		    Reporter.log("Click on Control Advisory | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click checkbox for Change Reviewed
			  assertTextXpath("html/body/div[4]/div/div/div[3]/div/div/label");
			  clickByXpath("html/body/div[4]/div/div/div[3]/div/div/label");
			  Reporter.log("Click checkbox for Change Reviewed | ");
			  Thread.sleep(3000);
			  Thread.sleep(2000);
			  
			// Click on Save button
			  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  Reporter.log("Click on Save button | ");
			  Thread.sleep(8000);
			  Thread.sleep(2000);*/
		    		    		
		    //1st
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[14]/div/a");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[14]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
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
		    assertTextXpath("//div[4]/div[3]/button[1]");
		    clickByXpath("//div[4]/div[3]/button[1]");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on Close button in popup
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(8000);
		    Thread.sleep(2000);
		    //Thread.sleep(3000);
		    
	}
	
	@Test(priority=136, enabled =true)
	  public void ClearResponse_ControlReview() throws InterruptedException, IOException {
		   		    
		    //Click on ClearResponse for negative scenario
		    assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[12]/span/cw-s-response-clear/div/span/i");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[12]/span/cw-s-response-clear/div/span/i");
		    Reporter.log("Click on ClearResponse | ");
		    Thread.sleep(2000);
		    Thread.sleep(8000);
		    //Thread.sleep(8000);
		    
		    // Click on Remove button for negative scenario
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		    Reporter.log("Click on Remove button | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);	
	}
	
		    
    @Test(priority=137, enabled =true)
    public void SelectResponse_ControlReview() throws InterruptedException, IOException {
		    
		    // Click on Control Response again
		 assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[11]/cw-s-response-choices/div/div/label[1]");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[11]/cw-s-response-choices/div/div/label[1]");
		    Reporter.log("Click on Control Response again| ");
		    Thread.sleep(3000);
		    Thread.sleep(2000);
		    
		 // Click on Global Checkbox
		    assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[13]/cw-s-response-global/div/div");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[13]/cw-s-response-global/div/div");
		    Reporter.log("Click on Control Response again| ");
		    Thread.sleep(3000);
		    Thread.sleep(2000);
		    
		    // Click on Global Checkbox
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		    Reporter.log("Click on Proceed Button| ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		   
		       
 	         		       
	  }
	  
	  @Test(priority=138, enabled =true)
	  public void QuickFilter_ControlReview() throws InterruptedException, IOException {
		 
		     Thread.sleep(2000);
		    //Thread.sleep(3000);
		    
		     //Click on Quick Column Selector Filter drop-down
	   	     clickByXpath("//*[@id='cr-column-set']");
	   	     Thread.sleep(5000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
	   	     Thread.sleep(8000);
		     Thread.sleep(8000);
		     Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
		     //Thread.sleep(8000);
		  
		    //Click on Control Type Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='control-type']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
			 Thread.sleep(8000);
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		     Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
	     
		     //Click on Response Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='controls-answered']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[2]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);  
		     Thread.sleep(8000);
			 Thread.sleep(8000);
			 Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
		     Thread.sleep(8000);
	     	     
		     //Click on New Or Updated Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='view-filter']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[1]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		     Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			 Thread.sleep(8000);
		     clickByXpath("//*[@id='view-filter']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[3]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		     Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
		     Thread.sleep(8000);
			 Thread.sleep(8000);
		     //Thread.sleep(8000);
	 }
	  
	  @Test(priority=139, enabled = false)
	  public void Filter_ControlsReview() throws InterruptedException {
		  
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

		  		// Click on Control Response drop-down
		  		assertTextXpath("//div[2]/div[4]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[4]/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[4]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[4]/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

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
	  
	  @Test(priority=140, enabled = true)
	  public void Export_ControlsReview() throws InterruptedException, IOException {
		  	
				 Thread.sleep(8000);
				 Thread.sleep(8000);
				 Thread.sleep(8000);
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
				  Thread.sleep(8000);
				  Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(8000);
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
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				  Thread.sleep(8000);
				    Thread.sleep(8000);
				  Thread.sleep(8000);
				  Thread.sleep(8000);
	  }
	  
	  @Test (priority=141, enabled = false)
		public void Sorting_ControlsReview() throws IOException, InterruptedException {
			
			//Thread.sleep(8000);	
			Thread.sleep(8000);	
			Thread.sleep(3000);
						
			// Click on Media/label column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[1]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
			Thread.sleep(8000);		  
			Thread.sleep(8000);	
			sortascen("//*[@id='rrReport']/tbody/tr[*]/td[1]"); //Get the Column count and values
	    	Thread.sleep(8000);	
			Thread.sleep(8000);	
			Thread.sleep(8000);
						
			// Click on Media/label column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[1]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[1]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
			Thread.sleep(8000);
			Thread.sleep(8000);				
			sortdesc("//*[@id='rrReport']/tbody/tr[*]/td[1]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(8000);
			Thread.sleep(8000);	
			Thread.sleep(8000);	  
			sortascen("//*[@id='rrReport']/tbody/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);	
			
			// Click on Asset Name column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
			Thread.sleep(8000);	
			Thread.sleep(8000);	
			sortdesc("//*[@id='rrReport']/tbody/tr[*]/td[2]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(8000);	
			Thread.sleep(8000);		
			
		}
	  
	  @Test (priority=142, enabled = true)
		public void NIST_ControlsReview() throws IOException, InterruptedException {
		  
		  
		  Thread.sleep(8000);
		    Thread.sleep(8000);
		    
		// Click on NIST Icon
		  assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[7]/span[2]/cw-info-nist/div/div[1]/span");
		  clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[7]/span[2]/cw-info-nist/div/div[1]/span");
		  Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);	
		  clickByXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
		  Thread.sleep(8000);
		    Thread.sleep(8000);
		  
	 
	  }
	  @Test (priority=143, enabled = false)
	  public void ControlTag_ControlsReview() throws IOException, InterruptedException {
		  
		  
		  // Click on ControTag
		  assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[8]/cw-tag/a");
		  clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[8]/cw-tag/a");
		  Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);	
		  
		  // Click on Check the Tag checkbox
		    assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
		    clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
		    Reporter.log("Click on Close button in ? Pop-up | ");
		    //clickByXpath("html/body/div[4]/div/div/div[3]/button");
	        Thread.sleep(8000); 
	       
	     // Click on Done button
		     assertTextXpath("//div[3]/button[2]");
		     clickByXpath("//div[3]/button[2]");
		     Reporter.log("Click on Close button | ");
		     Thread.sleep(8000);
		     Thread.sleep(3000);	
	  }

	  @Test(priority=144, enabled =true)
	    public void Autoloading_ControlsGlobalMedia() throws InterruptedException, IOException { 

	 		Thread.sleep(3000);
	 		Thread.sleep(8000);
		    Thread.sleep(8000);
		   
	 		
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	 		ArrowDown();
	  }
	  
}
