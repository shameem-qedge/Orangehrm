package textbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusAjax {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("Hydera");
		
		Thread.sleep(2000);
		
		WebElement ui= driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[1]/div/div[1]/ul"));
		List<WebElement> li=driver.findElements(By.tagName("li"));
		System.out.println("elements in the source field");
		System.out.println(li.size());
		for(WebElement list: li)
		{
			System.out.println(list.getText());
		}

		
		driver.findElement(By.id("dest")).sendKeys("vijaya");
		Thread.sleep(2000);
		WebElement element=	driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[1]/div/div[3]/div[1]/ul"));
		List<WebElement> list= element.findElements(By.tagName("li"));
		System.out.println("Element in the dest");
		System.out.println(list.size());
		for(WebElement key:list)
		{
			System.out.println(key.getText());
		}
	}

}
