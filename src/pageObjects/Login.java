package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	 // TODO Auto-generated method stub

		private static WebElement element = null;	 

		// Enter user name at username filed  
			
		public static WebElement txt_Userid(WebDriver driver) {		
									
				element = driver.findElement(By.xpath("//input[@id=\"userid\"]"));
				return element;	
		}
				
		// Enter Password at password  filed  
		
		public static WebElement txt_Pwd(WebDriver driver) {		
											
				element = driver.findElement(By.xpath("//input[@id=\"pwd\"]"));
				return element;				
		}
				
       // Click Sign button  
				
				public static WebElement Btn_Signin(WebDriver driver) {
					
				element = driver.findElement(By.xpath("//input[@value='Sign In']"));
				return element;						
		
		}
				
	}


