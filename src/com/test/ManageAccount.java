package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class ManageAccount extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	 	 
	   @Test(priority=67, enabled = true)
	   public void UserList() throws IOException, InterruptedException {
		 
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		
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
		
		//Click on User management Sub-Module
		assertTextXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[3]/a/span[2]");
		clickByXpath("//*[@id='sidebar-left']/ul/li[9]/ul/li[3]/a/span[2]");
		Reporter.log("Click on User management Sub-Module | ");
		Thread.sleep(3000);
		//Thread.sleep(3000);		
		
		//Click on User List under User management Sub-Module
		assertTextLink("User List");
		clickBylinktext("User List");
		Reporter.log("Click on User List under User management Sub-Module | ");
		Thread.sleep(5000);
		//Thread.sleep(3000);
		Thread.sleep(3000);
		   
		//Click on New Button to add User
		assertTextXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
		clickByXpath("//*[@id='user-management_wrapper']/div[1]/div[1]/div/a[1]");
		Reporter.log("Click on New Button to add User | ");
		Thread.sleep(5000);
		//Thread.sleep(3000);
		//Thread.sleep(3000);
		
		//Enter the Value for First name
		assertTextXpath("//div/div/div/input");
		sendvaluebyxpath("//div/div/div/input", "IRM|Analysis User");
		Reporter.log("Enter the Value for First name | ");
		Thread.sleep(3000);
		
		//Enter Email address	
		assertTextXpath("//div[2]/div/div/input");
		sendvaluebyxpath("//div[2]/div/div/input", "uma45@sybrant.com");
		Reporter.log("Enter Email address | ");
		Thread.sleep(3000);
		
		//Enter Phone number
		assertTextXpath("//*[@id='phone']");
		sendvaluebyxpath("//*[@id='phone']", "9234244399");
		Reporter.log("Enter Phone number | ");
		Thread.sleep(3000);
		
		//Enter the Last name
		assertTextXpath("//div[2]/div/input");
		sendvaluebyxpath("//div[2]/div/input", "Project");
		Reporter.log("Enter the Last name | ");
		Thread.sleep(3000);
		
		//Enter the Job Title
		assertTextXpath("//div[2]/div[2]/div/input");
		sendvaluebyxpath("//div[2]/div[2]/div/input", "Media");
		Reporter.log("Enter the Job Title | ");
		Thread.sleep(3000);
		
		//Click on Account Owner
		clickByXpath("//*[@id='account_owner']");
		Reporter.log("Click on Account Owner | ");
		Thread.sleep(3000);
		//Thread.sleep(3000);
		
		//Click on Show Password Link
		assertTextXpath("//div[3]/div/a[2]");
		clickByXpath("//div[3]/div/a[2]");
		Reporter.log("Click on Show Password Link | ");
		Thread.sleep(3000);
		//Thread.sleep(3000);
		
		//Enter the Password
		assertTextXpath("//cw-password/div/div[2]/div/div/div/input[2]");
		sendvaluebyxpath("//cw-password/div/div[2]/div/div/div/input[2]", "Uma@12345");
		Reporter.log("Enter the Password | ");
		Thread.sleep(3000);
		//Thread.sleep(3000);
		
		//Enter the Confirmation Password
		assertTextXpath("//cw-password/div/div[2]/div[2]/div/div/input");
		sendvaluebyxpath("//cw-password/div/div[2]/div[2]/div/div/input", "Uma@12345");
		Reporter.log("Enter the Confirmation Password | ");
		Thread.sleep(3000);
		//Thread.sleep(3000);
	    	
	     //Click on Save Button
		assertTextXpath("//div[3]/div/button");
		clickByXpath("//div[3]/div/button");
		Reporter.log("Click on Save button |");
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		Thread.sleep(5000);
		
	   }		
		   	
}	
		