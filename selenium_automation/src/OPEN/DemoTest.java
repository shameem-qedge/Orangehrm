package OPEN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https:\\google.com");
		driver.navigate().to("http:\\facebook.com");
		
		Thread.sleep(2000);
		driver.close();
	}

}
