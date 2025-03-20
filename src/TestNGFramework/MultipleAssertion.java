package TestNGFramework;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MultipleAssertion {

	public void login() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
	
	driver.findElement(By.xpath("//a[contains(@class, 'oxd-main-menu-item') and span[text()='Leave']]")).click();
	
		
	List<WebElement> selectedOptions = driver.findElements(By.xpath("//div[contains(@class, 'oxd-multiselect-wrapper')]//span[contains(text(), 'Pending Approval')]"));
		boolean isPendingApprovalSelected = selectedOptions.stream()
	                .anyMatch(option -> option.getText().trim().equals("Pending Approval"));
		
	    // Assertion
	    Assert.assertTrue(isPendingApprovalSelected, "Pending Approval is NOT selected!");

	//Check if search button is enabled
	    
boolean searchbtn =	   driver.findElement(By.xpath("//button[contains(text(), 'Search')]")).isEnabled();

//Assertion
	Assert.assertTrue(searchbtn);
	}
}
