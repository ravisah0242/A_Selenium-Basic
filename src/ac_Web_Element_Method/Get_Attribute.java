package ac_Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement month=driver.findElement(By.id("month"));
		/*String attributevalue=month.getAttribute("name");
		System.out.println(attributevalue);*/
		//OR
		System.out.println(month.getAttribute("name"));
		
		
	}

}
