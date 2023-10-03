package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://google.com");
		driver.findElement(By.linkText("About")).click();
		String x=driver.findElement(By.xpath("/html/body/main/div/section[1]/div/div[2]/h1")).getText();
		System.out.println(x);*/
		
		driver.get("http://primusbank.qedgetech.com");
		String x=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[1]/p[1]")).getText();
		System.out.println(x);
	}

}
