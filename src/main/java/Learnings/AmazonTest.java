package Learnings;

public class AmazonTest {

	public static void main(String[] args) {
	

		BrowserUtil bu = new BrowserUtil();
		bu.init_driver("safari");
		bu.enterUrl("https://www.amazon.com");
		System.out.println(bu.getPageTitle());
		System.out.println(bu.getPageUrl());
		bu.closeBrowser();

	}
	
	public void t1() {
		System.out.println("This is the t1 method");
	}
	
	

}
