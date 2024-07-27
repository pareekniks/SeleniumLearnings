package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceException {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:www.amazon.com");
		ElementUtil el = new ElementUtil(driver);
		By searchBox = By.id("twotabsearchtextbox");
		el.doSendKeys(searchBox, "Niks");
	
		driver.navigate().refresh();
		//searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		el.doSendKeys(searchBox, "Niks");
		

		
	}
}
