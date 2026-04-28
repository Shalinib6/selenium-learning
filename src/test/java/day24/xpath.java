package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
 public static void main(String[]args)
 {
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://leetcode.com/accounts/login/?next=%2Fsearch%2F%3Fq%3Deasy%26category%3DpublicList");
	 driver.manage().window().maximize();
	 //xpath single attri
	 // driver.findElement(By.xpath("//input[@placeholder='Username or E-mail']")). sendKeys("shalinib3003@gmail.com");
	 
	 //xpath multi attri
	  // driver.findElements(By.xpath("//input[@placeholder='Username or E-mail'][@value='email']")).sendKeys("shalinib3003@gmail.com");
	   
	   //xpath with and or operator
	   //driver.findElement(By.xpath("//input[@placeholder='Username or E-mail' and   @value='email']")).sendKeys("hi");
	   //
	   
	   //xpath with inner text
	   driver.findElement(By.xpath("//a[text()='macbook']")).click();
	   
	   //xpath with link text
	   String s=driver.findElement(By.xpath("//h3[text()='featured']")).getText();
	   System.out.println(s);
	   
	   //contains in xpath
	   //driver.findElement(By.xpath("//input[contains(@placeholder,'sea')]")).sendKeys("tshit");
	   
	   //startwith
	  //driver.findElement(By.xpath("//input[start-with(@placeholder,'sea')]")).sendKeys("tshit");
	   
	   //chained xpath
	   boolean status=driver.findElement(By.xpath("//div[@d='logo']/a/img")).isDisplayed();
	   System.out.println(status);
	   
 }
}
