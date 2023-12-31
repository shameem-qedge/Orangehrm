package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountthenumberoflistsinDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.driver.exe", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		WebElement dropdown=	driver.findElement(By.id("searchDropdownBox"));
		
		Select list=new Select(dropdown);
		
		List<WebElement> keywords=	list.getOptions();
		System.out.println(keywords.size());
		
		
		WebElement ele =driver.findElement(By.linkText("EN"));
		
		Select l=new Select(ele);
		List<WebElement> opt=l.getOptions();
		System.out.println(opt.size());
		
		
	}

}
