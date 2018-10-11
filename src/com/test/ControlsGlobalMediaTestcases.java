package com.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ControlsGlobalMediaTestcases extends WrapperClass {
	
	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=63, enabled =true)
	  public void NavigatePage_ControlsGlobalMedia() throws InterruptedException, IOException {
	  
		  Thread.sleep(8000);
		  Thread.sleep(8000);	
		    	       
		  //Select Controls - Global/Media sub-module under Risk determination Module 
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(3000);
		  Thread.sleep(8000);
		  //Thread.sleep(3000);
	  
	  
	  }
	  
	  
		@Test(priority=64, enabled =true)
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
		
		 @Test(priority=65, enabled = true)
		   public void PanelBar_ControlsGlobalMedia() throws IOException, InterruptedException {
				   
			   Thread.sleep(3000);
			   
			   // Click on Page breadcrumb
			   assertEquals("//ol", "Risk Determination Controls - Global");
			   Reporter.log("Click on Page breadcrumb | ");
			   Thread.sleep(2000);
			   mouseHoverByXpath("//ol");
			   Thread.sleep(1000); 
			   
			   // Click on Page breadcrumb
			   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 25 of 116 entries");
			   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 25 of 116 entries");
			  // Reporter.log("Showing 25 of 116 entries");
			  // Thread.sleep(2000);
			  // mouseHoverByXpath("//ol");
			  // Thread.sleep(1000); 
			   
		   }
		   
		 @Test(priority=66, enabled = true)
		 public void PageLevelHelp_ControlsGlobalMedia() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000);
			   
			   //Click on PageHelp button Icon
			    assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
		     clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[2]/cw-page-help/button");
		     Reporter.log("Click on PageHelp button Icon | ");
		     Thread.sleep(3000);
			    //Thread.sleep(3000);
			    
			    // Click OK Button in PageHelp pop-up window
			 assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		     clickByXpath("html/body/div[4]/div/div/div[3]/button");
		     Reporter.log("Click OK Button in PageHelp pop-up window | ");
		     Thread.sleep(3000);
			   // Thread.sleep(3000);
			   
		 }
		 
		 @Test(priority=67, enabled = true)
		 public void RiskManagementMap_ControlsGlobalMedia() throws IOException, InterruptedException {
			   
			   Thread.sleep(3000); 
			   //TestCase 34
			   // Click on Risk Management Map
			   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
			   Reporter.log("Click on Risk Management Map | ");
			   Thread.sleep(3000);
			   clickByXpath("html/body/div[4]/div/div/div[3]/button");
			   Thread.sleep(3000);
		 }
		
		
		@Test(priority=68, enabled =true)
		  public void ExpandControls_ControlsGlobalMedia() throws InterruptedException, IOException {
			
			 //Click on + Icon to open Control 
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  Reporter.log("Click on + Icon to open Control | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  // Click on '-' Icon to close Controls
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[1]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  
		}
		
		 @Test(priority=69, enabled =true)
		 public void SelectResponse_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 		 		 
	 		   Thread.sleep(2000);
	 	 		  	  			  
			  //Select 'Yes' option in Response choice of First listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);	 
			  
		     //Click on proceed button to make global
			  //assertTextXpath("html/body/div[2]/div/div/div[3]/button[1]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
			  Reporter.log("Click on Proceed button | ");
			  Thread.sleep(8000);
			  Thread.sleep(2000);	  
			  
			  //2nd
			  //Select 'Yes' option in Response choice of Second listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[3]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[3]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'Yes' option in Response choice of Second listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  // 3rd
			  //Select 'InProgress' option in Response choice of Third listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[5]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[5]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'InProgress' option in Response choice of Third listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  //Click on + Icon to open Control for negative scenario
			  assertTextXpath("//*[@id='container-body']/tr[5]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[5]/td[3]/span[1]");
			  Reporter.log("Click on + Icon to open Control | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			 //Click on any other option response control in open Controls for negative scenario
			  assertTextXpath("//*[@id='2-control']/td[2]/table/tbody/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='2-control']/td[2]/table/tbody/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Click on any other option response control in open Controls | ");
			  Thread.sleep(8000);
			  //Thread.sleep(3000);
			  //Thread.sleep(3000);		  
			  
			  // Click on '-' Icon to close Controls for negative scenario
			  assertTextXpath("//*[@id='container-body']/tr[5]/td[3]/span[1]");
			  clickByXpath("//*[@id='container-body']/tr[5]/td[3]/span[1]");
			  Reporter.log("Click on '-' Icon to close Controls | ");
			  Thread.sleep(3000);
			  
			  //4th
			  //Select 'No' option in Response choice of Four listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[7]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[7]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of Four listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  //5th
	          //Select 'NA' option in Response choice of Fifth listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[9]/td[4]/cw-s-response-choices/div/div/label[4]");
			  clickByXpath("//*[@id='container-body']/tr[9]/td[4]/cw-s-response-choices/div/div/label[4]");
			  Reporter.log("Select 'NA' option in Response choice of Fifth listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);

			  //6th
			  //Select 'InProgress' option in Response choice of 6th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[11]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[11]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'InProgress' option in Response choice of 6th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);

			  //7th
			  //Select 'No' option in Response choice of 7th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[13]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[13]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 7th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			 	  
	          //8th
	        //Select 'yes' option in Response choice of 8th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[15]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[15]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'yes' option in Response choice of 8th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);

			  //9th
			  //Select 'InProgress' option in Response choice of 9th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[17]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[17]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'InProgress' option in Response choice of 9th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  
			  //10th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[19]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[19]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
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
			  Thread.sleep(8000);
			 
			  //11th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[21]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[21]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	
			  
			//Click on proceed button to make global
			  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
			  Reporter.log("Click on Proceed button | ");
			  Thread.sleep(8000);
			  Thread.sleep(2000);		  
			  
			/*//12th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[23]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[23]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//13th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[25]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[25]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//14th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[27]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[27]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//15th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[29]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[29]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//16th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[31]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[31]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//17th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[33]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[33]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	
			  
			  //18th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[35]/td[4]/cw-s-response-choices/div/div/label[4]");
			  clickByXpath("//*[@id='container-body']/tr[35]/td[4]/cw-s-response-choices/div/div/label[4]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			  ArrowUp();
			 */
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
			  
			  Thread.sleep(2000); 
			  //Thread.sleep(3000);
		 	  //Click on Control Type Filter drop-down
		      clickByXpath("//*[@id='control-type']");
	         Thread.sleep(3000);
		   	 clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
		   	 Thread.sleep(8000);
		   	 Thread.sleep(8000);
		   	 
		   //7th
			  //Select 'No' option in Response choice of 7th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[13]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[13]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 7th listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);
			 	  
	          //8th
	        //Select 'yes' option in Response choice of 8th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[15]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[15]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'yes' option in Response choice of 8th listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);

			/*//Click on proceed button to make global
			  assertTextXpath("html/body/div[2]/div/div/div[3]/button[1]");
			  clickByXpath("html/body/div[2]/div/div/div[3]/button[1]");
			  Reporter.log("Click on Proceed button | ");
			  Thread.sleep(8000);
			  Thread.sleep(2000);	*/
			  
			  //9th
			  //Select 'InProgress' option in Response choice of 9th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[17]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[17]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'InProgress' option in Response choice of 9th listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);
			  
			  //10th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[19]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[19]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);
			  
			  ArrowDown();
			  ArrowDown();
			  ArrowDown();
			  ArrowDown();
			  ArrowDown();
			  ArrowDown();
			  ArrowDown();
			  ArrowDown();
			  Thread.sleep(8000);
			  Thread.sleep(2000);
			 
			  //11th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[21]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[21]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);	
			  
			/*//Click on proceed button to make global
			  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
			  Reporter.log("Click on Proceed button | ");
			  Thread.sleep(8000);
			  Thread.sleep(2000);	*/	  
			  
			//12th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[23]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[23]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(8000);
			  Thread.sleep(3000);	 
			  
/*			//13th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[25]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[25]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//14th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[27]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[27]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//15th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[29]/td[4]/cw-s-response-choices/div/div/label[2]");
			  clickByXpath("//*[@id='container-body']/tr[29]/td[4]/cw-s-response-choices/div/div/label[2]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//16th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[31]/td[4]/cw-s-response-choices/div/div/label[3]");
			  clickByXpath("//*[@id='container-body']/tr[31]/td[4]/cw-s-response-choices/div/div/label[3]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
			  
			//17th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[33]/td[4]/cw-s-response-choices/div/div/label[1]");
			  clickByXpath("//*[@id='container-body']/tr[33]/td[4]/cw-s-response-choices/div/div/label[1]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	
			  
			  //18th
			  //Select 'No' option in Response choice of 10th listed Controls
			  assertTextXpath("//*[@id='container-body']/tr[35]/td[4]/cw-s-response-choices/div/div/label[4]");
			  clickByXpath("//*[@id='container-body']/tr[35]/td[4]/cw-s-response-choices/div/div/label[4]");
			  Reporter.log("Select 'No' option in Response choice of 10th listed Controls | ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);	 
*/			  
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
		 
		 @Test(priority=70, enabled =true)
		  public void ClearResponse_ControlsGlobalMedia() throws InterruptedException, IOException {
	 	 
			 Thread.sleep(3000);
		 // Click on Clear button to clear the response 
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[5]/cw-s-response-clear/div/span/i");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[5]/cw-s-response-clear/div/span/i");
		  Reporter.log("Click on Clear button to clear the response | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  // Click on cancel button in Clear warnings pop-up 	
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  Reporter.log("Click on cancel button in  Clear warnings pop-up | ");
		  Thread.sleep(3000);
		  Thread.sleep(2000);

}
		 @Test(priority=71, enabled =true)
		  public void Notes_ControlsGlobalMedia() throws InterruptedException, IOException {
		
			 Thread.sleep(3000);
			 Thread.sleep(8000);
			 
			 
	      // Click on Notes button 
		  assertTextXpath("//*[@id='container-body']/tr[3]/td[6]/div/a");
		  clickByXpath("//*[@id='container-body']/tr[3]/td[6]/div/a");
		  Reporter.log("Click on Notes button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  // Click on New Button in Notes pop-up window
		  assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		  clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]/span");
		  Reporter.log("Click on New Button in Notes pop-up window | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  // Enter some text in notes Editor 
		  assertTextXpath("//*[@id='DTE_Field_text']");
		  sendvaluebyxpath("//*[@id='DTE_Field_text']", "Sample notes");
		  Reporter.log("Enter some text in notes Editor | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  // Click on Create Button in Create Note pop-up window
		 // assertTextXpath("html/body/div[4]/div/div/div/div[4]/div[3]/button[1]");
		  clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		  Reporter.log("Click on Create Button in Create Note pop-up window | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		   //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		 
		 }
		  
		  @Test(priority=72, enabled =false)
		  public void Documents_ControlsGlobalMedia() throws InterruptedException, IOException {
		  
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
		    assertTextXpath("//div[2]/div/div/div[3]/button");
		    clickByXpath("//div[2]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
}
		    
	 	 @Test(priority=73, enabled =true)
		  public void QuickFilter_ControlsGlobalMedia() throws InterruptedException, IOException {
	 		 
	 		Thread.sleep(2000); 	 		
			Thread.sleep(3000);
	 		
			//Click on Control Type Filter drop-down
	   	     clickByXpath("//*[@id='control-type']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");
	   	     Thread.sleep(3000);
	   	     Thread.sleep(8000);
	   	     clickByXpath("//*[@id='control-type']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[3]/a");
	   	     Thread.sleep(8000);
		     Thread.sleep(8000);
		     
	     	//Click on New Or Updated Filter drop-down
	   	     clickByXpath("//*[@id='view-filter']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[2]/a");
	   	     Thread.sleep(8000);
	   	     Thread.sleep(8000);   	     
	   	     
	      	/*// Click on Updated Control Advisory
			  assertTextXpath("//*[@id='container-body']/tr[1]/td[2]/cw-advisory/a/span");
			  clickByXpath("//*[@id='container-body']/tr[1]/td[2]/cw-advisory/a/span");
			  Reporter.log("Click on Updated Control Advisory | ");
			  Thread.sleep(3000);
			  Thread.sleep(3000);
			  
			  // Click checkbox for Change Reviewed
			  assertTextXpath("html/body/div[2]/div/div/div[3]/div/div/label");
			  clickByXpath("html/body/div[2]/div/div/div[3]/div/div/label");
			  Reporter.log("Click checkbox for Change Reviewed | ");
			  Thread.sleep(3000);
			  Thread.sleep(2000);
			  
			// Click on Save button
			  assertTextXpath("html/body/div[2]/div/div/div[3]/button[2]");
			  clickByXpath("html/body/div[2]/div/div/div[3]/button[2]");
			  Reporter.log("Click on Save button | ");
			  Thread.sleep(8000);
			  Thread.sleep(2000);  	    */ 
	   	     
	   	     //Click on New Or Updated Filter drop-down
	   	     clickByXpath("//*[@id='view-filter']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
	   	     Thread.sleep(8000);
		     Thread.sleep(8000);
	 	 }
		  
	 	 @Test(priority=74, enabled = false)
		  public void Filter_ControlsGlobalMedia() throws InterruptedException {
			  
	 		 Thread.sleep(3000);
		     Thread.sleep(3000);		  
		      	            
		      // Click on Filter Button 
			  try {
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]/i");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[3]/ul/li[1]/cw-filter/div/span[1]/i");
				  Reporter.log("Click on Filter Button | ");
			  }catch(Exception e)
			  {
				  e.printStackTrace();
				  Reporter.log("Click on Filter Button doesn't clicked | ");
			  }
			  Thread.sleep(3000);
			  Thread.sleep(3000);
		  
			  /*//Click on Controls drop-down 
			  assertTextXpath("//div/ul/li/input");
			  clickByXpath("//div/ul/li/input");
			  Reporter.log("Click on Controls drop-down ");
			  Thread.sleep(3000);
			  assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
			  clickByXpath("//div[2]/div/div/div/div/div/ul/li");
			  Reporter.log("Select value of Controls drop-down");
			  Thread.sleep(3000);*/
		    
			  /*//Click on Control type drop-down 
			  assertTextXpath("//div[3]/div/div/div/ul/li/input");
			  clickByXpath("//div[3]/div/div/div/ul/li/input");
			  Reporter.log("Click on Control type drop-down ");
			  Thread.sleep(3000);
			  assertTextXpath("//div/div/div/div/ul/li[2]");
			  clickByXpath("//div/div/div/div/ul/li[2]");
			  Reporter.log("Select value of Control type drop-down");
			  Thread.sleep(3000);
			  Thread.sleep(3000);*/
		    
			  /*//Click on Response drop-down
			  assertTextXpath("//div[4]/div/div/div/ul/li/input");
			  clickByXpath("//div[4]/div/div/div/ul/li/input");
			  Reporter.log("Click on Respons drop-down ");
			  Thread.sleep(3000);
			  assertTextXpath("//div[4]/div/div/div/div/ul/li[2]");
			  clickByXpath("//div[4]/div/div/div/div/ul/li[2]");
			  Reporter.log("Select value of Response drop-down");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
	*/	    
			  //Click on Media drop-down
			  assertTextXpath("//div[2]/div/div/div/ul/li/input");
			  clickByXpath("//div[2]/div/div/div/ul/li/input");
			  Reporter.log("Click on Media drop-down ");
			  Thread.sleep(3000);
			  assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
			  clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
			  Reporter.log("Select value of Media drop-down");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
		    
			  //Click on Media/Label drop-down
			  assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
			  clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
			  Reporter.log("Click on Media/label drop-down ");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
			  assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
			  clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
			  Reporter.log("Select value of Media/label drop-down");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
		    
			  //Click on Assets drop-down
			  assertTextXpath("//div[2]/div[3]/div/div/ul/li/input");
			  clickByXpath("//div[2]/div[3]/div/div/ul/li/input");
			  Reporter.log("Click on Assets drop-down ");
			  Thread.sleep(3000);
			  assertTextXpath("//div[3]/div/div/div/ul/li");
			  clickByXpath("//div[3]/div/div/div/ul/li");
			  Reporter.log("Select value of Assets drop-down");
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
		    
			  //Click on Submit button for filters
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
		       //Thread.sleep(3000);   
			       
			  // FilterText("//tr[*]/td[3]/cw-s-response-choices/div/div/label[1]", "Yes");
			       
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
			       Thread.sleep(8000);
			       Thread.sleep(3000);
	 	 }
	 	 
	 	@Test(priority=75, enabled =true)
	    public void Export_ControlsGlobalMedia() throws InterruptedException, IOException { 
	 		
	 		          Thread.sleep(3000);
			         
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
					   Thread.sleep(3000);
					  //Thread.sleep(3000);			  
					  
	 	}
	 	
	 	@Test(priority=76, enabled =false)
	    public void Icons_ControlsGlobalMedia() throws InterruptedException, IOException { 
					  
					// Click on NIST
					  assertTextXpath("//*[@id='container-body']/tr[1]/td[3]/span[4]/div/div[1]/span");
					  clickByXpath("//*[@id='container-body']/tr[1]/td[3]/span[4]/div/div[1]/span");
					  Reporter.log("Click on '-' Icon to close Controls | ");
					  Thread.sleep(3000);
					  clickByXpath("//*[@id='info-nist-modal']/div/div/div[3]/button");
					  Thread.sleep(3000);
					  
					// Click on ? icon
					  assertTextXpath("//span[3]/span/i");
					  clickByXpath("//span[3]/span/i");
					  Reporter.log("Click on '-' Icon to close Controls | ");
					  Thread.sleep(4000);
					  clickByXpath("html/body/div[4]/div/div/div[1]/button");
					  Thread.sleep(3000);
					  
					  //Click on Progress bar
					  assertTextXpath("//*[@id='container-body']/tr[1]/td[2]/div[1]/p");
					  mouseHoverByXpath("//*[@id='container-body']/tr[1]/td[2]/div[1]/p");
					  Thread.sleep(3000);
					  
					  
		  }
	 	
	 	@Test(priority=77, enabled =true)
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
