package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("shannu");
		//driver.findElement(By.xpath("//input[contains(@placeholder,'phone')]")).sendKeys("shannu");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("shannu");
		driver.findElement(By.id("pass")).sendKeys("shannu");
		
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
		
		driver.close();
	}
	
}
