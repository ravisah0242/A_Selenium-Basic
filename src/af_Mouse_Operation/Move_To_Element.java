package af_Mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {			//Mouse Hover;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement essantials= driver.findElement(By.xpath("//a[.='Essentials']"));
		WebElement mask= driver.findElement(By.xpath("//a[.='Essentials']"));
		Actions act=new Actions(driver);
		act.moveToElement(essantials).perform();
		Thread.sleep(2000);
		act.moveToElement(mask).click(mask).perform();
		

	}

}
