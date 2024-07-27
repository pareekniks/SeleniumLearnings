package Learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		System.out.println("totalLinks" + totalLinks.size());
		

		int i=0;
		for (WebElement we : totalLinks) {
			
			if(!we.getText().isEmpty()) {
			System.out.println(i +" "+ we.getText() + "<-tagName->" + we.getAttribute("href"));
			}
			i++;

		}
		
		for(int j=0;j<totalLinks.size();j++) {
			totalLinks.get(j).getText();
		}
		
		driver.quit();

	}

}
