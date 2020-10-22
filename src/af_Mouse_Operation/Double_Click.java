package af_Mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement forgotpassword= driver.findElement(By.xpath("//a[.='Forgot your password?']"));
		Actions act=new Actions(driver);
		act.doubleClick(forgotpassword).perform();
		//act.doubleClick(forgotpassword);	//if we used then no perform task;
	}

}
