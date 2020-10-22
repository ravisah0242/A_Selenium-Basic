package ah_Popups_3_11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Web_Push_Notification {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//WebDriver driver=new ChromeDriver(); //can to Handel popup
		WebDriver driver=new ChromeDriver(option);  	//Now we can handel popup
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in"); 	
		option				.//How to Access or Block notification of RedBus;
		/*Alert alt=driver.switchTo().alert();
		alt.dismiss();
		System.out.println(alt.getText());*/
		
		// For Firefox browser;
		/*System.setProperty("webdriver.gecko.driver", "D:/Software for Selenium/Selenium-3.11/geckodriver-v0.26.0-win64/geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		//options.addPreference("dom.notifications.enable", false);
		//OR
		options.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.redbus.in");*/
		
		
	}
}
