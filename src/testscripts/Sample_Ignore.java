package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample_Ignore {

	public static WebDriver driver; 
	public static WebDriverWait wait;
	public static WebElement element;
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 FunctionLib.AppLib.Login("PRAMADASU", "password99");
		 Thread.sleep(4000);	
		 FunctionLib.AppLib.Jobdata();
		 Thread.sleep(4000);
		  FunctionLib.AppLib.Emp_Search();
		  Thread.sleep(2000);
		  FunctionLib.AppLib.Add_Row();		 
		  Thread.sleep(3000);
		  FunctionLib.AppLib.Img_Home();	  
		  Thread.sleep(2000);
		  FunctionLib.AppLib.Signout();	
	
	}
}
