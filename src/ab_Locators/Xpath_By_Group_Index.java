package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_Group_Index {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]")).sendKeys("Xpath By Index (FB UN)");
		driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[2]")).sendKeys("passwoed");
		//*NOTE*-----Only Some matching Elements are there then go for (Xpath By Group Index).
		//And Index value Start from [1] , Not like java.
		// Can we use Multiple Attribute in a single Xpath expression;
		// yes. we can.
		//driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box'] [@data-testid='royal_email']")).sendKeys("RaviSah0242@gmail.com");
		
	}

}
