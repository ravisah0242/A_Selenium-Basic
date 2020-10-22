package assign_a_8_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Kumari_Like_Kumari_Juhi {

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
		driver.get("https://www.facebook.com/");
		WebElement fastname=driver.findElement(By.xpath("//input[@name='firstname']"));
		fastname.sendKeys("juhi");
		
		fastname.sendKeys(Keys.HOME);
		fastname.sendKeys("Kumari~");
		System.out.println(fastname.getAttribute("value"));

	}

}
