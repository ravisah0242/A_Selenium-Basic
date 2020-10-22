package ai_Micellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Load_Timeout {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);	//---> Only for URL Part ont other;
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	//---> its for all the Element;
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("url is loaded within 5 seconds");

	}

}
