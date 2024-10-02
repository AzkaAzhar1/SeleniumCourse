package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveMouse {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	// Move mouse over Account & List link
	WebElement AccountandList = driver.findElement(By.id("nav-link-accountList"));
	
	Actions action = new Actions(driver);
	
	action.moveToElement(AccountandList).build().perform();
	
	Thread.sleep(5000);
	
	WebElement yourOrderLink = driver.findElement(By.xpath("//span[text()='Your Orders']/parent::a"));

	action.click(yourOrderLink).build().perform();
	
	// Enter email id

			WebElement emailIdTextBox = driver.findElement(By.id("ap_email"));

			action.sendKeys(emailIdTextBox, "test@gmail.com").build().perform();
	
	}

}
