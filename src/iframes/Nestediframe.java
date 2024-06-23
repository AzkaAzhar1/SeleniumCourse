package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Nestediframe {

	public static void main(String[] args) {

    System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		// Open browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// open application
		driver.get("https://the-internet.herokuapp.com/nested_frames");	
		
		
		//switch from html to frame
		driver.switchTo().frame(0);
		
		//switch parent frame to child frame
		driver.switchTo().frame(1);
		
		//identify the webelement
		WebElement text = driver.findElement(By.id("content"));
		
		//print the text of webelement
		System.out.println("Text of iframe is:"+ text.getText());
		
		//comeout from child frame to parent frame
		
		driver.switchTo().parentFrame();
		
		//comeout from parent frame to html
		driver.switchTo().defaultContent();
	}

}
