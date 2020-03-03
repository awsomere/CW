package com.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RepeatedBugs_ControlsGlobal extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=1, enabled =true)
	  public void IRMA9034_ControlGlobal_PendingGroupChanges() throws InterruptedException, IOException {
	  
		  Thread.sleep(8000);
		 
		
		  //Select Risk Determination sidebar-left Module
		    	assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        Reporter.log("Select Risk Determination sidebar-left Module | ");
	        
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
		    Thread.sleep(8000);	
		    	       
		  //Select Controls - Global/Media sub-module under Risk determination Module 
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(3000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);	
		  //Thread.sleep(3000);
	  
		
		 //Click on + Icon to open Control 
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
		  Reporter.log("Click on + Icon to open Control | ");
		  Thread.sleep(8000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  // Click on '+' Icon to Sub-Controls
		  assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[1]/span");
		  clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[1]/span");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(6000);
		  
		// Select the Different Response 
		  assertTextXpath("//*[@id='component-groups-table']/tbody/tr[2]/td[3]/table/tbody/tr[1]/td[2]/cw-asset-response-selector/div/div/label[3]");
		  clickByXpath("//*[@id='component-groups-table']/tbody/tr[2]/td[3]/table/tbody/tr[1]/td[2]/cw-asset-response-selector/div/div/label[3]");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(8000);
		  
		// Select the Pending groups Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/pending-assets-changes-button/span/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/pending-assets-changes-button/span/button");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(8000);
		  
		// Enter some text in Group Name
		  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input");
		  sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input", "Sample Groups");
		  Reporter.log("Enter some text in notes Editor | ");
		  Thread.sleep(8000);
		  //Thread.sleep(3000);
		  
		// Enter some text in Group Name
		  assertTextXpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea");
		  sendvaluebyxpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea", "Sample Desc");
		  Reporter.log("Enter some text in notes Editor | ");
		  Thread.sleep(8000);
		  //Thread.sleep(3000);
		  
		// Select the Create Button            
		  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
		  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  
		// Click on Done Button
		  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[3]/span[3]");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(8000);
		  Thread.sleep(8000);
		  
    }
	  
	  @Test(priority=184, enabled =true)
	    public void IRMA9154_Export_ControlsGlobalMedia() throws InterruptedException, IOException { 
	 		
	 		          Thread.sleep(3000);
			         
	 		          //Click on Export Button
					  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
					  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
					  Reporter.log("Click on Export Button | ");
					  Thread.sleep(8000);
					  //Thread.sleep(3000);
					  
					  //Click on Pdf 
					  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
					  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
					  Reporter.log("Click on Pdf | ");
					  Thread.sleep(8000);
					  Thread.sleep(8000);
					  
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

}
