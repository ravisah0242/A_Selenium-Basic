package assign_a_3_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Netflix_LogIn {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.cssSelector("a[data-uia='header-login-link']")).click(); //How to select SignIN Button with CSSSelector.
		
		//driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.cssSelector("input[id='id_userLoginId']")).sendKeys("raviranjan72847@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("12345678");
		WebElement checkbox= driver.findElement(By.id("bxid_rememberMe_true"));
		Actions act=new Actions(driver);
		act.click(checkbox).perform();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[id='id_email_hero_fuji']")).sendKeys("rajsah24225@gmail.com");
		//driver.close();
		
	}

}
