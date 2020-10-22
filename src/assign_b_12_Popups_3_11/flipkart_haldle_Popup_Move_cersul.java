package assign_b_12_Popups_3_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart_haldle_Popup_Move_cersul {		//Hidden_Divisino_Popups

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement link= driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
		Actions act =new Actions(driver);
		Thread.sleep(1000);
		act.moveToElement(link).perform();
		
	}

}
