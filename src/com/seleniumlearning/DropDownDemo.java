package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main(String[] args) {
	
		
		//Open Browser
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		
		//Open Browser
	FirefoxDriver driver = new FirefoxDriver();
	
		//Get URL
	driver.get("https://www.goto.com/meeting/trial");
			//identify value from drop down
	
	WebElement companysize = driver.findElement(By.id("CompanySize"));
	//companysize.click(); no need for click for drop downs
		//select value from drop down list
		
	//created object of the Select class
		Select selectcompanysize = new Select(companysize);
		
		//selectcompanysize.selectByVisibleText("1 - 19");
		//selectcompanysize.selectByValue("100 - 249");
		// selecting option based on the index of options
		selectcompanysize.selectByIndex(2);
		
	//Get selected value from drop down
		WebElement selectedoption = selectcompanysize.getFirstSelectedOption(); //reading the value and it will give me webelement
	String selectedDropDownValue = selectedoption.getText();	
	
	System.out.println("Selected value in drop down is :" + selectedDropDownValue);
	}
	

}
