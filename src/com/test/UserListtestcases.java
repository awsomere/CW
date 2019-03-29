package com.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UserListtestcases extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  
	  String EmailID = "Autouser@syb.com";
	  String UserPassword ="Sybrant@12345";
	  String AUserID ="AUUser@syb.com";
	  String AUserName ="AnalysisName";
	  String EUserID ="EUUser@syb.com";
	  String EUserName ="EAOName";
	  String RUserID ="RUUser@syb.com";
	  String RUserName ="ReadonlyName";
	  String CUserID ="CUUser@syb.com";
	  String CUserName ="CustomName";
	  
	  
	  @Test(priority=75, enabled = true)
	   public void NavigationPage_UserManagement() throws InterruptedException, IOException
		 {     
			     Thread.sleep(8000); 
			     Thread.sleep(8000);
				  
				   //Close Dashboard 
			 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
					clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
					Thread.sleep(5000);
				  
				     //Click on Full screen
			 	    assertTextXpath("//*[@id='fullscreen']/i");
					clickByXpath("//*[@id='fullscreen']/i");
					Thread.sleep(5000);
							   
					// Testcase 1
				   //Click on Manage Account Module
					assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
					clickByXpath("//*[@id='sidebar-left']/ul/li[9]/a/span[2]");
					Reporter.log("Click on Manage Account Module | ");
					Thread.sleep(3000);
					//Thread.sleep(3000);
					
					//Click on UserManagement
					assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[5]/a/span[2]");
					clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[5]/a/span[2]");
					Reporter.log("Click on  | ");
					Thread.sleep(3000);
					//Thread.sleep(3000);
					
		 }
	  
	  @Test(priority=75, enabled = true)
	   public void NavigationPage_UserList() throws InterruptedException, IOException
		 {  
					
					//Click on User List
					assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[5]/ul/li[1]/a");
					clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[5]/ul/li[1]/a");
					Reporter.log("Click on  | ");
					Thread.sleep(8000);
					Thread.sleep(8000);
					Thread.sleep(8000);
					
					
		 }
	  
	  @Test(priority=76, enabled = true)
		 public void PageHearder_UserList() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000);
			   
			   // Click on Page header Icon
			   assertTextXpath("//h2/i");
			   Reporter.log("Click on Page header Icon | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//h2/i");
			   Thread.sleep(2000);
			   
			   // Click on Page header Title
			   assertEquals("//h2", "User List");
			   Reporter.log("Click on Page header Title | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//h2");
			   Thread.sleep(2000);
		 }
		 
		 @Test(priority=77, enabled = true)
		 public void PanelBar_UserList() throws IOException, InterruptedException {
				   
			   Thread.sleep(6000);
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Manage Account User Management User List");
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
				
		 
		 @Test(priority=79, enabled = true)
		 public void ChkFields_UserList() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000); 
			// Click on Page breadcrumb			 
			   assertEquals("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]/span", "New");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   
			// Click on Page breadcrumb
			   assertEquals("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[2]/span", "Edit");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   
			// Click on Page breadcrumb
			   assertEquals("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[3]/span", "Delete");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   
			   
		 }
		 
		 @Test(priority=79, enabled = true)
		 public void NewUser_UserList() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000); 		 
					
					//Click on New button
					assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]/span");
					clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]/span");
					Reporter.log("Click on New button | ");
					Thread.sleep(8000);
					Thread.sleep(5000);
					
		 }
		 
		 @Test(priority=76, enabled = true)
		 public void PageHearder_CreateUser() throws IOException, InterruptedException {
			   
			   Thread.sleep(6000);
			   
			   // Click on Page header Icon
			   assertTextXpath("//h2/i");
			   Reporter.log("Click on Page header Icon | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//h2/i");
			   Thread.sleep(2000);
			   
			   // Click on Page header Title
			   assertEquals("//h2", "Create User");
			   Reporter.log("Click on Page header Title | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//h2");
			   Thread.sleep(2000);
		 }
		 
		 @Test(priority=77, enabled = true)
		 public void PanelBar_CreateUser() throws IOException, InterruptedException {
				   
			   Thread.sleep(6000);
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Manage Account User Management User List Create User");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(2000); 
			   
		 }
		 
		 @Test(priority=78, enabled = true)
		 public void PageLevelHelp_CreateUser() throws IOException, InterruptedException {
			   
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
		 public void RiskManagementMap_CreateUser() throws IOException, InterruptedException {
			   
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
		 
		 @Test(priority=79, enabled = true)
		 public void CraeteNewUser_UserList() throws IOException, InterruptedException {
			   
			//Enter First name
		     sendvaluebyxpath("//*[@id='firstName']", "Automation FirstUser");
		     Reporter.log("Enter First name | ");
		     Thread.sleep(2000);
		     //Thread.sleep(3000);
		     
		   //Enter Last name
		     sendvaluebyxpath("//*[@id='lastName']", "LastUser");
		     Reporter.log("Enter Last name | ");
		     Thread.sleep(2000);
		     //Thread.sleep(3000);   		     
	
		     		     
		     //Enter the Email
		     sendvaluebyxpath("//*[@id='email']", EmailID);
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(2000);	
		     //Thread.sleep(3000);
		     
		   //Enter the Job 
		     sendvaluebyxpath("//*[@id='jobTitle']", "Auto Job");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(2000);	
		     //Thread.sleep(3000);
		     
		   //Enter the Phone number
		     sendvaluebyxpath("//*[@id='phone']", "9876543212");
		     Reporter.log("Enter the Phone number | ");
		     Thread.sleep(2000);	
		     //Thread.sleep(3000);
		     
		     //Select the EAO Checkbox
		     //assertTextXpath("//*[@id='users-management-form']/div[1]/div[2]/div[4]/div/div/div/label");
		     clickByXpath("//*[@id='users-management-form']/div[1]/div[2]/div[4]/div/div/div");
		     Reporter.log("Select the EAO Checkbox | ");
		     Thread.sleep(2000);
		     //Thread.sleep(3000);
		     
		     ArrowDown();
		     ArrowDown();
		     Thread.sleep(5000);
		     
		   //Click on Show Password Link
			    assertTextXpath("//*[@id='show-password']");
			    clickByXpath("//*[@id='show-password']");
			    Reporter.log("Click on Show Password Link | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Password
			    assertTextXpath("//*[@id='new_password']");
			    sendvaluebyxpath("//*[@id='new_password']", UserPassword );
			    Reporter.log("Enter the Password | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Confirmation Password
			    assertTextXpath("//*[@id='new_password_confirm']");
			    sendvaluebyxpath("//*[@id='new_password_confirm']", UserPassword);
			    Reporter.log("Enter the Confirmation Password | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			   
			    ArrowDown();
			    ArrowDown();
			    ArrowDown();
			    ArrowDown();
			    Thread.sleep(8000);
	
		     
		     // Click on Save button
		     assertTextXpath("//*[@id='submit-button']/span[1]");
		     clickByXpath("//*[@id='submit-button']/span[1]");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
		     
		 }
		 
		 
		 @Test(priority=79, enabled = true)
		 public void SearchUser_UserList() throws IOException, InterruptedException {
			   
			 //Enter the text in Search textbox
		     sendvaluebyxpath("//*[@id='user-management_filter']/label/input", EmailID);
		     Reporter.log("Enter the text in Search textbox  | ");
		     Thread.sleep(2000);	
		     			 
		 }
		 
		 
		 @Test(priority=79, enabled = true)
		 public void EditUser_UserList() throws IOException, InterruptedException {
			   
		 
			 // Select the listed User
		     assertTextXpath("//*[@id='user-management']/tbody/tr/td[1]");
		     clickByXpath("//*[@id='user-management']/tbody/tr/td[1]");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(8000);
		     
		     //Click on Edit button
		     assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[2]/span");
		     clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[2]/span");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(8000);
		     
		   //Enter First name
		     sendvaluebyxpath("//*[@id='firstName']", "Edit Automation FirstUser");
		     Reporter.log("Enter First name | ");
		     Thread.sleep(2000);
		     //Thread.sleep(3000);
		     
		   //Enter Last name
		     sendvaluebyxpath("//*[@id='lastName']", "Edit LastUser");
		     Reporter.log("Enter Last name | ");
		     Thread.sleep(2000);
		     //Thread.sleep(3000);   		     
	
		     		     
		     //Enter the Email
		     sendvaluebyxpath("//*[@id='email']", EmailID);
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(2000);	
		     //Thread.sleep(3000);
		     
		   //Enter the Job 
		     sendvaluebyxpath("//*[@id='jobTitle']", "Edit Auto Job");
		     Reporter.log("Select Sub-Industry Type from drop-down | ");
		     Thread.sleep(2000);	
		     //Thread.sleep(3000);
		     
		   //Enter the Phone number
		     sendvaluebyxpath("//*[@id='phone']", "8476543212");
		     Reporter.log("Enter the Phone number | ");
		     Thread.sleep(2000);	
		     //Thread.sleep(3000);		
		     

			    ArrowDown();
			    ArrowDown();
			    ArrowDown();
			    ArrowDown();
			    Thread.sleep(8000);
	
		     
		     // Click on Save button
		     assertTextXpath("//*[@id='submit-button']/span[1]");
		     clickByXpath("//*[@id='submit-button']/span[1]");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(8000);
		     Thread.sleep(8000);
			     
		 }			  
		 
		 @Test(priority=79, enabled = true)
		 public void DeleteUser_UserList() throws IOException, InterruptedException {
			   
			 //Enter the text in Search textbox
		     sendvaluebyxpath("//*[@id='user-management_filter']/label/input", "new");
		     Reporter.log("Enter the text in Search textbox  | ");
		     Thread.sleep(2000);	
		     
		     // Select the listed User
		     assertTextXpath("//*[@id='user-management']/tbody/tr/td[1]");
		     clickByXpath("//*[@id='user-management']/tbody/tr/td[1]");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(8000);
		     
		     //Click on Delete button
		     assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[3]/span");
		     clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[3]/span");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(8000);
		     
		   //Click on Cancel button in Delete warning pop-up
		     assertTextXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[2]");
		     clickByXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[2]");
		     Reporter.log("Click on Save button | ");
		     Thread.sleep(8000);
		     
    }
		 
		 @Test(priority=1, enabled = true)
		   public void CustomRoleUser_UserList() throws IOException, InterruptedException {
			 
			   Thread.sleep(8000);
		 
		 //Click on New Button to add User
		    assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New Button to add User | ");
		    Thread.sleep(5000);
		    //Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Enter the Value for First name
		    assertTextXpath("//div/div/div/input");
		    sendvaluebyxpath("//div/div/div/input", CUserName);
		    Reporter.log("Enter the Value for First name | ");
		    Thread.sleep(3000);
		    
		    //Enter Email address	
		    assertTextXpath("//div[2]/div/div/input");
		    sendvaluebyxpath("//div[2]/div/div/input", CUserID);
		    Reporter.log("Enter Email address | ");
		    Thread.sleep(3000);
		    
		    //Enter Phone number
		    assertTextXpath("//*[@id='phone']");
		    sendvaluebyxpath("//*[@id='phone']", "9234244399");
		    Reporter.log("Enter Phone number | ");
		    Thread.sleep(3000);
		   
		    //Enter the Last name
		    assertTextXpath("//div[2]/div/input");
		    sendvaluebyxpath("//div[2]/div/input", "User");
		    Reporter.log("Enter the Last name | ");
		    Thread.sleep(3000);
	
		    //Enter the Job Title
		    assertTextXpath("//div[2]/div[2]/div/input");
		    sendvaluebyxpath("//div[2]/div[2]/div/input", "Job");
		    Reporter.log("Enter the Job Title | ");
		    Thread.sleep(3000);
		    
		    //Click on Show Password Link
		    assertTextXpath("//*[@id='show-password']");
		    clickByXpath("//*[@id='show-password']");
		    Reporter.log("Click on Show Password Link | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Enter the Password
		    assertTextXpath("//*[@id='new_password']");
		    sendvaluebyxpath("//*[@id='new_password']", UserPassword );
		    Reporter.log("Enter the Password | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Enter the Confirmation Password
		    assertTextXpath("//*[@id='new_password_confirm']");
		    sendvaluebyxpath("//*[@id='new_password_confirm']", UserPassword);
		    Reporter.log("Enter the Confirmation Password | ");
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
		    Thread.sleep(8000);
		    
		    //Select the ReadOnly access for this user
		   // selectByXpath_Visibletext("//*[@id='locTable']/tbody/tr[2]/td[2]/select", "Customer Role");  
		    assertTextXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
			clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
			Reporter.log("Click on Account drop-down  | ");
			Thread.sleep(3000);
			clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select/option[5]");
			Thread.sleep(8000);
			clickByXpath("//*[@id='show-password']");
			Thread.sleep(2000);
		    
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
	    
		    //Click on Save Button
		    assertTextXpath("//*[@id='submit-button']");
		    clickByXpath("//*[@id='submit-button']");
		    Reporter.log("Click on Save button |");
		    Thread.sleep(8000);
		    Thread.sleep(3000);
	  }
		 
		 @Test(priority=126, enabled = true)
		   public void Create_ReadOnly_IRMAnalysis() throws IOException, InterruptedException {
			 
			   Thread.sleep(8000);
			   
			   //Click on New Button to add User
			    assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
			    clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
			    Reporter.log("Click on New Button to add User | ");
			    Thread.sleep(5000);
			    //Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Value for First name
			    assertTextXpath("//div/div/div/input");
			    sendvaluebyxpath("//div/div/div/input", RUserName);
			    Reporter.log("Enter the Value for First name | ");
			    Thread.sleep(3000);
			    
			    //Enter Email address	
			    assertTextXpath("//div[2]/div/div/input");
			    sendvaluebyxpath("//div[2]/div/div/input", RUserID);
			    Reporter.log("Enter Email address | ");
			    Thread.sleep(3000);
			    
			    //Enter Phone number
			    assertTextXpath("//*[@id='phone']");
			    sendvaluebyxpath("//*[@id='phone']", "9234244399");
			    Reporter.log("Enter Phone number | ");
			    Thread.sleep(3000);
			   
			    //Enter the Last name
			    assertTextXpath("//div[2]/div/input");
			    sendvaluebyxpath("//div[2]/div/input", "User");
			    Reporter.log("Enter the Last name | ");
			    Thread.sleep(3000);
		
			    //Enter the Job Title
			    assertTextXpath("//div[2]/div[2]/div/input");
			    sendvaluebyxpath("//div[2]/div[2]/div/input", "Job");
			    Reporter.log("Enter the Job Title | ");
			    Thread.sleep(3000);
			    
			    //Click on Show Password Link
			    assertTextXpath("//*[@id='show-password']");
			    clickByXpath("//*[@id='show-password']");
			    Reporter.log("Click on Show Password Link | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Password
			    assertTextXpath("//*[@id='new_password']");
			    sendvaluebyxpath("//*[@id='new_password']", UserPassword );
			    Reporter.log("Enter the Password | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Confirmation Password
			    assertTextXpath("//*[@id='new_password_confirm']");
			    sendvaluebyxpath("//*[@id='new_password_confirm']", UserPassword);
			    Reporter.log("Enter the Confirmation Password | ");
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
			    Thread.sleep(8000);
			    
			    //Select the ReadOnly access for this user
			   // selectByXpath_Visibletext("//*[@id='locTable']/tbody/tr[2]/td[2]/select", "Customer Role");  
			    assertTextXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
				clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
				Reporter.log("Click on Account drop-down  | ");
				Thread.sleep(3000);
				clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select/option[4]");
				Thread.sleep(8000);
				clickByXpath("//*[@id='show-password']");
				Thread.sleep(2000);
			    
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
		    
			    //Click on Save Button
			    assertTextXpath("//*[@id='submit-button']");
			    clickByXpath("//*[@id='submit-button']");
			    Reporter.log("Click on Save button |");
			    Thread.sleep(8000);
			    //Thread.sleep(3000);
			   
		 }
		 
		 @Test(priority=149, enabled = true)
		   public void Create_EAOUser_IRMAnalysis() throws IOException, InterruptedException {
			 
			   Thread.sleep(8000);
			   
			 //Click on New Button to add User
			    assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
			    clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
			    Reporter.log("Click on New Button to add User | ");
			    Thread.sleep(5000);
			    //Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Value for First name
			    assertTextXpath("//div/div/div/input");
			    sendvaluebyxpath("//div/div/div/input", EUserName);
			    Reporter.log("Enter the Value for First name | ");
			    Thread.sleep(3000);
			    
			    //Enter Email address	
			    assertTextXpath("//div[2]/div/div/input");
			    sendvaluebyxpath("//div[2]/div/div/input", EUserID);
			    Reporter.log("Enter Email address | ");
			    Thread.sleep(3000);
			    
			    //Enter Phone number
			    assertTextXpath("//*[@id='phone']");
			    sendvaluebyxpath("//*[@id='phone']", "9234244399");
			    Reporter.log("Enter Phone number | ");
			    Thread.sleep(3000);
			   
			    //Enter the Last name
			    assertTextXpath("//div[2]/div/input");
			    sendvaluebyxpath("//div[2]/div/input", "User");
			    Reporter.log("Enter the Last name | ");
			    Thread.sleep(3000);
		
			    //Enter the Job Title
			    assertTextXpath("//div[2]/div[2]/div/input");
			    sendvaluebyxpath("//div[2]/div[2]/div/input", "Job");
			    Reporter.log("Enter the Job Title | ");
			    Thread.sleep(3000);
			    
			    //Click on Show Password Link
			    assertTextXpath("//*[@id='show-password']");
			    clickByXpath("//*[@id='show-password']");
			    Reporter.log("Click on Show Password Link | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Password
			    assertTextXpath("//*[@id='new_password']");
			    sendvaluebyxpath("//*[@id='new_password']", UserPassword );
			    Reporter.log("Enter the Password | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Confirmation Password
			    assertTextXpath("//*[@id='new_password_confirm']");
			    sendvaluebyxpath("//*[@id='new_password_confirm']", UserPassword);
			    Reporter.log("Enter the Confirmation Password | ");
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
			    Thread.sleep(8000);
			    
			    //Select the ReadOnly access for this user
			   // selectByXpath_Visibletext("//*[@id='locTable']/tbody/tr[2]/td[2]/select", "Customer Role");  
			    assertTextXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
				clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
				Reporter.log("Click on Account drop-down  | ");
				Thread.sleep(3000);
				clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select/option[3]");
				Thread.sleep(8000);
				clickByXpath("//*[@id='show-password']");
				Thread.sleep(2000);
			    
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
		    
			    //Click on Save Button
			    assertTextXpath("//*[@id='submit-button']");
			    clickByXpath("//*[@id='submit-button']");
			    Reporter.log("Click on Save button |");
			    Thread.sleep(8000);
			    //Thread.sleep(3000);

}
		 
		 @Test(priority=102, enabled = true)
		   public void Create_AnalystRole_IRMAnalysis() throws IOException, InterruptedException {
			 
			   Thread.sleep(8000);
			   

			    //Click on New Button to add User
			    assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
			    clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
			    Reporter.log("Click on New Button to add User | ");
			    Thread.sleep(5000);
			    //Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Value for First name
			    assertTextXpath("//div/div/div/input");
			    sendvaluebyxpath("//div/div/div/input", AUserName);
			    Reporter.log("Enter the Value for First name | ");
			    Thread.sleep(3000);
			    
			    //Enter Email address	
			    assertTextXpath("//div[2]/div/div/input");
			    sendvaluebyxpath("//div[2]/div/div/input", AUserID);
			    Reporter.log("Enter Email address | ");
			    Thread.sleep(3000);
			    
			    //Enter Phone number
			    assertTextXpath("//*[@id='phone']");
			    sendvaluebyxpath("//*[@id='phone']", "9234244399");
			    Reporter.log("Enter Phone number | ");
			    Thread.sleep(3000);
			   
			    //Enter the Last name
			    assertTextXpath("//div[2]/div/input");
			    sendvaluebyxpath("//div[2]/div/input", "User");
			    Reporter.log("Enter the Last name | ");
			    Thread.sleep(3000);
		
			    //Enter the Job Title
			    assertTextXpath("//div[2]/div[2]/div/input");
			    sendvaluebyxpath("//div[2]/div[2]/div/input", "Job");
			    Reporter.log("Enter the Job Title | ");
			    Thread.sleep(3000);
			    
			    //Click on Show Password Link
			    assertTextXpath("//*[@id='show-password']");
			    clickByXpath("//*[@id='show-password']");
			    Reporter.log("Click on Show Password Link | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Password
			    assertTextXpath("//*[@id='new_password']");
			    sendvaluebyxpath("//*[@id='new_password']", UserPassword );
			    Reporter.log("Enter the Password | ");
			    Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    //Enter the Confirmation Password
			    assertTextXpath("//*[@id='new_password_confirm']");
			    sendvaluebyxpath("//*[@id='new_password_confirm']", UserPassword);
			    Reporter.log("Enter the Confirmation Password | ");
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
			    Thread.sleep(8000);
			    
			    //Select the ReadOnly access for this user
			   // selectByXpath_Visibletext("//*[@id='locTable']/tbody/tr[2]/td[2]/select", "Customer Role");  
			    assertTextXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
				clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select");
				Reporter.log("Click on Account drop-down  | ");
				Thread.sleep(3000);
				clickByXpath("//*[@id='locTable']/tbody/tr[2]/td[2]/select/option[2]");
				Thread.sleep(8000);
				clickByXpath("//*[@id='show-password']");
				Thread.sleep(2000);
			    
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
		    
			    //Click on Save Button
			    assertTextXpath("//*[@id='submit-button']");
			    clickByXpath("//*[@id='submit-button']");
			    Reporter.log("Click on Save button |");
			    Thread.sleep(8000);
			    //Thread.sleep(3000);
		  }
		 
		 @Test(priority=72, enabled = true)
		 public void InValidImportFiles_AssetInventoryImport() throws InterruptedException, IOException
		 {
			 Thread.sleep(6000);
			 
			 //click on Browse Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
		      clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
		      Reporter.log("clicked on Browser Button | ");
		      Thread.sleep(6000);
		   
		      // Using AutoIT
		      Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload19.exe"); //Uploading xls file using AutoIT
		      Reporter.log("Given Filepath of Xls file | ");
		      Thread.sleep(6000);
		      	     
		      // Click on Import Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
		      clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
		      Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
		      Thread.sleep(6000);
		      Thread.sleep(6000);
			       
		      //click on Browse Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  Reporter.log("clicked on Browser Button | ");
			  Thread.sleep(6000);
			   
			  // Using AutoIT
			  Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload21.exe"); //Uploading xls file using AutoIT
			  Reporter.log("Given Filepath of Xls file | ");
			  Thread.sleep(6000);
			      	     
			  // Click on Import Button
			  assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
			  clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
			  Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
		      Thread.sleep(6000);
		      Thread.sleep(6000);
				
		      //click on Browse Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
		      clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
		      Reporter.log("clicked on Browser Button | ");
		      Thread.sleep(6000);
		   
		      // Using AutoIT
		      Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload20.exe"); //Uploading xls file using AutoIT
		      Reporter.log("Given Filepath of Xls file | ");
		      Thread.sleep(6000);
		      	     
		      // Click on Import Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
		      clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
		      Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
		      Thread.sleep(6000);
		      Thread.sleep(6000);
			    
		      Thread.sleep(2000);   
		      //click on Browse Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  Reporter.log("clicked on Browser Button | ");
			  Thread.sleep(6000);
			   
			  // Using AutoIT
			  Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload22.exe"); //Uploading xls file using AutoIT
			  Reporter.log("Given Filepath of Xls file | ");
			  Thread.sleep(6000);
			      	     
			  // Click on Import Button
			  assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
			  clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
			  Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
		      Thread.sleep(6000);
		      Thread.sleep(6000);
				    
		      //click on Browse Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  Reporter.log("clicked on Browser Button | ");
			  Thread.sleep(6000);
			   
			  // Using AutoIT
			  Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload23.exe"); //Uploading xls file using AutoIT
			  Reporter.log("Given Filepath of Xls file | ");
			  Thread.sleep(6000);
			      	     
			  // Click on Import Button
			  assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
			  clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
			  Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
		      Thread.sleep(6000);
		      Thread.sleep(6000);
		      
		      //click on Browse Button
		      assertTextXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  clickByXpath("//*[@id='body-content']/form/div/div[2]/div[2]/span");
			  Reporter.log("clicked on Browser Button | ");
			  Thread.sleep(6000);
			   
			  // Using AutoIT
			  Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload18.exe"); //Uploading xls file using AutoIT
			  Reporter.log("Given Filepath of Xls file | ");
			  Thread.sleep(6000);
			      	     
			  // Click on Import Button
			  assertTextXpath("//*[@id='body-content']/form/div/div[3]/input");
			  clickByXpath("//*[@id='body-content']/form/div/div[3]/input");
			  Reporter.log("Successfully Uploaded 'Asset' XLS file | ");
		      Thread.sleep(6000);
		      Thread.sleep(6000);
			
		 }


}
