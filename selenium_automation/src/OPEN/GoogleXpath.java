package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https:\\google.com");
		
		
		//to click the google apps
		
		driver.findElement(By.xpath("//*[@aria-label='Google apps']")).click();

	}

}
