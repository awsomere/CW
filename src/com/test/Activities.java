package com.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Activities extends WrapperClass {

	 public WebDriver driver;
	 String browser=null;
	 String Activity_Name= "ZZDemosk1";
	 String EditActivity_Name= "ZZDemosk1 - Edit";
	 String NoRoleSeleted = "Asset Inventory List Activity";
	 
	 
	 @Test(priority=226, enabled = true)
	   public void Nagivate_NewActivties() throws InterruptedException, IOException
	   {
		      
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(5000);
		    
		    //Click on Full Screen Button 
	        assertTextXpath("//a[2]/i");
	        clickByXpath("//a[2]/i");
	        Reporter.log("Click on Full Screen Button  | ");
	        Thread.sleep(7000);
		    		   		    		    		    
		    //Select the Activities module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
		    Reporter.log("Selected the Document module at sidebar-left | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);		
		    
		    //Select the Activities module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[1]/a");  	
		    Reporter.log("Selected the Document module at sidebar-left | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);		 
		    
	   }
	 
	 @Test(priority=227, enabled = true)
	   public void PageHearder_ActivitiesManager() throws IOException, InterruptedException {
		   
		   Thread.sleep(5000);
		   
		   // Click on Page header Icon
		   assertTextXpath("//h2/i");
		   Reporter.log("Click on Page header Icon | ");
		   Thread.sleep(1000);
		   mouseHoverByXpath("//h2/i");
		   Thread.sleep(1000);
		   
		   // Click on Page header Title
		   AssertJUnit.assertEquals("//h2", "Activities Manager");
		   Reporter.log("Click on Page header Title | ");
		   Thread.sleep(1000);
		   mouseHoverByXpath("//h2");
		   Thread.sleep(1000);
	   }
	   
	   @Test(priority=228, enabled = true)
	   public void PanelBar_ActivitiesManager() throws IOException, InterruptedException {
			   
		   Thread.sleep(6000);
		   // Click on Page breadcrumb
		   AssertJUnit.assertEquals("//ol", "Activities Activities Manager");
		   //assertEquals("//ol", "Assets Asset Inventory List");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
	   }
	   
	   @Test(priority=229, enabled = true)
	   public void PageLevelHelp_ActivitiesManager() throws IOException, InterruptedException {
		   
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
		
	   @Test(priority=230, enabled = true)
	   public void RiskManagementMap_ActivitiesManager() throws IOException, InterruptedException {
		   
		   Thread.sleep(6000); 
		   
		   // Click on Risk Management Map
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
		   Reporter.log("Click on Risk Management Map | ");
		   Thread.sleep(6000);
		   clickByXpath("html/body/div[4]/div/div/div[2]/button");
		   Thread.sleep(6000);
	   }
	   
	   @Test(priority=231, enabled = true)
	   public void Enable_NewActivityButton() throws InterruptedException, IOException
	   {
	   
		 //Enable the Edit the button
		 EnabledTextByXpath("//*[@id='activities-manager-helper-bar']/button[1]");
		 Thread.sleep(3000); 
		   
	   }
	 
	 @Test(priority=231, enabled = true)
	   public void CreateEmptyActivity_NewActivties() throws InterruptedException, IOException
	   {
		 
		 // Click on New Activity Button
	 	    assertTextXpath("//div[4]/div/div/div[2]/button");
	        clickByXpath("//div[4]/div/div/div[2]/button");
	        Reporter.log("Click on Upload Button | ");
	        Thread.sleep(8000);
	        Thread.sleep(8000);
	        
	     // Click on Save Button
		    assertTextXpath("//*[@id='submit-button']");
		    clickByXpath("//*[@id='submit-button']");
		    Reporter.log("Click on Save Button | ");
		    Thread.sleep(8000);
		    Thread.sleep(5000);
		    
		    /*//Thread.sleep(3000); 
			//Check the Modules
		    assertEquals("html/body/div[7]/div/div/div[1]/div/h4", "Forbidden");
		    Thread.sleep(3000); 
		    Thread.sleep(3000);*/ 
			    
		    //CLick on Ok button
		    clickByXpath("html/body/div[7]/div/div/div[2]/button");
		    Thread.sleep(6000); 
			    
		    //CLick on Close button
		    clickByXpath("html/body/div[4]/div/div/div[1]/button");
		    Thread.sleep(8000); 
		    Thread.sleep(8000); 
		    
		 }
	 
	 
	    
	 @Test(priority=232, enabled = true)
	   public void NoRoleSeleted_NewActivties() throws InterruptedException, IOException
	  
	 {
		 
		
		 Thread.sleep(8000); 
		 Thread.sleep(8000); 
		 
	   // Click on New Activity Button
	    assertTextXpath("//div[4]/div/div/div[2]/button");
      clickByXpath("//div[4]/div/div/div[2]/button");
      Reporter.log("Click on Upload Button | ");
      Thread.sleep(5000);
      
      // Select the Template from drop-down
      clickByXpath("//*[@id='activity-template-id']/option[2]");
      Reporter.log("Select the Template from drop-down | ");
      Thread.sleep(5000);
      	    
	    // Enter Activity Name for the Template
	    assertTextXpath("//div[2]/div[2]/div/input");
	    sendvaluebyxpath("//div[2]/div[2]/div/input", NoRoleSeleted);
	    Reporter.log("Enter Activity Name for the Template | ");
	    Thread.sleep(5000);
	    
	    //Thread.sleep(5000);
	    
	    // Enter Activity Description 
	    assertTextXpath("//textarea");
	    sendvaluebyxpath("//textarea", "Activity Description");
	    Reporter.log("Enter Activity Description | ");
	    Thread.sleep(5000);
	    //Thread.sleep(5000);
	    
	    // Select the Entity from drop-down
	    clickByXpath("//*[@id='entity-id']/option[8]");
      Reporter.log("Select the Entity from drop-down | ");
      Thread.sleep(5000);
  
	     // Click on Save Button
	    assertTextXpath("//*[@id='submit-button']");
	    clickByXpath("//*[@id='submit-button']");
	    Reporter.log("Click on Save Button | ");
	    Thread.sleep(5000);
	    Thread.sleep(5000); 
	    
	 }
	 
	 @Test(priority=233, enabled = true)
	   public void WithoutActivityName_NewActivties() throws InterruptedException, IOException
	   {
		    
		
		 Thread.sleep(8000); 
		 Thread.sleep(8000); 
		 
		   // Click on New Activity Button
	 	    assertTextXpath("//div[4]/div/div/div[2]/button");
	        clickByXpath("//div[4]/div/div/div[2]/button");
	        Reporter.log("Click on Upload Button | ");
	        Thread.sleep(5000);
	        
	        // Select the Template from drop-down
	        clickByXpath("//*[@id='activity-template-id']/option[6]");
	        Reporter.log("Select the Template from drop-down | ");
	        Thread.sleep(5000);
	        	    
		  
		    // Select the Entity from drop-down
		    clickByXpath("//*[@id='entity-id']/option[9]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(5000);
		        
		     // Click on Save Button
		    assertTextXpath("//*[@id='submit-button']");
		    clickByXpath("//*[@id='submit-button']");
		    Reporter.log("Click on Save Button | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);  	 	   
	   }
	    
	    @Test(priority=234, enabled = true)
		   public void CreateNewActivity_NewActivties() throws InterruptedException, IOException
		   {
			    
			   // Click on New Activity Button
		 	    assertTextXpath("//div[4]/div/div/div[2]/button");
		        clickByXpath("//div[4]/div/div/div[2]/button");
		        Reporter.log("Click on Upload Button | ");
		        Thread.sleep(5000);
		        
		        // Select the Template from drop-down
		        clickByXpath("//*[@id='activity-template-id']/option[6]");
		        Reporter.log("Select the Template from drop-down | ");
		        Thread.sleep(5000);
		        	    
			    // Enter Activity Name for the Template
			    assertTextXpath("//div[2]/div[2]/div/input");
			    sendvaluebyxpath("//div[2]/div[2]/div/input", Activity_Name);
			    Reporter.log("Enter Activity Name for the Template | ");
			    Thread.sleep(5000);
			    //Thread.sleep(5000);
			    
			    // Enter Activity Description 
			    assertTextXpath("//textarea");
			    sendvaluebyxpath("//textarea", "Activity Description");
			    Reporter.log("Enter Activity Description | ");
			    Thread.sleep(5000);
			    //Thread.sleep(5000);
			    
			    // Select the Entity from drop-down
			    clickByXpath("//*[@id='entity-id']/option[9]");
		        Reporter.log("Select the Entity from drop-down | ");
		        Thread.sleep(5000);
			    
		     // Select the Assignee
			    clickByXpath("//*[@id='assignee_selector_chosen']/a/div/b");
			    Thread.sleep(1000);
			    clickByXpath("//*[@id='assignee_selector_chosen']/div/ul/li[1]");
		        Reporter.log("Select the Entity from drop-down | ");
		        Thread.sleep(5000);
		        
		        // Select the Reviewer
		        clickByXpath("//*[@id='reviewer_selector_chosen']/a/div/b");
			    Thread.sleep(1000);
			    clickByXpath("//*[@id='reviewer_selector_chosen']/div/ul/li[3]");
		        Reporter.log("Select the Entity from drop-down | ");
		        Thread.sleep(5000);
		        
		         // Select the Approver
		        clickByXpath("//*[@id='approver_selector_chosen']/a/div/b");
			    Thread.sleep(1000);
			    clickByXpath("//*[@id='approver_selector_chosen']/div/ul/li[4]");
		        Reporter.log("Select the Entity from drop-down | ");
		        Thread.sleep(5000); 
		        
		     // Enter Assignee Due date
			    //assertTextXpath("//textarea");
			    sendvaluebyxpath("//td[3]/input", "2018-11-21");
			    Reporter.log("Enter Assignee Due date | ");
			    Thread.sleep(5000);
			    //Thread.sleep(5000);
			    
			 // Enter Reviewer Due date
			    //assertTextXpath("//textarea");
			    sendvaluebyxpath("//tr[2]/td[3]/input", "2018-11-21");
			    Reporter.log("Enter Reviewer Due date | ");
			    Thread.sleep(5000);
			    //Thread.sleep(5000);
			    		    
			 // Enter Approver Due date
			   // assertTextXpath("//textarea");
			    sendvaluebyxpath("//tr[3]/td[3]/input", "2018-11-21");
			    Reporter.log("Enter Approver Due date | ");
			    Thread.sleep(5000);
			    //Thread.sleep(5000);
			         
			    // Click on Edit Filter Button
			    assertTextXpath("//*[@id='activity-edit-form']/div[1]/div[1]/div[2]/div[2]/button");
			    clickByXpath("//*[@id='activity-edit-form']/div[1]/div[1]/div[2]/div[2]/button");
			    Reporter.log("Click on Edit Filter Button | ");
			    Thread.sleep(5000);
			    //Thread.sleep(5000);
			    
			     //Click on Response drop-down
				  assertTextXpath("//div[2]/div/div/ul/li/input");
				  clickByXpath("//div[2]/div/div/ul/li/input");
				  Reporter.log("Click on Respons drop-down ");
				  Thread.sleep(5000);
				  assertTextXpath("//div[2]/div/div/div/ul/li");
				  clickByXpath("//div[2]/div/div/div/ul/li");
				  Reporter.log("Select value of Response drop-down");
				  Thread.sleep(5000);
				  //Thread.sleep(5000);
				  
				  //Click on Response drop-down
				  assertTextXpath("//div[3]/div/div/ul/li/input");
				  clickByXpath("//div[3]/div/div/ul/li/input");
				  Reporter.log("Click on Respons drop-down ");
				  Thread.sleep(5000);
				  assertTextXpath("//div[3]/div/div/div/ul/li");
				  clickByXpath("//div[3]/div/div/div/ul/li");
				  Reporter.log("Select value of Response drop-down");
				  Thread.sleep(5000);
				  //Thread.sleep(5000);	
				  
				//Click on Response drop-down
				  assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
				  clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
				  Reporter.log("Click on Respons drop-down ");
				  Thread.sleep(5000);
				  assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
				  clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
				  Reporter.log("Select value of Response drop-down");
				  Thread.sleep(5000);
				  Thread.sleep(5000);	
			  			  
			    // Click on Submit button
			    assertTextXpath("//div[3]/button[2]");
			    clickByXpath("//div[3]/button[2]");
			    Reporter.log("Click on Close button | ");
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
			    Thread.sleep(8000);
		    
			     // Click on Save Button
			    assertTextXpath("//*[@id='submit-button']");
			    clickByXpath("//*[@id='submit-button']");
			    Reporter.log("Click on Save Button | ");
			    Thread.sleep(9000);
			    Thread.sleep(8000);  	 	   
		   
}
	 
	 @Test(priority=235, enabled =true)
    public void Disable_EditButton_ActivitesManager() throws InterruptedException, IOException {
		
		    Thread.sleep(8000);
		    
      DisableTextByXpath("//*[@id='activities-manager-helper-bar']/button[2]");
	  Thread.sleep(3000); 
	  
	 }
	 
	 @Test(priority=235, enabled =true)
	    public void Enable_EditButton_ActivitesManager() throws InterruptedException, IOException {
			
			    Thread.sleep(8000);
	
		    
		// Enter Text in search textbox
		 assertTextXpath("//*[@id='activities-manager-helper-bar']/div[3]/input");
		 sendvaluebyxpath("//*[@id='activities-manager-helper-bar']/div[3]/input", Activity_Name);
		 Reporter.log("Enter Activity Name for the Template | ");
		 Thread.sleep(8000);
		 Thread.sleep(8000);
	 		 		    	        
		// Click on Checkbox for Edit functionality
		 assertTextXpath("//*[@id='activities-manager-data']/tr[1]/td[10]/div");
		 clickByXpath("//*[@id='activities-manager-data']/tr[1]/td[10]/div");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(5000);
		 
		  Thread.sleep(8000);
		    
		  //Enable the Edit the button
		  EnabledTextByXpath("//*[@id='activities-manager-helper-bar']/button[2]");
		  Thread.sleep(3000); 
		    
		
		 
	 }
	 
	 @Test(priority=235, enabled =true)
	    public void EditActivty_ActivitesManager() throws InterruptedException, IOException {
			
			    Thread.sleep(8000);
			    
			    //Click on Edit Functionality
				 assertTextXpath("//*[@id='activities-manager-helper-bar']/button[2]");
				 clickByXpath("//*[@id='activities-manager-helper-bar']/button[2]");
				 Reporter.log("Click on Checkbox for Edit functionality | ");
				 Thread.sleep(8000);
	       	    
		// Enter Activity Name for the Template
		    assertTextXpath("//div[2]/div[2]/div/input");
		    sendvaluebyxpath("//div[2]/div[2]/div/input", EditActivity_Name);
		    Reporter.log("Enter Activity Name for the Template | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
	    
		    // Enter Activity Description 
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "Edit Description");
		    Reporter.log("Enter Activity Description | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		 // Select the Entity from drop-down
		    clickByXpath("//*[@id='entity-id']/option[9]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(5000);
		   
	        
	        // Select the Reviewer
	        clickByXpath("//*[@id='reviewer_selector_chosen']/a/div/b");
		    Thread.sleep(1000);
		    clickByXpath("//*[@id='reviewer_selector_chosen']/div/ul/li[2]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(5000);
	        
	         // Select the Approver
	        clickByXpath("//*[@id='approver_selector_chosen']/a/div/b");
		    Thread.sleep(1000);
		    clickByXpath("//*[@id='approver_selector_chosen']/div/ul/li[2]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(5000); 
	        
	     // Enter Assignee Due date
		    //assertTextXpath("//textarea");
		    sendvaluebyxpath("//td[3]/input", "2018-11-06");
		    Reporter.log("Enter Assignee Due date | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		 // Enter Reviewer Due date
		    //assertTextXpath("//textarea");
		    sendvaluebyxpath("//tr[2]/td[3]/input", "2018-11-09");
		    Reporter.log("Enter Reviewer Due date | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    		    
		 // Enter Approver Due date
		   // assertTextXpath("//textarea");
		    sendvaluebyxpath("//tr[3]/td[3]/input", "2018-11-10");
		    Reporter.log("Enter Approver Due date | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		    //Click on Radio Button for Assignment
		    clickByXpath("//*[@id='assignment']/div[2]/input[2]");
		    Thread.sleep(3000);
		    
		  //Click on Checkbox for Remainder
		    clickByXpath("//*[@id='messaging-section']/div/ul/li[2]/a");
		    Thread.sleep(3000);
		    clickByXpath("//*[@id='reminder']/div[2]/input[3]");
		    Thread.sleep(2000);
		    clickByXpath("//*[@id='reminder']/div[2]/input[2]");
		    Thread.sleep(3000);
		    
		  //Click on Checkbox for Remainder
		    clickByXpath("//*[@id='messaging-section']/div/ul/li[3]/a");
		    Thread.sleep(3000);
		    clickByXpath("//*[@id='blocked']/div[2]/input[1]");
		    Thread.sleep(3000);
		    
		  //Click on Checkbox for Remainder
		    clickByXpath("//*[@id='messaging-section']/div/ul/li[4]/a");
		    Thread.sleep(3000);
		    clickByXpath("//*[@id='overdue']/div[2]/input[1]");
		    Thread.sleep(2000);
		    clickByXpath("//*[@id='overdue']/div[2]/input[2]");
		    Thread.sleep(3000);
		    
		             
		     // Click on Save Button
		    assertTextXpath("//*[@id='submit-button']");
		    clickByXpath("//*[@id='submit-button']");
		    Reporter.log("Click on Save Button | ");
		    Thread.sleep(5000);

		
			 
	 }
	 
	 @Test(priority=236, enabled =true)
	    public void Notes_ActivitesManager() throws InterruptedException, IOException {
			 
			    Thread.sleep(8000);
	 		 
			//Click on Notes button 
			 assertTextXpath("//*[@id='activities-manager-data']/tr[1]/td[9]/div/a");
			 clickByXpath("//*[@id='activities-manager-data']/tr[1]/td[9]/div/a");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 Thread.sleep(5000);
			 
			//Click on New Button
			 assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
			 clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 Thread.sleep(5000);
			 
			// Enter Notes in textarea
			 assertTextXpath("//*[@id='DTE_Field_text']");
			 sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample Notes");
			 Reporter.log("Enter Activity Name for the Template | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			    
			//Click on Save Button
			 assertTextXpath("//div[4]/div[3]/button[1]");
			 clickByXpath("//div[4]/div[3]/button[1]");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 			 
			//Click on Close Button
			 //assertTextXpath("html/body/div[4]/div/div/div[3]/button");
			 clickByXpath("//button[@class='btn btn-default pull-right']");
			 Reporter.log("Click on Close button | ");
			 Thread.sleep(3000); 
			 Thread.sleep(3000);
			 		
	 	 }
	 
	 @Test(priority=237, enabled =true)
	 public void ExpandActivity_ActivitesManager() throws InterruptedException, IOException {
			
			    Thread.sleep(3000);
	 		 
			    
	 //Expand the Activity
	 assertTextXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
	 clickByXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
	 Reporter.log("Click on Checkbox for Edit functionality | ");
	 Thread.sleep(5000);
	 
	//Click on Compose Link
	 assertTextXpath("//*[@id='activities-manager-data']/tr[2]/td/div[3]/table/tbody/tr[5]/td/a");
	 clickByXpath("//*[@id='activities-manager-data']/tr[2]/td/div[3]/table/tbody/tr[5]/td/a");
	 Reporter.log("Click on Checkbox for Edit functionality | ");
	 Thread.sleep(5000);
	 
	//Click on Reviewer Checkbox
	 assertTextXpath("//*[@id='activity-status-update-note-form']/div[2]/div/div/div[2]/label");
	 clickByXpath("//*[@id='activity-status-update-note-form']/div[2]/div/div/div[2]/label");
	 Reporter.log("Click on Checkbox for Edit functionality | ");
	 Thread.sleep(5000);
	 
	//Click on Approver Checkbox
	 assertTextXpath("//*[@id='activity-status-update-note-form']/div[2]/div/div/div[3]/label");
	 clickByXpath("//*[@id='activity-status-update-note-form']/div[2]/div/div/div[3]/label");
	 Reporter.log("Click on Checkbox for Edit functionality | ");
	 Thread.sleep(5000);
		 
	 //Click on Send a Copy for me Checkbox
	 assertTextXpath("//*[@id='activity-status-update-note-form']/div[2]/div/div/div[4]/label");
	 clickByXpath("//*[@id='activity-status-update-note-form']/div[2]/div/div/div[4]/label");
	 Reporter.log("Click on Checkbox for Edit functionality | ");
	 Thread.sleep(5000);
	 
	// Clear the Search Text-box
	sendvaluebyxpath("//*[@id='quill-editor']/div[1]", "Send me Messgae");
	Thread.sleep(5000); 
	 
	ArrowDown();
	ArrowDown();
	ArrowDown();
	ArrowDown();
	Thread.sleep(8000);
	
	//Click on Send Button
	 assertTextXpath("//*[@id='submit-button']");
	 clickByXpath("//*[@id='submit-button']");
	 Reporter.log("Click on Checkbox for Edit functionality | ");
	 Thread.sleep(5000);
	 Thread.sleep(3000);
	 
	 }
	 
	 @Test(priority=238, enabled =true)
    public void SendNowButton_ActivitiesManager() throws InterruptedException, IOException {
		 
	    Thread.sleep(5000);
	    	 
	  //Click on Send Button
	    clickByXpath("//*[@id='activities-manager-data']/tr[2]/td/div[3]/table/tbody/tr[2]/td[3]/button");
	    Thread.sleep(8000); 
	    clickByXpath("//button[@class='bootbox-close-button close']");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(8000);
		 
		//Click on Send Button
		 clickByXpath("//*[@id='activities-manager-data']/tr[2]/td/div[3]/table/tbody/tr[3]/td[3]/button");
		 Thread.sleep(8000); 
		 clickByXpath("//button[@class='bootbox-close-button close']");
	     Reporter.log("Click on Checkbox for Edit functionality | ");
	     Thread.sleep(8000);	 
	 
	//Expand the Activity
	 assertTextXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
	 clickByXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
	 Reporter.log("Click on Checkbox for Edit functionality | ");
	 Thread.sleep(5000);
	 
	 refreshpage();
	 Thread.sleep(8000);
	 Thread.sleep(8000);
	 Thread.sleep(8000);
	 
}
	 
	 @Test(priority=239, enabled =true)
	    public void Search_ActivitiesManager() throws InterruptedException, IOException {
		 
	    	 Thread.sleep(8000);
	    	// Enter Notes in textarea
			 assertTextXpath("//*[@id='activities-manager-helper-bar']/div[3]/input");
			 sendvaluebyxpath("//*[@id='activities-manager-helper-bar']/div[3]/input", "Asset Inventory List");
			 Reporter.log("Enter Activity Name for the Template | ");
			 Thread.sleep(8000);
			 Thread.sleep(5000);
			 sendvaluebyxpath("//*[@id='activities-manager-helper-bar']/div[3]/input", "");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
	 }
	 
	    @Test(priority=239, enabled =true)
	    public void StatusLink_ActivitiesManager() throws InterruptedException, IOException {
		 
	    	 Thread.sleep(8000);
	    	
		//Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[2]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
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
 	 
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[3]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
 	 Thread.sleep(8000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[4]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
 	 Thread.sleep(8000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[5]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
 	 Thread.sleep(8000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[6]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
 	 Thread.sleep(8000);
   	     
   	//Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[8]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
 	 Thread.sleep(8000);
   	     
   	//Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[9]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
 	 Thread.sleep(8000);
 	 
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[1]/a");
   	     Thread.sleep(5000);
   	  Thread.sleep(8000);
   	 Thread.sleep(8000);
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
 	 
   	     
	    }
	    
	    @Test(priority=240, enabled =true)
	    public void MouseHover_Status_ActivitiesManager() throws InterruptedException, IOException {
		 
	    	 Thread.sleep(8000);
	    	 
	    	ArrowUp();
	    	ArrowUp();
	    	ArrowUp();
	    	ArrowUp();
	    	ArrowUp();
	    	ArrowUp();
	    	
	    	// Enter Notes in textarea
			 assertTextXpath("//*[@id='activities-manager-helper-bar']/div[3]/input");
			 sendvaluebyxpath("//*[@id='activities-manager-helper-bar']/div[3]/input", "Asset Inventory List");
			 Reporter.log("Enter Activity Name for the Template | ");
			 Thread.sleep(8000);
			 Thread.sleep(5000);
			 
			 //MouseHover on the Status
			 mouseHoverByXpath("//*[@id='activities-manager-data']/tr[1]/td[7]/cw-activity-status-view/div/div[1]/div/div/label");
			 Thread.sleep(5000);
			 
			 //MouseHover on the Status
			 mouseHoverByXpath("//*[@id='activities-manager-data']/tr[1]/td[4]/div/cw-activity-status-view/div/div[1]/div/div/span/i");
			 Thread.sleep(5000);
			 
			 //Clear the Search Textbox
			 sendvaluebyxpath("//*[@id='activities-manager-helper-bar']/div[3]/input", "");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 
	    }
	    
	    
	    
	    @Test(priority=240, enabled =true)
	    public void QuickFilter_ActivitiesManager() throws InterruptedException, IOException {
		 
	    	 Thread.sleep(8000);
	    	 
	 		//Click on Quick Filter drop-down
	   	     clickByXpath("//*[@id='due_date_quick_column_selector']");
	   	     Thread.sleep(5000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
	   	     Thread.sleep(8000);
		     //Thread.sleep(8000);
		     Thread.sleep(5000);
		     clickByXpath("//*[@id='due_date_quick_column_selector']");
	   	     Thread.sleep(5000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");
	   	     Thread.sleep(8000);
		     //Thread.sleep(5000);
		     Thread.sleep(8000);
		     
		   //Click on Quick Filter drop-down
	   	     clickByXpath("//*[@id='person_quick_column_selector']");
	   	     Thread.sleep(5000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[2]/a");
	   	     Thread.sleep(8000);
		     //Thread.sleep(8000);
		     Thread.sleep(5000);
		     clickByXpath("//*[@id='person_quick_column_selector']");
	   	     Thread.sleep(5000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
	   	     Thread.sleep(8000);
		     //Thread.sleep(5000);
		     Thread.sleep(8000);
		     
		  
	 }
	 
	 @Test(priority=241, enabled = true)
	  public void Filter_ActivitiesManager() throws InterruptedException, IOException {
		  
		  		Thread.sleep(5000);	  	
			      
		  		// Click on Filter Button 
		        assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);
		        //Thread.sleep(5000);
		  		
		  	   // Enter Notes in textarea
				 assertTextXpath("//div[2]/div/div/div/input");
				 sendvaluebyxpath("//div[2]/div/div/div/input", EditActivity_Name);
				 Reporter.log("Enter Activity Name for the Template | ");
				 Thread.sleep(5000);
				 //Thread.sleep(5000);
				 
				// Click on Filter Button 
				 assertTextXpath("//div[2]/div/div/div/a");
				 clickByXpath("//div[2]/div/div/div/a");
				 Reporter.log("Click on Filter Button | ");
				 Thread.sleep(5000);
				 	
			  	// Click on Filter Button 
				 assertTextXpath("//div[4]/a");
				 clickByXpath("//div[4]/a");
				 Reporter.log("Click on Filter Button | ");
				 Thread.sleep(5000);
		  			       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div[3]/div/div[4]/label");
		  		clickByXpath("//div[3]/div/div[4]/label");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);

		  		/*//click on Media label drop-down
		  		assertTextXpath("//div[4]/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);
		  		assertTextXpath("//div[4]/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[5]/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);
		  		assertTextXpath("//div[5]/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);
		  		*/
		  	    //Click on Submit button in Filter Pop-up
		  		try {
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(5000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
		  		}
		  		Thread.sleep(5000);   
		  		Thread.sleep(5000);   
		  		Thread.sleep(5000);   
		       	       
		  		//Click on 'Clear Filter' Button 
		  		try {
		  			assertTextXpath("//i[2]");
		  			clickByXpath("//i[2]");
		  			Reporter.log("Click on 'Clear Filter' Button  | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on 'Clear Filter' Button doesn't work | ");
		  		}		 
		  		Thread.sleep(5000);
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);
	  }
	 
       @Test(priority=242, enabled = true)
	  public void Export_ActivitiesManager() throws InterruptedException {
		  	  
	   //Thread.sleep(5000);
 	  //Thread.sleep(5000);
		  
	   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(5000);
		  //Thread.sleep(5000);
		  //Thread.sleep(5000);
		  //Thread.sleep(5000);
    }
  
  @Test(priority =243, enabled = true)
  public void Sorting_ActivitiesManager() throws IOException, InterruptedException {
	
	
	// Click on Media/label column Header to sort for Ascending order
	clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[2]/span[1]/span");
	Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
	Thread.sleep(5000);	
	Thread.sleep(5000);	
				
	// Click on Media/label column Header to sort for Ascending order
	clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[2]/span[1]/span");
	Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
	Thread.sleep(5000);	
	Thread.sleep(5000);
	
	    // Click on Due date column Header to sort for Ascending order
		clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[3]/span[1]/span");
		Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		Thread.sleep(5000);
					
		// Click on Due Date column Header to sort for Ascending order
		clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[3]/span[1]/span");
		Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
		Thread.sleep(5000);	
		Thread.sleep(5000);	
		
			// Click on Assignee column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
							
			// Click on Assignee column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
				
			// Click on Reviewer column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Reviewer column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Approver column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Approver column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Status column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Status column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
  }
	 
 
}