package assign_b_13_Micellaneous_3_11;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ActiTIME_Error_Massage_Verify {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		//options.addExtensions(new File("E:/Tutorial Beigenar/QSpider Tutorial Lecture/Selenium By Jyoti Prakash/Extension/extension_6_1_7_0_Cropath.crx"));
		options.addExtensions(new File("E:/Tutorial Beigenar/QSpider Tutorial Lecture/Selenium By Jyoti Prakash/Extension/extension_1_17_36_0_Momentum.crx"));
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		//WebElement errormassage= driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement errormassage=driver.findElement(By.xpath("(//td[@valign='top'])[2])"));
		
		String actualerrormassage=errormassage.getText();
		//String expectederrormassage="Not vailid";
		String expectederrormassage="Username or Password is invalid. Please try again.']";
		
		if(actualerrormassage.equalsIgnoreCase(expectederrormassage))
		{
			System.out.println("Both are Matching");
		}
		else
		{
			System.out.println("Both are Not Matching");
		}

	}

}
