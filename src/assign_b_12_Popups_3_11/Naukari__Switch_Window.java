package assign_b_12_Popups_3_11;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari__Switch_Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> a=driver.getWindowHandles();
		System.out.println(a.size());    
		System.out.println(driver.getTitle());
		
		ArrayList<String> al=new ArrayList<>(a);
		System.out.println("******2*****"); 
		driver.switchTo().window(al.get(2)); 
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		//Set<String> b=driver.getWindowHandles();
		driver.switchTo().window(al.get(1));
		System.out.println("******1*******");  
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		driver.close();
		
		
		driver.switchTo().window(al.get(0));
		System.out.println("*********");
		System.out.println(driver.getTitle());
		driver.close();
		
		/*driver.switchTo().window(al.get(2)); 
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		System.out.println(driver.getTitle());
		driver.close();
		Set<String> apisero=driver.getWindowHandles();
		System.out.println(apisero.size());
		ArrayList<String> a2=new ArrayList<>(apisero);
		driver.switchTo().window(a2.get(2)); 
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(a2.get(1)); 
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(a2.get(0)); 
		System.out.println(driver.getTitle());
		driver.close();*/
		
		
	}

}
