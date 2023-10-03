
 package textbox;
 
 import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import
 org.openqa.selenium.WebElement;
import
 org.openqa.selenium.chrome.ChromeDriver;
import
 org.openqa.selenium.support.ui.Select;
 
 public class ascending {
 
 public static void main(String[] args) 
 {
 System.setProperty("webdriver.driver.exe", "chromedriver.exe");
 WebDriver driver= new ChromeDriver(); 
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 /*
 driver.get("https://www.amazon.in/"); 
 WebElement amazonlist=driver.findElement(By.id("searchDropdownBox")); 
 Select dlist=new Select(amazonlist);
 
  List<WebElement> alist=dlist.getOptions(); System.out.println(alist.size());
  boolean order=true;
  for(int i=1;i<=alist.size();i++) 
  {
	  String s=alist.get(i-1).getText();
	  String sa=alist.get(i).getText();
  if(sa.compareTo(s)<0)
  {
  
  order=false; 
  break;
  
  }
  
  } if(order)
  { 
	  System.out.println("Ascending order");
	  } 
  else 
	  {
  System.out.println("Descending order"); 
  }
  */
  
  driver.get("https://www.amazon.in/");

  WebElement element = driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[1]"));
  Select se = new Select(element);

  ArrayList originalList = new ArrayList();

  for (WebElement e : se.getOptions()) {
   originalList.add(e.getText());
  }
  System.out.println("originalList:" + originalList);

  ArrayList tempList = originalList;
  Collections.sort(tempList); // When you change one list, it changes the other list as well.

  System.out.println("originalList:" + originalList);
  System.out.println("tempList:" + tempList);

  /*So the test gets pass all the time because the sequence in the originalList
  and tempList is going to be same.
  If you are following above process then your test never fails, because When
  you change one list, it changes the other list as well.*/

  if (originalList == tempList) {
   System.out.println("Ascending order");
  } else {
   System.out.println("Descending order");
  }
  driver.close();
 }
 
 
 
 
 }
 
 