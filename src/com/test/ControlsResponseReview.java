

package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ControlsResponseReview extends WrapperClass{

	public WebDriver driver;
	  String browser=null;

	  
	  @Test(priority=122, enabled =true)
	  public void NavigatePage_ControlsResponseReview() throws InterruptedException, IOException {
		
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   
		    //Click on Risk Response Module
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
	        Reporter.log("Click on Risk Response Module | ");
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Click on Controls Response Review Sub-module
	        assertTextLink("Controls Response Review");
	        clickBylinktext("Controls Response Review");
	        Reporter.log("Click on Controls Response Review Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
       }
	
	@Test(priority=123, enabled =true)
	  public void PageHearder_ControlsResponseReview() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Controls Response Review");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=124, enabled = true)
	   public void PanelBar_ControlsResponseReview() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Response Controls Response Review");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   // Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 2 of 2 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
	   }
	   
	 @Test(priority=125, enabled = true)
	 public void PageLevelHelp_RiskResponseList() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
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
		
	 @Test(priority=126, enabled = true)
	 public void RiskManagementMap_RiskResponseList() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("html/body/div[4]/div/div/div[3]/button");
		   Thread.sleep(3000);
	 }
	
	 
	
	 @Test(priority=127, enabled = true)
	   public void Functions_ControlsResponseReview() throws IOException, InterruptedException {
		   
			        
	        //Click on Include/Hide Accepted Filter drop-down
	   	     clickByXpath("//*[@id='crr-control-responses']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[2]/div/ul/li[3]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(5000);
	        
	        //Click on Minimize sidebar
	        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);        
	         
	     // Click on Effectiveness drop-down
	        assertTextXpath("//*[@id='container-body']/tr[1]/td[7]/cw-evaluation-choices/div/button");
	        clickByXpath("//*[@id='container-body']/tr[1]/td[7]/cw-evaluation-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(3000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("3: Effective");
	        clickBylinktext("3: Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//*[@id='container-body']/tr[1]/td[9]/cw-evaluation-choices/div/button");
	        clickByXpath("//*[@id='container-body']/tr[1]/td[9]/cw-evaluation-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("3: Feasible");
	        clickBylinktext("3: Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(3000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//*[@id='container-body']/tr[1]/td[11]/cw-evaluation-choices/div/button");
	        clickByXpath("//*[@id='container-body']/tr[1]/td[11]/cw-evaluation-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("2: Enhance");
	        clickBylinktext("2: Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(3000);   
	        
	        //Enter Cost Value
			assertTextXpath("//*[@id='container-body']/tr[1]/td[8]/div/input");
			sendvaluebyxpath("//*[@id='container-body']/tr[1]/td[8]/div/input", "150");
			Reporter.log("Enter Cost Value successfully | ");
			Thread.sleep(3000);
			
	        // Click on Global check-box
	        assertTextXpath("//*[@id='container-body']/tr[1]/td[10]/div/label");
	        clickByXpath("//*[@id='container-body']/tr[1]/td[10]/div/label");
	        Reporter.log("Click on Global check-box | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Click on proceed button to make global
	        assertTextXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed button | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
      
	 }

	   
	   @Test(priority=128, enabled = true)
		  public void Filter_ControlsResponseReview() throws InterruptedException {	  		
			  	 
		       	        
			  		// Click on Filter Button on Controls Response Review
			        assertTextXpath("//cw-filter/div/span/i");
			  		clickByXpath("//cw-filter/div/span/i");
			  		Reporter.log("Click on Filter Button on Controls Response Review page | ");
			  		Thread.sleep(3000);
			  		Thread.sleep(3000);
			        //Thread.sleep(3000);
		       
			  		//Click on Media Drop-down
			  		assertTextXpath("//div[3]/div/div/ul/li/input");
			  		clickByXpath("//div[3]/div/div/ul/li/input");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[3]/div/div/div/ul/li");
			  		clickByXpath("//div[3]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		//click on Media label drop-down
			  		assertTextXpath("//div[4]/div/div/ul/li/input");
			  		clickByXpath("//div[4]/div/div/ul/li/input");
			  		Reporter.log("Click on Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[4]/div/div/div/ul/li");
			  		clickByXpath("//div[4]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		 
			  		//click on Asset drop-down
			  		assertTextXpath("//div[5]/div/div/ul/li/input");
			  		clickByXpath("//div[5]/div/div/ul/li/input");
			  		Reporter.log("Click on Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[5]/div/div/div/ul/li");
			  		clickByXpath("//div[5]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		 
			  		//click on Control Tags drop-down
			  		assertTextXpath("//div[6]/div/div/ul/li/input");
			  		clickByXpath("//div[6]/div/div/ul/li/input");
			  		Reporter.log("Click on Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[6]/div/div/div/ul/li");
			  		clickByXpath("//div[6]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
	  						
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
			  	    Thread.sleep(3000);
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
			        Thread.sleep(3000);
			        
		  }
	   @Test(priority=129, enabled = true)
		  public void Export_ControlsResponseReview() throws InterruptedException {
			        	       
					  
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
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  
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
			  Thread.sleep(3000);
			  Thread.sleep(3000);
		     // Thread.sleep(3000);
		      
		  	  //Click on Minimize sidebar
		      clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
		      Thread.sleep(5000);
		      Thread.sleep(3000);
		      //Thread.sleep(3000);
	   
		      }
	   
	   @Test(priority=130, enabled =true)
		  public void QuickFilter_ControlsResponseReview() throws InterruptedException, IOException {
	 		 		 
		   //Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	 		//Click on Quick Column Selector Filter drop-down
	   	     clickByXpath("//*[@id='crr-column-set']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[1]/div/ul/li[3]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='crr-column-set']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[1]/div/ul/li[1]/a");
	   	     Thread.sleep(3000);
		     Thread.sleep(3000);
		      
	     	//Click on Include/Hide Accepted Filter drop-down
	   	     clickByXpath("//*[@id='crr-control-responses']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[2]/div/ul/li[3]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(3000);
	   	     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
	 	 }
	   
	   @Test(priority=131, enabled = true)
	   public void Sorting_ControlsResponseReview() throws IOException, InterruptedException {
		
			
		// Click on Control Response column Header to sort for Ascending order
		clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[4]/span[1]/span");
		Reporter.log("Click on Control Response  column Header to sort for Ascending order  | ");
		Thread.sleep(5000);
		/*sortdesc("//*[@id='container-body']/tr[*]/td[4]"); //Get the Column count and values
		Thread.sleep(5000);	
		Thread.sleep(5000);	*/
					
		// Click on Control Response column Header to sort for Ascending order
		clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[4]/span[1]/span");
		Reporter.log("Click on Control Response column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		/*sortascen("//*[@id='container-body']/tr[*]/td[4]"); //Get the Column count and values
		sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		Thread.sleep(5000);	
		Thread.sleep(5000);*/
			
	   }
	   
	   @Test(priority=132, enabled = true)
	   public void ControlTag_ControlsResponseReview() throws IOException, InterruptedException {
		   
		   
	   }
	   
	   @Test(priority=133, enabled = true)
	   public void NSIT_ControlsResponseReview() throws IOException, InterruptedException {
		   
	   }
		   
		   @Test(priority=134, enabled = true)
		   public void Notes_ControlsResponseReview() throws IOException, InterruptedException {
			   
			   
		  
	   }
		   
		   @Test(priority=135, enabled = true)
		   public void Documents_ControlsResponseReview() throws IOException, InterruptedException {
			   
		   }
	   
		   @Test(priority=136, enabled = true)
		   public void Mutiselector_ControlsResponseReview() throws IOException, InterruptedException {
			   
		   }
		   
	      @Test(priority=137, enabled =true)
		  public void NavigatePage_ResidualRatingReview() throws InterruptedException, IOException {
		        
		      //Click on Residual Rating Review Sub-module
		        assertTextLink("Residual Rating Review");
		        clickBylinktext("Residual Rating Review");
		        Reporter.log("Click on Residual Rating Review Sub-module | ");
		        Thread.sleep(5000);
		        Thread.sleep(5000);
		        Thread.sleep(5000);
		        //Thread.sleep(5000);
		        //Thread.sleep(5000);
		        
	       }
		
		@Test(priority=138, enabled =true)
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
		
		 @Test(priority=139, enabled = true)
		   public void PanelBar_ResidualRatingReview() throws IOException, InterruptedException {
				   
			   Thread.sleep(3000);
			   
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Risk Response Residual Rating Review");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
			   // Click on Page breadcrumb
			   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 3 of 3 entries");
			   Reporter.log("Showing 7 of 7 entries");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
		   }
		   
		 @Test(priority=140, enabled = true)
		 public void PageLevelHelp_ResidualRatingReview() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000);
			   
			   //Click on PageHelp button Icon
			    assertTextXpath("//cw-page-help/button");
		     clickByXpath("//cw-page-help/button");
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
			
		 @Test(priority=141, enabled = true)
		 public void RiskManagementMap_ResidualRatingReview() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000); 
			   //TestCase 34
			   // Click on Risk Management Map
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   Reporter.log("Click on Risk Management Map | ");
			   Thread.sleep(3000);
			   clickByXpath("html/body/div[4]/div/div/div[3]/button");
			   Thread.sleep(3000);
		 }
		
	   @Test(priority=142, enabled =true)
     public void Functions_ResidualRatingReview() throws InterruptedException, IOException {
	 		 		    	        
		    Thread.sleep(5000);
	              
	     // Click on Expand Button 
	        assertTextXpath("//*[@id='content']/tr[1]/td[1]/span");
	  		clickByXpath("//*[@id='content']/tr[1]/td[1]/span");
	  		Reporter.log("Click on Filter Button | ");
	  		Thread.sleep(5000);
	  		//Thread.sleep(3000);
	  		  
	  	// Click on Filter Button 
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
			
	  	// Click on Expand Button 
	        assertTextXpath("//*[@id='content']/tr[1]/td[1]/span");
	  		clickByXpath("//*[@id='content']/tr[1]/td[1]/span");
	  		Reporter.log("Click on Filter Button | ");
	  		Thread.sleep(5000);
	  		Thread.sleep(3000);
	  		
	   }
	   
	   @Test(priority=143, enabled =true)
	     public void QuickFilter_ResidualRatingReview() throws InterruptedException, IOException {
	  		
	 		//Click on Quick Column Selector Filter drop-down
	   	     clickByXpath("//*[@id='risk-treatment-option']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[1]/div/ul/li[4]/a");
	   	     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		      
	     	//Click on Include/Hide Accepted Filter drop-down
	   	     clickByXpath("//*[@id='approval-status']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[2]/div/ul/li[3]/a");
	   	     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
	 	 }
	   
	     
	   @Test(priority=144, enabled = true)
		  public void Filter_ResidualRatingReview() throws InterruptedException {
			  
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		
			  		 //Click on Minimize sidebar
				      clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
				      Thread.sleep(5000);
				      Thread.sleep(3000);
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
	   @Test(priority=145, enabled = true)
		  public void Export_ResidualRatingReview() throws InterruptedException {
			  	  
		   Thread.sleep(5000);
	  		//Thread.sleep(3000);
			  
		   //Click on Export Button
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			   Reporter.log("Click on Export Button | ");
			   Thread.sleep(5000);
			   Thread.sleep(3000);
			  
			  //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  //Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(3000);
			 Thread.sleep(5000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on CSV File | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  //Thread.sleep(5000);
		      Thread.sleep(5000);
	     }
	   
	   @Test(priority = 146, enabled = true)
	   public void Sorting_ResidualRatingReview() throws IOException, InterruptedException {
		
		
		// Click on Media/label column Header to sort for Ascending order
		clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[2]/span[1]/span");
		Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		Thread.sleep(5000);	
		/*Thread.sleep(5000);	  
		Thread.sleep(5000);	
		sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
    	Thread.sleep(5000);	
		Thread.sleep(5000);	
		Thread.sleep(5000);*/
					
		// Click on Media/label column Header to sort for Ascending order
		clickByXpath("//*[@id='residual_rating_review']/thead/tr[2]/th[2]/span[1]/span");
		Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		Thread.sleep(5000);	
		/*Thread.sleep(5000);	
		Thread.sleep(5000);				
		sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
		sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		Thread.sleep(5000);	
		Thread.sleep(5000);	*/
		
	   }
	   
	   
	   @Test(priority=147, enabled = true)
	   public void NavigationPage_RiskActionPlan() throws IOException, InterruptedException {
		   
		    //Thread.sleep(5000);
	        //Thread.sleep(3000);
		    Thread.sleep(2000);
	        //Thread.sleep(3000);
		    
		    //Click on Minimize sidebar
	        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        Thread.sleep(3000);
		   
		    //Click on Risk Action Plan Sub-module
	        assertTextLink("Risk Action Plan");
	        clickBylinktext("Risk Action Plan");
	        Reporter.log("Click on Risk Action Plan Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	   }
	   
	   @Test(priority=148, enabled =true)
		  public void PageHearder_RiskActionPlan() throws InterruptedException, IOException {
			
			 Thread.sleep(3000);
			   
			 // Click on Page header Icon
			 assertTextXpath("//h2/i");
			 Reporter.log("Click on Page header Icon | ");
			 Thread.sleep(1000);
			 mouseHoverByXpath("//h2/i");
			 Thread.sleep(1000);
			   
			 // Click on Page header Title
			 assertEquals("//h2", "Controls Response Review");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
			 mouseHoverByXpath("//h2");
			 Thread.sleep(1000);
		}
		
		 @Test(priority=149, enabled = true)
		   public void PanelBar_RiskActionPlan() throws IOException, InterruptedException {
				   
			   Thread.sleep(3000);
			   
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Risk Response Controls Response Review");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
			   // Click on Page breadcrumb
			   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 2 of 2 entries");
			   Reporter.log("Showing 7 of 7 entries");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
		   }
		 
	   @Test(priority=150, enabled = true)
		 public void PageLevelHelp_RiskActionPlan() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000);
			   
			   //Click on PageHelp button Icon
			    assertTextXpath("//cw-page-help/button");
		     clickByXpath("//cw-page-help/button");
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
			
		 @Test(priority=151, enabled = true)
		 public void RiskManagementMap_RiskActionPlan() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000); 
			   //TestCase 34
			   // Click on Risk Management Map
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   Reporter.log("Click on Risk Management Map | ");
			   Thread.sleep(3000);
			   clickByXpath("html/body/div[4]/div/div/div[3]/button");
			   Thread.sleep(3000);
		 }
		 
   
		 @Test(priority=152, enabled = true)
		 public void Functions_RiskActionPlan() throws IOException, InterruptedException {
		 
	           	               	        
	        // Expand the Control or Recommendation
	        assertTextXpath("//*[@id='content']/tr[1]/td[1]/span");
	        clickByXpath("//*[@id='content']/tr[1]/td[1]/span");
	        Reporter.log("Expand the Control or Recommendation | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Click on Full Screen Button 
	        assertTextXpath("//a[2]/i");
	        clickByXpath("//a[2]/i");
	        Reporter.log("Click on Full Screen Button  | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Click on Send Email Notification
	        assertTextXpath("//div[2]/div/span");
	        clickByXpath("//div[2]/div/span");
	        Reporter.log("Click on Send Email Notification | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Click on Close button in the Warning Popup
	        assertTextXpath("//div[5]/div/div/div[3]/button");
	        clickByXpath("//div[5]/div/div/div[3]/button");
	        Reporter.log("Click on Close button in the Warning Popup | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Close the Expanded Control or Recommendation
	        assertTextXpath("//*[@id='content']/tr[1]/td[1]/span");
	        clickByXpath("//*[@id='content']/tr[1]/td[1]/span");
	        Reporter.log("Close the Expanded Control or Recommendation | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	       //Click on Full Screen Button 
	        assertTextXpath("//a[2]/i");
	        clickByXpath("//a[2]/i");
	        Reporter.log("Click on Full Screen Button  | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
        
	   }    
	    
	     @Test(priority=153, enabled =true)
		  public void QuickFilter_RiskActionPlan() throws InterruptedException, IOException {
	 		 
	    	 Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);		
		          
	 		//Click on Edit Mode Filter drop-down
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/button");
	   	     Thread.sleep(3000);
	   	     //Thread.sleep(3000);
	   	     //clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/button");
	   	     //Thread.sleep(3000);
	   	     //Thread.sleep(3000);
		    
	 	 }
	     
	     @Test(priority=154, enabled = true)
		  public void Export_RiskActionPlan() throws InterruptedException {
			  
			    //Thread.sleep(5000);
		        Thread.sleep(5000);        
			  
			   //Click on Export Button
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			   Reporter.log("Click on Export Button | ");
			   Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on CSV File | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  			  		  
	     }
	     
	     @Test(priority=155, enabled = true)
		  public void Filter_RiskActionPlanFilter() throws InterruptedException {
			  
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			 		     		       
			  		// Click on Filter Button
			        assertTextXpath("//cw-filter/div/span[1]/i");
			  		clickByXpath("//cw-filter/div/span[1]/i");
			  		Reporter.log("Click on Filter Button page | ");
			  		Thread.sleep(5000);
			  		//Thread.sleep(3000);
			        //Thread.sleep(3000);
		       
			  		//Click on Media Drop-down
			  		assertTextXpath("//div[3]/div/div/ul/li/input");
			  		clickByXpath("//div[3]/div/div/ul/li/input");
			  		Reporter.log("Click on Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[3]/div/div/div/ul/li");
			  		clickByXpath("//div[3]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		//click on Media label drop-down
			  		assertTextXpath("//div[4]/div/div/ul/li/input");
			  		clickByXpath("//div[4]/div/div/ul/li/input");
			  		Reporter.log("Click on Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[4]/div/div/div/ul/li");
			  		clickByXpath("//div[4]/div/div/div/ul/li");
			  		Reporter.log("Select value from Media label Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		//Click on Assets drop-down
			  		assertTextXpath("//div[5]/div/div/ul/li/input");
			  		clickByXpath("//div[5]/div/div/ul/li/input");
			  		Reporter.log("Click on Asset Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[5]/div/div/div/ul/li");
			  		clickByXpath("//div[5]/div/div/div/ul/li");
			  		Reporter.log("Select value from Asset Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  		//Click on Priority drop-down
			  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
			  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
			  		Reporter.log("Click on Risk Treatment Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[2]/div/div/div/ul/li[2]");
			  		clickByXpath("//div[2]/div/div/div/ul/li[2]");
			  		Reporter.log("Select value from Risk Treatment Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		
			  	    // Click on Implementation Status
			  		assertTextXpath("//div[6]/div/div/ul/li/input");
			  		clickByXpath("//div[6]/div/div/ul/li/input");
			  		Reporter.log("Click on Evaluated check-box | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[6]/div/div/div/ul/li");
			  		clickByXpath("//div[6]/div/div/div/ul/li");
			  		Reporter.log("Click on Approved check-box | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		
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
			  		Thread.sleep(3000);
		  }
	     
	     @Test(priority =156, enabled = true)
		   public void Sorting_RiskActionPlan() throws IOException, InterruptedException {
			   
							
		   // Click on Implementation Manager column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Implementation Manager column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*sortascen("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
						
			// Click on Implementation Manager column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Implementation Manager column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*sortdesc("//*[@id='content']/tr[*]/td[5]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);*/
			
			// Click on Priority column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Priority column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*sortascen("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
			
			// Click on Priority column Header to sort for Ascending order
			clickByXpath("//*[@id='action-plans-table']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Priority  column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*sortdesc("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);*/
					
		     }
	     
	     @Test(priority=157, enabled =true)
		  public void NavigatePage_RiskReconciliationList() throws InterruptedException, IOException {
			
			   Thread.sleep(5000);  		
		  	            
		  	    //Select Risk Reconciliation List
		        clickBylinktext("Risk Reconciliation");
		        Reporter.log("Select Risk Reconciliation sub-Module | ");		        
		        Thread.sleep(3000);
		        Thread.sleep(5000);
		        Thread.sleep(5000);	       
	       }
		
		@Test(priority=158, enabled =true)
		  public void PageHearder_RiskReconciliationList() throws InterruptedException, IOException {
			
			 Thread.sleep(3000);
			   
			 // Click on Page header Icon
			 assertTextXpath("//h2/i");
			 Reporter.log("Click on Page header Icon | ");
			 Thread.sleep(1000);
			 mouseHoverByXpath("//h2/i");
			 Thread.sleep(1000);
			   
			 // Click on Page header Title
			 assertEquals("//h2", "Controls Response Review");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
			 mouseHoverByXpath("//h2");
			 Thread.sleep(1000);
		}
		
		 @Test(priority=159, enabled = true)
		   public void PanelBar_RiskReconciliationList() throws IOException, InterruptedException {
				   
			   Thread.sleep(3000);
			   
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Risk Response Controls Response Review");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
			   // Click on Page breadcrumb
			   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 2 of 2 entries");
			   Reporter.log("Showing 7 of 7 entries");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
		   }
		   
		 @Test(priority=160, enabled = true)
		 public void PageLevelHelp_RiskReconciliationList() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000);
			   
			   //Click on PageHelp button Icon
			    assertTextXpath("//cw-page-help/button");
		     clickByXpath("//cw-page-help/button");
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
			
		 @Test(priority=161, enabled = true)
		 public void RiskManagementMap_RiskReconciliationList() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000); 
			   //TestCase 34
			   // Click on Risk Management Map
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   Reporter.log("Click on Risk Management Map | ");
			   Thread.sleep(3000);
			   clickByXpath("html/body/div[4]/div/div/div[3]/button");
			   Thread.sleep(3000);
		 }
		
		  
	     @Test(priority=162, enabled =true)
		  public void QuickFilter_RiskReconciliationList() throws InterruptedException, IOException {
	 		
	        
	 		//Click on Filter My risk drop-down
	   	     clickByXpath("//*[@id='show-my-risks']");
	   	     Thread.sleep(3000);
	   	     //clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
	   	     //Thread.sleep(5000);
	   	     //Thread.sleep(3000);
	   	     //clickByXpath("//*[@id='show-my-risks']");
	   	     //Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/div/ul/li[2]/a");
	   	     Thread.sleep(5000);
		     Thread.sleep(3000);
		    
	 	 }
	     
		  @Test(priority=163, enabled = true)
		  public void Filter_RiskReconciliationList() throws InterruptedException, IOException {
			  
			  		
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
			  		

			  		//click on Risk Rating drop-down
			  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
			  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
			  		Thread.sleep(1000);
			  		sendvaluebyxpath("//div[2]/div[2]/div/div/ul/li/input", "12");
			  		Thread.sleep(1000);
			  		clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
			  		Reporter.log("Click on Risk Rating Drop-down | ");
			  		Thread.sleep(3000);
			  		Reporter.log("Select value from Risk Rating Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);

			  	     /*//click on Residual Risk Rating drop-down
			  		assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
			  		clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
			  		Thread.sleep(1000);
			  		sendvaluebyxpath("//div[3]/div[2]/div/div/ul/li/input", "12");
			  		Thread.sleep(1000);
			  		clickByXpath("//div[3]/div[2]/div/div/div/ul/li/em");
			  		Reporter.log("Click on Residual Risk Rating Drop-down | ");
			  		Thread.sleep(3000);
			  		Reporter.log("Select value from Residual Risk Rating Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
*/
			  		// Click on Reconciliation Status drop-down
			  		assertTextXpath("//div[5]/div[2]/div/div/ul/li/input");
			  		clickByXpath("//div[5]/div[2]/div/div/ul/li/input");
			  		Reporter.log("Click on Reconciliation Status Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		assertTextXpath("//div[5]/div[2]/div/div/div/ul/li[2]");
			  		clickByXpath("//div[5]/div[2]/div/div/div/ul/li[2]");
			  		Reporter.log("Select value from Reconciliation Status Drop-down | ");
			  		Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		
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
			        //Thread.sleep(3000);
		  }
	     
	     @Test(priority=164, enabled = true)
		  public void Export_RiskReconciliationList() throws InterruptedException {  
			    
	  	        
	    	    Thread.sleep(3000);
		        //Thread.sleep(3000);
		        
		        //Click on Export Button
				   assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
				   clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
				   Reporter.log("Click on Export Button | ");
				   Thread.sleep(5000);
				  Thread.sleep(3000);
				  
				  //Click on Pdf 
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
				  Reporter.log("Click on Pdf | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  //Thread.sleep(5000);
				  
				  //Click on Export Button
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
				  Reporter.log("Click on Export Button | ");
				  Thread.sleep(3000);
				  Thread.sleep(3000);
				  
				  //Click on CSV File
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				 Thread.sleep(5000);
			      //Thread.sleep(5000);
		  
		  }
	     
	     @Test(priority = 165, enabled = true)
		   public void Sorting_RiskReconciliationList() throws IOException, InterruptedException {
			

			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[2]/th[2]/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);*/
			
			// Click on Media Label column Header to sort for Ascending order
			clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[2]/th[2]/span[1]/span");
			Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/

			// Click on Asset Names column Header to sort for Ascending order
			clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[2]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Names column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/

			// Click on Asset Names column Header to sort for Ascending order
			clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[2]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Names column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);
*/

			
	}	
		   
}
