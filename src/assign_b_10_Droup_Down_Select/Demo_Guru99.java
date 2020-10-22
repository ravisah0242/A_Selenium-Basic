package assign_b_10_Droup_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_Guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sah");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("55443336899");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Champaran");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Ravi@g55433.com");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Motihari");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Bihar");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("845415");
		WebElement list= driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(list);
		sel.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys("ravi.9997");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

}
