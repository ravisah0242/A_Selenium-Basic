package assign_b_12_Popups_3_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actitime_Popup_ANd_Select {

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
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[.='Types of Work']")).click();
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("HR Manager");
		WebElement list= driver.findElement(By.xpath("//select[@name='active']"));
		Select sel=new Select(list);
		sel.deselectByVisibleText("archived");
		driver.findElement(By.xpath("//input[@value='   Create Type of Work   ']")).click();
		//Delete Static and Dynamic;
		driver.findElement(By.xpath("//a[.='HR Manager']/../../..//a[containt(@href,'delete']")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();
	}

}
