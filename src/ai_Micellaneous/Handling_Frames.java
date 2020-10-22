package ai_Micellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///E:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/Frames.html");
		
		driver.findElement(By.id("t1")).sendKeys("Ravi");
		
		//driver.switchTo().frame(10);	//no such frame Error;
		
		//driver.switchTo().frame(0); 		//---> Frame index;
		//driver.switchTo().frame("f1");	//---> frame ID;
		driver.switchTo().frame("n1");		//---> Frame Name;
		driver.findElement(By.id("t2")).sendKeys("Pawan");
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.navigate().refresh();
		//driver.switchTo().frame(1); 		//---> Frame index;
		//driver.switchTo().frame("f2");	//---> frame ID;
		driver.switchTo().frame("n2");		//Frame Name;
		driver.findElement(By.id("t2")).sendKeys("Pusha");
		
	}

}
