package assign_a_2_Partial_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Netflix_SignIN {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*//FirefoxDriver driver=new FirefoxDriver();  
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or
		System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/

		driver.get("https://www.netflix.com/in/");	//Enter URL
		driver.findElement(By.linkText("Sign In")).click();	//
		System.out.println(driver.getTitle());		//getTitle
		driver.findElement(By.name("useloginId")).sendKeys("Ravi@gmail.com");
		
		
		
		
	}	

}
