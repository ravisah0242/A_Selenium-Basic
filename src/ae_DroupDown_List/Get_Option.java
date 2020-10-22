package ae_DroupDown_List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Get_Option {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Tutorial%20Beigenar/QSpider%20Tutorial%20Lecture/Selenium%20By%20Jyoti%20Prakash/HTML%20%20CODE/DropDownListSengleSelect.htms.html");
		WebElement droupdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
		Select sel=new Select(droupdownlist);
		List<WebElement> option=sel.getOptions();
		System.out.println(option.size());
		for(int i=0; i<option.size(); i++)
		{
			System.out.println(option.get(i).getText());
		}

	}

}
