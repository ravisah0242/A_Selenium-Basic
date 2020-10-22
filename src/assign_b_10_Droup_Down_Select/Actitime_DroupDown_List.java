package assign_b_10_Droup_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actitime_DroupDown_List {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.id("ext-comp-1002")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("HR Manager");
		WebElement li=driver.findElement(By.xpath("//select[@name='active']"));
		Select sel=new Select(li);
		sel.selectByVisibleText("archived");

	}

}
