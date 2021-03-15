package ac_Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_Return {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement text=driver.findElement(By.xpath("//input[@name='username']"));
		text.sendKeys("admin");
		WebElement text1=driver.findElement(By.xpath("//input[@name='pwd']"));
		text1.sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		//text.sendKeys(Keys.ENTER);
		//OR
		text1.sendKeys(Keys.RETURN);
		
		
	}

}
