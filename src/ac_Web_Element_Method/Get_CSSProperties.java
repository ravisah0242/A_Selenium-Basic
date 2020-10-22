package ac_Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_CSSProperties {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		System.out.println(username.getCssValue("font-size"));
		System.out.println(username.getCssValue("color"));
		System.out.println(username.getCssValue("font-family"));
	}

}
