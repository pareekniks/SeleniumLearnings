package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NoSuchElement {

	public static void main(String[] args) {
		
		BrowserUtil bu = new BrowserUtil();
		WebDriver driver= bu.init_driver("chrome");
		ElementUtil eu= new ElementUtil(driver);
	//	By clickBtn = By.xpath("//button[@type='submit']");
		
		bu.enterUrl("https://demo.opencart.com/index.php?route=account/login");
		eu.getElement(By.id("test"));
	}

}
