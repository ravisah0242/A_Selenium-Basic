package ag_Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thread_Sleep {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		//Thread.sleep(5000);
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
	}

}
