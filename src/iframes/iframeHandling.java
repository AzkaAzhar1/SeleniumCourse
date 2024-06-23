package iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframeHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		// Open browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// open application
		driver.get("https://jqueryui.com/dialog/");		
		
		// switch to iframe       //iframe index sy serach hoty hain
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);

		//identify the element which is present in iframe
        driver.findElement(By.xpath("//button[@title='Close']")).click();
       
        // to come out of iframe
        driver.switchTo().defaultContent();
	
        driver.findElement(By.linkText("Demos")).click();
	}

}
