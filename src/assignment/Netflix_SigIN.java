package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_SigIN {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.linkText("Sign In")).click();
		
		//driver.findElement(By.linkText("))"
		//driver.findElement(By.partialLinkText("))
		
		driver.findElement(By.cssSelector("input[id='id_userLoginId']")).sendKeys("raviranjan72847@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[id='bxid_rememberMe_true']")).click();		//how to un Checked
		
		/*JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",checkBox   );*/
		
		driver.findElement(By.linkText("Need help?")).click();
		//OR
		driver.findElement(By.partialLinkText("Need help?")).click();
		driver.findElement(By.cssSelector("input[id='forgot_password_input']")).sendKeys("rajsah0002@gmail.com");
		driver.navigate().back();
		//driver.findElement(By.linkText("Sign up now")).click();
		driver.findElement(By.partialLinkText("Sign up now")).clear();
		driver.findElement(By.cssSelector("input[id='id_email']")).sendKeys("raviranjan72847@gmail.com");
		driver.close();
		 
	}

}
