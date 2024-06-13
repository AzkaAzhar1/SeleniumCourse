package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		
        searchbox.sendKeys("selenium");		

	}

}
