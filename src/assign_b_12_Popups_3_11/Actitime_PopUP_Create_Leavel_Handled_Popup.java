package assign_b_12_Popups_3_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_PopUP_Create_Leavel_Handled_Popup {

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
		driver.findElement(By.xpath("//a[.='Leave Types']")).click();
		driver.findElement(By.xpath("//span[.='Create Leave Type']")).click();
		driver.findElement(By.id("leaveTypeLightBox_nameField")).sendKeys("Sales Manager");
		driver.findElement(By.id("leaveTypeLightBox_cancelBtn")).click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		//alt.accept();

	}

}
