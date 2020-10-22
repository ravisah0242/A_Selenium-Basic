package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_UN_PWD_FB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		// Not work    driver.findElement(By.cssSelector("input[class='inputtextlogin_form_input_box']")).sendKeys("raviranjan72847@gmail.com");
		// Not work    driver.findElement(By.cssSelector("input[class='inputtext login_form_input_box']")).sendKeys("23415678");
		//or
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("raviranjan72847@gmail.com");
		//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("23415678");
		//or
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("raviranjan72847@gmail.com");
		//driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("23415678");
		//or
		driver.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("raviranjan72847@gmail.com");
		driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("r9507090169");
		driver.findElement(By.cssSelector("input[aria-label='Log In']")).click();
		
		//driver.findElement(By.id("Log In")).click();
		//driver.findElement(By.partialLinkText("Log In")).click();		
		//driver.quit();		//wait for samtime then close ??
	}

}
