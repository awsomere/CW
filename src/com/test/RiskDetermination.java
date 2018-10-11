package com.test;

import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import com.test.WrapperClass;

public class RiskDetermination extends WrapperClass{

	  public WebDriver driver;
	  String browser=null;
	  
	  @Test(priority=11,enabled = true)
	  public void RQLBackUp() throws InterruptedException, IOException {
		  	  
		    Thread.sleep(8000);
		   Thread.sleep(8000);
		    Thread.sleep(8000);
		    Thread.sleep(8000);
			   Thread.sleep(8000);
			    Thread.sleep(8000);
	       	        
		   //Select Risk Determination sidebar-left Module
		    try {
		    	assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        clickByXpath("//*[@id='sidebar-left']/ul/li[4]/a/span[2]");
	 	        Reporter.log("Select Risk Determination sidebar-left Module | ");
	        }catch(Exception e)
			{
		        e.printStackTrace();
			    Reporter.log("Select Risk Determination sidebar-left Module doesn't reached | ");
			}
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	        
	        // Select Risk Questionnaire list sub-module under Risk Determination Module
	        try {
	        	assertTextLink("Risk Questionnaire List");
	            clickBylinktext("Risk Questionnaire List");
	            Reporter.log("Select Risk Questionnaire List | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select Risk Questionnaire List doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	       
	        // Click on 'continue' button of Media/Asset
	        try {
	        	assertTextXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        clickByXpath("//*[@id='content']/tr[1]/td[7]/div/div[1]/span");
	 	        Reporter.log("Click on 'continue' button of Desktop Media/Asset | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'continue' button of Media/Asset doesn't work | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        //Thread.sleep(3000);
	       
	       // 1st page	           
	        // Click on Add a Custom Control	  
		    assertTextXpath("//cw-add-custom-control/div/div/span");
		    clickByXpath("//cw-add-custom-control/div/div/span");
		    Reporter.log("Click on Add a Custom Control	| ");
		    Thread.sleep(3000); 

            // Click on Add a Custom Control textbox		  
		    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    clickByXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    Reporter.log("Click on Add a Custom Control tetbox| ");
		    Thread.sleep(2000); 

            // Enter the New Custom Control
		    //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
		    sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div/input", "TestControls");
		    Reporter.log("Enter the New Custom Controls| ");
		    Thread.sleep(3000); 

		    // Click from listed add custom controls		  
		    assertTextXpath("//div/strong");
		    clickByXpath("//div/strong");
		    Reporter.log("Click from listed add custom controls | ");
		    Thread.sleep(5000); 
		    
		 // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
		 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			   {
			       e.printStackTrace();
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
		    // Select 'Yes' option in Response choice of listed Controls
	    try {
	 	   //assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
		       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	  }catch(Exception e)
		   {
		       e.printStackTrace();
		       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		   }
	    Thread.sleep(3000);
	    //Thread.sleep(8000);
	    //Thread.sleep(8000);
	          
	     //Expand the Controls
	       assertTextXpath("//td[2]/span[1]");
 	       clickByXpath("//td[2]/span[1]");
 	       Reporter.log("Expand the Controls | ");
 	       Thread.sleep(3000);
 	       
 	      // Select 'Inprogress' option in Response choice of listed Controls
 	      assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[4]/cw-s-response-choices/div/div/label[2]");
 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[4]/cw-s-response-choices/div/div/label[2]");
 	      Reporter.log("Select 'Inprogress' option in Response choice of listed Controls | ");
 	    Thread.sleep(3000);
 	    
 	    // Select 'No' option in Response choice of listed Controls
 	      assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[4]/cw-s-response-choices/div/div/label[3]");
 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[4]/cw-s-response-choices/div/div/label[3]");
 	      Reporter.log("Select 'NO' option in Response choice of listed Controls | ");
 	        Thread.sleep(3000);
 	   
 	       // Select 'NA' option in Response choice of listed Controls
 	        assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[4]/cw-s-response-choices/div/div/label[4]");
 	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[4]/cw-s-response-choices/div/div/label[4]");
 	        Reporter.log("Select 'NA' option in Response choice of listed Controls | ");
 	        Thread.sleep(3000);	
 	        //Thread.sleep(8000);
 	        
   	       //Expand the Controls
  	       assertTextXpath("//td[2]/span[1]");
   	       clickByXpath("//td[2]/span[1]");
   	       Reporter.log("Expand the Controls | ");
   	       Thread.sleep(3000);
	       
   	  //Click on Global checkbox
   	    //assertTextXpath("//cw-s-response-global/div/div/label");
   	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[7]/cw-s-response-global/div/div");
   	    Reporter.log("Click on Global checkbox | ");
   	    Thread.sleep(3000);
   	    
   	   //Click on Proceed Button In Warning Pop-up
   	    assertTextXpath("html/body/div[2]/div/div/div[3]/button[1]");
   	    clickByXpath("html/body/div[2]/div/div/div[3]/button[1]");
   	    Reporter.log("Click on Proceed Button In Warning Pop-up | ");
   	    Thread.sleep(8000);
   	   //Thread.sleep(2000);
	       
   	 //Click on Global checkbox
   	    //assertTextXpath("//cw-s-response-global/div/div/label");
   	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[7]/cw-s-response-global/div/div");
   	    Reporter.log("Click on Global checkbox | ");
   	    Thread.sleep(3000);
   	    
   	   //Click on Proceed Button In Warning Pop-up
   	    assertTextXpath("html/body/div[2]/div/div/div[3]/button[1]");
   	    clickByXpath("html/body/div[2]/div/div/div[3]/button[1]");
   	    Reporter.log("Click on Proceed Button In Warning Pop-up | ");
   	    Thread.sleep(8000);
   	   //Thread.sleep(2000);
       	       	       
 	       //Click on Notes button to add text
		    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[9]/div[1]/a");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[9]/div[1]/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    //Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div/a/span");
		    clickByXpath("//div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(5000);
		    //Thread.sleep(3000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		 // Select any one of the Listed Notes
		    assertTextXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
		    clickByXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the Listed Notes | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		 // Click on Edit Button
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Click on Edit Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		   // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "Edit notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click on Save Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Save Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		    
		    //Click on Document to upload
		    assertTextXpath("//a[2]/a/i");
		    clickByXpath("//a[2]/a/i");
		    Reporter.log("Click on Document to upload | ");
		    Thread.sleep(5000);
		    
		    //Click on New button from document pop-up
		    assertTextXpath("//div/a/span");
		    clickByXpath("//div/a/span");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(3000);
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/input");
		    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/input");
		    Reporter.log("Click on Choose File from document pop-up | ");
		    Thread.sleep(3000);
		    
		    // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of pdf file | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        
	        //Click on Upload button from document pop-up
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Upload button from document pop-up | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
	      
		    //Select any one of the listed item
		    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the listed item | ");
		    Thread.sleep(3000);
		 		    	    	    
		  //Select Delete button in Uploaded Document
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Select Delete button in Uploaded Document | ");
		    Thread.sleep(3000);
		    
		    // Click on Delete button in Deleted Pop-up
		    assertTextXpath("//div[3]/button[2]");
		    clickByXpath("//div[3]/button[2]");
		    Reporter.log("Click on Delete button in Deleted Pop-up | ");
		    Thread.sleep(5000);		    
		  
		    // Click on Close button		  
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on CLose Button | ");
		    Thread.sleep(3000); 
		    Thread.sleep(3000); 
		    
	       /* //Expand the Controls
		    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    Reporter.log("Expand the Controls | ");
		    Thread.sleep(3000);
		    
		    //Expand the Controls
		    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[2]/span[1]");
		    Reporter.log("Expand the Controls | ");
		    Thread.sleep(3000);
	   	      
		    // Click ? Button
		    assertTextXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[3]/i");
		    clickByXpath("//*[@id='controlInfo-content']/div/cw-add-custom-control/div/div/span[3]/i");
		    Reporter.log("Click ? Button | ");
		    Thread.sleep(5000);
	           
		    // Click on Close button in ? Pop-up
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in ? Pop-up | ");
		    //clickByXpath("html/body/div[4]/div/div/div[3]/button");
	        Thread.sleep(5000);    */
	       	       	       
	       //Click on RiskLikehood drop-down
	       try {
	    	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	       Reporter.log("Click on RiskLikehood drop-down | ");
           }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		   }
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	       
	       //Select 'Moderate' option from Likehood drop-down
	       try {
	    	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	       clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	       Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
           }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		   }
	       Thread.sleep(3000);
	       Thread.sleep(3000);
	       
	        // Click on RiskImpact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		          e.printStackTrace();
		          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		   }
	       Thread.sleep(3000);
	       //Thread.sleep(3000);
	       	       
	        //Select 'Major' option from Impact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		   {
		        e.printStackTrace();
		        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		   }
	       Thread.sleep(3000);
	       Thread.sleep(3000);
	       
	     //Click on Notes button to add text
		    assertTextXpath("//*[@id='body-content']/div[1]/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/a");
		    clickByXpath("//*[@id='body-content']/div[1]/div[3]/div/div/div[2]/table/tbody/tr[1]/td[5]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created Risk notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		     // Select any one of the Listed Notes
		    assertTextXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
		    clickByXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the Listed Notes | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click on Edit Button
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Click on Edit Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		     // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "Edit Risk notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click on Save Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Save Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		   //Click on New button in Notes pop-up window
		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created second Risk notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    		    
		    // Click on Delete Button
		    assertTextXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[3]/span/i");
		    clickByXpath("//*[@id='note-details-table_wrapper']/div[1]/div[1]/div/a[3]/span/i");
		    Reporter.log("Click on Delete Button | ");
		    Thread.sleep(3000);
		    clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		  	   
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000); 
		    	    
	        // Click on 'GoTo next Thread' button
	        try {
	        	assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("First page - Click on 'GoTo next Thread' button | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	        //2nd page
	        //Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	       
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[2]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[2]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	       
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    //Thread.sleep(5000);
		    Thread.sleep(3000);
		    
		    //Click on Notes button to add text
		    assertTextXpath("//td[9]/div[2]/a");
		    clickByXpath("//td[9]/div[2]/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div/div/div/div/a");
		    clickByXpath("//div/div/div/div/a");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes for Delete function");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		 // Select any one of the Listed Notes
		    assertTextXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
		    clickByXpath("//div[2]/div[2]/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the Listed Notes | ");
		    Thread.sleep(3000);
		    //Thread.sleep(5000);
		    
		 // Click on Delete Button
		    assertTextXpath("//a[3]/span");
		    clickByXpath("//a[3]/span");
		    Reporter.log("Click on Delete Button | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		       
		    // Click on Delete Button in Confirmation pop-up
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Delete Button in Confirmation pop-up | ");
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000); 		      
		       
	        //Click on RiskLikehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		   }
	       Thread.sleep(5000);
	       //Thread.sleep(3000);
	       
	        //Select 'Moderate' option from Likehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	 	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	        
	        // Click on RiskImpact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	       // Thread.sleep(3000);
	       
	        //Select 'Major' option from Impact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		     }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	        // Click on 'GoTo next Thread' button
	        try {
	        	assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("Second Page - Click on 'GoTo next Thread' button | ");
             }catch(Exception e)
		     {
		        e.printStackTrace();
		        Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		     }
	         Thread.sleep(3000);
	         Thread.sleep(3000);
	       
	         //3rd page       
	         
	         // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[2]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[2]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	          }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
		       
	       
		    // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[1]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[1]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
            }catch(Exception e)
		    {
        	    e.printStackTrace();
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	        }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	       
            // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[6]/cw-s-response-choices/div/div/label[3]");
		        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[6]/cw-s-response-choices/div/div/label[3]");
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
	       
	        // Select 'Yes' option in Response choice of listed Controls
	        try {
	        	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[6]/cw-s-response-choices/div/div/label[1]");
	            clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[4]/td[6]/cw-s-response-choices/div/div/label[1]");
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		    }catch(Exception e)
	        {
	            e.printStackTrace();
		        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
		    }
            Thread.sleep(3000);
            //Thread.sleep(3000);
	       
            // Select 'Yes' option in Response choice of listed Controls
            try {
            	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[6]/cw-s-response-choices/div/div/label[3]");
	            clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[5]/td[6]/cw-s-response-choices/div/div/label[3]");
 	            Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
             }catch(Exception e)
             {
                e.printStackTrace();
                Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
            }
            Thread.sleep(3000);
            //Thread.sleep(3000);
	 
            // Select 'Yes' option in Response choice of listed Controls
	        try {
	        	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[6]/cw-s-response-choices/div/div/label[2]");
	            clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[6]/td[6]/cw-s-response-choices/div/div/label[2]");
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
	        {
	            e.printStackTrace();
	            Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
	        }
		    //Thread.sleep(5000);
		    Thread.sleep(3000);
	       	       
	        //Click on RiskLikehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	       
	        //Select 'Moderate' option from Likehood drop-down
	        try {
	        	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	        // Click on RiskImpact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	       
	        //Select 'Major' option from Impact drop-down
	        try {
	        	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	        Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	        // Click on 'GoTo next Thread' button
	        try {
	        	assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("Third Page - Click on 'GoTo next Thread' button | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	        // 4th page
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	         }catch(Exception e)
			 {
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			 }
		     Thread.sleep(3000);
		     //Thread.sleep(3000);
		     
		     // Click on Clear button to clear the response 
			  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[7]/cw-s-response-clear/div/span/i");
			  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[7]/cw-s-response-clear/div/span/i");
			  Reporter.log("Click on Clear button to clear the response | ");
			  Thread.sleep(5000);
			  //Thread.sleep(3000);
			  
			// Click on Remove button to clear the response 
			  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
			  Reporter.log("Click on Remove button to clear the response | ");
			  Thread.sleep(5000);
			 // Thread.sleep(3000);
			  
			// Select 'Yes' option in Response choice of listed Controls
			    try {
			    	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
			 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
			 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		         }catch(Exception e)
				 {
				    e.printStackTrace();
				    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
				 }
			     Thread.sleep(3000);
			     //Thread.sleep(3000);
		  			     
			   // Click on Add a Custom Control	  
			     assertTextXpath("//cw-add-custom-control/div/div/span");
			     clickByXpath("//cw-add-custom-control/div/div/span");
			     Reporter.log("Click on Add a Custom Control	| ");
			     Thread.sleep(3000); 

			     // Click on Add a Custom Control textbox		  
			     //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
			     clickByXpath("//cw-add-custom-control/div/div/div/div/div/input");
			     Reporter.log("Click on Add a Custom Control tetbox| ");
			     Thread.sleep(3000); 
			     
			     // Enter the New Custom Control
			     //assertTextXpath("//cw-add-custom-control/div/div/div/div/div/input");
			     sendvaluebyxpath("//cw-add-custom-control/div/div/div/div/div/input", "NewControl");
			     Reporter.log("Enter the New Custom Controls| ");
			     Thread.sleep(3000); 

			     // Click from listed add custom controls		  
			     assertTextXpath("//div/strong");
			     clickByXpath("//div/strong");
			     Reporter.log("Click from listed add custom controls | ");
			     Thread.sleep(5000); 
			     
			     // Click on Custom Button	  
			     assertTextXpath("//span[2]/div/div[2]/span");
			     clickByXpath("//span[2]/div/div[2]/span");
			     Reporter.log("Click on Custom Button | ");
			     Thread.sleep(3000); 
			     
			     // Click on Close button
			     assertTextXpath("//div[4]/div/div/div[3]/button");
			     clickByXpath("//div[4]/div/div/div[3]/button");
			     Reporter.log("Click on Close button | ");
			     Thread.sleep(3000); 
			     
			     // Delete the Added Custom Controls
			     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[11]/cw-remove-custom-control/a/i");
			     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[11]/cw-remove-custom-control/a/i");
			     Reporter.log("Click on Close button | ");
			     Thread.sleep(5000); 
			     //Thread.sleep(5000); 
			     
			     //Click on NST Button
			     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[4]/span/div/div[1]/span");
			     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr/td[4]/span/div/div[1]/span");
			     Reporter.log("Click on Close button | ");
			     Thread.sleep(3000);
			     			     
			     // Click on Close button
			     assertTextXpath("//div[4]/div/div/div[3]/button");
			     clickByXpath("//div[4]/div/div/div[3]/button");
			     Reporter.log("Click on Close button | ");
			     Thread.sleep(3000);
			     //Thread.sleep(5000);
			    
			     //Click on Control Tag Button
			     assertTextXpath("//cw-tag/a/span");
			     clickByXpath("//cw-tag/a/span");
			     Reporter.log("Click on Control Tag button | ");
			     Thread.sleep(3000);
			     			     
			     // Click on Checkbox from tag popup
			     assertTextXpath("html/body/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
			     clickByXpath("html/body/div[5]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div");
			     Reporter.log("Click on Checkbox from tag popup | ");
			     Thread.sleep(5000);
			     //Thread.sleep(5000);
			     
			     // Click on Done button
			     assertTextXpath("//div[3]/button[2]");
			     clickByXpath("//div[3]/button[2]");
			     Reporter.log("Click on Close button | ");
			     Thread.sleep(3000);
			     Thread.sleep(3000);		 	     
	       
	         //Click on RiskLikehood drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskLikehood drop-down | ");
              }catch(Exception e)
		      {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		       }
	          Thread.sleep(5000);
	          //Thread.sleep(3000);
	       
	          //Select 'Moderate' option from Likehood drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	 	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[2]/a");
	 	          Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
              }catch(Exception e)
		      {
		          e.printStackTrace();
		          Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		      }
	          Thread.sleep(3000);
	          Thread.sleep(3000);
	       
	          // Click on RiskImpact drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	          clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	          Reporter.log("Click on RiskImpact drop-down | ");
               }catch(Exception e)
		       {
		          e.printStackTrace();
		          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		       }
	           Thread.sleep(5000);
	           //Thread.sleep(3000);
	       
	          //Select 'Major' option from Impact drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	          clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	          Reporter.log("Select 'Major' option from Impact drop-down | ");
              }catch(Exception e)
		      {
		           e.printStackTrace();
		           Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		      }
	          Thread.sleep(3000);
	          Thread.sleep(3000);
	       
	          // Click on 'GoTo next Thread' button
	          try {
	        	  assertTextXpath("//*[@id='pVuln']");
	              clickByXpath("//*[@id='pVuln']");
	              Reporter.log("Fourth Page - Click on 'GoTo next Thread' button | ");
              }catch(Exception e)
		      {
		           e.printStackTrace();
		           Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		      }
	          Thread.sleep(3000);
	          Thread.sleep(3000);
	       
	         //5th page
	         // Select 'Yes' option in Response choice of listed Controls
		     try {
		    	 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	          }catch(Exception e)
			  {
			     e.printStackTrace();
			     Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			  }
		      Thread.sleep(3000);
		      //Thread.sleep(3000);
	       
		     // Select 'Yes' option in Response choice of listed Controls
			 try { 
				 assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[2]");
			     clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[2]");
			     Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		      }catch(Exception e)
			  {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			  }
			  Thread.sleep(3000);
			  //Thread.sleep(3000);
	             
	          //Click on RiskLikehood drop-down
	          try {
	        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          Reporter.log("Click on RiskLikehood drop-down | ");
              }catch(Exception e)
		      {
		         e.printStackTrace();
		         Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		      }
	          Thread.sleep(5000);
	          //Thread.sleep(3000);
	       
	         //Select 'Moderate' option from Likehood drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	         Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
             }catch(Exception e)
		     {
		          e.printStackTrace();
		          Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		     }
	         Thread.sleep(3000);
	         Thread.sleep(3000);
	       
	         // Click on RiskImpact drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskImpact drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	         //Thread.sleep(3000);
	       
	         //Select 'Major' option from Impact drop-down
	         try {
	        	 assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         Reporter.log("Select 'Major' option from Impact drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		     }
	         Thread.sleep(3000);
	         Thread.sleep(3000);
	       
	          // Click on 'GoTo next Thread' button
	          try {
	        	  assertTextXpath("//*[@id='pVuln']");
	              clickByXpath("//*[@id='pVuln']");
	              Reporter.log("Fifth Page - Click on 'GoTo next Thread' button | ");
             }catch(Exception e)
		     {
		          e.printStackTrace();
		          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		     }
	         Thread.sleep(3000);
	         Thread.sleep(3000);
	       
	          //6th page
	          // Select 'Yes' option in Response choice of listed Controls
		      try {
		    	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[2]");
		 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[2]");
		 	      Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			       e.printStackTrace();
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		      // Thread.sleep(3000);
		       		       
		       // Select 'Yes' option in Response choice of listed Controls
			   try {
				   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[1]");
			 	   clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[6]/cw-s-response-choices/div/div/label[1]");
			 	   Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
		       }catch(Exception e)
			   {
				   e.printStackTrace();
				   Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
			   Thread.sleep(3000);
			  // Thread.sleep(3000);
	       
	           // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[6]/cw-s-response-choices/div/div/label[3]");
		           clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[6]/cw-s-response-choices/div/div/label[3]");
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
			   }catch(Exception e)
			   {
			       e.printStackTrace();
			       Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
			   Thread.sleep(3000);
			   //Thread.sleep(3000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		       }
	           Thread.sleep(5000);
	           //Thread.sleep(3000);
	       
	           //Select 'Moderate' option from Likehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	           Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		       }
	           Thread.sleep(3000);
	          Thread.sleep(3000);
	        
	           // Click on RiskImpact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskImpact drop-down | ");
                }catch(Exception e)
		        {
		           e.printStackTrace();
		           Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		        }
	            Thread.sleep(5000);
	           //Thread.sleep(3000);
	       
	           //Select 'Major' option from Impact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	           Reporter.log("Select 'Major' option from Impact drop-down | ");
               }catch(Exception e)
		       {
		          e.printStackTrace();
		          Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		       }
	           Thread.sleep(3000);
	           Thread.sleep(3000);
	       
	           // Click on 'GoTo next Thread' button
	           try {
	        	   assertTextXpath("//*[@id='pVuln']");
	               clickByXpath("//*[@id='pVuln']");
	               Reporter.log("Sixth Page - Click on 'GoTo next Thread' button | ");
               }catch(Exception e)
		       {
		          e.printStackTrace();
		          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		       }
	           Thread.sleep(3000);
	           Thread.sleep(3000);
	       
	           //7th page
	           // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	   assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	       clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	       Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			        e.printStackTrace();
			        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		       }
	           Thread.sleep(5000);
	           //Thread.sleep(3000);
	       
	           //Select 'Moderate' option from Likehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	           Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
               }catch(Exception e)
		       {
		            e.printStackTrace();
		            Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		       }
	           Thread.sleep(3000);
	           Thread.sleep(3000);
	       
	           // Click on RiskImpact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskImpact drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		       }
	           Thread.sleep(5000);
	           //Thread.sleep(3000);
	       
	           //Select 'Major' option from Impact drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	           clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	           Reporter.log("Select 'Major' option from Impact drop-down | ");
               }catch(Exception e)
		       {
		            e.printStackTrace();
		            Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		        }
	            Thread.sleep(3000);
	            Thread.sleep(3000);
	       
	         /*   // Click on 'GoTo next Thread' button
	            try {
	            	assertTextXpath("//*[@id='pVuln']");
	                clickByXpath("//*[@id='pVuln']");
	                Reporter.log("Seventh Page - Click on 'GoTo next Thread' button | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		        }
	            Thread.sleep(3000);
	            Thread.sleep(3000);
	       
	            //8th page
	            // Select 'Yes' option in Response choice of listed Controls
		        try {
		        	assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	            }catch(Exception e)
			    {
			         e.printStackTrace();
			        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			    }
		        Thread.sleep(3000);  
		        //Thread.sleep(3000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	        	   assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
               }catch(Exception e)
		       {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		        }
	            Thread.sleep(5000);
	            //Thread.sleep(3000);
	       
	            //Select 'Moderate' option from Likehood drop-down
	            try {
	            	assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[6]/a");
	 	            clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[6]/a");
	 	            Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		        }
	             Thread.sleep(3000);
	            Thread.sleep(3000);
	       
	            // Click on RiskImpact drop-down
	            try {
	            	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            Reporter.log("Click on RiskImpact drop-down | ");
                 }catch(Exception e)
		        {
		             e.printStackTrace();
		             Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		         }
	             Thread.sleep(5000);
	             //Thread.sleep(3000);
	       
	            //Select 'Major' option from Impact drop-down
	            try {
	            	assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	            Reporter.log("Select 'Major' option from Impact drop-down | ");
                }catch(Exception e)
		        {
		             e.printStackTrace();
		             Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		        }
	            Thread.sleep(3000);
	            Thread.sleep(3000);
	       
	            // Click on 'GoTo next Thread' button
	            try {
	    	        assertTextXpath("//*[@id='pVuln']");
	                clickByXpath("//*[@id='pVuln']");
	                Reporter.log("Eight Page - Click on 'GoTo next Thread' button | ");
                 }catch(Exception e)
		         {
		            e.printStackTrace();
		            Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		         }
	             Thread.sleep(3000);
	             Thread.sleep(3000);
	       
	            //9th page
	            // Select 'Yes' option in Response choice of listed Controls
		       try {
		    	    assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	        clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	        Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			        e.printStackTrace();
			        Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
	       
	          //Click on RiskLikehood drop-down
	          try {
	    	      assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	          Reporter.log("Click on RiskLikehood drop-down | ");
              }catch(Exception e)
		      {
		          e.printStackTrace();
		          Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		      }
	          Thread.sleep(5000);
	         // Thread.sleep(3000);
	       
	         //Select 'Moderate' option from Likehood drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	         clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	         Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		     }
	         Thread.sleep(3000);
	         Thread.sleep(3000);
	       
	         // Click on RiskImpact drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskImpact drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		    }
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	       
	       //Select 'Major' option from Impact drop-down
	       try {
	    	   assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[6]/a");
	 	       clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[6]/a");
	 	       Reporter.log("Select 'Major' option from Impact drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	        // Click on 'GoTo next Thread' button
	        try {
	    	    assertTextXpath("//*[@id='pVuln']");
	            clickByXpath("//*[@id='pVuln']");
	            Reporter.log("Nine page - Click on 'GoTo next Thread' button | ");
             }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	        //10th page
	        // Select 'Yes' option in Response choice of listed Controls
		    try {
		        assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	    clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[3]");
		 	    Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	        }catch(Exception e)
			{
			    e.printStackTrace();
			    Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			}
		    Thread.sleep(3000);  
		    //Thread.sleep(3000);
	     
	        //Click on RiskLikehood drop-down
	        try {
	    	    assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	        Reporter.log("Click on RiskLikehood drop-down | ");
            }catch(Exception e)
		    {
		        e.printStackTrace();
		        Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		    }
	        Thread.sleep(5000);
	        //Thread.sleep(3000);
	       
	        //Select 'Moderate' option from Likehood drop-down
	        try {
	    	    assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	        Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
            }catch(Exception e)
		    {
		         e.printStackTrace();
		         Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		    }
	        Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	         // Click on RiskImpact drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	         Reporter.log("Click on RiskImpact drop-down | ");
             }catch(Exception e)
		     {
		          e.printStackTrace();
		          Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		     }
	         Thread.sleep(5000);
	         //Thread.sleep(3000);
	       
	         //Select 'Major' option from Impact drop-down
	         try {
	    	     assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	         Reporter.log("Select 'Major' option from Impact drop-down | ");
             }catch(Exception e)
		     {
		         e.printStackTrace();
		         Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		     }
	         Thread.sleep(3000);
	        Thread.sleep(3000);
	       
	         // Click on 'GoTo next Thread' button
	         try {
	    	      assertTextXpath("//*[@id='pVuln']");
	              clickByXpath("//*[@id='pVuln']");
	              Reporter.log("Tenth Page - Click on 'GoTo next Thread' button | ");
              }catch(Exception e)
		      {
		          e.printStackTrace();
		          Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		      }
	          Thread.sleep(3000);
	          Thread.sleep(3000);
	       
	          //11th page
	          // Select 'Yes' option in Response choice of listed Controls
		      try {
		    	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	      clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	      Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	           }catch(Exception e)
			   {
			      e.printStackTrace();
			      Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			   }
		       Thread.sleep(3000);
		       //Thread.sleep(3000);
	       
	           //Click on RiskLikehood drop-down
	           try {
	    	       assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	           Reporter.log("Click on RiskLikehood drop-down | ");
                }catch(Exception e)
		        {
		           e.printStackTrace();
		           Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		        }
	            Thread.sleep(5000);
	            //Thread.sleep(3000);
	       
	            //Select 'Moderate' option from Likehood drop-down
	            try {
	    	        assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	            clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	            Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
                 }catch(Exception e)
		        {
		             e.printStackTrace();
		             Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		        }
	            Thread.sleep(3000);
	            Thread.sleep(3000);
	       
	            // Click on RiskImpact drop-down
	            try {
	    	        assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	            Reporter.log("Click on RiskImpact drop-down | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		        }
	            Thread.sleep(5000);
	           // Thread.sleep(3000);
	       
	            //Select 'Major' option from Impact drop-down
	            try {
	    	        assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	            clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[3]/a");
	 	            Reporter.log("Select 'Major' option from Impact drop-down | ");
                }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		         }
	             Thread.sleep(3000);
	             Thread.sleep(3000);
	       
	            // Click on 'GoTo next Thread' button
	            try {
	    	        assertTextXpath("//*[@id='pVuln']");
	                clickByXpath("//*[@id='pVuln']");
	                Reporter.log("11th page - Click on 'GoTo next Thread' button | ");
                 }catch(Exception e)
		        {
		            e.printStackTrace();
		            Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
		         }
	             Thread.sleep(3000);
	             Thread.sleep(3000);
	       
	             //12th page
	             // Select 'Yes' option in Response choice of listed Controls
		         try {
		    	     assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	         clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[6]/cw-s-response-choices/div/div/label[1]");
		 	         Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
	             }catch(Exception e)
			     {
			          e.printStackTrace();
			         Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
			     }
		         Thread.sleep(3000);
		         //Thread.sleep(3000);
	       
	             //Click on RiskLikehood drop-down
	             try {
	    	         assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	             clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
	 	             Reporter.log("Click on RiskLikehood drop-down | ");
                  }catch(Exception e)
		         {
		             e.printStackTrace();
		             Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
		         }
	             Thread.sleep(5000);
	             //Thread.sleep(3000);
	       
	             //Select 'Moderate' option from Likehood drop-down
	             try {
	    	         assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	             clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
	 	             Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
                  }catch(Exception e)
		          {
		              e.printStackTrace();
		              Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
		          }
	              Thread.sleep(3000);
	              Thread.sleep(3000);
	       
	              // Click on RiskImpact drop-down
	              try {
	    	          assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	              clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
	 	              Reporter.log("Click on RiskImpact drop-down | ");
                  }catch(Exception e)
		          {
		               e.printStackTrace();
		               Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
		          }
	              Thread.sleep(5000);
	             
	       
	              //Select 'Major' option from Impact drop-down
	              try {
	    	          assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	              clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
	 	              Reporter.log("Select 'Major' option from Impact drop-down | ");
                  }catch(Exception e)
		          {
		              e.printStackTrace();
		              Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
		           }
	               Thread.sleep(3000);
	               Thread.sleep(3000);*/
	       
	              // Click on 'save' button
	              try {
	    	          assertTextXpath("//*[@id='pMedia']");
	                  clickByXpath("//*[@id='pMedia']");
	                  Reporter.log("Select save button | ");
                  }catch(Exception e)
		          {
		              e.printStackTrace();
		              Reporter.log("click on save button doesn't work | ");
		           }
	               Thread.sleep(3000);
	               Thread.sleep(3000);
	               //Thread.sleep(3000);	
	               
	            // Select Risk Questionnaire list sub-module under Risk Determination Module
		   	        try {
		   	        	assertTextLink("Risk Questionnaire List");
		   	            clickBylinktext("Risk Questionnaire List");
		   	            Reporter.log("Select Risk Questionnaire List | ");
		             }catch(Exception e)
		   		    {
		   		        e.printStackTrace();
		   		        Reporter.log("Select Risk Questionnaire List doesn't reached | ");
		   		    }
		   	        Thread.sleep(5000);
		   	        //Thread.sleep(2000);
		   	        //Thread.sleep(3000);
		   	        
		   	        // Click on Leave Page 
		   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		   	        Thread.sleep(3000);
		   	        Thread.sleep(3000);
		   	       //Thread.sleep(3000); 
			    			 			      	     
	  }   
	  
	  @Test(priority=12, enabled =false)
      public void RQLPager() throws InterruptedException, IOException { 
    	     	  
    	   Thread.sleep(3000);

          // Click on 'continue' button of Media/Asset of Pager 
          try {
        	  assertTextXpath("//*[@id='content']/tr[8]/td[7]/div/div[1]/span");
        	  clickByXpath("//*[@id='content']/tr[8]/td[7]/div/div[1]/span");
        	  Reporter.log("Click on 'continue' button of Pager Media/Asset | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on 'continue' button of Pager doesn't work | ");
          }
          Thread.sleep(5000);          
          Thread.sleep(5000);

          //2nd Media/Asset
          //1st Page
          // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
          Thread.sleep(5000);
  
          // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
          Thread.sleep(5000);   
             		       	       	   	       
          //Click on RiskLikehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  Reporter.log("Click on RiskLikehood drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
          }
          Thread.sleep(5000);
     
          //Select 'Moderate' option from Likehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
          }
          Thread.sleep(5000);
     
