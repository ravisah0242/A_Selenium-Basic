package ae_DroupDown_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Unexpected_TagName_Exception {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		WebElement setting=driver.findElement(By.id("Layer_1"));
		Select sel=new Select(setting);
		sel.selectByVisibleText("Types of Work"); 		//Unexpected_TagName_Exception;
	}

}
