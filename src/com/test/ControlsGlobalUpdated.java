package com.test;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;          
import org.testng.annotations.Test;

public class ControlsGlobalUpdated extends WrapperClass {
	
	  public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=210, enabled =true)
	  public void NavigatePage_ControlsGlobalMedia() throws InterruptedException, IOException {
	  		   
			Thread.sleep(8000);
							  
				   //Select Risk Determination sidebar-left Module		    
				   assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
			 	   clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
			 	   Reporter.log("Select Risk Determination sidebar-left Module | ");
			       Thread.sleep(8000);
			      //Thread.sleep(8000);
		    	       
		           //Select Controls - Global/Media sub-module under Risk determination Module 
		           assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		           clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		           Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		           Thread.sleep(8000);
		           Thread.sleep(8000);
		           Thread.sleep(8000);
	  
	 }
	  
	  
		@Test(priority=211, enabled =true)
		  public void PageHearder_ControlsGlobalMedia() throws InterruptedException, IOException {
			
			 Thread.sleep(3000);
			   
			 // Click on Page header Icon
			 assertTextXpath("//h2/i");
			 Reporter.log("Click on Page header Icon | ");
			 Thread.sleep(1000);
			 mouseHoverByXpath("//h2/i");
			 Thread.sleep(1000);
			   
			 // Click on Page header Title
			 assertEquals("//h2", "Controls - Global");
			 Reporter.log("Click on Page header Title | ");
			 Thread.sleep(1000);
			 mouseHoverByXpath("//h2");
			 Thread.sleep(1000);
		}
		
		 @Test(priority=212, enabled = true)
		   public void PanelBar_ControlsGlobalMedia() throws IOException, InterruptedException {
				   
			   Thread.sleep(3000);
			   
			   //Click on Page breadcrumb
			   assertEquals("//ol", "Risk Determination Controls - Global");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(2000); 
			   
		   }
		   
		 @Test(priority=213, enabled = true)
		 public void PageLevelHelp_ControlsGlobalMedia() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000);
			   
			   //Click on PageHelp button Icon
			    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
		     clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
		     Reporter.log("Click on PageHelp button Icon | ");
		     Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    // Click OK Button in PageHelp pop-up window
			 assertTextXpath("html/body/div[3]/div/div/div[3]/button");
		     clickByXpath("html/body/div[3]/div/div/div[3]/button");
		     Reporter.log("Click OK Button in PageHelp pop-up window | ");
		     Thread.sleep(3000);
			   // Thread.sleep(3000);
			   
		 }
		 
		 @Test(priority=214, enabled = true)
		 public void RiskManagementMap_ControlsGlobalMedia() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000); 
			   //TestCase 34
			   // Click on Risk Management Map
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   Reporter.log("Click on Risk Management Map | ");
			   Thread.sleep(3000);
			   clickByXpath("html/body/div[3]/div/div/div[2]/button");
			   Thread.sleep(3000);
		 }
		
		
		@Test(priority=215, enabled =true)
		  public void ExpandControls_ControlsGlobalMedia() throws InterruptedException, IOException {
			
			 //Click on + Icon to open Control 
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  Reporter.log("Click on + Icon to open Control | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  // Click on '-' Icon to close Controls
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(5000);
			  
		}
		
		 @Test(priority=216, enabled =true)
		 public void IRMA8301_SelectResponse_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 		 		 
	 		
	 		  Thread.sleep(8000);
	 	 		  	  			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][1]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][2]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][3]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][4]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][5]//cw-answer-control//div[@class='btn-group answer-choices']/label[3]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][6]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][7]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][8]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][9]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][10]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][11]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][12]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][13]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][14]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][15]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][16]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][17]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][18]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  
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
			  Thread.sleep(3000);	
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][19]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][20]//cw-answer-control//div[@class='btn-group answer-choices']/label[3]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][21]//cw-answer-control//div[@class='btn-group answer-choices']/label[3]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][22]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][23]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][24]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][25]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][26]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][27]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][28]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][29]//cw-answer-control//div[@class='btn-group answer-choices']/label[3]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][30]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][31]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][32]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	
			 
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  
			  Thread.sleep(8000);
			  Thread.sleep(8000);
		  }
		
		@Test(priority=217, enabled =true)
		  public void Administrativecontrols_ControlsGlobalMedia() throws InterruptedException, IOException {
			
			Thread.sleep(8000);
			Thread.sleep(8000);
			
			//Click on Control Type Filter drop-down
	   	     clickByXpath("//*[@id='control-type']/div/div[1]/b");
	   	     Thread.sleep(5000);
	         clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
	   	     Thread.sleep(8000);
	   	     Thread.sleep(8000);	
	   	     
	   	      //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][7]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);
			  
			  //CLick on proceed button
			  clickByXpath("html/body/div[3]/div/div/div[3]/button[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][8]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);	 
			  
			  //CLick on proceed button
			  clickByXpath("html/body/div[3]/div/div/div[3]/button[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
	       	   
		}
		
		 @Test(priority=218, enabled =true)
		  public void AdminNotes_ControlsGlobalMedia() throws InterruptedException, IOException {
		
			 Thread.sleep(3000);
			 Thread.sleep(8000);
			 
			 
	      // Click on Notes button
		  assertTextXpath("//*[@id='container-body']/tr[3]/td[6]/div/a");
		  clickByXpath("//*[@id='container-body']/tr[3]/td[6]/div/a");
		  Reporter.log("Click on Notes button | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  // Click on New Button in Notes pop-up window
		  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		  Reporter.log("Click on New Button in Notes pop-up window | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		    //Enter some text in notes Editor 
		    assertTextXpath("//*[@id='DTE_Field_text']");
		    sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample notes");
		    Reporter.log("Enter some text in notes Editor | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		  
		     // Click on Create Button in Create Note pop-up window
		assertTextXpath("html/body/div[5]/div/div/div/div[4]/div[3]/button[1]");
		    clickByXpath("html/body/div[5]/div/div/div/div[4]/div[3]/button[1]");
		    Reporter.log("Click on Create Button in Create Note pop-up window | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		  
		    //Click on Close button in popup
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
		    clickByXpath("html/body/div[3]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		 
   }
		  
		  @Test(priority=219, enabled =false)
		  public void AdminDocuments_ControlsGlobalMedia() throws InterruptedException, IOException {
		      
			  Thread.sleep(3000);
			  Thread.sleep(8000);
			  
		   //Click on Document to upload
		    assertTextXpath("//*[@id='container-body']/tr[3]/td[7]/a/a");
		    clickByXpath("//*[@id='container-body']/tr[3]/td[7]/a/a");
		    Reporter.log("Click on Document to upload | ");
		    Thread.sleep(8000);
		    
		    //Click on New button from document pop-up
		    assertTextXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    clickByXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(8000);
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    Reporter.log("Click on Choose File from document pop-up | ");
		    Thread.sleep(8000);
		    
		    // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of pdf file | ");
	        Thread.sleep(8000);
	        Thread.sleep(3000);
	        //Thread.sleep(8000);
	        
	        //Click on Upload button from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		    clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		    Reporter.log("Click on Upload button from document pop-up | ");
		    Thread.sleep(8000); 
		    
		    //Click on Close button in popup
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		    
}
		
		  @Test(priority=220, enabled =true)
		  public void AssetRelatedcontrols_ControlsGlobalMedia() throws InterruptedException, IOException {
			
			Thread.sleep(8000);
			Thread.sleep(8000);
			
			 //Click on Control Type Filter drop-down
	   	     clickByXpath("//*[@id='control-type']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[3]/a");
	   	     Thread.sleep(8000);
	   	     Thread.sleep(8000);
	   	     
	   	     //Click on + Icon to open Control 
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  Reporter.log("Click on + Icon to open Control | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  assertTextXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[3]");
			  clickByXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[3]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  			  
		  }
		  
		  @Test(priority=221, enabled =true)
		  public void AssetRelatedNotes_ControlsGlobalMedia() throws InterruptedException, IOException {
		
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
		  
		//Click on Close button in popup
		    clickBycssSelector(".modal-footer > .pull-right");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		 
		 }
			
		  
		  @Test(priority=222, enabled =false)
		  public void AssetRelatedDocuments_ControlsGlobalMedia() throws InterruptedException, IOException {
		  
			  Thread.sleep(3000);
			  Thread.sleep(8000);
			  
		   //Click on Document to upload
		    assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[8]/a");
		    clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[8]/a");
		    Reporter.log("Click on Document to upload | ");
		    Thread.sleep(8000);
		    
		    //Click on New button from document pop-up
		    assertTextXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    clickByXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(8000);
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    Reporter.log("Click on Choose File from document pop-up | ");
		    Thread.sleep(8000);
		    
		    // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of pdf file | ");
	        Thread.sleep(8000);
	        Thread.sleep(3000);
	        //Thread.sleep(8000);
	        
	        //Click on Upload button from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		    clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		    Reporter.log("Click on Upload button from document pop-up | ");
		    Thread.sleep(8000);
	      
		   /* //Select any one of the listed item
		    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the listed item | ");
		    Thread.sleep(3000);
		    
		    //Select Delete button in Uploaded Document
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Select Delete button in Uploaded Document | ");
		    Thread.sleep(8000);
		    
		    // Click on Cancel button in Deleted Pop-up
		    assertTextXpath("//div[6]/div/div/div[3]/button");
		    clickByXpath("//div[6]/div/div/div[3]/button");
		    Reporter.log("Click on Cancel button in Deleted Pop-up | ");
		    Thread.sleep(3000);*/
		    
		  //Click on Close button in popup
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
}
			  
		  @Test(priority=223, enabled =true)
		  public void AssetrelatedCloseSubExpand_ControlsGlobalMedia() throws InterruptedException, IOException {
	 	 
			 Thread.sleep(3000);	 			  
			  
			  // Click on '-' Icon to close Controls
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
	   	     
		
	}

   @Test(priority=224, enabled =true)	
   public void NewORUpdatedControls_ControlsGlobalMedia() throws InterruptedException, IOException {
	 	 
			 Thread.sleep(3000);
				Thread.sleep(8000);
				
				//Click on New Or Updated Filter drop-down
		   	     clickByXpath("//*[@id='view-filter']");
		   	     Thread.sleep(3000);
		   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[3]/a");
		   	     Thread.sleep(8000);
		   	     Thread.sleep(8000);   	
		   	     
		   	  //Click on + Icon to open Control 
				  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
				  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
				  Reporter.log("Click on + Icon to open Control | ");
				  Thread.sleep(8000);
				  //Thread.sleep(3000);
				  //Thread.sleep(3000);
				  
				//Select 'Yes' option in Response choice of First listed Controls
				  assertTextXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[2]");
				  clickByXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[2]");
				  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
				  Thread.sleep(8000);
				  //Thread.sleep(3000);	 
				 
				  
   }
   
   @Test(priority=225, enabled =true)
	  public void NewORUpdatedNotes_ControlsGlobalMedia() throws InterruptedException, IOException {
	
		 Thread.sleep(3000);
		 Thread.sleep(8000);
		 
		 
   // Click on Notes button 
	  assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[7]/div");
	  clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[7]/div");
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
	 // assertTextXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[1]");
	  clickByXpath("html/body/div[5]/div/div/div/div[4]/div[3]/button[1]");
	  Reporter.log("Click on Create Button in Create Note pop-up window | ");
	  Thread.sleep(3000);
	  Thread.sleep(3000);
	  
	//Click on Close button in popup
	    clickBycssSelector(".modal-footer > .pull-right");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(8000);
	    Thread.sleep(8000);
	 
	 }
		
	  
	  @Test(priority=227, enabled =false)
	  public void NewORUpdatedDocuments_ControlsGlobalMedia() throws InterruptedException, IOException {
	  
		  Thread.sleep(3000);
		  Thread.sleep(8000);
		  
	   //Click on Document to upload
	    assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[8]/a");
	    clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[8]/a");
	    Reporter.log("Click on Document to upload | ");
	    Thread.sleep(8000);
	    
	    //Click on New button from document pop-up
	    assertTextXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
	    clickByXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
	    Reporter.log("Click on New button from document pop-up | ");
	    Thread.sleep(8000);
	    
	    //Click on Choose File from document pop-up
	    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
	    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
	    Reporter.log("Click on Choose File from document pop-up | ");
	    Thread.sleep(8000);
	    
	    // Using AutoIT
     Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
     Reporter.log("Given Filepath of pdf file | ");
     Thread.sleep(8000);
     Thread.sleep(3000);
     //Thread.sleep(8000);
     
     //Click on Upload button from document pop-up
	    assertTextXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
	    clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
	    Reporter.log("Click on Upload button from document pop-up | ");
	    Thread.sleep(8000);
   
	   /* //Select any one of the listed item
	    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
	    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
	    Reporter.log("Select any one of the listed item | ");
	    Thread.sleep(3000);
	    
	    //Select Delete button in Uploaded Document
	    assertTextXpath("//a[2]/span");
	    clickByXpath("//a[2]/span");
	    Reporter.log("Select Delete button in Uploaded Document | ");
	    Thread.sleep(8000);
	    
	    // Click on Cancel button in Deleted Pop-up
	    assertTextXpath("//div[6]/div/div/div[3]/button");
	    clickByXpath("//div[6]/div/div/div[3]/button");
	    Reporter.log("Click on Cancel button in Deleted Pop-up | ");
	    Thread.sleep(3000);*/
	    
	  //Click on Close button in popup
	    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
	    clickByXpath("html/body/div[4]/div/div/div[3]/button");
	    Reporter.log("Click on Close button in popup | ");
	    Thread.sleep(3000);
	    Thread.sleep(3000);
}
		  
	  @Test(priority=228, enabled =true)
	  public void NewORUpdatedCloseSubExpand_ControlsGlobalMedia() throws InterruptedException, IOException {
	 
		 Thread.sleep(3000);	 			  
		  
		  // Click on '-' Icon to close Controls
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
		  Reporter.log("Click on '-' Icon to close Controls | ");
		  Thread.sleep(3000);
		  
	  }
	  
	  @Test(priority=229, enabled =false)
	  public void ControlAdvisory_ControlsGlobalMedia() throws InterruptedException, IOException {
	 
		 Thread.sleep(3000);
		 
		// Click on Updated Control Advisory
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[2]/cw-advisory/a/span");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[2]/cw-advisory/a/span");
		  Reporter.log("Click on Updated Control Advisory | ");
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  // Click checkbox for Change Reviewed
		  assertTextXpath("//*[@id='change_review_id']/label");
		  clickByXpath("//*[@id='change_review_id']/label");
		  Reporter.log("Click checkbox for Change Reviewed | ");
		  Thread.sleep(3000);
		  Thread.sleep(5000);
		  
		// Click on Save button
		  assertTextXpath("html/body/div[3]/div/div/div[3]/button[2]");
		  clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
		  Reporter.log("Click on Save button | ");
		  Thread.sleep(8000);
		  Thread.sleep(2000);  	    
 	     
 	     //Click on New Or Updated Filter drop-down
 	     clickByXpath("//*[@id='view-filter']");
 	     Thread.sleep(3000);
 	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
 	     Thread.sleep(8000);
	     Thread.sleep(8000);
	
    }
		  
		    
	 	 @Test(priority=230, enabled =true)
		  public void PhysicalControls_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 
	 		Thread.sleep(2000); 	 		
			Thread.sleep(3000);
	 		
			//Click on Control Type Filter drop-down
	   	     clickByXpath("//*[@id='control-type']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[4]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(8000);
	   	     
	   	     //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][1]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(8000);	 
			  
			 /* //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][2]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][3]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][4]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);	 
			  
			//Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][5]//cw-answer-control//div[@class='btn-group answer-choices']/label[3]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][6]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][7]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);	 
			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][8]//cw-answer-control//div[@class='btn-group answer-choices']/label[4]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(5000);
			  Thread.sleep(3000);*/	 
	   	     
			  
	 	 }
	 	 
	 	 @Test(priority=231, enabled =true)
		  public void TechnicalControls_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 
	 		Thread.sleep(2000); 	 		
			Thread.sleep(3000);
	 		
			//Click on Control Type Filter drop-down
	   	     clickByXpath("//*[@id='control-type']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[5]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(8000);
	 			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][6]//cw-answer-control//div[@class='btn-group answer-choices']/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);	 
			  
			  	     
			  
	 	 }
	 	 
	 	 @Test(priority=232, enabled =true)
		  public void IRMA6318_QuickFilter_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 
	 		Thread.sleep(5000); 	 		
			Thread.sleep(3000);
	 	 
			//Click on Controltype Filter drop-down
	   	     clickByXpath("//*[@id='control-type']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[3]/a");
	   	     Thread.sleep(8000);
		     Thread.sleep(8000);
		     
		 	//Click on New Or Updated Filter drop-down
	   	     //clickByXpath("//*[@id='view-filter']");
	   	    // Thread.sleep(3000);
	   	    // clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
	   	     //Thread.sleep(8000);
	   	     //Thread.sleep(8000);  
	   	     clickByXpath("//*[@id='cr-advisory-filter']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[1]/a");
	   	     Thread.sleep(8000);
	   	     Thread.sleep(8000);   	     
	   	     
	      	
	 	 }
	 	 
	 	@Test(priority=233, enabled =true)
		  public void CHKFields_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 
	 		Thread.sleep(8000); 	 		
			Thread.sleep(3000);
			
		       
		       //Click on Control type filter drop-down
		       assertTextXpath("//*[@id='control-type']");
		 	     Thread.sleep(8000);
		 	     
		 	  //Click on Control type filter drop-down
		 	   assertTextXpath("//*[@id='view-filter']");
	          Thread.sleep(8000);
		 	     	 	        
			 // Click on Filter Button 
		    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]/i");
		   Thread.sleep(8000);
		 	   
		  //Click on Export Button
  	   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
	 	  Thread.sleep(8000);
		 	   
			
		  }
		  
	 	 @Test(priority=234, enabled = false)
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
			  clickByXpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div/ul/li/input");
			  sendvaluebyxpath("html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div[2]/div/div/ul/li/input", "TestControls");
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
		   		       
	 	 }
	 	 
	 	@Test(priority=235, enabled =false)
	    public void CustomControls_ControlsGlobalMedia() throws InterruptedException, IOException { 
	 		
	 		          Thread.sleep(3000);
	 		          
	 		       //Click on + Icon to open Control 
					  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
					  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
					  Reporter.log("Click on + Icon to open Control | ");
					  Thread.sleep(8000);
					  //Thread.sleep(3000);
					  //Thread.sleep(3000);
					  
					//Select 'Yes' option in Response choice of First listed Controls
					  assertTextXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[2]");
					  clickByXpath("//*[@id='media.global_media_answer_id']/div/ul/li[2]/div/label[2]");
					  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
					  Thread.sleep(8000);
					  //Thread.sleep(3000);	 
					  
				    /* //Click on proceed button to make global
					  //assertTextXpath("html/body/div[2]/div/div/div[3]/button[1]");
					  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
					  Reporter.log("Click on Proceed button | ");
					  Thread.sleep(8000);
					  Thread.sleep(2000);	*/
	 		          
	 		          
	 		          
	 	}
	 	 @Test(priority=236, enabled =false)
		  public void CustomControlsNotes_ControlsGlobalMedia() throws InterruptedException, IOException {
		
			 Thread.sleep(3000);
			 Thread.sleep(8000);
			 
			 
	    // Click on Notes button
			 assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[7]/div");
		  clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[7]/div");
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
		  
		//Click on Close button in popup
		    clickBycssSelector(".modal-footer > .pull-right");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(8000);
		    Thread.sleep(8000);
		 
		 }
			
		  
		  @Test(priority=237, enabled =false)
		  public void CustomControlsDocuments_ControlsGlobalMedia() throws InterruptedException, IOException {
		  
			  Thread.sleep(3000);
			  Thread.sleep(8000);
			  
		   //Click on Document to upload
		    assertTextXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[8]/a");
		    clickByXpath("//*[@id='component-groups-table']/tbody/tr[1]/td[8]/a");
		    Reporter.log("Click on Document to upload | ");
		    Thread.sleep(8000);
		    
		    //Click on New button from document pop-up
		    assertTextXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    clickByXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(8000);
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/button");
		    Reporter.log("Click on Choose File from document pop-up | ");
		    Thread.sleep(8000);
		    
		    // Using AutoIT
	      Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	      Reporter.log("Given Filepath of pdf file | ");
	      Thread.sleep(8000);
	      Thread.sleep(3000);
	      //Thread.sleep(8000);
	      
	      //Click on Upload button from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		    clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		    Reporter.log("Click on Upload button from document pop-up | ");
		    Thread.sleep(8000);
	    
		   /* //Select any one of the listed item
		    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the listed item | ");
		    Thread.sleep(3000);
		    
		    //Select Delete button in Uploaded Document
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Select Delete button in Uploaded Document | ");
		    Thread.sleep(8000);
		    
		    // Click on Cancel button in Deleted Pop-up
		    assertTextXpath("//div[6]/div/div/div[3]/button");
		    clickByXpath("//div[6]/div/div/div[3]/button");
		    Reporter.log("Click on Cancel button in Deleted Pop-up | ");
		    Thread.sleep(3000);*/
		    
		  //Click on Close button in popup
		    assertTextXpath("html/body/div[3]/div/div/div[3]/button");
		    clickByXpath("html/body/div[3]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
	}
			  
		  @Test(priority=238, enabled =false)
		  public void CustomControlsCloseSubExpand_ControlsGlobalMedia() throws InterruptedException, IOException {
		 
			 Thread.sleep(3000);	 			  
			  
			  // Click on '-' Icon to close Controls
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  
		  }
	 	
	 	 
	 	@Test(priority=239, enabled = false)
	    public void ClearFilter_ControlsGlobalMedia() throws InterruptedException, IOException { 
	 		
	 		          Thread.sleep(8000);
			
			       //Click on 'Clear Filter' Button 
			       assertTextXpath("//i[2]");
			 	   clickByXpath("//i[2]");			 		   
			       Thread.sleep(8000);
			       Thread.sleep(8000);
	 	 }
	 	 
	 
	 	
	 	@Test(priority=240, enabled = true)
	    public void NIST_ControlsGlobalMedia() throws InterruptedException, IOException { 
					  
	 		           Thread.sleep(6000);
	 		
					  // Click on NIST
	 		          assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[4]/div/div[1]/span");
					  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[4]/div/div[1]/span");
					  Reporter.log("Click on '-' Icon to close Controls | ");
					  Thread.sleep(8000);
					  clickByXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
					  Thread.sleep(8000);
					  
					  
	 	}
	 	
	 	@Test(priority=241, enabled = true)
	    public void HelpIcon_ControlsGlobalMedia() throws InterruptedException, IOException { 
					  
	 		           Thread.sleep(6000);
	 		
					  /*// Click on ? icon
					  assertTextXpath("//tr[3]/td[3]/span[3]/span/i");
					  clickByXpath("//tr[3]/td[3]/span[3]/span/i");
					  Reporter.log("Click on '-' Icon to close Controls | ");
					  Thread.sleep(8000);
					  			 
					  // Click on Ok button
					  clickByXpath("html/body/div[3]/div/div/div[3]/button");
					  Thread.sleep(8000);*/
					  
	 	}
	 	
	 	@Test(priority=242, enabled =true)
	    public void ProgressBar_ControlsGlobalMedia() throws InterruptedException, IOException { 
					  
	 		          Thread.sleep(6000);
	 		
					  //Click on Progress bar
					  assertTextXpath("//*[@id='container-body']/tr[1]/td[1]/div[1]/p");
					  mouseHoverByXpath("//*[@id='container-body']/tr[1]/td[1]/div[1]/p");
					  Thread.sleep(3000);
					  
					  
		  }
	 	
		@Test(priority=243, enabled =true)
	    public void IRMA9154_Export_ControlsGlobalMedia() throws InterruptedException, IOException { 
	 		
	 		          Thread.sleep(8000);
			         
	 		          //Click on Export Button
	 				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
					  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
					  Reporter.log("Click on Export Button | ");
					  Thread.sleep(8000);
					  //Thread.sleep(3000);
					  
					  //Click on Pdf 
					  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
					  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
					  Reporter.log("Click on Pdf | ");
					  Thread.sleep(8000);
					  Thread.sleep(8000);
					  
					  //Click on Export Button
					  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
					  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
					  Reporter.log("Click on Export Button | ");
					  Thread.sleep(8000);
					  //Thread.sleep(3000);
					  
					  //Click on CSV File
					  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
					  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
					  Reporter.log("Click on CSV File | ");
					  Thread.sleep(8000);
					  Thread.sleep(8000);
					  
	 	}
	 	
	 	    @Test(priority=244, enabled = true)
	 	    public void ColumnHeader_AssetInventoryList() throws IOException, InterruptedException {
	 		  
	 		  Thread.sleep(6000);
	 		   
	 		// Check ColumnHeader
	 		   assertEquals("//*[@id='controls']/thead/tr/th[2]", "Control Advisory");
	 		   Reporter.log("Check ColumnHeader | ");
	 		   Thread.sleep(3000);
	 		   
	 		// Check ColumnHeader
	 		   assertEquals("//*[@id='controlName']", "Control");
	 		   Reporter.log("Check ColumnHeader | ");
	 		   Thread.sleep(3000);
	 		   
	 		// Check ColumnHeader
	 		   assertEquals("//*[@id='selectOne']", "Control Response (default in bold)");
	 		   Reporter.log("Check ColumnHeader | ");
	 		   Thread.sleep(3000);
	 		   
	 		// Check ColumnHeader
	 		   assertEquals("//*[@id='controls']/thead/tr/th[5]", "Clear");
	 		   Reporter.log("Check ColumnHeader | ");
	 		   Thread.sleep(3000);
	 		   
	 		
	 	 } 
	 	
	 	   @Test(priority=245, enabled = false)
	 	   public void ClearResponse_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 	 
	 				 Thread.sleep(3000);
	 				 
	 			 // Click on Clear button to clear the response
	 			  assertTextXpath("//*[@id='control.global_control_answer_id']/div/span/i");
	 			  clickByXpath("//*[@id='control.global_control_answer_id']/div/span/i");
	 			  Reporter.log("Click on Clear button to clear the response | ");
	 			  Thread.sleep(5000);
	 			  Thread.sleep(3000);
	 			  
	 			  // Click on cancel button in Clear warnings pop-up 	
	 			  assertTextXpath("html/body/div[3]/div/div/div[3]/button[1]");
	 			  clickByXpath("html/body/div[3]/div/div/div[3]/button[2]");
	 			  Reporter.log("Click on cancel button in  Clear warnings pop-up | ");
	 			  Thread.sleep(3000);
	 			  Thread.sleep(2000);	 			  
      	 }
	 	 
	 	@Test(priority=246, enabled = false)
	 	   public void IRMA8301_WarningMessage_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 	 
	 				 Thread.sleep(3000);
	 				 
	 				 //Select 'Yes' option in Response choice of First listed Controls
	 			     clickByXpath("//tbody[@id='container-body']/tr[@class='control ng-scope'][1]//cw-answer-control//div[@class='btn-group answer-choices']/label[2]");
	 				 Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
	 				 Thread.sleep(5000);
	 				 Thread.sleep(3000);	  
	 				
	 				
	 	}
	 		 
	 	@Test(priority=260, enabled = true)
	    public void Autoloading_ControlsGlobalMedia() throws InterruptedException, IOException { 

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
	 		
}

}
