package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcepts {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");

//		driver.findElement(By.id("input-email")).sendKeys("niks");
//		driver.findElement(By.id("input-password")).sendKeys("21212");
//		WebElement emailId= driver.findElement(By.id("input-email"));
//		WebElement password= driver.findElement(By.id("input-password"));
//		emailId.sendKeys("niks");
//		password.sendKeys("123456");

		By emailId = By.id("input-email");

		By password = By.id("input-password");

//		WebElement eMail= driver.findElement(emailId);
//		WebElement psWd= driver.findElement(password);
//		getElement(emailId).sendKeys("Niks");
//		getElement(password).sendKeys("123456");
		ElementUtil eu = new ElementUtil(driver);

		eu.doSendKeys("id", "input-email", "naveen");
		eu.doSendKeys("id", "input-password", "123456");
//		eu.doSendKeys(emailId, "niks");
//		eu.doSendKeys(password, "123456");
//		// doSendKeys(emailId, "niks");
//		// doSendKeys(password, "123456");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		driver.quit();
	}

	public static WebElement getElement(By locator) {

		WebElement ele = driver.findElement(locator);
		return ele;

	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
