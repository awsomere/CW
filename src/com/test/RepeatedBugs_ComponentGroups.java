package com.test;


import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class RepeatedBugs_ComponentGroups extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=107, enabled = true)
		 public void IRMA7838_ClearIcon_ComponentGroups() throws IOException, InterruptedException {
			  
		     	   Thread.sleep(8000);
		     	   
		     	  // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
				    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
			      clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
			      Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
			      Thread.sleep(6000); 
		     	   
		     	   //Select the Listed Asset
				   clickByXpath("//*[@id='selectComponentGroup']/div/div/ul/li[1]/select"); 
				   Thread.sleep(5000);
				   
				   // Selec Option from Listed Asset
				   clickByXpath("//*[@id='selectComponentGroup']/div/div/ul/li[1]/select/optgroup[2]/option[3]"); 
				   Thread.sleep(8000);
				   Thread.sleep(8000);
				   
				   //Repeated issue IRMA-7838
				  //Select the Option
				   clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[1]/property-choice/div/div/div[1]/button"); 
				   Thread.sleep(8000);
				   
				 // Clear the Option
				   clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[2]/a/i"); 
				   Thread.sleep(8000);
				 		   
				   // Select the Option 
				   clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div[1]/div/label"); 
				   Thread.sleep(8000);
				   
				// Clear the Option
				   clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[2]/a/i"); 
				   Thread.sleep(8000);
				   
				 //Select the Option
				   clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[4]/div[1]/property-choice/div/div/a/div"); 
				   Thread.sleep(8000);
				   
				   // Select the Option 
				   clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[4]/div[1]/property-choice/div/div/div/ul/li[1]"); 
				   Thread.sleep(8000);
				   
				// Clear the Option
				   clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[4]/div[2]/a/i"); 
				   Thread.sleep(8000);
				   	
		 }
	    
	    @Test(priority=86, enabled = true)
		 public void IRMA9046_AddNewGroupReflectedOrNOT_ComponentGroup() throws IOException, InterruptedException {
			 

		     	   Thread.sleep(2000);
               //Click on Add new Component Group button
		     	  clickByXpath("//*[@id='body-content']/div/div/div[2]/div[2]/div/div/ul/li[2]/span"); 
				   Thread.sleep(8000); 
				  
				   //Search the Textbox for listed Asset
				   sendvaluebyxpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[3]/td[1]/form/div[2]/input", "CopyAndMove"); 
				   Thread.sleep(6000);
				   
				 //Uncheck the Listed Asset
				   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[3]/td[1]/form/div[3]/a[1]/i"); 
				   Thread.sleep(3000);
				   
				 //Expand the Groups
				     clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
				     Thread.sleep(6000);  

				   //Click on SelectAll Link
				     clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[1]/button[1]");
				     Thread.sleep(6000); 
		     	   
				 //Select Drop-down
				 clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/a/div/b");
		         Thread.sleep(6000); 
		         
		         //Search that created group liste or Not
		         sendvaluebyxpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/div/div/input", "CopyAndMove");
		         Thread.sleep(6000); 
		         
		         //Select Options from Drop-down
		         clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/div/ul/li[1]");
		         Thread.sleep(6000); 
		         
		         //Click on Copy To 
		         clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[3]/div[2]/button");
		         Thread.sleep(6000);   	   
		         Thread.sleep(6000);   	 
		         Thread.sleep(6000);   		   
				
				   
	}
	    
	    @Test(priority=1, enabled =true)
		  public void IRMA8978_DeletePhysicalLocation_Componentgroups() throws InterruptedException, IOException {
		  
			  Thread.sleep(8000);  
	    
			//Select the Listed Asset
			   clickByXpath("//*[@id='selectComponentGroup']/div/div/ul/li[1]/select"); 
			   Thread.sleep(8000);
			   
			 //Select the BackUp Component type
			   clickByXpath("//*[@id='selectComponentGroup']/div/div/ul/li[1]/select/optgroup[1]/option[1]"); 
			   Thread.sleep(8000);
			   
			// select the Properties set		                 
			   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/a/div/b");
			   Thread.sleep(3000);
			   
			 //select the option	  	  			
		      clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/div/ul/li[3]"); 
		      Thread.sleep(8000);
			 
		       //TestLink 434 - Testcase 2
		       //Enter Abbreviation
			   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[1]/div/input", "Phys"); 
			   Thread.sleep(6000);
			   
			   //Enter Location
			   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[2]/div/input", "Auto Locat"); 
			   Thread.sleep(6000);
			   
			   // Click on Save button
			   clickByXpath("//*[@id='submit-button']");
			   Thread.sleep(8000); 
			   Thread.sleep(8000); 
			   Thread.sleep(8000); 
			   
			 //Click on Full screen
		 	    assertTextXpath("//*[@id='fullscreen']/i");
				clickByXpath("//*[@id='fullscreen']/i");
				Thread.sleep(5000);
				Thread.sleep(5000);
			  
			 //Close Dashboard 
		 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
				clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
				Thread.sleep(5000);			     
						   
				// Testcase 1
			   //Click on Manage Account Module
				assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
				clickByXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
				Reporter.log("Click on Manage Account Module | ");
				Thread.sleep(6000);
				//Thread.sleep(3000);
				
				  //Click on Physical Location
				assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/a");
				clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/a");
				Reporter.log("Click on Manage Account Module | ");
				Thread.sleep(8000);
				//Thread.sleep(3000);
				
				//Search the Physical Location
				sendvaluebyxpath("//*[@id='physical-locations-list_filter']/label/input", "Phys");
				Thread.sleep(8000);
				
				//Select the Listed Physical location
				clickByXpath("//*[@id='physical-locations-list']/tbody/tr/td[1]");
				Reporter.log("Click on Manage Account Module | ");
				Thread.sleep(8000);
				
				//Click on Delete Button
				clickByXpath("//*[@id='physical-locations-list_wrapper']/div[1]/div[1]/div/a[4]/span");
				Reporter.log("Click on Manage Account Module | ");
				Thread.sleep(8000);
				
				//Click on yes button from Delete Warning pop-up
				clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
				Reporter.log("Click on Manage Account Module | ");
				Thread.sleep(8000);
				
				//Click on OK Button
				clickByXpath("html/body/div[4]/div/div/div[2]/button");
				Reporter.log("Click on Manage Account Module | ");
				Thread.sleep(8000);
				Thread.sleep(8000);
				
				//Select the Asset module at sidebar-left
				   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
				   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
				   Reporter.log("Selected the Asset module at sidebar-left | ");
				   Thread.sleep(6000);
				   //Thread.sleep(6000);  
				   
				// Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
				    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
			      clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
			      Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
			      Thread.sleep(6000); 
	    }
	    

	    @Test(priority=1, enabled =true)
		  public void IRMA8987_IRMA8599_AddNewGroup_Pendinggroups() throws InterruptedException, IOException {
		  
			  Thread.sleep(8000);  
			  
		  // Enter some text in Group Name
		  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input");
		  sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input", "Response Groups");
		  Reporter.log("Enter some text in notes Editor | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		// Enter some text in Group Name
		  assertTextXpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea");
		  sendvaluebyxpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea", "Response Desc");
		  Reporter.log("Enter some text in notes Editor | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		// Select the Create Button            
		  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
		  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(3000); 
		  
		// Click on Done Button
		  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[3]/span[3]");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
}

}
