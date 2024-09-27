package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		//Open Browser
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
				
				//Open Browser
			FirefoxDriver driver = new FirefoxDriver();
			 driver.manage().window().maximize();
				//Get URL
			driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
			
			//button is in the iframe so that is why driver focus is changing to iframe. 
			driver.switchTo().frame("iframeResult");
			
			WebElement button = driver.findElement(By.xpath("//button[text()='Double-click me']"));
			
			//actions class to perform keyboard mouse events
			
			Actions action = new Actions(driver);

            action.doubleClick(button).build().perform();
}

}