          // Click on RiskImpact drop-down
          try {
        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        	  clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        	  Reporter.log("Click on RiskImpact drop-down | ");
          }catch(Exception e)
          {
	     	    e.printStackTrace();
	     	    Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
          }
          Thread.sleep(5000);
     
          //Select 'Major' option from Impact drop-down
          try {
        	  assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        	  clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        	  Reporter.log("Select 'Major' option from Impact drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
          }
          Thread.sleep(5000);
          
          // Click on 'GoTo next Thread' button
          try {
        	  assertTextXpath("//*[@id='pVuln']");
        	  clickByXpath("//*[@id='pVuln']");
        	  Reporter.log("First page - Click on 'GoTo next Thread' button | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
          }
          Thread.sleep(5000);
          Thread.sleep(5000);

            //2nd page
          // Select 'Yes' option in Response choice of listed Controls
          try {
        	  assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
          }
          Thread.sleep(5000);
  	   	        	       	       	   	       
          //Click on RiskLikehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        	  Reporter.log("Click on RiskLikehood drop-down | ");
          }catch(Exception e)
          {
        	  e.printStackTrace();
        	  Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
          }
          Thread.sleep(5000);
          
          //Select 'Moderate' option from Likehood drop-down
          try {
        	  assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        	  Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
          	}catch(Exception e)
          	{
          		e.printStackTrace();
          		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
          	}
          	Thread.sleep(5000);
     
          	// Click on RiskImpact drop-down
          	try {
          		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
          		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
          		Reporter.log("Click on RiskImpact drop-down | ");
          	}catch(Exception e)
          	{
          		e.printStackTrace();
          		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
          	}
          	Thread.sleep(5000);
     
          	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);
        	Thread.sleep(5000);
     
