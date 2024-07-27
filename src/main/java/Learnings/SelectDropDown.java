package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	static	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.id("Form_getForm_Country"));
		
		Select select = new Select(driver.findElement(By.id("Form_getForm_Country")));
		select.selectByIndex(5);
		Select select1 = new Select(driver.findElement(By.id("Form_getForm_Country")));
	//	select.selectByValue("Australia");
	//	select.selectByVisibleText(null);
	
		
		


	}


	public static void doSelectValueByIndex(By locator, int index) {
		
	}
}
