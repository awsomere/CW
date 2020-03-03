package com.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RepeatedBugs_RiskResponseList extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=253, enabled =true)
	  public void IRMA8037_Vulnerability_RiskResponseList() throws InterruptedException, IOException {
		
    	 //Click on Full screen
	    assertTextXpath("//*[@id='fullscreen']/i");
		clickByXpath("//*[@id='fullscreen']/i");
		Thread.sleep(5000);

	   //TestCases RRL - 1				
	    //Click on Risk Response Module
 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
        Reporter.log("Click on Risk Response Module | ");
        Thread.sleep(8000);
        //Thread.sleep(6000);
        //Thread.sleep(6000);
        //Thread.sleep(6000);
        
      //TestCases RRL - 1
        //Click on Risk Response List Sub-module
        assertTextLink("Risk Response List");
        clickBylinktext("Risk Response List");
        Reporter.log("Click on Risk Response List Sub-module | ");
        Thread.sleep(8000);
        Thread.sleep(6000); 
        
        //TestCases RRL - 6
		//Click on Vulnerability Link
	     clickByXpath("//*[@id='risk_0']/td[7]/a");
	     Thread.sleep(6000);
	     Thread.sleep(6000);
	     
	     
    }
    
    @Test(priority=253, enabled =true)
	  public void IRMA9288_IRMA9484_EmailArrowIcon_RiskResponseList() throws InterruptedException, IOException {
		
    	 //Click on Full screen
	    assertTextXpath("//*[@id='fullscreen']/i");
		clickByXpath("//*[@id='fullscreen']/i");
		Thread.sleep(5000);

	   //TestCases RRL - 1				
	    //Click on Risk Response Module
 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
        clickByXpath("//*[@id='sidebar-left']/ul/li[5]/a/span[2]");
        Reporter.log("Click on Risk Response Module | ");
        Thread.sleep(8000);
        //Thread.sleep(6000);
        //Thread.sleep(6000);
        //Thread.sleep(6000);
        
      //TestCases RRL - 1
        //Click on Risk Response List Sub-module
        assertTextLink("Risk Response List");
        clickBylinktext("Risk Response List");
        Reporter.log("Click on Risk Response List Sub-module | ");
        Thread.sleep(8000);
        Thread.sleep(6000); 

		 Thread.sleep(8000);
		//Click on Minimize sidebar
	        clickByXpath("//*[@id='header']/div[2]/div/ul[1]/li/a/i");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000); 
		 
	        //TestCases RRL - 7
		//Expand the TBO 
		 assertTextXpath("//tr[3]/td/span");
		   clickByXpath("//tr[3]/td/span");
		   Reporter.log("Expand the TBO | ");
		   Thread.sleep(6000);
		  
		   ArrowDown();
		   ArrowDown();
		   ArrowDown();
		   ArrowDown();
		   Thread.sleep(8000);
        
    	 //Click on Risk Owner Type drop-down
		   assertTextXpath("//td[2]/div/ul/li/div/button");
		   clickByXpath("//td[2]/div/ul/li/div/button");
		   Reporter.log("Click on Risk Owner Type drop-down | ");
		   Thread.sleep(6000);
		   
		   // Enter the value
		    assertTextXpath("//div/input");
		    sendvaluebyxpath("//div/input", "Uma M");
		    Reporter.log("Enter the value | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);	
		   
		   //Select the option from drop-down
		   assertTextXpath("//li/div/ul/li[5]/a");
		   clickByXpath("//li/div/ul/li[5]/a");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(8000);
		   
		 //Click on Email Arrow Icon
		   assertTextXpath("//li[2]/span/i");
		   clickByXpath("//li[2]/span/i");
		   Reporter.log("Click on Email Arrow Icon| ");
		   Thread.sleep(6000);					  
		   
		   //Click on Close Button
		   assertTextXpath("//div[5]/div/div/div/button");
		   clickByXpath("//div[5]/div/div/div/button");
		   Reporter.log("Select the option from drop-down | ");
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
		   
	 }
	  
    @Test(priority=253, enabled =true)
	  public void IRMA8817_ChkComponentListedORNOT_RiskResponseList() throws InterruptedException, IOException {
		

}
    @Test(priority=253, enabled =true)
	  public void IRMA8636_ChkComponentListedORNOT_RiskResponseList() throws InterruptedException, IOException {
		

}
}