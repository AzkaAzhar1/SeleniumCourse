package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button {

	public static void main(String[] args) {

		//Open Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		//Open Browser
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
		//Get URL to open application
	driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
	
	//Identify button element
	
	WebElement addBtn = driver.findElement(By.xpath("//button [text()='Add Element']"));
	
	// check displayed status
	Boolean buttonstatus  = addBtn.isDisplayed();
	System.out.println("Display Status is"+ buttonstatus);
	
	//check enabled status
	Boolean enablestatus = addBtn.isEnabled();
	System.out.println("Enable Status is"+ enablestatus);
	
	//click on button
	
	for(int i=0; i<=10; i++) {
	addBtn.click();
	
	}
	}

}
