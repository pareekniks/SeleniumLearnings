package Learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(getCompany("Maria Anders"));
		System.out.println(getCountry("Maria Anders"));

		String beforeXPath = "//table[@id='customers']//tbody/tr[";
		String afterXpath = "]/td[";

		for(int i=1;i<=getColumnCount();i++) {
		for (int j = 2; j <= getRowsCount(); j++) {
			System.out.print(driver.findElement(By.xpath(beforeXPath + j + afterXpath+i+"]")).getText()+"  ");

		}
		System.out.println();
		}

	}

	public static String getCompany(String name) {

		return driver.findElement(By.xpath("//td[text()='" + name + "']/preceding-sibling::td")).getText();

	}

	public static String getCountry(String name) {

		return driver.findElement(By.xpath("//td[text()='" + name + "']/following-sibling::td")).getText();

	}

	public static int getRowsCount() {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr"));
		return rows.size();
	}

	public static int getColumnCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
	}

}
