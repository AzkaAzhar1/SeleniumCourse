package com.seleniumlearning;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefixBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//gecko driver exe path
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	
		//create object of firefox class
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://resturant.businessholics.com/");

		
	}

}
