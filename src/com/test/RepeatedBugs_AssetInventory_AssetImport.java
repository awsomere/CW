package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RepeatedBugs_AssetInventory_AssetImport extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;

	
		  @Test(priority=75, enabled = true)
			 public void IRMA8811_EditImportFiles_AssetInventoryList() throws InterruptedException, IOException	 { 
				 
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
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    Thread.sleep(8000);
				    
				    
						// Enter some text in Search Text-box
						    assertTextXpath("//*[@id='assets_filter']/label/input");
					   sendvaluebyxpath("//*[@id='assets_filter']/label/input", "BackUp Asset");
					   Reporter.log("Enter some text in Search Text-box | ");
					   Thread.sleep(8000);
					   Thread.sleep(8000);

						    
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
					    Thread.sleep(8000);
					    Thread.sleep(8000);
					   
					     ArrowDown();
					     ArrowDown();
					ArrowDown();
					     ArrowDown();
					     Thread.sleep(8000);     
					     Thread.sleep(8000); 
					     
					     // Expand the Links
					        assertTextXpath("//*[@id='asset-form']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/span/a[1]");
					       clickByXpath("//*[@id='asset-form']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div/span/a[1]");
					       Reporter.log("Filled data for Media Devices | ");
					       Thread.sleep(6000);
					       Thread.sleep(3000);
					  	     
					       //Repeated issue IRMA-8811
					  	 // Fill data for Media Devices
					       assertTextXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
					       clickByXpath("//*[@id='Backup']/div/div[2]/div/div[2]/div/label");
					       Reporter.log("Filled data for Media Devices | ");
					       Thread.sleep(6000);
					       //Thread.sleep(6000);
					          
				       // click on Done button and save
				       	assertTextXpath("//*[@id='submitButton']/div[2]/button[2]");
				           clickByXpath("//*[@id='submitButton']/div[2]/button[2]");  
				           Reporter.log("Successfully Asset created | ");
				       Thread.sleep(8000); 
				       Thread.sleep(8000); 
				       Thread.sleep(6000); 
				       Thread.sleep(6000); 
					 }
		  
		  @Test(priority=11, enabled = true)
		   public void IRMA8737_PhysicalLoaction_Asset() throws IOException, InterruptedException {   
		     
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
		   public void IRMA8650_DupliatedCmponentGroups_AssetWizard() throws IOException, InterruptedException {   
		     
		    
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
		  }
		  
		   
	}
