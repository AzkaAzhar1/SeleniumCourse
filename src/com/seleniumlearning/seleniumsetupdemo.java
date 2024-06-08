package com.seleniumlearning;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumsetupdemo {

	public static void main (String args []) {
		
		
		//specify path of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		//Created object of chromedriver class
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://resturant.businessholics.com/");
		
	//	driver.findElement(By.id("email")).sendKeys("owner@sm.com");
	//	driver.findElement(By.name("password")).sendKeys("owner123");
		//driver.findElement(By.className("btn")).click();
		
		//driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.partialLinkText("password?")).click();
		
		WebElement emailInput = driver.findElement(By.id("email"));
      
		if (emailInput.isDisplayed()) {
            emailInput.sendKeys("abcd@gmail.com");
        } else {
            System.out.println("Email input field is not displayed.");
            return;
        }
		//driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.className("btn")).click();
		

		driver.findElement(By.linkText("Back to Login")).click();
	//driver.quit();
		
		
	}
	
}
