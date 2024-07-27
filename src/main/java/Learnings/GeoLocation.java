package Learnings;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GeoLocation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		Map<String, Object> coordinateMap = new HashMap<>();
		coordinateMap.put("latitude", 34.052235);
		coordinateMap.put("longitude", -118.243683);
		coordinateMap.put("accuracy", 1);
		((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinateMap);
		driver.get("https://locations.kfc.com/search");

		WebElement elem = driver.findElement(By.cssSelector(".Locator-button.js-locator-geolocateTrigger"));

		elem.click();

	}

}
