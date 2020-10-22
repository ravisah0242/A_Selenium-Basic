package assign_b_12_Popups_3_11;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIME_Switch_Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		Set<String> a=driver.getWindowHandles();
		System.out.println(a.size());    
		
		ArrayList<String> al=new ArrayList<>(a);
		driver.switchTo().window(al.get(1)); 
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[.='Try Free']")).click();
		driver.findElement(By.id("first-name")).sendKeys("Ravi");
		driver.findElement(By.id("last-name")).sendKeys("Sah");
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ravisah008@yggh");
		driver.findElement(By.id("company")).sendKeys("HCL");
		driver.close();
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[.='Login ']")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();	
		driver.close();
	}
}
