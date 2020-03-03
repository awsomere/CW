package com.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ComponentGroupUpdate extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  
	  String EntityName="Mill";
	  
	
	 @Test(priority=75, enabled = true)
	 public void NavigationPage_ComponentGroups() throws InterruptedException, IOException
	 
	 {     	     	
		   Thread.sleep(8000);
		   Thread.sleep(8000);
			  Thread.sleep(8000);
			  
			     
			   //Select the Asset module at sidebar-left
			   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
			   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
			   Reporter.log("Selected the Asset module at sidebar-left | ");
			   Thread.sleep(6000);
			   //Thread.sleep(6000);  
		 		 	  				 	 
		    // Select the Component Groups sub-modules listed in Asset Inventory List	  
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	      clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	      Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
	      Thread.sleep(8000); 
	      Thread.sleep(8000);
	      Thread.sleep(8000);
		 
	 }
	 
	 @Test(priority=76, enabled = true)
	 public void PageHearder_ComponentGroups() throws IOException, InterruptedException {
		   
		   Thread.sleep(8000);
		   
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
			   
		   Thread.sleep(8000);
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Assets Component Groups");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(2000); 
		   
	 }
	 
	 @Test(priority=78, enabled = true)
	 public void ChangedComponentGroups_ComponentGroups() throws IOException, InterruptedException {
		   
		   Thread.sleep(8000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[1]/select");
	        clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[1]/select");
	     Reporter.log("Click on PageHelp button Icon | ");
	     Thread.sleep(8000);
		    //Thread.sleep(8000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[1]/select/optgroup[1]/option[1]");
	     clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[1]/select/optgroup[1]/option[1]");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(8000);
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		 clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[1]/select");
		 Thread.sleep(8000);
		
	 }
	 
	
	
	 @Test(priority=79, enabled = false)
	 public void PageLevelHelp_ComponentGroups() throws IOException, InterruptedException {
		   
		   Thread.sleep(8000);
		   
		   //Click on PageHelp button Icon
		    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	        clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
	     Reporter.log("Click on PageHelp button Icon | ");
	     //Thread.sleep(6000);
		    Thread.sleep(8000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
	     clickByXpath("html/body/div[4]/div/div/div[3]/button");
	     Reporter.log("Click OK Button in PageHelp pop-up window | ");
	     Thread.sleep(8000);
		   // Thread.sleep(8000);
		   
	 }
		
	 @Test(priority=80, enabled = false)
	 public void RiskManagementMap_ComponentGroups() throws IOException, InterruptedException {
		   
		   Thread.sleep(8000); 
		   //TestCase 34
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(6000);
		   clickByXpath("html/body/div[4]/div/div/div[2]/button");
		   Thread.sleep(8000);
	 }

	 @Test(priority=81, enabled = true)
	 public void ChkListedFields_GroupWizard_ComponentGroups() throws IOException, InterruptedException {
		  
		  Thread.sleep(6000);	  
	
  //TestLink 440 - Testcase 2  
	 //Check GroupName label
	   assertEquals("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[2]/span", "Add a Component Group");
	   Reporter.log("Check ColumnHeader | ");
	  Thread.sleep(2000); 
	  clickByXpath("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[2]/b/span");
	  Thread.sleep(5000); 
	  
	   
	   //TestLink 440 - Testcase 2  
	   //Check GroupName Label
	   assertEquals("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[3]/copy-group-to-entity-button/span/button", "Copy Group to Entity...");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(1000); 
	   
	   //TestLink 440 - Testcase 2  
	   //Check GroupName Label
	   assertEquals("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[4]/span/button", "Copy Risk Determination Info...");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(1000); 
	   
	 //Check GroupName Label
	  assertEquals("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[5]/delete-group-button/span/button", "Delete Group...");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(1000); 
	   
	   //TestLink 440 - Testcase 2  
	   //Check GroupName Label
	   assertEquals("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/thead/tr/th[1]/div[2]/b", "Group Name");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(1000); 
	   
	 //TestLink 440 - Testcase 2  
	   //Check GroupName Label
	   assertEquals("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/thead/tr/th[2]/b", "What type of backup media is this?");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(1000);
	   
	 //TestLink 440 - Testcase 2  
	   //Check GroupName Label
	   assertEquals("//*[@id='content']/ng-form/div/div/grouping-wizard/div/table/thead/tr/th[3]/b", "Physical Location");
	   Reporter.log("Check ColumnHeader | ");
	   Thread.sleep(1000);
	   
	 }
	 
	 @Test(priority=82, enabled = true)
	 public void Search_GroupWizard_ComponentGroups() throws IOException, InterruptedException {
					  
				  refreshpage();
				  Thread.sleep(8000);
				  Thread.sleep(8000);
				  
				  
	  //TestLink 504 - Testcase 2 & //TestLink 440 - Testcase 10
		//Search the Textbox
	  sendvaluebyxpath("//*[@id='selectComponentGroup']/div/div[2]/search-wizard/div/input", "Testing");
	   Thread.sleep(8000);
	   Thread.sleep(8000);
				   
	    //TestLink 504 - Testcase 3 & //TestLink 440 - Testcase 11
		//Click on Clear Icon for Search textbox
		clickByXpath("//*[@id='selectComponentGroup']/div/div[2]/search-wizard/div/i[2]"); 
		Thread.sleep(8000);
				   
	    //TestLink 504 - Testcase 4
	   //Search the Textbox for listed Group
		 sendvaluebyxpath("//*[@id='selectComponentGroup']/div/div[2]/search-wizard/div/input", "Group"); 
		 Thread.sleep(8000);
		 Thread.sleep(8000);
				   
		 //TestLink 504 - 
		 //Click on Clear Icon for Search textbox
		 clickByXpath("//*[@id='selectComponentGroup']/div/div[2]/search-wizard/div/i[2]"); 
			Thread.sleep(8000);
				   
}
	 
	 @Test(priority=83, enabled = true)
	 public void GlobalExpand_GroupingWizard() throws IOException, InterruptedException {
		  
		  Thread.sleep(6000);
		  Thread.sleep(8000);  
		   
		  
	 //Expand the Group
	clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/thead/tr/th[1]/div[1]/a/i");
	     Thread.sleep(8000);   
	   
	     
	    //Expand the Groups
	     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/thead/tr/th[1]/div[1]/a/i");
	     Thread.sleep(8000);   
	     
  }
	
	 @Test(priority=84, enabled = true)
	 public void AddNewGroup_CancelButton_ComponentGroup_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(2000);
	     	  Thread.sleep(8000);  
			   
	     	 //TestLink 440 - Testcase 3
			   //Check Add Asset to this Group... button
	     	 assertEquals("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[2]/span", "Add a Component Group");
	   	     Reporter.log("Check ColumnHeader | ");
	   	      Thread.sleep(8000); 
			   clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[2]/span"); 
			   Thread.sleep(8000); 
			   
			 //Cancel the Group		
         clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[9]/td[1]/form/div[3]/a[2]/i"); 
		     Thread.sleep(5000);
			   
	 }
	 
	 
	 @Test(priority=85, enabled = true)
	 public void AddNewGroup_BlankTickIcon_GroupingWizard() throws IOException, InterruptedException {
		  
		     Thread.sleep(12000);
		 
    	 //TestLink 440 - Testcase 3
		   //Check Add Asset to this Group... button
			   clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[2]/span"); 
			   Thread.sleep(8000); 
			   
		 //Check the Tick button with Blank
			clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[9]/td[1]/form/div[3]/a[1]/i"); 
			Thread.sleep(5000);  
			
	 }
	 
	 @Test(priority=86, enabled = true)
	 public void AddNewGroup_Duplicate_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(8000);
		  
			   //TestLink 440 - Testcase 4
			  //Search the Textbox for listed Asset
			   sendvaluebyxpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[9]/td[1]/form/div[2]/input", "Automation New Test Group"); 
			   Thread.sleep(3000);
			   
			   //Check the Tick button with duplicated
			   clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[9]/td[1]/form/div[3]/a[1]/i"); 
				Thread.sleep(5000);  
			   
			   
	 }
			
	 @Test(priority=87, enabled = true)
	 public void AddNewGroup_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(8000);

			  
	     	  //TestLink 440 - Testcase 4
			   //Search the Textbox for listed Asset
			   sendvaluebyxpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[9]/td[1]/form/div[2]/input", "CES"); 
			   Thread.sleep(3000);
			   
			   //Check the Tick button with duplicated
			   clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[9]/td[1]/form/div[3]/a[1]/i"); 
				Thread.sleep(8000);  
				
				refreshpage();
				Thread.sleep(8000);  
				Thread.sleep(8000);  
			   
			
			   
         }
	 
	 @Test(priority=88, enabled = true)
	 public void EditComponentGroup_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(8000);
	     	   
	     	   //Edit the Group Name
	     	    clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[5]/td[1]/form/div[3]/a[1]/i"); 
			   Thread.sleep(3000);
	     	   
			   //TestLink 440 - Testcase 4
			   //Search the Textbox for listed Asset
			   sendvaluebyxpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[5]/td[1]/form/div[2]/input", "CES Edit"); 
			   Thread.sleep(8000);
			   
			 //Check the Tick button with duplicated
			   clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[5]/td[1]/form/div[3]/a[1]/i"); 
				Thread.sleep(8000);  
				   
	 }
	 
	 @Test(priority=89, enabled = true)
	 public void EditIcon_ComponentGroupDetails_GroupingWizard() throws IOException, InterruptedException {
	   	 
		   Thread.sleep(8000);
		   
		//TestLink 440 - Testcase 7
		 //Edit the new Created Group	
	 clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[5]/td[1]/form/div[3]/a[2]/i"); 
		 Thread.sleep(8000);
		 
	 }
	 
	 @Test(priority=90, enabled = true)
	 public void DiscardChanges_ComponentGroupDetails() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(8000); 
		  
		 //TestLink 440 - Testcase 8
		   //Click on Discard Changes button
		  clickByXpath("//a[@class='btn-link pull-right text-underline']"); 
		  Thread.sleep(5000); 
		
			  
	 }
	 
	 @Test(priority=91, enabled = true)
	 public void UpdatedComponentGroupPopup_GroupingWizard() throws IOException, InterruptedException {
		
		 Thread.sleep(7000); 
		   
		   //Edit the new Created Group		               
		//Edit the new Created Group		               
		 clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[5]/td[1]/form/div[3]/a[2]/i"); 
		 Thread.sleep(8000);
		 Thread.sleep(3000);
		 
		 //Enter the Name		
           sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[1]/div[1]/div/input", "CES Edit Group"); 
		   Thread.sleep(8000);
		   
		  //Enter the desc
		   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[2]/div[1]/div/textarea", "Desc"); 
	      Thread.sleep(8000); 
	    
	      //Check the Deaful Checkbox -- IRMA9446
	      clickByXpath("/html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[1]/div[2]/div/label"); 
	      Thread.sleep(8000);
		   
	       //TestLink 440 - Testcase 15 & //TestLink 434 - Testcase 5
	       //Enter the Risk ANalyst
		   clickByXpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[2]/div[2]/div[1]/div/ul/li[1]/div/button/span[3]"); 
		    Thread.sleep(5000);  
		   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[2]/div[2]/div[1]/div/ul/li[1]/div/ul/li[2]/div/input", "bala"); 
			Thread.sleep(8000);      
			clickByXpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[2]/div[2]/div[1]/div/ul/li[1]/div/ul/li[4]/a"); 
			Thread.sleep(8000);    	  		
		  
		//Enter the details	
		clickByXpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[2]/div[2]/div[2]/input"); 
		Thread.sleep(2000);
		sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/fieldset/div[2]/div[2]/div[2]/input", "11-21-2019"); 
		Thread.sleep(8000);  
		  
		//Click on Save button	  
		clickByXpath("//*[@id='submit-button']"); 
		//clickByXpath("html/body/div[4]/div/div/div[2]/div/form/div[2]/a"); 
		Thread.sleep(8000);
		Thread.sleep(5000);
	 }
	 
	 @Test(priority=92, enabled = true)
	 public void IRMA10416_AssetToThisGroup_Cancel_ComponentGroups() throws IOException, InterruptedException {
		
				
			   Thread.sleep(5000); 
				   
				  //Expand the New group
			      clickByXpath("//tr[5]/td[1]/form/div[1]/a/i");
	     	     Thread.sleep(8000); 
				
				     //Click on Add Asset to this group
			        clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[6]/td/div/div[2]/add-asset/div/button");
				     Thread.sleep(8000); 
				     
				     //Uncheck on 'Show Only this Asset with Component Type' checkbox	
				 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
				  Thread.sleep(8000); 
				  
				  //Uncheck on 'Show Only this Asset with Component Type' checkbox	
				  //10416 //Checked that all asset for neww created Group is unchecked
				 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
				  Thread.sleep(8000); 
				  
					//Click on Cancel button
				       clickByXpath("//span[@class='btn btn-link']");
				     Thread.sleep(8000);  
				     Thread.sleep(8000);  
				     
				     //Expand the New group
				      clickByXpath("//tr[5]/td[1]/form/div[1]/a/i");
		     	     Thread.sleep(8000); 
				     
				  
	 }
	
	 
	 @Test(priority=93, enabled = true)
	 public void IRMA9046_AddNewGroupReflectedOrNOT_ComponentGroup() throws IOException, InterruptedException {
		 

	   Thread.sleep(5000);
	     	   
     
	         
		//Click on SelectAll Link
         clickByXpath("//div[@class='row component-group-assets hasSelectedAsset']//button[@class='btn btn-link'][contains(text(),'select all')]");
         Thread.sleep(8000); 
	   
        //Select Copy To Drop-down	     	
        clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/a/div/b");
        Thread.sleep(8000); 
   
         //Search that created group liste or Not
        sendvaluebyxpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/div/div/input", "CES");
        Thread.sleep(8000); 
   
        //Select Options from Copy To Drop-down
        clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/div/ul/li");
         Thread.sleep(8000); 
   
        //Click on Copy To
          clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[3]/div[2]/button");
          Thread.sleep(8000);   	   
          Thread.sleep(8000);   	 
          Thread.sleep(8000);   
          
          //Expand the Groups
          clickByXpath("//tr[1]/td[1]/form/div[1]/a/i");
          Thread.sleep(8000);   	
        
	 }
	 
	 @Test(priority=94, enabled = true)
	 public void IRMA10589_AssetToThisGroup_Save_ComponentGroups() throws IOException, InterruptedException {
		
				
			   Thread.sleep(5000); 
			   
			   //Expand the New group
			      clickByXpath("//tr[5]/td[1]/form/div[1]/a/i");
	     	     Thread.sleep(8000); 
				
				     //Click on Add Asset to this group
			         clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[6]/td/div/div[2]/add-asset/div/button");
				     Thread.sleep(8000); 
				     
				     //Uncheck on 'Show Only this Asset with Component Type' checkbox	
				 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
				  Thread.sleep(8000); 
				  
				  //Uncheck on 'Show Only this Asset with Component Type' checkbox	
				 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
				  Thread.sleep(8000);
				  
				//IRMA10589 - checked the Copy Asset listed   //Click on Asset CheckBox
				  assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[2]/li/div/label/span", "Edit Automation Asset");
					 Thread.sleep(1000); 
				  
					//Click on Save button
				     clickByXpath("//*[@id='submit-button']");
				     Thread.sleep(8000);  
				     Thread.sleep(8000);  
				    
				     
				     
				  
	 }
	 
	 @Test(priority=95, enabled = true)
	 public void IRMA10670_AssetToThisGroup_Save_ComponentGroups() throws IOException, InterruptedException {
		
				
			   Thread.sleep(5000); 
			   
			 //Click on Add Asset to this group
		        clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[6]/td/div/div[2]/add-asset/div/button");
			     Thread.sleep(8000); 
	 	 
				   //Click on Asset CheckBox
				   //  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[1]/li/div/label/span");
				     Thread.sleep(3000);  
				     
				   //Click on Asset CheckBox
				   clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[3]/li/div/label/span");
				Thread.sleep(6000);  
				     
				   //Click on Save button
				     clickByXpath("//*[@id='submit-button']");
				     Thread.sleep(8000);  
				     Thread.sleep(8000);  
				     	 
				     
	 }
	 
	 @Test(priority=96, enabled = true)
	 public void IRMA10537_AssetToThisGroup_Save_ComponentGroups() throws IOException, InterruptedException {
		
				
			   Thread.sleep(5000);
			   
			 //Check the IRMA10629 issue 
	    	   assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[6]/td/div/div[3]/div[2]/button[1]/span", "Edit Automation Asset");
   		      Thread.sleep(1000);
				 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[6]/td/div/div[3]/div[2]/button[2]/span", "Testing Asset - Edit");
				 Thread.sleep(1000);   
			
			   
	 
	 }
	 
	 @Test(priority=97, enabled = true)
	  public void IRMA9446_GroupingExpert_AssetInventoryList() throws IOException, InterruptedException {
		 
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		   
		    //Select Asset Inventory List Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    Reporter.log("Selected Asset Inventory List Sub-module | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    
		    
		    // Enter some text in Search Text-box
		    assertTextXpath("//*[@id='assets_filter']/label/input");
	  sendvaluebyxpath("//*[@id='assets_filter']/label/input", "Testing Asset");
	  Reporter.log("Enter some text in Search Text-box | ");
	  Thread.sleep(8000);
	  Thread.sleep(8000);
	  
		    // Select one of the added Asset in Asset Inventory List
		    assertTextXpath("//*[@id='assets']/tbody/tr/td[2]");
		    clickByXpath("//*[@id='assets']/tbody/tr/td[2]");
	     Reporter.log("Select one of the added Asset in Asset Inventory List | ");
	     Thread.sleep(8000); 
	     
	     // Click on Edit button for listed Asset
	     clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[2]");
	     Thread.sleep(8000);
	     clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/ul/li[1]/a");
	     Reporter.log("Click on Edit button for listed Asset | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    
		    //Click on next Button
		      //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
		      Reporter.log("Select data from Type of Sensitive Data | ");
		      Thread.sleep(8000);
		      //Thread.sleep(8000);
		    
		  
		      //Click on next Button
		      //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
		      Reporter.log("Select data from Type of Sensitive Data | ");
		      Thread.sleep(8000);
		      //Thread.sleep(8000);
		      
		      
		      //Click on next Button
		      //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
		      Reporter.log("Select data from Type of Sensitive Data | ");
		      Thread.sleep(8000);
		      //Thread.sleep(8000);
		      
		      //Click on next Button
		      //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
		      Reporter.log("Select data from Type of Sensitive Data | ");
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		    //Click on Grouping Expert Button
				 clickByXpath("//*[@id='component-groups']/div[1]/div/button");
			      Reporter.log("Select data from Type of Sensitive Data | ");
			      Thread.sleep(8000);
			      Thread.sleep(8000);
		      
			//Asset the Text for Existing groups --IRMA9446 
			  assertEquals("html/body/div[5]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/div[1]/div[1]/span", "DEFAULT");
		     Thread.sleep(8000);
		  Thread.sleep(8000);  
				  
			 //Asset the Text for Existing groups 
	         assertEquals("html/body/div[5]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/div[1]/div[1]/h5/strong", "CES Edit Group");
		     Thread.sleep(8000);
		  Thread.sleep(8000);    
		    
	 }	 
	
	 @Test(priority=98, enabled = true)
	 public void TriangleIcon_ComponentGroups() throws IOException, InterruptedException {
		 
		 
		 Thread.sleep(8000);   
		 
		 //Close the Pop-up
		 clickByXpath("html/body/div[5]/div/div/div[1]/button");
		   Thread.sleep(3000);		 
		 Thread.sleep(8000); 
		 
		 //Click on Updated button
		 clickByXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/button[2]");
		   Thread.sleep(3000);		 
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		 
		 // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	      clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	      Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
	      Thread.sleep(8000); 
	      Thread.sleep(8000);
		   Thread.sleep(8000);
		   Thread.sleep(8000);
		   
		 //Expand the Groups
	       clickByXpath("//tr[1]/td[1]/form/div[1]/a/i");
	       Thread.sleep(8000);    
		   		   
		//TestLink 440 - Testcase 5		   
		   //select the Properties set  
		   clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option			   
		  clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[1]/property-choice/div/div/div/ul/li[1]"); 
	      Thread.sleep(8000);
	      
	      Thread.sleep(8000); 
		   // select the Properties set
		   clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[3]/td[2]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option	  	  			
	      clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[3]/td[2]/div[1]/property-choice/div/div/div/ul/li[1]"); 
	      Thread.sleep(8000);
	 	      
	    //TestLink 440 - Testcase 6
	      //Check on Triangle Icon
	      clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[3]/a[1]/i"); 
	      Thread.sleep(8000);
	      
	      //Check on Triangle Icon
	     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[3]/a[1]/i");
	      Thread.sleep(8000);
		 Thread.sleep(9000);  
	
	    
	 }
	 
	 @Test(priority=99, enabled = true)
	 public void PhysicalLocationDropDown_ComponentGroups() throws IOException, InterruptedException {
		   
		 //TestLink 434 - Testcase 3
		   Thread.sleep(5000);    
		   // select the Properties set	
		     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option	  
		  clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/div/ul/li[2]"); 
	      Thread.sleep(8000);
	      
	      // Click on Discard button
	      clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[2]/a");
		   Thread.sleep(3000); 
	      
		 //TestLink 440 - Testcase 5
		   Thread.sleep(8000); 
		// select the Properties set	
		     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/a/div/b");
		   Thread.sleep(3000);
		   
		 //select the option	  
		  clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/div/ul/li[2]"); 
	      Thread.sleep(8000);
	      		 
	       //TestLink 434 - Testcase 2
	       //Enter Abbreviation
		   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[1]/div/input", "Edits"); 
		   Thread.sleep(8000);
		   
		   //Enter Location
		   sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[2]/div/input", "Auto Locat"); 
		   Thread.sleep(8000);
		   
		   // Click on Save button
		   clickByXpath("//*[@id='submit-button']");
		   Thread.sleep(3000); 	   
		   		 
	 }
	 
	 @Test(priority=100, enabled =true)
	  public void IRMA8978_DeletePhysicalLocation_Componentgroups() throws InterruptedException, IOException {
	  	
	   Thread.sleep(8000); 
	   Thread.sleep(8000); 
		   
	 //Click on Full screen
	    assertTextXpath("//*[@id='fullscreen']/i");
		clickByXpath("//*[@id='fullscreen']/i");
		Thread.sleep(5000);
		Thread.sleep(5000);	 	     
				   
		// Testcase 1
	   //Click on Manage Account Module
		assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
		clickByXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
		Reporter.log("Click on Manage Account Module | ");
		Thread.sleep(8000);
		//Thread.sleep(3000);
		
		  //Click on Physical Location
		assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/a");
		clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/a");
		Reporter.log("Click on Manage Account Module | ");
		Thread.sleep(8000);
		//Thread.sleep(3000);
		
		//Search the Physical Location
		sendvaluebyxpath("//*[@id='physical-locations-list_filter']/label/input", "Edits");
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
		clickByXpath("html/body/div[3]/div/div/div[3]/button[1]");
		Reporter.log("Click on Manage Account Module | ");
		Thread.sleep(8000);
		
		//Click on OK Button
		clickByXpath("html/body/div[3]/div/div/div[2]/button");
		Reporter.log("Click on Manage Account Module | ");
		Thread.sleep(8000);
		Thread.sleep(8000);
		
		//Select the Asset module at sidebar-left
		   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
		   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
		   Reporter.log("Selected the Asset module at sidebar-left | ");
		   Thread.sleep(8000);
		   //Thread.sleep(8000);  
		   
		// Select the Component Groups sub-modules listed in Asset Inventory List	  
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	      clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	      Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
	      Thread.sleep(8000); 
	      Thread.sleep(8000); 
	      Thread.sleep(8000); 
	      
	      //Check the Physical location pop-up - the option get disappears after delete
	      assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[3]/div[1]/property-choice/div/div/a/span", "Choose a Physical Location");
		  Thread.sleep(4000); 
	      
   }
	 
	 @Test(priority=101, enabled = true)
	 public void Clear_ComponentGroups() throws IOException, InterruptedException {
		   
	 
		   Thread.sleep(8000); 
           Thread.sleep(8000); 
		   
		  //Clear the Operation
     	   clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[2]/div[2]/a/i");
		   Thread.sleep(3000);
		
	 }
	 
	 @Test(priority=103, enabled = true)
	 public void IRMA10538_IRMA10563_checkShowonlydefault_AddAssetToThisGroup_ComponentGroups() throws IOException, InterruptedException {
		
			         Thread.sleep(4000);  
			   
			     //Click on Add Asset to this group	      
			      clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[2]/add-asset/div/button");
			     Thread.sleep(8000);  
			     Thread.sleep(8000);   	
			     
			   //Uncheck on 'Show Only this Asset with Component Type' checkbox	
			 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
			  Thread.sleep(8000); 
			  
			  //Check the listed Asset label after Unchecekd
			assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[1]/li/div/label/span", "BackUP Asset");
			 Thread.sleep(1000); 
			 assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[2]/li/div/label/span", "Edit Automation Asset");
			 Thread.sleep(1000); 
			 assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[3]/li/div/label/span", "PreProduction Asset");
			 Thread.sleep(1000); 
			 assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[4]/li/div/label/span", "Testing Asset - Edit");
			 Thread.sleep(1000); 
			  	 
			 //Uncheck on 'Show Only this Asset with Component Type' checkbox	
		 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
		  Thread.sleep(8000); 
			  
		     //IRMA10538 & IRMA10563- Check the listed Asset label when it checked default
			assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[1]/li/div/label/span", "BackUP Asset");
				Thread.sleep(1000); 
				 assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[2]/li/div/label/span", "Edit Automation Asset");
				 Thread.sleep(1000); 
				 assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[3]/li/div/label/span", "Testing Asset - Edit");
				 Thread.sleep(1000);
				 
				//Click on Save button
				  clickByXpath("//*[@id='submit-button']");
				  Thread.sleep(8000);
				  Thread.sleep(3000);
			  
	 }
	
	 @Test(priority=104, enabled = true)
	 public void IRMA10629_AddAssetToThisGroup_Search_ComponentGroups() throws IOException, InterruptedException {
		   
			         Thread.sleep(8000);   	 
			          	
				         //Click on Add Asset to this group
				     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[2]/add-asset/div/button");
				     Thread.sleep(8000);  
				     Thread.sleep(8000);
				     
				   //Search the Assets
				     sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[3]/input", "Testing Asset - Edit"); 
					   Thread.sleep(5000);
					 assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span", "Testing Asset - Edit");
					 Thread.sleep(1000);  
					 clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span");
					 Thread.sleep(5000);
			         
					//Click on Save button
					  clickByXpath("//*[@id='submit-button']");
					  Thread.sleep(8000);
					  Thread.sleep(3000);
					  
					  //Check the IRMA10629 issue 
					  assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[1]/span", "Edit Automation Asset");
						 Thread.sleep(1000); 
						 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[2]/span", "Testing Asset - Edit");
						 Thread.sleep(1000); 
					
	 }
	 
	 @Test(priority=105, enabled = true)
	 public void IRMA10623_AddAssetToThisGroup_Search_ComponentGroups() throws IOException, InterruptedException {
		   
			         Thread.sleep(8000);   	 
			         Thread.sleep(8000);   	
			         
				  
				 //Click on Add Asset to this group
				     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[2]/add-asset/div/button");
				     Thread.sleep(8000);  
				     Thread.sleep(8000);   	
				     
					   //Uncheck on 'Show Only this Asset with Component Type' checkbox	
					 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
					  Thread.sleep(8000); 
				     						     
				     //Search the Assets
				     sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[3]/input", "PreProduction Asset"); 
					   Thread.sleep(5000);
					   
					  //Check the search result 
					   assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span", "PreProduction Asset");
					     Thread.sleep(1000);  
					     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span");
						 Thread.sleep(5000);
						
						//Click on Save button
						  clickByXpath("//*[@id='submit-button']");
						  Thread.sleep(8000);
						  Thread.sleep(3000);
						  
						  //Check the IRMA10629 issue 
				    	   assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[1]/span", "Edit Automation Asset");
		        		 Thread.sleep(1000); 
							 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[2]/span", "PreProduction Asset");
							 Thread.sleep(1000); 
							 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[3]/span", "Testing Asset - Edit");
							 Thread.sleep(1000);   
						 
							//Click on Add Asset to this group
						     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[2]/add-asset/div/button");
						     Thread.sleep(8000);  
						     Thread.sleep(8000);  
						     
						   //Click on Save button
							  clickByXpath("//*[@id='submit-button']");
							  Thread.sleep(8000);
							  Thread.sleep(3000);
							  
							  //Check the IRMA10629 issue 
					    	   assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[1]/span", "Edit Automation Asset");
			        		  Thread.sleep(1000); 
								 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[2]/span", "PreProduction Asset");
								 Thread.sleep(1000); 
								 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[3]/span", "Testing Asset - Edit");
								 Thread.sleep(1000);   
							 				     
	 }	     
			
	 @Test(priority=106, enabled = true)
	 public void IRMA10571_IRMA10466_AddAssetToThisGroup_Search_ComponentGroups() throws IOException, InterruptedException {
		   
			         Thread.sleep(8000);   	 
			         Thread.sleep(8000);   	
			         
			       //Click on Add Asset to this group
				     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[2]/add-asset/div/button");
				     Thread.sleep(8000);  
				     Thread.sleep(8000);   	
				     
					   //Uncheck on 'Show Only this Asset with Component Type' checkbox	
					 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
					  Thread.sleep(8000); 
				     						     
				     //Search the Assets
				     sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[3]/input", "BackUP Asset"); 
					   Thread.sleep(5000);
					   
					  //Check the search result 
					   assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span", "BackUP Asset");
					     Thread.sleep(1000);  
					     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span");
						 Thread.sleep(5000);
						 clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span");
						 Thread.sleep(5000);
					   
				   //Click on clear search
				     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[3]/i[2]");
				     Thread.sleep(8000);
				     
				   //check on 'Show Only this Asset with Component Type' checkbox	
				 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
				  Thread.sleep(8000);
				  
				  //Click on Save button
				  clickByXpath("//*[@id='submit-button']");
				  Thread.sleep(8000);
				  Thread.sleep(3000);
				  
				//Check the IRMA10629 issue 
		    	   assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[1]/span", "Edit Automation Asset");
       		  Thread.sleep(1000); 
					 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[2]/span", "PreProduction Asset");
					 Thread.sleep(1000); 
					 assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[3]/span", "Testing Asset - Edit");
					 Thread.sleep(1000);   
				  
				
	 }
	 
	 @Test(priority=107, enabled = true)
	 public void IRMA10459_Clear_AddAssetToThisGroup_ComponentGroups() throws IOException, InterruptedException {
		
				  Thread.sleep(8000); 	
				  		  
				//Click on Add Asset to this group
				     clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[2]/add-asset/div/button");
				     Thread.sleep(8000);  
				     Thread.sleep(8000);   	
				     
					   //Uncheck on 'Show Only this Asset with Component Type' checkbox	
					 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
					  Thread.sleep(8000); 
				     						     
				     //Search the Assets
				     sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[3]/input", "BackUP Asset"); 
					   Thread.sleep(5000);
					   
					   //Check the search result 
					   assertEquals("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat/li/div/label/span", "BackUP Asset");
					     Thread.sleep(4000);  
					   
				     //Click on clear search
				     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[3]/i[2]");
				     Thread.sleep(4000);
				     		        
				     
	 }
	 
	 @Test(priority=108, enabled = true)
	 public void IRMA10670_AddAssetToThisGroup_Save_ComponentGroups() throws IOException, InterruptedException {
		
				  Thread.sleep(8000); 			         
				   
				  //Click on 'Show Only this Asset with Component Type' checkbox	
				 	 clickByXpath("//span[contains(text(),'Show only Assets with this Component Type')]");
				  Thread.sleep(8000); 
				  
				  //Click on Checkbox
				     //clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[4]/ul/ng-repeat[3]/li/div/label/span");
				     Thread.sleep(8000);
				     				     
				   //Click on Save button
				  clickByXpath("//*[@id='submit-button']");
				  Thread.sleep(8000);
	 }
	 
	 @Test(priority=109, enabled = true)
	 public void SelectNone_GroupWizard_ComponentGroups() throws IOException, InterruptedException {
		
				  Thread.sleep(8000);
				  Thread.sleep(8000);   	   
			    	 
	    //Click on Listed Asset
		assertEquals("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[1]/span", "Edit Automation Asset");
		 Thread.sleep(1000); 
		 clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[1]/span");
		 Thread.sleep(8000);
						  
	      //Click on SelectNone Link 
		 assertEquals("//tr[2]//td[1]//div[1]//div[3]//div[1]//button[2]", "select none");
		 Thread.sleep(3000);  
		 clickByXpath("//tr[2]//td[1]//div[1]//div[3]//div[1]//button[2]");
		 Thread.sleep(8000);
		 
	 }
	 
	 @Test(priority=110, enabled = true)
	 public void SelectAll_GroupWizard_ComponentGroups() throws IOException, InterruptedException {
	
		         Thread.sleep(8000);   	
	//Click on SelectAll Link
	 assertEquals("//tr[2]//td[1]//div[1]//div[3]//div[1]//button[2]", "select all");
	Thread.sleep(3000);  

   //Click on SelectAll Link
	clickByXpath("//tr[2]//td[1]//div[1]//div[3]//div[1]//button[1]");
	Thread.sleep(8000); 
	 }
	 
	
	  
	 @Test(priority=111, enabled = true)
	 public void IRMA10589_CopyTODropdown_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(4000);  
	     	   // //IRMA-10589 need to add 
	     	   ////IRMA-10571 need to add 
	     	////IRMA-10563 need to add 
	    	   
	           //Select Copy To Drop-down	 
	          clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]");
	          Thread.sleep(8000); 
	     
	           //Search that created group liste or Not
	          sendvaluebyxpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/div/div/input", "CES");
	          Thread.sleep(8000); 
	     
	          //Select Options from Copy To Drop-down
	          clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[2]/div/div/ul/li");
	           Thread.sleep(8000); 
	     
	          //Click on Copy To
	            clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[4]/div[3]/div[2]/button");
	            Thread.sleep(8000);   	   
	             
	            
	                     
	 }
	 
	 @Test(priority=112, enabled = true)
	 public void MoveTODropdown_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(5000);
	     	   
	     	//Click on Listed Asset
	   		 clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[2]/button[1]/span");
	   		 Thread.sleep(8000); 
	  		 
	  		 //Select Drop-down
	      	 clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[3]");
	         Thread.sleep(8000); 
	         
	         //Search that created group liste or Not
	          sendvaluebyxpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[3]/div/div/div/input", "CES");
	          Thread.sleep(4000); 
	         
	         //Select Options from Drop-down
	          clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[3]/div/div/ul/li");
	         Thread.sleep(8000); 
	         
	         //Click on Move To 
	         clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[2]/td/div/div[3]/div[4]/div[2]/button");
	         Thread.sleep(8000);   	   
 
			    
	 }
	 
	 @Test(priority=113, enabled = true)
	 public void CopyGroupToEntity_Cancel_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(2000);	     	   
	     	  Thread.sleep(8000);   	   
		       			              	   
	     // Click on Listed groups 		         
		      clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[2]");
		     Thread.sleep(8000);
		     
		 	// Click on CopyGroupToEntity Button	
				clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[3]/copy-group-to-entity-button/span/button");
			     Thread.sleep(8000);
			     
			 // Click on cancel Button
			     clickByXpath("//span[@class='btn btn-link']");
			     Thread.sleep(8000);
		          
	 }
	 
	 @Test(priority=114, enabled = true)
	 public void IRMA9483_CopyGroupToEntity_Copy_GroupingWizard() throws IOException, InterruptedException {
		  
	     	      
		         Thread.sleep(8000);   	 
		             	   
	     	   //---------------------------------9483
		     
		// Click on CopyGroupToEntity Button
				clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[3]/copy-group-to-entity-button/span/button");
			     Thread.sleep(8000);
			     
			 //Click on Listed Entity
			 clickByXpath("html/body/div[4]/div/div/div[2]/div/div/form/div[1]/div[1]/ul/li[1]/span");
		    Thread.sleep(8000);
		    
		 // Click on Copy Button
		     clickByXpath("//*[@id='submit-button']");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		    
	 
	 }
	  @Test(priority=115, enabled = true)
	  public void Navigate_CopyGroupToEntity_GroupingWizard() throws IOException, InterruptedException {
		  
		  Thread.sleep(3000);
		  
		 //Click on the Created new Entity drop-down from Header 
		    	assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span/span[1]");
		    	clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span/span[1]");
		    	//Reporter.log("Click on the Created new Entity drop-down from Header | ");
		    	Thread.sleep(3000);
						   
		    	//Enter Created Entity Name in Search box
		    	assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[1]/input");
		    	sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[1]/input", "Sybrant Test Uma");
		    	//Reporter.log("Enter Created Entity Name in Search box | ");
		    	Thread.sleep(3000);
		    	//Thread.sleep(3000);
		    	
		    	//Select the Searched Entity
				clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[2]/a");
				//Reporter.log("Select the Searched Entity | ");
				Thread.sleep(8000);
				Thread.sleep(8000);
				Thread.sleep(8000);
				
	  }
	  
	 @Test(priority=116, enabled = true)
	 public void Chk_CopyGroupToEntity_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(2000);   
		         Thread.sleep(8000);   	 
		        
	     	   
	     	   //Enter Created Entity Name in Search
		        sendvaluebyxpath("//*[@id='selectComponentGroup']/div/div[2]/search-wizard/div/input", "Automation New Test Group");
		       	Thread.sleep(3000);
		       	
		      //Expand the Groups
			      clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
			     Thread.sleep(8000); 
			     Thread.sleep(4000);  
			     
			   //Expand the Groups
			      clickByXpath("//*[@id='content-wizard']/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
			     Thread.sleep(8000); 
			     Thread.sleep(4000);  
		       
	     	        	   
	 }
	 
	 @Test(priority=117, enabled = true)
	  public void NavigateEntity_GroupingWizard() throws IOException, InterruptedException {
		  
		  Thread.sleep(3000);
		  
			  //Click on the Created new Entity drop-down from Header 
		    	assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span/span[1]");
		    	clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span/span[1]");
		    	//Reporter.log("Click on the Created new Entity drop-down from Header | ");
		    	Thread.sleep(3000);
						   
		    	//Enter Created Entity Name in Search box
		    	assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[1]/input");
		    	sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[1]/input", EntityName);
		    	//Reporter.log("Enter Created Entity Name in Search box | ");
		    	Thread.sleep(3000);
		    	//Thread.sleep(3000);
		    	
		    	//Select the Searched Entity
				clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[2]/a");
				//Reporter.log("Select the Searched Entity | ");
				Thread.sleep(8000);
				Thread.sleep(8000);
				
				
	  }
	 
	 @Test(priority=118, enabled = true)
	 public void IRMA8493_CopyRiskDeterminationInfo_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(8000);
	     	  Thread.sleep(4000);
	     	   
	     	    //Click on CopyRiskDeterminationInfo Button
				clickByXpath("//*[@id='selectComponentGroup']/div/div[1]/div/ul/li[4]/span/button");
			     Thread.sleep(8000);
			     Thread.sleep(4000);
			     
			    //Click on Done Button
			     clickByXpath("//*[@id='content']/ng-form/div/div[2]/div/input");
			     Thread.sleep(8000);
			     Thread.sleep(8000);
			 
	 }
	 
	
	 @Test(priority=119, enabled = false)
	 public void IRMA7838_DropdownComponentGroup_GroupingWizard() throws IOException, InterruptedException {
		  
	     	   Thread.sleep(8000);
	     	  Thread.sleep(8000);   	   
		         	
		         
	     	   
	     	 /*  //Select the Listed Asset
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
			   Thread.sleep(8000);*/
			   	
	 }
	 
	 
}
