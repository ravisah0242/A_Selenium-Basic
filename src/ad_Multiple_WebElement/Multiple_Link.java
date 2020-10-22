package ad_Multiple_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Link {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/MultipleElements.html");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		//links.get(2).click();
		//System.out.println(links.get(0).getText());
		for(int i=0;  i<links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
			 System.out.println(driver.getCurrentUrl());
			
		}

	}

}
