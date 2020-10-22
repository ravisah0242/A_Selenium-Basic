package assign_a_4_Xpath_BY_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Myntra_web_Element {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[@data-group='essentials']")).click();
		System.out.println(driver.getTitle());

	}

}
