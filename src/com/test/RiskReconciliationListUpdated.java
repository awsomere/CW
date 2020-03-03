package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RiskReconciliationListUpdated extends WrapperClass{

	public WebDriver driver;
	  String browser=null;	
	
	@Test(priority=407, enabled =true)
	  public void NavigatePage_RiskReconciliationList() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		 
		 //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");		        
	        Thread.sleep(4000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);	       
     }
	
	@Test(priority=408, enabled =true)
	  public void PageHearder_RiskReconciliationList() throws InterruptedException, IOException {
		
		 Thread.sleep(4000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		// assertEquals("//h2", "Risk Reconciliation List Residual Versus Reconciled");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=409, enabled = true)
	   public void PanelBar_RiskReconciliationList() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Risk Response List Risk Reconciliation List");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		   /*// Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 2 of 2 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); */
		   
	   }
	   
	 @Test(priority=410, enabled = true)
	 public void PageLevelHelp_RiskReconciliationList() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
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
		
	 @Test(priority=411, enabled = true)
	 public void RiskManagementMap_RiskReconciliationList() throws IOException, InterruptedException {
		   
		   Thread.sleep(3000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(3000);
		   clickByXpath("//div[3]/div/div/div[2]/button");
		   Thread.sleep(3000);
	 }
	 
	 @Test(priority=412, enabled =true)
	  public void Expand_RiskReconciliationList() throws InterruptedException, IOException {
		
     
		//Click on Expand Button
		 clickByXpath("//tbody/tr/td/span");
	     Thread.sleep(5000);
	     
	     ArrowLeft();
	     ArrowLeft();
	     ArrowLeft();
	     ArrowLeft();
	     ArrowLeft();
	     ArrowLeft();
	     ArrowLeft();
	     ArrowLeft();
	     Thread.sleep(6000);
	     
	   //Click on notes Button
		 clickByXpath("//*[@id='content']/tr[2]/td/div/table/tbody/tr/td[8]/span/a/strong");
	     Thread.sleep(8000);
	     
	     //Click on close Button
		 clickByXpath("html/body/div[3]/div/div/div[3]/button");
	     Thread.sleep(8000);
	     
	    
	     
	 }
	 
	 @Test(priority=413, enabled = true)
	   public void ClearIcon_RiskReconciliationList() throws IOException, InterruptedException {
		  
		 Thread.sleep(8000);
		//Click on Clear Button
		 clickByXpath("//*[@id='content']/tr[1]/td[22]/cw-reconciliation-record-clear/div/span/i");
	     Thread.sleep(8000);
	     
	   //Click on Clear Button
		 clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
	     Thread.sleep(5000);
	      
	 }
	 
	 @Test(priority=414, enabled = true)
	   public void Functions_RiskReconciliationList() throws IOException, InterruptedException {
		  
		 Thread.sleep(8000);
		 
		//Click on Feasibility drop-down
	     assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	     clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	     Reporter.log("Click on Feasibility drop-down | ");
	     Thread.sleep(3000);
	     
	     //Select Feasible option from Feasibility drop-down
	     assertTextLink("4: Likely");
	     clickBylinktext("4: Likely");
	     Reporter.log("Select Feasible option from Feasibility drop-down | ");
	     Thread.sleep(8000);
	 
	//Click on Feasibility drop-down
     assertTextXpath("//td[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
     clickByXpath("//td[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
     Reporter.log("Click on Feasibility drop-down | ");
     Thread.sleep(3000);
     
     //Select Feasible option from Feasibility drop-down
     assertTextLink("5: Severe");
     clickBylinktext("5: Severe");
     Reporter.log("Select Feasible option from Feasibility drop-down | ");
     Thread.sleep(8000);
     
     //Click on Proceed 
     clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
     Reporter.log("Click on Feasibility drop-down | ");
     Thread.sleep(8000);
	
	 }
	 
   @Test(priority=415, enabled =true)
	  public void QuickFilter_RiskReconciliationList() throws InterruptedException, IOException {
		
	   Thread.sleep(3000);
      
		//Click on Filter My risk drop-down
 	     clickByXpath("//*[@id='show-my-risks']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
 	     Thread.sleep(5000);
 	     Thread.sleep(8000);
 	     clickByXpath("//*[@id='show-my-risks']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
 	     Thread.sleep(5000);
	     Thread.sleep(8000);
	    
	 }
   
	    
   @Test(priority=416, enabled = true)
	  public void Export_RiskReconciliationList() throws InterruptedException {  
		    
	        
  	    Thread.sleep(3000);
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
			  Thread.sleep(5000);
			  //Thread.sleep(5000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on CSV File | ");
			  Thread.sleep(5000);
			  Thread.sleep(5000);
			 Thread.sleep(5000);
		      //Thread.sleep(5000);
	  
	  }
   
   @Test(priority=417, enabled = true)
	  public void Filter_RiskReconciliationList() throws InterruptedException, IOException {
		  
		  		
		  		// Click on Filter Button 
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(3000);
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
		  		

		  		//click on Risk Rating drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Thread.sleep(1000);
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Click on Risk Rating Drop-down | ");
		  		Thread.sleep(3000);
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
		  		/*// Click on Reconciliation Status drop-down
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
*/		  		
		     	//Click on Submit button in Filter Pop-up
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(3000);
		  		
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
   
   @Test(priority=418, enabled =false)
	  public void HelpIcon_RiskReconciliationList() throws InterruptedException, IOException {
		
	   Thread.sleep(5000);
	   
	      //Click on Help Icon
	      clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[1]/th[6]/span/span/i");
		  Thread.sleep(5000);
		  
           //Click on Close button
		    clickByXpath("body > div.bootbox.modal.fade.info-view-modal.modal-primary.in.ui-draggable > div > div > div.modal-footer > button");
		   Thread.sleep(5000);
		  
		     //Click on Help Icon
		     clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[1]/th[7]/span/span/i");
			  Thread.sleep(5000);
			  
			//Click on Close button
			    clickByXpath("body > div.bootbox.modal.fade.info-view-modal.modal-primary.in.ui-draggable > div > div > div.modal-footer > button");
			   Thread.sleep(5000);
			  
			  
			  //Click on Help Icon
			 clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[1]/th[8]/span/span/i");
	    	  Thread.sleep(5000);
				  
	    	//Click on Close button
			    clickByXpath("body > div.bootbox.modal.fade.info-view-modal.modal-primary.in.ui-draggable > div > div > div.modal-footer > button");
			   Thread.sleep(5000);
			  
			  ArrowLeft();
			  ArrowLeft();
			  ArrowLeft();
			  ArrowLeft();
			  Thread.sleep(8000);
				  
		  //Click on Help Ico
			clickByXpath("//*[@id='table-risk-reconciliation']/thead/tr[1]/th[9]/span/span/i");
			 Thread.sleep(8000);
			 
			//Click on Close button
			    clickByXpath("body > div.bootbox.modal.fade.info-view-modal.modal-primary.in.ui-draggable > div > div > div.modal-footer > button");
			   Thread.sleep(5000);
   }
   
   @Test(priority=419, enabled =true)
	  public void ColumnHeaders_RiskReconciliationList() throws InterruptedException, IOException {
		
	   Thread.sleep(5000);
	   
		//TestCases RRL - 2
		// Click on Progress bar column Header 
		assertEquals("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[2]", "Component / Group Name");
		Thread.sleep(2000);
					
		// Click on Media/label column Header 
		assertEquals("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[3]/span/span", "Asset Name(s)");
		Thread.sleep(2000);
		
		// Click on Asset Name column Header 
		assertEquals("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[4]/span/span", "Threat Source/Threat Event");
		Thread.sleep(2000);
		
		// Click on Threat Source/Event column Header 
		assertEquals("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[5]/span/span", "Vulnerability");
		Thread.sleep(2000);
		
		// Click on Threat Source/Event column Header 
	     assertEquals("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[8]/span/span", "Rating");
		Thread.sleep(2000);
	
	}
   
   @Test(priority = 420, enabled = true)
	   public void Sorting_RiskReconciliationList() throws IOException, InterruptedException {
		

		// Click on Media Label column Header to sort for Ascending order
		clickByXpath("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[3]/span/span");
		Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		/*Thread.sleep(5000);	  
		Thread.sleep(5000);	
		sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
		Thread.sleep(5000);	
		Thread.sleep(5000);	
		Thread.sleep(5000);*/
		
		// Click on Media Label column Header to sort for Ascending order
		clickByXpath("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[3]/span/span");
		Reporter.log("Click on Media Label column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		/*Thread.sleep(5000);	
		Thread.sleep(5000);				
		sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
		sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
		Thread.sleep(5000);	
		Thread.sleep(5000);	*/

		// Click on Asset Names column Header to sort for Ascending order
		clickByXpath("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[4]/span/span");
		Reporter.log("Click on Asset Names column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		/*Thread.sleep(5000);	  
		sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
		Thread.sleep(5000);	
		Thread.sleep(5000);	*/

		// Click on Asset Names column Header to sort for Ascending order
		clickByXpath("//table[@id='table-risk-reconciliation']/thead/tr[2]/th[4]/span/span");
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
