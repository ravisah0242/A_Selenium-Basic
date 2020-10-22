package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocatorEnter_UN_PWD_FB {

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
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("raviranjan72847@gmail.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("950709016");
		driver.findElement(By.partialLinkText("Log In")).click();		//when without space in Log In not work ?
		/*WebElement link=driver.findElement(By.linkText("Log In"));
		link.click();*/		 
		driver.quit();		//wait for samtime then close ??
		
	}

}
