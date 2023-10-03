package OPEN;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubeautosuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("telugu movies");
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		WebElement auto=driver.findElement(By.className("sbsb_b"));
		List<WebElement> sugg=	auto.findElements(By.tagName("li"));
		System.out.println(sugg.size());
		
		//String s="telugu movies all";

		for(WebElement a: sugg)
		{
			
			
			if(a.getText().contains("new"))
					{
						a.click();
						//driver.findElement(By.xpath("//*[@id='video-title' and @title='Skanda Trailer (Telugu) | Ram Pothineni, Sree Leela | Boyapati Sreenu | Thaman S | SS Screens']")).click();
						break;
					}
			
			
			
		}
		
	}

}
