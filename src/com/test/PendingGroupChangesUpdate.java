package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PendingGroupChangesUpdate extends WrapperClass {
	
	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=270, enabled =true)
	  public void NavigatePage_PendingGroupChanges() throws InterruptedException, IOException {
	 
     
		  Thread.sleep(8000);
		          
	    //Select Controls - Global/Media sub-module under Risk determination Module 
       assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
       clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
       Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
       Thread.sleep(8000);
       Thread.sleep(8000);
       Thread.sleep(8000);
       
		
	  
	  }
	  
	  @Test(priority=271, enabled =true)
	   public void EnablePendingGroupChangesButton_ControlsGlobalMedia() throws InterruptedException, IOException {
		 	 
				 Thread.sleep(8000);
				Thread.sleep(8000);
			 	 
	 
				//Expand the Global level
		      clickByXpath("//*[@id='container-body']/tr[3]/td[3]/span[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  
			//Expand the Sub - Global level
		      clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[1]/span");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(3000);
			  				
			//Change the Response for PGC
			  assertTextXpath("//*[@id='component-groups-table']/tbody/tr[2]/td[3]/table/tbody/tr[1]/td[2]/cw-asset-response-selector/div/ul/li[2]/div/label[3]");
			  clickByXpath("//*[@id='component-groups-table']/tbody/tr[2]/td[3]/table/tbody/tr[1]/td[2]/cw-asset-response-selector/div/ul/li[2]/div/label[3]");
	          Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
		   Thread.sleep(8000);
		   
		   // Click on Page header Title
		   //mouseHoverByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/pending-assets-changes-button/span/button");
			// Thread.sleep(8000);			 
		   // assertEquals("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/pending-assets-changes-button/span/button", "Pending Group Changes 1");
			 Thread.sleep(3000);
			 doubleclickbyXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/pending-assets-changes-button/span/button");
			 Thread.sleep(8000);
		  }  
	  

	
	 
	 @Test(priority=272, enabled =true)
	  public void PageHearder_PendingGroupButton_ControlGlobal() throws InterruptedException, IOException {
		
		 Thread.sleep(8000);
		 Thread.sleep(8000);
		  Thread.sleep(8000);
		  		   
		 // Click on Page header Title
	    assertEquals("html/body/div[3]/div/div/div[1]/h4", "Pending Asset Grouping Changes");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(8000);
		 mouseHoverByXpath("//h4");
		 Thread.sleep(8000);
	} 

	  @Test(priority=273, enabled = true)
		 public void ChkHeaderLabel_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			  Thread.sleep(8000);

			//Check GroupName Label
			  assertEquals("//h5/b", "Assets to move");
			   Reporter.log("Check ColumnHeader | ");
			   Thread.sleep(8000); 
			   
			 //Check GroupName Label
			   assertEquals("//div[2]/div/h5/b", "Move FROM this Current Group:");
			   Reporter.log("Check ColumnHeader | ");
			   Thread.sleep(8000); 
			   Thread.sleep(8000); 
			   			   
			 //Check GroupName Label
			  assertEquals("//div[3]/div/h5/b", "Move To this New Cloned Group:");
			   Reporter.log("Check ColumnHeader | ");
			   Thread.sleep(8000);   
			   
			  
	  }
	  
	  @Test(priority=274, enabled = true)
	  public void ComponentIcon_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			  Thread.sleep(8000);
			  
			// Select the ComponentIcon 
			  assertTextXpath("//h5/span/span/i");
			  clickByXpath("//h5/span/span/i");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);
			  
			  //Select the Close Button
			  assertTextXpath("//div[@class='bootbox modal fade modal-primary modal-pending-group-changes in']//button[@class='btn btn-link pull-right'][contains(text(),'Close')]");
			  clickByXpath("//div[@class='bootbox modal fade modal-primary modal-pending-group-changes in']//button[@class='btn btn-link pull-right'][contains(text(),'Close')]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  Thread.sleep(8000);
			  
			  
			  
}

	  
	  @Test(priority=275, enabled = true)
	  public void CreateNewGroup_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  Thread.sleep(8000);
		  
			// Enter some text in Group Name
			  clickByXpath("//div/input");
				 Thread.sleep(3000);
			   //assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/input");
			  sendvaluebyxpath("//div/input", "Test Groups");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			// Enter some text in Group Name
			  clickByXpath("//textarea");
			  Thread.sleep(3000);
			  //assertTextXpath("/html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/textarea");
			  sendvaluebyxpath("//textarea", "Test Desc");
			  Reporter.log("Enter some text in notes Editor | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);
			  
			// Select the Create Button  
			  //html/body/div[3]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button
			  clickByXpath("//form/div/div[3]/button");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(8000);
			  
			  
	  }
	  
	  @Test(priority=276, enabled = true)
	  public void IRMA8599_RadioChecked_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			// Click on Page header Title
			 //assertEquals("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[1]/label", "Yes, make this change");
			  assertEquals("//div[2]/div/div/label", "Yes, make this change");
			  Reporter.log("Click on Page header Title | ");
			 Thread.sleep(5000);
			  
			// Click on Page header Title
			// assertEquals("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[2]/label", "No, don't move this asset");
			 assertEquals("//div[2]/div/div[2]/label", "No, don't move this asset");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(5000);
	  }
	  
	  @Test(priority=277, enabled = true)
	  public void RadioFunction_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			// Click on Page header Title
			  clickByXpath("//div[2]/div/div/label");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
			  
			// Click on Page header Title
			 //clickByXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[2]/div/div[1]/label");
			 //Reporter.log("Click on Page header Title | ");
			// Thread.sleep(1000);
			
	  }
	  
	  @Test(priority=278, enabled = true)
	  public void CreateNewGroupInsteadLink_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
			  Thread.sleep(8000);
			  Thread.sleep(8000);
			 //Check the Link Instead
			assertEquals("//div[3]/div[1]/button", "Create a new group instead...");
			Thread.sleep(5000);
			
			// Click on Create New Group Instead Link
			  clickByXpath("//div[3]/div[1]/button");
				Reporter.log("Click on Page header Title | ");
			    Thread.sleep(5000);
		    
	  }
	  
	  @Test(priority=280, enabled = true)
	  public void IRMA8631_DuplicateGroup_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
		    
			  Thread.sleep(8000);
			    
				// Enter some text in Group Name
				  clickByXpath("//div/input");
				  Thread.sleep(3000);
				  sendvaluebyxpath("//div/input", "Test Groups");
				  Reporter.log("Enter some text in notes Editor | ");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
				  
				// Enter some text in Group Name
				  clickByXpath("//textarea");
				  Thread.sleep(3000);
				  sendvaluebyxpath("//textarea", "Test Desc");
				  Reporter.log("Enter some text in notes Editor | ");
				  Thread.sleep(8000);
				  Thread.sleep(5000);
				  
				// Select the Create Button            
				  //assertTextXpath("html/body/div[4]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/create-group/div/form/div/div[3]/button[2]");
				  clickByXpath("//form/div/div[3]/button");
				  Reporter.log("Click on '-' Icon to close Controls | ");
				  Thread.sleep(8000);
				  Thread.sleep(8000);
				  
				//Clickm on OK button in Warning Pop-ups   
				  assertTextXpath("//div[5]/div/div/div[2]/button");
				  clickByXpath("//div[5]/div/div/div[2]/button");
				  Reporter.log("Click on '-' Icon to close Controls | ");
				  Thread.sleep(8000); 
				  
				// Enter some text in Group Name
				  clickByXpath("//div/input");
				  Thread.sleep(3000);
				  sendvaluebyxpath("//div/input", "CG Groups12");
				  Reporter.log("Enter some text in notes Editor | ");
				  Thread.sleep(3000);
				  //Thread.sleep(3000);
				  
				// Enter some text in Group Name
				  clickByXpath("//textarea");
				  Thread.sleep(3000);
				  sendvaluebyxpath("//textarea", "CG Desc");
				  Reporter.log("Enter some text in notes Editor | ");
				  Thread.sleep(8000);
				  Thread.sleep(7000);
				  
				// Select the Create Button     
	     		  clickByXpath("//form/div/div[3]/button");
				  Reporter.log("Click on '-' Icon to close Controls | ");
				  Thread.sleep(8000);
			  
	  }
	  
	  @Test(priority=281, enabled = true)
	  public void IRMA8987_IRMA9034_Donebutton_PendingGroupButton_ControlGlobal() throws IOException, InterruptedException {
			  
			  Thread.sleep(8000);
	  
			// Click on Done Button
			  clickByXpath("//div[3]/span[3]");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(8000);
			 Thread.sleep(8000);	 
	  }
	  
	  @Test(priority=282, enabled =true)
	   public void OneAssetStories_ControlsGlobalMedia() throws InterruptedException, IOException {
		 	 
				 
				Thread.sleep(8000);
				
				//Expand the Global level
			      clickByXpath("//*[@id='container-body']/tr[3]/td[3]/span[1]");
				  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
				  Thread.sleep(5000);
				
				//Expand the Sub - Global level
			      clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[1]/span");
				  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
				  Thread.sleep(8000);
				
			//Change the Response for PGC
			  assertTextXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[3]");
			  clickByXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[3]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(8000);	 
				  		
				//Check the Default link
			  mouseHoverByXpath("//i[@class='fa btn fa-unlink']");
			  Thread.sleep(3000);	
				 
				//Select the Pending groups Button			   
			      mouseHoverByXpath("//pending-assets-changes-button/span/button");
				  Reporter.log("Click on '-' Icon to close Controls | ");
				  Thread.sleep(8000);	
				  
			}
	  
	  @Test(priority=283, enabled =true)
	  public void CheckAssetRelatedNotes_ControlsGlobalMedia() throws InterruptedException, IOException {
	
		 Thread.sleep(3000);
		 Thread.sleep(8000);
		 
		 
      // Click on Notes button 
	  assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[7]/div/a");
	  clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[7]/div/a");
	  Reporter.log("Click on Notes button | ");
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  
	  // Click on New Button in Notes pop-up window
	  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
	  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
	  Reporter.log("Click on New Button in Notes pop-up window | ");
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  
	  // Enter some text in notes Editor 
	  assertTextXpath("//*[@id='DTE_Field_text']");
	  sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample notes");
	  Reporter.log("Enter some text in notes Editor | ");
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  
	  // Click on Create Button in Create Note pop-up window
	 // assertTextXpath("html/body/div[5]/div/div/div/div[4]/div[3]/button[1]");
	  clickByXpath("html/body/div[5]/div/div/div/div[4]/div[3]/button[1]");
	  Reporter.log("Click on Create Button in Create Note pop-up window | ");
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  
	  //Check the notes type
	  assertEquals("//*[@id='note-details-table']/tbody/tr/td[3]", "Media Note");
	  Thread.sleep(3000);
		 
	//Click on Close button in popup
	    clickBycssSelector(".modal-footer > .pull-right");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(8000);
	    Thread.sleep(8000);
	 
	 }
	  
	  @Test(priority=284, enabled = true)
	  public void Filter_ControlsGlobalMedia() throws InterruptedException, IOException {
		  
 		 Thread.sleep(3000);
	     Thread.sleep(3000);		  
	      	            
	      // Click on Filter Button 
	     	  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]/i");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]/i");
			  Reporter.log("Click on Filter Button | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
	  
		  //Click on Controls drop-down
		  clickByXpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li/input");
		  sendvaluebyxpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li/input", "Backup Media Handling Policy and Procedures");
		  Thread.sleep(2000);
		  enter();
		  Reporter.log("Click on Controls drop-down ");
		  Thread.sleep(5000);
		  
		  //Click on Controls drop-down
		  clickByXpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li[2]/input");
		  sendvaluebyxpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li[2]/input", "Encryption of Backup Media");
		  Thread.sleep(2000);
		  enter();
		  Reporter.log("Click on Controls drop-down ");
		  Thread.sleep(5000);
		  
		  //Click on Controls drop-down
		  clickByXpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li[3]/input");
		  sendvaluebyxpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li[3]/input", "Secure Media Transport");
		  Thread.sleep(2000);
		  enter();
		  Reporter.log("Click on Controls drop-down ");
		  Thread.sleep(5000);
		  
		  //Click on Controls drop-down
		  clickByXpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li[4]/input");
		  sendvaluebyxpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div/div/ul/li[4]/input", "Tracking of Backup Media");
		  Thread.sleep(2000);
		  enter();
		  Reporter.log("Click on Controls drop-down ");
		  Thread.sleep(5000);
	    
		  //Click on Submit button for filters
		    assertTextXpath("//div[3]/button[2]");
	     	  clickByXpath("//div[3]/button[2]");
	 		  Reporter.log("Click on Submit button in Filter Pop-up | ");
	 		  Thread.sleep(3000);
	       
	       Thread.sleep(8000);   
	       Thread.sleep(8000);   
	       Thread.sleep(3000);   
	       
	    // Get the Parent Response Color
	       clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][3]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
		   //Reporter.log(" Get the Parent Note TextValue | ");
		   Thread.sleep(5000);	
		   
		   // Get the Parent Response Color
		   clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][4]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
		   //Reporter.log(" Get the Parent Note TextValue | ");
		   Thread.sleep(5000);	
	       
 	 }
	  
	  
	  @Test(priority=285, enabled = true)
	  public void Parent_Response_GlobalRelated() throws IOException, InterruptedException {
	   	     
	   	      // Get the Parent Response Color
			   ParentResponseColor("//tbody[@id='container-body']/tr[@class='control ng-scope'][1]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);	
			   
			   // Get the Parent Response Color
			   ParentResponseColor1("//tbody[@id='container-body']/tr[@class='control ng-scope'][2]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);	
			   
			// Get the Parent Response Color
			   ParentResponseColor2("//tbody[@id='container-body']/tr[@class='control ng-scope'][3]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);	
			   
			   // Get the Parent Response Color
			   ParentResponseColor3("//tbody[@id='container-body']/tr[@class='control ng-scope'][4]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);			   
			
	  }
	  
	  @Test(priority=286, enabled = true)
	  public void Child_Response_GlobalRelated() throws IOException, InterruptedException {
	   	     
		  Thread.sleep(5000);	
		  
		//Click on Risk Questionnaire List Page
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[3]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(8000);
		  Thread.sleep(8000);
	    Thread.sleep(8000);
	    
	      // Click on 'continue' button of component Groups
	 		 assertTextXpath("//tr[2]//td[7]//div[1]//div[2]//span[1]");
	         clickByXpath("//tr[2]//td[7]//div[1]//div[2]//span[1]");
	 	 	 Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
	      	  Thread.sleep(8000);
	 	     Thread.sleep(5000);
	 	     Thread.sleep(8000);
	 	     
	 	 // Get the Child Response Color
			   ChildResponseColor("//tr[1]/td[5]/cw-answer-media/div/ul/li[2]/div/label[2]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);	
			   
			   // Get the Child Response Color
			   ChildResponseColor1("//tr[2]/td[5]/cw-answer-media/div/ul/li[2]/div/label[4]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);	
			   
			// Get the Child Response Color
			   ChildResponseColor2("//tr[3]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);	
			   
			   // Get the Child Response Color
			   ChildResponseColor3("//tr[4]/td[5]/cw-answer-media/div/ul/li[2]/div/label[1]");
			   //Reporter.log(" Get the Parent Note TextValue | ");
			   Thread.sleep(5000);	
	 	   
			   
			
	  }
	  
	  @Test(priority=287, enabled = true)
		 public void UpdatedRiskRating_RiskQuestionnaireForm() throws InterruptedException, IOException {
			 
			 Thread.sleep(8000); 
			 Thread.sleep(8000); 
			 
		      //Click on RiskLikehood drop-down
			 Thread.sleep(8000);
		      	assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/button/b");
		 	        Reporter.log("Click on RiskLikehood drop-down | ");	    
		           Thread.sleep(8000);
		          //Thread.sleep(8000);
		     
		        //Select 'Moderate' option from Likehood drop-down	 
		           assertTextXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    clickByXpath("//*[@id='risk-rating-risk-likelihood']/div[1]/ul/li[3]/a");
		 	    Reporter.log("Select 'Moderate' option from Likehood drop-down | ");	    
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      // Click on RiskImpact drop-down
		      assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");
		 	  clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/button/b");	     
		      Thread.sleep(8000);
		     // Thread.sleep(8000);
		     
		      //Select 'Major' option from Impact drop-down	      
		      	assertTextXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        clickByXpath("//*[@id='risk-rating-risk-impact']/div[1]/ul/li[5]/a");
		 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
		     
		      Thread.sleep(8000);
		      Thread.sleep(8000);
		      
		      
		 }
	  	  
	  @Test(priority=288, enabled = true)
	  public void Compare_Response_GlobalRelated() throws IOException, InterruptedException {
	   	     
		  Thread.sleep(8000);
		  
		   //Get the Compare the Response Color
	      // CompareResponseColor("ParentResponse","ChildResponse");
		   Thread.sleep(3000);
		   
		 //Get the Compare the Response Color
	       //CompareResponseColor1("ParentResponse1","ChildResponse1");
		   Thread.sleep(1000);	
		   
		 //Get the Compare the Response Color
	      // CompareResponseColor2("ParentResponse2","ChildResponse2");
		   Thread.sleep(1000);	
		   
		 //Get the Compare the Response Color
	       //CompareResponseColor3("ParentResponse3","ChildResponse3");
		   Thread.sleep(1000);	
	  }
	  
	  @Test(priority=289, enabled = true)
	  public void DefaultLink_GlobalRelated() throws IOException, InterruptedException {
	   	     
		  Thread.sleep(5000);
		  
		  mouseHoverByXpath("html[1]/body[1]/section[1]/section[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/cw-answer-media[1]/div[1]/ul[1]/li[1]/i[1]");
		  Thread.sleep(1000);
		  ArrowDown();
		  ArrowDown();
		  ArrowDown();
		  ArrowDown();
		  Thread.sleep(3000);
		  clickByXpath("//button[@id='rMedia']");	     
		  Thread.sleep(8000);
		  clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");	     
		  Thread.sleep(8000);
		 
		
	  }
}