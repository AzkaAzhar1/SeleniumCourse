package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpathdemo {

public static void main (String args []) {

	//specify path of chromedriver
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://resturant.businessholics.com/");

	
	// (xpath method (Contains, starts-with, text, child, parent, following sibling, preceding sibling, USING OR AND)
	
	//contains method
   driver.findElement(By.xpath("//input[contains(@placeholder, 'mail')]\r\n")).sendKeys("Owner@sm.com");

   
   // starts with method
   driver.findElement(By.xpath("//input[starts-with(@placeholder, 'Email')]\r\n")).sendKeys("Owner@sm.com");
   
   //text method
   driver.findElement(By.xpath("//span[text()='Email']")).sendKeys("Owner@sm.com"); //syntax of text method
}
}
