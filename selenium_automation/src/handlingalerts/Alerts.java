package handlingalerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com/");
		
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.linkText( "Flight Bookings")).click();
		
	
		
		driver.findElement(By.linkText("Delete")).click();
		
		String alertmsg=driver.switchTo().alert().getText();
		
		System.out.println(alertmsg);
		if(alertmsg.contains("Delete"))
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			driver.switchTo().alert().dismiss();
		}
		
		/*driver.switchTo().alert().dismiss();
		

		driver.findElement(By.linkText("Delete")).click();
		
		driver.switchTo().alert().accept();*/
		
	}

}
