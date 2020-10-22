package ah_Popups_3_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Popups_American_Airline {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='30'])[1]")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		for(int i=0; i<=2;  i++)  //when we click next button 2 time thats why go for Loop;
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		driver.findElement(By.xpath("(//a[.='30'])[2]")).click();
	}	

}
