package com.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextBoxOperation { 

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	
		//Open Browser
	FirefoxDriver driver = new FirefoxDriver();
	
		//Get URL
	driver.get("https://the-internet.herokuapp.com/forgot_password");
		
		// Identify the TextBox
	WebElement emailtextbox = driver.findElement(By.name("email"));
    boolean isDisplayed = emailtextbox.isDisplayed();  //boolean will return true or false
    System.out.println("It's displayed status:"+ isDisplayed); //to check in console wether the textbox is displayed or not
    
       // Textbox is enabled or not
    boolean isEnabled = emailtextbox.isEnabled();
    System.out.println("It's status:"+ isEnabled);
   
    // enter the value in textbox
    emailtextbox.sendKeys("text@gmail.com");
    
    Thread.sleep(5000);
    
    //get the entered value from text box
   String enteredvalue = emailtextbox.getAttribute("value");
   System.out.println("Entered value of textbox is:"+ enteredvalue);
   
   // delete the value of textbox
    emailtextbox.clear();
    
	}

}
