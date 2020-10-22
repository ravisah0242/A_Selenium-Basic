package assign_a_7_DI_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIN_Actitime_DI_Xpath {

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
		driver.get("https://demo.actitime.com/login.do");
		//Xpath By Forward Traversing;
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		//Xpath By Attribute;
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@name='remember']")).click();
		//Xpath By Group Index;
		driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
		Thread.sleep(5000);
		//Group By Index;
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[2]")).click();
		//Xpath By Contains;
		driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]")).click();
		//Xpath By Text;
		driver.findElement(By.xpath("//span[.='Create Type of Work']")).click();
		//Xpath By Attribute;
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Dolly");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Xpath DI(dependent Independent Xpath)--->Dolly is Static and Delete is dynamic
		driver.findElement(By.xpath("//a[text()='Dolly']/../..//a[contains(text(),'delete')]")).click();
		
	}

}
