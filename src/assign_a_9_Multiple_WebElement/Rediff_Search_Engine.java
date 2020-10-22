package assign_a_9_Multiple_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_Search_Engine {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();  //For Firefox
		//OR
		//WebDriver driver=new FirefoxDriver();   //Up casting. organization used this
		//or   For IE
		/*System.setProperty("webdriver.ie.driver", "D:/QSSE10/IEDriverServer_x64_2.52.0/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("tab");
		Thread.sleep(5000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'tab')]"));
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)   
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("tab"))
			{
				suggestions.get(i).click();
				System.out.println(driver.getTitle());
				break;
			}
			else    
			{
				System.out.println("suggestions not Found");
			}
		}	

	}

}
