package com.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ComponentGroupsTestcases extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  
	
	 @Test(priority=75, enabled = true)
	 public void NavigationPage_ComponentGroups() throws InterruptedException, IOException
	 {     
		     Thread.sleep(8000);  
		     Thread.sleep(8000);
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
	 
	 @Test(priority=76, enabled = true)
	 public void PageHearder_ComponentGroups() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		   
		   // Click on Page header Icon
		   assertTextXpath("//h2/i");
		   Reporter.log("Click on Page header Icon | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//h2/i");
		   Thread.sleep(2000);
		   
		   // Click on Page header Title
		   assertEquals("//h2", "Component Groups");
		   Reporter.log("Click on Page header Title | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//h2");
		   Thread.sleep(2000);
	 }
	 
	 @Test(priority=77, enabled = true)
	 public void PanelBar_ComponentGroups() throws IOException, InterruptedException {
			   
		   Thread.sleep(6000);
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Assets Component Groups");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(2000); 
		   
	 }
	 
	 @Test(priority=78, enabled = true)
	 public void PageLevelHelp_ComponentGroups() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//cw-page-help/button");
	     clickByXpath("//cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(6000);
		    //Thread.sleep(6000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[4]/div/div/div[3]/button");
	     clickByXpath("//div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(6000);
		   // Thread.sleep(6000);
		   
	 }
		
	 @Test(priority=79, enabled = true)
	 public void RiskManagementMap_ComponentGroups() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(6000);
		   clickByXpath("html/body/div[4]/div/div/div[2]/button");
		   Thread.sleep(6000);
	 }
	 
	 @Test(priority=80, enabled = true)
	 public void PageHearder_GroupingWizard() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		 //Click on Edit Button
	      //assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
		       clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a"); 
			  Thread.sleep(8000);  
			  Thread.sleep(8000);
		   
		   // Click on Page header Icon
		   assertTextXpath("//h2/i");
		   Reporter.log("Click on Page header Icon | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//h2/i");
		   Thread.sleep(2000);
		   
		   // Click on Page header Title
		   assertEquals("//h2", "Grouping Wizard: Desktop or Laptop Component");
		   Reporter.log("Click on Page header Title | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//h2");
		   Thread.sleep(2000);
	 }
	 
	 @Test(priority=81, enabled = true)
	 public void PanelBar_GroupingWizard() throws IOException, InterruptedException {
			   
		   Thread.sleep(6000);
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Assets Component Groups Grouping Wizard: Desktop or Laptop Component");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(2000); 
		   
	 }
	 
	 @Test(priority=82, enabled = false)
	 public void PageLevelHelp_GroupingWizard() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000);
		   
		 
		   //Click on PageHelp button Icon
		    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button/i");
	     clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button/i");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(6000);
		    //Thread.sleep(6000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
	     clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(6000);
		   // Thread.sleep(6000);
		   
	 }
		
	 @Test(priority=83, enabled = false)
	 public void RiskManagementMap_GroupingWizard() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button/i");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button/i");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(6000);
		   clickByXpath("html/body/div[4]/div/div/div[2]/button");
		   Thread.sleep(6000);
	 }
	 
	 @Test(priority=84, enabled = true)
	 public void Breadcrumbtrail_ComponentGroups() throws InterruptedException, IOException
	  
	   {  		  
		 //CLick on Breadcrumbtrail link
		 assertTextXpath("//*[@id='page-content']/div[1]/div/ol/li[2]/a");
		 clickByXpath("//*[@id='page-content']/div[1]/div/ol/li[2]/a");
		   Thread.sleep(6000);
		 
	   }
	 
	 @Test(priority=85, enabled = true)
	 public void Delete_ComponentGroups() throws InterruptedException, IOException
	  
	   {  
		   
		    // Delete the Asset in Media/Asset Groups
		    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
		    clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
		    Reporter.log("Delete the Asset in Media/Asset Groups | ");
		    Thread.sleep(6000); 
		   
		    //warning pop-up get appears and click on cancel button
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		    Reporter.log("warning pop-up get appears and click on cancel button | ");
		    Thread.sleep(6000); 
		    Thread.sleep(2000); 	 
		   
	   } 
	 @Test(priority=86, enabled = true)
	 public void Search_GroupWizard() throws IOException, InterruptedException {
		  
		  Thread.sleep(8000);
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
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  
		    
		//Click on Edit Button
	   //assertTextXpath("//*[@id='content']/div[2]/div[6]/div/div[2]/div[2]/div[5]/div[1]/a");
	  clickByXpath("//*[@id='content']/div[2]/div[6]/div/div[2]/div[2]/div[5]/div[1]/a"); 
	  Thread.sleep(8000);  
	  Thread.sleep(8000);
	 // Thread.sleep(8000);
	  
	  //TestLink 504 - Testcase 1 
	  // Click on Search text Label
	  // assertEquals("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/search-wizard/div/input", "find a group or asset");
	   //Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(2000);
	  
	 //TestLink 504 - Testcase 2 & //TestLink 440 - Testcase 10
	   //Search the Textbox for listed Group
	   sendvaluebyxpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/search-wizard/div/input", "Default"); 
	   Thread.sleep(6000);
	   
	 //TestLink 504 - Testcase 3 & //TestLink 440 - Testcase 11
	   //Click on Clear Icon for Search textbox
	   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/search-wizard/div/i[2]"); 
	   Thread.sleep(6000);
	   
	 //TestLink 504 - Testcase 4
	   //Search the Textbox for listed Group
	   sendvaluebyxpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/search-wizard/div/input", "Group"); 
	   Thread.sleep(6000);
	   
	 //TestLink 504 - Testcase 5
	   //Click on Clear Icon for Search textbox
	   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/search-wizard/div/i[2]"); 
	   Thread.sleep(6000);
	  
	 }
	 
	 
	 @Test(priority=87, enabled = true)
	 public void ChkListedFields_GroupWizard_ComponentGroups() throws IOException, InterruptedException {
		  
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
	 
		//TestLink 440 - Testcase 2  
	 //Check GroupName Label
	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/thead/tr/th[1]/div[2]/b", "Group Name");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(8000); 
	   
	 //TestLink 440 - Testcase 2 
		//Check Add a Portable Media Component Group Label
	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button", "  Add a Backup Media Component Group");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(3000);
	   
	 //TestLink 440 - Testcase 2 
	   //Check Exit Label
	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[2]/span[1]", "Exit");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(3000);
	   
	 //TestLink 440 - Testcase 2 
	   //Check Next Step Label
	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[2]/span[2]", "Next Step");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(2000);
	   
	 }
	 

	 @Test(priority=88, enabled = true)
	 public void Expand_GroupingWizard() throws IOException, InterruptedException {
		  
		  Thread.sleep(2000);
		  
		//Expand the Groups
	 assertTextXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
	 clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i"); 
	 Thread.sleep(6000);   
	 
	 //TestLink 440 - Testcase 3
	 // Check Add Asset to this Group... button
	   assertEquals("//add-asset/div/button", "Add Asset to this Group...");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(3000);
	   clickByXpath("//add-asset/div/button"); 
	    Thread.sleep(8000);  
		 
	  //TestLink 440 - Testcase 4
	   //Search the Textbox for listed Asset
	   sendvaluebyxpath("//div[2]/input", "TestingAsset"); 
	   Thread.sleep(6000);
	   sendvaluebyxpath("//div[2]/input", ""); 
	   Thread.sleep(6000);
	   
	   //Uncheck the Listed Asset
	   clickByXpath("//label/span"); 
	   Thread.sleep(3000);
	   
	   //Check the Cancel Link
	   clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[2]/div/div/span"); 
	   Thread.sleep(3000);
	   
	   //TestLink 440 - Testcase 3
	  // Check Add Asset to this Group... button
		clickByXpath("//add-asset/div/button"); 
	    Thread.sleep(8000);  
	   
	   //Click Add Button
	   clickByXpath("//*[@id='submit-button']"); 
	   Thread.sleep(8000);
	   
	 //TestLink 440 - Testcase 4
	   // Count of Asset
	   //assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[10]/td/div/div[1]/b", "2 Assets");
	   Thread.sleep(8000);
	   
	  //Expand the Groups
	  assertTextXpath("//form/div[1]/a/i");
	  clickByXpath("//form/div[1]/a/i"); 
	 Thread.sleep(6000);  
	 }

	 @Test(priority=89, enabled = true)
	 public void AddNewGroup_CancelButton_GroupingWizard() throws IOException, InterruptedException {
		   
	 
		 ArrowDown();
		 ArrowDown();
		 ArrowDown();
		 ArrowDown();
		 ArrowDown();
		 ArrowDown();
		 Thread.sleep(6000);  
		   
		   
		   
	// Check Add a BackUp Component Group button
	  // assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button", "Add a Backup Media Component Group");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(3000);
	   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button"); 
	    Thread.sleep(5000);  
	 
	  //Cancel the Group
	  clickByXpath("//tr[9]/td/form/div[3]/a[2]/i"); 
	  Thread.sleep(5000); 
	 }
	 
	 @Test(priority=90, enabled = true)
	 public void AddNewGroup_BlankTickIcon_GroupingWizard() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000); 

	    //Click on Add a BackUp Component Group button
		clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button"); 
	   Thread.sleep(5000); 
	   
	   //Blank Name check and Click Add Tick button
	   clickByXpath("//tr[9]/td/form/div[3]/a[1]/i"); 
		  Thread.sleep(8000);  
		  
	 }
	 
	 @Test(priority=91, enabled = true)
	 public void AddNewGroup_Duplicate_GroupingWizard() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000); 
		  
		  //Duplicate the Group Name
	    sendvaluebyxpath("//tr[9]/td/form/div[2]/input", "Default Group"); 
	   Thread.sleep(8000);
	   
	   //Click Add Tick button
	   clickByXpath("//tr[9]/td/form/div[3]/a[1]/i"); 
		  Thread.sleep(5000);  
		  
	 }
	 
	 @Test(priority=92, enabled = true)
	 public void AddNewGroup_GroupingWizard() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000); 
	 
		 //Enter the Group Name
		 sendvaluebyxpath("//tr[9]/td/form/div[2]/input", "CES Group"); 
		 Thread.sleep(6000);
		 clickByXpath("//tr[9]/td/form/div[3]/a[1]/i"); 
		 Thread.sleep(5000);  
		 
		 //Check the New Button appears 
		 assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[9]/td[1]/form/div[2]/h6/span", "NEW");	  
		Thread.sleep(5000);   
		 
	 }
	 
	 @Test(priority=93, enabled = true)
	 public void EditName_GroupingWizard() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000); 
		 //TestLink 440 - Testcase 7
		 //Edit the new Created Group
		 clickByXpath("//tr[9]/td/form/div[3]/a[1]/i"); 
		 Thread.sleep(8000); 
		 sendvaluebyxpath("//tr[9]/td/form/div[2]/input", "Edit CES Group"); 
	   Thread.sleep(6000);
	   clickByXpath("//tr[9]/td/form/div[3]/a[1]/i"); 
		  Thread.sleep(5000);  
	 }
	 
	 @Test(priority=94, enabled = true)
	 public void DiscardChanges_ComponentGroupDetails_GroupingWizard() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000); 
		  
		 //TestLink 440 - Testcase 8
		//Component group Details icon to enter details
		  clickByXpath("//tr[9]/td/form/div[3]/a[2]/i"); 
		  Thread.sleep(5000); 
		  
	    //Click on Discard Changes button	  	  			
		clickByXpath("html/body/div[4]/div/div/div[2]/div/form/div[2]/a"); 
			Thread.sleep(8000);
			  
	 }

	 @Test(priority=95, enabled = true)
	 public void ComponentGroupDetails_GroupingWizard() throws IOException, InterruptedException {
		
		 Thread.sleep(6000); 
		  
		  //TestLink 440 - Testcase 14 & //TestLink 434 - Testcase 4
			//Component group Details icon to enter details
			  clickByXpath("//tr[9]/td/form/div[3]/a[2]/i"); 
			  Thread.sleep(5000); 
			  
	 //Enter the details
	 sendvaluebyxpath("//html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/div[1]/div[1]/div/input", "Edit CES Group -1"); 
	   Thread.sleep(6000);
	   
	   //TestLink 440 - Testcase 15 & //TestLink 434 - Testcase 5
	   //Enter the Risk ANalyst
	   clickByXpath("//div[2]/div/div/a/div/b"); 
		  Thread.sleep(5000);  
		 //GetText("//div[2]/div/div/div/ul/li[2]");
		   Thread.sleep(5000);
		 clickByXpath("//div[2]/div/div/div/ul/li[2]"); 
		  Thread.sleep(5000);  	  	  
		  
		//Enter the details
		sendvaluebyxpath("//textarea", "Desc"); 
		Thread.sleep(6000); 
		  
		//Enter the details	
		clickByXpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/div[2]/div[2]/div/input"); 
		Thread.sleep(2000);
		sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/div[2]/div[2]/div/input", "2019-01-02"); 
		Thread.sleep(6000);  
		  
		//Click on Save button	  	  			
		clickByXpath("//*[@id='submit-button']"); 
		//clickByXpath("html/body/div[4]/div/div/div[2]/div/form/div[2]/a"); 
		Thread.sleep(8000);
		  
	 }
	 
	 @Test(priority=96, enabled = true)
	 public void TriangleIcon_ComponentGroups() throws IOException, InterruptedException {
		   
		 
		 
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 ArrowUp();
		 
		//TestLink 440 - Testcase 5
		   Thread.sleep(6000); 
		   
		   // select the Properties set
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option	  	  			
	      clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[1]/property-choice/div/div/div/ul/li[1]"); 
	      Thread.sleep(8000);
	      
	      Thread.sleep(6000); 
		   // select the Properties set
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[3]/td[2]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option	  	  			
	      clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[3]/td[2]/div[1]/property-choice/div/div/div/ul/li[1]"); 
	      Thread.sleep(8000);
	 	      
	    //TestLink 440 - Testcase 6
	      //Check on Triangle Icon
	      clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[3]/a[1]/i"); 
	      Thread.sleep(8000);
	      
	      //Check on Triangle Icon
	      clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[3]/td[1]/form/div[3]/a[1]/i"); 
	      Thread.sleep(8000);
	    
	 }
	 
	 @Test(priority=97, enabled = true)
	 public void PhysicalLocationDropDown_ComponentGroups() throws IOException, InterruptedException {
		   
		 //TestLink 434 - Testcase 3
		   Thread.sleep(6000); 
		   
		   // select the Properties set
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option	  	  			
	      clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/div/ul/li[1]"); 
	      Thread.sleep(8000);
	      
	      // Click on Discard button
		   clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[2]/a");
		   Thread.sleep(3000); 
	      
		 //TestLink 440 - Testcase 5
		   Thread.sleep(6000); 
		   
		   // select the Properties set
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option	  	  			
	      clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/div/ul/li[1]"); 
	      Thread.sleep(8000);
		 
	    //TestLink 434 - Testcase 2
	      //Enter Abbreviation
		   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[1]/div/input", "Abbre"); 
		   Thread.sleep(6000);
		   
		 //Enter Location
		   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[2]/div/input", "Locat"); 
		   Thread.sleep(6000);
		   
		   // Click on Save button
		   clickByXpath("//*[@id='submit-button']");
		   Thread.sleep(3000);  
		   
		 
	 }
	 
	 @Test(priority=98, enabled = true)
	 public void Clear_ComponentGroups() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000); 
		   //Clear the Operation
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[2]/a/i");
		   Thread.sleep(3000);
		
		   //Clear the Operation
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[2]/a/i");
		   Thread.sleep(3000);
	
	 
	 }
	 
	 @Test(priority=99, enabled = true)
	 public void GlobalExpand_ComponentGroups() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000); 
		   
		 //TestLink 440 - Testcase 2
		   //Expand the Global Expand
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/thead/tr/th[1]/div[1]/a/i");
		   Thread.sleep(3000);
	 
		   //Close the Global Expand
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/thead/tr/th[1]/div[1]/a/i");
		   Thread.sleep(3000);
	 
	 }
	 
	 @Test(priority=100, enabled = true)
	 public void MoveAsset_ComponentGroups() throws IOException, InterruptedException {
		   
		//TestLink 440 - Testcase 12
		   Thread.sleep(6000);
		 //Click the First Expand
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
		   Thread.sleep(3000);
		   
		   //Click on Asset
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div/button[1]/span");
		   Thread.sleep(3000);
		   
		 //Click Move drop-down
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[3]/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //Select the Drop-down Values 
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[3]/div/div/ul/li[1]");
		   Thread.sleep(3000);	
		   
		 //TestLink 440 - Testcase 13
		 //Click on Move Button 
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[4]/div[2]/button");
		   Thread.sleep(3000);
		   
		   Thread.sleep(6000);
		   //Click the First Expand
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
		   Thread.sleep(3000);
	 }
	 
	 @Test(priority=101, enabled = true)
	 public void CopyAsset_ComponentGroups() throws IOException, InterruptedException {
		   
		//TestLink 440 - Testcase 14
		   Thread.sleep(6000);
		 //Click the First Expand
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
		   Thread.sleep(3000);
		   
		   //Click on Asset
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div/button[1]/span");
		   Thread.sleep(3000);
		   
		 //Click Copy drop-down
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //Select the Drop-down Values 
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/div/ul/li[1]");
		   Thread.sleep(3000);	
		   
		 //TestLink 440 - Testcase 16
		 //Click on Copy Button 
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[3]/div[2]/button");
		   Thread.sleep(3000);
		   
		   Thread.sleep(6000);
		   //Click the First Expand
		   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
		   Thread.sleep(3000);
	 }
	 
	 @Test(priority=102, enabled = true)
	 public void NextStep_ComponentGroups() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(6000);  
		  
		/*//Select Physical Location from drop-down	  	  
		 clickByXpath("//a/div/b"); 
		 Thread.sleep(8000);    	  
		 clickByXpath("//td[2]/div/div/div/ul/li"); 
		  Thread.sleep(8000);
		  
	  //Select Physical location from drop-down in second Group	  	  
		 clickByXpath("//tr[3]/td[2]/div/div/a/div/b"); 
		 Thread.sleep(8000);    	  
		 clickByXpath("//tr[3]/td[2]/div/div/div/ul/li"); 
	 	  Thread.sleep(8000);*/
		  
	  /*  //Click on Triage Icon 		  	  
		 clickByXpath("//div[3]/a/i"); 
		 Thread.sleep(8000);    	  
		 clickByXpath("//tr[3]/td/form/div[3]/a/i"); 
		  Thread.sleep(8000);  */
		 
		 //TestLink 440 - Testcase 17
		  //Click on Next Button
		  	assertEquals("//ng-form/div[2]/span[2]", "Next Step");	  
		  	Thread.sleep(5000);  
		clickByXpath("//ng-form/div[2]/span[2]"); 
		  Thread.sleep(8000);
		  
		  
		//Click on Previous Button
		  	assertEquals("//ng-form/div[2]/span", "Previous Step");	  
		  	Thread.sleep(5000);  
		clickByXpath("//ng-form/div[2]/span"); 
		  Thread.sleep(8000);
		  
		  //Click on Next button
		clickByXpath("//ng-form/div[2]/span[2]"); 
		  Thread.sleep(8000);
		  
		//TestLink 440 - Testcase 18
		//Click on Done button
		clickByXpath("//div[2]/div/input"); 
		  Thread.sleep(8000);

	 }
	 
	 @Test(priority=103, enabled = false)
	 public void ChkComponent_AssetInventoryList() throws InterruptedException, IOException
	
	       {
	
		 Thread.sleep(6000);		 
		 //Select Asset Inventory List Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    Reporter.log("Selected Asset Inventory List Sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(6000);
			   Thread.sleep(6000);
		 
	  // Enter some text in Search Text-box
	  assertTextXpath("//*[@id='assets_filter']/label/input");
	   sendvaluebyxpath("//*[@id='assets_filter']/label/input", "TestingAsset");
	   Reporter.log("Enter some text in Search Text-box | ");
	   Thread.sleep(6000);
		//Thread.sleep(6000);
		    
	 // Select one of the added Asset in Asset Inventory List
	   assertTextXpath("//*[@id='assets']/tbody/tr[1]/td[3]");
	   clickByXpath("//*[@id='assets']/tbody/tr[1]/td[3]");
	   Reporter.log("Select one of the added Asset in Asset Inventory List | ");
	   Thread.sleep(6000); 
		  
	   // Click on Edit button for listed Asset
	   clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[2]");
	   Thread.sleep(6000);
	   clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/ul/li[1]/a");
	   Reporter.log("Click on Edit button for listed Asset | ");
		 Thread.sleep(8000);
		 Thread.sleep(8000);
	   Thread.sleep(6000);
	   
	   //Click on next Button
	    //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
	    Reporter.log("Select data from Type of Sensitive Data | ");
	    Thread.sleep(6000);
	    Thread.sleep(6000);
	    
	    //Click on next Button
	    //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
	    Reporter.log("Select data from Type of Sensitive Data | ");
	    Thread.sleep(6000);
	    Thread.sleep(6000);
	    
	    //Click on next Button
	    //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
	    Reporter.log("Select data from Type of Sensitive Data | ");
	    Thread.sleep(6000);
	    Thread.sleep(6000);
	    
	    //Click on next Button
	    //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	    clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
	    Reporter.log("Select data from Type of Sensitive Data | ");
	    Thread.sleep(8000);
	    Thread.sleep(8000);
	    
	  //Click on Change/Add Groups in Component Groups Tab
	    assertTextXpath("//*[@id='component-groups']/div[2]/div[1]/div[1]/div/button");
	    clickByXpath("//*[@id='component-groups']/div[2]/div[1]/div[1]/div/button");     
	   Reporter.log("Click on 'Change/Add Groups' links in Component Groups Tab");
	   Thread.sleep(6000);
	   Thread.sleep(6000);
	  
	    
	  //Click on ? Button in Component Groups Tab
	    assertTextXpath("//div/div/div[2]/div[3]/div/h5/span/span/i");
	    clickByXpath("//div/div/div[2]/div[3]/div/h5/span/span/i");     
	    Reporter.log("Click on Create & Select Button in Component Groups Tab");
	    Thread.sleep(6000);
	    Thread.sleep(3000);
	    
	    //Click on Close Button in Component Groups Tab
	    assertTextXpath("//div[6]/div/div/div[3]/div[4]/button");
	    clickByXpath("//div[6]/div/div/div[3]/div[4]/button");     
	    Reporter.log("Click on Create & Select Button in Component Groups Tab");
	    Thread.sleep(8000);
	    Thread.sleep(6000);
	        
	    //Click on Close Pop-up Window
	    assertTextXpath("html/body/div[6]/div/div/div[1]/button");
	    clickByXpath("html/body/div[6]/div/div/div[1]/button");     
	    Reporter.log("Click on Create & Select Button in Component Groups Tab");
	    Thread.sleep(6000);
	    Thread.sleep(6000);
	    
	  //click on Done button and save  
	    assertTextXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/button[1]");
	    clickByXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/button[1]");     
	    Reporter.log("Successfully Asset created | ");
	    Thread.sleep(5000);
	    Thread.sleep(6000);
		   Thread.sleep(6000);
	    
	    //Select Asset Inventory List Sub-module
	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
	    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
	    Reporter.log("Selected Asset Inventory List Sub-module | ");
	    Thread.sleep(5000);
	    Thread.sleep(6000);
		   Thread.sleep(6000);

	 }

}
