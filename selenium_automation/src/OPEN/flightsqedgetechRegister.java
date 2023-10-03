package OPEN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightsqedgetechRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		driver.findElement(By.xpath("//input[@name='price_class' and @value='Business']")).click();
		
		
		
		
	
		
		
		driver.get("http://flights.qedgetech.com/register.html");
		List<WebElement> textbox=    driver.findElements(By.xpath("//input"));
		
		System.out.println(textbox.size());
	

	}

}
