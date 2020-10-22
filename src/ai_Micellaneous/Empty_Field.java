package ai_Micellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empty_Field {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement fastname=driver.findElement(By.xpath("//input[@name='firstname']"));
		fastname.sendKeys("Sandhya");
		String text=fastname.getAttribute("value");
		System.out.println(text.length());
		if(text.length()==0)
		{
			System.out.println("Feild is Empty");
		}
		else
		{
			System.out.println("Feild is Not Empty");
		}

	}

}
