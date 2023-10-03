package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Images")).click();
		
		String pgtitle=	 driver.getTitle();
		System.out.println(pgtitle);
		if(pgtitle.equalsIgnoreCase("Google images"))
		{
			System.out.println("google image is opened");
			System.out.println("TEST PASS");
		}
		else {
			System.out.println("page not opened");
			System.out.println("test fail");
		}

	}

}
