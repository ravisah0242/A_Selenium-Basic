package ai_Micellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor_Enter_Page_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;   //Type Casting or Downcasting;
		for(int i=0; i<=5; i++)
		{
			Thread.sleep(8000);
			js.executeScript("window.scrollBy(0,1000)");
		}
		
		for(int i=0; i<=5; i++)
		{
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-1000)");
		}
		
	}

}
