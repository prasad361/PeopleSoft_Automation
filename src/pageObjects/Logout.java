package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {

	private static WebElement element = null;	 

	//Click on Action list icon    
    public static WebElement Imgactionlist(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//span[contains(text(),'Actions List')]//following::img[1]"));
		return element;		
}      
    
	//Click on Sign out button     
    public static WebElement Btn_Signout(WebDriver driver) {		
		
		element = driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
		return element;		
} 
	
}
