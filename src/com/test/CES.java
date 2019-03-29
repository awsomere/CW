package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CES extends WrapperClass {

	 public WebDriver driver;
	 String browser=null;
	 String BussinessOwner = "wohrk9@syb.com";
	 String Asset_Wizard ="CES Asset";
	 String Asset_Form ="CES Form";
	 
	 @Test(priority=1, enabled = false)
	  public void NavigatePage_AssetInventoryList_CES() throws IOException, InterruptedException {
		  
		  Thread.sleep(8000);
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
		   
		    //Select Asset Inventory List Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    Reporter.log("Selected Asset Inventory List Sub-module | ");
		    Thread.sleep(6000);
		    Thread.sleep(6000);
		    
		    //Navigate the Asset Wizard
		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[2]");
		    Thread.sleep(3000);
		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/ul/li[1]/a");
		    Thread.sleep(6000);
		    
	  }  
	 
	 @Test(priority=2, enabled = false)
	   public void PanelTab_AssetWizard_CES() throws IOException, InterruptedException {   
	     
		 Thread.sleep(6000);
		 
		 //Check the Tab
		 assertEquals("//*[@id='tab_selector_0']/a/ul/li[2]/span", "Basics");
		 Thread.sleep(2000);
		 
		//Check the Tab
		 assertEquals("//*[@id='tab_selector_1']/a/ul/li[2]/span", "Component Types");
		 Thread.sleep(2000);
		 
		//Check the Tab
		 assertEquals("//*[@id='tab_selector_2']/a/ul/li[2]/span", "Importance");
		 Thread.sleep(2000);
		 
		//Check the Tab
		 assertEquals("//*[@id='tab_selector_3']/a/ul/li[2]/span", "Details");
		 Thread.sleep(3000);
		 		 
		//Check the Tab
		 assertEquals("//*[@id='tab_selector_4']/a/ul/li[2]/span", "Component Groups");
		 Thread.sleep(2000);
		 
		 
	 }
	 
     @Test(priority=3, enabled = false)
	 public void AssetName_AssetWizard_CES() throws IOException, InterruptedException {   
	     
		 Thread.sleep(2000);
		 
		 //Create New Asset started filling data for Asset   
	      assertTextXpath("//*[@id='asset-name']/div[1]/div[2]/input");
	      sendvaluebyxpath("//*[@id='asset-name']/div[1]/div[2]/input", Asset_Wizard);
	      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
	      Thread.sleep(3000);
	      //Thread.sleep(6000);
	      
	    //Select Value from Drop-down
	      Thread.sleep(2000);
	      selectByXpath_Visibletext("//*[@id='save_as']", "Enabled");  
	      Thread.sleep(6000);
	      
	      //Click on next Button
	      //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	      //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
	      Reporter.log("Select data from Type of Sensitive Data | ");
	      Thread.sleep(6000);
	      //Thread.sleep(6000);
		 
     }
		 
      @Test(priority=4, enabled = false)
	  public void ComponentTypes_AssetWizard_CES() throws IOException, InterruptedException {   
		     
			 Thread.sleep(2000);
			 
			 //Click on Expand all categories Button
		       assertTextXpath("//*[@id='add-media']/div[1]/div[1]/span/a[1]");
		       clickByXpath("//*[@id='add-media']/div[1]/div[1]/span/a[1]");
		       Reporter.log("Clic on Expand all categories button ");
		       Thread.sleep(6000);
		                
		       //Fill data for Media Devices
		       assertTextXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
		       clickByXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
		       Reporter.log("Backup Media Devices | ");
		       Thread.sleep(6000);  
		       
		       //Fill data for Media Devices
		       assertTextXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
		       clickByXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
		       Reporter.log("USB Devices | ");
		       Thread.sleep(6000); 
		       
		     //Click on next Button
		       //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		       //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		       clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
		       Reporter.log("Select data from Type of Sensitive Data | ");
		       Thread.sleep(6000);
		       //Thread.sleep(3000);
		       
		     //Click on next Button
		       //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		       //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
		      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
		       Reporter.log("Select data from Type of Sensitive Data | ");
		       Thread.sleep(6000);
		       //Thread.sleep(3000);
			 
      }
      
	 @Test(priority=5, enabled = false)
	   public void ChkListedDetails_BussinessOwner_CES() throws IOException, InterruptedException {   
	       
	       // Click on Asset bussineess Owner
	       clickByXpath("//*[@id='bo_selector_chosen']/a/div/b");
		   Thread.sleep(5000);
		   
		 //Check the Tab
		  assertEquals("//*[@id='bo_selector_chosen']/div/ul/li[1]", "Edit freeform data...");
		 Thread.sleep(5000);
		 
		//Check the Tab
		  assertEquals("//*[@id='bo_selector_chosen']/div/ul/li[2]", "New Business Owner...");
		 Thread.sleep(5000);
		 
		//Check the Tab
		  assertEquals("//*[@id='bo_selector_chosen']/div/div/input", "");
		 Thread.sleep(5000);
  
	 }
	 
	 @Test(priority=6, enabled = false)
	   public void ChkBussinessOwnerPopup_AssetWizard_CES() throws IOException, InterruptedException {
	      
		 
		 Thread.sleep(8000);
		 
		// Click on Asset bussineess Owner
	       clickByXpath("//*[@id='bo_selector_chosen']/div/ul/li[2]");
		   Thread.sleep(8000);
		   
		 //Check the Tab
	     assertEquals("html/body/div[6]/div/div/div[2]/div/div/label[1]", "Use freeform data:");
    	 Thread.sleep(1000); 
    	 
    	//Check the Tab
		  assertEquals("html/body/div[6]/div/div/div[2]/div/div/label[2]", "Create a new user:");
		 Thread.sleep(1000);
		   
		  // CLick on Use freeform data: Radio Button
		   clickByXpath("html/body/div[6]/div/div/div[2]/div/div/label[1]/input");
		   Thread.sleep(6000);
		   
		  //CLick on Create a New User: Radio Button
		   clickByXpath("html/body/div[6]/div/div/div[2]/div/div/label[2]/input");
		   Thread.sleep(6000);   
	 }
	 
	 
	 @Test(priority=7, enabled = false)
	   public void BusinessOwnerPopup_AssetWizard_CES() throws IOException, InterruptedException {
	      
	      //Details
		 //----------   
		 Thread.sleep(3000); 
	      sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/form/div[1]/div/div/div/div[1]/div[1]/div/input", "First User");
	      Thread.sleep(3000);      
	      sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div/input", BussinessOwner);
	      Thread.sleep(3000);      
	      sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/form/div[1]/div/div/div/div[1]/div[2]/div/input", "Last User");
	      Thread.sleep(3000);
	      sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[2]/div/input", "Job Title");
	      Thread.sleep(3000);      
	      clickByXpath("//*[@id='submit-button']");     
	      Thread.sleep(8000);
	      Thread.sleep(8000);
	          
	      //unclick on Add another asset after saving checkbox
	      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/div/label");
	      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/div/label");     
	      Reporter.log("Add another asset after saving | ");
	      Thread.sleep(8000);
	      
	    //click on Next button
	     //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
	     //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");     
	     clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
	     Reporter.log("Add another asset after saving | ");
	     Thread.sleep(6000);
	     Thread.sleep(6000);
	     
	     
	   }
	 
	 @Test(priority=8, enabled = false)
	   public void ComponentGroups_AssetWizard() throws IOException, InterruptedException {   
	     
	     //Click on Change/Add Groups in Component Groups Tab
	     assertTextXpath("//*[@id='component-groups']/div[2]/div[1]/div[1]/div/button");
	     clickByXpath("//*[@id='component-groups']/div[2]/div[1]/div[1]/div/button");     
	    Reporter.log("Click on 'Change/Add Groups' links in Component Groups Tab");
	    Thread.sleep(6000);
	    Thread.sleep(6000);
	    
	    //Set the Properties
	    clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[1]/span");   
	    Thread.sleep(3000);
	    
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    ArrowDown();
	    Thread.sleep(6000);
	    
	    //Click on Physical Location drop-down
	     assertTextXpath("//*[@id='physicalLocation']");
	     clickByXpath("//*[@id='physicalLocation']"); 
	     Thread.sleep(6000); 
	     
	     //Click on Options from Physical Location drop-down
	     assertTextXpath("//*[@id='physicalLocation']/option[2]");
	     clickByXpath("//*[@id='physicalLocation']/option[2]"); 
	     Thread.sleep(6000); 
	     
	     //Enter the values in Abbreviation Textbox
	     sendvaluebyxpath("//form/div/div[2]/div[2]/div/input", "Aton"); 
	     Thread.sleep(6000); 
	     
	   //Enter the values in Location Name Textbox
	     sendvaluebyxpath("//div[2]/div[2]/input", "Autom Location"); 
	     Thread.sleep(6000);
	     
	     //Click on 'Create' button
	     assertTextXpath("//div[2]/div[2]/div[2]/button");
	     clickByXpath("//div[2]/div[2]/div[2]/button"); 
	     Thread.sleep(6000); 
	    
	     //Click on Another Groups Button in Component Groups Tab
	    assertTextXpath("//assets-form-selected-groups/div/div/div[3]/button");
	    clickByXpath("//assets-form-selected-groups/div/div/div[3]/button");     
	   Reporter.log("Click on Another Groups Button in Component Groups Tab");
	   Thread.sleep(6000);
	   Thread.sleep(6000);
	    
	 //Click on New Group Name in Component Groups Tab
	   assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/input");
	   sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/input", "Automation Backup Media");     
	  Reporter.log("Click on New Group Name in Component Groups Tab");
	  Thread.sleep(6000);
	  
	//Click on New Group Desc in Component Groups Tab
	  assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/textarea");
	  sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/textarea", "Automation Backup Media Desc");     
	 Reporter.log("Click on New Group Desc in Component Groups Tab");
	 Thread.sleep(6000);
	 
	//Click on Create & Select Button in Component Groups Tab
	 assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/div[2]/button[2]");
	 clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/div[2]/button[2]");     
	Reporter.log("Click on Create & Select Button in Component Groups Tab");
	Thread.sleep(8000);
	Thread.sleep(8000);
	 
	//Click on ? Button in Component Groups Tab
	assertTextXpath("//div/div/div[2]/div/div/h5/span/span/i");
	clickByXpath("//div/div/div[2]/div/div/h5/span/span/i");     
	Reporter.log("Click on Create & Select Button in Component Groups Tab");
	Thread.sleep(6000);
	Thread.sleep(3000);

	//Click on Set default link in Component Groups Tab
	assertTextXpath("//div[6]/div/div/div[3]/div/div[2]/button");
	clickByXpath("//div[6]/div/div/div[3]/div/div[2]/button");     
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

	//Click on Grouping Expert.. button
	assertTextXpath("//*[@id='component-groups']/div[1]/div/button");
	clickByXpath("//*[@id='component-groups']/div[1]/div/button");     
	Reporter.log("Click on Create & Select Button in Component Groups Tab");
	Thread.sleep(6000);
	Thread.sleep(8000);

	//Click on Second Component Tab button
	assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[2]");
	clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[2]"); 
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
	      
	    /* // Click on Leave page button in popup
		     assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
		     clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		     Reporter.log("Selected Asset Inventory List Sub-module | ");
		     Thread.sleep(6000); */
	      
	      /*//Click on Continue button
		  assertTextXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a");
		  clickByXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a");
		  Reporter.log("Selected Asset Inventory List Sub-module | ");
	      Thread.sleep(6000);
		  //Thread.sleep(6000);
	*/ 
	      }   
	 
	 @Test(priority=9, enabled =false)
     public void UserList_CES() throws InterruptedException, IOException {
     
		 //Click on Full screen
	 	    assertTextXpath("//*[@id='fullscreen']/i");
			clickByXpath("//*[@id='fullscreen']/i");
			Thread.sleep(5000);
			
			//Click on Manage Account Module
			assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
			clickByXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
			Reporter.log("Click on Manage Account Module | ");
			Thread.sleep(3000);
			//Thread.sleep(3000);
   	  
			//Click on User Management 
			clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[5]/a/span[2]");
			Reporter.log("Click on Manage Account Module | ");
			Thread.sleep(6000);
			clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[5]/ul/li[1]/a");
			Reporter.log("Click on Manage Account Module | ");
			Thread.sleep(6000);
			Thread.sleep(3000);
			
			//Enter the Created user
			sendvaluebyxpath("//*[@id='user-management_filter']/label/input", BussinessOwner); 
			Thread.sleep(6000);
			
			//Selected the Listed the User
			clickByXpath("//*[@id='user-management']/tbody/tr/td[2]");
			Thread.sleep(6000);
			clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[2]/span");
			Thread.sleep(6000);
			Thread.sleep(3000);
			
			ArrowDown();
			ArrowDown();
			ArrowDown();
			ArrowDown();
			ArrowDown();
			Thread.sleep(6000);
			
			//Check the Tab
			//assertEquals("//*[@id='locTable']/tbody/tr[2]/td[2]/select", "No Access");
			 Thread.sleep(3000);
			 Thread.sleep(6000);
			
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
			 Thread.sleep(6000);
			 
			 //Click on cancel Button
			 clickByXpath("//*[@id='pwChange']/div/a");
			 Thread.sleep(6000);
			 Thread.sleep(6000);

     }
	 
 
	 @Test(priority=10, enabled = false)
	  public void AssetInventoryReport_CES() throws InterruptedException {
			  
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  
			//Click on Full screen
		      clickByXpath("//*[@id='fullscreen']/i");
		      Thread.sleep(3000);
		      Thread.sleep(3000);
		 			  	   	  		
		 		 //Select Reports sidebar-left Module
			    try {
			    	assertTextXpath("//li[8]/a/span[2]");
			        clickByXpath("//li[8]/a/span[2]");
			        Reporter.log("Select Report sidebar-left Module | ");
		       }catch(Exception e)
				{
			        e.printStackTrace();
				    Reporter.log("Select Report sidebar-left Module doesn't reached | ");
				}
		       Thread.sleep(3000);
		       Thread.sleep(5000);
				        
			//Click on Asset Inventory Report sub-module
			  clickBylinktext("Asset Inventory Report");
			  Reporter.log("Select Asset Inventory Report sub-module | ");
			  Thread.sleep(3000);	  
			  Thread.sleep(3000);	 
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
			  Thread.sleep(3000);
	  }
	 
	 @Test(priority=11, enabled = false)
	  public void AssetInventoryList_ChkExport() throws IOException, InterruptedException {
		  
		 
		  Thread.sleep(8000);
		     
		   //Select the Asset module at sidebar-left
		   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
		   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
		   Reporter.log("Selected the Asset module at sidebar-left | ");
		   Thread.sleep(6000);
		   //Thread.sleep(6000);  
		   
		    //Select Asset Inventory List Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    Reporter.log("Selected Asset Inventory List Sub-module | ");
		    Thread.sleep(6000);
		    Thread.sleep(6000);
		   	 
		   	 //Click on Export Button
		        clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[2]");  
		       //clickByXpath("//*[@id='assets_filter']/div/a/span");  	
		       Reporter.log("Click on Export Button | ");
		       Thread.sleep(6000);
		       
		       //Click on CSV file to download  
		       assertTextXpath("html/body/ul/li/a");  
		       clickByXpath("html/body/ul/li/a");  	
		       Reporter.log("Click on CSV file to download | ");
		       Thread.sleep(6000);
		      // Thread.sleep(6000);
		       
		       refreshpage();
		       Thread.sleep(8000);
		       Thread.sleep(8000);
		    
		    
	  } 
	 
	  @Test(priority=12, enabled = false)
	  public void AssetBasics_CES() throws IOException, InterruptedException {
			  
	    	Thread.sleep(8000);    
			    
	    	//Navigate the Asset Wizard
		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[2]");
		    Thread.sleep(6000);
		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/ul/li[2]/a");
		    Thread.sleep(6000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
	         
	      //Create New Asset started filling data for Asset   
	      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
	      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", Asset_Form);
	      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
	      Thread.sleep(6000);
	      //Thread.sleep(6000); 
	      
	   }
	      
	      @Test(priority=13, enabled = false)
		  public void ComponentCount_CES() throws IOException, InterruptedException {
			  
		    	Thread.sleep(6000);   
		      
		      ArrowDown();
		      ArrowDown();
		      ArrowDown();
		      ArrowDown();
		      ArrowDown();
		      ArrowDown();
		      ArrowDown();
		      ArrowDown();
		      ArrowDown();
		      Thread.sleep(6000);
		      
		   // Expand the Links
		        assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/span/a[2]");
		       clickByXpath("//*[@id='asset-form']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/span/a[2]");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(8000);
		      //Thread.sleep(6000);
		                  
		     // Expand the Links
		        assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/span/a[1]");
		       clickByXpath("//*[@id='asset-form']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/span/a[1]");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(6000);
		       Thread.sleep(3000);

	       
		       // Fill data for Media Devices
		      // assertTextXpath("//*[@id='devices']/div/div[1]/div[2]/div[2]/div/label");
		       //clickByXpath("//*[@id='devices']/div/div[1]/div[2]/div[2]/div/label");
		       assertTextXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
		       clickByXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(6000);
		       //Thread.sleep(6000);
		  	       
		  	    // Fill data for Media Devices
		       //assertTextXpath("//*[@id='devices']/div/div[2]/div[1]/div[2]/div/label");
		       //clickByXpath("//*[@id='devices']/div/div[2]/div[1]/div[2]/div/label");
		       assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
		       clickByXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(6000);
		       //Thread.sleep(6000);
		       
		       // Fill data for Media Devices
		       assertTextXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
		       clickByXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(6000);
		       //Thread.sleep(6000);
		       
		       //Check the Component Count
		       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(3000);
		       
		     //Check the Component Count
		       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div/div");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(3000);
		       
		     //Check the Component Count
		       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[3]/div/div");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(3000);
		       
		       // Fill data for Media Devices
		       assertTextXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
		       clickByXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(6000);
		       //Thread.sleep(6000);
		       
		     //Check the Component Count
		       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[1]/div/div");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(3000);
		       
		     //Check the Component Count
		       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div/div");
		       Reporter.log("Filled data for Media Devices | ");
		       Thread.sleep(3000);
				       
		       }
		   	
		  @Test(priority=13, enabled = false)
		  public void PhysicalLocation_ComponentGrouping_CES() throws IOException, InterruptedException {
				  
			  
			     Thread.sleep(6000);  
			     
			//Click on the Orange Question Mark icon to the right of Physical Location
			//---------------------------------------------------------------------------
			     //Click on Grouping Expert button
			     assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button");
			     clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button"); 
			     Thread.sleep(6000); 
			     
			   //Check the Modules
			     assertEquals("//assets-form-grouping-expert/div/h4/strong", "Set Component Properties");
			     Reporter.log("Element are Displayed Or Present");
			     Thread.sleep(1000);
			     
			   //Check the Modules
			     assertEquals("//span/h4/strong", "Suggested Group(s)");
			     Thread.sleep(1000);
			     
			   //Check the Modules
			     assertEquals("//assets-form-selected-groups/div/div/div/h4/strong", "Selected Group(s)");
			     Thread.sleep(1000);
			     
			     //Check the Modules
			     assertEquals("//assets-form-suggested-group/div/div[2]/button", "Create a new group instead...");
			     Thread.sleep(1000);
			     
			   //Check the Modules
			     assertEquals("//assets-form-selected-groups/div/div/div[3]/button", "Another Group...");
			     Thread.sleep(1000);
			     
			     //Click on Clear label 
			     clickByXpath("//form/div/div/span"); 
			     Thread.sleep(1000); 			     			     
			     
			    //Click Help Icon for Physical Location
			     assertTextXpath("//h5/span/span/i");
			     clickByXpath("//h5/span/span/i"); 
			     Thread.sleep(6000); 
			     
			     //Click on Physical Location drop-down
			     assertTextXpath("//*[@id='physicalLocation']");
			     clickByXpath("//*[@id='physicalLocation']"); 
			     Thread.sleep(6000); 
			     
			     //Click on Options from Physical Location drop-down
			     assertTextXpath("//*[@id='physicalLocation']/option[2]");
			     clickByXpath("//*[@id='physicalLocation']/option[2]"); 
			     Thread.sleep(6000); 
			     			     
			     //Enter the values in Abbreviation Textbox
			     sendvaluebyxpath("//form/div/div[2]/div[2]/div/input", "Aton"); 
			     Thread.sleep(6000); 
			     
			   //Enter the values in Location Name Textbox
			     sendvaluebyxpath("//div[2]/div[2]/input", "Autom Location"); 
			     Thread.sleep(6000);
			     
			     //Click on 'Create' button
			     assertTextXpath("//div[2]/div[2]/div[2]/button");
			     clickByXpath("//div[2]/div[2]/div[2]/button"); 
			     Thread.sleep(6000); 
			     
			     //Check the Modules
			     clickByXpath("//assets-form-suggested-group/div/div[2]/button");
			     Thread.sleep(5000);
			     
			   //Enter the values in Create a new group Textbox
			     sendvaluebyxpath("//assets-form-create-group/div/div/input", "New Group"); 
			     Thread.sleep(6000);
			     
			   //Enter the values in in Create a new group desc Textbox
			     sendvaluebyxpath("//assets-form-create-group/div/div/textarea", "New Group desc"); 
			     Thread.sleep(6000);
			     
			     //Click on Create and Select button
			     clickByXpath("//assets-form-create-group/div/div/div[2]/button[2]");
			     Thread.sleep(5000);
			     
			     //Click on Help ? Icon
			     clickByXpath("//div[2]/div/div/h5/span/span/i");
			     Thread.sleep(5000);
			     
			     //Click on Close button
			     clickByXpath("//div[4]/div/div/div[3]/div[4]/button");
			     Thread.sleep(5000);
			     
			   //Click on Remove button
			     clickByXpath("//div[2]/div/div[3]/button");
			     Thread.sleep(5000);
			     
			   //Click on Select button 
			     assertEquals("//div[2]/div/div[3]/button", "Select");
			     Thread.sleep(3000);
			     clickByXpath("//div[2]/div/div[3]/button"); 
			     Thread.sleep(3000);
			     
	}
		   
		   @Test(priority=14, enabled = false)
		  public void ChkRecentNameLink_CES() throws IOException, InterruptedException {
				  
			Thread.sleep(6000);  
			
			//Select the All Groups link 
			clickByXpath("//*[@id='grouping_tab_selector_1']/button"); 
		     Thread.sleep(6000);
		   
		     //Click on Name link
		     clickByXpath("//h4/span[2]"); 
		     Thread.sleep(6000);
		     
		   //Click on recent link
		     clickByXpath("//h4/span[1]"); 
		     Thread.sleep(6000);
		     
		   }
		   
		   @Test(priority=15, enabled = false)
			  public void AllGroups_CES() throws IOException, InterruptedException {
					  
				Thread.sleep(6000); 
				//Check the Modules
				assertEquals("//assets-form-create-group/div/h4", "Create a new group:");
				Thread.sleep(4000);
			    
			     //Enter the values in Location Name Textbox
			     sendvaluebyxpath("//assets-form-create-group/div/div/input", "Automation newTest"); 
			     Thread.sleep(6000);
			     
			   //Enter the values in Location Name Textbox
			     sendvaluebyxpath("//assets-form-create-group/div/div/textarea", "Automation Desc"); 
			     Thread.sleep(6000);
			     
			     //Click on Create & Select
			     clickByXpath("//assets-form-create-group/div/div/div[2]/button[2]"); 
			     Thread.sleep(8000); 
			     
			   //Click on Help ? Icon
			     clickByXpath("//div/div/div[2]/div/div/h5/span/span/i");
			     Thread.sleep(5000);
			     
			     //Click on Close button
			     clickByXpath("//div[4]/div/div/div[3]/div[4]/button");
			     Thread.sleep(5000);
			     
			   //Click on Remove button
			     clickByXpath("//div/div/div[2]/div/div[3]/button");
			     Thread.sleep(5000);
			     
			   //Click on Select button 
			     clickByXpath("//assets-form-all-groups/div/div[2]/div[1]/div[1]"); 
			     Thread.sleep(5000);			     
			     assertEquals("//div[2]/div/div[3]/button", "Select");
			     Thread.sleep(3000);
			     clickByXpath("//div[2]/div/div[3]/button"); 
			     Thread.sleep(3000);   
			     			     
			     //Close the pop-up
			     clickByXpath("//div[4]/div/div/div/button"); 
			     Thread.sleep(8000); 
			     Thread.sleep(8000); 
			  
			}
		   		 
		   @Test(priority=17, enabled = false)
		   public void NewGroupIcon_CES() throws IOException, InterruptedException {
					 
			   //Click on HelpIcon
			     clickByXpath("//li/span/span/i"); 
			     Thread.sleep(8000); 
			     
			     //Click on Close button
			     clickByXpath("//body/div[4]/div[4]/button"); 
			     Thread.sleep(8000); 
			     
			     ArrowDown();
				  ArrowDown();
				  ArrowDown();
				  ArrowDown();
				  Thread.sleep(6000); 	     
				       
				      
				       //Uncheck the Add neww Asset checkbox
				        assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
			          clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
			          Thread.sleep(6000);    
			          
			          //Select Value from Drop-down
			          Thread.sleep(2000);
			          selectByXpath_Visibletext("//*[@id='save_as']", "Enabled");  
			          Thread.sleep(6000);
				      
				        // click on Done button and save
				        try {
				        	assertTextXpath("//*[@id='submitButton']/div[2]/button");
				            clickByXpath("//*[@id='submitButton']/div[2]/button"); 
				            Thread.sleep(6000);      
				            Reporter.log("Successfully Asset created | ");
				        }catch(Exception e)
						{
						    e.printStackTrace();
						    Reporter.log("Newly Asset created doesn't work | ");
						}
				        Thread.sleep(6000); 
				        Thread.sleep(6000); 
				        //Thread.sleep(6000); 
				        //Thread.sleep(6000); 
			 
			   
		   }
		   
		   @Test(priority=18, enabled = false)
		   public void EditBtn_AssetInventoryList() throws InterruptedException, IOException
		   {
		  	    Thread.sleep(6000);
		  	    //Thread.sleep(6000);
		  	    
		  	    // Select one of the added Asset in Asset Inventory List
		  	    assertTextXpath("//*[@id='assets']/tbody/tr[1]/td[3]");
		  	    clickByXpath("//*[@id='assets']/tbody/tr[1]/td[3]");
		        Reporter.log("Select one of the added Asset in Asset Inventory List | ");
		        Thread.sleep(6000); 
		  	  
		        // Click on Edit button for listed Asset
		        assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[1]");
		        clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[1]");
		        Reporter.log("Click on Edit button for listed Asset | ");
		  	    Thread.sleep(6000);
		  	    Thread.sleep(6000);
		  	    
		  	  //Create New Asset started filling data for Asset   
		  	      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
		  	      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", "Asset Wizard through Automation - Edit");
		  	      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
		  	      Thread.sleep(6000);
		  	      //Thread.sleep(6000);
		  	    
		  	      //Fill data for Description 
		  	      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/textarea");
		  	      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/textarea", "Description - Edit");
		  	      Reporter.log("Filled data for Description | ");
		  	      Thread.sleep(6000);
		  	      
		  	    //Click on Recovery Time (RTO) drop-down
		  	      clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/select");
		  	      Thread.sleep(3000);
		  	      clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/select/option[3]");
		  	      Thread.sleep(6000);  
		  	      
		  	    //Click on Recovery Point (RPO) drop-down
		  	      clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/select");
		  	      Thread.sleep(3000);
		  	      clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/select/option[4]");
		  	      Thread.sleep(6000);  
		  	      //Thread.sleep(3000);
		          
		  	    
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
		  	       
		  	     //Click on Grouping Expert button
		  	     assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button");
		  	     clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button"); 
		  	     Thread.sleep(8000); 
		  	      
		  	   //Click on Review Grouping for Next Component Type button
		  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
		  	     Thread.sleep(6000);
		  	      
		  	   //Click on Review Grouping for Next Component Type button
		  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
		  	     Thread.sleep(6000);
		  	     
		  	   //Click on Review Grouping for Next Component Type button
		  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
		  	     Thread.sleep(6000);
		  	     
		  	   //Click on Review Grouping for Next Component Type button
		  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
		  	     Thread.sleep(6000);
		  	     
		  	   //Click on Review Grouping for Next Component Type button
		  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
		  	     Thread.sleep(6000);
		  	     
		  	   //Click on Review Grouping for Next Component Type button
		  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
		  	     Thread.sleep(6000);
		  	     
		  	   //Click on Close button
		  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
		  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
		  	     Thread.sleep(6000);     
		  	     Thread.sleep(6000);
		  	     
		  	   //Fill data for Asset Business Owner
		  	     clickByXpath("//*[@id='bo_selector_chosen']/a/div/b");
		  	     Thread.sleep(5000);
		  	     sendvaluebyxpath("//*[@id='bo_selector_chosen']/div/div/input", "Uma M");
		  	     Reporter.log("Filled data for LastName | ");
		  	     Thread.sleep(5000);
		  	     clickByXpath("//*[@id='bo_selector_chosen']/div/ul/li");
		  	     Thread.sleep(8000);
		  	     
		  	     //Uncheck the Add neww Asset checkbox
		          assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
		        clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
		       Thread.sleep(6000);    
		        
		          // click on Done button and save
		          try {
		          	assertTextXpath("//*[@id='submitButton']/div[2]/button[2]");
		              clickByXpath("//*[@id='submitButton']/div[2]/button[2]"); 
		              Thread.sleep(6000);      
		              Reporter.log("Successfully Asset created | ");
		          }catch(Exception e)
		  		{
		  		    e.printStackTrace();
		  		    Reporter.log("Newly Asset created doesn't work | ");
		  		}
		          Thread.sleep(8000); 
		          Thread.sleep(8000); 
		          //Thread.sleep(6000); 
		          //Thread.sleep(6000); 
		   }
		   
		   @Test(priority=19, enabled = false)
		   public void ColumnHeader_AssetInventoryList() throws IOException, InterruptedException {
		 	  
		 	  Thread.sleep(6000);
		 	   
		 	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[1]", "Id");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[2]", "Asset name");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[3]", "Asset description");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[4]", "# records");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[5]", "Owner");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[6]", "Inherited from");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[7]", "Created");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[8]", "Modified");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[9]", "Created By");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);   
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[10]", "Updated By");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);
		  	   
		  	// Check ColumnHeader
		  	   assertEquals("//*[@id='assets']/thead/tr/th[11]", "Status");
		  	   Reporter.log("Check ColumnHeader | ");
		  	   Thread.sleep(3000);   
		   }   	   

		   @Test(priority=20, enabled = true)
		   public void Edit_GroupWizard_ComponentGroups() throws IOException, InterruptedException {
		 	  
		 	  Thread.sleep(8000);
		 	 Thread.sleep(8000);
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
			   
			    //Select Asset Inventory List Sub-module
			    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
			    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
			    Reporter.log("Selected Asset Inventory List Sub-module | ");
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    
		 	//Click on Edit Button
	        assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	        clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a"); 
	        Thread.sleep(8000);  
	        Thread.sleep(8000);
	       
	       //Check GroupName Label
	  	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/thead/tr/th[1]/div[2]/b", "Group Name");
	  	   Reporter.log("Check ColumnHeader | ");
	  	   Thread.sleep(8000); 
	  	   
	    	//Check Add a Portable Media Component Group Label
	  	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button", "  Add a Backup Media Component Group");
	  	   Reporter.log("Check ColumnHeader | ");
	  	   Thread.sleep(3000);
	  	   
	  	   //Check Exit Label
	  	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[2]/span[1]", "Exit");
	  	   Reporter.log("Check ColumnHeader | ");
	  	   Thread.sleep(3000);
	  	   
	  	   //Check Next Step Label
	  	   assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[2]/span[2]", "Next Step");
	  	   Reporter.log("Check ColumnHeader | ");
	  	   Thread.sleep(3000);
	  	   
		   }
		   

		   @Test(priority=21, enabled = true)
		   public void ChkListedFields_ComponentGroups() throws IOException, InterruptedException {
		 	  
		 	  Thread.sleep(6000);
		 	  
		 	//Expand the Groups
	       assertTextXpath("//*[@id='body-content']/div/div/div[2]/ng-form/grouping-wizard/div/table/tbody/tr[1]/td[1]/form/div[1]/a/i");
	       clickByXpath("//form/div[1]/a/i"); 
	       Thread.sleep(6000);   
	       
	       // Check Add Asset to this Group... button
	  	   assertEquals("//add-asset/div/button", "Add Asset to this Group...");
	  	   Reporter.log("Check ColumnHeader | ");
	  	   Thread.sleep(3000);
	  	   clickByXpath("//add-asset/div/button"); 
	  	    Thread.sleep(8000);  
		 	 
		 	 //Search the Textbox for listed Asset
		     sendvaluebyxpath("//div[2]/input", "Upload"); 
		     Thread.sleep(6000);
		     sendvaluebyxpath("//div[2]/input", ""); 
		     Thread.sleep(6000);
		     
		     //Uncheck the Listed Asset
		     clickByXpath("//label/span"); 
		     Thread.sleep(6000);
		     clickByXpath("//*[@id='submit-button']"); 
		     Thread.sleep(8000);
		     
		   //Expand the Groups
	          assertTextXpath("//form/div[1]/a/i");
	        clickByXpath("//form/div[1]/a/i"); 
	       Thread.sleep(6000);  
		   }
	
		   @Test(priority=22, enabled = true)
		   public void AddNewGroup_ComponentGroups() throws IOException, InterruptedException {
			   
		   
			   Thread.sleep(6000);  
			   
	    // Check Add a BackUp Component Group button
	  	  // assertEquals("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button", "Add a Backup Media Component Group");
	  	   Reporter.log("Check ColumnHeader | ");
	  	   Thread.sleep(3000);
	  	   clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button"); 
	  	    Thread.sleep(5000);  
	       
		    //Cancel the Group
	  	  clickByXpath("//tr[5]/td[1]/form/div[3]/a[2]/i"); 
	  	  Thread.sleep(5000);  
	  	
	  	    //Click on Add a BackUp Component Group button
	     	clickByXpath("//*[@id='body-content']/div/div/div[2]/ng-form/div[1]/div/button"); 
  	       Thread.sleep(5000); 
  	       
  	       //Blank Name check and Click Add Tick button
		     clickByXpath("//tr[5]/td[1]/form/div[3]/a[1]/i"); 
		  	  Thread.sleep(8000);  
		  	  
		  	  //Duplicate the Group Name
	  	    sendvaluebyxpath("//tr[5]/td[1]/form/div[2]/input", "Default Group"); 
		     Thread.sleep(8000);
		     
		     //Click Add Tick button
		     clickByXpath("//tr[5]/td[1]/form/div[3]/a[1]/i"); 
		  	  Thread.sleep(5000);  
		  	  
		  	 //Duplicate the Group Name
		  	 sendvaluebyxpath("//tr[5]/td[1]/form/div[2]/input", "CES Group"); 
		  	 Thread.sleep(6000);
		  	 clickByXpath("//tr[5]/td[1]/form/div[3]/a[1]/i"); 
		  	 Thread.sleep(5000);  
		  	 
		  	 //Check the New Button appears 
		  	//assertEquals("//h6/span", "NEW");	  
		  	//Thread.sleep(5000);   
		  	
			 //Edit the new Created Group
			 clickByXpath("//tr[5]/td[1]/form/div[3]/a[1]/i"); 
			 Thread.sleep(8000); 
			 sendvaluebyxpath("//tr[5]/td[1]/form/div[2]/input", "Edit CES Group"); 
		     Thread.sleep(6000);
		     clickByXpath("//tr[5]/td[1]/form/div[3]/a[1]/i"); 
		  	  Thread.sleep(5000);  
		  	  
		  	//Component group Details icon to enter details
		  	  clickByXpath("//tr[5]/td[1]/form/div[3]/a[2]/i"); 
		  	  Thread.sleep(5000); 
		  
		   //Enter the details
		   sendvaluebyxpath("//html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/div[1]/div[1]/div/input", "Edit CES Group -1"); 
		     Thread.sleep(6000);
		     
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
			sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/form/div[1]/div/div/div/div[2]/div[2]/div/input", "2019-01-02"); 
			Thread.sleep(6000);  
		  	  
		  	//Click on Save button	  	  			
		  	clickByXpath("//*[@id='submit-button']"); 
		  	  Thread.sleep(8000);
		  	  
		   }
		   
		   @Test(priority=23, enabled = true)
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
		  	  
		  	//Click on Done button
		  	clickByXpath("//div[2]/div/input"); 
		  	  Thread.sleep(8000);
	  	
		   }
		   
		   @Test(priority=32, enabled = true)
		   public void Search_AssetInventoryList() throws InterruptedException, IOException
		   {
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
