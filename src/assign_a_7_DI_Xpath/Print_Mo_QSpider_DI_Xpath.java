package assign_a_7_DI_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Mo_QSpider_DI_Xpath {

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
		driver.get("http://qspiders.com/contact");
		WebElement Text=driver.findElement(By.xpath("(//a[.='Noida'])[2]/../../..//div[contains(text(),'+91-9810072392')]"));
		WebElement Text1=driver.findElement(By.xpath("(//a[.='BTM Layout'])[2]/../../..//div[contains(text(),'+91')]"));
		WebElement Text2=driver.findElement(By.xpath("(//a[.='Chennai - Chromepet'])[2]/../../..//div[contains(text(),'+91')]"));
		WebElement Text3=driver.findElement(By.xpath("//a[.='Qspiders Us']/../../..//div[contains(text(),'+1 (415) ')]"));
		
		System.out.println(Text.getText());
		System.out.println(Text1.getText());
		System.out.println(Text2.getText());
		System.out.println(Text3.getText());
		
	}

}
