package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkOperation {

	public static void main(String[] args) {
		
		
		
		//Open Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		//Open Browser
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
		//Get URL to open application
	driver.get("https://www.facebook.com/");

	//Identify the link
	WebElement link = driver.findElement(By.linkText("Forgotten password?"));
	
		// Check display status of link
	Boolean isDisplayedStatus = link.isDisplayed();
	System.out.println("The displayed status is:"+ isDisplayedStatus);
	
		// Check enable status of link
	Boolean isEnabled = link.isEnabled();
	System.out.println("The enabled status is:"+ isEnabled);

		// get the link name
	String linkname = link.getText();
	System.out.println("Link name is:"+ linkname);
	
		// click on link
	link.click();
		
	}

}
