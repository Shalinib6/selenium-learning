package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day31_2 {
  public static void main(String[]args)throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		 driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		 driver.findElement(By.xpath("//div[3]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//span[normalize-space()='Freelance']")).click();
  }
}
