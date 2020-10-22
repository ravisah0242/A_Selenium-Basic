package assign_b_12_Popups_3_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Myntra_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		// For Firefox browser;
		/*System.setProperty("webdriver.gecko.driver", "D:/Software for Selenium/Selenium-3.11/geckodriver-v0.26.0-win64/geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		//options.addPreference("dom.notifications.enable", false);
		//OR
		options.addArguments("--disable-notifications");
		WebDriver driver=new FirefoxDriver(options);
		driver.get("https://www.myntra.com/");*/
		WebElement link=driver.findElement(By.xpath("//a[.='Home & Living']"));		
		Actions act=new Actions(driver);
		act.moveToElement(link).perform();
		
	}

}
