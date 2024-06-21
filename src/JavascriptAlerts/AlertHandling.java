package JavascriptAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
	
		// Open browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		// open application
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		// click on button to get javascript alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		
		// switch focus from normal window to alert
		Alert al = driver.switchTo().alert(); //selenium contains the alert interface so we creating the object of alert interface
		
		//get the text of alert

		String alerttext = al.getText();

		System.out.println("Alert text is :" + alerttext);

	
		//click on ok, cancel 
		//al.accept(); // click on OK button of alert
		
		al.dismiss(); // click on cancel button of alert 

}
}
