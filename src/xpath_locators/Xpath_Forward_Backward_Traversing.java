package xpath_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Forward_Backward_Traversing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("file:///E:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/XpathTraversing.html");
		//HTML to F
		driver.findElement(By.xpath("/html//div[3]/input[2]")).click();
		//BODY to C
		driver.findElement(By.xpath("//body//div[2]/input[1]")).click();
		//A to HTML to D
		driver.findElement(By.xpath("//div[1]/input[1]")).click();*/
	
		
		driver.get("https://www.facebook.com");
		//HTML to SURNAME
		driver.findElement(By.xpath("/html/body//input[@name='firstname']")).sendKeys("Pusha");//Forward
		
		driver.findElement(By.xpath("/html//input[@name='lastname']/../../../../../../../../..//input[@name='lastname']")).sendKeys("Sah");
			//Backward
		driver.findElement(By.linkText("/html//input[@name='reg_email__']/../../../../../../..//input[@name='reg_email__']")).sendKeys("9877665444455");
	}

}
