package assign_a_9_Multiple_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Text_Link_And_URL_Of_GSMARENA {

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
		driver.get("https://www.gsmarena.com/");
		List<WebElement> links=driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		links.get(5).click();
		//links.get(2).click();
		//System.out.println(links.get(8).getText());
		for(int i=0;  i<links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
			System.out.println(driver.getCurrentUrl());
			
		}

	}

}
