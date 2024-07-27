package Learnings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement srcEle = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement trgEle = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions act = new Actions(driver);
		 
	//	act.clickAndHold(srcEle).moveToElement(trgEle).release().build().perform();
		act.dragAndDrop(srcEle, trgEle).perform();

}
}
