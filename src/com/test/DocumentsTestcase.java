package com.test;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DocumentsTestcase extends WrapperClass {

	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=219, enabled =true)
	  public void NavigatePage_Documents() throws InterruptedException, IOException {
		  
		    Thread.sleep(8000);		
		    Thread.sleep(8000);		
		    Thread.sleep(8000);		
		    Thread.sleep(8000);		
		    Thread.sleep(8000);		
		    Thread.sleep(8000);		
	   	    
		    //Click on Full Screen Button 
	        assertTextXpath("//a[2]/i");
	        clickByXpath("//a[2]/i");
	        Reporter.log("Click on Full Screen Button  | ");
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
		    		   		    		
		    
		    //Select the Document module at sidebar-left
		    assertTextXpath("//*[@id='sidebar-left']/ul/li[7]/a/span[2]");
		    clickByXpath("//*[@id='sidebar-left']/ul/li[7]/a/span[2]");  	
		    Reporter.log("Selected the Document module at sidebar-left | ");
		    Thread.sleep(3000);
		    Thread.sleep(5000);	
		   
}
	  
	@Test(priority=220, enabled =true)
	  public void PageHearder_Documents() throws InterruptedException, IOException {
		
		 Thread.sleep(3000);
		   
		 // Click on Page header Icon
		 assertTextXpath("//h2/i");
		 Reporter.log("Click on Page header Icon | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2/i");
		 Thread.sleep(1000);
		   
		 // Click on Page header Title
		 assertEquals("//h2", "Documents");
		 Reporter.log("Click on Page header Title | ");
		 Thread.sleep(1000);
		 mouseHoverByXpath("//h2");
		 Thread.sleep(1000);
	}
	
	 @Test(priority=221, enabled = true)
	   public void PanelBar_Documents() throws IOException, InterruptedException {
			   
		   Thread.sleep(3000);
		   
		   // Click on Page breadcrumb
		   assertEquals("//ol", "Documents");
		   Reporter.log("Click on Page breadcrumb | ");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000); 
		   
		  /* // Click on Page breadcrumb
		   assertEquals("//*[@id='body-content']/div/section/cw-pagination-indicator/div", "Showing 1 of 1 entries");
		   //assertEquals("//*[@id='body-content']/div/cw-pagination-indicator/div", "Showing 25 of 47 entries");
		   Reporter.log("Showing 7 of 7 entries");
		   Thread.sleep(2000);
		   mouseHoverByXpath("//ol");
		   Thread.sleep(1000);*/ 
		   
	   }
	   
	 @Test(priority=222, enabled = false)
	 public void PageLevelHelp_Documents() throws IOException, InterruptedException {
		   
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
		
	 @Test(priority=223, enabled = false)
	 public void RiskManagementMap_Documents() throws IOException, InterruptedException {
		   
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


	  @Test(priority=224, enabled =true)
	  public void ChkEachFields_Documents() throws InterruptedException, IOException {
     
        // Click on Upload Button
	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
	    
	  //Click on Quick Column Selector Filter drop-down
	    assertTextXpath("//*[@id='control-type']");
  	     Thread.sleep(3000);
	     
	    // Click on Filter Button 
  	   assertTextXpath("//cw-filter/div/span/i");
	  	  		
	  	//Click on Export Button
  	 assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
  	 
  	//Click on Column Selector Button
  	 assertTextXpath("//*[@id='column_selector_button']/i");
 }
	
	@Test(priority=225, enabled =true)
	  public void QuickFilter_Documents() throws InterruptedException, IOException {
		
		//Click on Quick Column Selector Filter drop-down
  	     clickByXpath("//*[@id='control-type']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[3]/a");
  	     Thread.sleep(5000);
  	     Thread.sleep(3000);
  	     
  	     clickByXpath("//*[@id='control-type']");
  	     Thread.sleep(3000);
  	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
	     Thread.sleep(5000);
	        Thread.sleep(5000);
	
	}
	
	@Test(priority=226, enabled =false)
	  public void MultiSelector_Documents() throws InterruptedException, IOException {
		
		 // Multi-row selector
	}

	
	
	@Test(priority=227, enabled =true)
	  public void Upload_Documents() throws InterruptedException, IOException {
		
		//1st file
        // Click on Upload Button
 	    assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
        clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/span/div/span");
        Reporter.log("Click on Upload Button | ");
        Thread.sleep(5000);
        
        //Click on Select File
        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
        clickByXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
        Reporter.log("clicked on Browser Button | ");
        Thread.sleep(5000);
        				     
        // Using AutoIT
        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload5.exe"); //Uploading xls file using AutoIT
        Reporter.log("Given Filepath of pdf file | ");
        Thread.sleep(3000);
        Thread.sleep(5000);
			        	     
        // Click on Upload Button
        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
        clickByXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
        Reporter.log("Successfully Uploaded 'CSVDoc' file | ");
 	    Thread.sleep(5000);
 	    Thread.sleep(5000);
 	    Thread.sleep(5000);
	}
	
	@Test(priority=228, enabled =true)
	  public void Notes_Documents() throws InterruptedException, IOException {
		
	//Click on Notes button to add text
    assertTextXpath("//*[@id='content']/tr[1]/td[6]/span/a");
    clickByXpath("//*[@id='content']/tr[1]/td[6]/span/a");
    Reporter.log("Click on Notes button to add text | ");
    Thread.sleep(5000);
    Thread.sleep(3000);
    
    //Click on New button in Notes pop-up window
    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
    Reporter.log("Click on New button in Notes pop-up window | ");
    Thread.sleep(5000);
    Thread.sleep(3000);
    
    // Enter Text for Note textarea
    assertTextXpath("//*[@id='DTE_Field_text']");
    sendvaluebyxpath("//*[@id='DTE_Field_text']", "created notes");
    Reporter.log("Enter Text for Note textarea | ");
    Thread.sleep(5000);
    //Thread.sleep(5000);
    
    // Click on Create Button
    assertTextXpath("//div[4]/div[3]/button[1]");
    clickByXpath("//div[4]/div[3]/button[1]");
    Reporter.log("Click on Create Button | ");
    Thread.sleep(5000);
    //Thread.sleep(5000);
    
 // Select any one of the Listed Notes
    assertTextXpath("//*[@id='note-details-table']/tbody/tr/td[2]");
    clickByXpath("//*[@id='note-details-table']/tbody/tr/td[2]");
    Reporter.log("Select any one of the Listed Notes | ");
    Thread.sleep(5000);
    //Thread.sleep(5000);
    
 // Click on Edit Button
    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[2]/span");
    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[2]/span");
    Reporter.log("Click on Edit Button | ");
    Thread.sleep(5000);
    //Thread.sleep(5000);
    
   // Enter Text for Note textarea
    assertTextXpath("//*[@id='DTE_Field_text']");
    sendvaluebyxpath("//*[@id='DTE_Field_text']", "Edit notes");
    Reporter.log("Enter Text for Note textarea | ");
    Thread.sleep(5000);
    //Thread.sleep(5000);
    
    // Click on Save Button
    assertTextXpath("//div[4]/div[3]/button[1]");
    clickByXpath("//div[4]/div[3]/button[1]");
    Reporter.log("Click on Save Button | ");
    Thread.sleep(5000);
    //Thread.sleep(5000);
    
    //Click on Close button in popup
    assertTextXpath("html/body/div[4]/div/div/div[1]/button");
    clickByXpath("html/body/div[4]/div/div/div[1]/button");
    Reporter.log("Click on Close button in popup | ");
    Thread.sleep(5000);
    Thread.sleep(5000);
	
	
}
	
	@Test(priority=229, enabled =true)
	  public void SubRowsUpload_Documents() throws InterruptedException, IOException {
	
		
		// Click on Upload Button
 	    assertTextXpath("//*[@id='content']/tr/td[6]/a[1]/div/span");
        clickByXpath("//*[@id='content']/tr/td[6]/a[1]/div/span");
        Reporter.log("Click on Upload Button | ");
        Thread.sleep(5000);
		
		  //Click on Select File
        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
        clickByXpath("//*[@id='document-upload-modal']/div/div/div[2]/div/div/form/label/div");
        Reporter.log("clicked on Browser Button | ");
        Thread.sleep(5000);
        				     
        // Using AutoIT
        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload5.exe"); //Uploading xls file using AutoIT
        Reporter.log("Given Filepath of pdf file | ");
        Thread.sleep(3000);
        Thread.sleep(5000);
			        	     
        // Click on Upload Button
        assertTextXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
        clickByXpath("//*[@id='document-upload-modal']/div/div/div[3]/button[2]");
        Reporter.log("Successfully Uploaded 'CSVDoc' file | ");
 	    Thread.sleep(5000);
 	    Thread.sleep(3000);
	}
	
	@Test(priority=230, enabled =true)
	  public void DownloadandDelete_Documents() throws InterruptedException, IOException {
 	   
		//Click on Download button
 	    assertTextXpath("//*[@id='content']/tr/td[6]/a[2]/i");
 	    clickByXpath("//*[@id='content']/tr/td[6]/a[2]/i");
 	    Reporter.log("Click on Expand Button | ");
 	    Thread.sleep(5000);
 	    Thread.sleep(3000);
 	    
 	 //Click on Delete button
 	    assertTextXpath("//*[@id='content']/tr/td[6]/a[3]/i");
 	    clickByXpath("//*[@id='content']/tr/td[6]/a[3]/i");
 	    Reporter.log("Click on Expand Button | ");
 	    Thread.sleep(5000);
 	   clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
 	   Thread.sleep(3000);
 	     
		//Click on Expand button
 	    assertTextXpath("//*[@id='content']/tr/td[1]/span");
 	    clickByXpath("//*[@id='content']/tr/td[1]/span");
 	    Reporter.log("Click on Expand Button | ");
 	    Thread.sleep(5000);
 	    //Thread.sleep(3000);
 	    
 	   //Click on Expand button
 	    assertTextXpath("//*[@id='content']/tr/td[1]/span");
 	    clickByXpath("//*[@id='content']/tr/td[1]/span");
 	    Reporter.log("Click on Expand Button | ");
 	    Thread.sleep(3000);
 	    //Thread.sleep(3000);
 	 	   
	
	}

	@Test(priority=231, enabled =false)
	  public void Filter_Documents() throws InterruptedException, IOException {
		
		// Click on Filter Button 
  		try {
  			assertTextXpath("//cw-filter/div/span/i");
  			clickByXpath("//cw-filter/div/span/i");
  			Reporter.log("Click on Filter Button | ");
  		}catch(Exception e)
  		{
  			e.printStackTrace();
  			Reporter.log("Click on Filter Button doesn't clicked | ");
  		}
  		Thread.sleep(5000);
  		//Thread.sleep(3000);
  		//Thread.sleep(3000);
   
  		//Click on Media Drop-down
  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
  		clickByXpath("//div[2]/div/div/div/ul/li/input");
  		Reporter.log("Click on Media Drop-down | ");
  		Thread.sleep(3000);
  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
  		Reporter.log("Select value from Media Drop-down | ");
  		Thread.sleep(3000);
  		//Thread.sleep(3000);
  		//Thread.sleep(3000);

  		//Click on Assets drop-down
  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
  		Reporter.log("Click on Asset Drop-down | ");
  		Thread.sleep(3000);
  		assertTextXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
  		clickByXpath("//div[2]/div[2]/div[2]/div/div/div/ul/li");
  		Reporter.log("Select value from Asset Drop-down | ");
  		Thread.sleep(5000);
  		//Thread.sleep(3000);

  		//Click on Submit button in Filter Pop-up
  		try {
  			assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
  			clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
  			Reporter.log("Click on Submit button in Filter Pop-up | ");
  			Thread.sleep(3000);
  		}catch(Exception e)
  		{
  			e.printStackTrace();
  			Reporter.log("Click on Submit button in Filter Pop-up  doesn't select | ");
  		}
  		Thread.sleep(5000); 
  		//Thread.sleep(3000);   
  		//Thread.sleep(3000);   
       
       
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
	
	@Test(priority=232, enabled =true)
	  public void Export_Documents() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		 Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		 		   
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on Pdf 
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
		  Reporter.log("Click on Pdf | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  //Click on Export Button
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
		  Reporter.log("Click on Export Button | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  //Click on CSV File
		  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);	
		  
	}
	@Test(priority=233, enabled =true)
	  public void ColumnHeader_Documents() throws InterruptedException, IOException {
		
		
		// Click on Expand column Header 
		assertTextXpath("//*[@id='documents']/thead/tr[1]/th[1]/span");
		
		// Click on File name column Header to sort for Ascending order
		assertTextXpath("//*[@id='file_name']/span[1]/span");
		
		// Click on Control name column Header to sort for Ascending order
		assertTextXpath("//*[@id='control']/span[1]/span");
		
		// Click on Media/label column Header to sort for Ascending order
		assertTextXpath("//*[@id='media']/span[1]/span");
				
		// Click on Asset Name column Header to sort for Ascending order
		assertTextXpath("//*[@id='assets']/span[1]/span");
	
	}
	
	
	@Test(priority=234, enabled =false)
	  public void TC212() throws InterruptedException, IOException {
		
		//Columns Selector functionaliy
		
	}

	@Test(priority=235, enabled =false)
	  public void TC214() throws InterruptedException, IOException {
		
		// Auto - loading
				
	}

}
