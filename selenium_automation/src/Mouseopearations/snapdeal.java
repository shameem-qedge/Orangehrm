package Mouseopearations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://snapdeal.com/");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Home & Kitchen")));
		act.build().perform();
		//context click
		act.contextClick(driver.findElement(By.linkText("Chimneys")));
		act.build().perform();
		
	}
}
