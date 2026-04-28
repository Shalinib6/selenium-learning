package day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethods {
 public static void main(String[]args) throws  Exception
 {
	 WebDriver driver=new ChromeDriver();
	 //1
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	 //2
	 Thread.sleep(5000);
	 String s=driver.getTitle();
	 System.out.println(s);
	 //3
	 System.out.println(driver.getCurrentUrl());
	 //4
	 // System.out.println(driver.getPageSource());
	 //5
	 //System.out.println(driver.getWindowHandle());
	 //6
	 driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	 Set<String>windowids=driver.getWindowHandles();
	 System.out.println(windowids);
	 driver.close();
 }
}
