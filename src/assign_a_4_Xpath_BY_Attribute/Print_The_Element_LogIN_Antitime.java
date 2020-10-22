package assign_a_4_Xpath_BY_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_The_Element_LogIN_Antitime {

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
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@value='on']")).click();
		driver.findElement(By.xpath("//a[@class='initial']")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandles());
		driver.close();

	}

}
