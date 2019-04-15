package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    
    //click on action drop down 
	
    public static WebElement Drop_Action(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//label[contains(text(),'Action')]//following::select[@id='JOB_ACTION$0']"));
		return element;	
	
} 
  
	//Select a value termination from the dropdown 
	
    public static WebElement Termination(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//select[@id='JOB_ACTION$0']//following::option[contains(text(),'Termination')]"));
		return element;		
}  
    
	//Select a Reason dropdown text 
	
    public static WebElement Drop_Reason(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//label[contains(text(),'Reason')]//following::select[@id=\"JOB_ACTION_REASON$0\"] "));
		return element;		
}      
	//Select a value as "I-Contract Not Renewed" from the dropdown 
	
    public static WebElement Notrenewed(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//select[@id=\"JOB_ACTION_REASON$0\"] //following::option[contains(text(),'I-Contract Not Renewed')]"));
		return element;		
}     
	//Click on Save button  
	
    public static WebElement Btn_Save(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//input[@id=\"#ICSave\"]"));
		return element;		
} 
    
	//Click on Home img icon   
    
    public static WebElement ImgHome(WebDriver driver) {		
    	driver.switchTo().defaultContent();
		element = driver.findElement(By.xpath("//a[@id='pthdr2home']"));
		return element;		
}    
    
    
}
