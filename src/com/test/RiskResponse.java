package com.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RiskResponse extends WrapperClass{

	public WebDriver driver;
	  String browser=null;
	 
	   @Test(priority=29, enabled = true)
	   public void BackupListmedia() throws IOException, InterruptedException {
		    
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
	        
	        //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        
	        //Click on TBD Button 
	        assertTextXpath("//*[@id='container_']/span");
	        clickByXpath("//*[@id='container_']/span");
	        Reporter.log("Click on TBD Button | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        // Click on Risk Treatment Type drop-down
	        assertTextXpath("//cw-risk-treatment-treatment-choices/div/button");
	        clickByXpath("//cw-risk-treatment-treatment-choices/div/button");
	        Reporter.log("Click on Risk Treatment Type drop-down | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Select Transfer option from Risk Treatment Type
	        assertTextLink("Transfer");
	        clickBylinktext("Transfer");
	        Reporter.log("Select Transfer option from Risk Treatment Type | ");
	        Thread.sleep(3000);
	       
	        // Click on Effectiveness drop-down
	        assertTextXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Effectiveness drop-down | ");
	        Thread.sleep(3000);
	        
	        // Select Effective option from Effectiveness drop-down
	        assertTextLink("Effective");
	        clickBylinktext("Effective");
	        Reporter.log("Select Effective option from Effectiveness drop-down | ");
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        
	        //Click on Feasibility drop-down
	        assertTextXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[8]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Feasibility drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Feasible option from Feasibility drop-down
	        assertTextLink("Feasible");
	        clickBylinktext("Feasible");
	        Reporter.log("Select Feasible option from Feasibility drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Action Drop-down
	        assertTextXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        clickByXpath("//td[10]/span/cw-rt-evaluation-alternative-choices/div/button");
	        Reporter.log("Click on Action Drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Enhance option from Action drop-down
	        assertTextLink("Enhance");
	        clickBylinktext("Enhance");
	        Reporter.log("Select Enhance option from Action drop-down | ");
	        Thread.sleep(5000);
	        
	       // Enter Cost value
		    assertTextXpath("//td[7]/div/input");
		    sendvaluebyxpath("//td[7]/div/input", "100");
		    Reporter.log("Enter Cost value | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);	        
		 
		    //Click on Document to upload
		    assertTextXpath("//a[2]/a/i");
		    clickByXpath("//a[2]/a/i");
		    Reporter.log("Click on Document to upload | ");
		    Thread.sleep(1000);
		    clickByXpath("//a[2]/a/i");
		    Thread.sleep(5000);
		    Thread.sleep(3000);	  
		    
		    //Click on New button from document pop-up
		    assertTextXpath("//div/a/span");
		    clickByXpath("//div/a/span");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(5000);
		    Thread.sleep(3000);	  
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    Reporter.log("Click on Choose File from document pop-up | ");
		    Thread.sleep(5000);
		    Thread.sleep(3000);	  
		    
		    // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of pdf file | ");
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        Thread.sleep(5000);
	        
	        //Click on Upload button from document pop-up
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Upload button from document pop-up | ");
		    Thread.sleep(5000);
	      
		    //Select any one of the listed item
		    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the listed item | ");
		    Thread.sleep(5000);
		    
		    //Select Delete button in Uploaded Document
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Select Delete button in Uploaded Document | ");
		    Thread.sleep(5000);
		    
		    // Click on Cancel button in Deleted Pop-up
		    assertTextXpath("//div[6]/div/div/div[3]/button");
		    clickByXpath("//div[6]/div/div/div[3]/button");
		    Reporter.log("Click on Cancel button in Deleted Pop-up | ");
		    Thread.sleep(5000);
		    
		    // Click on Close button		  
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on CLose Button | ");
		    Thread.sleep(5000); 
		    Thread.sleep(3000); 
		    
		  //Click on Notes button to add text
		    assertTextXpath("//div[2]/a/strong");
		    clickByXpath("//div[2]/a/strong");
		    Thread.sleep(1000);
		    //clickByXpath("//div[2]/a/strong");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    //Thread.sleep(3000);
		    		    		    
		    // Enter Text for Note textarea
		    assertTextXpath("//*[@id='DTE_Field_text']");
		    sendvaluebyxpath("//*[@id='DTE_Field_text']", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(3000);
		    
		    //Click on Close button in popup
		    assertTextXpath("html/body/div[4]/div/div/div[1]/button");
		    clickByXpath("html/body/div[4]/div/div/div[1]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    /*//Click on Global Check-box
	        assertTextXpath("//td[9]/div/label");
	        clickByXpath("//td[9]/div/label");
	        Reporter.log("Click on Global Check-box | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);  
*/	       
	        // Enter Note in Risk textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "Risk notes");
		    Reporter.log("Enter Note in Risk textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on Save button
	        assertTextXpath("//div[2]/div/div/button");
	        clickByXpath("//div[2]/div/div/button");
	        Reporter.log("Click on save button | ");
	        Thread.sleep(5000);
		    	               
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/button");
	        clickByXpath("//cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        clickByXpath("//cw-risk-choices-select/div/ul/li[4]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        clickByXpath("//div[3]/div/cw-risk-choices-select/div/ul/li[5]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	        //Click on Keep Rating from Pop-up window
	        assertTextXpath("//div[3]/button[2]");
	        clickByXpath("//div[3]/button[2]");
	        Reporter.log("Click on Keep Rating from Pop-up window | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        // Click on Evaluated check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[1]/div[2]/div[1]/div[2]/div");
	        Reporter.log("Click on Evaluated check-box | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	        //Click on Approve Check-box
	        assertTextXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        clickByXpath("//*[@id='rtData']/div[4]/div/div[2]/div[2]/div/div[2]/div");
	        Reporter.log("Click on Approve Check-box | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	        //Click on 'Goto Implementation Planning' button 
	        clickByXpath("//*[@id='rtIp']");
	        Reporter.log("Click on 'Goto Implementation Planning' button | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Enter some text in Description textarea
	        sendvaluebyxpath("//textarea", "desc");
	        Reporter.log("Enter some text in Description textarea | ");
	        Thread.sleep(3000);
	        
	        //Enter some text in Plans for Monitoring Effectiveness textarea
   	        sendvaluebyxpath("//td[5]/cw-rr-text-area/div/textarea", "plans");
   	        Reporter.log("Enter some text in Plans for Monitoring Effectiveness textarea | ");
	        Thread.sleep(3000);
	        
	        //Click on Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/button");
	        Reporter.log("Click on Implementation Manager drop-down | ");
	        Thread.sleep(3000);
	        
	        // Select any option from Implementation Manager drop-down
	        clickByXpath("//cw-rr-planning-choices/div/ul/li[2]/a");
	        Reporter.log("Select any option from Implementation Manager drop-down| ");
	        Thread.sleep(3000);
	        
	        //Select Date from Implementation Due Date 
	        sendvaluebyxpath("//td[7]/div/input", "01/02/2018");
	        Reporter.log("Select Date from Implementation Due Date  | ");
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        
	        //Click on Planned Check-box
	        clickByXpath("//*[@id='chkPlanned']");
	        Reporter.log("Click on Planned Check-box | ");
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        // Click on Go To Risk Action Plan button
	        clickBylinktext("Go To Risk Action Plan");
	        Reporter.log("Click on Go To Risk Action Plan button | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        // Select Priority from drop-down
	        selectByXpath_Visibletext("//td[6]/div/select","High");
	        Reporter.log("Select Priority from drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Completed Date
	        sendvaluebyxpath("//td[8]/div/input", "01/02/2018");
	        Reporter.log("Select Completed Date | ");
	        Thread.sleep(3000);
	        
	        //Click on Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select");
	        Reporter.log("Click on Plan Status drop-down | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Select Implemented option from Plan Status drop-down
	        clickByXpath("//*[@id='content']/tr[1]/td[9]/div/select/option[2]");
	        Reporter.log("Select Implemented option from Plan Status drop-down | ");
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        	        
	        // Click on Proceed Button
	        clickByXpath("html/body/div[5]/div/div/div[3]/button[2]");
	        Reporter.log("Click on Proceed Button | ");	        
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Select Risk Reconciliation List
	        clickBylinktext("Risk Reconciliation");
	        Reporter.log("Select Risk Reconciliation sub-Module | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        //Click on Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Likelihood drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Moderate Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-simple-risk-choices/div/ul/li[5]/a");
	        Reporter.log("Select Moderate Option from Risk Likelihood drop-down | ");
	        Thread.sleep(3000);
	        
	        /*//Click on proceed button from Warning Pop-up window
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on proceed button from Warning Pop-up window | ");
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
*/	        
	        //Click on Risk Impact drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/button");
	        Reporter.log("Click on Risk Impact drop-down | ");
	        Thread.sleep(3000);
	        
	        //Select Major Option from Risk Likelihood drop-down
	        assertTextXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        clickByXpath("//*[@id='riskImpactSelect']/cw-simple-risk-choices/div/ul/li[6]/a");
	        Reporter.log("Select Major Option from Risk Likelihood drop-down | ");
	        Thread.sleep(5000);
	        
	       //Click on proceed button from Warning Pop-up window
	        assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	        Reporter.log("Click on proceed button from Warning Pop-up window | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
}    
	   
	   @Test(priority=30, enabled =true)
		  public void RiskResponseListQuickFilter() throws InterruptedException, IOException {
	 		 
		   //Thread.sleep(5000);
	        //Thread.sleep(3000);
	     
		   //Click on Risk Response List Sub-module
	        assertTextLink("Risk Response List");
	        clickBylinktext("Risk Response List");
	        Reporter.log("Click on Risk Response List Sub-module | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        
	 		//Click on Edit Mode Filter drop-down
	   	     clickByXpath("//*[@id='edit']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/div/ul/li[2]");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='edit']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/div/ul/li[1]");
	   	     Thread.sleep(3000);
		     Thread.sleep(3000);
		     
	     	//Click on Include/Hide Accepted Filter drop-down
	   	     clickByXpath("//*[@id='show-accepted-risks']");
	   	     Thread.sleep(3000);
	   	     //clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
	   	    // Thread.sleep(3000);
	   	     //Thread.sleep(3000);
	   	    // clickByXpath("//*[@id='show-accepted-risks']");
	   	     //Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[1]/div/ul/li[1]/a");
	   	     Thread.sleep(3000);
		     Thread.sleep(3000);
		     
		   //Click on My Risk Filter drop-down
	   	     clickByXpath("//*[@id='show-my-risks']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list[2]/div/ul/li[1]/a");
	   	     Thread.sleep(5000);
		     Thread.sleep(3000);
		     
		      //Click on Minimize sidebar
		        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
		        Thread.sleep(5000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
	 	 }
	   
	   @Test(priority=31, enabled = true)
		  public void RiskResponseListFilter() throws InterruptedException {
			  
			  		Thread.sleep(5000);
			  		//Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		//Thread.sleep(3000);
			  		
			  		// Click on Filter Button 
			        assertTextXpath("//cw-filter/div/span");
			  		clickByXpath("//cw-filter/div/span");
			  		Reporter.log("Click on Filter Button | ");
			  		Thread.sleep(5000);
			  		//Thread.sleep(3000);
			        //Thread.sleep(3000);
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

			  		//Click on Assets drop-down
			  		assertTextXpath("//div[3]/div/div/ul/li/input");
			  		clickByXpath("//div[3]/div/div/ul/li/input");
			  		Reporter.log("Click on Asset Drop-down | ");
			  		Thread.sleep(3000);
			  		assertTextXpath("//div[3]/div/div/div/ul/li");
			  		clickByXpath("//div[3]/div/div/div/ul/li");
			  		Reporter.log("Select value from Asset Drop-down | ");
			  		Thread.sleep(3000);

			  		// Click on Risk Treatment drop-down
			  		assertTextXpath("//div[2]/div[3]/div/div/ul/li/input");
			  		clickByXpath("//div[2]/div[3]/div/div/ul/li/input");
			  		Reporter.log("Click on Risk Treatment Drop-down | ");
			  		Thread.sleep(3000);
			  		assertTextXpath("//div[3]/div/div/div/ul/li[5]");
			  		clickByXpath("//div[3]/div/div/div/ul/li[5]");
			  		Reporter.log("Select value from Risk Treatment Drop-down | ");
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
			  		Thread.sleep(3000);   
			  		Thread.sleep(3000);   
			  		//Thread.sleep(3000);  
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
			        //Thread.sleep(3000);
			  		}
		  
	     @Test(priority=32, enabled = true)
		  public void ExportRiskResponse() throws InterruptedException {
			  
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  //Thread.sleep(3000);			   		             	       
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  //Click on Pdf 
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[2]/a");
			  Reporter.log("Click on Pdf | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);
			  
			  //Click on Export Button
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
			  Reporter.log("Click on Export Button | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  //Click on CSV File
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li[1]/a");
			  Reporter.log("Click on CSV File | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);
			  
			    //Click on Minimize sidebar
		        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
	     }
	     
	     @Test(priority=33, enabled = true)
		   public void RiskResponseSort() throws IOException, InterruptedException {
			    
	    	 Thread.sleep(3000);			
			
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			//Thread.sleep(5000);	
			//Thread.sleep(5000);	
						
			// Click on Risk Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Risk Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[6]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			//Thread.sleep(5000);	
			//Thread.sleep(5000);
			
			// Click on Residual Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Residual Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			//sortascen("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//Thread.sleep(5000);	
			//Thread.sleep(5000);	
			
			// Click on Residual Rating column Header to sort for Ascending order
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Residual Rating column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			//sortdesc("//*[@id='content']/tr[*]/td[7]"); //Get the Column count and values
			//sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			//Thread.sleep(5000);	
			//Thread.sleep(5000);
			
			//Click on PageHelp button Icon
	 	    assertTextXpath("//cw-page-help/button");
	        clickByXpath("//cw-page-help/button");
	        Reporter.log("Click on PageHelp button Icon | ");
	        Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[4]/div/div/div[3]/button");
	        clickByXpath("//div[4]/div/div/div[3]/button");
	        Reporter.log("Click OK Button in PageHelp pop-up window | ");
	        Thread.sleep(3000);
		   // Thread.sleep(5000);
		    
		    //Click on AppMap button Icon
	 	    assertTextXpath("//cw-appmap/button");
	        clickByXpath("//cw-appmap/button");
	        Reporter.log("Click on AppMap button Icon | ");
	        Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click OK Button in AppMap pop-up window
		    assertTextXpath("//div[4]/div/div/div[3]/button");
	        clickByXpath("//div[4]/div/div/div[3]/button");
	        Reporter.log("Click OK Button in AppMap pop-up window | ");
	        Thread.sleep(3000);
		   // Thread.sleep(5000);
			
			
   }
	   
	  

}

