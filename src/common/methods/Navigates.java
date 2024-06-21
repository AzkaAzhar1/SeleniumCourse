package common.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigates {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");

		//Open Browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// open application : get()

		driver.get("http://the-internet.herokuapp.com/");
		
		// click on any link

		driver.findElement(By.linkText("Broken Images")).click();
				
		Thread.sleep(5000);

		// click on back button of browser

		driver.navigate().back();
				
		Thread.sleep(5000);

		// click on forword button of browser

		driver.navigate().forward();
				
		Thread.sleep(5000);

		// refresh the url

		driver.navigate().refresh();
	}

}
