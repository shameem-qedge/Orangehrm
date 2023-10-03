package links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noofthelinkspresentinthepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		driver.get("https://www.youtube.com/");
		
		List<WebElement> links=	driver.findElements(By.xpath("//input"));
		
		System.out.println("No of the links present in the page "+links.size());
		
		for(WebElement url:links)
		{
			System.out.println(url.getText() +"     "+ url.getAttribute("href"));
		}
		
		
	}

}
