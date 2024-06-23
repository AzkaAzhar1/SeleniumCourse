package MultipleWindows;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MultipleTabsHandling {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
        
        // Open browser
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        
        // Open application
        driver.get("https://www.bankalfalah.com/");
        
        // Identify element and click to open a new tab
        driver.findElement(By.linkText("Bank Alfalah Rapid")).click();
        
        // Get the window id of the first tab
        String firstWindowID = driver.getWindowHandle();
        System.out.println("First tab window id is :" + firstWindowID);
        
        // Get all window ids
        Set<String> allWindowIds = driver.getWindowHandles();
        
        // Switch to the second tab
        for (String s : allWindowIds) {
            if (!s.equals(firstWindowID)) {
                driver.switchTo().window(s);
                break;
            }
        }
        
        // Add explicit wait to ensure elements are present before interacting
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        // Find the "Internet Banking" link and click it
        WebElement internetBanking = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Internet Banking")));
        internetBanking.click();
        
        // Find the "Login" link and click it
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Login")));
        login.click();

        
     
    }
}
