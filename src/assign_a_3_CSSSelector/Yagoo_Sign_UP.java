package assign_a_3_CSSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yagoo_Sign_UP {

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
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.findElement(By.cssSelector("input[id='usernamereg-firstName']")).sendKeys("Ravi");
		driver.findElement(By.cssSelector("input[id='usernamereg-lastName']")).sendKeys("Sah");
		driver.findElement(By.cssSelector("input[id='usernamereg-yid']")).sendKeys("ravisah0242@yahoo.com");
		driver.findElement(By.cssSelector("input[id='usernamereg-password']")).sendKeys("12345678");
		driver.findElement(By.cssSelector("input[id='usernamereg-phone']")).sendKeys("888502726255252");
		driver.findElement(By.cssSelector("select[id='usernamereg-month']")).sendKeys("April");
		driver.findElement(By.cssSelector("input[id='usernamereg-day']")).sendKeys("25");
		driver.findElement(By.cssSelector("input[id='usernamereg-year']")).sendKeys("1996");
		driver.findElement(By.cssSelector("input[id='usernamereg-freeformGender']")).sendKeys("Male");
		

	}

}
