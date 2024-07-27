package Learnings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");
		Thread.sleep(3000);
		driver.findElements(By.xpath("//ul[@role='listbox']//li/div//div[@role='option']"));
		 List<WebElement> dropDownList = driver.findElements(By.xpath("//ul[@role='listbox']//li/div//div[@role='option']"));
		 for (WebElement wE : dropDownList) {
			 System.out.println(wE.getText().toString().trim());
			 if(wE.getText().toString().trim().equals("naveen automation labs api testing")) {
				 wE.click();
			 }
			 
			 Thread.sleep(1000);
			
		}
		
		
	}

}
