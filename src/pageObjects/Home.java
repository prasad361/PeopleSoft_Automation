package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Home {

	private static WebElement element = null;	 

	// Click on navigation bar  
		
	public static WebElement Navigationbar(WebDriver driver) {		
								
			//element = driver.findElement(By.xpath("//img[@alt=\"NavBar\"]"));		
			element = driver.findElement(By.xpath("//img[@name=\"PT_NAVBAR$IMG\"]"));			
			return element;
	}
	
	//click on My favorite 
	public static WebElement MenuMyfav(WebDriver driver) {

		//element = driver.findElement(By.xpath("//div[@id='PTNB$PTNUI_NB_FAV']//following::img[@id='PTNUI_FAV_ICN$1']"));
		//element = driver.findElement(By.xpath("//div[@id=\"PTNB$PTNUI_NB_FAV\"]"));
		
		driver.switchTo().frame("psNavBarIFrame");
		element = driver.findElement(By.xpath("//img[@id='PTNUI_FAV_ICN$1']"));				
		return element;	
}
	
	//click on job data menu 
	public static WebElement MenuJobdata(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//a[contains(text(),'Job Data')]"));
		return element;	
}	
	
	//Enter the employee id  
	public static WebElement txt_Empid(WebDriver driver) {	
		
		driver.switchTo().frame("ptifrmtgtframe");		
		element = driver.findElement(By.xpath("//label[contains(text(),'Empl ID')]//following::input[@id='EMPLMT_SRCH_COR_EMPLID']"));
		return element;		
	}
	//click on search button 
	public static WebElement Btn_Search(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//input[@type='button' and @value='Search']"));
		return element;	
}
	
	/////// work location tab 
	
	//click + icon 
	
    public static WebElement Addrow(WebDriver driver) {	     	
		
		element = driver.findElement(By.xpath("//a[contains(@title,'Add a new row at row 1 (Alt+7)')]"));
		return element;		
}       
    
    // Select effective date and enter a value      
    
    public static WebElement Effectivedate(WebDriver driver) {	
    	
  		element = driver.findElement(By.xpath("//input[@id='JOB_EFFDT$0']"));
    	//WebElement element  =driver.findElement(By.xpath("//input[@id='JOB_EFFDT$0']"));
    	//JavascriptExecutor executor = (JavascriptExecutor)driver;
    	//executor.executeScript("Test.click();", element);
  		//element = driver.findElement(By.xpath("//label[contains(text(),'Effective Date')]// preceding::input[@id='JOB_EFFDT$0']"));
  		return element;	
  	
  }     
    
        
    
    
    //click on action drop down 
	
    public static WebElement Drop_Action(WebDriver driver) {	
    			
		element = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
		return element;	
    }
    //}
		
		

	    //Select a Reason dropdown text 
		
	   public static WebElement Drop_Reason(WebDriver driver) {			   
		   	    		 
	    element = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id='JOB_ACTION_REASON$0']"));
	 		return element;		
	 }   
	 
//click on action drop down and select the value  Termination  
	   
//click on Reason drop down and select the value I-Contract Not Renewed
		
	    public static WebElement ActionValue_Termination(WebDriver driver) {	    	
	    
	    	WebElement Drop_Action  = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
			Select Action=new Select (Drop_Action);
			Action.selectByVisibleText("Termination");
					
	    	return element;		
	    }    	
		
	    public static WebElement ReasonValue_Termination(WebDriver driver) {	   	
	    		
			WebElement Drop_Reason  = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id='JOB_ACTION_REASON$0']"));
			Select Reason=new Select (Drop_Reason);
			Reason.selectByVisibleText("I-Contract Not Renewed");	
			
	    	return element;		
	    }	
  
	//click on action drop down and select the value  Leave of Absence 
	    
	 //click on Reason drop down and select the value  Family and Medical Leave Act
		
	    public static WebElement ActionValue_LeaveAbsence(WebDriver driver) {	    	
	    
	    	WebElement Drop_Action1  = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
			Select Action1=new Select (Drop_Action1);
			Action1.selectByVisibleText("Leave of Absence");								
	    	return element;		
	    }	
	  		
	    public static WebElement ReasonValue_LeaveofAbsence(WebDriver driver) {	    	
	    
	    	WebElement Drop_Reason1  = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id='JOB_ACTION_REASON$0']"));
			Select Reason1=new Select (Drop_Reason1);
			Reason1.selectByVisibleText("Family and Medical Leave Act");									
	    	return element;		
	    }	
	
//click on action drop down and select the value  Paid Leave of Absence
	    
