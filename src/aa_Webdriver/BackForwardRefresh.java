package aa_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForwardRefresh {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:/QSSE11/chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.navigate().to("http://www.flipkart.com");
		driver.navigate().to("http://www.myntra.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Thread.sleep(5000);		//@R
		 
	}

}
