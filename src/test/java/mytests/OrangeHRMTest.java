package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BAseTest {

	@Test
	public void logoTest() {
		boolean flag = driver.findElement(By.xpath("//a[@class='navbar-brand nav-logo']")).isDisplayed();
		Assert.assertTrue(flag, "logo not getting displayed");
	}

	@Test
	public void logoTestFailed() {
		boolean flag = driver.findElement(By.xpath("//a[@class='fun]")).isDisplayed();
		Assert.assertTrue(flag, "logo not getting displayed");
	

}
}
