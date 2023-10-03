package OPEN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		List<WebElement>  link=  driver.findElements(By.linkText("demo"));
		System.out.println(link.size());
		
		
		
		
		
		
		
		
		
		
		
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.linkText("Site Map")).click();
		
		List<WebElement> links=	driver.findElements(By.linkText("Home"));
		
		System.out.println(links.size());
		
		System.out.println(links.get(1).getAttribute("href"));
		System.out.println(links.get(0).getTagName());
		
		links.get(1).click();
		
		
		
		
		//driver.findElement(By.linkText("Home")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
