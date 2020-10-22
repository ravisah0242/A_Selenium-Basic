package ac_Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cut_Peste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement fastname=driver.findElement(By.xpath("//input[@name='firstname']"));
		fastname.sendKeys("Ranjan");
		fastname.sendKeys(Keys.CONTROL,"a");
		fastname.sendKeys(Keys.CONTROL,"x");
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys(Keys.CONTROL,"v");

	}

}
