package com.seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Open Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		//create object of firefox class
		FirefoxDriver driver = new FirefoxDriver();
		//Open SME Restaurant
		driver.get("https://resturant.businessholics.com/");
		
		//Capture all text boxes of a login page
	List <WebElement> allTextboxes = driver.findElements(By.className("form-control"));
	System.out.println("Total text boxes are:" + allTextboxes.size());
	
		
	}

}
