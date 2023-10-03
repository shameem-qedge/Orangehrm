package OPEN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealcarticon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		//All elements present in the current webpage
		List<WebElement>  icons=  driver.findElements(By.xpath("//*"));
		//total item present in the current webpage
		System.out.println(icons.size());
		//for each element printing its tagname
		for(WebElement item:icons)
		{
			System.out.println(item.getTagName());
		}
		

		//driver.findElement(By.xpath("/html/body/div[2]/div[4]/div[2]/div/div[3]/div[1]/div/i")).click();
	}

}
