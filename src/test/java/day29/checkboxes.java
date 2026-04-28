package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class checkboxes {
 public static void main(String[]args)throws InterruptedException
 {
	 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 //1)select single checkbox
	 //driver.findElement(By.xpath("//input[@id='Sunday']")).click();
	  
	 //2)select all the checkboxes
	 /*List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 for(WebElement lists:checkboxes)
	 {
		 
		 lists.click();
	 }*/
	 
	 //3)Last theree check boxes
	 /*List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 for(int i=4;i<checkboxes.size();i++)
	 {
		 checkboxes.get(i).click();
	 }*/
	 
	 //4)Select first three checkboxes
	 /*List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 int target=3;
	 for(int i=0;i<=2;i++)
	 {
		 checkboxes.get(i).click();
	 }*/
	 
	 //5)unselect some checkboxes
	 List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	 
	 for(int i=0;i<=2;i++)
	 {
		 checkboxes.get(i).click();
	 }
	 Thread.sleep(3000);
	 for(int i=0;i<checkboxes.size();i++)
	 {
	   if(checkboxes.get(i).isSelected())
	   {
		   checkboxes.get(i).click();
	   }
	 }
 }
 }
