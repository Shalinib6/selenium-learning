package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_locators 
{
	public static void main(String[]args)
	{
   WebDriver driver=new ChromeDriver();
   driver.get("https://demo.nopcommerce.com/");
   driver.manage().window().maximize();
   //1.tag&id(can be varified by inspect ctrl+f and search
   //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Iphone-16");
   //2.tad&className
   //driver.findElement(By.cssSelector("input.search-box-text ")).sendKeys("mac");
   //3.tag&Attribute
   //driver.findElement(By.cssSelector("[placeholder='Search stor e']")).sendKeys("haii");
   //4.class&attribute
   driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-shirts");
	
	}
} 
