package assign_a_4_Xpath_BY_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix_SignIN_Details_Nevigate_Back {

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
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.xpath("//a[@class='authLinks redButton']")).click();
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("raviranjankumar54334@gmailcom");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("988765@gghh");
		driver.navigate().back();
		driver.findElement(By.xpath("(//input[@id='id_email'])[1]")).sendKeys("racyhgff@gmail.com"); //Xpath By Group Index.
		driver.findElement(By.xpath("(//span[@class='cta-btn-txt'])[1]")).click();	// Xpath By Group Index;
		driver.findElement(By.xpath("(//button[@class='nf-btn nf-btn-primary nf-btn-solid nf-btn-oversize'])[1]")).click();
		
		
	}

}
