package assign_b_10_Droup_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingPool {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://testingpool.com/wp-content/uploads/2015/08/DemoApplication.html");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sah");
		driver.findElement(By.id("male")).click();
		WebElement wk=driver.findElement(By.xpath("//select[@name='Week']"));
		Select sel=new Select(wk);
		sel.selectByIndex(1);
		sel.selectByValue("Wed");
		sel.selectByVisibleText("Friday");
		
		WebElement list=driver.findElement(By.xpath("//select[@name='number']"));
		Select  sel1=new Select(list);
		sel.deselectByIndex(2);
		driver.findElement(By.xpath("(//input[@name='color'])[1]")).click();
		driver.findElement(By.id("bttn")).click();

	}

}
