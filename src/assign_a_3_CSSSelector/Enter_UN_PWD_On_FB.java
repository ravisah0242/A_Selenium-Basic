package assign_a_3_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Enter_UN_PWD_On_FB {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("raviranjan72847@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345678");
		driver.findElement(By.linkText("Log In")).click();
		driver.close();
	}

}
