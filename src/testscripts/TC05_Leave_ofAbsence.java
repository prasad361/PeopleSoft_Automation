package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC05_Leave_ofAbsence {

	public static WebDriver driver; 
	public static WebDriverWait wait;
	public static WebElement element;
	
	public static void main(String[] args) throws Throwable {
		 //FunctionLib.AppLib.Login("CPOLUKONDA", "password99"); // For QRAC	
		 //FunctionLib.AppLib.Login("PRAMADASU", "password99");// For QA1
		 //FunctionLib.AppLib.Login("SROUT", "password99"); // For QA2
		  FunctionLib.AppLib.Login("PGATHALA", "password99"); // For QA3
	 Thread.sleep(4000);	
	 FunctionLib.AppLib.Jobdata();
	 Thread.sleep(4000);
	  FunctionLib.AppLib.Emp_Search();////00567025
	  Thread.sleep(2000);
	  FunctionLib.AppLib.LeaveOfAbsence();	//For Leave of Absence	 
	  Thread.sleep(3000);
	  //FunctionLib.AppLib.Img_Home();	  
	  Thread.sleep(2000);
	  //FunctionLib.AppLib.Signout();	
	}

	
}
