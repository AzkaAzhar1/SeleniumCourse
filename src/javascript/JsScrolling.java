package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		 // Set the path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        
        // Open browser
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        // Open Application
        driver.get("https://www.facebook.com/privacy/explanation");
        
        Thread.sleep(5000);
      WebElement contactlink =  driver.findElement(By.linkText("third parties"));
        
      JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down to see donation link (1st case)
		
  //    js.executeScript("arguments[0].scrollIntoView(true)", contactlink);
      
      
		//Scroll down the page till end
      
      js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");  //top to bottom scrolling is vertical scrolling
		
	}

}
