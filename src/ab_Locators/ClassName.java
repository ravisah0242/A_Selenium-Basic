package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Compound class name are not allow
		
		WebElement email=driver.findElement(By.className("inputtext"));
		email.sendKeys("Richa");
		WebElement password=driver.findElement(By.className("inputtext"));
		password.sendKeys("@12345");

	}

}
