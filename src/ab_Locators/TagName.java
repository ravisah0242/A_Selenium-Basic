package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com");
		driver.findElement(By.tagName("input")).sendKeys("kamal");*/    //some error @R
		
		driver.get("C:/Users/DELL/Downloads/Selenium By Jyoti Prakash/HTML  CODE/TagName.html");
		driver.findElement(By.tagName("input")).sendKeys("Ravi");
		driver.findElement(By.tagName("input")).sendKeys("Sah");
		
	}

}
