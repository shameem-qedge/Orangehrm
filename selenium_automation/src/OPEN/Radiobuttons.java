package OPEN;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		
		WebElement element=  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]"));
		List<WebElement> radiobuttons= 	element.findElements(By.xpath("//*[@dir='auto']"));
		System.out.println(radiobuttons.size());
		for(WebElement links: radiobuttons)
			{
				System.out.println(links.getText());
			}

	}

}
