package ImplicitWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitPractice {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");

	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");

	        WebElement btn = driver.findElement(By.linkText("Create new account"));
	        btn.click();

	        // Fluent Wait Implementation
	        Wait<WebDriver> wait = new FluentWait<>(driver)
	                .withTimeout(Duration.ofSeconds(20))  // Max wait time
	                .pollingEvery(Duration.ofSeconds(5))  // Polling interval
	                .ignoring(NoSuchElementException.class);  // Ignore exceptions

	        // Waiting for an element (e.g., First Name field) to appear
	        wait.until(new Function<WebDriver, WebElement>() {   //In Selenium FluentWait, wait.until() expects a condition (a function) that it will keep checking until the condition is met or the timeout expires.
	            public WebElement apply(WebDriver driver) {
	            	return driver.findElement(By.name("firstname"));
	               
	            }

	    });
	        
	        driver.findElement(By.name("firstname")).sendKeys("azka");
	    	driver.findElement(By.name("lastname")).sendKeys("A");
	    	}

	}