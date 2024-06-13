package com.seleniumlearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://resturant.businessholics.com/");
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are:" + allLinks.size());
		
		for (int i = 0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(1).getText());
		}
	}

}
