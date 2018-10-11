package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;


public class AssetTestcases extends WrapperClass{
	
  public WebDriver driver;
  String browser=null;
  String Asset_Wizard ="Asset Wizard through Automation";
  String First_Asset= "First Asset";
  String Testing_Asset= "TestingAsset";
  String Disable_sunset= "Disable/sunset Status in Asset";
  String PreProduction="PreProduction Satus in Asset";
   
  @Test(priority=1, enabled = true)
  public void NavigatePage_AssetInventoryList() throws IOException, InterruptedException {
	  
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	     
	   //Select the Asset module at sidebar-left
	   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
	   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
	   Reporter.log("Selected the Asset module at sidebar-left | ");
	   Thread.sleep(3000);
	   //Thread.sleep(3000);  
	   
	    //Select Asset Inventory List Sub-module
	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
	    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
	    Reporter.log("Selected Asset Inventory List Sub-module | ");
	    Thread.sleep(3000);
	    
  }  
  
   @Test(priority=2, enabled = true)
   public void AssetWizard_AssetInventoryList() throws IOException, InterruptedException {
	    
	  //Select Continue button for the Asset Inventory List Page
	    assertTextXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a/span");
	    clickByXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a/span");
	    Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
	    Thread.sleep(5000);
	   	    
      //Create New Asset started filling data for Asset   
      assertTextXpath("//*[@id='asset-name']/div[1]/div[2]/input");
      sendvaluebyxpath("//*[@id='asset-name']/div[1]/div[2]/input", Asset_Wizard);
      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
      Thread.sleep(3000);
      //Thread.sleep(3000);
    
      //Fill data for Description 
      assertTextXpath("//*[@id='asset-name']/div[1]/div[4]/textarea");
      sendvaluebyxpath("//*[@id='asset-name']/div[1]/div[4]/textarea", "Sample Description");
      Reporter.log("Filled data for Description | ");
      Thread.sleep(3000);
      
      //Select data from Type of Sensitive Data 
      clickByXpath("//*[@id='asset-name']/div[2]/div[4]/div/label");
      Reporter.log("Select data from Type of Sensitive Data | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);
      
      //Click on Context ? Icon
      clickByXpath("//*[@id='asset-name']/div[2]/div[1]/span/span/i");
      Reporter.log("Click on Context ? Icon | ");
      Thread.sleep(3000);
      //Thread.sleep(3000); 
      
      //Select Value from Drop-down
      Thread.sleep(2000);
      selectByXpath_Visibletext("//*[@id='save_as']", "Enabled");  
      Thread.sleep(3000);
      
      //Click on next Button
      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      Reporter.log("Select data from Type of Sensitive Data | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);
             
  //  MediaCheckbox
  //-----------------------
      
    //Click on Previous Button
      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[1]/span/strong");
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[1]/span/strong");
      Reporter.log("Click on Previous Button | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);
      
    //Click on next Button
      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      Reporter.log("Select data from Type of Sensitive Data | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);
      
      
    //Fill data for Media Devices
      assertTextXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
      clickByXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
      Reporter.log("Backup Media Devices | ");
      Thread.sleep(3000);  
      
      //Fill data for Media Devices
      assertTextXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
      clickByXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
      Reporter.log("USB Devices | ");
      Thread.sleep(3000);  
      
      //Click on Context ? Icon
      clickByXpath("//*[@id='media-categories-group']/div[1]/div[1]/h4/a/span[2]/span/i");
      Reporter.log("Click on Context ? Icon | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);  
      
      //Fill data for Media Devices
      //assertTextXpath("//*[@id='infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
      clickByXpath("//*[@id='Infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
      //clickByXpath("//*[@id='infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
      Reporter.log("Backup Media Devices | ");
      Thread.sleep(3000);  
      
      //Click on Context ? Icon
      clickByXpath("//*[@id='media-categories-group']/div[2]/div[1]/h4/a/span[2]/span/i");
      Reporter.log("Click on Context ? Icon | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);  
      
      //Fill data for Media Devices
      assertTextXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
      clickByXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
      Reporter.log("Backup Media Devices | ");
      Thread.sleep(3000);  
      
      //Fill data for Media Devices
      assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
      clickByXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
      Reporter.log("Backup Media Devices | ");
      Thread.sleep(3000);  
      
      //Fill data for Media Devices
      assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[2]/div[2]/div/label");
      clickByXpath("//*[@id='End User Devices']/div/div[2]/div[2]/div[2]/div/label");
      Reporter.log("Backup Media Devices | ");
      Thread.sleep(3000);  
      
      ArrowDown();
      ArrowDown();
      ArrowDown();
      ArrowDown();
            
      //Fill data for Media Devices
      assertTextXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
      clickByXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
      Reporter.log("Backup Media Devices | ");
      Thread.sleep(3000);  
      
      //Click on Context ? Icon
      clickByXpath("//*[@id='media-categories-group']/div[3]/div[1]/h4/a/span[2]/span/i");
      Reporter.log("Click on Context ? Icon | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);  
      
      //Click on Context ? Icon
      clickByXpath("//*[@id='media-categories-group']/div[4]/div[1]/h4/a/span[2]/span/i");
      Reporter.log("Click on Context ? Icon | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);  
      
      //Click on next Button
      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      Reporter.log("Select data from Type of Sensitive Data | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);
      
//Importance
//----------------
      
    //Click on Radio Button
      assertTextXpath("//*[@id='importance']/div[1]/div[1]/div[2]/div[4]/label");
      clickByXpath("//*[@id='importance']/div[1]/div[1]/div[2]/div[4]/label");
      Reporter.log("Select data from Type of Sensitive Data | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);    
      
    //Fill data for Number of user
      assertTextXpath("//*[@id='importance']/div[1]/div[2]/div[2]/div/input");
      sendvaluebyxpath("//*[@id='importance']/div[1]/div[2]/div[2]/div/input", "1000");
      Reporter.log("Filled data for Number of user | ");
      Thread.sleep(3000);
      
      //Fill data for Source
      assertTextXpath("//*[@id='importance']/div[1]/div[2]/div[4]/div/input");
      sendvaluebyxpath("//*[@id='importance']/div[1]/div[2]/div[4]/div/input", "2000");
      Reporter.log("Filled data for Source | ");
      Thread.sleep(3000);
    
      ////Fill data for FirstName
      assertTextXpath("//*[@id='importance']/div[3]/div[1]/div[2]/input");
      sendvaluebyxpath("//*[@id='importance']/div[3]/div[1]/div[2]/input", "Uma");
      Reporter.log("Filled data for Share | ");
      Thread.sleep(3000);
    
      //Fill data for LastName 
      assertTextXpath("//*[@id='importance']/div[3]/div[2]/div[2]/input");
      sendvaluebyxpath("//*[@id='importance']/div[3]/div[2]/div[2]/input", "User");
      Reporter.log("Filled data for location | ");
      Thread.sleep(3000);
      
    //Click on next Button
      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
      Reporter.log("Select data from Type of Sensitive Data | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);       
      
      
      //Details
      //--------------
                
      //Fill data for source
      assertTextXpath("//*[@id='details']/div[2]/textarea");
      sendvaluebyxpath("//*[@id='details']/div[2]/textarea", "Source");
      Reporter.log("Filled data for FirstName | ");
      Thread.sleep(3000);
    
      //Fill data for Destination 
      assertTextXpath("//*[@id='details']/div[4]/textarea");
      sendvaluebyxpath("//*[@id='details']/div[4]/textarea", "Destination");
      Reporter.log("Filled data for LastName | ");
      Thread.sleep(3000);
    
      //Fill data for Physical location 
      assertTextXpath("//*[@id='details']/div[6]/textarea");
      sendvaluebyxpath("//*[@id='details']/div[6]/textarea", "Physical Location");
      Reporter.log("Filled data for LastName | ");
      Thread.sleep(3000);
          
      //click on Add another asset after saving
      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/div/label");
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/div/label");     
      Reporter.log("Add another asset after saving | ");
      Thread.sleep(3000);
      
       //Click on Context ? Icon
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/span/span/i");
      Reporter.log("Click on Context ? Icon | ");
      Thread.sleep(3000);
      clickByXpath("html/body/div[6]/div/div/div[3]/button");      
      //Thread.sleep(3000);
         
      //click on Done button and save  
      assertTextXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/button");
      clickByXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/button");     
      Reporter.log("Successfully Asset created | ");
      Thread.sleep(5000);
      Thread.sleep(3000);
  	  //Thread.sleep(3000);
      
      /*//Select Asset Inventory List Sub-module
      assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
      clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
      Reporter.log("Selected Asset Inventory List Sub-module | ");
      Thread.sleep(5000);*/
      
    /* // Click on Leave page button in popup
	     assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	     clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	     Reporter.log("Selected Asset Inventory List Sub-module | ");
	     Thread.sleep(3000); */
      
      /*//Click on Continue button
	  assertTextXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a");
	  clickByXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a");
	  Reporter.log("Selected Asset Inventory List Sub-module | ");
      Thread.sleep(3000);
	  //Thread.sleep(3000);
*/ 
      }   
   
   @Test(priority=3, enabled = true)
   public void PageHearder_AssetInventoryList() throws IOException, InterruptedException {
	   
	   Thread.sleep(5000);
	   
	   // Click on Page header Icon
	   assertTextXpath("//h2/i");
	   Reporter.log("Click on Page header Icon | ");
	   Thread.sleep(1000);
	   mouseHoverByXpath("//h2/i");
	   Thread.sleep(1000);
	   
	   // Click on Page header Title
	   assertEquals("//h2", "Asset Inventory List");
	   Reporter.log("Click on Page header Title | ");
	   Thread.sleep(1000);
	   mouseHoverByXpath("//h2");
	   Thread.sleep(1000);
   }
   
   @Test(priority=4, enabled = true)
   public void PanelBar_AssetInventoryList() throws IOException, InterruptedException {
		   
	   Thread.sleep(3000);
	   // Click on Page breadcrumb
	   assertEquals("//ol", "Assets Asset Inventory List");
	   //assertEquals("//ol", "Assets Asset Inventory List");
	   Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//ol");
	   Thread.sleep(1000); 
	   
   }
   
   @Test(priority=5, enabled = true)
   public void PageLevelHelp_AssetInventoryList() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000);
	   
	   //Click on PageHelp button Icon
	    assertTextXpath("//cw-page-help/button");
        clickByXpath("//cw-page-help/button");
        Reporter.log("Click on PageHelp button Icon | ");
        Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	    // Click OK Button in PageHelp pop-up window
	    assertTextXpath("//div[4]/div/div/div[3]/button");
        clickByXpath("//div[4]/div/div/div[3]/button");
        Reporter.log("Click OK Button in PageHelp pop-up window | ");
        Thread.sleep(1000);
	   // Thread.sleep(3000);
	   
   }
	
   @Test(priority=6, enabled = true)
   public void RiskManagementMap_AssetInventoryList() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000); 
	   
	   // Click on Risk Management Map
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   Reporter.log("Click on Risk Management Map | ");
	   Thread.sleep(3000);
	   clickByXpath("html/body/div[4]/div/div/div[3]/button");
	   Thread.sleep(3000);
   }
   
   @Test(priority=7, enabled = true)
   public void PageHearder_CreateAsset() throws IOException, InterruptedException {
	   
	   Thread.sleep(2000);
	   //Thread.sleep(3000);
	 	
	 	//Select New button for the Asset Inventory List Page
	    //clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]");
	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
	    Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	   
	   // Click on Page header Icon
	   assertTextXpath("//h2/i");
	   Reporter.log("Click on Page header Icon | ");
	   Thread.sleep(1000);
	   mouseHoverByXpath("//h2/i");
	   Thread.sleep(1000);
	   
	  /* // Click on Page header Title
	   assertEquals("//h2", "Create an asset that stores sensitive information");
	   Reporter.log("Click on Page header Title | ");
	   Thread.sleep(1000);
	   mouseHoverByXpath("//h2");
	   Thread.sleep(1000);*/
   }
   
   @Test(priority=8, enabled = true)
   public void PanelBar_CreateAsset() throws IOException, InterruptedException {
		   
	   Thread.sleep(3000);
	   // Click on Page breadcrumb
	   assertEquals("//ol", "Assets Create Asset");
	   Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(1000);
	   mouseHoverByXpath("//ol");
	   Thread.sleep(1000); 
	   
   }
   
   @Test(priority=9, enabled = true)
   public void PageLevelHelp_CreateAsset() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000);
	   
	   //Click on PageHelp button Icon
	    assertTextXpath("//cw-page-help/button");
        clickByXpath("//cw-page-help/button");
        Reporter.log("Click on PageHelp button Icon | ");
        Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	    // Click OK Button in PageHelp pop-up window
	    assertTextXpath("//div[4]/div/div/div[3]/button");
        clickByXpath("//div[4]/div/div/div[3]/button");
        Reporter.log("Click OK Button in PageHelp pop-up window | ");
        Thread.sleep(1000);
	   // Thread.sleep(3000);
	   
   }
	
   @Test(priority=10, enabled = true)
   public void RiskManagementMap_CreateAsset() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000); 
	   
	   // Click on Risk Management Map
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   Reporter.log("Click on Risk Management Map | ");
	   Thread.sleep(3000);
	   clickByXpath("html/body/div[4]/div/div/div[3]/button");
	   Thread.sleep(1000);
   }
   
   @Test(priority=11, enabled = true)
	  public void ContextHelp_CreateAsset() throws IOException, InterruptedException {
		 
	   Thread.sleep(3000); 
	     
	   // Click ? Button
	   assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span/span/i");
	   clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span/span/i");
	   Reporter.log("Click ? Button | ");
	   Thread.sleep(3000);
	          
	   // Click ? Button
	   assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span/span/i");
	   clickByXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span/span/i");
	   Reporter.log("Click ? Button | ");
	   Thread.sleep(3000);
      
 	
     ArrowDown();
    ArrowDown();
    ArrowDown();
    ArrowDown();
    ArrowDown();
    ArrowDown();
    ArrowDown();
    ArrowDown();
    ArrowDown();
    
 // Click ? Button
    assertTextXpath("//*[@id='media-categories-group']/div[1]/div[1]/h4/a/span[2]/span/i");
    clickByXpath("//*[@id='media-categories-group']/div[1]/div[1]/h4/a/span[2]/span/i");
    Reporter.log("Click ? Button | ");
     Thread.sleep(3000);
     
     
  // Click ? Button
	    assertTextXpath("//*[@id='media-categories-group']/div[2]/div[1]/h4/a/span[2]/span/i");
     clickByXpath("//*[@id='media-categories-group']/div[2]/div[1]/h4/a/span[2]/span/i");
     Reporter.log("Click ? Button | ");
      Thread.sleep(3000);
      
      
    // Click ? Button
      assertTextXpath("//*[@id='media-categories-group']/div[3]/div[1]/h4/a/span[2]/span/i");
      clickByXpath("//*[@id='media-categories-group']/div[3]/div[1]/h4/a/span[2]/span/i");
      Reporter.log("Click ? Button | ");
      Thread.sleep(3000);
       
       
       // Click ? Button
	    assertTextXpath("//*[@id='media-categories-group']/div[4]/div[1]/h4/a/span[2]/span/i");
       clickByXpath("//*[@id='media-categories-group']/div[4]/div[1]/h4/a/span[2]/span/i");
       Reporter.log("Click ? Button | ");
        Thread.sleep(3000);
       
        ArrowDown();
        ArrowDown();
              
     // Click on Close button
        assertTextXpath("//*[@id='submitButton']/div[3]/div/span/span/i");
        clickByXpath("//*[@id='submitButton']/div[3]/div/span/span/i");
        Reporter.log("Click on Close button | ");
        Thread.sleep(3000);
        clickByXpath("html/body/div[4]/div/div/div[3]/button");
        Thread.sleep(3000);
        
        
    // Click on Close button
    assertTextXpath("//*[@id='submitButton']/div[1]/span");
    clickByXpath("//*[@id='submitButton']/div[1]/span");
    Reporter.log("Click on Close button | ");
    Thread.sleep(3000);
    //Thread.sleep(2000);
 	
   }
   
   @Test(priority=12, enabled = true)
   public void AssetNameOnly_CreateAsset() throws IOException, InterruptedException {
		  
	Thread.sleep(3000);
	
	//Select New button for the Asset Inventory List Page
 //clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]");
 clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
 Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
 Thread.sleep(3000);
 Thread.sleep(3000);
 
//Create New Asset started filling data for Asset   
 assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
 sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", First_Asset);
 Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
 Thread.sleep(3000);
 //Thread.sleep(3000);
 
 ArrowDown();
 ArrowDown();
 ArrowDown();
 ArrowDown();
 ArrowDown();
 ArrowDown();
 
 
//Uncheck the Add neww Asset checkbox
 assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
Thread.sleep(3000); 
	
//click on Done button and save
 try {
 	assertTextXpath("//*[@id='submitButton']/div[2]/button");
     clickByXpath("//*[@id='submitButton']/div[2]/button"); 
     Thread.sleep(3000);      
     Reporter.log("Successfully Asset created | ");
 }catch(Exception e)
	{
	    e.printStackTrace();
	    Reporter.log("Newly Asset created doesn't work | ");
	}
 Thread.sleep(3000); 
 Thread.sleep(3000); 
	
}
   
   
    @Test(priority=13, enabled = true)
	  public void Testing_AllFields_CreateAsset() throws IOException, InterruptedException {
		  
    	Thread.sleep(3000);    
		    
	  //Select New button for the Asset Inventory List Page
	    //assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]");
	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
	    Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);
         
      //Create New Asset started filling data for Asset   
      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", Testing_Asset);
      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
      Thread.sleep(3000);
      //Thread.sleep(3000);
    
      //Fill data for Description 
      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/textarea");
      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/textarea", "Sample Description");
      Reporter.log("Filled data for Description | ");
      Thread.sleep(3000);
      
      //Select data from Type of Sensitive Data 
      clickByXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div/label");
      Reporter.log("Select data from Type of Sensitive Data | ");
      Thread.sleep(3000);
      //Thread.sleep(3000);
    	              
     //Fill data for Number of user
     assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div/input");
     sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div/input", "1000");
     Reporter.log("Filled data for Number of user | ");
     Thread.sleep(3000);
     //Thread.sleep(3000);
     
     // Important of Asset
     assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/label");
     clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/label");
     Reporter.log("Filled data for Media Devices | ");
     Thread.sleep(3000);
     
     
     // Fill data for FirstName
     	try {
     		assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input");
	            sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input", "New User");
	            Reporter.log("Filled data for FirstName | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Fill data for FirstName doesn't enter | ");
			}
	        Thread.sleep(3000);
	      
	       // Fill data for LastName
	       try {
	    	   assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/input");
	           sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/input", "New name");
	           Reporter.log("Filled data for LastName | ");
	       }catch(Exception e)
		   {
			   e.printStackTrace();
			   Reporter.log("Fill data for LastName doesn't enter | ");
			}
	        Thread.sleep(3000);
	        
	      //Fill data for source
	        assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[2]/textarea");
	        sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[2]/textarea", "Source");
	        Reporter.log("Filled data for FirstName | ");
	        Thread.sleep(3000);
	      
	        //Fill data for Destination 
	        assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[4]/textarea");
	        sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[4]/textarea", "Destination");
	        Reporter.log("Filled data for LastName | ");
	        Thread.sleep(3000);
	      
	        //Fill data for Physical location 
	        assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[6]/textarea");
	        sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[6]/textarea", "Physical Location");
	        Reporter.log("Filled data for LastName | ");
	        Thread.sleep(3000);
	                  
	        // Fill data for Media Devices
	        assertTextXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
	       clickByXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
	       Reporter.log("Filled data for Media Devices | ");
	       Thread.sleep(3000);
	      //Thread.sleep(3000);
	  	     
	  	 // Fill data for Media Devices
	       assertTextXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
	       clickByXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
	       Reporter.log("Filled data for Media Devices | ");
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	       
	       /*ArrowDown();
	       ArrowDown();
	       ArrowDown();
	       ArrowDown();
	       ArrowDown();
	       ArrowDown();
	       ArrowDown();
	       ArrowDown();
	       	    
	       Thread.sleep(2000);*/
	       
	      // Fill data for Media Devices	                        
	    // assertTextXpath("//*[@id='infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
	    // clickByXpath("//*[@id='infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
	     assertTextXpath("//*[@id='Infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
	    clickByXpath("//*[@id='Infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
	       Reporter.log("Filled data for Media Devices | ");
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
       
	       // Fill data for Media Devices
	       // assertTextXpath("//*[@id='devices']/div/div[1]/div[2]/div[2]/div/label");
	       //clickByXpath("//*[@id='devices']/div/div[1]/div[2]/div[2]/div/label");
	       assertTextXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
	       clickByXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
	       Reporter.log("Filled data for Media Devices | ");
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	  	       
	  	    // Fill data for Media Devices
	       //assertTextXpath("//*[@id='devices']/div/div[2]/div[1]/div[2]/div/label");
	      // clickByXpath("//*[@id='devices']/div/div[2]/div[1]/div[2]/div/label");
	       assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
	       clickByXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
	       Reporter.log("Filled data for Media Devices | ");
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	       
	       // Fill data for Media Devices
	       assertTextXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
	       clickByXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
	       Reporter.log("Filled data for Media Devices | ");
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	       
	       ArrowDown();
	       ArrowDown();
	       ArrowDown();
	       ArrowDown();
	      
	       //Uncheck the Add neww Asset checkbox
	        assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
          clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
          Thread.sleep(3000);    
          
          //Select Value from Drop-down
          Thread.sleep(2000);
          selectByXpath_Visibletext("//*[@id='save_as']", "Enabled");  
          Thread.sleep(3000);
	      
	        // click on Done button and save
	        try {
	        	assertTextXpath("//*[@id='submitButton']/div[2]/button");
	            clickByXpath("//*[@id='submitButton']/div[2]/button"); 
	            Thread.sleep(3000);      
	            Reporter.log("Successfully Asset created | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Newly Asset created doesn't work | ");
			}
	        Thread.sleep(3000); 
	        Thread.sleep(3000); 
	        //Thread.sleep(3000); 
	        //Thread.sleep(3000); 
	        
	  }
    
    @Test(priority=14, enabled = true)
	  public void Disable_sunset_Status_CreateAsset() throws IOException, InterruptedException {
		  
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    //Thread.sleep(3000);
		   	      
		    //Select New button for the Asset Inventory List Page
		    //clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]");
		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
		    Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
	         
	      //Create New Asset started filling data for Asset   
	      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
	      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", Disable_sunset);
	      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
	      Thread.sleep(3000);
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
	    
	      		        
		        //Uncheck the Add neww Asset checkbox
		        assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
	          clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
	          Thread.sleep(3000);    
	          
	          //Select Value from Drop-down
	          Thread.sleep(2000);
	          selectByXpath_Visibletext("//*[@id='save_as']", "Disabled/Sunset");  
	          Thread.sleep(3000);
		      
		        // click on Done button and save
		        try {
		        	assertTextXpath("//*[@id='submitButton']/div[2]/button");
		            clickByXpath("//*[@id='submitButton']/div[2]/button"); 
		            Thread.sleep(3000);      
		            Reporter.log("Successfully Asset created | ");
		        }catch(Exception e)
				{
				    e.printStackTrace();
				    Reporter.log("Newly Asset created doesn't work | ");
				}
		        Thread.sleep(3000); 
		        Thread.sleep(3000); 
		        //Thread.sleep(3000); 
		        //Thread.sleep(3000); 
	        
	  }
    
    @Test(priority=15, enabled = true)
	  public void Prepoduction_Staus_CreateAsset() throws IOException, InterruptedException {
		  
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    //Thread.sleep(3000);
		   	      
		    //Select New button for the Asset Inventory List Page
		    //assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]");
		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
		    Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
	         
	      //Create New Asset started filling data for Asset   
	      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
	      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", PreProduction);
	      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
	      Thread.sleep(3000);
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
		        
		        //Uncheck the Add neww Asset checkbox
		        assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
	          clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
	          Thread.sleep(3000);    
	          
	          //Select Value from Drop-down
	          Thread.sleep(2000);
	          selectByXpath_Visibletext("//*[@id='save_as']", "Pre-Production");  
	          Thread.sleep(3000);
		      
		        // click on Done button and save
		        try {
		        	assertTextXpath("//*[@id='submitButton']/div[2]/button");
		            clickByXpath("//*[@id='submitButton']/div[2]/button"); 
		            Thread.sleep(3000);      
		            Reporter.log("Successfully Asset created | ");
		        }catch(Exception e)
				{
				    e.printStackTrace();
				    Reporter.log("Newly Asset created doesn't work | ");
				}
		        Thread.sleep(3000); 
		        Thread.sleep(3000); 
		        //Thread.sleep(3000); 
		        //Thread.sleep(3000); 
	        
	  }
   
 
 @Test(priority=16, enabled = true)
 public void EditBtn_AssetInventoryList() throws InterruptedException, IOException
 {
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	    // Select one of the added Asset in Asset Inventory List
	    assertTextXpath("//*[@id='assets']/tbody/tr[1]/td[2]");
	    clickByXpath("//*[@id='assets']/tbody/tr[1]/td[2]");
      Reporter.log("Select one of the added Asset in Asset Inventory List | ");
      Thread.sleep(3000); 
	  
      // Click on Edit button for listed Asset
     clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[1]");
      //clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[2]");
      Reporter.log("Click on Edit button for listed Asset | ");
	    Thread.sleep(3000);
     
	 // Fill data for FirstName
        try {
        	assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input");
            sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/input", "Edit User");
            Reporter.log("Filled data for FirstName | ");
        }catch(Exception e)
		{
		    e.printStackTrace();
		    Reporter.log("Fill data for FirstName doesn't enter | ");
		}
        Thread.sleep(3000);
      
       // Fill data for LastName
       try {
    	   assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/input");
           sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/input", "Edit name");
           Reporter.log("Filled data for LastName | ");
       }catch(Exception e)
	   {
		   e.printStackTrace();
		   Reporter.log("Fill data for LastName doesn't enter | ");
		}
        Thread.sleep(3000);
        
        //Uncheck the Add neww Asset checkbox
        assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
      clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
      Thread.sleep(3000);    
      
        // click on Done button and save
        try {
        	assertTextXpath("//*[@id='submitButton']/div[2]/button[2]");
            clickByXpath("//*[@id='submitButton']/div[2]/button[2]"); 
            Thread.sleep(3000);      
            Reporter.log("Successfully Asset created | ");
        }catch(Exception e)
		{
		    e.printStackTrace();
		    Reporter.log("Newly Asset created doesn't work | ");
		}
        Thread.sleep(3000); 
        Thread.sleep(3000); 
        //Thread.sleep(3000); 
        //Thread.sleep(3000); 
 }
 
 @Test(priority=17, enabled = true)
 public void DeleteBtn_AssetInventoryList() throws InterruptedException, IOException
 {
	    
	    // Select one of the added Asset in Asset Inventory List
	    assertTextXpath("//*[@id='assets']/tbody/tr[1]/td[2]");
	    clickByXpath("//*[@id='assets']/tbody/tr[1]/td[2]");
      Reporter.log("Select one of the added Asset in Asset Inventory List | ");
      Thread.sleep(3000); 
      //Thread.sleep(3000); 
      
      // Click on Delete button for listed Asset
      //clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[3]");
      clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[1]");
      Reporter.log("Click on Delete button for listed Asset | ");
	    Thread.sleep(3000);
	    
	    //Click on Cancel button 
	    assertTextXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[2]");
      clickByXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[2]");
      Reporter.log("Click on Cancel button | ");
	    Thread.sleep(3000);
	    //Thread.sleep(3000);
	   	    
	   // Click on Delete button for listed Asset
	  // clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[3]");
      clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[1]");
      Reporter.log("Click on Delete button for listed Asset | ");
	    Thread.sleep(3000);
	    
	    // Click on Delete Button in warning Pop-up
	    assertTextXpath("//div[4]/div[3]/button");
        clickByXpath("//div[4]/div[3]/button");
        Reporter.log("Click on Delete Button in warning Pop-up | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);
 }
 
 @Test(priority=18, enabled = false)
 public void AssetEntryMethod_dropdown_AssetInventoryList() throws InterruptedException, IOException
 {
	// Click on AssetEntryMethod_dropdown
	 clickByXpath("//*[@id='entry_method']");
	 Thread.sleep(1000);
     clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/cw-drop-list/div/ul/li[1]/a");
     Reporter.log("Click on AssetEntryMethod_dropdown | ");
     Thread.sleep(3000);
     Thread.sleep(3000);
     
      // Click on AssetEntryMethod_dropdown
  	  assertTextXpath("html/body/div[4]/div/div/div[1]/button");
       clickByXpath("html/body/div[4]/div/div/div[1]/button");
       Reporter.log("Click on AssetEntryMethod_dropdown | ");
       Thread.sleep(3000);
       Thread.sleep(3000);
       
    // Click on AssetEntryMethod_dropdown
       clickByXpath("//*[@id='entry_method']");
  	Thread.sleep(1000);
       clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/cw-drop-list/div/ul/li[2]/a");
       Reporter.log("Click on AssetEntryMethod_dropdown | ");
       Thread.sleep(3000);
       Thread.sleep(3000);
       
    // Click on AssetEntryMethod_dropdown
  	 assertTextXpath("//*[@id='page-content']/div[1]/div/ol/li[1]/a");
       clickByXpath("//*[@id='page-content']/div[1]/div/ol/li[1]/a");
       Reporter.log("Click on AssetEntryMethod_dropdown | ");
       Thread.sleep(3000);
       Thread.sleep(3000);
       

 }
 @Test(priority=19, enabled = true)
 public void ExportBtn_AssetInventoryList() throws InterruptedException, IOException
 {
	
	  //Click on Export Button
	     clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[2]");  
	    //clickByXpath("//*[@id='assets_filter']/div/a/span");  	
	    Reporter.log("Click on Export Button | ");
	    Thread.sleep(3000);
	    
	    //Click on CSV file to download  
	    assertTextXpath("html/body/ul/li/a");  
	    clickByXpath("html/body/ul/li/a");  	
	    Reporter.log("Click on CSV file to download | ");
	    Thread.sleep(3000);
	   // Thread.sleep(3000);
	    
	    //Click on Export Button
	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[2]");  
	    //clickByXpath("//*[@id='assets_filter']/div/a/span");  	
	    Reporter.log("Click on Export Button | ");
	    Thread.sleep(3000);
 }
 
 @Test(priority=20, enabled = true)
 public void Search_AssetInventoryList() throws InterruptedException, IOException
 {
	    
	    // Enter some text in Search Text-box
	    assertTextXpath("//*[@id='assets_filter']/label/input");
      sendvaluebyxpath("//*[@id='assets_filter']/label/input", "New");
      Reporter.log("Enter some text in Search Text-box | ");
      Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	 // Clear the Enter some text in Search Text-box
	    assertTextXpath("//*[@id='assets_filter']/label/input");
      sendvaluebyxpath("//*[@id='assets_filter']/label/input", "");
      Reporter.log("Clear the Enter some text in Search Text-box | ");
      enter();
      Thread.sleep(3000);
	    //Thread.sleep(3000);
      
 }
 
 @Test( priority=21, enabled = true)
 public void Sorting_AssetInventoryList() throws InterruptedException, IOException {
 
	  	    
	    // Click on Asset Name column Header to sort for Ascending order
	    clickByXpath("//*[@id='assets']/thead/tr/th[2]");
	    Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
	    Thread.sleep(3000);	
	    sortascen("//*[@id='assets']/tbody/tr[*]/td[2]"); //Get the Column count and values
	    Thread.sleep(3000);			    
	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
	    
	    // Click on Asset Name column Header to sort for Descending order
	    clickByXpath("//*[@id='assets']/thead/tr/th[2]");
	    Reporter.log("Click on Asset Name column Header to sort for Descending order  | ");
	    Thread.sleep(3000);	
	    sortdesc("//*[@id='assets']/tbody/tr[*]/td[2]"); //Get the Column count and values
	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	    
	    // Click on Asset Description column Header to sort for Ascending order
	    clickByXpath("//*[@id='assets']/thead/tr/th[3]");
	    Reporter.log("Click on Asset Description column Header to sort for Ascending order  | ");
	    Thread.sleep(3000);
	    sortascen("//*[@id='assets']/tbody/tr[*]/td[3]"); //Get the Column count and values
	    Thread.sleep(3000);			    
	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
	    
	    // Click on Asset Description column Header to sort for Descending order
	    clickByXpath("//*[@id='assets']/thead/tr/th[3]");
	    Reporter.log("Click on Asset Description column Header to sort for Descending order  | ");
	    Thread.sleep(3000);	
	    sortdesc("//*[@id='assets']/tbody/tr[*]/td[3]"); //Get the Column count and values
	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
	    Thread.sleep(3000);
	    Thread.sleep(3000);   
	    
	    }
 
	    
 @Test(priority=22, enabled = false)
 public void ContextHelp_AssetInventoryList() throws InterruptedException, IOException
 {      
      // Click ? Button
	    assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/cw-info/span/i");
      clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/cw-info/span/i");
      Reporter.log("Click ? Button | ");
      Thread.sleep(3000);
      
      // Click on Close button in ? Pop-up
      assertTextXpath("html/body/div[4]/div/div/div[3]/button");
      clickByXpath("html/body/div[4]/div/div/div[3]/button");
      Reporter.log("Click on Close button in ? Pop-up | ");
      Thread.sleep(3000);      
	    
 }
 
 
 
 @Test(priority=23, enabled = true)
 public void NavigationPage_AssetInventoryImport() throws InterruptedException, IOException
	   {
	  
	        Thread.sleep(2000);
	       //Thread.sleep(3000);	   
		  
		  //Click on Asset Inventory Import sub-modules	 
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[2]/a");
		  Reporter.log("Clicked on Asset Inventory Import sub-modules | ");
		  Thread.sleep(3000);
		 // Thread.sleep(3000);
		  
	   }
 
 @Test(priority=24, enabled = true)
 public void PageHearder_AssetInventoryImport() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000);
	   
	   // Click on Page header Icon
	   assertTextXpath("//h2/i");
	   Reporter.log("Click on Page header Icon | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//h2/i");
	   Thread.sleep(3000);
	   
	   /*// Click on Page header Title
	   assertEquals("//h2", "Asset Inventory Import ");
	   Reporter.log("Click on Page header Title | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//h2");
	   Thread.sleep(3000);*/
 }
 
 @Test(priority=25, enabled = true)
 public void PanelBar_AssetInventoryImport() throws IOException, InterruptedException {
		   
	   Thread.sleep(3000);
	   // Click on Page breadcrumb
	   assertEquals("//ol", "Assets Asset Inventory Import");
	   Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//ol");
	   Thread.sleep(2000); 
	   
 }
 
 @Test(priority=26, enabled = true)
 public void PageLevelHelp_AssetInventoryImport() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000);
	   
	   //Click on PageHelp button Icon
	    assertTextXpath("//cw-page-help/button");
     clickByXpath("//cw-page-help/button");
     Reporter.log("Click on PageHelp button Icon | ");
     Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	    // Click OK Button in PageHelp pop-up window
	    assertTextXpath("//div[4]/div/div/div[3]/button");
     clickByXpath("//div[4]/div/div/div[3]/button");
     Reporter.log("Click OK Button in PageHelp pop-up window | ");
     Thread.sleep(3000);
	   // Thread.sleep(3000);
	   
 }
	
 @Test(priority=27, enabled = true)
 public void RiskManagementMap_AssetInventoryImport() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000); 
	   
	   // Click on Risk Management Map
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   Reporter.log("Click on Risk Management Map | ");
	   Thread.sleep(3000);
	   clickByXpath("html/body/div[4]/div/div/div[3]/button");
	   Thread.sleep(3000);
 }
	
