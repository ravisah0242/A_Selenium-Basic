package ad_Multiple_WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.google.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggestions.size());
		//Print all the suggestions;
		
		/*for(int i=0; i<suggestions.size();i++)
		{
			System.out.println(suggestions.get(i).getText());
			suggestions.get(2).click();  //:--->  stale element reference :element is not attached to the page document
			  (Session info: chrome=83.0.4103.116)
		}
		suggestions.get(2).click();*/
		
		for(int i=0;i<suggestions.size();i++)   //Most Recomdade go for its;
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium interview questions"))
			{
				suggestions.get(i).click();
				System.out.println(driver.getTitle());
				/*//System.out.println(suggestions.get(i).getText());//stale element reference: element is not attached to the page document
				  (Session info: chrome=83.0.4103.116)*/
				break;
			}
			else    // its no need; ---> BZ Memory Consume; 
			{
				System.out.println("suggestions not Found");
			}
		}		
	}

}
