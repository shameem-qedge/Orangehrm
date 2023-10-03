package OPEN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		// all elements present in the Amazon page
		
		driver.get("https://www.amazon.com/");
		List<WebElement> images =driver.findElements(By.xpath("//*"));
		System.out.println(images.size());

	}

}