 @Test(priority=28, enabled = true)
 public void Download_AssetInventoryImport() throws IOException, InterruptedException {
	 
		  //Click on Download Asset Inventory Import Templates
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ng-transclude/a");
		  Reporter.log("Click on Download Asset Inventory Import Templates | ");
		  //Thread.sleep(3000);
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
 }
 
 @Test(priority=29, enabled = true)
 public void EmptyImport_AssetInventoryImport() throws InterruptedException, IOException
 {
	 Thread.sleep(3000);
	 
	 // Click on Import Button
     assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
     clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
     Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	Thread.sleep(3000);
	
	//click on Browse Button
    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
    Reporter.log("clicked on Browser Button | ");
    Thread.sleep(3000);
 
    // Using AutoIT
    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload6.exe"); //Uploading xls file using AutoIT
    Reporter.log("Given Filepath of Xls file | ");
    Thread.sleep(3000);
    	     
    // Click on Import Button
    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
    Thread.sleep(3000);
    Thread.sleep(3000);
	
 }
 @Test(priority=30, enabled = true)
 public void InValidImportFiles_AssetInventoryImport() throws InterruptedException, IOException
 {
	 Thread.sleep(3000);
	 
	 //click on Browse Button
      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
      clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
      Reporter.log("clicked on Browser Button | ");
      Thread.sleep(3000);
   
      // Using AutoIT
      Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload2.exe"); //Uploading xls file using AutoIT
      Reporter.log("Given Filepath of Xls file | ");
      Thread.sleep(3000);
      	     
      // Click on Import Button
      assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
      clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
      Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
      Thread.sleep(3000);
      Thread.sleep(3000);
	    
      Thread.sleep(2000);   
      //click on Browse Button
      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	  clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	  Reporter.log("clicked on Browser Button | ");
	  Thread.sleep(3000);
	   
	  // Using AutoIT
	  Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload1.exe"); //Uploading xls file using AutoIT
	  Reporter.log("Given Filepath of Xls file | ");
	  Thread.sleep(3000);
	      	     
	  // Click on Import Button
	  assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	  clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	  Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
      Thread.sleep(3000);
      Thread.sleep(3000);
		
      //click on Browse Button
      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
      clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
      Reporter.log("clicked on Browser Button | ");
      Thread.sleep(3000);
   
      // Using AutoIT
      Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
      Reporter.log("Given Filepath of Xls file | ");
      Thread.sleep(3000);
      	     
      // Click on Import Button
      assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
      clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
      Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
      Thread.sleep(3000);
      Thread.sleep(3000);
	    
      Thread.sleep(2000);   
      //click on Browse Button
      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	  clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	  Reporter.log("clicked on Browser Button | ");
	  Thread.sleep(3000);
	   
	  // Using AutoIT
	  Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload5.exe"); //Uploading xls file using AutoIT
	  Reporter.log("Given Filepath of Xls file | ");
	  Thread.sleep(3000);
	      	     
	  // Click on Import Button
	  assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	  clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	  Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
      Thread.sleep(3000);
      Thread.sleep(3000);
		    
	
 }
 
