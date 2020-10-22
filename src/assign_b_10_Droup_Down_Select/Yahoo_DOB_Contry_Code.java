package assign_b_10_Droup_Down_Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo_DOB_Contry_Code {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/QSSE10/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/account/create?.lang=en-US&src=help&.done=https%3A%2F%2Fhelp.yahoo.com%2Fkb%2Fsign-account-sln2056.html%3Fguccounter%3D1%26guce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAFdI_1d51kisvVX8PySz3Kk8iy0Gr_UkFzCEC-0W4Bs_Xqr6zwUztc2LFz780tvvwqu54eDksqPCJCSQXpGIT4BaBeoM38SXqJrXkdcKElvvcXR47EwNHUIgiV8XqumkY6b-h1lpxHV7tVFJfvMgFCcr6M11yBOdk-ELCm_DH0uV&specId=yidReg");
		WebElement contrycode=driver.findElement(By.xpath("//select[@name='shortCountryCode']"));
		Select Ccode=new Select(contrycode);
		Ccode.selectByVisibleText("United Kingdom ‪(+44)‬");
		WebElement day=driver.findElement(By.xpath("//input[@name='dd']"));
		day.sendKeys("25");
		//Select sel=new Select(day);
		//sel.selectByVisibleText("25");
		WebElement month=driver.findElement(By.xpath("//select[@name='mm']"));
		Select sel1=new Select(month);
		sel1.selectByIndex(4);
		WebElement year=driver.findElement(By.xpath("//input[@name='yyyy']"));
		year.sendKeys("1996");
		//Select sel2=new Select(year);
		

	}

}
