package ai_Micellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Logfile {

	public static void main(String[] args) {
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"./firefoxlogfile/firefoxlog.txt");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		/*System.setProperty("webdriver.chrome.logfile", "./chromelogfile/chromelog.txt");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
	}

}
