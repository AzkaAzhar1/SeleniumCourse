package TestNGFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AssertnotEqual {

	public void RestaurantLogin() {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://buyyer.co.uk/");
			
			driver.findElement(By.linkText("Sign In")).click();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.name("email")).sendKeys("buyer@sm.com");
			driver.findElement(By.name("password")).sendKeys("user123");
			
			driver.findElement(By.className("btn-primary")).click();
			
			//Assertions
	
			String actualurl = driver.getCurrentUrl();
			String expectedurl = "https://buyyer.co.uk";
			
			Assert.assertNotEquals(actualurl, expectedurl);
			
		}
		
	
	
}
