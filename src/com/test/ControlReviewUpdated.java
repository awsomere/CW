package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ControlReviewUpdated extends WrapperClass {
	
	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=361, enabled =true)
	  public void NavigatePage_ControlReview() throws InterruptedException, IOException {
		  
		  
		    Thread.sleep(8000);
		            
	        //Click on Controls Review Page
	        assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[4]/a");
			  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[4]/a");
			  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);		   
		    Thread.sleep(8000);
		  
		   
}
	  
	@Test(priority=362, enabled =true)
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
	
	 @Test(priority=363, enabled = true)
	   public void PanelBar_ControlReview() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Determination Controls Review");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(4000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   /*// Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 22 of 22 entries");
		   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 25 of 47 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(4000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   */
	   }
	   
	 @Test(priority=364, enabled = false)
	 public void PageLevelHelp_ControlReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	     clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
	     clickByXpath("html/body/div[3]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(3000);
		   // Thread.sleep(3000);
		   
	 }
		
	 @Test(priority=365, enabled = false)
	 public void RiskManagementMap_ControlReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[3]/div/div/div[2]/button");
		   Thread.sleep(3000);
	 }
	
	
	@Test(priority=366, enabled =true)
	  public void ControlAdvisory_ControlReview() throws InterruptedException, IOException {
		  
		 Thread.sleep(3000); 
		 Thread.sleep(8000);
	    Thread.sleep(8000);
	    
	       	       			 		        	
	   //Click on Control Advisory	fileds for Desc order
	  //  assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]");
	    clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]");
	    Thread.sleep(3000); 
		 Thread.sleep(8000);       
	    
		    //Click on Control Advisory	
	        assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[3]/cw-advisory/a/span");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[3]/cw-advisory/a/span");
		    Reporter.log("Click on Control Advisory | ");
		    Thread.sleep(8000);
		    
		    
			// Click on Save button
			  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  Reporter.log("Click on Save button | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);
	    
	}
	
	@Test(priority=367, enabled =true)
	  public void NIST_ControlReview() throws InterruptedException, IOException {
		  
			    Thread.sleep(8000);
	    
		  // Click NIST Button
			    clickByXpath("//tr[1]//td[7]//cw-info-nist[1]//div[1]//div[1]//span[1]");
	    Reporter.log("Click ? Button | ");
	    Thread.sleep(8000);
	   Thread.sleep(8000);
       
	    // Click on Close button in ? Pop-u
	  assertTextXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
	    clickByXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
	    Reporter.log("Click on Close button in ? Pop-up | ");
    Thread.sleep(8000); 
    Thread.sleep(8000);

	 
}
	
	@Test (priority=368, enabled =true)
	  public void ControlTag_ControlsReview() throws IOException, InterruptedException {
		  
		  
		Thread.sleep(8000);
		
		  // Click on ControTag
		  clickByXpath("//tr[1]//td[8]//cw-tag[1]//a[1]//span[1]");
		  Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
		  Thread.sleep(8000);	
		  Thread.sleep(8000);	
		  
		
	       
	     // Click on Done button
		  assertTextXpath("//button[@class='btn btn-success pull-left']");
		     clickByXpath("//button[@class='btn btn-success pull-left']");
		     Reporter.log("Click on Close button | ");
		     Thread.sleep(8000);
		     Thread.sleep(3000);	
	  }

		    		    		
	    @Test(priority=370, enabled =true)
		  public void IRMA6801_Notes_ControlReview() throws InterruptedException, IOException {
			  
			 
		    Thread.sleep(8000);
		    //1st
		    //Click on Notes button to add text
		    assertTextXpath("//tr[1]//td[11]//div[1]//a[1]//strong[1]");
		    clickByXpath("//tr[1]//td[11]//div[1]//a[1]//strong[1]");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(8000);
		    Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    Thread.sleep(3000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(5000);
		    Thread.sleep(3000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button[1]");
		    clickByXpath("//div[4]/div[3]/button[1]");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(8000);
		    Thread.sleep(3000);
		    
		    // Click on Page breadcrumb
			   assertEquals("//*[@id='note-details-table']/tbody/tr/td[3]", "Media Note");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(4000);
		   
		    
	}
	
	@Test(priority=371, enabled =true)
	  public void ClearResponse_ControlReview() throws InterruptedException, IOException {
		   		    
		Thread.sleep(8000);
		
	    
		  //Click on Close button in popup
		    clickBycssSelector(".modal-footer > .pull-right");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(3000);
		    
		    //Click on ClearResponse for negative scenario
		    clickByXpath("//tr[1]//td[10]//cw-answer-clear[1]//div[1]//span[1]//i[1]");
		    Reporter.log("Click on ClearResponse | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    
		 
	}
	
		    
   @Test(priority=372, enabled =true)
   public void SelectResponse_ControlReview() throws InterruptedException, IOException {
		    
   	
   	 Thread.sleep(8000);	
		    // Click on Control Response again
		 //assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[11]/cw-s-response-choices/div/div/label[1]");
		   clickByXpath("//tr[1]//td[9]//cw-answer-media[1]//div[1]//ul[1]//li[2]//div[1]//label[1]");
		    Reporter.log("Click on Control Response again| ");
		    Thread.sleep(3000);
		    Thread.sleep(4000);
		    
		    
   }
   
   @Test(priority=373, enabled =false)
	  public void ColumnHeader_ControlReview() throws InterruptedException, IOException {
 		
	   Thread.sleep(8000);	
	   
 		// Click on Component / Group Name column Header
 		//assertEquals("(//table[@id='rrReport']/thead/tr/th/span/span)[2]", "Component / Group Name");
 		Thread.sleep(4000);	
 		mouseHoverByXpath("(//table[@id='rrReport']/thead/tr/th/span/span)[2]");
 		Thread.sleep(4000);	
 		
 		// Click on Asset Name(s) column Header 
 		//assertEquals("(//table[@id='rrReport']/thead/tr/th[2]/span/span)[2]", "Asset Name(s)");
 		Thread.sleep(4000);	
 		//mouseHoverByXpath("(//table[@id='rrReport']/thead/tr/th[2]/span/span)[2]");
 		Thread.sleep(4000);	
 		
 		// Click on Control Advisory column Header 
 		//*[@id="rrReport"]/thead/tr[1]/th[3]/span[1]/span
 		assertEquals("(//table[@id='rrReport']/thead/tr/th[3]/span/span)[2]", "Control Advisory");
 		Thread.sleep(4000);	
 		mouseHoverByXpath("(//table[@id='rrReport']/thead/tr/th[3]/span/span)[2]");
 		Thread.sleep(4000);	
 		
 		// Click on Control column Header
 		assertEquals("(//table[@id='rrReport']/thead/tr/th[7]/span/span)[2]", "Control");
 		Thread.sleep(4000);	
 		mouseHoverByXpath("(//table[@id='rrReport']/thead/tr/th[7]/span/span)[2]");		
 		Thread.sleep(4000);	
 		
 		assertEquals("(//table[@id='rrReport']/thead/tr/th[8]/span/span)[2]", "Control Tags");
 		Thread.sleep(4000);	
 		mouseHoverByXpath("(//table[@id='rrReport']/thead/tr/th[8]/span/span)[2]");		
 		Thread.sleep(4000);	
 		
		// Click on Multi-selector column Header 
 		
 		assertEquals("//*[@id='rrReport']/thead/tr[1]/th[9]/span[1]/span[1]", "Control Response (default in bold) ");
 		Thread.sleep(4000);	
 		mouseHoverByXpath("//*[@id='rrReport']/thead/tr[1]/th[9]/span[1]/span[1]");		
 		Thread.sleep(4000);	
 		
 		assertEquals("//table[@id='rrReport']/thead/tr/th[10]/span/span", "Clear");
 		Thread.sleep(4000);	
 		mouseHoverByXpath("//table[@id='rrReport']/thead/tr/th[10]/span/span");		
 		Thread.sleep(4000);	
 		
 		assertEquals("//table[@id='rrReport']/thead/tr/th[11]/span/span", "Notes");
 		Thread.sleep(4000);	
 		mouseHoverByXpath("//table[@id='rrReport']/thead/tr/th[11]/span/span");		
 		Thread.sleep(4000);	
 
		     
   }
   
   @Test(priority=374, enabled = true)
	  public void IRMA6096_QuickFilter_ControlsReview() throws InterruptedException {
		  
	   Thread.sleep(8000);	
	//Click on Response Filter drop-down
	     Thread.sleep(8000);
	     clickByXpath("//*[@id='controls-answered']");
	     Thread.sleep(3000);
	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[3]/a");
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
	    
	  }
   
   @Test(priority=375, enabled =true)
	  public void IRMA6060_QuickFilter_ControlReview() throws InterruptedException, IOException {
		 
		     Thread.sleep(8000);
		    Thread.sleep(8000);
		    
		    /* //Click on Quick Column Selector Filter drop-down
	   	     clickByXpath("//*[@id='cr-column-set']");
	   	     Thread.sleep(8000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");     
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		     */
			 
		  
		    //Click on Control Type Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='control-type']");
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
			
	     
		     //Click on Response Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='controls-answered']");
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[2]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);  
		    
	     	     
		     //Click on New Or Updated Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='view-filter']");
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[3]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		 
		     
		     //Click on New Or Updated Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='cr-advisory-filter']");
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[5]/div/ul/li[1]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		     
		     
		  // Click on column Header to sort for Ascending order
			clickByXpath("//th[2]/span/span");
				Reporter.log("Click on Media/label column Header to sort for Ascending order");
				//sortascen("//*[@id='rrReport']/tbody/tr[*]/td[1]"); //Get the Column count and values
		    	Thread.sleep(8000);	
				Thread.sleep(8000);	
				clickByXpath("//th[2]/span/span");
				Thread.sleep(8000);	
				Thread.sleep(8000);	
		
			 // Click on column Header to sort for Ascending order
			clickByXpath("//th[3]/span/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order");
    	Thread.sleep(8000);	
  
			
	 }
   
	  @Test(priority=376, enabled =true)
	  public void QuickFilter_ControlReview() throws InterruptedException, IOException {
		 
		     Thread.sleep(8000);
		    //Thread.sleep(3000);
		    
		    /* //Click on Quick Column Selector Filter drop-down
	   	     clickByXpath("//*[@id='cr-column-set']");
	   	     Thread.sleep(5000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");
	   	     Thread.sleep(8000);
		     Thread.sleep(8000);*/
		    
		     //Thread.sleep(8000);
		  
		    //Click on Control Type Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='control-type']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
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
	     	     
		     //Click on New Or Updated Filter drop-down
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='view-filter']");
		     Thread.sleep(5000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[3]/a");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		    
	 }
	  
	 
	     
	  @Test(priority=377, enabled = true)
	  public void IRMA6364_Filter_ControlsReview() throws InterruptedException {
		  
		  		Thread.sleep(4000);
		  		//Thread.sleep(3000);
		       
		  		// Click on Filter Button 
		  			assertTextXpath("//cw-filter/div/span/i");
		  			clickByXpath("//cw-filter/div/span/i");
		  			Reporter.log("Click on Filter Button | ");
		  		
		  		Thread.sleep(8000);
		  		Thread.sleep(4000);
		  		//Thread.sleep(3000);
	       
		  		//Click on Component Drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		
		  		//Click on Submit button in Filter Pop-up
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(3000);
		  		
		  		Thread.sleep(8000); 
		  		Thread.sleep(3000);   
		  		//Thread.sleep(3000);   
		       
		  		
	  }
	  
	  @Test(priority=378, enabled = true)
	  public void ClearFilter_ControlsReview() throws InterruptedException, IOException {
		  	
				 Thread.sleep(8000);
		       
		  		//Click on 'Clear Filter' Button 
		  		
		  			assertTextXpath("//i[2]");
		  			clickByXpath("//i[2]");
		  			Reporter.log("Click on 'Clear Filter' Button  | ");
		  		
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
	  }
	  
	  @Test(priority=379, enabled = true)
	  public void Export_ControlsReview() throws InterruptedException, IOException {
		  	
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
				 

	  }
	  
	  @Test (priority=380, enabled = true)
		public void Sorting_ControlsReview() throws IOException, InterruptedException {
			
			//Thread.sleep(8000);	
			Thread.sleep(8000);	
			Thread.sleep(3000);
						
			// Click on Media/label column Header to sort for Ascending order
			assertTextXpath("(//table[@id='rrReport']/thead/tr/th[2]/span/span)[2]");
			clickByXpath("(//table[@id='rrReport']/thead/tr/th[2]/span/span)[2]");
			Reporter.log("Click on Media/label column Header to sort for Ascending order");
			//sortascen("//*[@id='rrReport']/tbody/tr[*]/td[1]"); //Get the Column count and values
	    	Thread.sleep(8000);	
			Thread.sleep(8000);	
			Thread.sleep(8000);
			clickByXpath("(//table[@id='rrReport']/thead/tr/th[2]/span/span)[2]");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(8000);	
			Thread.sleep(8000);
			Thread.sleep(8000);				
			//sortdesc("//*[@id='rrReport']/tbody/tr[*]/td[1]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			
				
			
		}
	 
	  @Test(priority=381, enabled =false)
	  public void AllFields_ControlsGlobalMedia() throws InterruptedException, IOException {
     
		  Thread.sleep(3000);
		  Thread.sleep(3000);
             
		  //Click on Quick Column Selector Filter drop-down
		  assertTextXpath("//*[@id='cr-column-set']");
		  Thread.sleep(3000);
		  
		//Click on Control Type Filter drop-down
		  assertTextXpath("//*[@id='control-type']");
		 Thread.sleep(3000);
		 
		//Click on Response Filter drop-down
		 assertTextXpath("//*[@id='controls-answered']");
	     Thread.sleep(3000);
	     
	   //Click on New Or Updated Filter drop-down
	     assertTextXpath("//*[@id='view-filter']");
	     Thread.sleep(3000); 
	     
	    // Click on Filter Button 
	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]/i");
	   Thread.sleep(3000);
	   
	  	//Click on Export Button
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
	  Thread.sleep(3000);
	   
	   // Click on Columns Header 
	 // assertTextXpath("//*[@id='column_selector_button']");
	 Thread.sleep(3000);
 }
	  

	  @Test(priority=382, enabled =true)
	    public void Autoloading_ControlsGlobalMedia() throws InterruptedException, IOException { 

	 		Thread.sleep(3000);
	 		
		   
	 		
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
