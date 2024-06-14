package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonDemo {

	public static void main(String[] args) throws InterruptedException {
		

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			
				//Open Browser
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
				//Get URL
			driver.get("https://demo.guru99.com/test/radio.html");
		
			// Identify the element
			WebElement radiobutton1 = driver.findElement(By.xpath("(//input[@value='Option 1'])[1]"));
			
			// Is displayed
	    boolean radiobutton =   radiobutton1.isDisplayed();
		System.out.println("Radio button is displayed status:"+ radiobutton);
		
		// Is Enabled
		boolean radiobutton11 = radiobutton1.isEnabled();
		System.out.println("Radio Button is enabled:"+radiobutton11);

		// select a radio button
		
		radiobutton1.click();
		Thread.sleep(5000);
		
        WebElement radiobutton2 = driver.findElement(By.xpath("//input[@id='vfb-7-2']"));

       if (radiobutton2.isDisplayed() && radiobutton2.isEnabled()) {
           radiobutton2.click();

        } else {
           System.out.println("Radio button 2 is not interactable");
       }
		
	
		
	}

}
