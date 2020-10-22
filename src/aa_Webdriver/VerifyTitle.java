package aa_Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:/QSSE11/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();
		//if(title.equals("google"));
		if(title.equalsIgnoreCase("google"))
		{
			System.out.println("title are match");
		}
		else
		{
			System.out.println("title are not match");
		}
	}

}
