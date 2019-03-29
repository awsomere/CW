package com.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestLinkTestcases extends WrapperClass{
	
	
	 public String baseUrl = "https://software-stage.clearwatercompliance.com/" ;
	
    String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver;
    String Asset_Wizard ="Asset Wizard in Automation";
    String First_Asset= "First Asset";
    String Testing_Asset= "TestingAsset";
    String Disable_sunset= "Disable/sunset Asset";
    String PreProduction="PreProduction Asset";
    String BussinessOwner = "VBC@sybrant.com";
    
	
    @BeforeTest
	public void SetUp(){ 

	System.setProperty("webdriver.chrome.driver", driverPath);	
	driver = new ChromeDriver();
     driver.get(baseUrl);
     driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	
	
    }
    
    @Test
	public void Login() throws IOException, InterruptedException{ 
	
	//Enter EmailID in Textbox
	assertTextXpath("//*[@id='lEmail']");
	sendvaluebyxpath("//*[@id='lEmail']", "emailId");
	Reporter.log("Enter EmailID successfully | ");
	Thread.sleep(3000);
	
	//Enter Password in Textbox
	assertTextXpath("//*[@id='lPass']");
	sendvaluebyxpath("//*[@id='lPass']", "password");
	Reporter.log("Enter Password successfully | ");
	Thread.sleep(8000);
	Thread.sleep(8000);
	Thread.sleep(8000);
	

	//Click on SignIN button
	try {
	assertTextXpath("//*[@id='signIn']");
	clickByXpath("//*[@id='signIn']");  
	Reporter.log("Click on SignIN button successfully | ");
	}catch(Exception e)
	{
		   e.printStackTrace();
		  Reporter.log("SignIN doesn't work | ");
		}
	Thread.sleep(3000);
	Thread.sleep(3000);
	//Thread.sleep(5000);
	//Thread.sleep(5000);

}
    
    @Test(priority=1, enabled = true)
    public void NavigatePage_AssetInventoryList() throws IOException, InterruptedException {
  	  
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
  	    
  	  //Select Continue button for the Asset Inventory List Page
  	    assertTextXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a");
  	    clickByXpath("//*[@id='introscreen']/div/div/div[2]/div[1]/a");
  	    Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
  	    Thread.sleep(8000);
  	    Thread.sleep(6000);
  	    
    }  
    @Test(priority=2, enabled = true)
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
     @Test(priority=3, enabled = true)
     public void AssetName_AssetWizard() throws IOException, InterruptedException {
  	    
     
  	    
  	 /* //Select New button for the Asset Inventory List Page
  	    assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]");
  	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/a[1]");
  	    Reporter.log("Selected Continue button for the Asset Inventory List Page | ");
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);*/
           
        //Create New Asset started filling data for Asset   
        assertTextXpath("//*[@id='asset-name']/div[1]/div[2]/input");
        sendvaluebyxpath("//*[@id='asset-name']/div[1]/div[2]/input", Asset_Wizard);
        Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
        Thread.sleep(6000);
        //Thread.sleep(6000);
      
        //Fill data for Description 
        assertTextXpath("//*[@id='asset-name']/div[1]/div[4]/textarea");
        sendvaluebyxpath("//*[@id='asset-name']/div[1]/div[4]/textarea", "Sample Description");
        Reporter.log("Filled data for Description | ");
        Thread.sleep(6000);
        
        //Select data from Type of Sensitive Data 
        clickByXpath("//*[@id='asset-name']/div[2]/div[4]/div/label");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);
        
        //Click on Context ? Icon
        clickByXpath("//*[@id='asset-name']/div[2]/div[1]/span/span/i");
        Reporter.log("Click on Context ? Icon | ");
        Thread.sleep(6000);
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
        
      //Click on Previous Button
        assertTextXpath("//*[@id='asset-form']/div[2]/div/div[1]/span/strong");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[1]/span/strong");
        Reporter.log("Click on Previous Button | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);
        
        //Click on next Button
        //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        Thread.sleep(6000);
        
     }
     
     @Test(priority=4, enabled = true)
     public void ComponentTypes_AssetWizard() throws IOException, InterruptedException {
               
    //  MediaCheckbox
    //-----------------------
  	   
  	 //Click on  Collapse all categories Button
  	 assertTextXpath("//*[@id='add-media']/div[1]/div[1]/span/a[2]");
  	 clickByXpath("//*[@id='add-media']/div[1]/div[1]/span/a[2]");
  	 Reporter.log("Clic on  Collapse all categories button ");
  	 Thread.sleep(8000);
  	 Thread.sleep(3000);
           
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
        
        //Click on Context ? Icon
        clickByXpath("//*[@id='media-categories-group']/div[1]/div[1]/h4/a/span[2]/span/i");
        Reporter.log("Click on Context ? Icon | ");
        Thread.sleep(6000);
        
        //Thread.sleep(6000);  
      //Fill data for Media Devices
        assertTextXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
        clickByXpath("//*[@id='End User Devices']/div/div[1]/div[2]/div[2]/div/label");
        Reporter.log("Backup Media Devices | ");
        Thread.sleep(6000); 
        
        //Click on Context ? Icon
        clickByXpath("//*[@id='media-categories-group']/div[2]/div[1]/h4/a/span[2]/span/i");
        Reporter.log("Click on Context ? Icon | ");
        Thread.sleep(6000);
        //Thread.sleep(6000); 
        
        
        ArrowDown();
        ArrowDown();
        ArrowDown();
        Thread.sleep(6000);
        
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='Infrastructure']/div/div[1]/div[2]/div[2]/div/label");
        clickByXpath("//*[@id='Infrastructure']/div/div[1]/div[2]/div[2]/div/label");
        Reporter.log("Backup Media Devices | ");
        Thread.sleep(6000);  
        
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        Thread.sleep(6000);
              
        //Fill data for Media Devices
        assertTextXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
        clickByXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
        Reporter.log("Backup Media Devices | ");
        Thread.sleep(6000);  
        
        //Click on Context ? Icon
        clickByXpath("//*[@id='media-categories-group']/div[3]/div[1]/h4/a/span[2]/span/i");
        Reporter.log("Click on Context ? Icon | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);  
        
        //Click on Context ? Icon
        clickByXpath("//*[@id='media-categories-group']/div[4]/div[1]/h4/a/span[2]/span/i");
        Reporter.log("Click on Context ? Icon | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);  
        
        //Click on next Button
       //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        Thread.sleep(3000);
        
     }
     
     @Test(priority=5, enabled = true)
     public void Importance_AssetWizard() throws IOException, InterruptedException {
        
  //Importance
  //----------------
        
      //Click on Radio Button
        assertTextXpath("//*[@id='importance']/div/div[1]/div[2]/div[4]/label");
        clickByXpath("//*[@id='importance']/div/div[1]/div[2]/div[4]/label");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);    
        
      //Click on Recovery Time (RTO) drop-down
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[1]/select");
        Thread.sleep(3000);
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[1]/select/option[6]");
        Thread.sleep(6000);  
        
      //Click on Recovery Point (RPO) drop-down
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[2]/select");
        Thread.sleep(3000);
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[2]/select/option[6]");
        Thread.sleep(6000);  
        
      //Fill data for Number of user
        assertTextXpath("//*[@id='importance']/div/div[2]/div[3]/div/input");
        sendvaluebyxpath("//*[@id='importance']/div/div[2]/div[3]/div/input", "1000");
        Reporter.log("Filled data for Number of user | ");
        Thread.sleep(6000);
        
        //Fill data for Source
        assertTextXpath("//*[@id='importance']/div/div[2]/div[5]/div/input");
        sendvaluebyxpath("//*[@id='importance']/div/div[2]/div[5]/div/input", "2000");
        Reporter.log("Filled data for Source | ");
        Thread.sleep(6000);
        
      //Click on next Button
        //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
       // clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
       clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        Thread.sleep(6000);       
        
        
     }
     
     @Test(priority=6, enabled = true)
     public void Details_AssetWizard() throws IOException, InterruptedException {
        
        //Details
        //--------------
                  
        //Fill data for source
        assertTextXpath("//*[@id='details']/div[2]/textarea");
        sendvaluebyxpath("//*[@id='details']/div[2]/textarea", "Source");
        Reporter.log("Filled data for FirstName | ");
        Thread.sleep(6000);
      
        //Fill data for Destination 
        assertTextXpath("//*[@id='details']/div[4]/textarea");
        sendvaluebyxpath("//*[@id='details']/div[4]/textarea", "Destination");
        Reporter.log("Filled data for LastName | ");
        Thread.sleep(6000);
      
        //Check Discard button for Asset Business Owner
        clickByXpath("//*[@id='bo_selector_chosen']/a/span");
        Thread.sleep(2000);
        clickByXpath("//*[@id='bo_selector_chosen']/div/ul/li[1]");
        Thread.sleep(5000);      
        clickByXpath("html/body/div[6]/div/div/div[2]/div/div/form/div[2]/a");
        Thread.sleep(8000); 
        
     }
     
     @Test(priority=7, enabled = true)
     public void ChkListedDetails_BussinessOwner_CES() throws IOException, InterruptedException {   
         
         // Click on Asset bussineess Owner
         clickByXpath("//*[@id='bo_selector_chosen']/a/span");
  	   Thread.sleep(5000);
  	   
  	 //Check the Tab
  	  assertEquals("//*[@id='bo_selector_chosen']/div/ul/li[1]", "Edit freeform data...");
  	 Thread.sleep(2000);
  	 
  	//Check the Tab
  	  assertEquals("//*[@id='bo_selector_chosen']/div/ul/li[2]", "New Business Owner...");
  	 Thread.sleep(2000);
  	 
  	//Check the Tab
  	 // assertEquals("//*[@id='bo_selector_chosen']/div/div/input", "");
  	 Thread.sleep(2000);

   }
   
   @Test(priority=8, enabled = true)
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
  	   
  	//CLick on Create a New User: Radio Button
  	   clickByXpath("html/body/div[6]/div/div/div[2]/div/div/label[2]/input");
  	   Thread.sleep(6000);  
  	   
  	  // CLick on Use freeform data: Radio Button
  	   clickByXpath("html/body/div[6]/div/div/div[2]/div/div/label[1]/input");
  	   Thread.sleep(6000);
  	   sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/div/div/input", "Automation User");
  	      Thread.sleep(3000);
  	      clickByXpath("//*[@id='submit-button']");     
  	      Thread.sleep(6000);
  	   
  	   
   }
        
   @Test(priority=9, enabled = true)
   public void BusinessOwnerPopup_AssetWizard_CES() throws IOException, InterruptedException {
     
   
        
        //Fill data for Asset Business Owner
        clickByXpath("//*[@id='bo_selector_chosen']/a/span");
        Thread.sleep(4000);
        clickByXpath("//*[@id='bo_selector_chosen']/div/ul/li[3]");
        Thread.sleep(5000);          
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
            
        //click on Add another asset after saving checkbox
        assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/div/label");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/div/label");     
        Reporter.log("Add another asset after saving | ");
        Thread.sleep(8000);
        
         //Click on Context ? Icon
        //clickByXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/span/span/i");
        //Reporter.log("Click on Context ? Icon | ");
        //Thread.sleep(6000);
        //Thread.sleep(6000);
        
      //click on Next button
       //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
       //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");     
       clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
       Reporter.log("Add another asset after saving | ");
       Thread.sleep(8000);
       Thread.sleep(8000);
       
     /*//click on Done button and save  
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
  	 Thread.sleep(6000);*/
       
     }
     

     @Test(priority=10, enabled = true)
     public void ChkText_ComponentGroups_AssetWizard() throws IOException, InterruptedException {   
       
  	 //Click on Grouping Expert.. button
  	   assertTextXpath("//*[@id='component-groups']/div[1]/div/button");
  	   clickByXpath("//*[@id='component-groups']/div[1]/div/button");     
  	   Reporter.log("Click on Create & Select Button in Component Groups Tab");
  	   Thread.sleep(6000);
  	   Thread.sleep(8000);
  	   
  	 //Click on Second Tab button
  	   assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[2]/ul/li[2]/span");
  	   clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[2]/ul/li[2]/span");     
  	   Reporter.log("Click on Create & Select Button in Component Groups Tab");
  	   Thread.sleep(8000);
  	   
  	 //Click on First Tab button
  	   assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[1]/ul/li[2]/span");
  	   clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[1]/ul/li[2]/span");     
  	   Reporter.log("Click on Create & Select Button in Component Groups Tab");
  	   Thread.sleep(8000);
  	   
       /*//Click on Change/Add Groups in Component Groups Tab
       assertTextXpath("//*[@id='component-groups']/div[2]/div[1]/div[1]/div/button");
       clickByXpath("//*[@id='component-groups']/div[2]/div[1]/div[1]/div/button");     
      Reporter.log("Click on 'Change/Add Groups' links in Component Groups Tab");
      Thread.sleep(8000);
      Thread.sleep(8000);*/
      
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
      
    /* //Click Help Icon for Physical Location
      assertTextXpath("//h5/span/span/i");
      clickByXpath("//h5/span/span/i"); 
      Thread.sleep(6000); */
      
     }
     
     @Test(priority=11, enabled = true)
     public void PhysicalLoaction_ComponentGroups() throws IOException, InterruptedException {   
       
      //Set the Properties
      clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/h4/strong");   
      Thread.sleep(3000);
      
    //Click on Physical Location drop-down
      //assertTextXpath("//*[@id='physicalLocation']");
      clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[3]/div/div[1]/property-choice/div/select");   
      Thread.sleep(6000); 
      
      //Click on Options from Physical Location drop-down
      //assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[3]/div/div[1]/property-choice/div/select/option[2]");
      clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[3]/div/div[1]/property-choice/div/select/option[2]"); 
      Thread.sleep(8000); 
      
      //Click on Discard Link
      //assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[6]/div[2]/div[2]/button");
      clickByXpath("html/body/div[7]/div/div/div[2]/div/div/form/div[2]/a"); 
      Thread.sleep(8000);  
      Thread.sleep(5000);  
      
    //Click on Physical Location drop-down
      //assertTextXpath("//*[@id='physicalLocation']");
      clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[3]/div/div[1]/property-choice/div/select");   
      Thread.sleep(6000); 
      
      //Click on Options from Physical Location drop-down
      //assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[3]/div/div[1]/property-choice/div/select/option[2]");
      clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[3]/div/div[1]/property-choice/div/select/option[2]"); 
      Thread.sleep(8000); 
      
      //Enter the values in Abbreviation Textbox
      clickByXpath("html/body/div[7]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[1]/div/input"); 
      Thread.sleep(3000);
      sendvaluebyxpath("html/body/div[7]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[1]/div/input", "Auto");                   
      Thread.sleep(8000); 
      
    //Enter the values in Location Name Textbox
      clickByXpath("html/body/div[7]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[2]/div/input"); 
      Thread.sleep(3000);
      sendvaluebyxpath("html/body/div[7]/div/div/div[2]/div/div/form/div[1]/div/div/div/div/div[2]/div/input", "Automa Loc");
      Thread.sleep(8000);
      
      //Click on 'Create' button
      //assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[6]/div[2]/div[2]/button");
      clickByXpath("//*[@id='submit-button']"); 
      Thread.sleep(8000);  
      Thread.sleep(5000);  
      
     }
     
     @Test(priority=12, enabled = true)
     public void AnotherGroupsButton_ComponentGroups_AssetWizard() throws IOException, InterruptedException {   
       
      
       //Click on Another Groups Button in Component Groups Tab
      assertTextXpath("//assets-form-selected-groups/div/div/div[3]/button");
      clickByXpath("//assets-form-selected-groups/div/div/div[3]/button");     
     Reporter.log("Click on Another Groups Button in Component Groups Tab");
     Thread.sleep(6000);
     Thread.sleep(6000);
      
   //Click on New Group Name in Component Groups Tab
     assertTextXpath("//assets-form-create-group/div/div/input");
     sendvaluebyxpath("//assets-form-create-group/div/div/input", "Automation Backup Media");     
    Reporter.log("Click on New Group Name in Component Groups Tab");
    Thread.sleep(6000);
    
  //Click on New Group Desc in Component Groups Tab
    assertTextXpath("//assets-form-create-group/div/div/textarea");
    sendvaluebyxpath("//assets-form-create-group/div/div/textarea", "Automation Backup Media Desc");     
   Reporter.log("Click on New Group Desc in Component Groups Tab");
   Thread.sleep(6000);
   
  //Click on Create & Select Button in Component Groups Tab
   assertTextXpath("//assets-form-create-group/div/div/div[2]/button[2]");
   clickByXpath("//assets-form-create-group/div/div/div[2]/button[2]");     
  Reporter.log("Click on Create & Select Button in Component Groups Tab");
  Thread.sleep(8000);
  Thread.sleep(8000);
   
  /*//Click on ? Button in Component Groups Tab
  assertTextXpath("//div/div/div[2]/div[2]/div/h5/span/span/i");
  clickByXpath("//div/div/div[2]/div[2]/div/h5/span/span/i");     
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
  Thread.sleep(6000);*/

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

  /*//Click on Help ? Icon
  clickByXpath("//div[2]/div/div/h5/span/span/i");
  Thread.sleep(5000);

  //Click on Close button
  clickByXpath("//div[6]/div/div/div[3]/div[4]/button");
  Thread.sleep(5000);*/

  //Click on Remove button
  clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/assets-form-selected-groups/div/div/div[2]/div[1]/div[3]/button");
  Thread.sleep(5000);

  /*//Click on Select button 
  assertEquals("//div/div[2]/div/div[3]/button", "Select");
  Thread.sleep(3000);
  clickByXpath("//div/div[2]/div/div[3]/button"); 
  Thread.sleep(3000);*/

     }
     
     
     @Test(priority=13, enabled = true)
  	  public void ChkRecentNameLink_ComponentGroups_AssetWizard() throws IOException, InterruptedException {
  			  
  		Thread.sleep(6000);  
  		
  		//Select the All Groups link 
  		clickByXpath("//li[2]/button"); 
  	     Thread.sleep(6000);
  	   
  	     //Click on Name link
  	     clickByXpath("//h4/span[2]"); 
  	     Thread.sleep(6000);
  	     
  	   //Click on recent link
  	     clickByXpath("//assets-form-all-groups/div/div/h4/span"); 
  	     Thread.sleep(6000);
  	     
  	   }
  	   
  	   @Test(priority=14, enabled = true)
  		  public void AllGroups_ComponentGroups_AssetWizard() throws IOException, InterruptedException {
  				  
  			Thread.sleep(6000); 
  			//Check the Modules
  			assertEquals("//assets-form-create-group/div/h4", "Create a new group:");
  			Thread.sleep(4000);
  		    
  		     //Enter the values in Location Name Textbox
  		     sendvaluebyxpath("//assets-form-create-group/div/div/input", "Automation New Test Group"); 
  		     Thread.sleep(6000);
  		     
  		   //Enter the values in Location Name Textbox
  		     sendvaluebyxpath("//assets-form-create-group/div/div/textarea", "Automation Desc"); 
  		     Thread.sleep(6000);
  		     
  		     //Click on Create & Select
  		     clickByXpath("//assets-form-create-group/div/div/div[2]/button[2]"); 
  		     Thread.sleep(8000); 
  		     
  		   //Click on Remove button
  		     clickByXpath("//div/div/div[2]/div/div[3]/button");
  		     Thread.sleep(5000);
  		     
  		     /* //Click on Select button 
  		     clickByXpath("//assets-form-all-groups/div/div[2]/div/div"); 
  		     Thread.sleep(5000);			     
  		     assertEquals("//div/div[2]/div/div[3]/button", "Select");
  		     Thread.sleep(3000);
  		    clickByXpath("//div/div[2]/div/div[3]/button"); 
  		     Thread.sleep(3000);   */
  		     			     
  		     //Close the pop-up
  		     clickByXpath("html/body/div[6]/div/div/div[1]/button"); 
  		     Thread.sleep(8000); 
  		     Thread.sleep(8000); 
  		  
  		}
  	   		 

  	   
  @Test(priority=15, enabled = true)
  public void ReviewGrouping_CES() throws IOException, InterruptedException {
  			 
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

  //Click on Third Component Tab button
  assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[3]");
  clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[3]"); 
  Thread.sleep(6000); 

  //Click on Fourth Component Tab button
  assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[4]");
  clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[4]"); 
  Thread.sleep(6000);

  /*//Click on Fifth Component Tab button
  assertTextXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[5]");
  clickByXpath("html/body/div[6]/div/div/div[2]/div/div/div/div[1]/div/button[5]"); 
  Thread.sleep(6000);*/

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
     
     @Test(priority=16, enabled = true)
     public void Edit_AssetName_AssetWizard() throws IOException, InterruptedException {
  	    
  	   Thread.sleep(8000);  	   
  	   
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
           
        //Create New Asset started filling data for Asset   
        assertTextXpath("//*[@id='asset-name']/div[1]/div[2]/input");
        sendvaluebyxpath("//*[@id='asset-name']/div[1]/div[2]/input", "Edit Automation Asset");
        Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
        Thread.sleep(6000);
        //Thread.sleep(6000);
      
        //Fill data for Description 
        assertTextXpath("//*[@id='asset-name']/div[1]/div[4]/textarea");
        sendvaluebyxpath("//*[@id='asset-name']/div[1]/div[4]/textarea", "Edit Description");
        Reporter.log("Filled data for Description | ");
        Thread.sleep(6000);
        
        //Select data from Type of Sensitive Data 
        clickByXpath("//*[@id='asset-name']/div[2]/div[5]/div/label");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);
             
        //Click on next Button
        //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);
        
      //Click on Previous Button
        assertTextXpath("//*[@id='asset-form']/div[2]/div/div[1]/span/strong");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[1]/span/strong");
        Reporter.log("Click on Previous Button | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);
        
        //Click on next Button
        //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        Thread.sleep(6000);
        
     }
     
     @Test(priority=17, enabled = true)
     public void Edit_ComponentTypes_AssetWizard() throws IOException, InterruptedException {
               
    //  MediaCheckbox
    //-----------------------
  	   
  	 //Click on  Collapse all categories Button
  	 assertTextXpath("//*[@id='add-media']/div[1]/div[1]/span/a[2]");
  	 clickByXpath("//*[@id='add-media']/div[1]/div[1]/span/a[2]");
  	 Reporter.log("Clic on  Collapse all categories button ");
  	 Thread.sleep(8000);
  	 Thread.sleep(3000);
           
        //Click on Expand all categories Button
        assertTextXpath("//*[@id='add-media']/div[1]/div[1]/span/a[1]");
        clickByXpath("//*[@id='add-media']/div[1]/div[1]/span/a[1]");
        Reporter.log("Clic on Expand all categories button ");
        Thread.sleep(6000);
                 
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
        clickByXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
        Reporter.log("USB Devices | ");
        Thread.sleep(6000);        
        
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        ArrowDown();
        Thread.sleep(6000);
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[2]/div[2]/div/label");
        clickByXpath("//*[@id='End User Devices']/div/div[2]/div[2]/div[2]/div/label");
        Reporter.log("Backup Media Devices | ");
        Thread.sleep(6000);  
        
        //Fill data for Media Devices
        assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
        clickByXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
        Reporter.log("Backup Media Devices | ");
        Thread.sleep(6000);      
        
        //Click on next Button
       //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
        clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        Thread.sleep(3000);
        
     }
     
     @Test(priority=18, enabled = true)
     public void Edit_Importance_AssetWizard() throws IOException, InterruptedException {
        
  //Importance
  //----------------
        
      //Click on Radio Button
        assertTextXpath("//*[@id='importance']/div/div[1]/div[2]/div[5]/label");
        clickByXpath("//*[@id='importance']/div/div[1]/div[2]/div[5]/label");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);    
        
      //Click on Recovery Time (RTO) drop-down
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[1]/select");
        Thread.sleep(3000);
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[1]/select/option[4]");
        Thread.sleep(6000);  
        
      //Click on Recovery Point (RPO) drop-down
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[2]/select");
        Thread.sleep(3000);
        clickByXpath("//*[@id='importance']/div/div[2]/div[1]/div[2]/div[2]/select/option[4]");
        Thread.sleep(6000);  
        
      //Fill data for Number of user
        assertTextXpath("//*[@id='importance']/div/div[2]/div[3]/div/input");
        sendvaluebyxpath("//*[@id='importance']/div/div[2]/div[3]/div/input", "4000");
        Reporter.log("Filled data for Number of user | ");
        Thread.sleep(6000);
        
        //Fill data for Source
        assertTextXpath("//*[@id='importance']/div/div[2]/div[5]/div/input");
        sendvaluebyxpath("//*[@id='importance']/div/div[2]/div[5]/div/input", "5000");
        Reporter.log("Filled data for Source | ");
        Thread.sleep(6000);
        
      //Click on next Button
        //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
       // clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
       clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/button");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        Thread.sleep(6000);       
        
        
     }
     
     @Test(priority=19, enabled = true)
     public void Edit_Details_AssetWizard() throws IOException, InterruptedException {
        
        //Details
        //--------------
                  
        //Fill data for source
        assertTextXpath("//*[@id='details']/div[2]/textarea");
        sendvaluebyxpath("//*[@id='details']/div[2]/textarea", "Edit Source");
        Reporter.log("Filled data for FirstName | ");
        Thread.sleep(6000);
      
        //Fill data for Destination 
        assertTextXpath("//*[@id='details']/div[4]/textarea");
        sendvaluebyxpath("//*[@id='details']/div[4]/textarea", "Edit Destination");
        Reporter.log("Filled data for LastName | ");
        Thread.sleep(6000);
      
        //Check Discard button for Asset Business Owner
        clickByXpath("//*[@id='bo_selector_chosen']/a/span");
        Thread.sleep(2000);
        clickByXpath("//*[@id='bo_selector_chosen']/div/ul/li[1]");
        Thread.sleep(5000);      
        clickByXpath("html/body/div[6]/div/div/div[2]/div/div/form/div[2]/a");
        Thread.sleep(8000); 
        
      //Fill data for Asset Business Owner
        clickByXpath("//*[@id='bo_selector_chosen']/a/span");
        Thread.sleep(2000);
        clickByXpath("//*[@id='bo_selector_chosen']/div/ul/li[1]");
        Thread.sleep(5000);      
        sendvaluebyxpath("html/body/div[6]/div/div/div[2]/div/div/div/div/input", "Edit Automation User");
        Thread.sleep(3000);
        clickByXpath("//*[@id='submit-button']");     
        Thread.sleep(6000);
                  
      //click on Updated button
       //assertTextXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");
       //clickByXpath("//*[@id='asset-form']/div[2]/div/div[3]/span");     
       clickByXpath("//*[@id='asset-form']/div[2]/div/div[2]/div/button[2]");
       Reporter.log("Add another asset after saving | ");
       Thread.sleep(8000);
       Thread.sleep(8000);
       Thread.sleep(8000);
       
     }
     
     @Test(priority=20, enabled = true)
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
     
     @Test(priority=21, enabled = true)
     public void PanelBar_AssetInventoryList() throws IOException, InterruptedException {
  		   
  	   Thread.sleep(6000);
  	   // Click on Page breadcrumb
  	   assertEquals("//ol", "Assets Asset Inventory List");
  	   //assertEquals("//ol", "Assets Asset Inventory List");
  	   Reporter.log("Click on Page breadcrumb | ");
  	   Thread.sleep(2000);
  	   mouseHoverByXpath("//ol");
  	   Thread.sleep(1000); 
  	   
     }
     
     @Test(priority=22, enabled = true)
     public void PageLevelHelp_AssetInventoryList() throws IOException, InterruptedException {
  	   
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
          Thread.sleep(1000);
  	   Thread.sleep(6000);
  	   
     }
  	
     @Test(priority=23, enabled = true)
     public void RiskManagementMap_AssetInventoryList() throws IOException, InterruptedException {
  	   
  	   Thread.sleep(6000); 
  	   
  	   // Click on Risk Management Map
  	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
  	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
  	   Reporter.log("Click on Risk Management Map | ");
  	   Thread.sleep(6000);
  	   clickByXpath("html/body/div[4]/div/div/div[2]/button");
  	   Thread.sleep(6000);
     }
     
     @Test(priority=24, enabled = true)
     public void PageHearder_CreateAsset() throws IOException, InterruptedException {
  	   
  	   Thread.sleep(2000);
  	   Thread.sleep(6000);
  	 	
  	 	//Select New button for the Asset Inventory List Page
  	 assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  	    Reporter.log("Click on New Button | ");
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);
  	   
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
     
     @Test(priority=25, enabled = true)
     public void PanelBar_CreateAsset() throws IOException, InterruptedException {
  		   
  	   Thread.sleep(6000);
  	   // Click on Page breadcrumb
  	   assertEquals("//ol", "Assets Asset Inventory List Create Asset");
  	   Reporter.log("Click on Page breadcrumb | ");
  	   Thread.sleep(1000);
  	   mouseHoverByXpath("//ol");
  	   Thread.sleep(1000); 
  	   
     }
     
     @Test(priority=26, enabled = true)
     public void PageLevelHelp_CreateAsset() throws IOException, InterruptedException {
  	   
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
          Thread.sleep(1000);
  	   // Thread.sleep(6000);
  	   
     }
  	
     @Test(priority=27, enabled = true)
     public void RiskManagementMap_CreateAsset() throws IOException, InterruptedException {
  	   
  	   Thread.sleep(6000); 
  	   
  	   // Click on Risk Management Map
  	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
  	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
  	   Reporter.log("Click on Risk Management Map | ");
  	   Thread.sleep(6000);
  	   clickByXpath("html/body/div[4]/div/div/div[2]/button");
  	   Thread.sleep(1000);
  	   
  	 //Select Asset Inventory List Sub-module
  	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
  	    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
  	    Reporter.log("Selected Asset Inventory List Sub-module | ");
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);
  	   
  	
     }
     
     @Test(priority=28, enabled = false)
  	  public void ContextHelp_CreateAsset() throws IOException, InterruptedException {
  		 
  	   Thread.sleep(6000); 
  	     
  	   // Click ? Button
  	   assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span/span/i");
  	   clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span/span/i");
  	   Reporter.log("Click ? Button | ");
  	   Thread.sleep(6000);
  	          
  	   // Click ? Button
  	   assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span/span/i");
  	   clickByXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/span/span/i");
  	   Reporter.log("Click ? Button | ");
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
      
   // Click ? Button
      assertTextXpath("//*[@id='media-categories-group']/div[1]/div[1]/h4/a/span[2]/span/i");
      clickByXpath("//*[@id='media-categories-group']/div[1]/div[1]/h4/a/span[2]/span/i");
      Reporter.log("Click ? Button | ");
       Thread.sleep(6000);
       
       
    // Click ? Button
  	    assertTextXpath("//*[@id='media-categories-group']/div[2]/div[1]/h4/a/span[2]/span/i");
       clickByXpath("//*[@id='media-categories-group']/div[2]/div[1]/h4/a/span[2]/span/i");
       Reporter.log("Click ? Button | ");
        Thread.sleep(6000);
        
        
      // Click ? Button
        assertTextXpath("//*[@id='media-categories-group']/div[3]/div[1]/h4/a/span[2]/span/i");
        clickByXpath("//*[@id='media-categories-group']/div[3]/div[1]/h4/a/span[2]/span/i");
        Reporter.log("Click ? Button | ");
        Thread.sleep(6000);
         
         
         // Click ? Button
  	    assertTextXpath("//*[@id='media-categories-group']/div[4]/div[1]/h4/a/span[2]/span/i");
         clickByXpath("//*[@id='media-categories-group']/div[4]/div[1]/h4/a/span[2]/span/i");
         Reporter.log("Click ? Button | ");
          Thread.sleep(6000);
         
          ArrowDown();
          ArrowDown();
          ArrowDown();
          ArrowDown();
          Thread.sleep(6000);
          
       // Click on Close button
          assertTextXpath("//*[@id='submitButton']/div[3]/div/span/span/i");
          clickByXpath("//*[@id='submitButton']/div[3]/div/span/span/i");
          Reporter.log("Click on Close button | ");
          Thread.sleep(6000);
          clickByXpath("html/body/div[4]/div/div/div[3]/button");
          Thread.sleep(6000);
          
          // Click on Close button
  	    assertTextXpath("//*[@id='submitButton']/div[1]/span");
  	    clickByXpath("//*[@id='submitButton']/div[1]/span");
  	    Reporter.log("Click on Close button | ");
  	    Thread.sleep(6000);
  	    Thread.sleep(8000);	    
  	    Thread.sleep(6000);


   	
     }
     
     @Test(priority=29, enabled = true)
     public void AssetNameOnly_CreateAsset() throws IOException, InterruptedException {
  		  
  	  
  	
  	//Select New button for the Asset Inventory List Page
      assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
      clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
      Reporter.log("Click on New Button | ");
      Thread.sleep(6000);
      Thread.sleep(6000);
   
  //Create New Asset started filling data for Asset   
   assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
   sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", First_Asset);
   Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
   Thread.sleep(6000);
   //Thread.sleep(6000);
   
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
   Thread.sleep(6000);
   
  /*//Click on Grouping Expert button
  assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button");
  clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button"); 
  Thread.sleep(6000); 

  //Click on Grouping Expert button
  assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/span/span/i");
  clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/span/span/i"); 
  Thread.sleep(6000); 

  //Click on Grouping Expert button
  assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[1]/h3/span/span/i");
  clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[1]/h3/span/span/i"); 
  Thread.sleep(6000);*/

  ArrowDown();
  ArrowDown();
  ArrowDown();
  ArrowDown();
  Thread.sleep(6000);
   
  //Uncheck the Add neww Asset checkbox
   assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
  clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
  Thread.sleep(6000); 
  	
  //click on Done button and save
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
  	
  }
     
     
      @Test(priority=30, enabled = true)
  	  public void Testing_AssetBasics_CreateAsset() throws IOException, InterruptedException {
  		  
      	Thread.sleep(6000);    
  		    
      	//Select New button for the Asset Inventory List Page
  	    assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  	    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  	    Reporter.log("Click on New Button | ");
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);
           
        //Create New Asset started filling data for Asset   
        assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
        sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", Testing_Asset);
        Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
        Thread.sleep(6000);
        //Thread.sleep(6000);
      
        //Fill data for Description 
        assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/textarea");
        sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/textarea", "Sample Description");
        Reporter.log("Filled data for Description | ");
        Thread.sleep(6000);
        
        //Select data from Type of Sensitive Data 
        clickByXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div/label");
        Reporter.log("Select data from Type of Sensitive Data | ");
        Thread.sleep(6000);
        //Thread.sleep(6000);
        
      }
      
      @Test(priority=31, enabled = true)
  	  public void Testing_Importance_CreateAsset() throws IOException, InterruptedException {
  		  
    	Thread.sleep(6000);    
      	              
       //Fill data for Number of user
       assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[5]/div/input");
       sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[5]/div/input", "1000");
       Reporter.log("Filled data for Number of user | ");
       Thread.sleep(6000);
       //Thread.sleep(6000);
       
       // Important of Asset
       assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/label");
       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[4]/label");
       Reporter.log("Filled data for Media Devices | ");
       Thread.sleep(6000);
       
     //Click on Recovery Time (RTO) drop-down
       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/select");
       Thread.sleep(3000);
       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/select/option[6]");
       Thread.sleep(6000);  
       
     //Click on Recovery Point (RPO) drop-down
       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/select");
       Thread.sleep(3000);
       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/select/option[6]");
       Thread.sleep(6000);  
       
      }
      
      @Test(priority=32, enabled = true)
  	  public void Testing_Details_CreateAsset() throws IOException, InterruptedException {
  		  
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
       ArrowDown();
       ArrowDown();
       ArrowDown();
       ArrowDown();
       	    
       Thread.sleep(5000);
  	        
  	      //Fill data for source
  	        //assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[2]/textarea");
  	        sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div/div[2]/textarea", "Source");
  	        Reporter.log("Filled data for FirstName | ");
  	        Thread.sleep(6000);
  	      
  	        //Fill data for Destination 
  	        //assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div/div[4]/textarea");
  	        sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[2]/div[2]/div[2]/div/div[4]/textarea", "Destination");
  	        Reporter.log("Filled data for LastName | ");
  	        Thread.sleep(6000);
  	        
  	      //Fill data for Asset Business Owner
  		       clickByXpath("//*[@id='bo_selector_chosen']/a/span");
  		       Thread.sleep(2000);
  		       clickByXpath("//*[@id='bo_selector_chosen']/div/ul/li[1]");
  		       Thread.sleep(5000);      
  		       sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div/div/input", "AUser");
  		       Thread.sleep(3000);
  		       clickByXpath("//*[@id='submit-button']");     
  		       Thread.sleep(6000); 
  	        
  	        
      }
      
      @Test(priority=33, enabled = true)
  	  public void Testing_ComponentTypes_CreateAsset() throws IOException, InterruptedException {
  		  
    	Thread.sleep(6000);    
    	
    	     ArrowUp();
    	     ArrowUp();
    	     ArrowUp();
    	     ArrowUp();
    	     ArrowUp();
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
  	        assertTextXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
  	       clickByXpath("//*[@id='Backup']/div/div[1]/div/div[2]/div/label");
  	       Reporter.log("Filled data for Media Devices | ");
  	       Thread.sleep(6000);
  	      //Thread.sleep(6000);
  	  	     
  	  	 // Fill data for Media Devices
  	       assertTextXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
  	       clickByXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
  	       Reporter.log("Filled data for Media Devices | ");
  	       Thread.sleep(6000);
  	       //Thread.sleep(6000);
         
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
  	     assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[2]/div[2]/div/label");
  	     clickByXpath("//*[@id='End User Devices']/div/div[2]/div[2]/div[2]/div/label");
  	     Thread.sleep(6000);
  	       
  	       // Fill data for Media Devices	                        
  	       // assertTextXpath("//*[@id='infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
  	       // clickByXpath("//*[@id='infrastructure-devices']/div/div[1]/div[1]/div[2]/div/label");
  	       assertTextXpath("//*[@id='Infrastructure']/div/div[1]/div[2]/div[2]/div/label");
  		   clickByXpath("//*[@id='Infrastructure']/div/div[1]/div[2]/div[2]/div/label");		     
  		   Reporter.log("Filled data for Media Devices | ");
  		   Thread.sleep(6000);
  		   //Thread.sleep(6000);
  		       
  		       
  		       ArrowDown();
  		       ArrowDown();
  		       ArrowDown();
  		       ArrowDown();
  		       ArrowDown();
  		       ArrowDown();
  		       Thread.sleep(6000);
  		       
  		       
  	       // Fill data for Media Devices
  	       assertTextXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
  	       clickByXpath("//*[@id='third_parties']/div/div[1]/div[1]/div[2]/div/label");
  	       Reporter.log("Filled data for Media Devices | ");
  	       Thread.sleep(6000);
  	       Thread.sleep(6000);	 
  	       
      }
      
      @Test(priority=34, enabled = false)
  	  public void ComponentCount_CES() throws IOException, InterruptedException {
  		  
  	    	Thread.sleep(6000);  
  	       
  	       
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
  	       
  	       ArrowDown();
  	       ArrowDown();
  	       ArrowDown();
  	       Thread.sleep(5000);
  	       
  	     //Check the Component Count
  	       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[4]/div/div");
  	       Reporter.log("Filled data for Media Devices | ");
  	       Thread.sleep(3000);
  	       
  	     //Check the Component Count
  	       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[5]/div/div");
  	       Reporter.log("Filled data for Media Devices | ");
  	       Thread.sleep(3000);
  	       
  	     //Check the Component Count
  	       clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[6]/div/div");
  	       Reporter.log("Filled data for Media Devices | ");
  	       Thread.sleep(3000);
  	       
  	      /* //Uncheck the Add neww Asset checkbox
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
  	        Thread.sleep(8000); 
  	        Thread.sleep(8000); 
  	        //Thread.sleep(6000); 
  	        //Thread.sleep(6000); 
  */	       
      
      }
     
      @Test(priority=34, enabled = true)
  	  public void Testing_ComponentGrouping_CreateAsset() throws IOException, InterruptedException {
  		  
  	Thread.sleep(6000);  
  	
  	     //Click on Grouping Expert button
  	     assertTextXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button");
  	     clickByXpath("//*[@id='asset-form']/div[1]/div[2]/div[3]/div[2]/div[1]/div/div/button"); 
  	     Thread.sleep(6000); 
  	     
  	    //Click on Second Component Tab button
  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[2]");
  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[2]"); 
  	     Thread.sleep(6000); 
  	     
  /*	     //Click on Physical Location drop-down
  	     assertTextXpath("//*[@id='physicalLocation']");
  	     clickByXpath("//*[@id='physicalLocation']"); 
  	     Thread.sleep(6000); 
  	     
  	     //Click on Options from Physical Location drop-down
  	     assertTextXpath("//*[@id='physicalLocation']/option[3]");
  	     clickByXpath("//*[@id='physicalLocation']/option[3]"); 
  	     Thread.sleep(6000); 
  	     
  	     //Enter the values in Abbreviation Textbox
  	     sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[2]/div[2]/div[1]/input", "Atom"); 
  	     Thread.sleep(6000); 
  	     
  	   //Enter the values in Location Name Textbox
  	     sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[2]/div[2]/div[2]/input", "AutomatLocation"); 
  	     Thread.sleep(6000);
  	     
  	     //Click on 'Create' button
  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[2]/div[2]/div[2]/button");
  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[1]/div/assets-form-grouping-expert/div/form/div/div[2]/div[2]/div[2]/button"); 
  	     Thread.sleep(6000);*/ 
  	     
  	     //Click on Another Group... button
  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/assets-form-selected-groups/div/div/div[3]/button");
  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/assets-form-selected-groups/div/div/div[3]/button"); 
  	     Thread.sleep(6000); 
  	     
  	     //Click on New Group Name in Component Groups Tab
  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/input");
  	     sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/input", "Automation P");     
  	    Reporter.log("Click on New Group Name in Component Groups Tab");
  	    Thread.sleep(6000);
  	    
  	  //Click on New Group Desc in Component Groups Tab
  	    assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/textarea");
  	    sendvaluebyxpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/textarea", "Automation Desc");     
  	   Reporter.log("Click on New Group Desc in Component Groups Tab");
  	   Thread.sleep(6000);
  	   
  	   // Set the Default Checkbox 
  	   clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/div[1]/label");     
  	   Reporter.log("Click on Create & Select Button in Component Groups Tab");
  	   Thread.sleep(6000);
  	   	   
  	  //Click on Create & Select Button in Component Groups Tab
  	   assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/div[2]/button[2]");
  	   clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/div[2]/div/assets-form-suggested-group/div/div[2]/assets-form-create-group/div/div/div[2]/button[2]");     
  	  Reporter.log("Click on Create & Select Button in Component Groups Tab");
  	  Thread.sleep(6000);
  	  Thread.sleep(6000);  
  	  
  	//Click on Third Component Tab button
  	  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[3]");
  	  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[3]"); 
  	  Thread.sleep(6000); 
  	  
  	//Click on Fourth Component Tab button
  	  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[4]");
  	  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[4]"); 
  	  Thread.sleep(6000);
  	  
  	//Click on Fifth Component Tab button
  	  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[5]");
  	  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[5]"); 
  	  Thread.sleep(6000);
  	  
  	//Click on Sixth Component Tab button
  	  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[6]");
  	  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[6]"); 
  	  Thread.sleep(6000);
  	  
  	//Click on Sixth Component Tab button
  	  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[7]");
  	  clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[1]/div/button[7]"); 
  	  Thread.sleep(6000);
  	  
  	  /*ArrowDown();
  	  ArrowDown();
  	  ArrowDown();
  	  ArrowDown();
  	  ArrowDown();
  	  ArrowDown();
  	  ArrowDown();
  	  ArrowDown();
  	  Thread.sleep(6000);   */	  
  	  
  	      
  	  //Click on Close Pop-up Window
  	  assertTextXpath("html/body/div[4]/div/div/div[1]/button");
  	  clickByXpath("html/body/div[4]/div/div/div[1]/button");     
  	  Reporter.log("Click on Create & Select Button in Component Groups Tab");
  	  Thread.sleep(6000);
  	  Thread.sleep(6000);
  	     
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
  	        Thread.sleep(6000); 
  	        Thread.sleep(6000); 
  	        
  	  }
      
      @Test(priority=35, enabled = true)
  	  public void Disable_sunset_Status_CreateAsset() throws IOException, InterruptedException {
  		  
      	
      	
  		    Thread.sleep(6000);
  		    //Thread.sleep(6000);
  		    //Thread.sleep(6000);
  		   	      
  		  //Select New button for the Asset Inventory List Page
  		    assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  		    Reporter.log("Click on New Button | ");
  		    Thread.sleep(6000);
  		    Thread.sleep(6000);
  	         
  	      //Create New Asset started filling data for Asset   
  	      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
  	      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", Disable_sunset);
  	      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
  	      Thread.sleep(6000);
  	      //Thread.sleep(6000);
  	      
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
  	      Thread.sleep(6000);
  	      		        
  		        //Uncheck the Add neww Asset checkbox
  		        assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
  	          clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
  	          Thread.sleep(6000);    
  	          
  	          //Select Value from Drop-down
  	          Thread.sleep(2000);
  	          selectByXpath_Visibletext("//*[@id='save_as']", "Disabled/Sunset");  
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
      
      @Test(priority=36, enabled = true)
  	  public void Prepoduction_Staus_CreateAsset() throws IOException, InterruptedException {
  		  
  		    Thread.sleep(6000);
  		    //Thread.sleep(6000);
  		    //Thread.sleep(6000);
  		   	      
  		  //Select New button for the Asset Inventory List Page
  		    assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  		    clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[1]/button[1]");
  		    Reporter.log("Click on New Button | ");
  		    Thread.sleep(6000);
  		    Thread.sleep(6000);
  	         
  	      //Create New Asset started filling data for Asset   
  	      assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input");
  	      sendvaluebyxpath("//*[@id='asset-form']/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input", PreProduction);
  	      Reporter.log("Create Form Page is displayed and started filling datas for Asset | ");      
  	      Thread.sleep(6000);
  	      //Thread.sleep(6000);
  	      
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
  	      Thread.sleep(4000);  
  		        
  		        //Uncheck the Add neww Asset checkbox
  		        assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
  	          clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
  	          Thread.sleep(6000);    
  	          
  	          //Select Value from Drop-down
  	          Thread.sleep(2000);
  	          selectByXpath_Visibletext("//*[@id='save_as']", "Pre-Production");  
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
     
   
   @Test(priority=37, enabled = true)
   public void EditBtn_AssetInventoryList() throws InterruptedException, IOException
   {
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);
  	    
  	    // Select one of the added Asset in Asset Inventory List
  	    assertTextXpath("//*[@id='assets']/tbody/tr[2]/td[3]");
  	    clickByXpath("//*[@id='assets']/tbody/tr[2]/td[3]");
       Reporter.log("Select one of the added Asset in Asset Inventory List | ");
       Thread.sleep(6000); 
  	  
       // Click on Edit button for listed Asset
       clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[2]");
       Thread.sleep(6000);
       clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/ul/li[2]/a");
       Reporter.log("Click on Edit button for listed Asset | ");
  	    Thread.sleep(8000);
  	    Thread.sleep(8000);
  	    
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
  	     
  	     //Click on Review Grouping for Next Component Type button
  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
  	     Thread.sleep(6000);
  	     
  	   //Click on Close button
  	     assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button");
  	     clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div/div[3]/div/div[2]/button"); 
  	     Thread.sleep(8000);     
  	     Thread.sleep(8000); 
        
          // click on Done button and save
          	assertTextXpath("//*[@id='submitButton']/div[2]/button[2]");
              clickByXpath("//*[@id='submitButton']/div[2]/button[2]");  
              Reporter.log("Successfully Asset created | ");
          Thread.sleep(8000); 
          Thread.sleep(8000); 
          Thread.sleep(6000); 
          Thread.sleep(6000); 
   }
   
   @Test(priority=38, enabled = true)
   public void DeleteBtn_AssetInventoryList() throws InterruptedException, IOException
   {
  	    
  	    // Select one of the added Asset in Asset Inventory List
  	    assertTextXpath("//*[@id='assets']/tbody/tr[1]/td[2]");
  	    clickByXpath("//*[@id='assets']/tbody/tr[1]/td[2]");
        Reporter.log("Select one of the added Asset in Asset Inventory List | ");
        Thread.sleep(8000); 
        //Thread.sleep(6000); 
        
        // Click on Delete button for listed Asset
        assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[1]/span");
        clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[1]/span");
        Reporter.log("Click on Delete button for listed Asset | ");
  	    Thread.sleep(6000);
  	    
  	    //Click on Cancel button 
  	   assertTextXpath("//div[4]/div[3]/button[2]");
        clickByXpath("//div[4]/div[3]/button[2]");
        Reporter.log("Click on Cancel button | ");
  	    Thread.sleep(8000);
  	    //Thread.sleep(6000);
  	   	    
  	  /* // Click on Delete button for listed Asset
        assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[1]/span");
        clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[2]/a[1]/span");
        Reporter.log("Click on Delete button for listed Asset | ");
  	    Thread.sleep(6000);
  	    
  	    // Click on Delete Button in warning Pop-up
  	    assertTextXpath("//div[4]/div[3]/button");
          clickByXpath("//div[4]/div[3]/button");
          Reporter.log("Click on Delete Button in warning Pop-up | ");
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);*/
   }
   

   @Test(priority=39, enabled = true)
   public void ExportBtn_AssetInventoryList() throws InterruptedException, IOException
   {
  	
  	 refreshpage();
  	 Thread.sleep(8000);
  	 Thread.sleep(8000);
  	 
  	 
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
   }
   
   @Test(priority=40, enabled = true)
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
   
   @Test(priority=41, enabled = true)
   public void Search_AssetInventoryList() throws InterruptedException, IOException
   {
  	 Thread.sleep(6000);
  	 
  	 // Enter some text in Search Text-box
  	    assertTextXpath("//*[@id='assets_filter']/label/input");
     sendvaluebyxpath("//*[@id='assets_filter']/label/input", "New");
     Reporter.log("Enter some text in Search Text-box | ");
     Thread.sleep(6000);
  	    //Thread.sleep(6000);
  	    
  	 // Clear the Enter some text in Search Text-box
  	    assertTextXpath("//*[@id='assets_filter']/label/input");
     sendvaluebyxpath("//*[@id='assets_filter']/label/input", "");
     Reporter.log("Clear the Enter some text in Search Text-box | ");
     enter();
     Thread.sleep(6000);
     Thread.sleep(6000);
        
   }
   
   @Test( priority=42, enabled = true)
   public void Sorting_AssetInventoryList() throws InterruptedException, IOException {
   
  	  	    
  	    // Click on Asset Name column Header to sort for Ascending order
  	    //clickByXpath("//*[@id='assets']/thead/tr/th[2]");
  	    Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
  	    Thread.sleep(6000);	
  	    sortascen("//*[@id='assets']/tbody/tr[*]/td[2]"); //Get the Column count and values
  	    Thread.sleep(6000);			    
  	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
  	    
  	    // Click on Asset Name column Header to sort for Descending order
  	    clickByXpath("//*[@id='assets']/thead/tr/th[2]");
  	    Reporter.log("Click on Asset Name column Header to sort for Descending order  | ");
  	    Thread.sleep(6000);	
  	    sortdesc("//*[@id='assets']/tbody/tr[*]/td[2]"); //Get the Column count and values
  	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);
  	    
  	    // Click on Asset Description column Header to sort for Ascending order
  	    clickByXpath("//*[@id='assets']/thead/tr/th[3]");
  	    Reporter.log("Click on Asset Description column Header to sort for Ascending order  | ");
  	    Thread.sleep(6000);
  	    sortascen("//*[@id='assets']/tbody/tr[*]/td[3]"); //Get the Column count and values
  	    Thread.sleep(6000);			    
  	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
  	    
  	    // Click on Asset Description column Header to sort for Descending order
  	    clickByXpath("//*[@id='assets']/thead/tr/th[3]");
  	    Reporter.log("Click on Asset Description column Header to sort for Descending order  | ");
  	    Thread.sleep(6000);	
  	    sortdesc("//*[@id='assets']/tbody/tr[*]/td[3]"); //Get the Column count and values
  	    //sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
  	    Thread.sleep(6000);
  	    Thread.sleep(6000);   
  	    
  	    
   }
   
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }
	
}
