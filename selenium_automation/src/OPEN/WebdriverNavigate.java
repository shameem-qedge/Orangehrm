package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver;
		driver=new ChromeDriver();
		/*//open gmail
		driver.get("https:\\google.com");
		//open facebook
		driver.navigate().to("http:\\facebook.com");
		//browser navigations
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//close window
		
		driver.get("https://mail.google.com/");
		driver.findElement(By.linkText("Help")).click();
		//driver.close();*/
		
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.linkText("Help")).click();
		
		driver.close();
		//driver.close();
		driver.quit();
		
		

	}

}
