package mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://jqueryui.com/droppable/");
	
	
	driver.switchTo().frame(0);
	
	//Drag and Drop Operation
	
	WebElement smallbox = driver.findElement(By.id("draggable"));
	WebElement bigbox = driver.findElement(By.id("droppable"));
	
	Actions action = new Actions(driver);
	
	action.dragAndDrop(smallbox, bigbox).build().perform();
	
	}

}
