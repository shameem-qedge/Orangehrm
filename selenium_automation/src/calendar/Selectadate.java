package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectadate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com/");
		
	/*	driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();*/
		
		//using sendkeys....
		
		
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("popupDatepicker")).click();
		
		String dob="7-Oct-1994";
		String temp[]=	dob.split("-");
		String date=temp[0];
		String mon=temp[1];
		String yr=temp[2];
		
		Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByValue(yr);
		
		Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText(mon);
		
		WebElement table=driver.findElement(By.className("ui-datepicker-calendar"));
		
		List<WebElement> rows=	table.findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> dates=	rows.get(i).findElements(By.tagName("td"));
			for(WebElement d:dates)
			{
				if(d.getText().equals(date))
				{
					d.click();
				}
			}
		}
		
		
		
		
		
		
		
		
		
		//using sendkeys.....
		
		//driver.findElement(By.id("popupDatepicker")	).sendKeys("7-10-1994");
		
		
		

}
}
