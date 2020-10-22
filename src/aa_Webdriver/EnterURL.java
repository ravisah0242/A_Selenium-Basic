package aa_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterURL {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("https://www.facebook.com");
		//driver.get("http://www.facebook.com");
		//driver.navigate().to("https://www.google.com");
	}

}
