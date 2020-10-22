package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		   
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		    driver.get("http://www.vtiger.com");
		    WebElement resorce = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));   
		    Actions act = new Actions(driver); 
		    //resorce.click();
		    act.moveToElement(resorce).build().perform();
		    
		    WebElement contact = driver.findElement(By.xpath("//h6[contains(text(),'Contact')]"));
		    contact.click();
		    
		    String s = driver.findElement(By.className("(//p[@class='font-size-sm text-muted mb-0'])[1]")).getText();
		    System.out.println(s);
		    
		    
		   // driver.close();
				
			}

		

	}


