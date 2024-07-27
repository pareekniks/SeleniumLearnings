package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckBox {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		selectCheckbox("Joe.Root");
		selectCheckbox("Kevin.Mathews");
		
}
	
	public static void selectCheckbox(String value) throws InterruptedException {
		
		//table[@id='resultTable']//a[text()='Joe.Root']/parent::td//preceding-sibling::td//input
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@id='resultTable']//a[text()='"+value+"']/parent::td//preceding-sibling::td//input")).click();
	}
}


