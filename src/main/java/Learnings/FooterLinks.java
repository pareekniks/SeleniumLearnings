package Learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[contains(@class,'navFooterCopyright')]//a"));
		for (WebElement webElement : footerLinks) {
			System.out.println(webElement.getText());
		}
		
	}
}
