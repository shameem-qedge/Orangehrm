package IFRAME;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/");
		driver.findElement(By.linkText("Droppable")).click();
		
		List<WebElement> html=	driver.findElements(By.xpath("//iframe | //frame"));
		System.out.println(html.size());
		
		
		
		Thread.sleep(2000);
		
		//DRIVER.SWITCHTO.FRAME  IFRAME
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement src=driver.findElement(By.id("draggable"));//html window inside another html window
		WebElement dest=driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(src, dest);
		act.build().perform();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Demos")).click();
	}

}
