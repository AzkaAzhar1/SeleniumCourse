package Browsers;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxBrowser {

	public static void main(String[] args) {

//firefoxProfile is a collection of settings of firefox browser
		FirefoxProfile profile = new FirefoxProfile();

		profile.setPreference("browser.download.folderList", 2);

		profile.setPreference("browser.download.dir", "G:\\Softwares");

		FirefoxOptions options = new FirefoxOptions();

		options.setProfile(profile);
		
		options.addArguments("--private");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\PC\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
	}

}
