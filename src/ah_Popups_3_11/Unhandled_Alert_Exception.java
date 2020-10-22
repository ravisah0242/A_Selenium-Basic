package ah_Popups_3_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unhandled_Alert_Exception {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='container_tasks']")).click();
		driver.findElement(By.xpath("//div[.='Add New']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("Ravi");
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		
		driver.findElement(By.xpath("//div[.='Create Customer']")).click(); // Exception:- Unhandled Alert Exception
		
		}
}
