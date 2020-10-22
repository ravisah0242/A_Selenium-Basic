package assign_b_12_Popups_3_11;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Upload_CV_OF_Shine_PopUP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.shine.com/");
		
		driver.findElement(By.xpath("//a[.='Sign in']")).click();
		
		driver.findElement(By.id("id_email_login")).sendKeys("raviranjankumar005@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("r9507090169");
		driver.findElement(By.xpath("//button[@style='line-height: 17px;']")).click();
		
		/*Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Sign-in with Google']")).click();
		Set<String> a=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<>(a);
		driver.switchTo().window(al.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[.='RAVI RANJAN']")).sendKeys("raviranjankumar005@gmail.com");*/
		
		driver.findElement(By.xpath("//span[@class='js-close-noti-popup pushNotification']")).click();
		
		/*WebElement Profile = driver.findElement(By.xpath("//a[.='Profile ']"));
		Actions act=new Actions(driver);
		act.moveToElement(Profile).perform();
		driver.findElement(By.xpath("//a[.='My Profile']")).click();
		driver.findElement(By.xpath("//button[.='Upload latest resume & check score']")).click();
		driver.findElement(By.xpath("(//input[@name='resume_file'])[1]")).click();*/
		
		.driver.findElement(By.xpath("((//input[@type='file'])[1]")).click();	//invalid selector Error;
		
		
	}
}
