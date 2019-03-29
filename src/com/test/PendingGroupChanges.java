package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PendingGroupChanges extends WrapperClass {
	
	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=1, enabled =true)
	  public void NavigatePage_PendingGroupChanges() throws InterruptedException, IOException {
	  
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);	
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		
		  //Select Risk Determination sidebar-left Module
		    try {
		    	assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        Reporter.log("Select Risk Determination sidebar-left Module | ");
	        }catch(Exception e)
			{
		        e.printStackTrace();
			    Reporter.log("Select Risk Determination sidebar-left Module doesn't reached | ");
			}
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
	  
	  
	  }
	  
	  @Test(priority=2, enabled =true)
	  public void ExpandControls_ControlsGlobalMedia() throws InterruptedException, IOException {
		
		 //Click on + Icon to open Control 
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
		  Reporter.log("Click on + Icon to open Control | ");
		  Thread.sleep(8000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  // Click on '+' Icon to Sub-Controls
		  assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[1]/span");
		  clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[1]/span");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(3000);
		  
		// Select the Different Response to make enable Pending groups Button
		  assertTextXpath("//*[@id='component-groups-table']/tbody/tr[2]/td[3]/table/tbody/tr[1]/td[2]/cw-asset-response-selector/div/div/label[3]");
		  clickByXpath("//*[@id='component-groups-table']/tbody/tr[2]/td[3]/table/tbody/tr[1]/td[2]/cw-asset-response-selector/div/div/label[3]");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(3000);
		  
		  
	  }
	  
	  @Test(priority=3, enabled =true)
	  public void PendingGroupButton_ControlsGlobalMedia() throws InterruptedException, IOException {
		
		  
		// Select the Different Response to make enable Pending groups Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/pending-assets-changes-button/span/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/pending-assets-changes-button/span/button");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(3000);
		
		  
		  
	}
	  
	  @Test(priority=4, enabled = true)
	  public void PageHearder_PendingGroupButton_ControlsGlobalMedia() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		  
		   
		 // Click on Page header Title
		 assertEquals("html/body/div[4]/div/div/div[1]/h4", "Pending Asset Grouping Changes");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h4");
		 Thread.sleep(8000);
	} 

	  @Test(priority=5, enabled = true)
		 public void ChkHeaderLabel_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);

			//Check GroupName Label
     		   assertEquals("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/h5/b", "Assets to move");
			   Reporter.log("Check ColumnHeader | ");
			   Thread.sleep(8000); 
			   
			 //Check GroupName Label
			   assertEquals("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/h5/b", "Move FROM this Current Group:");
			   Reporter.log("Check ColumnHeader | ");
			   Thread.sleep(8000); 
			   Thread.sleep(8000); 
			   			   
			 //Check GroupName Label
			   assertEquals("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/h5/b", "Move To this New Cloned Group:");
			   Reporter.log("Check ColumnHeader | ");
			   Thread.sleep(8000);   
			   
			  
	  }
	  
	  @Test(priority=6, enabled = true)
	  public void ComponentIcon_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			  
			// Select the ComponentIcon 
			  assertTextXpath("//h5/span/span/i");
			  clickByXpath("//h5/span/span/i");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  
			  // Select the Close Button
			  assertTextXpath("//div[4]/div/div/div[3]/div[4]/button");
			  clickByXpath("//div[4]/div/div/div[3]/div[4]/button");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  
			  
			  
}

	  @Test(priority=7, enabled = true)
	  public void Cancel_NewGroup_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			  
			  // Enter some text in Group Name
			  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input");
			  sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input", "Sample Groups");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			// Enter some text in Group Name
			  assertTextXpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea");
			  sendvaluebyxpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea", "Sample Desc");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			// Select the cancel Button            
			  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[1]");
			  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[1]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  
	  }
	  
	  @Test(priority=8, enabled = true)
	  public void CreateNewGroup_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			  
			// Enter some text in Group Name
			  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input");
			  sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input", "Sample Groups");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			// Enter some text in Group Name
			  assertTextXpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea");
			  sendvaluebyxpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea", "Sample Desc");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			// Select the Create Button            
			  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
			  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  
			  
	  }
	  
	  @Test(priority=9, enabled = true)
	  public void RadioChecked_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			// Click on Page header Title
			 assertEquals("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[1]/label", "Yes, make this change");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
			  
			// Click on Page header Title
			 assertEquals("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/label", "No, don't move this asset");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
	  }
	  
	  @Test(priority=10, enabled = true)
	  public void RadioFunction_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			// Click on Page header Title
			  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/label");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
			  
			// Click on Page header Title
			 //clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[1]/label");
			 //Reporter.log("Click on Page header Title | ");
			// Thread.sleep(1000);
			
	  }
	  
	  @Test(priority=11, enabled = true)
	  public void CreateNewGroupInsteadLink_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			// Click on Create New Group Instead Link
			clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/button");
			Reporter.log("Click on Page header Title | ");
		    Thread.sleep(5000);
		    
	  }
	  
	  @Test(priority=12, enabled = true)
	  public void DuplicateGroup_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
		    
		 // Enter some text in Group Name
			  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input");
			  sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input", "Sample Groups");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			// Enter some text in Group Name
			  assertTextXpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea");
			  sendvaluebyxpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea", "Sample Desc");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			// Select the Create Button            
			  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
			  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000); 
			  
			//Clickm on OK button in Warning Pop-ups         
			  assertTextXpath("html/body/div[6]/div/div/div[2]/button");
			  clickByXpath("html/body/div[6]/div/div/div[2]/button");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000); 
			  
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
	  
	  @Test(priority=13, enabled = true)
	  public void ClosePopup_PendingGroupButton_ControlsGlobalMedia() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			  
			// Click on Close Pop-up
			  clickByXpath("html/body/div[4]/div/div/div[1]/button");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(8000);
			 
			 refreshpage();
			 Thread.sleep(8000);
			 Thread.sleep(8000);
			 
			
			 
	  }
	  
	  
}