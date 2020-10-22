package af_Mouse_Operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Droup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source= driver.findElement(By.xpath("(//div[.='Seoul'])[2]"));
		WebElement target=driver.findElement(By.xpath("//div[.='South Korea']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		

	}

}
