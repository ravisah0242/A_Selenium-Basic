package assign_b_12_Popups_3_11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filehippo_Download_Firefox_Browser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/Software for Selenium/Selenium-3.11/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.get("https://filehippo.com/");
		driver.findElement(By.xpath("//a[.='Popular software']")).click();
		driver.findElement(By.xpath("//p[.='Google Chrome']/../../../..//span[.='Download']")).click();
		driver.findElement(By.xpath("//a[.='Download Latest Version']")).click();
		driver.findElement(By.xpath("//div[@class='icon icon-close icon--medium']")).click();
		//driver.findElement(By.xpath("svg tags.....? ))
		Robot r=new Robot();
		for(int i=0; i<=2;  i++)
		{
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_TAB);
		}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
