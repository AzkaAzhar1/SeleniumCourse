package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement email = driver.findElement(By.id("email"));
		
	Actions action = new Actions(driver); //actions class constructor will accept the webdriver object
	
	action.contextClick(email).build().perform();
	}

}
