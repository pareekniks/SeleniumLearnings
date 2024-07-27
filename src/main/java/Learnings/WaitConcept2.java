package Learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcept2 {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		ElementUtil eUtil= new ElementUtil(driver);
		eUtil.waitForURL("account", 5);
		System.out.println(driver.getCurrentUrl());
		 
}
}
