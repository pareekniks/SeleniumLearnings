package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");		
		WebElement ele = driver.findElement(By.xpath("//a[text()='Dorval, Canada']"));
		System.out.println(driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText());
		System.out.println(driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText());
		System.out.println(driver.findElement(with(By.tagName("a")).near(ele)).getText());
		driver.quit();

	}

}
