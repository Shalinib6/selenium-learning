package day22;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.*; 
public class locators 
{
  public static void main(String[]args)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://leetcode.com/search/?q=easy&category=question");
	  driver.manage().window().maximize();
	  //1.driver.findElement(By.id("productImageBgID")).sendKeys("shalinib3003@gmail.com");
	  //2.boolean logo=driver.findElement(By.id("productImageBgID")).isDisplayed();
	  //System.out.println(logo);
	   //3List<WebElement>headerLinks=driver. findElements(By.className("ml-2"));
	   //System.out.println(headerLinks.size());
      List<WebElement>links=driver.findElements(By.tagName("a"));
      System.out.println(links.size());
  }
}
