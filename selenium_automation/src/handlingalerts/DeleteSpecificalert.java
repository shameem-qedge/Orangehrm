package handlingalerts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteSpecificalert {

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
		
		String empid="7571";
		
		WebElement table=driver.findElement(By.className("flights_table"));
		List<WebElement> rows=	table.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> col=	rows.get(i).findElements(By.tagName("td"));
			String emp=col.get(0).getText();
			if(emp.equals(empid))
					{
						col.get(9).findElement(By.linkText("Delete")).click();
						
						driver.switchTo().alert().accept();
						
					}
			
			
		}
		

	}

}
