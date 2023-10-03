package Radiobuttons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countnooftheradiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		List<WebElement> radio=	driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radio.size());
		
		boolean x=radio.get(0).isDisplayed();
		System.out.println(x);
		boolean y=radio.get(0).isEnabled();
		System.out.println(y);
		boolean z=radio.get(0).isSelected();
		System.out.println(z);
		for(WebElement button:radio)
		{
			System.out.println(button.getAttribute("name"));
			
		}
		
		
		
		
	}

}
