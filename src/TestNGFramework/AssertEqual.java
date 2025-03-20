package TestNGFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqual {

	@Test
	public class FirstTestCase {

		public void LoginRestaurant() {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("https://buyyer.co.uk/");
			
			driver.findElement(By.linkText("Sign In")).click();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.name("email")).sendKeys("buyer@sm.com");
			driver.findElement(By.name("password")).sendKeys("user123");
			
			driver.findElement(By.className("btn-primary")).click();
			
			//Assertions
			//actual and expected values should be same.
	
			String actualurl = driver.getCurrentUrl();
			String expectedurl = "https://buyyer.co.uk/dashboard";
			
			Assert.assertEquals(actualurl, expectedurl);
		}
	
}
}