        	// 3rd page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);
  
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[2]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);
  
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[3]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);
 
  	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);
        	Thread.sleep(5000);

        	//4th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);  
      		       	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);
        	Thread.sleep(5000);

        	//5th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);  
      		       	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
        		
        	// Click on 'GoTo next Thread' button
        	try {
        		assertTextXpath("//*[@id='pVuln']");
        		clickByXpath("//*[@id='pVuln']");
        		Reporter.log("First page - Click on 'GoTo next Thread' button | ");
        	}catch(Exception e)
        	{
        			e.printStackTrace();
        			Reporter.log("Click on 'GoTo next Thread' button doesn't reached | ");
        	}
        	Thread.sleep(5000);
        	Thread.sleep(5000);

        	//6th page
        	// Select 'Yes' option in Response choice of listed Controls
        	try {
        		assertTextXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		clickByXpath("//*[@id='riskQuestionsControls']/tbody/tr[1]/td[5]/cw-s-response-choices/div/div/label[1]");
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Yes' option in Response choice of listed Controls doesn't work | ");
        	}
        	Thread.sleep(5000);  
      		       	       	   	       
        	//Click on RiskLikehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskLikehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskLikehood drop-down doesn't work | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Moderate' option from Likehood drop-down
        	try {
        		assertTextXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		clickByXpath("//*[@id='riskLikelihoodSelect']/cw-risk-choices/div/ul/li[4]/a");
        		Reporter.log("Select 'Moderate' option from Likehood drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Moderate' option from Likehood drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	// Click on RiskImpact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/button");
        		Reporter.log("Click on RiskImpact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Click on RiskImpact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
     
        	//Select 'Major' option from Impact drop-down
        	try {
        		assertTextXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		clickByXpath("//*[@id='riskImpactSelect']/cw-risk-choices/div/ul/li[5]/a");
        		Reporter.log("Select 'Major' option from Impact drop-down | ");
        	}catch(Exception e)
        	{
        		e.printStackTrace();
        		Reporter.log("Select 'Major' option from Impact drop-down doesn't reached | ");
        	}
        	Thread.sleep(5000);
        	Thread.sleep(5000);
     
        	 // Click on 'save' button
            try {
  	          assertTextXpath("//*[@id='pMedia']");
                clickByXpath("//*[@id='pMedia']");
                Reporter.log("Select save button | ");
            }catch(Exception e)
	          {
	              e.printStackTrace();
	              Reporter.log("click on save button doesn't work | ");
	           }
        	Thread.sleep(5000);
        	Thread.sleep(5000);
        	
        	// Select Risk Questionnaire list sub-module under Risk Determination Module
   	        try {
   	        	assertTextLink("Risk Questionnaire List");
   	            clickBylinktext("Risk Questionnaire List");
   	            Reporter.log("Select Risk Questionnaire List | ");
             }catch(Exception e)
   		    {
   		        e.printStackTrace();
   		        Reporter.log("Select Risk Questionnaire List doesn't reached | ");
   		    }
   	        Thread.sleep(5000);
   	        //Thread.sleep(2000);
   	        //Thread.sleep(3000);
   	        
   	        // Click on Leave Page 
   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
   	        Thread.sleep(3000);
   	        Thread.sleep(3000);
   	       //Thread.sleep(3000); 
          }  
	  
	  @Test(priority=12, enabled = true)
	  public void RiskdeterminationFilter() throws InterruptedException, IOException {
	       
				
		        Thread.sleep(3000);
		        //Thread.sleep(3000);
		        //Thread.sleep(3000);
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
		        Thread.sleep(5000);
			   // Thread.sleep(5000);
			    
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
		        Thread.sleep(5000);
			   // Thread.sleep(5000);
						        	         
		  		 //Click on Media/Asset drop-down
		   	     clickByXpath("//*[@id='control-type']");
		   	     Thread.sleep(3000);
		   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[2]/a");
		   	     Thread.sleep(2000);
		   	     Thread.sleep(5000);
		   	     clickByXpath("//*[@id='control-type']");
		   	     Thread.sleep(3000);
		   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list/div/ul/li[1]/a");
		   	     Thread.sleep(5000);
		   	     Thread.sleep(3000);      
			  	       
		  		// Click on Filter Button on Risk Questionnaire list sub-module under Risk Determination Module
		  		try {
		  			assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  			clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
		  			Reporter.log("Click on Filter Button on Risk Questionnaire list page | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Filter Button doesn't clicked | ");
		  		}
		  		Thread.sleep(3000);
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
	       
		  		    // Click on Media drop-down
		  			assertTextXpath("//div/ul/li/input");
		  			clickByXpath("//div/ul/li/input");
		  			Reporter.log("Click on Media drop-down | ");
		  			Thread.sleep(2000);
		  			clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  			Reporter.log("Select First-value on Media drop-down | ");
		  			Thread.sleep(3000);		  	
		  		    //Thread.sleep(3000);
		  		  //Thread.sleep(3000);
	                 
		  		//Click on Media drop-down and select multi-values
		  		try {
		  			assertTextXpath("//li[2]/input");
		  			clickByXpath("//li[2]/input");
		  			Reporter.log("Click on Media drop-down | ");
		  			Thread.sleep(2000);
		  			clickByXpath("//div/div/div/div/ul/li[3]");
		  			Reporter.log("Click on Media drop-down and select other-values | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Media drop-down and select Second-value doesn't select | ");
		  		}
		  		Thread.sleep(3000);
	       
		  		// Click on Media-Label drop-down
		  		try {
		  			assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  			clickByXpath("//div[2]/div/div/div/ul/li/input");
		  			Reporter.log("Click on Media-Label drop-down | ");
		  			Thread.sleep(2000);
		  			assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li[2]");
		  			clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li[2]");
		  			Reporter.log("Select First-value on Media-Label drop-down | ");
		  			//Thread.sleep(3000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Media-Label drop-down and select First-value doesn't select | ");
		  		}
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
	       
		  		//Click on Media-label drop-down and select multi-values
		  		try {
		  			assertTextXpath("//li[2]/input");
		  			clickByXpath("//li[2]/input");
		  			Reporter.log("Click on Media-Label drop-down | ");
		  			Thread.sleep(2000);
		  			assertTextXpath("//div[2]/div/div/div/div/ul/li[6]");
		  			clickByXpath("//div[2]/div/div/div/div/ul/li[6]");
		  			Reporter.log("Click on Media-Label drop-down and select other-values | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Media-label drop-down and select Second-value doesn't select | ");
		  		}
		  		Thread.sleep(3000);
	       
		  		// Click on Asset drop-down
		  		try {
		  			assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  			clickByXpath("//div[3]/div/div/div/ul/li/input");
		  			Reporter.log("Click on Asset drop-down | ");
		  			Thread.sleep(2000);
		  			assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  			clickByXpath("//div[3]/div/div/div/div/ul/li");
		  			Reporter.log("Select First-value on Asset drop-down | ");
		  			Thread.sleep(3000);
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Asset drop-down and select First-value doesn't select | ");
		  		}
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
	       
		  		//Click on Asset drop-down and select multi-values
		  		try {
		  			assertTextXpath("//li[2]/input");
		  			clickByXpath("//li[2]/input");
		  			Reporter.log("Click on Asset drop-down | ");
		  			Thread.sleep(2000);
		  			assertTextXpath("//div[3]/div/div/div/div/ul/li[2]");
		  			clickByXpath("//div[3]/div/div/div/div/ul/li[2]");
		  			Reporter.log("Click on Asset drop-down and select other-values | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Click on Asset drop-down and select Second-value doesn't select | ");
		  		}
		  		Thread.sleep(3000);
	       
		  		// Enter the Total Sensitive Records 
		  		try {
		  			sendvaluebyxpath("//div/div/input", "1");
		  			sendvaluebyxpath("//div[2]/input", "100");
		  			Reporter.log("Enter the Total Sensitive Records  | ");
		  		}catch(Exception e)
		  		{
		  			e.printStackTrace();
		  			Reporter.log("Enter the Total Sensitive Records doesn't work | ");
		  		}
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
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
		  		Thread.sleep(5000);   
		  		Thread.sleep(2000);
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
		       Thread.sleep(5000);
		       //Thread.sleep(3000);
		       Thread.sleep(3000);   
	  }
		       
		       @Test(priority=13, enabled = true)
		       public void ExportRiskDeterminationList() throws InterruptedException, IOException
		    	   {	
		    	   
		    	   Thread.sleep(2000);
				   //Click on Export Button
				   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				   Reporter.log("Click on Export Button | ");
				   Thread.sleep(5000);
				   //Thread.sleep(3000);
				  
				  //Click on Pdf 
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  Reporter.log("Click on Pdf | ");
				  Thread.sleep(5000);
				  Thread.sleep(3000);
				  
				  //Click on Export Button
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  Reporter.log("Click on Export Button | ");
				  //Thread.sleep(3000);
				  Thread.sleep(5000);
				  
				  //Click on CSV File
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(5000);
				  Thread.sleep(3000);
	  }
		       @Test (priority=14, enabled = true)
				public void RiskdeterminationSort() throws IOException, InterruptedException {

		    	   //Thread.sleep(5000);
			        //Thread.sleep(5000);
			        //Thread.sleep(3000);
			        Thread.sleep(2000);
				   									
					// Click on Media/label column Header to sort for Ascending order
					clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
					Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
					Thread.sleep(3000);	  
					/*Thread.sleep(3000);	
					sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			    	Thread.sleep(5000);	
					Thread.sleep(5000);	*/
													
					// Click on Media/label column Header to sort for Ascending order
					clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[2]/span[1]/span");
					Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
					Thread.sleep(3000);	
					/*Thread.sleep(5000);	
					Thread.sleep(5000);				
					sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
					sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
					Thread.sleep(5000);	
					Thread.sleep(5000);	*/
					
					// Click on Information Asset column Header to sort for Ascending order
					clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
					Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
					Thread.sleep(3000);	
					/*Thread.sleep(5000);	  
					sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
					Thread.sleep(5000);	
					Thread.sleep(5000);	
*/					
					// Click on Information Asset column Header to sort for Ascending order
					clickByXpath("//*[@id='risk_questionnaire_table']/thead/tr[1]/th[3]/span[1]/span");
					Reporter.log("Click on Information Asset column Header to sort for Ascending order  | ");
					Thread.sleep(3000);	
					/*Thread.sleep(5000);	
					sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
					sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
					Thread.sleep(5000);	
					Thread.sleep(5000);
					*/
					
				}
	  
      
 	 @Test(priority=15, enabled =true)
	  public void ControlsGlobalMedia() throws InterruptedException, IOException {
 		 		 		 
 		Thread.sleep(3000);
		 		  
		  //Select Controls - Global/Media sub-module under Risk determination Module 
		  assertTextXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  clickByXpath("//*[@id='sidebar-left']/ul/li[4]/ul/li[1]/a");
		  Reporter.log("Select Controls - Global/Media sub-module under Risk determination Module | ");
		  Thread.sleep(3000);
		  Thread.sleep(5000);
		  //Thread.sleep(3000);
		  
		  // Click on Cotrol Advisory
		  assertTextXpath("//*[@id='container-body']/tr[3]/td[1]/cw-advisory/a/span");
		  clickByXpath("//*[@id='container-body']/tr[3]/td[1]/cw-advisory/a/span");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  // Click checkbox for Change Reviewed
		  assertTextXpath("html/body/div[4]/div/div/div[3]/div/div/label");
		  clickByXpath("html/body/div[4]/div/div/div[3]/div/div/label");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(3000);
		  Thread.sleep(2000);
		  
		// Click on Save button
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  Reporter.log("Click on CSV File | ");
		  Thread.sleep(5000);
		  Thread.sleep(3000);
		  
		  //Select 'Yes' option in Response choice of First listed Controls
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Select 'Yes' option in Response choice of First listed Controls | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);	 
		  
		  //Click on proceed button to make global
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		  Reporter.log("Click on Proceed button | ");
		  Thread.sleep(5000);
		  Thread.sleep(2000);
		  
		  /*//Click on + Icon to open Control 
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
		  Thread.sleep(3000);*/
		  
		  // Click on Notes button 
		  assertTextXpath("//*[@id='container-body']/tr[1]/td[6]/div/a");
		  clickByXpath("//*[@id='container-body']/tr[1]/td[6]/div/a");
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
		  assertTextXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		  clickByXpath("html/body/div[6]/div/div/div/div[4]/div[3]/button[1]");
		  Reporter.log("Click on Create Button in Create Note pop-up window | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		  // Click on Close Button in note pop-up window
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button");
		  Reporter.log("Click on Close Button in note pop-up window | ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  /*// Click on Clear button to clear the response 
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
		  Thread.sleep(2000);*/
		  
		   //Click on Document to upload
		    assertTextXpath("//*[@id='container-body']/tr[1]/td[7]/a/a");
		    clickByXpath("//*[@id='container-body']/tr[1]/td[7]/a/a");
		    Reporter.log("Click on Document to upload | ");
		    Thread.sleep(5000);
		    
		    //Click on New button from document pop-up
		    assertTextXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    clickByXpath("//*[@id='document-details-table_wrapper']/div[1]/div[1]/div/a[1]");
		    Reporter.log("Click on New button from document pop-up | ");
		    Thread.sleep(5000);
		    
		    //Click on Choose File from document pop-up
		    assertTextXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/input");
		    clickByXpath("html/body/div[6]/div/div/div/div[3]/div/form/div/div[1]/div/div[1]/div/div/div[1]/div[1]/input");
		    Reporter.log("Click on Choose File from document pop-up | ");
		    Thread.sleep(5000);
		    
		    // Using AutoIT
	        Runtime.getRuntime().exec("C:\\Users\\User\\eclipse-workspace\\ClearWater\\AutoIT\\importfiles\\Fileupload4.exe"); //Uploading xls file using AutoIT
	        Reporter.log("Given Filepath of pdf file | ");
	        Thread.sleep(5000);
	        Thread.sleep(3000);
	        //Thread.sleep(5000);
	        
	        //Click on Upload button from document pop-up
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Upload button from document pop-up | ");
		    Thread.sleep(5000);
	      
		   /* //Select any one of the listed item
		    assertTextXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    clickByXpath("//div[4]/div/div/div[2]/div/div/table/tbody/tr/td[2]");
		    Reporter.log("Select any one of the listed item | ");
		    Thread.sleep(3000);
		    
		    //Select Delete button in Uploaded Document
		    assertTextXpath("//a[2]/span");
		    clickByXpath("//a[2]/span");
		    Reporter.log("Select Delete button in Uploaded Document | ");
		    Thread.sleep(5000);
		    
		    // Click on Cancel button in Deleted Pop-up
		    assertTextXpath("//div[6]/div/div/div[3]/button");
		    clickByXpath("//div[6]/div/div/div[3]/button");
		    Reporter.log("Click on Cancel button in Deleted Pop-up | ");
		    Thread.sleep(3000);*/
		    
		    // Click on Close button		  
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on CLose Button | ");
		    Thread.sleep(5000); 
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
		  Thread.sleep(5000);
		  //Thread.sleep(3000);
		  //Thread.sleep(3000);
		  
		 //Click on any other option response control in open Controls for negative scenario
		  assertTextXpath("//*[@id='2-control']/td[2]/table/tbody/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
		  clickByXpath("//*[@id='2-control']/td[2]/table/tbody/tr[1]/td[4]/cw-s-response-choices/div/div/label[1]");
		  Reporter.log("Click on any other option response control in open Controls | ");
		  Thread.sleep(5000);
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
	  }
 	 
 	 @Test(priority=16, enabled =true)
	  public void QuickFilterControlsGlobalMedia() throws InterruptedException, IOException {
 		 
 		Thread.sleep(2000); 
		//Thread.sleep(3000);
 		//Click on Control Type Filter drop-down
   	     clickByXpath("//*[@id='control-type']");
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");
   	     Thread.sleep(3000);
   	     Thread.sleep(5000);
   	     clickByXpath("//*[@id='control-type']");
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[3]/a");
   	     Thread.sleep(3000);
	     Thread.sleep(5000);
	     
     	//Click on New Or Updated Filter drop-down
   	     clickByXpath("//*[@id='view-filter']");
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[2]/a");
   	     Thread.sleep(3000);
   	     Thread.sleep(5000);   	     
   	     
      	// Click on Updated Control Advisory
		  assertTextXpath("//*[@id='container-body']/tr[7]/td[1]/cw-advisory/a/span");
		  clickByXpath("//*[@id='container-body']/tr[7]/td[1]/cw-advisory/a/span");
		  Reporter.log("Click on Updated Control Advisory | ");
		  Thread.sleep(3000);
		  Thread.sleep(3000);
		  
		  // Click checkbox for Change Reviewed
		  assertTextXpath("html/body/div[4]/div/div/div[3]/div/div/label");
		  clickByXpath("html/body/div[4]/div/div/div[3]/div/div/label");
		  Reporter.log("Click checkbox for Change Reviewed | ");
		  Thread.sleep(3000);
		  Thread.sleep(2000);
		  
		// Click on Save button
		  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
		  Reporter.log("Click on Save button | ");
		  Thread.sleep(5000);
		  Thread.sleep(2000);  	     
   	     
   	     //Click on New Or Updated Filter drop-down
   	     clickByXpath("//*[@id='view-filter']");
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
   	     Thread.sleep(5000);
	     Thread.sleep(3000);
 	 }
	  
 	 @Test(priority=17, enabled = true)
	  public void ControlsGlobalMediaFilter() throws InterruptedException {
		  
 		  Thread.sleep(3000);
	     // Thread.sleep(3000);
	      //Thread.sleep(3000);
	      //Thread.sleep(3000);		  
	      	            
	      // Click on Filter Button 
		  try {
			  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
			  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[1]/cw-filter/div/span[1]");
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
	    
		  //Click on Response drop-down
		  assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  clickByXpath("//div[4]/div/div/div/ul/li/input");
		  Reporter.log("Click on Respons drop-down ");
		  Thread.sleep(3000);
		  assertTextXpath("//div[4]/div/div/div/div/ul/li[2]");
		  clickByXpath("//div[4]/div/div/div/div/ul/li[2]");
		  Reporter.log("Select value of Response drop-down");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
	    
		  //Click on Media drop-down
		  assertTextXpath("//div[2]/div/div/ul/li/input");
		  clickByXpath("//div[2]/div/div/ul/li/input");
		  Reporter.log("Click on Media drop-down ");
		  Thread.sleep(3000);
		  assertTextXpath("//div[2]/div/div/div/ul/li");
		  clickByXpath("//div[2]/div/div/div/ul/li");
		  Reporter.log("Select value of Media drop-down");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
	    
		  //Click on Media/Label drop-down
		  assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  Reporter.log("Click on Media/label drop-down ");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
		  assertTextXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/ul/li[2]");
		  clickByXpath("html/body/div[4]/div/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/ul/li[2]");
		  Reporter.log("Select value of Media/label drop-down");
		  Thread.sleep(3000);
		  //Thread.sleep(3000);
	    
		  //Click on Assets drop-down
		  assertTextXpath("//div[3]/div[2]/div/div/ul/li/input");
		  clickByXpath("//div[3]/div[2]/div/div/ul/li/input");
		  Reporter.log("Click on Assets drop-down ");
		  Thread.sleep(3000);
		  assertTextXpath("//div[3]/div[2]/div/div/div/ul/li");
		  clickByXpath("//div[3]/div[2]/div/div/div/ul/li");
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
		       Thread.sleep(3000);
		       Thread.sleep(3000);
 	 }
 	 
 	@Test(priority=18, enabled =true)
    public void ExportControlsGlobalMedia() throws InterruptedException, IOException { 
 		
 		          Thread.sleep(3000);
		         
 		          //Click on Export Button
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  Reporter.log("Click on Export Button | ");
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  
				  //Click on Pdf 
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  Reporter.log("Click on Pdf | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  
				  //Click on Export Button
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  Reporter.log("Click on Export Button | ");
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  
				  //Click on CSV File
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  //Thread.sleep(3000);			  
				  
	  }
 	 
 	 
	  @Test(priority=19, enabled =true)
	  public void ControlReview() throws InterruptedException, IOException {
		  
		 Thread.sleep(3000); 
		 //Thread.sleep(5000);
	    // Thread.sleep(5000);
	       	       			 		             
		    //Click on Controls Review Page
	        assertTextLink("Controls Review");
		    clickBylinktext("Controls Review");
		    Reporter.log("Click on Controls Review Page | ");
		    Thread.sleep(5000);
		    Thread.sleep(2000);
		    Thread.sleep(3000);
		    //Thread.sleep(3000); 
			//Thread.sleep(3000);
			//Thread.sleep(3000);	
		    		    
		    //Click on Control Advisory
		    assertTextXpath("html/body/section/section/div[4]/div/div/div/div[2]/div[2]/div/div/table[2]/tbody/tr[2]/td[1]/cw-advisory[1]/a/span");
		    clickByXpath("html/body/section/section/div[4]/div/div/div/div[2]/div[2]/div/div/table[2]/tbody/tr[2]/td[1]/cw-advisory[1]/a/span");
		    Reporter.log("Click on Control Advisory | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click checkbox for Change Reviewed
			  assertTextXpath("html/body/div[4]/div/div/div[3]/div/div/label");
			  clickByXpath("html/body/div[4]/div/div/div[3]/div/div/label");
			  Reporter.log("Click checkbox for Change Reviewed | ");
			  Thread.sleep(3000);
			  Thread.sleep(2000);
			  
			// Click on Save button
			  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  Reporter.log("Click on Save button | ");
			  Thread.sleep(5000);
			  Thread.sleep(2000);
		    		    		
		    //1st
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[11]/div/a");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[11]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    Thread.sleep(2000);
		    //Thread.sleep(3000);
		   		    
		    //Click on ClearResponse for negative scenario
		    assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[9]/span/cw-s-response-clear/div/span/i");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[9]/span/cw-s-response-clear/div/span/i");
		    Reporter.log("Click on ClearResponse | ");
		    Thread.sleep(2000);
		    Thread.sleep(5000);
		    //Thread.sleep(5000);
		    
		    // Click on Remove button for negative scenario
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button[1]");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button[1]");
		    Reporter.log("Click on Remove button | ");
		    Thread.sleep(2000);
		    Thread.sleep(5000);		    
		    
		    // Click on Control Response again
		    assertTextXpath("//*[@id='rrReport']/tbody/tr[1]/td[8]/cw-s-response-choices/div/div/label[1]");
		    clickByXpath("//*[@id='rrReport']/tbody/tr[1]/td[8]/cw-s-response-choices/div/div/label[1]");
		    Reporter.log("Click on Control Response again| ");
		    Thread.sleep(3000);
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
	  
	  @Test(priority=20, enabled =true)
	  public void QuickFilterControlReview() throws InterruptedException, IOException {
 		 
		     Thread.sleep(2000);
		    //Thread.sleep(3000);
		    
		     //Click on Quick Colmn Selector Filter drop-down
	   	     clickByXpath("//*[@id='cr-column-set']");
	   	     Thread.sleep(3000);
	   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
	   	     Thread.sleep(5000);
		     Thread.sleep(5000);
		     //Thread.sleep(5000);
		  
 		    //Click on Control Type Filter drop-down
		     Thread.sleep(5000);
		     clickByXpath("//*[@id='control-type']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     //Thread.sleep(5000);
	     
		     //Click on Response Filter drop-down
		     Thread.sleep(5000);
		     clickByXpath("//*[@id='controls-answered']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[3]/div/ul/li[2]/a");
		     Thread.sleep(5000);
		     Thread.sleep(5000);    
		     //Thread.sleep(5000);
	     	     
		     //Click on New Or Updated Filter drop-down
		     Thread.sleep(5000);
		     clickByXpath("//*[@id='view-filter']");
		     Thread.sleep(3000);
		     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[4]/div/ul/li[1]/a");
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     Thread.sleep(5000);
		     //Thread.sleep(5000);
 	 }
	  
	  @Test(priority=21, enabled = true)
	  public void ControlsReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(2000);
		  		//Thread.sleep(3000);
		       
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
		  		Thread.sleep(2000);
		  		//Thread.sleep(3000);
	       
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		//Thread.sleep(3000);

		  		/*//Click on Thread Event drop-down
		  		assertTextXpath("//div[5]/div/div/div/ul/li/input");
		  		clickByXpath("//div[5]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Event Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[5]/div/div/div/div/ul/li");
		  		clickByXpath("//div[5]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Event Drop-down | ");
		  		Thread.sleep(3000);
		    
		  		// Click on Vulnerabilities drop-down
		  		assertTextXpath("//div[6]/div/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Vulnerabilities Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[6]/div/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Vulnerabilities Drop-down | ");
		  		Thread.sleep(3000);*/

		  		/*// Click on Controls drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Controls Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from Controls Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Control Response drop-down
		  		assertTextXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Control Response Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[4]/div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Control Response Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on NIST Family drop-down
		  		assertTextXpath("//div[6]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[6]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on NIST Family Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[6]/div[2]/div/div/div/ul/li");
		  		clickByXpath("//div[6]/div[2]/div/div/div/ul/li");
		  		Reporter.log("Select value from NIST Family Drop-down | ");
		  		Thread.sleep(3000);*/
		    
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
	  }
	  
	  @Test(priority=22, enabled = true)
	  public void ExportControlsReview() throws InterruptedException, IOException {
		  	
				 Thread.sleep(3000);
				  //Thread.sleep(2000);	
				  
				   //Click on Export Button
				   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				   Reporter.log("Click on Export Button | ");
				   Thread.sleep(5000);
				  // Thread.sleep(3000);
				  
				  //Click on Pdf 
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  Reporter.log("Click on Pdf | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				 // Thread.sleep(5000);
				  
				  //Click on Export Button
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  Reporter.log("Click on Export Button | ");
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  
				  //Click on CSV File
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  Thread.sleep(5000);
	  }
	  
	  @Test (priority=23, enabled = false)
		public void ControlsReviewSort() throws IOException, InterruptedException {
			
			//Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(3000);
						
			// Click on Media/label column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	  
			Thread.sleep(5000);	
			sortascen("//*[@id='content']/tr[*]/td[1]"); //Get the Column count and values
	    	Thread.sleep(5000);	
			Thread.sleep(5000);	
			Thread.sleep(5000);*/
						
			// Click on Media/label column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Media/label column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	
			Thread.sleep(5000);				
			sortdesc("//*[@id='content']/tr[*]/td[1]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
			
			// Click on Asset Name column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
			
			// Click on Asset Name column Header to sort for Ascending order
			assertTextXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]/span");
			clickByXpath("//*[@id='rrReport']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			Thread.sleep(5000);	
			/*Thread.sleep(5000);	
			sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);*/		
			
		}
	  
	  @Test(priority=24, enabled = true)
	  public void RatingReview() throws InterruptedException, IOException {
		  
		    Thread.sleep(2000);
		    //Thread.sleep(2000);
		    //Thread.sleep(3000);
		    //Thread.sleep(3000);        
	        	    
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		 /*  // Click on Asset Name column Header to sort for Ascending order
		   clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[1]/span[1]/span");
		   Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
		   Thread.sleep(3000);	
		   Thread.sleep(5000);	  
		   sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
		   Thread.sleep(5000);	
		   Thread.sleep(5000);	
		 			
		 	// Click on Asset Name column Header to sort for Ascending order
		 	clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[1]/span[1]/span");
		 	Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
		 	Thread.sleep(5000);	
		 	
		 	//Click on Scenario Advisory
		    assertTextXpath("//*[@id='content']/tr[1]/td[1]/cw-advisory/a/span");
		    clickByXpath("//*[@id='content']/tr[1]/td[1]/cw-advisory/a/span");
		    Reporter.log("Click on Scenario Advisory | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click checkbox for Change Reviewed
			  assertTextXpath("html/body/div[4]/div/div/div[3]/div/div/label");
			  clickByXpath("html/body/div[4]/div/div/div[3]/div/div/label");
			  Reporter.log("Click checkbox for Change Reviewed | ");
			  Thread.sleep(3000);
			  Thread.sleep(2000);
			  
			// Click on Save button
			  assertTextXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
			  Reporter.log("Click on Save button | ");
			  Thread.sleep(5000);
			  Thread.sleep(2000);*/		 	
		 	
		    //Click on Vulnerability link
		    assertTextXpath("//*[@id='content']/tr[1]/td[6]/div/a");
		    clickByXpath("//*[@id='content']/tr[1]/td[6]/div/a");
		    Reporter.log("Click on 1st Vulnerability link | ");
		    Thread.sleep(3000);
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on rating review sub-module
		    assertTextLink("Rating Review");
		    clickBylinktext("Rating Review");
		    Reporter.log("Click on rating review sub-module | ");
		    Thread.sleep(5000);
		    Thread.sleep(5000);
		    //Thread.sleep(3000);
		    
		 // Click on Leave Page 
   	        clickByXpath("html/body/div[4]/div/div/div[3]/button[2]");
   	        Thread.sleep(5000);
   	        Thread.sleep(3000);
   	       //Thread.sleep(3000); 
		    
		    //Click on ContextHelp Icon
		    assertTextXpath("html/body/section/section/div[4]/div/div[1]/div[2]/table/tbody/tr[2]/td[6]/span/span/i");
		    clickByXpath("html/body/section/section/div[4]/div/div[1]/div[2]/table/tbody/tr[2]/td[6]/span/span/i");
		    Reporter.log("Click on ContextHelp Icon | ");
		    Thread.sleep(5000);
		    
		    //Click on Close button in ContextHelp Pop-up
		    assertTextXpath("html/body/div[4]/div/div/div[3]/button");
		    clickByXpath("html/body/div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in ContextHelp Pop-up | ");
		    Thread.sleep(5000);
		    			    		   		    
		    //1st
		    //Click on Notes button to add text
		    assertTextXpath("//*[@id='content']/tr[1]/td[11]/div/a");
		    clickByXpath("//*[@id='content']/tr[1]/td[11]/div/a");
		    Reporter.log("Click on Notes button to add text | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on New button in Notes pop-up window
		    assertTextXpath("//div[2]/div/div/div/div/div/a/span");
		    clickByXpath("//div[2]/div/div/div/div/div/a/span");
		    Reporter.log("Click on New button in Notes pop-up window | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Enter Text for Note textarea
		    assertTextXpath("//textarea");
		    sendvaluebyxpath("//textarea", "created notes");
		    Reporter.log("Enter Text for Note textarea | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    // Click on Create Button
		    assertTextXpath("//div[4]/div[3]/button");
		    clickByXpath("//div[4]/div[3]/button");
		    Reporter.log("Click on Create Button | ");
		    Thread.sleep(3000);
		    //Thread.sleep(3000);
		    
		    //Click on Close button in popup
		    assertTextXpath("//div[4]/div/div/div[3]/button");
		    clickByXpath("//div[4]/div/div/div[3]/button");
		    Reporter.log("Click on Close button in popup | ");
		    Thread.sleep(5000);
		    //Thread.sleep(3000);
		    //Thread.sleep(3000);
		   
		    
	  }
	  
	  @Test(priority=25, enabled =true)
	  public void QuickFilterRatingReview() throws InterruptedException, IOException {
 		 
		  Thread.sleep(3000);
	     //Click on Risk Rating Filter drop-down
   	     clickByXpath("//*[@id='risk-rated']");
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[1]/a");
   	     Thread.sleep(5000);
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='risk-rated']");
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[1]/div/ul/li[2]/a");
   	     Thread.sleep(5000);
	     Thread.sleep(3000);
	     
	   //Click on My Risk Filter drop-down
   	     clickByXpath("//*[@id='my-risks']");
   	     Thread.sleep(3000);
   	     clickByXpath("//*[@id='cw-panelbar']/div/div[4]/cw-drop-list[2]/div/ul/li[1]/a");
   	     Thread.sleep(5000);
	     Thread.sleep(2000);    
	     	     
   	 }
	  
	  @Test(priority=26, enabled = true)
	  public void RatingReviewFilter() throws InterruptedException {
		  
		  		Thread.sleep(2000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
		  		//Thread.sleep(3000);
	       
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
		  		Thread.sleep(3000);
		  	    Thread.sleep(3000);   
		  		//Thread.sleep(3000); 
		  	
		  		//Click on Media Drop-down
		  		assertTextXpath("//div/ul/li/input");
		  		clickByXpath("//div/ul/li/input");
		  		Reporter.log("Click on Media Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media Drop-down | ");
		  		Thread.sleep(3000);

		  		//click on Media label drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul");
		  		Reporter.log("Click on Media label Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		clickByXpath("//div[2]/div[2]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Media label Drop-down | ");
		  		Thread.sleep(3000);

		  		//Click on Assets drop-down
		  		assertTextXpath("//div[3]/div/div/div/ul/li/input");
		  		clickByXpath("//div[3]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Asset Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[3]/div/div/div/div/ul/li");
		  		clickByXpath("//div[3]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Asset Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Thread Source drop-down
		  		assertTextXpath("//div[4]/div/div/div/ul/li/input");
		  		clickByXpath("//div[4]/div/div/div/ul/li/input");
		  		Reporter.log("Click on Thread Source Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[4]/div/div/div/div/ul/li");
		  		clickByXpath("//div[4]/div/div/div/div/ul/li");
		  		Reporter.log("Select value from Thread Source Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Risk Likelihood drop-down
		  		assertTextXpath("//div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Controls Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div/div/div/ul/li[5]");
		  		clickByXpath("//div[2]/div/div/div/ul/li[5]");
		  		Reporter.log("Select value from Controls Drop-down | ");
		  		Thread.sleep(3000);

		  		// Click on Risk Impact drop-down
		  		assertTextXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		clickByXpath("//div[2]/div[2]/div/div/ul/li/input");
		  		Reporter.log("Click on Control Response Drop-down | ");
		  		Thread.sleep(3000);
		  		assertTextXpath("//div[2]/div[2]/div/div/div/ul/li[6]");
		  		clickByXpath("//div[2]/div[2]/div/div/div/ul/li[6]");
		  		Reporter.log("Select value from Control Response Drop-down | ");
		  		Thread.sleep(3000);	  		
		    
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
		  		Thread.sleep(5000);
		  	   Thread.sleep(2000);   
		  		//Thread.sleep(3000); 
	  }
	  
	  @Test(priority=27, enabled = true)
	  public void ExportRatingReview() throws InterruptedException {
		  		
		  					  
				   //Click on Export Button
				   assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				   clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				   Reporter.log("Click on Export Button | ");
				   Thread.sleep(5000);
				  // Thread.sleep(3000);
				  
				  //Click on Pdf 
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[2]/a");
				  Reporter.log("Click on Pdf | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  //Thread.sleep(3000);
				  
				  //Click on Export Button
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/button");
				  Reporter.log("Click on Export Button | ");
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  
				  //Click on CSV File
				  assertTextXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  clickByXpath("//*[@id='cw-panelbar']/div/div[4]/ul/li[2]/div/ul/li[1]/a");
				  Reporter.log("Click on CSV File | ");
				  Thread.sleep(5000);
				  Thread.sleep(5000);
				  //Thread.sleep(3000);
				  //Thread.sleep(3000);
			  }
	  
	  @Test (priority=28, enabled = true)
		public void RatingReviewSort() throws IOException, InterruptedException {
			
		    Thread.sleep(3000);
		  
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			/*Thread.sleep(5000);	  
			sortascen("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
			
			// Click on Asset Name column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[2]/span[1]/span");
			Reporter.log("Click on Asset Name column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			//Thread.sleep(5000);	
			/*//sortdesc("//*[@id='content']/tr[*]/td[2]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);*/
			
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(3000);	
			/*sortascen("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);	*/
						
			// Click on Thread Source column Header to sort for Ascending order
			clickByXpath("//*[@id='rating_review']/thead/tr[1]/th[3]/span[1]/span");
			Reporter.log("Click on Thread Source column Header to sort for Ascending order  | ");
			Thread.sleep(5000);	
			/*sortdesc("//*[@id='content']/tr[*]/td[3]"); //Get the Column count and values
			sort("//*[@id='assets']/tbody/tr[1]/td[*]"); //Get the row count and values
			Thread.sleep(5000);	
			Thread.sleep(5000);*/
			
	}
	  }
	  