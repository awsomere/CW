package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RiskActionPlanTestcases extends WrapperClass{

	public WebDriver driver;
	  String browser=null;
	
	  @Test(priority=147, enabled = true)
	   public void NavigatePage_RiskActionPlan() throws IOException, InterruptedException {
		   
		 
		   Thread.sleep(5000);
		 
		   
		    //Click on Risk Action Plan Sub-module
	        assertTextLink("Risk Action Plan");
	        clickBylinktext("Risk Action Plan");
	        Reporter.log("Click on Risk Action Plan Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        
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
			 assertEquals("//h2", "Risk Action Plan");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
			 mouseHoverByXpath("//h2");
			 Thread.sleep(1000);
		}
		
		 @Test(priority=149, enabled = true)
		   public void PanelBar_RiskActionPlan() throws IOException, InterruptedException {
				   
			   Thread.sleep(3000);
			   
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Risk Response List Risk Action Plan");
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
		 
	   @Test(priority=150, enabled = false)
		 public void PageLevelHelp_RiskActionPlan() throws IOException, InterruptedException {
			   
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
			
		 @Test(priority=151, enabled = false)
		 public void RiskManagementMap_RiskActionPlan() throws IOException, InterruptedException {
			   
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
	        assertTextXpath("//*[@id='rtInfo']/div[3]/div[1]/div/div[2]/div/span");
	        clickByXpath("//*[@id='rtInfo']/div[3]/div[1]/div/div[2]/div/span");
	        Reporter.log("Click on Send Email Notification | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Click on Close button in the Warning Popup
	        assertTextXpath("html/body/div[5]/div/div/div[3]/button");
	        clickByXpath("html/body/div[5]/div/div/div[3]/button");
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
		          
	 		//Click on All Controls Quick Filter
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/button");
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
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			   Reporter.log("Click on Export Button | ");
			   Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on CSV File | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			  			  		  
	     }
	     
	     @Test(priority=155, enabled = false)
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
	     
	     @Test(priority =156, enabled = false)
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

}
