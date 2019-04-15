package FunctionLib;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Configuration.ReadConfig;
import pageObjects.*;

public class AppLib {
	
	public static WebDriver driver;
	public static WebDriverWait wait;	
	public static String browser = "chrome";
	public static String url = "https://qa1-resources.coxinc.com/psp/CEH92QA1/?cmd=login";
	public static String empid = "00505047";
	/*
	 * public static String devgoal = "DevGoal_4/9 - 3:40"; public static String
	 * enddate = "12/31/19"; public static String description =
	 * "Make Selenium Automation a big success"; public static String
	 * updated_Devgoalname = devgoal + "_updated"; public static String perfgoal =
	 * "PerfGoal_4/10 - 3:40"; public static String updated_Perfgoalname = perfgoal
	 * + "_updated";
	 */
	
	//test for working with branches
	
	public static void Login(String emplid, String Pwd) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub

		//driver = new InternetExplorerDriver();
		//Get url and browser type from Config file
		//String url = ReadConfig.GetData("url");
		//System.setProperty("webdriver.chrome.driver", "D:\\prasad ramdasu\\COX_PROJECT\\COX_Automation\\selinium\\Selenium_Chrome\\chromedriver.exe");
		
	  if (browser.equalsIgnoreCase("IE")) 
		  driver = new InternetExplorerDriver();
	  else if (browser.equalsIgnoreCase("CHROME")) 
		  driver = new ChromeDriver();
	   else if (browser.equalsIgnoreCase("FIREFOX"))
		driver = new FirefoxDriver();
	 
		driver.manage().window().maximize();
		
		driver.get(url);
		Login.txt_Userid(driver).sendKeys(emplid);
		Login.txt_Pwd(driver).sendKeys(Pwd);
		Login.Btn_Signin(driver).click();
		//Login_Page.txt_Pwd(driver).sendKeys(Pwd, Keys.ENTER);
		//wait.until(ExpectedConditions.elementToBeClickable(Login_Page.btn_SignIn(driver)));
		//Login_Page.btn_SignIn(driver).click();
		
		System.out.println("Login successful");		
		
	}
	
		// Emp search
	// 1) Click on navigation bar 2) select favorits 3) click Job data 4) enter the empl data 5)  hit search button 
	
	
			//public static void Emp_Search() throws InterruptedException
			public static void Emp_Search() throws InterruptedException
			{
				//Home_Page.lnk_MyDeskDbd(driver).wait(5000);
				Home.Navigationbar(driver).click();
				Thread.sleep(3000);					
				Home.MenuMyfav(driver).click();  
			    Thread.sleep(2000);			   
				Home.MenuJobdata(driver).click();
				Thread.sleep(3000);					
				Home.txt_Empid(driver).sendKeys(empid);
				Thread.sleep(2000);
				Home.Btn_Search(driver).click();
				Thread.sleep(5000);
								
			}
	
	// terminate the employee 
	
			public static void TerminateEmp() throws InterruptedException
			{
				Home.Addrow(driver).click();
				Thread.sleep(3000);
				Home.Drop_Action(driver).click();
				Thread.sleep(2000);
				Home.Termination(driver).click();
				Thread.sleep(2000);
				Home.Drop_Reason(driver).click();
				Thread.sleep(2000);
				Home.Notrenewed(driver).click();
				Thread.sleep(2000);
				Home.Btn_Save(driver).click();
				Thread.sleep(5000);
				
			}
	
	// Click Home icon to navigate to home page  
			
					public static void Img_Home() throws InterruptedException
					{					
					Home.ImgHome(driver).click();
						
					}
	
	// Logout  ( click on Action list icon, click signout and close the browser 
					
					public static void Signout() throws InterruptedException
					{
					Logout.Imgactionlist(driver).click();
					Thread.sleep(3000);
					Logout.Btn_Signout(driver).click();
					Thread.sleep(3000);
					driver.close();
						
					}
	
}