 @Test(priority=31, enabled = true)
 public void ValidImport_AssetInventoryImport() throws InterruptedException, IOException
 {
	  
	    Thread.sleep(2000);   
      //click on Browse Button
      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
      clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
      Reporter.log("clicked on Browser Button | ");
      Thread.sleep(3000);
   
      // Using AutoIT
      Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload8.exe"); //Uploading xls file using AutoIT
      Reporter.log("Given Filepath of Xls file | ");
      Thread.sleep(3000);
      	     
      // Click on Import Button
      assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
      clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
      Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload7.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000); 
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload9.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload10.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload11.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload12.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload13.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload14.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload15.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload16.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload17.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);   	    
	    
	    Thread.sleep(2000);   
	    //click on Browse Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
	    Reporter.log("clicked on Browser Button | ");
	    Thread.sleep(3000);
	   
	    // Using AutoIT
	    Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload.exe"); //Uploading xls file using AutoIT
	    Reporter.log("Given Filepath of Xls file | ");
	    Thread.sleep(3000);
	      	     
	    // Click on Import Button
	    assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
	    clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
	    Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);  
	    
	    //Click on Asset List link
	    assertTextLink("Asset List");
	    clickBylinktext("Asset List");
	    Reporter.log("Click on Asset List link | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);
	    //Thread.sleep(3000);	    
	 
	   }
 
 @Test(priority=32, enabled = true)
 public void AssetStatus_AssetInventoryList() throws InterruptedException, IOException
 { 
	 // Enter some text in Search Text-box
	 assertTextXpath("//*[@id='assets_filter']/label/input");
     sendvaluebyxpath("//*[@id='assets_filter']/label/input", "Pager");
     Reporter.log("Enter some text in Search Text-box | ");
     Thread.sleep(3000);
	   
      // Click on PagerMedia to change Status 
	    assertTextXpath("//*[@id='assets']/tbody/tr/td[2]");
	    clickByXpath("//*[@id='assets']/tbody/tr/td[2]");
	    Reporter.log("Click on PagerMedia to change Status  | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);     
	    
	    // Click on Asset Status Drop-down
	    //assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/cw-btn-group/div/button[2]");
	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/cw-btn-group/div/button[2]");
	    Reporter.log(" Click on Asset Status Drop-down  | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000); 
	    
	   // Select Enabled status from Asset Status Drop-down
	   // assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/cw-btn-group/div/ul/li[2]/a");
	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/cw-btn-group/div/ul/li[2]/a");
	    Reporter.log(" Select Enabled status from Asset Status Drop-down  | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000); 
	    
 }
 
 @Test(priority=33, enabled = true)
 public void NavigationPage_MediaAssetGroups() throws InterruptedException, IOException
 {     
	     Thread.sleep(2000);  
	     //Thread.sleep(3000);
	     //Thread.sleep(3000);
		 //Thread.sleep(3000);	 
	     
	    // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
      clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
      Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
	    Thread.sleep(3000); 
 }
 
 @Test(priority=34, enabled = true)
 public void Edit_MediaAssetGroups() throws InterruptedException, IOException
 
 {    

	 // Select the Edit button of BackUp Media in Media/Asset Groups page
	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
      clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
      Reporter.log("Select the Edit button of BackUp Media in Media/Asset Groups page | ");
	    Thread.sleep(3000);
	   
	    // Enter Label in Edit Media/Asset Groups
	    assertTextXpath("//td[3]/input");
	    sendvaluebyxpath("//td[3]/input", "sample Backup label");
	    Reporter.log("Enter label in Edit Media/Asset Groups | ");
	    Thread.sleep(3000); 
	   
	    // Select the Risk Analysis for Edit Media/Asset Groups
	    selectByXpath_Visibletext("//select[@id='']", "Uma M");
	    Reporter.log("Select the Risk Analysis for Edit Media/Asset Groups | ");
	    Thread.sleep(3000); 
	   
	    // Select the added calendar for Edit Media/Asset Groups
	    sendvaluebyxpath("//td[5]/input", "01/02/2018");
	    Reporter.log("Select the added calendar for Edit Media/Asset Groups | ");
	    Thread.sleep(3000); 
	   
	    /*// Select the drag Asset and drop into INBOX
	    dragAnddropByXpath("//li/div[2]", "//*[@id='newBox']");
	    Reporter.log("Select the drag Asset and drop into INBOX | ");
	    Thread.sleep(1000); 
	    clickByXpath("//div/div[3]/div/div");
	    Thread.sleep(3000);
	    Thread.sleep(2000);   
	    	   
	    //Move this Item Window appears and click on Proceed button
	    assertTextXpath("//div[3]/button");
	    clickByXpath("//div[3]/button");
	    Reporter.log("Move this Item Window appears and click on Proceed button | ");
	    Thread.sleep(3000); 
	    //Thread.sleep(3000); 
*/   		 	    
	    //Click on Save Button
	    assertTextXpath("//*[@id='save']");
      clickByXpath("//*[@id='save']");
      Reporter.log("Click on Save Button | ");
	    Thread.sleep(3000); 
	   Thread.sleep(2000);
	   
 }
 
   @Test(priority=35, enabled = true)
   public void Delete_MediaAssetGroups() throws InterruptedException, IOException
    
     {  
	   
	    // Delete the Asset in Media/Asset Groups
	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
	    clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
	    Reporter.log("Delete the Asset in Media/Asset Groups | ");
	    Thread.sleep(3000); 
	   
	    //warning pop-up get appears and click on cancel button
	    assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	    clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	    Reporter.log("warning pop-up get appears and click on cancel button | ");
	    Thread.sleep(3000); 
	    Thread.sleep(2000); 	 
	   
     } 
 
 @Test(priority=36, enabled = true)
 public void PageHearder_MediaAsset() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000);
	   
	   // Click on Page header Icon
	   assertTextXpath("//h2/i");
	   Reporter.log("Click on Page header Icon | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//h2/i");
	   Thread.sleep(3000);
	   
	   // Click on Page header Title
	   assertEquals("//h2", "Media/Asset Groups");
	   Reporter.log("Click on Page header Title | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//h2");
	   Thread.sleep(3000);
 }
 
 @Test(priority=37, enabled = true)
 public void PanelBar_MediaAsset() throws IOException, InterruptedException {
		   
	   Thread.sleep(3000);
	   // Click on Page breadcrumb
	   assertEquals("//ol", "Assets Media/Asset Groups");
	   Reporter.log("Click on Page breadcrumb | ");
	   Thread.sleep(2000);
	   mouseHoverByXpath("//ol");
	   Thread.sleep(2000); 
	   
 }
 
 @Test(priority=38, enabled = true)
 public void PageLevelHelp_MediaAsset() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000);
	   
	   //Click on PageHelp button Icon
	    assertTextXpath("//cw-page-help/button");
     clickByXpath("//cw-page-help/button");
     Reporter.log("Click on PageHelp button Icon | ");
     Thread.sleep(3000);
	    //Thread.sleep(3000);
	    
	    // Click OK Button in PageHelp pop-up window
	    assertTextXpath("//div[4]/div/div/div[3]/button");
     clickByXpath("//div[4]/div/div/div[3]/button");
     Reporter.log("Click OK Button in PageHelp pop-up window | ");
     Thread.sleep(3000);
	   // Thread.sleep(3000);
	   
 }
	
 @Test(priority=39, enabled = true)
 public void RiskManagementMap_MediaAsset() throws IOException, InterruptedException {
	   
	   Thread.sleep(3000); 
	   //TestCase 34
	   // Click on Risk Management Map
	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	   Reporter.log("Click on Risk Management Map | ");
	   Thread.sleep(3000);
	   clickByXpath("html/body/div[4]/div/div/div[3]/button");
	   Thread.sleep(3000);
 }
 
 @Test(priority=40, enabled = false)
 public void Pagination_MediaAsset() throws IOException, InterruptedException {
	
	// Click on Pagination button
     selectByXpath_Visibletext("//*[@id='assets_length']/label/select","100");
     Reporter.log("Click on Pagination button | ");
     Thread.sleep(3000);
 }

}


	    
	    
