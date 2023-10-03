package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openindifferentbrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "msedgedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		//driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.linkText("Create an account")).click();
		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(2000);
		
		
		driver.close();
		
		//driver.navigate().back();
		
	

	}

}
