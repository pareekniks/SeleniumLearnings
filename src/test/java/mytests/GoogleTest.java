package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BAseTest {

	@Test
	public void logoTest() {
		Assert.assertEquals( driver.getTitle(), "Google");
	}


}
