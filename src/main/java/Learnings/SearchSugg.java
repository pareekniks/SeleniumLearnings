package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSugg {
static	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(10000);
		clickDropDown("T-shirts > Faded Short Sleeve T-shirts");
		
	}
	
	public static void clickDropDown(String locatorValue) {
		driver.findElement(By.xpath("//ul/li[contains(text(),'"+locatorValue+"')]")).click();
	}

}
