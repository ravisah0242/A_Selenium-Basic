package assign_b_10_Droup_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange_HRM {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		driver.findElement(By.xpath("//input[@name='searchDirectory[emp_name][empName]']")).sendKeys("Sonam");
		WebElement list=driver.findElement(By.id("searchDirectory_job_title"));
		Select sel=new Select(list);
		sel.selectByValue("3");
		WebElement list1=driver.findElement(By.id("searchDirectory_location"));
		Select sel1=new Select(list1);
		sel1.selectByVisibleText("  Canada");

	}

}
