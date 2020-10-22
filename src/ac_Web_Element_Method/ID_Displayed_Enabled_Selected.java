package ac_Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Displayed_Enabled_Selected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());

	}

}
