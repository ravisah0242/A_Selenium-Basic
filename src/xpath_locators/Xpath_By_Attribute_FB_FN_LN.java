package xpath_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute_FB_FN_LN {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sah");

	}

}
