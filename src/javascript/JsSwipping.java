package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JsSwipping {

	public static void main(String[] args) {

		
		
		 // Set the path to the geckodriver executable
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        
        // Open browser
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        // Open Application
        driver.get("https://www.album.alexflueras.ro/");

		JavascriptExecutor js = driver;

		// from left to right

		WebElement catImage = driver.findElement(By.id("a7"));

		js.executeScript("arguments[0].scrollIntoView()", catImage);
		
		Thread.sleep(5000);

		// right to left

		WebElement houseImage = driver.findElement(By.id("a3"));

		js.executeScript("arguments[0].scrollIntoView()", houseImage);        
	}

}
