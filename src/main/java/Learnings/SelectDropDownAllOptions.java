package Learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownAllOptions {

	static	WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.findElement(By.id("Form_getForm_Country"));
		
		Select select = new Select(driver.findElement(By.id("Form_getForm_Country")));
		List<WebElement> country = select.getOptions();
		System.out.println(country.size());
		int a=0;
		for (WebElement webElement : country) {
			System.out.println(webElement.getText()+ "------>" + a);
			a++;
		}

}
}
