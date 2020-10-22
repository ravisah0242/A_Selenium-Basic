package ae_DroupDown_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select			//Same for Multiple select only change in HTML Code;
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/DropDownList.html");
		WebElement droupdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
		Select sel=new Select(droupdownlist);
		sel.selectByVisibleText(" Reena ");
		Thread.sleep(2000);
		sel.selectByValue("LA");
		sel.selectByIndex(2);
		//sel.deselectAll();
		sel.deselectByVisibleText("Reena");
		//sel.deselectByIndex(5);
		sel.deselectByVisibleText("LA");		//Only Multiple Select we Used Dselect Otherwise Exeception;
		
	}

}
