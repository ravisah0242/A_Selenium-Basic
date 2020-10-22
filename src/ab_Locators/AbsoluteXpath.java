package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/QSSE10/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///F:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/AbsoluteXpath.html");
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Aman");
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Gupta");
		
	}

}
