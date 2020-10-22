package ai_Micellaneous;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Verify_Error_Massage {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		//options.addExtensions(new File("E:/Tutorial Beigenar/QSpider Tutorial Lecture/Selenium By Jyoti Prakash/Extension/extension_6_1_7_0_Cropath.crx"));
		options.addExtensions(new File("E:/Tutorial Beigenar/QSpider Tutorial Lecture/Selenium By Jyoti Prakash/Extension/extension_1_17_36_0_Momentum.crx"));
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		//WebElement errormassage= driver.findElement(By.xpath("//div[.='Enter an email or phone number']"));
		WebElement errormassage= driver.findElement(By.xpath("//div[@class='dEOOab RxsGPe']"));
		String actualerrormassage=errormassage.getText();
		//String expectederrormassage="utkarsh";
		String expectederrormassage="Enter an email or phone number";
		
		if(actualerrormassage.equalsIgnoreCase(expectederrormassage))
		{
			System.out.println("Both are Matching");
		}
		else
		{
			System.out.println("Both are Not Matching");
		}
		
		/*//WebElement errormassage= driver.findElement(By.xpath("//div[.='Enter an email or phone number']"));
		WebElement errormassage= driver.findElement(By.xpath("//div[@class='dEOOab RxsGPe']"));
		
		//String actualerrormassage=errormassage.getText();
		String actualerrormassage=errormassage.getAttribute("innerHTML"); //TestNG part
		
		String expectederrormassage="utkarsh";
		//String expectederrormassage="Enter an email or phone number";
		if(actualerrormassage.equalsIgnoreCase(expectederrormassage))
		{
			System.out.println("Both are Matching");
		}
		else
		{
			System.out.println("Both are Not Matching");
		}*/
	}

}
