package ai_Micellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor_Enter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=fpctx&.done=https%3A%2F%2Fin.yahoo.com&intl=in&specId=yidReg&done=https%3A%2F%2Fin.yahoo.com&nr=1");
		WebElement email= driver.findElement(By.id("login-username"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;   //Type Casting or Downcasting;
		js.executeScript("arguments[0].value='Ravi004@yahoo.com'", email);
		
	}

}
