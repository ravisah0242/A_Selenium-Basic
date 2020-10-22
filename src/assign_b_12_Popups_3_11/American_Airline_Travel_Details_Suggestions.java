package assign_b_12_Popups_3_11;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class American_Airline_Travel_Details_Suggestions {
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
		for(int i=0; i<=suggestions.size(); i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("San Jose (SJO), Costa Rica"))
			{
				suggestions.get(i).click();
				break;
			}
		}
		WebElement tocity=driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
		tocity.sendKeys("san");
		Thread.sleep(5000);
		List <WebElement> suggestions1=driver.findElements(By.xpath("//a[.='San Juan (SJU), Puerto Rico']"));
		//List <WebElement> suggestions1=driver.findElements(By.xpath("//a[contains(text(),'San Juan']"));
		System.out.println(suggestions1.size());
		for(int i=0; i<=suggestions1.size(); i++)
		{
			if(suggestions1.get(i).getText().equalsIgnoreCase("San Juan (SJU), Puerto Rico"))
			{
				suggestions1.get(i).click();
				break;
			}
		}
		
		WebElement list= driver.findElement(By.xpath("//select[@name='adults']"));
		Select sel=new Select(list);
		sel.selectByVisibleText("3");
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		for(int i=0; i<=2;  i++)  //when we click next button 2 time thats why go for Loop;
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		driver.findElement(By.xpath("(//a[.='30'])[2]")).click();
		
		WebElement list1=driver.findElement(By.xpath("//select[@name='children']"));
		Select sel1=new Select(list1);
		sel1.selectByValue("2");
		driver.findElement(By.id("bookingModule-submit")).click();
		
		
	}

}
