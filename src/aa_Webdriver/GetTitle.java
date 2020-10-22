package aa_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","E:/QSSE11/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();      //Ctrl+Shift+/-(Shortcuts key for Comment the code)
		System.out.println(title);
		//System.out.println(driver.getTitle());		// Not Print 

	}

}
