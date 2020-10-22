package ah_Popups_3_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Divisino_Popups {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.skillrary.com/");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.findElement(By.xpath("//span[@class='mylivechat_collapsed_span']")).click();
		//driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Ravi");
		driver.findElement(By.xpath("//div[@title='Minimize']")).click();
		

	}

}
