package aa_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/QSSE11/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
