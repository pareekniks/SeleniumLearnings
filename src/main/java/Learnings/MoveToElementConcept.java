package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		WebElement menuLink = driver.findElement(By.className("menulink"));
		Actions act = new Actions(driver);
		act.moveToElement(menuLink).perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.linkText("COURSES"))).build().perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
