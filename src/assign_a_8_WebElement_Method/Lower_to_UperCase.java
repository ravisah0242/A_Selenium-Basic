package assign_a_8_WebElement_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lower_to_UperCase {

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
		
		//fastname.sendKeys(Keys.CONTROL,"a");
		String val=fastname.getAttribute("value").toUpperCase();
		fastname.sendKeys(Keys.CONTROL,"a");
		fastname.sendKeys(val);
		System.out.println(val);
		
		WebElement gender=driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		System.out.println(gender.isDisplayed());
		System.out.println(gender.isEnabled());
		System.out.println(gender.isSelected());
		gender.click();
		System.out.println(gender.isDisplayed());
		System.out.println(gender.isEnabled());
		System.out.println(gender.isSelected());
		
		
	}

}
