package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsOrPopups { 
	public static void main(String[]args) throws InterruptedException
	
	{
	WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  driver.manage().window().maximize();
	  
	  //1)OK BUTTON ALERT
	 /* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
      Thread.sleep(5000);
	  Alert mylert=driver.switchTo().alert();
	  System.out.println(mylert.getText());
	  mylert.accept();*/
	  
	  //2)OK AND CANCEL BUTTON ALERT CONFORMATION ALERT
	  /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	  Thread.sleep(3000);
	  //driver.switchTo().alert().accept(); 
	  driver.switchTo().alert().dismiss();*/
	  
	  //Prompt ALert
	  /*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	  Thread.sleep(3000);
	  Alert myalert=driver.switchTo().alert();
	  myalert.sendKeys("Welcome");
	  myalert.accept();*/
	  
	  
	  
	
	
	
	}
	
}