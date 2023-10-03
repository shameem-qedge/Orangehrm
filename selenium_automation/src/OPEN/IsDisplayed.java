package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		try {
			
			WebElement link =driver.findElement(By.linkText("shameem"));
		
			System.out.println("Gmail link [present in the webpage");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("not present in the page");
			//System.out.println(e.getMessage());
		}
	
		driver.close();
	}

}
