package OPEN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddemployeeOrangehrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Ramesh");
		driver.findElement(By.id("lastName")).sendKeys("ramesh");
		
		WebElement empid=    driver.findElement(By.id("employeeId"));
		String id=empid.getAttribute("value");
		System.out.println(id);
		
		empid.clear();
		
		empid.sendKeys("1234");
		driver.findElement(By.id("btnSave")).click();

	}

}
