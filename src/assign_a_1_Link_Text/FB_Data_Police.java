package assign_a_1_Link_Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class FB_Data_Police {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		//FirefoxDriver driver=new FirefoxDriver();  
		//OR
		WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/

		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Data Policy")).click();
		//driver.quit();
		
	}

}
