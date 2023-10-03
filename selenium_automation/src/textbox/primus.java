package textbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class primus {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		WebElement amazonlist=driver.findElement(By.id("searchDropdownBox"));
		Select dlist=new Select(amazonlist);
		
		List<WebElement> alist=dlist.getOptions();
		System.out.println(alist.size());
		
			String s=alist.get(0).getText();
			String sa=alist.get(1).getText();
			if(sa.compareTo(s)<0)
			{
				System.out.println("asc");
			}
			else
			{
				System.out.println("dsc");
			}
		
	

	}
		

	}


