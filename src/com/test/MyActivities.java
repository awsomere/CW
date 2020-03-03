package com.test;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyActivities extends WrapperClass {

	 public WebDriver driver;
	 String browser=null;
	 String Entity_Name="26 sep";
	 String Activity_Name= "RiskActionPlan Activity";
	 String EditActivity_Name= "RiskActionPlan Activity - Edit";
	 String emailId ="sathya11@sybrant.com";
	 String password="Sybrant@888";
	 String emailId1 ="madhu11@sybrant.com";
	 String password1="Sybrant@888";
	
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
		 	Thread.sleep(5000);
		 
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
			   Thread.sleep(9000);
			   Thread.sleep(8000);
			   Thread.sleep(8000);
			   Thread.sleep(5000);
			   
	  }
	  
	  @Test(priority=74, enabled = true)
	  public void Reviewer_MyActivties() throws InterruptedException, IOException
	  {
	  
			  
			 //Enter EmailID in Textbox
				assertTextXpath("//*[@id='lEmail']");
				sendvaluebyxpath("//*[@id='lEmail']", emailId);
				Reporter.log("Enter EmailID successfully | ");
				Thread.sleep(5000);
				
				//Enter Password in Textbox
				assertTextXpath("//*[@id='lPass']");
				sendvaluebyxpath("//*[@id='lPass']", password);
				Reporter.log("Enter Password successfully | ");
				Thread.sleep(5000);
			
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
				Thread.sleep(5000);
				Thread.sleep(5000);
				Thread.sleep(5000);
				Thread.sleep(5000);
				Thread.sleep(5000);
				Thread.sleep(5000);
				
				//Click on the Created new Entity drop-down from Header 
			     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
			     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
			     Reporter.log("Click on the Created new Entity drop-down from Header | ");
			     Thread.sleep(5000);
			     
			     //Enter Created Entity Name in Search box
			     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input");
			     sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input", Entity_Name);
			     Reporter.log("Enter Created Entity Name in Search box | ");
			     Thread.sleep(5000);
			     //Thread.sleep(5000);
			     
			     //Select the Searched Entity
			     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[2]/a");
			     Reporter.log("Select the Searched Entity | ");
			     Thread.sleep(5000);
			     //Thread.sleep(5000);
			     Thread.sleep(5000);
			     Thread.sleep(5000);
				
				//Select the Activities module at sidebar-left
				 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
				 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
				 Reporter.log("Selected the Document module at sidebar-left | ");
				 Thread.sleep(5000);
				// Thread.sleep(5000);		
				    
				//Select the Activities module at sidebar-left
				 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");
				 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");  	
				 Reporter.log("Selected the Document module at sidebar-left | ");
				 //Thread.sleep(5000);
				 Thread.sleep(5000);	
				 
				// Search Text-box
				 sendvaluebyxpath("//*[@id='my-activities-helper-bar']/div[4]/input", Activity_Name);
				 Thread.sleep(5000);
				 Thread.sleep(5000);
		    
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
			   Thread.sleep(8000);
			   Thread.sleep(8000);
			   Thread.sleep(8000);
			   Thread.sleep(8000);
			   
	  }
	  
	  @Test(priority=75, enabled = true)
	  public void Approver_MyActivties() throws InterruptedException, IOException
	  {
			  
			 //Enter EmailID in Textbox
				assertTextXpath("//*[@id='lEmail']");
				sendvaluebyxpath("//*[@id='lEmail']", emailId1);
				Reporter.log("Enter EmailID successfully | ");
				Thread.sleep(5000);
				
				//Enter Password in Textbox
				assertTextXpath("//*[@id='lPass']");
				sendvaluebyxpath("//*[@id='lPass']", password1);
				Reporter.log("Enter Password successfully | ");
				Thread.sleep(5000);
			
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
				Thread.sleep(5000);
				Thread.sleep(5000);
				Thread.sleep(5000);
				Thread.sleep(5000);
				Thread.sleep(5000);
				
				//Click on the Created new Entity drop-down from Header 
			     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
			     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/a/span/span[1]");
			     Reporter.log("Click on the Created new Entity drop-down from Header | ");
			     Thread.sleep(5000);
			     
			     //Enter Created Entity Name in Search box
			     assertTextXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input");
			     sendvaluebyxpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[1]/input", Entity_Name);
			     Reporter.log("Enter Created Entity Name in Search box | ");
			     Thread.sleep(5000);
			     //Thread.sleep(5000);
			     
			     //Select the Searched Entity
			     clickByXpath("//*[@id='header']/div[2]/div/ul[2]/li[5]/ul/li[2]/a");
			     Reporter.log("Select the Searched Entity | ");
			     Thread.sleep(5000);
			     //Thread.sleep(5000);
			     Thread.sleep(5000);
			     Thread.sleep(5000);
				
				//Select the Activities module at sidebar-left
				 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");
				 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/a/span[2]");  	
				 Reporter.log("Selected the Document module at sidebar-left | ");
				 Thread.sleep(5000);
				// Thread.sleep(5000);		
				    
				//Select the Activities module at sidebar-left
				 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");
				 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");  	
				 Reporter.log("Selected the Document module at sidebar-left | ");
				 //Thread.sleep(5000);
				 Thread.sleep(5000);	
				 
				// Search Text-box
				 sendvaluebyxpath("//*[@id='my-activities-helper-bar']/div[4]/input", Activity_Name);
				 Thread.sleep(5000);
				 Thread.sleep(5000);
		    	    
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
		    
		    //Check the Status for the Approver 
			// mouseHoverByXpath("//*[@id='my_activities']/tbody/tr[1]/td[6]/cw-activity-status-view/div/div[1]/div/span/i");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			 //Thread.sleep(5000);		
			 
			 //Check the Status 
			 //mouseHoverByXpath("//*[@id='my_activities']/tbody/tr[1]/td[7]/cw-activity-status-view/div/div[1]/div/span/i");
			 Reporter.log("Click on Checkbox for Edit functionality | ");
			// Thread.sleep(5000);
			// Thread.sleep(5000);
			 
			//Click on Work Now button
			 //assertTextXpath("//*[@id='my_activities']/tbody/tr[1]/td[9]/cw-activity-work-now-button/span/a");
			 //clickByXpath("//*[@id='my_activities']/tbody/tr[1]/td[9]/cw-activity-work-now-button/span/a");  	
			 Reporter.log("Selected the Document module at sidebar-left | ");
			 /*Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);*/	
			    
			//Select the Activities module at sidebar-left
			 assertTextXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");
			 clickByXpath("//*[@id='sidebar-left']/ul/li[6]/ul/li[2]/a");  	
			 Reporter.log("Selected the Document module at sidebar-left | ");
			 //Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			
		    
	  }
	  
	  @Test(priority=76, enabled =true)
	  public void MyActivitiesQuickFilter() throws InterruptedException, IOException {
		 
		  Thread.sleep(5000);
		  
			//Click on Quick Column Selector Filter drop-down
	 	     clickByXpath("//*[@id='due_date_quick_column_selector']");
	 	     Thread.sleep(5000);
	 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
	 	     Thread.sleep(8000);
		     //Thread.sleep(5000);
		     Thread.sleep(8000);
		     clickByXpath("//*[@id='due_date_quick_column_selector']");
	 	     Thread.sleep(5000);
	 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
	 	     Thread.sleep(8000);
		     //Thread.sleep(5000);
		     Thread.sleep(8000);
		     	  
	     }

	@     Test(priority=77, enabled = false)
	      public void MyActivitiesFilter() throws InterruptedException, IOException {
		  
		  		   
		       //Thread.sleep(5000);
		  		
		  	   	// Click on Filter Button 
		        assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]");
		  		clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]");
		  		Reporter.log("Click on Filter Button | ");
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);
		        //Thread.sleep(5000);
		  		
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
		  		Thread.sleep(5000);
		  		//Thread.sleep(5000);
		  		
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

	     @Test(priority=78, enabled = true)
	     public void ExportMyActivities() throws InterruptedException {
		  	  
	         //Thread.sleep(5000);
	         Thread.sleep(5000);
		  
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
		  Thread.sleep(5000);
		  //Thread.sleep(5000);
		  Thread.sleep(5000);
	}

}
