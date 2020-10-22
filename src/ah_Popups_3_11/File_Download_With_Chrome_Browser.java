package ah_Popups_3_11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_Download_With_Chrome_Browser {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//WebDriver driver=new ChromeDriver(); //can to Handel popup
		WebDriver driver=new ChromeDriver(option);  	//Now we can handel popup
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://filehippo.com/");	
		driver.findElement(By.xpath("//a[.='Popular software']")).click();
		driver.findElement(By.xpath("//p[.='Google Chrome']/../../..//..//span[.='Download']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[.='Download Latest Version']")).click();
		driver.findElement(By.xpath("//div[@class='icon icon-close icon--medium']")).click();
		
	/*	Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		//alt.accept();
		alt.dismiss();*/
		
		Robot r=new Robot();
		for(int i=0; i<=45;  i++)
		{
			//Thread.sleep(100);
			r.keyPress(KeyEvent.VK_TAB);
		}
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_ENTER);
	}

}
