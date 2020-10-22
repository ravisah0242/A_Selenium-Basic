package ac_Web_Element_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hight_Weoght_Image_Myntra {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebElement image= driver.findElement(By.xpath("//img[contains(@src,'https://assets.myntassets.com/w_980,c_limit,"
				+ "fl_progressive,dpr_2.0/assets/images/2020/7/19/c33c208f-5062-409d-af4d-a089332a41121595177576934-"
				+ "Ethnic_Desk.jpg')]"));
		
				//xpath by containts; for Image Syntax ??
		System.out.println(image.getSize().getHeight());
		System.out.println(image.getSize().getWidth());
		
	}

}
