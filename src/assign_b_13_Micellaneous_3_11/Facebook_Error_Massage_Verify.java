package assign_b_13_Micellaneous_3_11;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Error_Massage_Verify {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Raviranjankumar005@gmaiil.com");
		driver.findElement(By.xpath("//input[@aria-label='Log In']")).click();
		
		WebElement errormassage= driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
		String actualerrormassage=errormassage.getText();
		//String expectederrormassage="invailid";
		String expectederrormassage="The password that you've entered is incorrect. ";
		
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
