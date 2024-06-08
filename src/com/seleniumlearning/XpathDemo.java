package com.seleniumlearning;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
public static void main (String args []) {
		
		
		//specify path of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		//Created object of chromedriver class
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://resturant.businessholics.com/");

driver.findElement(By.xpath("/body/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("owner@sm.com");
}
}