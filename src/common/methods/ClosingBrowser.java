package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosingBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	

		//Open Browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// open application
		driver.get("http://the-internet.herokuapp.com/");
		
		// scroll down page 
		
		JavascriptExecutor js = driver ;  //convert driver to javascript executor 
		js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");		
		// Click on Elemental selenium link 
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
		Thread.sleep(5000);
		
		// close()
// driver.close(); it closes the current tab
		
		// quite()
		
	driver.quit();
		
		
	}

}
