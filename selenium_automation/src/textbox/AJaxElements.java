package textbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJaxElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//google suggestions
		
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		
		Thread.sleep(2000);
		
		List<WebElement> auto=	driver.findElement(By.className("left-pane-results-container")).findElements(By.tagName("div"));
		System.out.println(auto.size());
		for(WebElement list: auto)
		{
			
				System.out.println(list.getAttribute("aria-label"));
		}
		
		
		
		/*driver.get("https://google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("software");
		Thread.sleep(2000);
		
		List<WebElement> auto=	driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		
		System.out.println(auto.size());
		for(WebElement key:auto)
		{
			System.out.println(key.getText());
			if(key.getText().equalsIgnoreCase("software jobs for freshers"))
			{
				key.click();
				break;
			}
			*/
		}
		//driver.close();

		
	}


