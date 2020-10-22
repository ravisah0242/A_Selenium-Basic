package ah_Popups_3_11;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window_Handle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		//driver.findElement(By.xpath("//span[.='Later']")).click(); //can not Handle ?
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		Set<String> windowhaldles=driver.getWindowHandles();
		System.out.println(windowhaldles);
		
		

	}

}
