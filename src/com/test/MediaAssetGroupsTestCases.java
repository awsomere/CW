package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MediaAssetGroupsTestCases extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=226, enabled = true)
	  public void NavigationPage_MediaAssetGroups() throws InterruptedException, IOException
	  {     
	 	     Thread.sleep(8000);  
	 	     Thread.sleep(8000);
	 	     
	 	  //Select the Asset module at sidebar-left
	 		   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
	 		   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
	 		   Reporter.log("Selected the Asset module at sidebar-left | ");
	 		   Thread.sleep(6000);
	 		   //Thread.sleep(6000);  
	 	     
	 	    // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	       clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	       Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
	 	    Thread.sleep(6000); 
	  }
	  

	  @Test(priority=227, enabled = true)
	  public void PageHearder_MediaAsset() throws IOException, InterruptedException {
	 	   
	 	   Thread.sleep(6000);
	 	   
	 	   // Click on Page header Icon
	 	   assertTextXpath("//h2/i");
	 	   Reporter.log("Click on Page header Icon | ");
	 	   Thread.sleep(2000);
	 	   mouseHoverByXpath("//h2/i");
	 	   Thread.sleep(6000);
	 	   
	 	   // Click on Page header Title
	 	   assertEquals("//h2", "Component Groups");
	 	   Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(2000);
	 	   mouseHoverByXpath("//h2");
	 	   Thread.sleep(6000);
	  }
	  
	  @Test(priority=228, enabled = true)
	  public void PanelBar_MediaAsset() throws IOException, InterruptedException {
	 		   
	 	   Thread.sleep(6000);
	 	   // Click on Page breadcrumb
	 	   assertEquals("//ol", "Assets Component Groups");
	 	   Reporter.log("Click on Page breadcrumb | ");
	 	   Thread.sleep(2000);
	 	   mouseHoverByXpath("//ol");
	 	   Thread.sleep(2000); 
	 	   
	  }
	  
	  @Test(priority=229, enabled = true)
	  public void RecordCount_MediaAsset() throws IOException, InterruptedException {
	 	   
	 	  // Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 8 of 8 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
	  }
	  
	  
	  @Test(priority=230, enabled = true)
	  public void PageLevelHelp_MediaAsset() throws IOException, InterruptedException {
	 	   
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
	 	
	  @Test(priority=231, enabled = true)
	  public void RiskManagementMap_MediaAsset() throws IOException, InterruptedException {
	 	   
	 	   Thread.sleep(6000); 
	 	   //TestCase 34
	 	   // Click on Risk Management Map
	 	   assertTextXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	 	   clickByXpath("//*[@id='cw-panelbar']/div/div[2]/ul/li[3]/cw-appmap/button");
	 	   Reporter.log("Click on Risk Management Map | ");
	 	   Thread.sleep(6000);
	 	   clickByXpath("html/body/div[4]/div/div/div[3]/button");
	 	   Thread.sleep(6000);
	  }
	   
	  @Test(priority=232, enabled = true)
	  public void Check_ColumnHeader_MediaAsset() throws IOException, InterruptedException {
		  
		  Thread.sleep(6000);
		   
		// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[1]/div/div[2]/div[1]/div[1]", "Media ID");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[1]/div/div[2]/div[1]/div[2]", "Media");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	 
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='div-label']", "Label");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='div-asset']", "Information Assets");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);  
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='div-action']/span", "Action");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);  
		   
	  }
	  @Test(priority=233, enabled = true)
	  public void Edit_Check_ColumnsHeader_MediaAssetGroups() throws InterruptedException, IOException
	  
	  {    
		// Select the Edit button of BackUp Media in Media/Asset Groups page
	 	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       Reporter.log("Select the Edit button of BackUp Media in Media/Asset Groups page | ");
	 	    Thread.sleep(6000);
	 	    
	 	   Thread.sleep(6000);
	 	   
		  // Check ColumnHeader
	 	   assertEquals("//*[@id='uniqueMedia-layout']/table/thead/tr/th[1]", "Media Id");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	  // Check ColumnHeader
	 	   assertEquals("//*[@id='uniqueMedia-layout']/table/thead/tr/th[2]", "Media Name");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	  // Check ColumnHeader
	 	   assertEquals("//*[@id='th-label']", "Label");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	  // Check ColumnHeader
	 	   assertEquals("//*[@id='uniqueMedia-layout']/table/thead/tr/th[4]", "Risk Analyst");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	  // Check ColumnHeader
	 	   assertEquals("//*[@id='uniqueMedia-layout']/table/thead/tr/th[5]", "Due Date");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	  // Check ColumnHeader
	 	   assertEquals("//*[@id='th-asset']", "Information Assets");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	   //Check Inbox
	 	  EnabledTextByXpath("//*[@id='newBox']");
	 	 Thread.sleep(3000);
	 	Thread.sleep(3000);
	 	
	 	//Check Save Button
	 	  EnabledTextByXpath("//*[@id='save']");
	 	 Thread.sleep(3000);
	 	Thread.sleep(3000);
	 	
	 	//Check Cancel button
	 	  EnabledTextByXpath("//*[@id='mediaForm']/div/div[3]/input[2]");
	 	 Thread.sleep(3000);
	  }
	  
	  @Test(priority=234, enabled = true)
	  public void Edit_MediaAssetGroups() throws InterruptedException, IOException
	  
	  {    

	 	/* // Select the Edit button of BackUp Media in Media/Asset Groups page
	 	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       Reporter.log("Select the Edit button of BackUp Media in Media/Asset Groups page | ");
	 	    Thread.sleep(6000);*/
	 	   
	 	    // Enter Label in Edit Media/Asset Groups
	 	    assertTextXpath("//td[3]/input");
	 	    sendvaluebyxpath("//td[3]/input", "sample Backup label");
	 	    Reporter.log("Enter label in Edit Media/Asset Groups | ");
	 	    Thread.sleep(6000); 
	 	   
	 	    // Select the Risk Analysis for Edit Media/Asset Groups
	 	    selectByXpath_Visibletext("//select[@id='']", "Uma M");
	 	    Reporter.log("Select the Risk Analysis for Edit Media/Asset Groups | ");
	 	    Thread.sleep(6000); 
	 	    
	  }
	  
	  @Test(priority=235, enabled = true)
	  public void CreatingGroups_UncheckCopy_MediaAssetGroups() throws InterruptedException, IOException
	  
	  {    
	 	    	    
	 	    // Select the drag Asset and drop into INBOX
	 	    dragAnddropByXpath("//li[1]/div[2]", "//*[@id='newBox']");
	 	    Reporter.log("Select the drag Asset and drop into INBOX | ");
	 	    Thread.sleep(1000); 
	 	    //clickByXpath("//div/div[3]/div/div");
	 	    Thread.sleep(6000);
	 	    Thread.sleep(2000);   
	 	    	   
	 	    //Move this Item Window appears and click on Proceed button
	 	   // assertTextXpath("//div[3]/button[1]");
	 	   // clickByXpath("//div[3]/button[1]");
	 	    Reporter.log("Move this Item Window appears and click on Proceed button | ");
	 	    Thread.sleep(6000); 
	 	    //Thread.sleep(6000); 
	 	   
	 	// Select the added calendar for Edit Media/Asset Groups
	 	    sendvaluebyxpath("//td[5]/input", "01/02/2018");
	 	    Reporter.log("Select the added calendar for Edit Media/Asset Groups | ");
	 	    Thread.sleep(6000); 
	 	   clickByXpath("//*[@id='mediaForm']/div/div[2]");
	 	  Thread.sleep(3000);  	   
	 	   
	 	    //Click on Save Button
	 	    assertTextXpath("//*[@id='save']");
	       clickByXpath("//*[@id='save']");
	       Reporter.log("Click on Save Button | ");
	 	    Thread.sleep(6000); 
	 	   Thread.sleep(2000);
	  }
	  
	  @Test(priority=236, enabled = true)
	  public void Chk_SplitedGroup_UnCheckCopy_MediaAssetGroups() throws InterruptedException, IOException
	  
	  {    
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[2]/span", "Backup Media");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[1]/div/div[2]/div[3]/div[2]/span", "Backup Media");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	  
	  }
	  
	  @Test(priority=237, enabled = true)
	    public void Chk_CopyCheckbox_UnCheck_MediaAssetGroups() throws InterruptedException, IOException
	     
	      { 
		  
		  Thread.sleep(6000);
		  
		//Select Risk Determination sidebar-left Module
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
		  Reporter.log("Select Risk Determination sidebar-left Module | ");
		  Thread.sleep(5000);
		  //Thread.sleep(3000);  
	 	   
	 	//Click on Risk Questionnaire List Page
	        assertTextLink("Risk Questionnaire List");
           clickBylinktext("Risk Questionnaire List");
		    Reporter.log("Click on Controls Review Page | ");
		    Thread.sleep(8000);
		    Thread.sleep(2000);
		    Thread.sleep(3000);
		    
		    //Check the COntrol, Response, Notes and Documents are Not copied from Source Code by getting value
		    gettext("//*[@id='content']/tr[1]/td[1]/div[1]/p");
		    Thread.sleep(3000);
		    
		  //Check the COntrol, Response, Notes and Documents are Not copied from Source Code by getting value
		    GetText("//*[@id='content']/tr[2]/td[1]/div[1]/p");
		    Thread.sleep(3000);
		    
		    // Compare the value
		    NotEqualCompareTextValue("gettext","GetText");
		    Thread.sleep(3000);	    
		    
	      }
	  
	  @Test(priority=238, enabled = true)
	    public void SplitGroup_SourceGroup_MediaAssetGroups() throws InterruptedException, IOException
	     
	      { 
		  
		//Select the Asset module at sidebar-left
		   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
		   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
		   Reporter.log("Selected the Asset module at sidebar-left | ");
		   Thread.sleep(6000);
		   //Thread.sleep(6000);  
		   
		   // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	       clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	       Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
	 	    Thread.sleep(6000); 
	 	   Thread.sleep(6000);
		   
		  // Select the Edit button of BackUp Media in Media/Asset Groups page
	 	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       Reporter.log("Select the Edit button of BackUp Media in Media/Asset Groups page | ");
	 	    Thread.sleep(6000);
	 	  		 	    
	 	    // Select the drag Asset and drop into INBOX
	 	    dragAnddropByXpath("//tr[2]/td[6]/ul/li/div[2]", "//li/div[2]");
	 	    Reporter.log("Select the drag Asset and drop into INBOX | ");
	 	    Thread.sleep(1000); 
	 	    //clickByXpath("//div/div[3]/div/div");
	 	    Thread.sleep(6000);
	 	    Thread.sleep(2000);   
	 	    	   
	 	    //Move this Item Window appears and click on Proceed button
	 	   // assertTextXpath("//div[3]/button[1]");
	 	   clickByXpath("html/body/div[5]/div/div/div[3]/button[1]");
	 	    Reporter.log("Move this Item Window appears and click on Proceed button | ");
	 	    Thread.sleep(6000); 
	 	    //Thread.sleep(6000);  	  
	 	    
	 	   // Enter Label in Edit Media/Asset Groups
	 	    assertTextXpath("//td[3]/input");
	 	    sendvaluebyxpath("//td[3]/input", "Test Backup label");
	 	    Reporter.log("Enter label in Edit Media/Asset Groups | ");
	 	    Thread.sleep(6000); 
	 	   
	 	    //Click on Save Button
	 	    assertTextXpath("//*[@id='save']");
	       clickByXpath("//*[@id='save']");
	       Reporter.log("Click on Save Button | ");
	 	    Thread.sleep(6000); 
	 	   Thread.sleep(2000);
	 	   
	      }
	  
	  @Test(priority=239, enabled = true)
	  public void SplitedGroup_Rejoin_MediaAssetGroups() throws InterruptedException, IOException
	  
	  {   
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[2]/span", "Backup Media");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   		  
	  }
	  
	  
	  @Test(priority=240, enabled = true)
	    public void CreatingGroups_CheckCopy_MediaAssetGroups() throws InterruptedException, IOException
	     
	      {
		   
		  // Select the Edit button of BackUp Media in Media/Asset Groups page
	 	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[1]/a");
	       Reporter.log("Select the Edit button of BackUp Media in Media/Asset Groups page | ");
	 	    Thread.sleep(6000);
	 	   Thread.sleep(3000);
	 	  
	 	   ArrowDown();
	 	   ArrowDown();
	 	Thread.sleep(6000); 
	 	   
	 	//Check on Copy Risk Registry Information from the source group checkbox
	 	   //clickByXpath("//*[@id='content']/div[2]/div[2]/div/div[4]");
	 	 // Thread.sleep(3000);
	 	doubleclickbycssSelector("#dupGroup");
	 	   Reporter.log("Move this Item Window appears and click on Proceed button | ");
	 	   Thread.sleep(6000); 
	 	    
	 	    // Select the drag Asset and drop into INBOX
	 	    dragAnddropByXpath("//li/div[2]", "//*[@id='newBox']");
	 	    Reporter.log("Select the drag Asset and drop into INBOX | ");
	 	    Thread.sleep(1000); 
	 	    //clickByXpath("//div/div[3]/div/div");
	 	    Thread.sleep(6000);
	 	    Thread.sleep(2000);   
	 	    	   
	 	    //Move this Item Window appears and click on Proceed button
	 	   // assertTextXpath("//div[3]/button[1]");
	 	  // clickByXpath("//div[3]/button[1]");
	 	   // Reporter.log("Move this Item Window appears and click on Proceed button | ");
	 	   // Thread.sleep(6000); 
	 	    //Thread.sleep(6000);  	   
	 	   
	 	    //Click on Save Button
	 	    assertTextXpath("//*[@id='save']");
	       clickByXpath("//*[@id='save']");
	       Reporter.log("Click on Save Button | ");
	 	    Thread.sleep(6000); 
	 	   Thread.sleep(2000);
	 	   
	      }
	  
	  @Test(priority=241, enabled = true)
	  public void Chk_SplitedGroup_CheckCopy_MediaAssetGroups() throws InterruptedException, IOException
	  
	  {   
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[2]/span", "Backup Media");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[1]/div/div[2]/div[3]/div[2]/span", "Backup Media");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
	 	   
		  
		  Thread.sleep(6000);
		  
	  }
		  
		  @Test(priority=242, enabled = true)
		    public void Chk_CopyCheckbox_Check_MediaAssetGroups() throws InterruptedException, IOException
		     
		      { 
		  
		//Select Risk Determination sidebar-left Module
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
		  Reporter.log("Select Risk Determination sidebar-left Module | ");
		  Thread.sleep(5000);
		  //Thread.sleep(3000);  
	 	   
	 	//Click on Risk Questionnaire List Page
	        assertTextLink("Risk Questionnaire List");
         clickBylinktext("Risk Questionnaire List");
		    Reporter.log("Click on Controls Review Page | ");
		    Thread.sleep(8000);
		    Thread.sleep(2000);
		    Thread.sleep(3000);
		    
		    //Check the COntrol, Response, Notes and Documents are Not copied from Source Code by getting value
		    gettext("//*[@id='content']/tr[1]/td[1]/div[1]/p");
		    Thread.sleep(3000);
		    
		  //Check the Cntrol, Response, Notes and Documents are Not copied from Source Code by getting value
		    GetText("//*[@id='content']/tr[2]/td[1]/div[1]/p");
		    Thread.sleep(3000);
		    
		    // Compare the value
		    CompareTextValue("gettext","GetText");
		    Thread.sleep(3000);	    
	      }
		  
	      @Test(priority=243, enabled = true)
	    public void Delete_Cancel_MediaAssetGroups() throws InterruptedException, IOException
	     
	      {  
	    	  
	    	//Select the Asset module at sidebar-left
			   assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");
			   clickByXpath("//*[@id='sidebar-left']/ul/li[3]/a/span[2]");  	
			   Reporter.log("Selected the Asset module at sidebar-left | ");
			   Thread.sleep(6000);
			   //Thread.sleep(6000);  
			   
			   // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
		 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
		       clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
		       Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
		 	    Thread.sleep(6000); 
		 	   Thread.sleep(6000);
	 	   
	 	    // Delete the Asset in Media/Asset Groups
	 	    assertTextXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
	 	    clickByXpath("//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/div[5]/div[2]/a");
	 	    Reporter.log("Delete the Asset in Media/Asset Groups | ");
	 	    Thread.sleep(6000); 
	 	   
	 	    //warning pop-up get appears and click on cancel button
	 	    assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
	 	    clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
	 	    Reporter.log("warning pop-up get appears and click on cancel button | ");
	 	    Thread.sleep(6000); 
	 	    Thread.sleep(2000); 	 
	 	   
	      } 
	    
	    @Test(priority=244, enabled = true)
	    public void Edit_CreateGroups_MediaAssetGroups() throws InterruptedException, IOException
	     
	      {  
	 	   
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	Thread.sleep(6000); 
	    	
	 	    // Edit the  Media/Asset Groups
	 	    assertTextXpath("//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/div[5]/div[1]/a");
	 	    clickByXpath("//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/div[5]/div[1]/a");
	 	    Reporter.log("Delete the Asset in Media/Asset Groups | ");
	 	    Thread.sleep(6000); 
	 	   
	 	// Select the drag Asset and drop into INBOX
	 	    dragAnddropByXpath("//li[1]/div[2]", "//*[@id='newBox']");
	 	    Reporter.log("Select the drag Asset and drop into INBOX | ");
	 	    Thread.sleep(1000); 
	 	    //clickByXpath("//div/div[3]/div/div");
	 	    Thread.sleep(6000);
	 	    Thread.sleep(2000);   
	 	  
	 	    //Click on Save Button
	 	    assertTextXpath("//*[@id='save']");
	       clickByXpath("//*[@id='save']");
	       Reporter.log("Click on Save Button | ");
	 	    Thread.sleep(6000); 
	 	   Thread.sleep(2000);	 
	 	   
	      } 
	    
	    @Test(priority=245, enabled = true)
	    public void DeleteMedia_MediaAssetGroups() throws InterruptedException, IOException
	     
	      {  
	 	   
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	Thread.sleep(6000); 
	    	
	 	    // Delete the Asset in Media/Asset Groups
	 	    assertTextXpath("//*[@id='content']/div[2]/div[3]/div/div[2]/div[3]/div[5]/div[2]/a");
	 	    clickByXpath("//*[@id='content']/div[2]/div[3]/div/div[2]/div[3]/div[5]/div[2]/a");
	 	    Reporter.log("Delete the Asset in Media/Asset Groups | ");
	 	    Thread.sleep(6000); 
	 	   
	 	    //warning pop-up get appears and click on cancel button
	 	    assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
	 	    clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
	 	    Reporter.log("warning pop-up get appears and click on cancel button | ");
	 	    Thread.sleep(6000); 
	 	    Thread.sleep(2000); 	 
	 	    
	 	   refreshpage();
	 	  Thread.sleep(6000); 
	 	 Thread.sleep(6000); 
	 	 Thread.sleep(6000); 
	 	 Thread.sleep(6000); 
	 	    
	 	   
	      } 
	    
	    
	    @Test(priority=246, enabled = true)
	    public void Chk_DeleteMedia_AssetInventoryList() throws InterruptedException, IOException
	     
	      {  
	 	   
	 	//Select Asset Inventory List Sub-module
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[1]/a");
		    Reporter.log("Selected Asset Inventory List Sub-module | ");
		    Thread.sleep(6000);
		    
		 // Enter some text in Search Text-box
		    assertTextXpath("//*[@id='assets_filter']/label/input");
	   sendvaluebyxpath("//*[@id='assets_filter']/label/input", "Asset Wizard through Automation");
	   Reporter.log("Enter some text in Search Text-box | ");
	   Thread.sleep(6000);
		    
	// Select one of the added Asset in Asset Inventory List
	    assertTextXpath("//*[@id='assets']/tbody/tr/td[2]");
	    clickByXpath("//*[@id='assets']/tbody/tr/td[2]");
     Reporter.log("Select one of the added Asset in Asset Inventory List | ");
     Thread.sleep(6000); 
	  
     // Click on Edit button for listed Asset
     assertTextXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[1]");
     clickByXpath("//*[@id='assets_wrapper']/div[1]/div[1]/div[1]/div[2]/button[1]");
     Reporter.log("Click on Edit button for listed Asset | ");
	    Thread.sleep(6000);
	    Thread.sleep(6000);
	    
	    ArrowDown();
    	ArrowDown();
    	ArrowDown();
    	ArrowDown();
    	ArrowDown();
    	ArrowDown();
    	ArrowDown();
    	Thread.sleep(6000); 
    
	 // Fill data for FirstName       
       	assertTextXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
       clickByXpath("//*[@id='End User Devices']/div/div[2]/div[1]/div[2]/div/label");
       Thread.sleep(6000);  
       
       ArrowDown();
   	ArrowDown();
   	ArrowDown();
   	Thread.sleep(6000); 

       //Uncheck the Add neww Asset checkbox
       assertTextXpath("//*[@id='submitButton']/div[4]/div/div/label");
     clickByXpath("//*[@id='submitButton']/div[4]/div/div/label"); 
     Thread.sleep(6000);    
     
       // click on Done button and save
       	assertTextXpath("//*[@id='submitButton']/div[2]/button[2]");
           clickByXpath("//*[@id='submitButton']/div[2]/button[2]"); 
           Thread.sleep(6000);      
           Reporter.log("Successfully Asset created | ");
       Thread.sleep(8000); 
       Thread.sleep(8000); 
       //Thread.sleep(6000); 
       //Thread.sleep(6000); 		    
		    
	      }
	    
	    @Test(priority=247, enabled = true)
	    public void Chk_AddedMedia_MediaAssetGroups() throws InterruptedException, IOException
	     
	      { 
	    	
		   // Select the Media/Asset Groups sub-modules listed in Asset Inventory List	  
	 	    assertTextXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	       clickByXpath("//*[@id='sidebar-left']/ul/li[3]/ul/li[3]/a");
	       Reporter.log("Select the Media/Asset Groups sub-modules listed in Asset Inventory List | ");
	 	    Thread.sleep(6000); 
	 	   Thread.sleep(6000);
	 	   
	 	  ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	ArrowDown();
	    	Thread.sleep(6000); 
	    	
	 	// Check ColumnHeader
	 	   assertEquals("//*[@id='content']/div[2]/div[3]/div/div[2]/div[2]/div[4]/ul/li/span", "Asset Wizard through Automation ; Pager Media ; TestingAsset");
	 	   Reporter.log("Check ColumnHeader | ");
	 	   Thread.sleep(3000);
}
}

