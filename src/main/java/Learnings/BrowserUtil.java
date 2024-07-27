package Learnings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is used to initialize the driver in basis of browserName
	 * 
	 * @param browser
	 * @return WebDriver
	 */

	public WebDriver init_driver(String browser) {
		System.out.println("Browser value is : " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver",
			// "/Users/niks/Downloads/chromedriver");
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		}

		else {
			System.out.println("Browser name incorrect");

		}

		return driver;

	}

	/**
	 * 
	 * @param url
	 */

	public void enterUrl(String url) {

		if (url.contains("https") || url.contains("http")) {
			driver.get(url);
		} else {
			System.out.println("incorrect url");
			try {
				throw new Exception("Incorrect url");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

	public String getPageTitle() {
		return driver.getTitle();

	}

	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	public void closeBrowser() {
		driver.close();
	}

}
