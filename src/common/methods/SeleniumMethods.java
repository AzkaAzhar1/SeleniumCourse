package common.methods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");

		//Open Browser
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	// open application : get()

	driver.get("http://the-internet.herokuapp.com/");

	// maximize the browser : window.maximize()
	driver.manage().window().maximize();

	// get the title of page : getTitle()

	String title = driver.getTitle();

	System.out.println("Title is :" + title);

	// get the url of page : getCurrentUrl()

	String url = driver.getCurrentUrl();

	System.out.println("url is :" + url);
	
	
	}

}
