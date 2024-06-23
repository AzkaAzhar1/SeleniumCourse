package MultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleTabsHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		// Open browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// open application
		driver.get("https://www.bankalfalah.com/");
		//identify element
		driver.findElement(By.linkText("Bank Alfalah Rapid")).click();
		

		// get the window id of 1st tab. 
	String firstwindowID =	driver.getWindowHandle();
	System.out.println("First tab window id is :"+ firstwindowID);
	
	// 2nd tab
	WebElement internetbanking = driver.findElement(By.linkText("Internet Banking"));
	internetbanking.click();

	WebElement login = driver.findElement(By.linkText("Login"));
	login.click();
 
		
	}

}
