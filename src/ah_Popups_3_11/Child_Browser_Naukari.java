package ah_Popups_3_11;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Naukari {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[.='Later']")).click();
		Set<String> a=driver.getWindowHandles();
		System.out.println(a.size());    //4 But we Get 3 Popup;
		
		ArrayList<String> al=new ArrayList<>(a);
		driver.switchTo().window(al.get(0));
		System.out.println(driver.getTitle());
		//driver.close(); 	//close Apisero where are control;
		
		driver.switchTo().window(al.get(1)); //1 Amazon;
		System.out.println(driver.getTitle());
		//driver.close();
		//System.out.println(driver.getTitle());  //  No Such Window Exception;

	}

}
