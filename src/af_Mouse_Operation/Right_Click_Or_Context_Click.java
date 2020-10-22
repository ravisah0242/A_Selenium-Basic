package af_Mouse_Operation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Or_Context_Click {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//WebElement forgotpassword= driver.findElement(By.xpath("//a[.='Forgot your password?']"));
		WebElement forgotpassword= driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions act=new Actions(driver);
		act.contextClick(forgotpassword).perform();
		
		Robot r=new Robot();
		/*for(int i=0;i<2; i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);  //Open new Window ;
		}
		//r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
