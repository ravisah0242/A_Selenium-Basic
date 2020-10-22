package ai_Micellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Tooltip 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement birthdaytooltip = driver.findElement(By.id("birthday-help"));
		String actualtooltiptext= birthdaytooltip.getAttribute("title");
		if(actualtooltiptext.equalsIgnoreCase("Click for more information"))
		{
			System.out.println("tooltip Matching Expected Result");
		}
		else
		{
			System.out.println("tooltip Not Matching Expected Result");
		}
	}
}
