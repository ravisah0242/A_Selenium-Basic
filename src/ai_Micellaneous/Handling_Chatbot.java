package ai_Micellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Chatbot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.id("corover-disha-icon")).click();
		
		driver.switchTo().frame("corover-chat-frame");		//---> BY ID Frame;
		driver.findElement(By.xpath("//input[@placeholder='Enter your query here']")).sendKeys("Train to noida");
		

	}

}
