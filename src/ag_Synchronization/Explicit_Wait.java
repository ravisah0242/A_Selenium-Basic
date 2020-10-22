package ag_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();	
		Thread.sleep(5000);
		WebElement setting= driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]"));
		WebDriverWait wait= new WebDriverWait(driver, 1);
		/*wait.until(ExpectedConditions.titleIs("Sweta"));  //----> TIME OUT EXCEPTION;
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));*/
		
		//wait.until(ExpectedConditions.titleContains("actiTIME - Enter"));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));  //---> TIMEOUT EXCEPTION;
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='menu_icon'])[2]")));
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='menu_icon'])[2]")));
		
		//wait.until(ExpectedConditions.elementToBeClickable(setting));
		
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		
		}

}
