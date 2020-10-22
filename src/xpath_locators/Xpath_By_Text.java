package xpath_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
		//OR (Both are Same Result) Represent to current Page.
		//driver.findElement(By.xpath("//a[.='Forgotten account?']")).click();
		
		/*driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[.='Login ']")).click();*/
		
		driver.get("https://www.facebook.com");
		WebElement link=driver.findElement(By.xpath("//a[.='Forgotten account?']"));
		System.out.println(link.getText());
		link.click();
		driver.close();
		
		
		

	}

}
