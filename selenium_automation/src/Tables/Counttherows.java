package Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counttherows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://money.rediff.com/tools/forex/");
		
		WebElement table=	driver.findElement(By.className("dataTable"));
		
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		
		for(WebElement t: rows)
		{
			System.out.println(t.getText());
		}
		
		System.out.println("------------------------------------------------");
		
		
		List<WebElement> tables=	driver.findElements(By.xpath("//table"));
		
		WebElement table2=tables.get(1);
		
		List<WebElement> rows2=table2.findElements(By.tagName("tr"));
		
		for(WebElement tr: rows2)
		{
			System.out.println(tr.getText());
		}
		
		
	
	}

}
