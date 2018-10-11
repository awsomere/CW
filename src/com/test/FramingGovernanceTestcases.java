package com.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FramingGovernanceTestcases extends WrapperClass{
	
	  public WebDriver driver;
	  String browser=null;
	  	 

	  @Test(priority=45, enabled = true)
	  public void ChkAllSubModules_FramingGovernance() throws InterruptedException {
		  
		  Thread.sleep(8000);
	  
	  		
	  		 //Select the Framing/Governance module at sidebar-left
		     assertTextXpath("//li[2]/a/span[2]");
			 clickByXpath("//li[2]/a/span[2]");  	
			 Reporter.log("Selected the Framing/Governance module at sidebar-left | ");
			 Thread.sleep(5000);
			 Thread.sleep(2000);
	  			  				  	  				  
	  	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[2]/ul/li[1]/a", "Risk Threshold");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[2]/ul/li[2]/a", "Likelihood Settings");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[2]/ul/li[3]/a", "Impact Settings");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[2]/ul/li[4]/a", "Version Frequency");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[2]/ul/li[5]/a", "Custom Controls");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[2]/ul/li[6]/a", "Control Tags");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
		  
	  }
	  
	  @Test(priority=46, enabled = true)
	   public void PageLevelHelp_RiskThreshold() throws IOException, InterruptedException {
		   
		  
		  //Select RiskThreshold Sub-module
			 assertTextLink("Risk Threshold");
			 clickBylinktext("Risk Threshold");
			 Reporter.log("Selected RiskThreshold Sub-module | ");
			 Thread.sleep(5000);
			 Thread.sleep(2000);
			 
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
	   
	   
	   @Test(priority=47, enabled = true)
	   public void RiskManagementMap_RiskThreshold() throws IOException, InterruptedException {
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	   }
	   
	   @Test(priority=48, enabled = true)
	   public void RiskThresholddropdown_RiskThreshold() throws IOException, InterruptedException {

		     Thread.sleep(5000);
		     //Thread.sleep(5000);
		     //Thread.sleep(5000);
		     //Thread.sleep(5000);
		    
			 //Select the RiskThreshold drop-down
		     assertTextXpath("//cw-drop-list/div/button");
			 clickByXpath("//cw-drop-list/div/button");  	
			 Reporter.log("Selected the RiskThreshold drop-down | ");
			 Thread.sleep(5000);
			 //Thread.sleep(5000);
		     
			 //Select RiskThreshold options 
			 assertTextLink("25");
			 clickBylinktext("25");
			 Reporter.log("Selected RiskThreshold options | ");
			 Thread.sleep(5000);
			 Thread.sleep(2000);
		    
		     //Click on Select button in the Warning Pop-up
		     assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
			 clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");  	
			 Reporter.log("Click on Select button in the Warning Pop-up| ");
			 Thread.sleep(5000);
			 Thread.sleep(2000); 
			 
	   }
    
	   @Test(priority=49, enabled = true)
	   public void Export_RiskThreshold() throws IOException, InterruptedException {

				//Click on Export button
				//assertTextXpath("g.highcharts-button > path");
				clickBycssSelector("g.highcharts-button > path");
				Reporter.log("Click on Export button | ");
				//Thread.sleep(3000);
				Thread.sleep(5000); 
				
				 //Download the PNG Image
			     assertTextXpath("//*[@id='highcharts-0']/div/div/div[2]");
			     clickByXpath("//*[@id='highcharts-0']/div/div/div[2]");
			     Reporter.log("Download the PNG Image | ");
			     Thread.sleep(5000);
			     //Thread.sleep(3000);
			     
			    // closeAlertAndGetItsText();
			     Thread.sleep(3000);
			     Thread.sleep(5000);
			  
			     //Click on Export button
			     //assertTextXpath("//*[@id='highcharts-0']/svg/g[6]/path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     		        
			     //Download the JPEG Image
			     assertTextXpath("//*[@id='highcharts-0']/div/div/div[3]");
			     clickByXpath("//*[@id='highcharts-0']/div/div/div[3]");
			     Reporter.log("Download the JPEG Image | ");
			     Thread.sleep(3000);
			     Thread.sleep(3000);
			     
			     //closeAlertAndGetItsText();
			     Thread.sleep(3000);
			     Thread.sleep(5000);
				     
			     //Click on Export button
			     //assertTextXpath("//*[@id='highcharts-0']/svg/g[6]/path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     		     
			     //Download the PDF Image
			     assertTextXpath("//*[@id='highcharts-0']/div/div/div[4]");
			     clickByXpath("//*[@id='highcharts-0']/div/div/div[4]");
			     Reporter.log("Download the PDF Image | ");
			     Thread.sleep(3000);
			     Thread.sleep(3000);
			     
			     //closeAlertAndGetItsText();
			     Thread.sleep(5000);
			     Thread.sleep(5000);
			     
			     //Click on Export button
			     //assertTextXpath("//*[@id='highcharts-0']/svg/g[6]/path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			    		     
			     //Download the SVG vector Image
			     assertTextXpath("//*[@id='highcharts-0']/div/div/div[5]");
			     clickByXpath("//*[@id='highcharts-0']/div/div/div[5]");
			     Reporter.log("Download the SVG Vector Image | ");
			     Thread.sleep(3000);
			     Thread.sleep(3000);
			     			     
			     //closeAlertAndGetItsText();
			     Thread.sleep(5000);
			     Thread.sleep(3000);

}
	   
	   
	   @Test(priority=50, enabled = true)
	   public void PageLevelHelp_LikelihoodSettings() throws IOException, InterruptedException {
		   
		   
		    //Select Likelihood Settings Sub-module
		   	 assertTextLink("Likelihood Settings");
		   	 clickBylinktext("Likelihood Settings");
		   	 Reporter.log("Selected Likelihood Settings Sub-module | ");
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
	   
	   
	   @Test(priority=51, enabled = true)
	   public void RiskManagementMap_LikelihoodSettings() throws IOException, InterruptedException {
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	   }
	   
	   @Test(priority=52, enabled = true)
	   public void Export_LikelihoodSettings() throws IOException, InterruptedException {
		   	 
		     //Click on Export button
		     //assertTextXpath("//*[@id='likelihood-settings_filter']/div/a/span");
		   	clickByXpath("//*[@id='likelihood-settings_filter']/div/a/span");
		     Reporter.log("Click on Export button | ");
		     Thread.sleep(3000);
		     		     
		     //Download the CSV Image
		     assertTextXpath("html/body/ul/li[2]/a");
		     clickByXpath("html/body/ul/li[2]/a");
		     Reporter.log("Download the CSV Image | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);	     
		     
		     refreshpage();
		     Thread.sleep(8000);
	   }
	   
	   @Test(priority=53, enabled = true)
	   public void Search_LikelihoodSettings() throws IOException, InterruptedException {
		   
		     //Search data 
		     assertTextXpath("//*[@id='likelihood-settings_filter']/label/input");
		     sendvaluebyxpath("//*[@id='likelihood-settings_filter']/label/input", "Rare");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     sendvaluebyxpath("//*[@id='likelihood-settings_filter']/label/input", "");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
	   }
	   
	   @Test(priority=54, enabled = true)
	   public void PageLevelHelp_ImpactSettings() throws IOException, InterruptedException {
		   
		 //Select Impact Settings Sub-module
		   	 assertTextLink("Impact Settings");
		   	 clickBylinktext("Impact Settings");
		   	 Reporter.log("Selected Impact Settings Sub-module | ");
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
	   
	   
	   @Test(priority=55, enabled = true)
	   public void RiskManagementMap_ImpactSettings() throws IOException, InterruptedException {
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	   }
	   
	   @Test(priority=56, enabled = true)
	   public void Export_ImpactSettings() throws IOException, InterruptedException {
		   	 
		     //Click on Export button
		     //assertTextXpath("//*[@id='impact-settings_filter']/div/a/span");
		   	clickByXpath("//*[@id='impact-settings_filter']/div/a/span");
		     Reporter.log("Click on Export button | ");
		     Thread.sleep(3000);
		     		     
		     //Download the CSV Image
		     assertTextXpath("html/body/ul/li[2]/a");
		     clickByXpath("html/body/ul/li[2]/a");
		     Reporter.log("Download the CSV Image | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);
		     
		     refreshpage();
		     Thread.sleep(8000);
	   }
	   
	   @Test(priority=57, enabled = true)
	   public void Search_ImpactSettings() throws IOException, InterruptedException {
		   
		     //Search data 
		     assertTextXpath("//*[@id='impact-settings_filter']/label/input");
		     sendvaluebyxpath("//*[@id='impact-settings_filter']/label/input", "Minor");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     sendvaluebyxpath("//*[@id='impact-settings_filter']/label/input", "");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
	   }
	   
	   @Test(priority=58, enabled = true)
	   public void PageLevelHelp_CustomControls() throws IOException, InterruptedException {
		   
		   //Select Custom Controls Sub-module
		   	 assertTextLink("Custom Controls");
		   	 clickBylinktext("Custom Controls");
		   	 Reporter.log("Selected Custom Controls Sub-module | ");
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
	   	
	   	
	   @Test(priority=59, enabled = true)
	   public void RiskManagementMap_CustomControls() throws IOException, InterruptedException {
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	   }   
	  
	   
	   @Test(priority=60, enabled = true)
	   public void NewButton_CustomControls() throws IOException, InterruptedException {
		    
		     //Select the New button
		     assertTextXpath("//div/a/span");
			 clickByXpath("//div/a/span");  	
			 Reporter.log("Selected the New Button | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			
			 //Fill data for Control Name 
		     assertTextXpath("//div/input");
		     sendvaluebyxpath("//div/input", "Sample custom controls");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Fill data for Description 
		     assertTextXpath("//textarea");
		     sendvaluebyxpath("//textarea", "Sample Description");
		     Reporter.log("Filled data for Description | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
						 
			 //Click on Create button in the Warning Pop-up
		     assertTextXpath("//div[3]/button");
			 clickByXpath("//div[3]/button");  	
			 Reporter.log(" Click on Create button in the Warning Pop-up| ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);
	   }
	   
	   @Test(priority=61, enabled = true)
	   public void EditButton_CustomControls() throws IOException, InterruptedException {
		   
			 //Select the List link
		     assertTextXpath("//td[2]");
			 clickByXpath("//td[2]");  	
			 Reporter.log("Selected the Listed Link | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 
			 //Select the Edit button
		     assertTextXpath("//a[2]/span");
			 clickByXpath("//a[2]/span");  	
			 Reporter.log("Selected the Edit Button | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			
			 //Fill data for Control Name 
		     assertTextXpath("//div/input");
		     sendvaluebyxpath("//div/input", "Edit Sample custom controls");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Fill data for Description 
		     assertTextXpath("//textarea");
		     sendvaluebyxpath("//textarea", "Edit Sample Description");
		     Reporter.log("Filled data for Description | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
						 
			 //Click on Updated button in the Warning Pop-up
		     assertTextXpath("//div[3]/button");
			 clickByXpath("//div[3]/button");  	
			 Reporter.log(" Click on Updated button in the Warning Pop-up| ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 
	   }
	   
	   @Test(priority=62, enabled = true)
	   public void Export_CustomControls() throws IOException, InterruptedException {
			 
			 //Click on Export button
		     //assertTextXpath("//*[@id='custom-controls_filter']/div/a/span");
			 clickByXpath("//*[@id='custom-controls_filter']/div/a/span");
		     Reporter.log("Click on Export button | ");
		     Thread.sleep(3000);
		     		     
		     //Download the CSV Image
		     assertTextXpath("html/body/ul/li[1]/a");
		     clickByXpath("html/body/ul/li[1]/a");
		     Reporter.log("Download the CSV Image | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);
		     
		     refreshpage();
		     Thread.sleep(8000);
		     		   
		   
	   }
	   
	   @Test(priority=63, enabled = true)
	   public void Search_CustomControls() throws IOException, InterruptedException {
		   
		     //Search data 
		     assertTextXpath("//*[@id='custom-controls_filter']/label/input");
		     sendvaluebyxpath("//*[@id='custom-controls_filter']/label/input", "Edit");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     sendvaluebyxpath("//*[@id='custom-controls_filter']/label/input", "");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
	   }
	   
	   @Test(priority=64, enabled = true)
	   public void PageLevelHelp_CustomTags() throws IOException, InterruptedException {
		   
		 //Select Custom Controls Sub-module
		   	 assertTextLink("Control Tags");
		   	 clickBylinktext("Control Tags");
		   	 Reporter.log("Selected Control Tags Sub-module | ");
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
	   
	   
	   @Test(priority=65, enabled = true)
	   public void RiskManagementMap_CustomTags() throws IOException, InterruptedException {
			    
			    //Click on AppMap button Icon
		 	    assertTextXpath("//cw-appmap/button");
		        clickByXpath("//cw-appmap/button");
		        Reporter.log("Click on AppMap button Icon | ");
		        Thread.sleep(3000);
			    //Thread.sleep(5000);
			    
			    // Click OK Button in AppMap pop-up window
			    assertTextXpath("//div[4]/div/div/div[3]/button");
		        clickByXpath("//div[4]/div/div/div[3]/button");
		        Reporter.log("Click OK Button in AppMap pop-up window | ");
		        Thread.sleep(3000);
			   // Thread.sleep(5000);
	   }
	   
	   @Test(priority=66, enabled = true)
	   public void NewButton_CustomTags() throws IOException, InterruptedException {
		   
		     //Select the New button
		     assertTextXpath("//div/a/span");
			 clickByXpath("//div/a/span");  	
			 Reporter.log("Selected the New Button | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			
			 //Fill data for Control Name 
		     assertTextXpath("//div/input");
		     sendvaluebyxpath("//div/input", "Sample Custom Tags");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Fill data for Description 
		     assertTextXpath("//div[2]/div/input");
		     sendvaluebyxpath("//div[2]/div/input", "Sample Description");
		     Reporter.log("Filled data for Description | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
						 
			 //Click on Save button in the Warning Pop-up
		     assertTextXpath("//form/div[3]/button");
			 clickByXpath("//form/div[3]/button");  	
			 Reporter.log(" Click on Save button in the Warning Pop-up| ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 
	   }
	   
	   @Test(priority=67, enabled = true)
	   public void EditButton_CustomTags() throws IOException, InterruptedException {
		   
			 //Select the List link
		     assertTextXpath("//td[2]");
			 clickByXpath("//td[2]");  	
			 Reporter.log("Selected the Listed Link | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 
			 //Select the Edit button
		     assertTextXpath("//a[2]/span");
			 clickByXpath("//a[2]/span");  	
			 Reporter.log("Selected the Edit Button | ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			
			 //Fill data for Control Name 
		     assertTextXpath("//div/input");
		     sendvaluebyxpath("//div/input", "Edit Sample custom controls");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     
		     //Fill data for Description 
		     assertTextXpath("//div[2]/div/input");
		     sendvaluebyxpath("//div[2]/div/input", "Edit Sample Description");
		     Reporter.log("Filled data for Description | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
						 
			 //Click on Updated button in the Warning Pop-up
		     assertTextXpath("//form/div[3]/button");
			 clickByXpath("//form/div[3]/button");  	
			 Reporter.log(" Click on Updated button in the Warning Pop-up| ");
			 Thread.sleep(5000);
			 Thread.sleep(5000);
			 
	   }
	   
	   @Test(priority=68, enabled = true)
	   public void Export_CustomTags() throws IOException, InterruptedException {
			 
			//Click on Export button
		     //assertTextXpath("//*[@id='tags-list_filter']/div/a/span");
			 clickByXpath("//*[@id='tags-list_filter']/div/a/span");
		     Reporter.log("Click on Export button | ");
		     Thread.sleep(3000);
		     		     
		     //Download the CSV Image
		     assertTextXpath("html/body/ul/li[2]/a");
		     clickByXpath("html/body/ul/li[2]/a");
		     Reporter.log("Download the CSV Image | ");
		     Thread.sleep(3000);
		     Thread.sleep(3000);
		     
		     /*//Click on Export button
		     //assertTextXpath("//*[@id='highcharts-0']/svg/g[6]/path");
		     clickBycssSelector("//*[@id='highcharts-0']/svg/g[6]/path");
		     Reporter.log("Click on Export button | ");
		     Thread.sleep(3000);*/
		     		     
		     //Download the PDF Image
		     assertTextXpath("html/body/ul/li[3]/a");
		     clickByXpath("html/body/ul/li[3]/a");
		     Reporter.log("Download the PDF Image | ");
		     Thread.sleep(5000);
		     Thread.sleep(3000);
		     
		     refreshpage();
		     Thread.sleep(8000);
		   
	   }	
	   
	   @Test(priority=69, enabled = true)
	   public void Search_CustomTags() throws IOException, InterruptedException {
		   
		     //Search data 
		     assertTextXpath("//*[@id='impact-settings_filter']/label/input");
		     sendvaluebyxpath("//*[@id='impact-settings_filter']/label/input", "Edit");
		     Reporter.log("Filled data for Control Name | ");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     sendvaluebyxpath("//*[@id='impact-settings_filter']/label/input", "");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
	   }

}
