package assign_b_10_Droup_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sah");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("ravu.4444@gmail.com");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		driver.findElement(By.id("userNumber")).sendKeys("85580252424");
		Thread.sleep(2000);
		
		/*WebElement bob=driver.findElement(By.id("dateOfBirthInput"));
		bob.clear();
		bob.sendKeys("26-April/1996");*/
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		WebElement year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select sel1=new Select(month);
		sel1.selectByIndex(3);
		Select sel=new Select(year);
		sel.selectByValue("2001");
				
		driver.findElement(By.xpath("//div[.='25']")).click();		

	}

}
