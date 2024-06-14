package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxDemo {

	public static void main(String[] args) throws InterruptedException {
	
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
			
				//Open Browser
			FirefoxDriver driver = new FirefoxDriver();
			
				//Get URL
			driver.get("https://the-internet.herokuapp.com/checkboxes");
			
			//identify the checkbox
			WebElement checkBox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
			
			//Check if checkbox is displayed
			boolean isDisplayedStatus = checkBox1.isDisplayed();
			System.out.println("Checkbox is displayed:"+ isDisplayedStatus);
			
			//Check if checkbox is enabled or not
			boolean isEnabled = checkBox1.isEnabled();
			System.out.println("Check is Enabled:"+ isEnabled);
			
			//select checkbox
			checkBox1.click();
			Thread.sleep(5000);
			
			//check selected status of checkbox
			boolean isSelectedStatus = checkBox1.isSelected();
			System.out.println("Selected status:"+ isSelectedStatus);
			
			//un select checkbox
			checkBox1.click();
			
			WebElement checkBox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
			if(checkBox2.isSelected()) {
				checkBox2.click();
			}
			else {
				driver.quit();
			}
			}
	}


