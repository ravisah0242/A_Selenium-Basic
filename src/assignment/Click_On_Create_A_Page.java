package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_On_Create_A_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.linkText("Create a Page")).click();
		//OR
		driver.findElement(By.partialLinkText("Create a Page")).click();
		
		//driver.findElement(By.ByLinkText)	???		//for selenium class;
		
	}

}
