package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait_commands {
  public static void main (String[]args)throws InterruptedException 
{
	  WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");; 
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
         
         driver.close();
}
}
