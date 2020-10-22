package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Contains {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.facebook.com/");
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		System.out.println(link.getText());
		link.click();*/
		//Dynamic Element (text values);
		/*driver.get("https://login.yahoo.com/?src=noSrc&intl=in&specId=yidReg&done=https%3A%2F%2Fwww.yahoo.com&nr=1");
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Create an')]"));
		System.out.println(link.getText());
		
		link.click();*/
		//go for Non Breakable Space;--->(&nbsp)
		driver.get("file:///E:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/XpathContains.html");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Ravi");
	}

}
