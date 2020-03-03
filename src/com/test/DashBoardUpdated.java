package com.test;


import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DashBoardUpdated extends WrapperClass{

	 public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=404, enabled = true)
	  public void ChkAllSubModules_Dashboard() throws InterruptedException {
		  
		  Thread.sleep(8000);
	  		Thread.sleep(8000);
	  
	  		
	    //Open the dashboard
	    clickByXpath("//*[@id='sidebar-left']/ul/li[1]/a/span[2]");
	    Reporter.log("Open the Dashboard");
	    Thread.sleep(5000);
	    clickByXpath("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/a/span[2]");
	    Thread.sleep(3000);
	  		  			  				  	  				  
	  	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/a/span[2]", "Charts & Graphs");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/ul/li[1]/a", "Rating Distribution By Asset");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/ul/li[2]/a", "Risk Rating Trends");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/ul/li[3]/a", "Risk Rating Averages");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/ul/li[4]/a", "Top Entities");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/ul/li[5]/a", "Top Vulnerabilities");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
		  
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/ul/li[6]/a", "Top Assets");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	 	   
	 	// Click on Role Name
	 	   assertEquals("//*[@id='sidebar-left']/ul/li[1]/ul/li[2]/ul/li[7]/a", "Risk Response");
	 	   //Reporter.log("Click on Page header Title | ");
	 	   Thread.sleep(3000);
	 	   Thread.sleep(1000);
	  }
	
	  @Test(priority=405, enabled = true)
	  public void Filter_RatingDistributionByAsset() throws InterruptedException {
		  
		  		Thread.sleep(5000);
	  		
		  	    //Click on Rating Distribution By Asset Sub-module
		        assertTextLink("Rating Distribution By Asset");
		        clickBylinktext("Rating Distribution By Asset");
		        Reporter.log("Click on Rating Distribution By Asset Sub-module | ");
		        Thread.sleep(3000);
		        Thread.sleep(3000);
		     		       
		  		// Click on Filter Button on Controls Response Review
		        assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button on Controls Response Review page | ");
		  		Thread.sleep(3000);
		  			       
		  		//Click on Asset Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		
		  		//click on No of Rows drop-down
		  		assertTextXpath("//div/b");
		  		clickByXpath("//div/b");
		  		Reporter.log("Click on No of Rows Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/ul/li[1]");
		  		clickByXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[2]/div/div/div/div/ul/li[1]");
		  		Reporter.log("Select value from No of Rows Drop-down | ");
		  		Thread.sleep(3000);

		  	    //Click on Submit button in Filter Pop-up
		  			assertTextXpath("//div[3]/button[2]");
		  			clickByXpath("//div[3]/button[2]");
		  			Reporter.log("Click on Submit button in Filter Pop-up | ");
		  			Thread.sleep(3000);
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
		  		Thread.sleep(5000);   
		  		Thread.sleep(5000); 
		  		
	  }
	  
	  @Test(priority=406, enabled = true)
	  public void History_RatingDistributionByAsset() throws InterruptedException {
		  		
		  		 //Click on History Drop-down
	  			assertTextXpath("//*[@id='report-version']");
	  			clickByXpath("//*[@id='report-version']");
	  			Reporter.log("Click on History Drop-down | ");
	  			Thread.sleep(3000);
		  			
	  			 //Select any of the list form History Drop-down
	  			assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li[1]/a");
	  			clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ng-transclude/cw-version-selector/div/ul/li[1]/a");
	  			Reporter.log("Click on History Drop-down | ");
	  			Thread.sleep(3000);
	  			 Thread.sleep(5000);
	  			 
	  }
	  
	  
	  @Test(priority=407, enabled = true)
	  public void Export_RatingDistributionByAsset() throws InterruptedException {	
	  			  			
			    //Click on Rating Distribution By Asset
		        assertTextLink("Rating Distribution By Asset");
			    clickBylinktext("Rating Distribution By Asset");
			    Reporter.log("Click on Rating Distribution By Asset | ");
			    Thread.sleep(5000);
			    Thread.sleep(3000);
			    
				//Click on Export button
				//assertTextXpath("g.highcharts-button > path");
				clickBycssSelector("g.highcharts-button > path");
				Reporter.log("Click on Export button | ");
				Thread.sleep(3000);
				
				 //Download the PNG Image
			     assertTextXpath("//div[2]/div/div/div/div/div[2]");
			     clickByXpath("//div[2]/div/div/div/div/div[2]");
			     Reporter.log("Download the PNG Image | ");
			     Thread.sleep(5000);
			     //Thread.sleep(3000);
			     
			     //closeAlertAndGetItsText();
			     Thread.sleep(3000);
			  
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     		        
			     //Download the JPEG Image
			     assertTextXpath("//div/div/div/div[3]");
			     clickByXpath("//div/div/div/div[3]");
			     Reporter.log("Download the JPEG Image | ");
			     Thread.sleep(5000);
			     //Thread.sleep(3000);
			     
			    // closeAlertAndGetItsText();
			     Thread.sleep(3000);
				     
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     		     
			     //Download the PDF Image
			     assertTextXpath("//div/div/div/div[4]");
			     clickByXpath("//div/div/div/div[4]");
			     Reporter.log("Download the PDF Image | ");
			     Thread.sleep(5000);
			     //Thread.sleep(3000);
			     
			     //closeAlertAndGetItsText();
			     Thread.sleep(3000);
			     
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			    		     
			     //Download the SVG vector Image
			     assertTextXpath("//div/div/div/div[5]");
			     clickByXpath("//div/div/div/div[5]");
			     Reporter.log("Download the SVG Vector Image | ");
			     Thread.sleep(5000);
			     //Thread.sleep(3000);
			     			     
			     //closeAlertAndGetItsText();
			     Thread.sleep(3000);
			     Thread.sleep(3000);
			     
	  }
	  
	  @Test(priority=408, enabled = true)
	  public void Export_RiskRatingTrends() throws InterruptedException {	
	  
			   //Click on Risk Rating Trends
			        assertTextLink("Risk Rating Trends");
				    clickBylinktext("Risk Rating Trends");
				    Reporter.log("Click on Risk Rating Trends | ");
				    Thread.sleep(3000);
				    Thread.sleep(3000);
				    
					//Click on Export button
					//assertTextXpath("g.highcharts-button > path");
					clickBycssSelector("g.highcharts-button > path");
					Reporter.log("Click on Export button | ");
					Thread.sleep(3000);
					
					//Download the PNG Image
				     assertTextXpath("//div[2]/div/div/div/div/div[2]");
				     clickByXpath("//div[2]/div/div/div/div/div[2]");
				     Reporter.log("Download the PNG Image | ");
				     Thread.sleep(5000);
				     		     
				    // closeAlertAndGetItsText();
				     Thread.sleep(3000);
				  
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);
				    
				     //Download the JPEG Image
				     assertTextXpath("//div/div/div/div[3]");
				     clickByXpath("//div/div/div/div[3]");
				     Reporter.log("Download the JPEG Image | ");
				     Thread.sleep(5000);
				     		     
				     //closeAlertAndGetItsText();
				     Thread.sleep(3000);
					     
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);
				     		     
				     //Download the PDF Image
				     assertTextXpath("//div/div/div/div[4]");
				     clickByXpath("//div/div/div/div[4]");
				     Reporter.log("Download the PDF Image | ");
				     Thread.sleep(5000);
				     		     
				     //closeAlertAndGetItsText();
				     Thread.sleep(3000);
				     
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);
				     
				     //Download the SVG vector Image
				     assertTextXpath("//div/div/div/div[5]");
				     clickByXpath("//div/div/div/div[5]");
				     Reporter.log("Download the SVG Vector Image | ");
				     Thread.sleep(5000);
				    // Thread.sleep(3000);
				     			     
				    // closeAlertAndGetItsText();
				     Thread.sleep(3000);
				     
	  }
	  
	 /* @Test(priority=409, enabled = true)
	  public void Export_RiskRatingAverages() throws InterruptedException {	
				    
				    //Click on Risk Rating Averages
				    assertTextLink("Risk Rating Averages");
				    clickBylinktext("Risk Rating Averages");
				    Reporter.log("Click on Risk Rating Averages | ");
				    Thread.sleep(3000);
				    Thread.sleep(3000);
				    
					//Click on Export button
					//assertTextXpath("g.highcharts-button > path");
					clickBycssSelector("g.highcharts-button > path");
					Reporter.log("Click on Export button | ");
					Thread.sleep(3000);
						        
					 //Download the PNG Image
				     assertTextXpath("//div[2]/div/div/div/div/div[2]");
				     clickByXpath("//div[2]/div/div/div/div/div[2]");
				     Reporter.log("Download the PNG Image | ");
				     Thread.sleep(5000);
				     
				     //closeAlertAndGetItsText();
				     
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);
				     		        
				     //Download the JPEG Image
				     assertTextXpath("//div/div/div/div[3]");
				     clickByXpath("//div/div/div/div[3]");
				     Reporter.log("Download the JPEG Image | ");
				     Thread.sleep(3000);
				     Thread.sleep(3000);				     
				   
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);				     
				     
				     //Download the PDF Image
				     assertTextXpath("//div/div/div/div[4]");
				     clickByXpath("//div/div/div/div[4]");
				     Reporter.log("Download the PDF Image | ");
				     Thread.sleep(5000);
				     
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);
				    		     
				     //Download the SVG vector Image
				     assertTextXpath("//div/div/div/div[5]");
				     clickByXpath("//div/div/div/div[5]");
				     Reporter.log("Download the SVG Vector Image | ");
				     Thread.sleep(5000);
				     
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);				    
				     
				     //Download the CSV File
				     assertTextXpath("//div/div/div/div[6]");
				     clickByXpath("//div/div/div/div[6]");
				     Reporter.log("Download the CSV File | ");
				     Thread.sleep(5000);
				     		     			     
				     //Click on Export button
				     //assertTextXpath("g.highcharts-button > path");
				     clickBycssSelector("g.highcharts-button > path");
				     Reporter.log("Click on Export button | ");
				     Thread.sleep(3000);
				     		     
				     //Download the XLS File
				     assertTextXpath("//div/div/div/div[7]");
				     clickByXpath("//div/div/div/div[7]");
				     Reporter.log("Download the XLS File | ");
				     Thread.sleep(5000); 
				     
				     
	  }
	  
	  @Test(priority=410, enabled = true)
	  public void Filter_TopEntities() throws InterruptedException {
			     			     
		  		//Click on Top Entities Sub-module
		  		assertTextLink("Top Entities");
		  		clickBylinktext("Top Entities");
		  		Reporter.log("Click on Top Entities Sub-module | ");
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
   		       
		  		// Click on Filter Button 
		  		assertTextXpath("//cw-filter/div/span/i");
		  		clickByXpath("//cw-filter/div/span/i");
		  		Reporter.log("Click on Filter Button  | ");
		  		Thread.sleep(3000);
		  		 
		  		//Click on Entity Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Entity Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Entity Drop-down | ");
		  		Thread.sleep(3000);		  		

		  		//click on Media drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		
		  		//Click on Risk Rating  Drop-down
				assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
				clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
				Reporter.log("Click on Risk Rating Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("//div[2]/div/div/div/ul/li[12]");
				clickByXpath("//div[2]/div/div/div/ul/li[12]");
				Reporter.log("Select value from Risk Rating Drop-down | ");
				Thread.sleep(3000);
				
				//click on # of Rows drop-down
				assertTextXpath("//div/div/a/span");
				clickByXpath("//div/div/a/span");
				Reporter.log("Click on # of Rows Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[1]");
		  		clickByXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[1]");
				Reporter.log("Select value from # of Rows Drop-down | ");
				Thread.sleep(3000);
				

				//Click on Submit button in Filter Pop-up
					assertTextXpath("//div[3]/button[2]");
					clickByXpath("//div[3]/button[2]");
					Reporter.log("Click on Submit button in Filter Pop-up | ");
					Thread.sleep(3000);
				Thread.sleep(3000);   
				Thread.sleep(3000);  
     	       
				//Click on 'Clear Filter' Button 
					assertTextXpath("//i[2]");
					clickByXpath("//i[2]");
					Reporter.log("Click on 'Clear Filter' Button  | ");
				Thread.sleep(3000);   
		  		Thread.sleep(3000); 
		  		
	  }
	  
	  @Test(priority=411, enabled = true)
	  public void Export_TopEntities() throws InterruptedException { 
		  		
		  	    //Click on Top Entities
		        assertTextLink("Top Entities");
			    clickBylinktext("Top Entities");
			    Reporter.log("Click on Top Entities | ");
			    Thread.sleep(3000);
			    Thread.sleep(3000);
			    
				//Click on Export button
				//assertTextXpath("g.highcharts-button > path");
				clickBycssSelector("g.highcharts-button > path");
				Reporter.log("Click on Export button | ");
				Thread.sleep(3000);
				
				 //Download the CSV File
			     assertTextXpath("//div[2]/div/div/div/div/div[2]");
			     clickByXpath("//div[2]/div/div/div/div/div[2]");
			     Reporter.log("Download the CSV File | ");
			     Thread.sleep(3000);
			     
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     
			     //Download the XLS File
			     assertTextXpath("//div/div/div/div[3]");
			     clickByXpath("//div/div/div/div[3]");
			     Reporter.log("Download the XLS File | ");
			     Thread.sleep(5000);	  
			     
	  }
	  
	  @Test(priority=412, enabled = true)
	  public void Filter_TopVulnerabilities() throws InterruptedException {
		  				  		
				//Click on  Top Vulnerabilities Sub-module
				assertTextLink("Top Vulnerabilities");
				clickBylinktext("Top Vulnerabilities");
				Reporter.log("Click on Top Vulnerabilities Sub-module | ");
				Thread.sleep(3000);
				Thread.sleep(3000);
	   		       
				// Click on Filter Button 
				assertTextXpath("//cw-filter/div/span/i");
				clickByXpath("//cw-filter/div/span/i");
				Reporter.log("Click on Filter Button  | ");
				Thread.sleep(3000);
					 
				//Click on Entity Drop-down
				assertTextXpath("//div/ul/li/input");
				clickByXpath("//div/ul/li/input");
				Reporter.log("Click on Entity Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
				clickByXpath("//div[2]/div/div/div/div/div/ul/li");
				Reporter.log("Select value from Entity Drop-down | ");
				Thread.sleep(3000);
				
				//click on Media drop-down
				assertTextXpath("//div[2]/div/div/div/ul/li/input");
				clickByXpath("//div[2]/div/div/div/ul/li/input");
				Reporter.log("Click on Media Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
				clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
				Reporter.log("Select value from Media Drop-down | ");
				Thread.sleep(3000);
			
				//Click on Risk Rating  Drop-down
				assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
				clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
				Reporter.log("Click on Risk Rating Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("//div[2]/div/div/div/ul/li[12]");
				clickByXpath("//div[2]/div/div/div/ul/li[12]");
				Reporter.log("Select value from Risk Rating Drop-down | ");
				Thread.sleep(3000);
								
				//click on # of Rows drop-down
				assertTextXpath("//div/div/a/span");
				clickByXpath("//div/div/a/span");
				Reporter.log("Click on # of Rows Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[1]");
				clickByXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[1]");
				Reporter.log("Select value from # of Rows Drop-down | ");
				Thread.sleep(3000);
								
				//Click on Submit button in Filter Pop-up
					assertTextXpath("//div[3]/button[2]");
					clickByXpath("//div[3]/button[2]");
					Reporter.log("Click on Submit button in Filter Pop-up | ");
					Thread.sleep(3000);
				Thread.sleep(3000);   
				Thread.sleep(3000);   
								
				//Click on 'Clear Filter' Button 
					assertTextXpath("//i[2]");
					clickByXpath("//i[2]");
					Reporter.log("Click on 'Clear Filter' Button  | ");
				Thread.sleep(3000);   
		  		Thread.sleep(3000); 
		  		
	  }
	  
	  @Test(priority=413, enabled = true)
	  public void Export_TopVulnerabilities() throws InterruptedException {
		  		
		  		 //Click on Top Vulnerabilities
		        assertTextLink("Top Vulnerabilities");
			    clickBylinktext("Top Vulnerabilities");
			    Reporter.log("Click on Top Vulnerabilities | ");
			    Thread.sleep(3000);
			    Thread.sleep(3000);
			    
				//Click on Export button
				//assertTextXpath("g.highcharts-button > path");
				clickBycssSelector("g.highcharts-button > path");
				Reporter.log("Click on Export button | ");
				Thread.sleep(3000);
		        
				 //Download the CSV File
			     assertTextXpath("//div[2]/div/div/div/div/div[2]");
			     clickByXpath("//div[2]/div/div/div/div/div[2]");
			     Reporter.log("Download the CSV File | ");
			     Thread.sleep(5000);
			     		     			     
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			        
			     //Download the XLS File
			     assertTextXpath("//div[2]/div/div[3]");
			     clickByXpath("//div[2]/div/div[3]");
			     Reporter.log("Download the XLS File | ");
			     Thread.sleep(5000);  	
			     
	  }
	  
	  @Test(priority=414, enabled = true)
	  public void Filter_TopAssets() throws InterruptedException {
		  		
				//Click on Top Assets Sub-module
				assertTextLink("Top Assets");
				clickBylinktext("Top Assets");
				Reporter.log("Click on Top Assets Sub-module | ");
				Thread.sleep(3000);
				Thread.sleep(3000);
	   		       
				// Click on Filter Button 
				assertTextXpath("//cw-filter/div/span/i");
				clickByXpath("//cw-filter/div/span/i");
				Reporter.log("Click on Filter Button  | ");
				Thread.sleep(3000);
				
				//Click on Entity Drop-down
				assertTextXpath("//div/ul/li/input");
				clickByXpath("//div/ul/li/input");
				Reporter.log("Click on Entity Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
				clickByXpath("//div[2]/div/div/div/div/div/ul/li");
				Reporter.log("Select value from Entity Drop-down | ");
				Thread.sleep(3000);
				
				//click on Media drop-down
				assertTextXpath("//div[2]/div/div/div/ul/li/input");
				clickByXpath("//div[2]/div/div/div/ul/li/input");
				Reporter.log("Click on Media Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
				clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
				Reporter.log("Select value from Media Drop-down | ");
				Thread.sleep(3000);
			
				//Click on Risk Rating  Drop-down
				assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
				clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
				Reporter.log("Click on Risk Rating Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("//div[2]/div/div/div/ul/li[12]");
				clickByXpath("//div[2]/div/div/div/ul/li[12]");
				Reporter.log("Select value from Risk Rating Drop-down | ");
				Thread.sleep(3000);
								
				//click on # of Rows drop-down
				assertTextXpath("//div/div/a/span");
				clickByXpath("//div/div/a/span");
				Reporter.log("Click on # of Rows Drop-down | ");
				Thread.sleep(3000);
				assertTextXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[1]");
				clickByXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[1]/div[4]/div/div/div/ul/li[1]");
				Reporter.log("Select value from # of Rows Drop-down | ");
				Thread.sleep(3000);
								
				//Click on Submit button in Filter Pop-up
					assertTextXpath("//div[3]/button[2]");
					clickByXpath("//div[3]/button[2]");
					Reporter.log("Click on Submit button in Filter Pop-up | ");
					Thread.sleep(3000);
				Thread.sleep(3000);   
				Thread.sleep(3000);   
								
				//Click on 'Clear Filter' Button 
					assertTextXpath("//i[2]");
					clickByXpath("//i[2]");
					Reporter.log("Click on 'Clear Filter' Button  | ");
				Thread.sleep(3000);   
		  		Thread.sleep(3000); 
		  		
	  }
	  
	  @Test(priority=415, enabled = true)
	  public void Export_TopAssets() throws InterruptedException {
		  		
		  	     //Click on Top Assets
			     assertTextLink("Top Assets");
			     clickBylinktext("Top Assets");
			     Reporter.log("Click on Top Assets | ");
			     Thread.sleep(3000);
			     Thread.sleep(3000);
				    
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     
			     //Download the CSV File
			     assertTextXpath("//div[2]/div/div/div/div/div[2]");
			     clickByXpath("//div[2]/div/div/div/div/div[2]");
			     Reporter.log("Download the CSV File | ");
			     Thread.sleep(5000);			   
			     
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     
			     //Download the XLS File
			     assertTextXpath("//div[2]/div/div[3]");
			     clickByXpath("//div[2]/div/div[3]");
			     Reporter.log("Download the XLS File | ");
			     Thread.sleep(5000);
			     
			   //Click on Risk Response
			     assertTextLink("Risk Response");
			     clickBylinktext("Risk Response");
			     Reporter.log("Click on Risk Response | ");
			     Thread.sleep(3000);
			     Thread.sleep(3000);
			     
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     
			     //Download the CSV File
			     assertTextXpath("//div[2]/div/div/div/div/div[2]");
			     clickByXpath("//div[2]/div/div/div/div/div[2]");
			     Reporter.log("Download the CSV File | ");
			     Thread.sleep(5000);
			     
			     //Click on Export button
			     //assertTextXpath("g.highcharts-button > path");
			     clickBycssSelector("g.highcharts-button > path");
			     Reporter.log("Click on Export button | ");
			     Thread.sleep(3000);
			     
			     //Download the XLS File
			     assertTextXpath("//div[2]/div/div[3]");
			     clickByXpath("//div[2]/div/div[3]");
			     Reporter.log("Download the XLS File | ");
			     Thread.sleep(5000);
}*/
}

