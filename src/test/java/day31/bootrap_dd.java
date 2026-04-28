package day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootrap_dd {
 public static void main(String[]args)
 {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	 driver.manage().window().maximize();
	 
	 //single single option
	 driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	 driver.findElement(By.xpath("//input[@value='Java']")).click();
 }
}
