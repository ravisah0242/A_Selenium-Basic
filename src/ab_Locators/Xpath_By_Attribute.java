package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@aria-required='true']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Sah");
		
		// *NOTE*---> Can We use Multiple Attribute in a Single xpath Expressin ?---> Yes
		
		driver.findElement(By.xpath("//input[@name='firstname'] [@aria-label='First name']")).sendKeys("Multiple Attributeand value");
		
		

	}

}
