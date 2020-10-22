package aa_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/QSSE11/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getCurrentUrl());
	}

}
