package winAppDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.windows.WindowsDriver;

public class wordtopdf 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.ilovepdf.com/");
		driver.findElement(By.xpath("//a[@title='Word to PDF']")).click();
		
		driver.findElement(By.linkText("Select WORD files")).click();
		
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setCapability("app", "Root");
		
	//	WindowsDriver windriver=new WindowsDriver(new URL("http://127.0.0.1:4723"), cap);
		
	//	windriver.findElement(By.xpath("//Edit[@Nmae='File name:']")).sendKeys("C:\\Users\\SHAMEEM\\Documents\\sample.docx");
		
		
		
		
		

	}

}
