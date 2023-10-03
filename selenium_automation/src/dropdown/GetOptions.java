package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");

		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.amazon.com/");
		
		Select dropdown= new Select( driver.findElement(By.id("searchDropdownBox")));
		
		List<WebElement> options =	dropdown.getOptions();
		System.out.println(options.size());
		
		for(WebElement opt: options)
		{
			System.out.println(opt.getText());
			if(opt.getText().equalsIgnoreCase("computers"))
			{
				opt.click();
			}
		}
		
	}

}
