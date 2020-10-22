package assign_a_4_Xpath_BY_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC_Enter_Detals {

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
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//input[@placeholder='From*']")).sendKeys("DELHI - DLI");
		driver.findElement(By.xpath("//input[@placeholder='To*']")).sendKeys("PATNA JN - PNBE");
		//pop Up Box ?
		//select option ?
		
		driver.findElement(By.xpath("//input[@placeholder='Journey Date(dd-mm-yyyy)*']")).sendKeys("25-07-2020");
		driver.findElement(By.xpath("//label[@class='ng-tns-c11-6 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")).sendKeys("AC 2 Tier(2A)");
		driver.findElement(By.xpath("Find Trains")).click();
		
	}

}
