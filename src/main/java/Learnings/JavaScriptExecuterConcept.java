package Learnings;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		ElementUtil el = new ElementUtil(driver);
		el.waitForTile("Amazon", 5);

		JavaScriptUtil js = new JavaScriptUtil(driver);
		js.drawBorder(null);
		
	}
}
