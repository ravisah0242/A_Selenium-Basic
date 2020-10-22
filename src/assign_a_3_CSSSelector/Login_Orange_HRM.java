package assign_a_3_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Orange_HRM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input[name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[id='btnLogin']")).click();
		 

	}

}
