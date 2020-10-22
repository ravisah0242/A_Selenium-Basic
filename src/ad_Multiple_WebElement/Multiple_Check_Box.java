package ad_Multiple_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Check_Box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/MultipleElements.html");
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		
		// click on all the checkboxs;
		/*for(int i=0;  i<checkbox.size(); i++)
		{
			Thread.sleep(1000);
			checkbox.get(i).click();
		}*/
		
		for(int i=0; i<checkbox.size(); i=i+2)
		{
			Thread.sleep(1000);
			checkbox.get(i).click();
		}
		
		//click on Alternate Checkbox in Reverse order;
		/*for(int i=checkbox.size()-1; i>=0; i-=2)
		{
			Thread.sleep(1000);
			checkbox.get(i).click();
		}*/
		
	}

}
