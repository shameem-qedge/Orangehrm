package checkbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flightcountnoofthecheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://flights.qedgetech.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		//List<WebElement>	checkbox=	driver.findElements(By.xpath("//input[@type='checkbox']"));
		//System.out.println(checkbox.size());
		
		WebElement box=	driver.findElement(By.id("flexCheckChecked"));
		
		if(!box.isSelected())
		{
			box.click();
		}
		
		Thread.sleep(2000);
		
		
		
		driver.close();

	}

}
