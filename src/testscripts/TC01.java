package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC01 {

	public static WebDriver driver; 
	public static WebDriverWait wait;
	public static WebElement element;
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 FunctionLib.AppLib.Login("PRAMADASU", "password99");
		 Thread.sleep(4000);		  
		  FunctionLib.AppLib.Emp_Search();
		  Thread.sleep(2000);
		  FunctionLib.AppLib.TerminateEmp();
		  Thread.sleep(3000);
		  FunctionLib.AppLib.Img_Home();	  
		  Thread.sleep(2000);
		  FunctionLib.AppLib.Signout();		  
		 
	}
}
