package ah_Popups_3_11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class From_City_To_American_Airlne {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in/intl/in/index.jsp?locale=en_IN");
		WebElement fromcity= driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		fromcity.sendKeys("san");
		Thread.sleep(5000);
		//List <WebElement> suggestions =driver.findElements(By.xpath("//a[.='San Jose (SJO), Costa Rica']"));
		List <WebElement> suggestions = driver.findElements(By.xpath("//a[contains(text(),'San Jose')]"));
		System.out.println(suggestions.size());
		//suggestions.get(5).click();   //----> For Index;
		//OR
		/*for(int i=0; i<=5; i++) 
		{
			Thread.sleep(2000);
			fromcity.sendKeys(Keys.ARROW_DOWN);
		}
		fromcity.sendKeys(Keys.ENTER);*/
		//OR ---> Best way
		for(int i=0; i<=suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("San Jose (SJO), Costa Rica"))
			{
				suggestions.get(i).click();
				break;
			}
		}
		
	}

}
