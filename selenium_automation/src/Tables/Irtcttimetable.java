package Tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irtcttimetable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.railyatri.in/time-table/");
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div/div/div/table"));
		List<WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println("no of the rows is " + rows.size());
		
		List<WebElement> col=rows.get(0).findElements(By.tagName("th"));
		
	//	List<WebElement> col=rows.get(1).findElements(By.tagName("td"));//td elements
		
		System.out.println("No of the colms is"  +col.size());
		
		//printing the table data
		
		for(int i=1;i<rows.size();i++)
		{
			
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			for(WebElement data : cols)
			{
				System.out.print(data.getText());
			}
			System.out.println();
			
			
			
		}
		
	}

}
