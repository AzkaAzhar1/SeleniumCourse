package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSValidation {

	public static void main(String[] args) {

  System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		//Open Browser
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
		//Get URL to open application
	driver.get("http://the-internet.herokuapp.com/forgot_password");
	
	WebElement btn = driver.findElement(By.id("form_submit"));
		
           String Button1 = btn.getCssValue("border-style");	
	System.out.println("Border style is:"+ Button1);
	
	String textAlingn = btn.getCssValue("text-align");
	System.out.println("textAlingn value is :" + textAlingn);

	String backgroundColor = btn.getCssValue("background-color");
	System.out.println("back ground color code is :" + backgroundColor);
	
	}

}
