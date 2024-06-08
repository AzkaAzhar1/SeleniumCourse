package com.seleniumlearning;

import org.openqa.selenium.edge.EdgeDriver;


public class EdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

				//edge driver exe path
			System.setProperty("webdriver.edge.driver", "C:\\Users\\PC\\Downloads\\IEDriverServer_x64_4.14.0\\IEDriverServer.exe");
					
		//create object of edge class
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://resturant.businessholics.com/");
		

		}
}