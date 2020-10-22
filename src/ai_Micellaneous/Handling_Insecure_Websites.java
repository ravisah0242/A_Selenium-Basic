package ai_Micellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_Insecure_Websites {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("Enter the URL of Insecure Site");
	}

}
