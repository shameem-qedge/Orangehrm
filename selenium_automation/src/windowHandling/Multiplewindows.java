package windowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://accounts.google.com/signup");
		String cur=driver.getWindowHandle();
		System.out.println(cur);
		
		driver.findElement(By.linkText("Help")).click();
		String temp=driver.getWindowHandle();
		System.out.println(temp);
			
		Set<String> all	=	driver.getWindowHandles();
		System.out.println(all);
		
		Object[] windows=	all.toArray();
		
		String win1=	windows[0].toString();
		String win2=windows[1].toString();
		
		driver.switchTo().window(win2);
		driver.findElement(By.linkText("Community")).click();
		
		driver.switchTo().window(win1);
		driver.findElement(By.linkText("Privacy")).click();
		all=driver.getWindowHandles();
		System.out.println(all);
		
			
	}

}
