package Learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMConcept {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().browserVersion("101.0").setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.quit();

	}

}
