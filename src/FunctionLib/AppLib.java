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
	public static String QRACurl = "https://qa-resources.coxinc.com/psp/cehqrac/?cmd=login";
	public static String QA1url = "https://qa1-resources.coxinc.com/psp/CEH92QA1/?cmd=login";
	public static String QA2url = "https://qadev92-resources.coxinc.com/psp/CEH92QA2/?cmd=login&languageCd=ENG&";
	public static String QA3url = "https://qa3-resources.coxinc.com/psp/CEH92QA3/?cmd=login&languageCd=ENG&";
	public static String empid = "00599020";
	
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
		
		//driver.get(QRACurl);
		//driver.get(QA1url);
		//driver.get(QA2url);
		driver.get(QA3url);
		Login.txt_Userid(driver).sendKeys(emplid);
		Login.txt_Pwd(driver).sendKeys(Pwd);
		Login.Btn_Signin(driver).click();
		//Login_Page.txt_Pwd(driver).sendKeys(Pwd, Keys.ENTER);
		//wait.until(ExpectedConditions.elementToBeClickable(Login_Page.btn_SignIn(driver)));
		//Login_Page.btn_SignIn(driver).click();
		
		System.out.println("Login successful");		
		}	
	
	// Navigate to job data	
	
	// 1) Click on navigation bar 2) select favorites 3) click Job data
		public static void Jobdata() throws InterruptedException
				{
					//Home_Page.lnk_MyDeskDbd(driver).wait(5000);
					Home.Navigationbar(driver).click();
					Thread.sleep(3000);					
					Home.MenuMyfav(driver).click();  
				    Thread.sleep(2000);			   
					Home.MenuJobdata(driver).click();
					Thread.sleep(2000);
				}
		// Emp search
	 //1) enter the empl data 2)  hit search button 	
	
			//public static void Emp_Search() throws InterruptedException
			public static void Emp_Search() throws InterruptedException
			{
									
				Home.txt_Empid(driver).sendKeys(empid);
				Thread.sleep(2000);
				Home.Btn_Search(driver).click();
				Thread.sleep(5000);								
			}			
			
				
		//Termination flow  	  
		
	public static void HRTermination() throws InterruptedException
			{
		Home.Addrow(driver).click();
		Thread.sleep(8000);	
		//Home.Effectivedate(driver).click();
		//Home.Effectivedate(driver).clear();
		//System.out.println("Clicked on Effective date filed");
		//Home.Effectivedate(driver).sendKeys("05/11/2019");		
		Home.Drop_Action(driver).click();
		Thread.sleep(5000);
		Home.ActionValue_Termination(driver).getText();			
		Thread.sleep(5000);
		Home.Drop_Reason(driver).click();
		Thread.sleep(5000);
		Home.ReasonValue_Termination(driver).getText();	
		Thread.sleep(5000);			
		Home.Btn_Save(driver).click();
		Thread.sleep(9000);				
		String HRstatus= driver.findElement(By.xpath("//span[@id='JOB_HR_STATUS$0']")).getText();
		System.out.println("HR status :"  + HRstatus);
		Thread.sleep(6000);
		 String PayrollStatus=driver.findElement(By.xpath("//span[@id='JOB_EMPL_STATUS$0']")).getText();
		 System.out.println("Payroll Status : " +PayrollStatus);		
		}		
		
	// Leave of absence   
	
	public static void LeaveOfAbsence() throws InterruptedException
	{					
		Home.Addrow(driver).click();
		Thread.sleep(6000);	
		Home.Drop_Action(driver).click();
		Thread.sleep(5000);
		Home.ActionValue_LeaveAbsence(driver).getText();
		Thread.sleep(5000);
		Home.Drop_Reason(driver).click();
		Thread.sleep(5000);
		Home.ReasonValue_LeaveofAbsence(driver).getText();		
		Thread.sleep(5000);			
		Home.Btn_Save(driver).click();
		Thread.sleep(9000);				
		String HRstatus= driver.findElement(By.xpath("//span[@id='JOB_HR_STATUS$0']")).getText();
		System.out.println("HR status :"  + HRstatus);
		Thread.sleep(6000);
		 String PayrollStatus=driver.findElement(By.xpath("//span[@id='JOB_EMPL_STATUS$0']")).getText();
		 System.out.println("Payroll Status : " +PayrollStatus);		
		}		
	
	// paid leave of Absence 	
	
	public static void PaidLeaveOfAbsence() throws InterruptedException
	{					
		Home.Addrow(driver).click();
		Thread.sleep(6000);	
		Home.Drop_Action(driver).click();
		Thread.sleep(5000);
		Home.ActionValue_PaidLeaveAbsence(driver).getText();
		Thread.sleep(5000);
		Home.Drop_Reason(driver).click();
		Thread.sleep(5000);
		Home.ReasonValue_PaidLeaveofAbsence(driver).getText();		
		Thread.sleep(5000);			
		Home.Btn_Save(driver).click();
		Thread.sleep(9000);				
		String HRstatus= driver.findElement(By.xpath("//span[@id='JOB_HR_STATUS$0']")).getText();
		System.out.println("HR status :"  + HRstatus);
		Thread.sleep(6000);
		 String PayrollStatus=driver.findElement(By.xpath("//span[@id='JOB_EMPL_STATUS$0']")).getText();
		 System.out.println("Payroll Status : " +PayrollStatus);		
		}
	
	
	//Short term disability
	
	public static void ShortTermDisability() throws InterruptedException
	{					
		Home.Addrow(driver).click();
		Thread.sleep(6000);	
		Home.Drop_Action(driver).click();
		Thread.sleep(5000);
		Home.ActionValue_ShortTermDisability(driver).getText();
		Thread.sleep(5000);
		Home.Drop_Reason(driver).click();
		Thread.sleep(5000);
		Home.ReasonValue_ShortTermDisability(driver).getText();		
		Thread.sleep(5000);			
		Home.Btn_Save(driver).click();
		Thread.sleep(9000);				
		String HRstatus= driver.findElement(By.xpath("//span[@id='JOB_HR_STATUS$0']")).getText();
		System.out.println("HR status :"  + HRstatus);
		Thread.sleep(6000);
		 String PayrollStatus=driver.findElement(By.xpath("//span[@id='JOB_EMPL_STATUS$0']")).getText();
		 System.out.println("Payroll Status : " +PayrollStatus);		
		}
	
	//data change 
	
	public static void DataChange() throws InterruptedException
	{					
		Home.Addrow(driver).click();
		Thread.sleep(6000);	
		Home.Drop_Action(driver).click();
		Thread.sleep(8000);
		Home.ActionValue_Datachange(driver).getText();
		Thread.sleep(8000);
		Home.Drop_Reason(driver).click();
		Thread.sleep(8000);
		Home.ReasonValue_Datachang(driver).getText();		
		Thread.sleep(8000);	
		//Home.Jobinfo(driver).click();
		//Thread.sleep(3000);
		//Home.Txt_Jobcode(driver).clear();
		//Home.Txt_Jobcode(driver).sendKeys("TEC301");
		//Thread.sleep(3000);
		//Home.Txt_SupervisorId(driver).clear();
		//Home.Txt_SupervisorId(driver).sendKeys("00281042");
		//Thread.sleep(3000);					
		Home.Btn_Save(driver).click();
		Thread.sleep(6000);	
		//click on "OK" button 
		//driver.findElement(By.xpath("//input[@title='Ok (Enter)']")).click();
		Thread.sleep(8000);
		String HRstatus= driver.findElement(By.xpath("//span[@id='JOB_HR_STATUS$0']")).getText();
		System.out.println("HR status :"  + HRstatus);
		Thread.sleep(6000);
		 String PayrollStatus=driver.findElement(By.xpath("//span[@id='JOB_EMPL_STATUS$0']")).getText();
		 System.out.println("Payroll Status : " +PayrollStatus);		
		}	
	
	
	//TC012:Family status Change 
	
	public static void FamilyStatus() throws InterruptedException
	{					
		Home.Addrow(driver).click();
		Thread.sleep(12000);	
		Home.Drop_Action(driver).click();
		Thread.sleep(8000);
		Home.ActionValue_FamilyChange(driver).getText();
		Thread.sleep(20000);
		Home.Drop_Reason(driver).click();
		Thread.sleep(8000);
		Home.ReasonValue_FamilyChange(driver).getText();		
		Thread.sleep(20000);			
		Home.Btn_Save(driver).click();
		Thread.sleep(15000);				
		String HRstatus= driver.findElement(By.xpath("//span[@id='JOB_HR_STATUS$0']")).getText();
		System.out.println("HR status :"  + HRstatus);
		Thread.sleep(10000);
		 String PayrollStatus=driver.findElement(By.xpath("//span[@id='JOB_EMPL_STATUS$0']")).getText();
		 System.out.println("Payroll Status : " +PayrollStatus);		
		}
	
	
	// TC03:terminate the employee 
	
			public static void TerminateEmp() throws InterruptedException
			{
				Home.Addrow(driver).click();
				Thread.sleep(3000);
				//Home.Drop_Action(driver).click();
				Thread.sleep(2000);
				//Home.Termination(driver).click();
				Thread.sleep(2000);
				//Home.Drop_Reason(driver).click();
				Thread.sleep(2000);
				//Home.Notrenewed(driver).click();
				Thread.sleep(2000);
				Home.Btn_Save(driver).click();
				Thread.sleep(5000);
				
			}
	
	// Click Work location tab
			
			public static void Click_Worklocation() throws InterruptedException
			{					
			Home.WorkInfo(driver).click();
				
			}		
				
	// Click Job information tab
			
			public static void Click_Jobinformation() throws InterruptedException
			{					
			Home.Jobinfo(driver).click();
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