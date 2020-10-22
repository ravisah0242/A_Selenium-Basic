package ah_Popups_3_11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Download_With_Firefox {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:/Software for Selenium/Selenium-3.11/geckodriver-v0.26.0-win64/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		
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
