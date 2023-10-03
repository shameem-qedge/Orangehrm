package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmaillinkWorkingornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https:\\google.com");
		driver.findElement(By.linkText("Gmail")).click();
		//CAPTURE CURRENT URL OF PAGE
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("gmail"))
		{
			System.out.println("Test PASS");
		}
		else
		{
			System.out.println("TEST FAIL");
		}

	}

}
