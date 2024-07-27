package Learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGHandling {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/#/");

		List<WebElement> state = driver.findElements(By.xpath(
				"//*[local-name()='svg'  and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @class='state']/*[name()='path']"));

		Actions act = new Actions(driver);
		for (WebElement webElement : state) {
			act.moveToElement(webElement).perform();
			System.out.println(webElement.getAttribute("name"));
		}

	}
}
