package assign_b_10_Droup_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_date_of_Birth_Select {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select sel=new Select(day);
		sel.selectByVisibleText("25");
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select sel1=new Select(month);
		sel1.selectByIndex(4);
		WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select sel2=new Select(year);
		sel2.selectByValue("1996");
	}

}
