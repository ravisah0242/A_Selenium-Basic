package ah_Popups_3_11;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.findElement(By.id("wdgt-file-upload")).click();
		
		StringSelection file=new StringSelection("C:\\Users\\DELL\\Desktop\\.Ravi Sah.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
		
		Thread.sleep(1000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

}
