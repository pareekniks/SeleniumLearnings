package Learnings;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.freshworks.com");
		 
		List<WebElement> footerlist = driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> eleList = wait.until(ExpectedConditions.visibilityOfAllElements(footerlist));
		for (WebElement webElement : eleList) {
			System.out.println(webElement.getText());
		}
}
}