//click on Reason drop down and select the value  Active Military Duty - Paid
		
	    public static WebElement ActionValue_PaidLeaveAbsence(WebDriver driver) {	    	
	    
	    	WebElement Drop_Action2  = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
			Select Action2=new Select (Drop_Action2);
			Action2.selectByVisibleText("Paid Leave of Absence");								
	    	return element;		
	    }	
	  		
	    public static WebElement ReasonValue_PaidLeaveofAbsence(WebDriver driver) {	    	
	    
	    	WebElement Drop_Reason2  = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id='JOB_ACTION_REASON$0']"));
			Select Reason2=new Select (Drop_Reason2);
			Reason2.selectByVisibleText("Active Military Duty - Paid");									
	    	return element;		
	    }	  
	    
	  //click on action drop down and select the value  Short Term Disability with Pay
	    
	  //click on Reason drop down and select the value  Short Term Disability with Pay
	  		
	  	    public static WebElement ActionValue_ShortTermDisability(WebDriver driver) {	    	
	  	    
	  	    	WebElement Drop_Action3  = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
	  			Select Action3=new Select (Drop_Action3);
	  			Action3.selectByVisibleText("Short Term Disability with Pay");								
	  	    	return element;		
	  	    }	
	  	  		
	  	    public static WebElement ReasonValue_ShortTermDisability(WebDriver driver) {	    	
	  	    
	  	    	WebElement Drop_Reason3  = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id='JOB_ACTION_REASON$0']"));
	  			Select Reason3=new Select (Drop_Reason3);
	  			Reason3.selectByVisibleText("Short Term Disability With Pay");									
	  	    	return element;		
	  	    }		    
	
	  	    
	  	  //click on action drop down and select the value  "Data change"
		    
	  	  //click on Reason drop down and select the value  "Change job code"
	  	  		
	  	  	    public static WebElement ActionValue_Datachange(WebDriver driver) {	    	
	  	  	    
	  	  	    	WebElement Drop_Action4  = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
	  	  			Select Action4=new Select (Drop_Action4);
	  	  			Action4.selectByVisibleText("Data Change");								
	  	  	    	return element;		
	  	  	    }	
	  	  	  		
	  	  	    public static WebElement ReasonValue_Datachang(WebDriver driver) {	    	
	  	  	    
	  	  	    	WebElement Drop_Reason4  = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id='JOB_ACTION_REASON$0']"));
	  	  			Select Reason4=new Select (Drop_Reason4);
	  	  			Reason4.selectByVisibleText("Change-Job Code");									
	  	  	    	return element;		
	  	  	    }    
	  	    
	 
	  	 //click on action drop down and select the value  "Family Status Change"
		   
	  	  //click on Reason drop down and select the value  "Change job code"
	  	  	  		
	  	  	  	    public static WebElement ActionValue_FamilyChange(WebDriver driver) {	    	
	  	  	  	    
	  	  	  	    	WebElement Drop_Action5  = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
	  	  	  			Select Action5=new Select (Drop_Action5);
	  	  	  			Action5.selectByVisibleText("Family Status Change");								
	  	  	  	    	return element;		
	  	  	  	    }	
	  	  	  	  		
	  	  	  	    public static WebElement ReasonValue_FamilyChange(WebDriver driver) {	    	
	  	  	  	    
	  	  	  	    	WebElement Drop_Reason5  = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id='JOB_ACTION_REASON$0']"));
	  	  	  			Select Reason5=new Select (Drop_Reason5);
	  	  	  			Reason5.selectByVisibleText("Birth/Newly Eligible Child");									
	  	  	  	    	return element;		
	  	  	  	    }    
	  	  	    	  	    
	  	  	    
	  	  	    
	  	  	    
	  	  	    
	      
  //Click on Save button  
		
	    public static WebElement Btn_Save(WebDriver driver) {	
	    //((JavascriptExecutor) driver).executeScript("scroll(0,350);");	    	
			element = driver.findElement(By.xpath("//input[@id='#ICSave']"));
			return element;	    
		    
	    }
	 
//click on Work Location tab  	    
 
		
	    public static WebElement WorkInfo(WebDriver driver) {	
	    	    	
			element = driver.findElement(By.xpath("//span[(text()='ork Location')]"));
			return element;	    
		    
	    }    
	    
  //Click on Job information  tab
		
	    public static WebElement Jobinfo(WebDriver driver) {	
	   	    	
			element = driver.findElement(By.xpath("//span[contains(text(),'Information')]"));
			return element;	    
		    
	    }	    
		    
	
	//Select "Job code' filed 
	    
	    public static WebElement Txt_Jobcode(WebDriver driver) {	
   	    	
			element = driver.findElement(By.xpath("//input[@id='JOB_JOBCODE$0']"));
			return element;	    
		    
	    }
	    
   //Select "Supervisor ID" filed 
	    
	    public static WebElement Txt_SupervisorId(WebDriver driver) {	
   	    	
			element = driver.findElement(By.xpath("//input[@id='JOB_SUPERVISOR_ID$0']"));
			return element;	    
		    
	    }
	    
	    
	    
	 //Get HR status    
	    
	    public static WebElement HR_Status(WebDriver driver) {			    	 
	    	
			WebElement HRStatus = driver.findElement(By.xpath("//span[@id='JOB_HR_STATUS$0']"));
			HRStatus.getText();
				System.out.println("HR status :"  + HRStatus);
				return element;	   
			    
		    }
	    
	    //Get Payroll status     
	    
  public static WebElement Payroll_Status(WebDriver driver) {			    	 
	    	
			WebElement PayrollStatus = driver.findElement(By.xpath("//span[@id='JOB_EMPL_STATUS$0']"));
			PayrollStatus.getText();
			System.out.println("HR status :"  + PayrollStatus);	
			
			//System.out.println("Payroll status :"  + PayrollStatus.getText());
				return element;	   
			    
		    }
	    
	    
	    
	    
	    
	    
	//Select a value termination from the dropdown 
	
   // public static WebElement Termination(WebDriver driver) {		
		
		//element = driver.findElement(By.xpath("//select[@id='JOB_ACTION$0']//following::option[contains(text(),'Termination')]"));
		//return element;		
//}  
    
     
	//Select a value as "I-Contract Not Renewed" from the dropdown 
	
    //public static WebElement Notrenewed(WebDriver driver) {		
		
		//element = driver.findElement(By.xpath("//select[@id=\"JOB_ACTION_REASON$0\"] //following::option[contains(text(),'I-Contract Not Renewed')]"));
		//return element;		
//}     
		

    
	//Click on Home img icon   
    
    public static WebElement ImgHome(WebDriver driver) {		
    	driver.switchTo().defaultContent();
		element = driver.findElement(By.xpath("//a[@id='pthdr2home']"));
		return element;		
}    
    
    
}
