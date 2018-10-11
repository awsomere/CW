package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActivitiesStage extends WrapperClass {

	 public WebDriver driver;
	 String browser=null;
	 String Entity_Name="FixesNew123";
	 String Activity_Name= "Fixes";
	 String emailId ="sathya11@sybrant.com";
	 String password="Sybrant@999";
	 String emailId1 ="madhu11@sybrant.com";
	 String password1="Sybrant@999";
	 
	 @Test(priority=67, enabled = true)
	   public void NewActivties() throws InterruptedException, IOException
	   {
		      
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    
		    //Click on Full Screen Button 
	        assertTextXpath("//a[2]/i");
	        clickByXpath("//a[2]/i");
	        Reporter.log("Click on Full Screen Button  | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
		    		   		    		    		    
		    //Select the Activities module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
		    Reporter.log("Selected the Document module at sidebar-left | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);		
		    
		    //Select the Activities module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[1]/a");  	
		    Reporter.log("Selected the Document module at sidebar-left | ");
		    Thread.sleep(5000);
		    Thread.sleep(3000);		 	  
	     	        
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
		    sendvaluebyxpath("//div[2]/div[2]/div/input", Activity_Name);
		    Reporter.log("Enter Activity Name for the Template | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Enter Activity Description 
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "Activity Description");
		    Reporter.log("Enter Activity Description | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Select the Entity from drop-down
		    clickByXpath("//*[@id='entity-id']/option[7]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(5000);
		    
	     // Select the Assignee
		    clickByXpath("//*[@id='assignee_selector_chosen']/a/div/b");
		    Thread.sleep(1000);
		    clickByXpath("//*[@id='assignee_selector_chosen']/div/ul/li[1]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(3000);
	        
	        // Select the Reviewer
	        clickByXpath("//*[@id='reviewer_selector_chosen']/a/div/b");
		    Thread.sleep(1000);
		    clickByXpath("//*[@id='reviewer_selector_chosen']/div/ul/li[2]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(3000);
	        
	         // Select the Approver
	        clickByXpath("//*[@id='approver_selector_chosen']/a/div/b");
		    Thread.sleep(1000);
		    clickByXpath("//*[@id='approver_selector_chosen']/div/ul/li[3]");
	        Reporter.log("Select the Entity from drop-down | ");
	        Thread.sleep(3000); 
	        
	     // Enter Assignee Due date
		    //assertTextXpath("//textarea");
		    sendvaluebyxpath("//td[3]/input", "2018-09-04");
		    Reporter.log("Enter Assignee Due date | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		 // Enter Reviewer Due date
		    //assertTextXpath("//textarea");
		    sendvaluebyxpath("//tr[2]/td[3]/input", "2018-09-05");
		    Reporter.log("Enter Reviewer Due date | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    		    
		 // Enter Approver Due date
		   // assertTextXpath("//textarea");
		    sendvaluebyxpath("//tr[3]/td[3]/input", "2018-09-08");
		    Reporter.log("Enter Approver Due date | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		         
		    /*// Click on Edit Filter Button
		    assertTextXpath("//*[@id='activity-edit-form']/div[1]/div[1]/div[2]/div[2]/button");
		    clickByXpath("//*[@id='activity-edit-form']/div[1]/div[1]/div[2]/div[2]/button");
		    Reporter.log("Click on Edit Filter Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		     //Click on Response drop-down
			  assertTextXpath("//div/ul/li/input");
			  clickByXpath("//div/ul/li/input");
			  Reporter.log("Click on Respons drop-down ");
			  Thread.sleep(3000);
			  assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
			  clickByXpath("//div[2]/div/div/div/div/div/ul/li");
			  Reporter.log("Select value of Response drop-down");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  //Click on Response drop-down
			  assertTextXpath("//div[2]/div/div/ul/li/input");
			  clickByXpath("//div[2]/div/div/ul/li/input");
			  Reporter.log("Click on Respons drop-down ");
			  Thread.sleep(3000);
			  assertTextXpath("//div[2]/div/div/div/ul/li");
			  clickByXpath("//div[2]/div/div/div/ul/li");
			  Reporter.log("Select value of Response drop-down");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);		    
			  
		    // Click on Submit button
		    assertTextXpath("//div[3]/button[2]");
		    clickByXpath("//div[3]/button[2]");
		    Reporter.log("Click on Close button | ");
		    Thread.sleep(5000);
		    Thread.sleep(3000);*/
	    
		     // Click on Save Button
		    assertTextXpath("//*[@id='submit-button']");
		    clickByXpath("//*[@id='submit-button']");
		    Reporter.log("Click on Save Button | ");
		    Thread.sleep(5000);
		    Thread.sleep(3000);
		    
		   	 	   
	   }
	 
	 @Test(priority=68, enabled =true)
    public void EditActivity() throws InterruptedException, IOException {
		 
		 
		// Enter Text in search textbox
		 assertTextXpath("//*[@id='activities-manager-helper-bar']/div[3]/input");
		 sendvaluebyxpath("//*[@id='activities-manager-helper-bar']/div[3]/input", Activity_Name);
		 Reporter.log("Enter Activity Name for the Template | ");
		 Thread.sleep(5000);
		 Thread.sleep(5000);
	 		 		    	        
		// Click on Checkbox for Edit functionality
		 assertTextXpath("//*[@id='activities-manager-data']/tr[1]/td[10]/div");
		 clickByXpath("//*[@id='activities-manager-data']/tr[1]/td[10]/div");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(5000);
		    
		 //Click on Edit Functionality
		 assertTextXpath("//*[@id='activities-manager-helper-bar']/button[2]");
		 clickByXpath("//*[@id='activities-manager-helper-bar']/button[2]");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(5000);
		 
		/*// Select the Template from drop-down
	        selectByXpath_Visibletext("//select","Global Controls Template");
	        Reporter.log("Select the Template from drop-down | ");
	        Thread.sleep(5000);*/
	       /* 	    
		    // Enter Activity Name for the Template
		    assertTextXpath("//div[2]/div[2]/div/input");
		    sendvaluebyxpath("//div[2]/div[2]/div/input", "AActivity Edit");
		    Reporter.log("Enter Activity Name for the Template | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
*/		    
		    // Enter Activity Description 
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "Edit Description");
		    Reporter.log("Enter Activity Description | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		     //Click on Save button
			 assertTextXpath("//*[@id='submit-button']");
			 clickByXpath("//*[@id='submit-button']");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 Thread.sleep(5000);
			 
			 //Expand the Activity
			 assertTextXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
			 clickByXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 Thread.sleep(5000);
			 
			//Expand the Activity
			 assertTextXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
			 clickByXpath("//*[@id='activities-manager-data']/tr[1]/td[1]/span");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 Thread.sleep(5000);
			 
			/*//Click on Notes button 
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
			 Thread.sleep(3000);
			    
			//Click on Save Button
			 assertTextXpath("//div[4]/div[3]/button");
			 clickByXpath("//div[4]/div[3]/button");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 Thread.sleep(5000);
			 Thread.sleep(3000);
			 			 
			//Click on Close Button
			 //assertTextXpath("html/body/div[4]/div/div/div[3]/button");
			 clickByXpath("html/body/div[4]/div/div/div[3]/button");
			 Reporter.log("Click on Close button | ");
			 Thread.sleep(5000); 
			 Thread.sleep(3000);*/
			 		
	 	 }
	 
	    @Test(priority=69, enabled =true)
	    public void ActivitiesManagerQuickFilter() throws InterruptedException, IOException {
		 
	    	 Thread.sleep(3000);
	    	 
		//Check the Status for the Assignee
		 mouseHoverByXpath("//*[@id='activities-manager-data']/tr[1]/td[4]/div/cw-activity-status-view/div/div[1]/div/span/i");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(3000);
		 
		 /*//Check the Status for the Reviewer
		 mouseHoverByXpath("//*[@id='activities-manager-data']/tr[1]/td[5]/div/cw-activity-status-view/div/div[1]/div/span/i");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(3000);
		 
		 //Check the Status for the Approver 
		 mouseHoverByXpath("//*[@id='activities-manager-data']/tr[1]/td[6]/div/cw-activity-status-view/div/div[1]/div/span/i");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(3000);		
		 
		 //Check the Status 
		 mouseHoverByXpath("//*[@id='activities-manager-data']/tr[1]/td[7]/cw-activity-status-view/div/div[1]/div/label");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(3000);*/	

		// Clear the Search Text-box
		sendvaluebyxpath("//*[@id='activities-manager-helper-bar']/div[3]/input", "");
		Thread.sleep(3000); 
		
		//Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[2]/a");
   	     Thread.sleep(5000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[3]/a");
   	     Thread.sleep(5000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[4]/a");
   	     Thread.sleep(5000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[5]/a");
   	     Thread.sleep(5000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[6]/a");
   	     Thread.sleep(5000);
   	     
   	     //Click on All Link
   	     clickByXpath("//*[@id='activities-manager-helper-bar']/div[2]/ul/li[1]/a");
   	     Thread.sleep(5000);
	        
	 		//Click on Quick Column Selector Filter drop-down
	   	     clickByXpath("//*[@id='due_date_quick_column_selector']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/div/ul/li[2]/a");
	   	     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     Thread.sleep(5000);
		     clickByXpath("//*[@id='due_date_quick_column_selector']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/div/ul/li[1]/a");
	   	     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     Thread.sleep(5000);
		     
		  
	 }
	 
	 @Test(priority=70, enabled = true)
	  public void ActivitiesManagerFilter() throws InterruptedException, IOException {
		  
		  		Thread.sleep(3000);	  	
			      
		  		// Click on Filter Button 
		        assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(3000);
		        //Thread.sleep(3000);
		  		
		  	   // Enter Notes in textarea
				 assertTextXpath("//div[2]/div/div/div/input");
				 sendvaluebyxpath("//div[2]/div/div/div/input", Activity_Name);
				 Reporter.log("Enter Activity Name for the Template | ");
				 Thread.sleep(5000);
				 //Thread.sleep(5000);
				 
				// Click on Filter Button 
				 assertTextXpath("//div[2]/div/div/div/a");
				 clickByXpath("//div[2]/div/div/div/a");
				 Reporter.log("Click on Filter Button | ");
				 Thread.sleep(3000);
				 	
			  	// Click on Filter Button 
				 assertTextXpath("//div[4]/a");
				 clickByXpath("//div[4]/a");
				 Reporter.log("Click on Filter Button | ");
				 Thread.sleep(3000);
		  			       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div[3]/div/div[3]/label");
		  		clickByXpath("//div[3]/div/div[3]/label");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[4]/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[5]/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		
		  	    //Click on Submit button in Filter Pop-up
		  		try {
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(3000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
		  		}
		  		Thread.sleep(3000);   
		  		Thread.sleep(3000);   
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
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
	  }
	 
       @Test(priority=71, enabled = true)
	  public void ExportActivitiesManager() throws InterruptedException {
		  	  
	   //Thread.sleep(5000);
 	  //Thread.sleep(3000);
		  
	   //Click on Export Button
		   assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
		   clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
		   Reporter.log("Click on Export Button | ");
		   Thread.sleep(5000);
		   Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(5000);
		  //Thread.sleep(5000);
		  //Thread.sleep(5000);
		  //Thread.sleep(5000);
    }
  
  @Test(priority =72, enabled = false)
  public void ActivitiesManagerSort() throws IOException, InterruptedException {
	
	
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
		
			// Click on Due date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
							
			// Click on Due Date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[4]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
				
			// Click on Due date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Due Date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[5]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Due date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Due Date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[6]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Due date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Due Date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[7]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			// Click on Due date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);
						
			// Click on Due Date column Header to sort for Ascending order
			clickByXpath("//*[@id='activities_manager']/thead/tr[1]/th[8]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			
			//Click on PageHelp button Icon
	 	    assertTextXpath("//cw-page-help/button");
	        clickByXpath("//cw-page-help/button");
	        Reporter.log("Click on PageHelp button Icon | ");
	        Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click OK Button in PageHelp pop-up window
		    assertTextXpath("//div[4]/div/div/div[3]/button");
	        clickByXpath("//div[4]/div/div/div[3]/button");
	        Reporter.log("Click OK Button in PageHelp pop-up window | ");
	        Thread.sleep(3000);
		   // Thread.sleep(5000);		
	
  }
	 
  @Test(priority=73, enabled = true)
  public void MyActivties() throws InterruptedException, IOException
  {
	      
	    Thread.sleep(5000);
	    
	    //Select the Activities module at sidebar-left
	    assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");
	    clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    Thread.sleep(5000);	
	    
	    // Search Text-box
	 	sendvaluebyxpath("//*[@id='my-activities-helper-bar']/div[4]/input", Activity_Name);
	 	Thread.sleep(5000);
	 	Thread.sleep(3000);
	 
	 	//Expand MY Activities 
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	     //Set the Status for InProgress
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[2]/label");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[2]/label");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	    //Set the Status for Completed
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[5]/label");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[5]/label");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000); 
	   
	    //Click on Save button
	    assertTextXpath("//*[@id='submit-button']");
	    clickByXpath("//*[@id='submit-button']");  	
	    Reporter.log("Click on Save button | ");
	    Thread.sleep(5000); 
	    
	    //Expand MY Activities 
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
			 
	    //Click on Account drop-down
		   assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span");
		   clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span");
		   Reporter.log("Click on Account drop-down  | ");
		   Thread.sleep(5000);
			 
		   //click on Logout button
		   try {
		   assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
		   clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
		   Reporter.log("Click on Logout button  | ");
		   }catch(Exception e)
			{
				   e.printStackTrace();
				  Reporter.log("SignIN doesn't work | ");
				}
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		  
		 //Enter EmailID in Textbox
			assertTextXpath("//*[@id='lEmail']");
			sendvaluebyxpath("//*[@id='lEmail']", emailId);
			Reporter.log("Enter EmailID successfully | ");
			Thread.sleep(3000);
			
			//Enter Password in Textbox
			assertTextXpath("//*[@id='lPass']");
			sendvaluebyxpath("//*[@id='lPass']", password);
			Reporter.log("Enter Password successfully | ");
			Thread.sleep(3000);
		
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
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			
			//Click on the Created new Entity drop-down from Header 
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
		     Reporter.log("Click on the Created new Entity drop-down from Header | ");
		     Thread.sleep(3000);
		     
		     //Enter Created Entity Name in Search box
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input");
		     sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input", Entity_Name);
		     Reporter.log("Enter Created Entity Name in Search box | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Select the Searched Entity
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[2]/a");
		     Reporter.log("Select the Searched Entity | ");
		     Thread.sleep(5000);
		     //Thread.sleep(3000);
		     Thread.sleep(5000);
		     Thread.sleep(5000);
			
			//Select the Activities module at sidebar-left
			 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
			 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
			 Reporter.log("Selected the Document module at sidebar-left | ");
			 Thread.sleep(3000);
			// Thread.sleep(5000);		
			    
			//Select the Activities module at sidebar-left
			 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");
			 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");  	
			 Reporter.log("Selected the Document module at sidebar-left | ");
			 //Thread.sleep(3000);
			 Thread.sleep(5000);	
			 
			// Search Text-box
			 sendvaluebyxpath("//*[@id='my-activities-helper-bar']/div[4]/input", Activity_Name);
			 Thread.sleep(5000);
			 Thread.sleep(3000);
	    
	  //Expand MY Activities 
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	     //Set the Status for InProgress
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[2]/label");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[2]/label");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	    //Set the Status for Completed
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[5]/label");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[5]/label");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000); 
	   
	    //Click on Save button
	    assertTextXpath("//*[@id='submit-button']");
	    clickByXpath("//*[@id='submit-button']");  	
	    Reporter.log("Click on Save button | ");
	    Thread.sleep(5000); 
	    
	    //Expand MY Activities 
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	    //Click on Account drop-down
		   assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span");
		   clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/a/span");
		   Reporter.log("Click on Account drop-down  | ");
		   Thread.sleep(5000);
			 
		   //click on Logout button
		   try {
		   assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
		   clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[7]/ul/li[3]/a");
		   Reporter.log("Click on Logout button  | ");
		   }catch(Exception e)
			{
				   e.printStackTrace();
				  Reporter.log("SignIN doesn't work | ");
				}
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		   Thread.sleep(5000);
		  
		 //Enter EmailID in Textbox
			assertTextXpath("//*[@id='lEmail']");
			sendvaluebyxpath("//*[@id='lEmail']", emailId);
			Reporter.log("Enter EmailID successfully | ");
			Thread.sleep(3000);
			
			//Enter Password in Textbox
			assertTextXpath("//*[@id='lPass']");
			sendvaluebyxpath("//*[@id='lPass']", password);
			Reporter.log("Enter Password successfully | ");
			Thread.sleep(3000);
		
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
			Thread.sleep(5000);
			Thread.sleep(5000);
			Thread.sleep(5000);
			
			//Click on the Created new Entity drop-down from Header 
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
		     Reporter.log("Click on the Created new Entity drop-down from Header | ");
		     Thread.sleep(3000);
		     
		     //Enter Created Entity Name in Search box
		     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input");
		     sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input", Entity_Name);
		     Reporter.log("Enter Created Entity Name in Search box | ");
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     //Select the Searched Entity
		     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[2]/a");
		     Reporter.log("Select the Searched Entity | ");
		     Thread.sleep(5000);
		     //Thread.sleep(3000);
		     Thread.sleep(5000);
		     Thread.sleep(5000);
			
			//Select the Activities module at sidebar-left
			 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
			 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
			 Reporter.log("Selected the Document module at sidebar-left | ");
			 Thread.sleep(3000);
			// Thread.sleep(5000);		
			    
			//Select the Activities module at sidebar-left
			 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");
			 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");  	
			 Reporter.log("Selected the Document module at sidebar-left | ");
			 //Thread.sleep(3000);
			 Thread.sleep(5000);	
			 
			// Search Text-box
			 sendvaluebyxpath("//*[@id='my-activities-helper-bar']/div[4]/input", Activity_Name);
			 Thread.sleep(5000);
			 Thread.sleep(3000);
	    	    
	  //Expand MY Activities 
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	     //Set the Status for InProgress
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[2]/label");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[2]/label");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	    //Set the Status for Completed
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[5]/label");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[2]/td/div[1]/div/div[1]/div[2]/div/div[5]/label");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000); 
	   
	    //Click on Save button
	    assertTextXpath("//*[@id='submit-button']");
	    clickByXpath("//*[@id='submit-button']");  	
	    Reporter.log("Click on Save button | ");
	    Thread.sleep(3000); 
	    
	    //Expand MY Activities 
	    assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");
	    clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[1]/span");  	
	    Reporter.log("Selected the Document module at sidebar-left | ");
	    Thread.sleep(5000);
	    
	    //Check the Status for the Approver 
		 mouseHoverByXpath("//*[@id='my_activities']/tbody/tr[1]/td[6]/cw-activity-status-view/div/div[1]/div/span/i");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(5000);		
		 
		 //Check the Status 
		 mouseHoverByXpath("//*[@id='my_activities']/tbody/tr[1]/td[7]/cw-activity-status-view/div/div[1]/div/span/i");
		 Reporter.log("Click on Checkbox for Edit functionality | ");
		 Thread.sleep(5000);
		 Thread.sleep(5000);
		 
		//Click on Work Now button
		 assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[9]/cw-activity-work-now-button/span/a");
		 clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[9]/cw-activity-work-now-button/span/a");  	
		 Reporter.log("Selected the Document module at sidebar-left | ");
		 Thread.sleep(5000);
		 Thread.sleep(5000);
		 Thread.sleep(5000);
		 Thread.sleep(5000);
		
		//Select the Activities module at sidebar-left
		 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
		 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
		 Reporter.log("Selected the Document module at sidebar-left | ");
		 Thread.sleep(3000);
		// Thread.sleep(5000);		
		    
		//Select the Activities module at sidebar-left
		 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");
		 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");  	
		 Reporter.log("Selected the Document module at sidebar-left | ");
		 //Thread.sleep(3000);
		 Thread.sleep(5000);
		 Thread.sleep(5000);
		 Thread.sleep(5000);
		
	    
  }
  
  @Test(priority=74, enabled =true)
  public void MyActivitiesQuickFilter() throws InterruptedException, IOException {
	 
	  Thread.sleep(3000);
	  
		//Click on Quick Column Selector Filter drop-down
 	     clickByXpath("//*[@id='due_date_quick_column_selector']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/div/ul/li[2]/a");
 	     Thread.sleep(3000);
	     //Thread.sleep(3000);
	     Thread.sleep(5000);
	     clickByXpath("//*[@id='due_date_quick_column_selector']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[3]/cw-drop-list/div/ul/li[1]/a");
 	     Thread.sleep(5000);
	     //Thread.sleep(3000);
	     Thread.sleep(5000);
	     	  
     }

@     Test(priority=75, enabled = true)
      public void MyActivitiesFilter() throws InterruptedException, IOException {
	  
	  		   
	       //Thread.sleep(3000);
	  		
	  	   	// Click on Filter Button 
	        assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]");
	  		clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]");
	  		Reporter.log("Click on Filter Button | ");
	  		Thread.sleep(5000);
	  		//Thread.sleep(3000);
	        //Thread.sleep(3000);
	  		
	  	   // Enter Notes in textarea
			 assertTextXpath("//div[2]/div/div/div/input");
			 sendvaluebyxpath("//div[2]/div/div/div/input", Activity_Name);
			 Reporter.log("Enter Activity Name for the Template | ");
			 Thread.sleep(5000);
			 //Thread.sleep(5000);
			 
			// Click on Complete Check-box
	  		assertTextXpath("//div[2]/div[2]/div/div[6]/label");
	  		clickByXpath("//div[2]/div[2]/div/div[6]/label");
	  		Reporter.log("Select value from Asset Drop-down | ");
	  		Thread.sleep(3000);
	  		//Thread.sleep(3000);
	  		
	  	    //Click on Submit button in Filter Pop-up
	  		try {
	  			assertTextXpath("//div[3]/button[2]");
	  			clickByXpath("//div[3]/button[2]");
	  			Reporter.log("Click on Submit button in Filter Pop-up | ");
	  			Thread.sleep(3000);
	  		}catch(Exception e)
	  		{
	  			e.printStackTrace();
	  			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
	  		}
	  		Thread.sleep(3000);   
	  		Thread.sleep(3000);   
	  			       	       
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
	  		Thread.sleep(3000);
	  		Thread.sleep(3000);
	  		//Thread.sleep(3000);
	  		
    }

     @Test(priority=76, enabled = true)
     public void ExportMyActivities() throws InterruptedException {
	  	  
         //Thread.sleep(5000);
         Thread.sleep(3000);
	  
        //Click on Export Button
	   assertTextXpath(".//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
	   clickByXpath(".//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/button");
	   Reporter.log("Click on Export Button | ");
	   Thread.sleep(5000);
	   Thread.sleep(3000);
	  
	  //Click on Pdf 
	  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li/a");
	  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[2]/div/ul/li/a");
	  Reporter.log("Click on Pdf | ");
	  Thread.sleep(5000);
	  Thread.sleep(5000);
	  //Thread.sleep(5000);
	  Thread.sleep(5000);
}
}