package Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegisteredEmployeeinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Aabid");
		driver.findElement(By.id("lastName")).sendKeys("babu");
		
		String empid=	driver.findElement(By.id("employeeId")).getAttribute("value");
		
		driver.findElement(By.id("btnSave")).click();
		
		driver.findElement(By.linkText("Employee List")).click();
		driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		driver.findElement(By.id("searchBtn")).click();
		
		List<WebElement> rows=	driver.findElement(By.id("resultTable")).findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
			
			String data=col.get(1).getText();
			if(data.equals(empid))
			{
				System.out.println("tESS PASS");
			}
			else
			{
				System.out.println("test fails");
			}
		}
		
		
		
	}

}
