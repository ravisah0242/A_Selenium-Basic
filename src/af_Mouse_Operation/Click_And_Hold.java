package af_Mouse_Operation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement actitimeinc= driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		Actions act=new Actions(driver);
		act.clickAndHold(actitimeinc).perform();
		Thread.sleep(5000);
		act.release(actitimeinc).perform();

	}

}
