package Learnings;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		List<WebElement> totalLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		for (WebElement webElement : totalLinks) {
			System.out.println(webElement.getText());
			
			if(webElement.getText().contains("हिन्दी")) {
				webElement.click();
				break;
			}
			
		}
		
		
		

	}

}
