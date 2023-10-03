package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarwithNextbuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com/");
		
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.id("search-date")).click();
		
		String flydate="20-September-2024";
		String temp[]=	flydate.split("-");
		
		String date=temp[0];
		String mon=temp[1];
		String year=temp[2];
		
		
		
		String cur_year=driver.findElement(By.className("ui-datepicker-year")).getText();

		while(!cur_year.equals(year))
		{
			driver.findElement(By.linkText("Next")).click();
			cur_year=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		
		
		String cur_month=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!cur_month.equalsIgnoreCase(mon))
		{
			driver.findElement(By.linkText("Next")).click();
			cur_month=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement table=	driver.findElement(By.className("ui-datepicker-calendar"));
		
		List<WebElement> rows=	table.findElements(By.tagName("tr"));
			
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> col=	rows.get(i).findElements(By.tagName("td"));
			for(WebElement d:col)
			{
				if(d.getText().equals(date))
				{
					d.click();
				}
			}
		}
			
	}

}
