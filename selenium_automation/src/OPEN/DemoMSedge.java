package OPEN;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoMSedge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver;
		driver= new EdgeDriver();
		driver.get("https://www.google.com/");

	}

}
