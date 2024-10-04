package ImplicitWait;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class implicitwait {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
	WebElement btn = driver.findElement(By.linkText("Create new account"));
	btn.click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	driver.findElement(By.name("firstname")).sendKeys("azka");
	driver.findElement(By.name("lastname")).sendKeys("A");

	}

}
