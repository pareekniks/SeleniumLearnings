package Learnings;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxis {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/royal-london-one-day-cup-2022-1297661/kent-vs-lancashire-final-1298033/full-scorecard");

		System.out.println(getWicketTaker("Joey Evison"));
		List<String> score = getScoreCard("Joey Evison");
		System.out.println(score);

	}

	public static String getWicketTaker(String batsMan) {
		

		return driver
				.findElement(By.xpath("//a//span[text()='" + batsMan + "']//ancestor::td/following-sibling::td/span"))
				.getText();

	}
	
	public static List<String> getScoreCard(String batsMan) {
		List<String> score = new ArrayList<String>();
		List<WebElement> scoreCard = driver.findElements(By.xpath("//a//span[text()='"+batsMan+"']//ancestor::td/following-sibling::td"));
		for(int i=1;i<scoreCard.size();i++) {
			score.add(scoreCard.get(i).getText());
		}
		return score;
		
	}
}
