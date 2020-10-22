package assign_a_2_Partial_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Antitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		/*driver.findElement(By.partialLinkText("textField")).sendKeys("admin");
		driver.findElement(By.partialLinkText("textField pwdfield")).sendKeys("manager");
		driver.findElement(By.partialLinkText("keepLoggedInCheckBox")).click();*/   	//These are not work?
		driver.findElement(By.partialLinkText("Login ")).click();		//when put Space then not work ?
		
		//*NOTE*---Space are NOT Allow in PartialLinkTest.
		//driver.navigate().back();
		//driver.findElement(By.partialLinkText("Forgot your password?")).click();  //Accept Space ?
		//driver.quit();

	}

}
