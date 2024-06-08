package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://resturant.businessholics.com/");
		
		
		//TagName and Id
		driver.findElement(By.cssSelector("input#email\r\n")).sendKeys("Owner@sm.com");
		//TagName and any other attribute
		driver.findElement(By.cssSelector("input#email[type='password']")).sendKeys("owner123");
        //TagName and class
		driver.findElement(By.cssSelector("button.btn.btn-primary.btn-lg.w-100")).click();
	}

}
