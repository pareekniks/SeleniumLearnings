package Learnings;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryBasedDD {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();

		By choices = By.xpath("//span[@class='comboTreeItemTitle']");

		selectMultiChoice(choices, "choice 2", "choice 9", "choice 4",  "choice 29");
		// selectMultiChoice(choices, "all");
//
	}

	public static void selectMultiChoice(By locator, String... choice) {

		List<WebElement> allChoices = driver.findElements(locator);
		boolean flag = true;
		int j = 0;
		HashSet<String> s1 = new HashSet<>();
		if (!(choice[0].equalsIgnoreCase("all"))) {

			for (int i = 0; i < choice.length; i++) {
				int count =0;
				for (WebElement wE : allChoices) {
					if (choice[i].equals(wE.getText())) {
						flag = false;
						wE.click();
						count++;
						break;
					} 
				}
				if(count==0) {
				
					s1.add(choice[i]);
				}
				
			}
		} else {
			try {
				for (WebElement wE : allChoices) {
					flag = false;
					wE.click();
				}
			} catch (ElementNotInteractableException e) {
				System.out.println("All choices are over");
			}
		}
		if (flag == false) {
			System.out.println("wrong choice provided" + s1);
		}

	}

}
