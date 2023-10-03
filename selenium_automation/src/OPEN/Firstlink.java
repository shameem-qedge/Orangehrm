package OPEN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	//	System.out.println(driver.findElement(By.tagName("a")).getText());
		
		List<WebElement> links=  driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		System.out.println(links.get(0).getText());
		
		System.out.println(links.get(24).getAttribute("href"));
		
		driver.close();

	}

}
