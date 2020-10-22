package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AntitimeUN_PWD_Enter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']")).click();
		//WebElement link=driver.findElement(By.linkText("loginButton "));		//?????
		driver.findElement(By.id("loginButton")).click();
		//Or
		//driver.findElement(By.linkText("......")).click(); //Serch for More
		//driver.findElement(By.partialLinkText("Login ")).click();
		//WebElement link=driver.findElement(By.linkText("Login "));
		//link.click();		 //wait for sometime 
		//driver.quit();

	}

}
