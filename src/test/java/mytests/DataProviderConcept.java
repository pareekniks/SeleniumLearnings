package mytests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	
	@DataProvider
	public Object[][] loginTestData() {
		return new Object[][] {
			{"nik@gmail.com",123456},{"nik@ymail.com",987678}
		};
	}
	
	@Test(dataProvider ="loginTestData")
	public void loginTest(String UN, int password) {
		System.out.println(UN +" "+ password);
		Assert.assertTrue(true, "");
	}
}
