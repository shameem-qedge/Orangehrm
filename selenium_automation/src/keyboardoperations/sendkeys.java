package keyboardoperations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sendkeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("shameemm");
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.BACK_SPACE);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.TAB);
		driver.findElement(By.id("APjFqb")).sendKeys("shameemm");
		
		/*driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.SHIFT);
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.F3);*/
		
		
	//	driver.findElement(By.id("APjFqb")).sendKeys(Keys.CONTROL+"c");
		
		//(JavascriptExecutor)driver;
		
		//driver.findElement(By.id("APjFqb")).sendKeys(Keys.ESCAPE);
		
		
		//driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
		
	}

}
