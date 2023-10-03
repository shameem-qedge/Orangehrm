package OPEN;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textboxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com/register.html");
		List<WebElement> text=	driver.findElements(By.xpath("//input[@type='text' or @type='password' or @type='email' or @type='number']"));
		System.out.println(text.size());
		for(WebElement boxs: text)
		{
			System.out.println(boxs.getAttribute("placeholder"));
		}
		

	}

}
