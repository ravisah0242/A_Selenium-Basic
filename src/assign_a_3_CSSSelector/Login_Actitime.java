package assign_a_3_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Actitime {

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
		driver.get("demo.actitime.chttps://om/login.do");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[id='keepLoggedInCheckBox']")).click();
		String id;
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		//driver.findElement(By.cssSelector(id="Login ")).click();
		
		//driver.findElement(By.id("loginButton")).click(); //done with this.
		//driver.findElement(By.partialLinkText("loginButton")).click();
		
	}

}
