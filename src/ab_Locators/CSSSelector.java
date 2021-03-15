package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("C:/Users/DELL/Downloads/Selenium By Jyoti Prakash/HTML  CODE/TagName.html");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Qspider");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Ranjan");*/
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Pawan");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Kumar");
		
	}

}
