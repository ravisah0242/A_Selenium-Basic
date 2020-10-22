package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/AbsoluteXpath.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("Pawan");
		driver.findElement(By.xpath("//input[2]")).sendKeys("Gupta");
		

	}

}
