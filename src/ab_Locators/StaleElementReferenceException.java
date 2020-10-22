package ab_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement link=driver.findElement(By.linkText("Forgotten account?"));
		link.click();
		System.out.println(link.getText());	
		
		//error
		
		//this line error--->element is not attached to the page document
		 // (Session info: chrome=83.0.4103.116)
		/*WebElement linknew=driver.findElement(By.linkText("Forgotten account?"));
		System.out.println(linknew.getText());*/
		
	}

}
