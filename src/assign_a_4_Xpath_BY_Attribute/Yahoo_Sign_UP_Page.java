package assign_a_4_Xpath_BY_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Sign_UP_Page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ravi");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Sah");
		driver.findElement(By.xpath("//input[@name='yid']")).sendKeys("ravisah0242@gmail.com");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("87654321");
		driver.findElement(By.xpath("//input[@aria-multiline='false']")).sendKeys("9887765544");
		driver.findElement(By.xpath("//select[@id='usernamereg-month']")).sendKeys("April");	//input to select
		driver.findElement(By.xpath("//input[@aria-label='Birthday']")).sendKeys("21");
		driver.findElement(By.xpath("//input[@placeholder='Year']")).sendKeys("1996");
		driver.findElement(By.xpath("//input[@placeholder='Gender (optional)']")).sendKeys("Male");
		
	}

}
