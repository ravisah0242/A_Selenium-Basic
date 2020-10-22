package assign_a_3_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_Mo_New_PWD_On_FB {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		  //FirefoxDriver driver=new FirefoxDriver();  //For Firefox 
		 //OR
		 //WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		 //or ForIE
		//System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		//WebDriver driver=new InternetExplorerDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.cssSelector("input[id='u_0_r']")).sendKeys("87655676898");
		 driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("rana@123455");
		 //driver.close();
	}

}
