package ae_DroupDown_List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_All_Select_Option {

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
		List<WebElement> selectedoption=sel.getAllSelectedOptions();
		System.out.println(selectedoption.size());
		for(int i=0; i<selectedoption.size(); i++)
		{
			System.out.println(selectedoption.get(i).getText());
		}
	}

}
