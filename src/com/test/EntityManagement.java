package com.test;

import org.testng.annotations.Test;
import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class EntityManagement extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	   
	  @Test(priority=1, enabled = true)
	  public void EntityList() throws IOException, InterruptedException {
	       
		  
		    Thread.sleep(3000);
			//Thread.sleep(3000);
			//Thread.sleep(3000);   
			
		   //Close Dashboard Module link 
		    assertTextXpath("html/body/section/aside/ul/li[1]/a");
			clickByXpath("html/body/section/aside/ul/li[1]/a");
			Reporter.log("Close Dashboard Module link  | ");
			Thread.sleep(3000);
			//Thread.sleep(3000);
		     
		      //Click on Manage Account Module
				assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
				clickByXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
				Reporter.log("Click on Manage Account Module | ");
				Thread.sleep(3000);
				//Thread.sleep(3000);
				     		  
				//Expand the Entity Management Sub-Module
				assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/a/span[2]");
				clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/a/span[2]");
				Reporter.log("Expand the Entity Management Sub-Module | ");
				Thread.sleep(3000); 
				//Thread.sleep(3000);
		     
		     //Click on Entity List
		     assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/ul/li[1]/a");
		     clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[2]/ul/li[1]/a");
		     Reporter.log("Click on Entity List | ");
		     Thread.sleep(5000);
		     Thread.sleep(3000);
		     
		     //Click on New Button
		     assertTextXpath("//*[@id='locations_wrapper']/div[1]/div[1]/div/a[1]/span");
		     clickByXpath("//*[@id='locations_wrapper']/div[1]/div[1]/div/a[1]/span");
		     Reporter.log("Click on New Button | ");
		     Thread.sleep(5000);
		     Thread.sleep(3000);
		     
		     //Enter Entity name
		     sendvaluebyeid("//*[@id='entity-name']", "Automation Script Entity");
		     Reporter.log("Enter Entity name | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     		     
		     //Select Industry Type from drop-down
		     selectByid_Visibletext("//*[@id='industry-type']", "Healthcare");
		     Reporter.log("Select Industry Type from drop-down | ");
		     Thread.sleep(3000);		
		     //Thread.sleep(3000);
		     
		     //Select Sub-Industry Type from drop-down
		     selectByid_Visibletext("//*[@id='clearwater-entity-type']", "Clinical Research");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     		     
		     //Select State from drop-down
		     selectByid_Visibletext("//*[@id='state']", "AZ - Arizona");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     		     
		     //Enter the Number of Employees 
		     sendvaluebyxpath("//*[@id='number_of_employees']", "1000");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(3000);	
		     //Thread.sleep(3000);
		     
		     //Select the Products IRM|Analysis™ 
		     assertTextXpath("//*[@id='locations-form']/div[2]/div[1]/div/div[2]/div[1]/div/div/label");
		     clickByXpath("//*[@id='locations-form']/div[2]/div[1]/div/div[2]/div[1]/div/div/label");
		     Reporter.log("Select the Products IRM|Analysis™  | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     /*//Select Yes for this entity be a parent and cascade data to other entities
		     assertTextXpath("//*[@id='locations-form']/div[3]/div[2]/div[2]/div/div[1]/label");
		     clickByXpath("//*[@id='locations-form']/div[3]/div[2]/div[2]/div/div[1]/label");
		     Reporter.log("Select Yes for this entity be a parent and cascade data to other entities | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);*/
		     
		     // Click on Save button
		     assertTextXpath("//*[@id='submit-button']");
		     clickByXpath("//*[@id='submit-button']");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);
	}
	  
	  @Test(priority=2, enabled = true)
	  public void EntityTags() throws IOException, InterruptedException {
		  
		    
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Click on Entity Tags
		     assertTextXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
		     clickByXpath("//*[@id='sidebar-left']/ul/li[8]/ul/li[2]/ul/li[2]/a");
		     Reporter.log("Click on Entity Tags | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);
		     
		     //Click on New Button
		     assertTextXpath("//div/a/span");
		     clickByXpath("//div/a/span");
		     Reporter.log("Click on New Button | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Enter the Entity Tag Name
		     sendvaluebyxpath("//div/input", "Automation Script Tag");
		     Reporter.log("Enter the Entity Tag Name | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Enter the Entity Tag Description
		     sendvaluebyxpath("//*[@id='entity-tags-edit-form']/div[1]/div[2]/div/input", "Automation Script Tag Description");
		     Reporter.log("Enter the Entity Tag Description | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Click on Entity Tag Category drop-down
		     assertTextXpath("//*[@id='category_chosen']/a/span");
		     clickByXpath("//*[@id='category_chosen']/a/span");
		     Reporter.log("Click on Entity Tag Category drop-down | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Select Any of Option from Entity Tag Category drop-down
		     assertTextXpath("//*[@id='category_chosen']/div/ul/li[1]");
		     clickByXpath("//*[@id='category_chosen']/div/ul/li[1]");
		     Reporter.log("Select option from Entity Tag Category drop-down | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		    
		     //Click on Save button
		     assertTextXpath("//*[@id='submit-button']");
		     clickByXpath("//*[@id='submit-button']");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);	        
	  
	  }
	  	  
	  @Test(priority=3, enabled = true)
	  public void SelectEntityFromHeader() throws IOException, InterruptedException {
		  
		     //Click on the Created new Entity drop-down from Header 
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/a/span/span[1]");
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/a/span/span[1]");
		     Reporter.log("Click on the Created new Entity drop-down from Header | ");
		     Thread.sleep(3000);
		     
		     //Enter Created Entity Name in Search box
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/ul/li[1]/input");
		     sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/ul/li[1]/input", "Automation Script Entity");
		     Reporter.log("Enter Created Entity Name in Search box | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Select the Searched Entity
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[6]/ul/li[2]/a");
		     Reporter.log("Select the Searched Entity | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     Thread.sleep(3000);

	  }
}
	  

