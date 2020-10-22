package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMultipaleTab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		
	}

}
