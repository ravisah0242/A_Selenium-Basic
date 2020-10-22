package ai_Micellaneous;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Add_Extansion {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addExtensions(new File("E:/Tutorial Beigenar/QSpider Tutorial Lecture/Selenium By Jyoti Prakash/Extension/extension_1_17_36_0_Momentum.crx"));
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
