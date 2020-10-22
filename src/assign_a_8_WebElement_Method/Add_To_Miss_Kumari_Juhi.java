package assign_a_8_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_To_Miss_Kumari_Juhi {

	public static void main(String[] args) throws InterruptedException {
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
		fastname.sendKeys("Juhi ~");
		fastname.sendKeys(Keys.HOME);
		fastname.sendKeys("Miss:- ");
		fastname.sendKeys(Keys.END);
		fastname.sendKeys(" kumari");
					
		System.out.println(fastname.getAttribute("value"));
		Thread.sleep(5000);
		driver.close();

	}

}
