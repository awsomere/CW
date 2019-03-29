package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ControlsResponseReviewTestcases extends WrapperClass{

	public WebDriver driver;
	  String browser=null;

	  
	  @Test(priority=190, enabled =true)
	  public void NavigatePage_ControlsResponseReview() throws InterruptedException, IOException {
		
		   Thread.sleep(5000);
		   Thread.sleep(8000);
		          
	        //Click on Controls Response Review Sub-module
	        assertTextLink("Controls Response Review");
	        clickBylinktext("Controls Response Review");
	        Reporter.log("Click on Controls Response Review Sub-module | ");
	        Thread.sleep(8000);
	        Thread.sleep(8000);
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	        //Click on Include/Hide Accepted Filter drop-down
	   	     clickByXpath("//*[@id='crr-control-responses']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[3]/a");
	   	     Thread.sleep(8000);
	   	     Thread.sleep(8000);
       }
	
	@Test(priority=191, enabled =true)
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
	
	 @Test(priority=192, enabled = true)
	   public void PanelBar_ControlsResponseReview() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Response Controls Response Review");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   // Click on Page breadcrumb
		   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 2 of 2 entries");
		   //Reporter.log("Showing 7 of 7 entries");
		   //Thread.sleep(2000);
		   //mouseHoverByXpath("//ol");
		   //Thread.sleep(1000); 
		   
	   }
	   
	 @Test(priority=193, enabled = true)
	 public void PageLevelHelp_ControlsResponseReview() throws IOException, InterruptedException {
		   
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
		
	 @Test(priority=194, enabled = true)
	 public void RiskManagementMap_ControlsResponseReview() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("//div[5]/div/div/div[2]/button");
		   Thread.sleep(3000);
		   Thread.sleep(5000);
	 }
	
	 
	
	 @Test(priority=195, enabled = true)
	   public void Functions_ControlsResponseReview() throws IOException, InterruptedException {
		  
	        
	        //Click on Minimize sidebar
	        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
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
	        
	      //Click on proceed button to make global
	        assertTextXpath("/html/body/div[5]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed button | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
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
	        
	      //Click on proceed button to make global
	        assertTextXpath("/html/body/div[5]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed button | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
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
	        
	      //Click on proceed button to make global
	        assertTextXpath("/html/body/div[5]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed button | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	       /* //Enter Cost Value
			assertTextXpath("//*[@id='container-body']/tr[1]/td[8]/div/input");
			sendvaluebyxpath("//*[@id='container-body']/tr[1]/td[8]/div/input", "150");
			Reporter.log("Enter Cost Value successfully | ");
			Thread.sleep(5000);
			
			//Click on proceed button to make global
	        assertTextXpath("/html/body/div[5]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed button | ");
	        Thread.sleep(5000);*/
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
			
	       /* // Click on Global check-box
	        assertTextXpath("//*[@id='container-body']/tr[1]/td[10]/div");
	        clickByXpath("//*[@id='container-body']/tr[1]/td[10]/div");
	        Reporter.log("Click on Global check-box | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
*/	        
	        /*//Click on proceed button to make global
	        assertTextXpath("/html/body/div[5]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed button | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
*/      
	 }

	   
	   @Test(priority=196, enabled = false)
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

			  		/*//click on Media label drop-down
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
	   @Test(priority=197, enabled = true)
		  public void Export_ControlsResponseReview() throws InterruptedException {
			        	       
					  
			   //Click on Export Button
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			   Reporter.log("Click on Export Button | ");
			   Thread.sleep(5000);
			  // Thread.sleep(3000);
			  
			  //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
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
	   
	   @Test(priority=198, enabled =true)
		  public void QuickFilter_ControlsResponseReview() throws InterruptedException, IOException {
	 		 		 
		   //Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	 		//Click on Quick Column Selector Filter drop-down
	   	     clickByXpath("//*[@id='crr-column-set']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[3]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(8000);
	   	     clickByXpath("//*[@id='crr-column-set']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");
	   	     Thread.sleep(3000);
		     Thread.sleep(8000);
		      
	     	//Click on Include/Hide Accepted Filter drop-down
	   	     clickByXpath("//*[@id='crr-control-responses']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[3]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(3000);
	   	     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
	 	 }
	   
	   @Test(priority=199, enabled = true)
	   public void Sorting_ControlsResponseReview() throws IOException, InterruptedException {
		
			
		// Click on Control Response column Header to sort for Ascending order
		clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[5]/span[1]/span[1]");
		Reporter.log("Click on Control Response  column Header to sort for Ascending order  | ");
		Thread.sleep(5000);
		sortdesc("//*[@id='container-body']/tr[*]/td[5]"); //Get the Column count and values
		Thread.sleep(5000);	
		Thread.sleep(5000);	
					
		// Click on Control Response column Header to sort for Ascending order
		clickByXpath("//*[@id='controls_response_review']/thead/tr[1]/th[5]/span[1]/span[1]");
		Reporter.log("Click on Control Response column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		sortascen("//*[@id='container-body']/tr[*]/td[5]"); //Get the Column count and values
		//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
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
