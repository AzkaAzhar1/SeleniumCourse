package javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JS {

    public static void main(String[] args) {

        // Set the path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        
        // Open browser
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        // Open Application
        driver.get("https://resturant.businessholics.com/login");

        // Explicit wait to ensure element is present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Enter user name
        WebElement email = driver.findElement(By.id("email"));
        JavascriptExecutor js = (JavascriptExecutor) driver; // Convert WebDriver to JavascriptExecutor
        
        js.executeScript("arguments[0].value='admin@sm.com'", email);
        
        // Enter password using Javascript
        js.executeScript("document.getElementsByName('password')[0].value='admin123'");
        
        // Click on login button
        WebElement loginbutton = driver.findElement(By.className("btn"));
        js.executeScript("arguments[0].click()", loginbutton);
        
         // get title

     	String title = js.executeScript("return document.title").toString();
        
     	System.out.println("Title of page is :" + title);

		// get url

		String url = js.executeScript("return document.URL").toString();

		System.out.println("url of page is :" + url);
		
        //driver.quit(); // Close the browser after actions
    }

}
