package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	@BeforeSuite
	public void createUser() {
		System.out.println("BS-----creating user");

	}

	@BeforeTest
	public void connectWithDB() {
		System.out.println("BT-----connectWithDB");

	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC-----Launching the Browser");

	}

	@BeforeMethod
	public void login() {
		System.out.println("BM-----Login");

	}

	@Test
	public void homePagetest() {
		System.out.println("test-----home page testing ");

	}

	@Test(priority = -9)
	public void priceTest() {
		System.out.println("test-----price page testing ");

	}

	@AfterMethod
	public void logOut() {
		System.out.println("AM-----logout");

	}

	@AfterSuite
	public void deleteUser() {
		System.out.println("AS-----delete user");

	}

	@AfterTest
	public void disconnectWithDB() {
		System.out.println("AT-----disconnectWithDB");

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC-----closing the Browser");

	}

}
