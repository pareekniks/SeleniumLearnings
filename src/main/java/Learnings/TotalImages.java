package Learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		System.out.println("imgList" + imgList.size());

		int i=0;
		for (WebElement we : imgList) {
			
	 {
			System.out.println(i +" "+ we.getAttribute("alt") + "<-imgName->" + we.getAttribute("src"));
			}
			i++;

		}
		
		driver.quit();

	}


}
