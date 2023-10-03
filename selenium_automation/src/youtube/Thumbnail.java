package youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thumbnail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:youtube.com/");
		List<WebElement> links=	driver.findElements(By.xpath("//*[@id='video-title-link']"));
		for(WebElement a:links)
		{
			System.out.println(a.getAttribute("title")   +" 		" + a.getAttribute("href"));
			String s=a.getAttribute("title");
			if(s.contains("Chandrayaan"))
			{
				a.click();
			}
		
		}
		
		
		
		
	}}