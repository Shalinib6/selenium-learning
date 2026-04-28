package day26;

	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class conditional {
	 public static void main(String[]args) throws  Exception
	 {
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://demo.nopcommerce.com/register"); 
		 driver.manage().window().maximize();
		 //1
		 WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		  System.out.println( logo.isDisplayed());
		  
		  //2
		  boolean status=driver.findElement(By.xpath("//input[@id='First name']")).isEnabled();
		  System.out.println(status);
		  
		  //3
		  boolean m=driver.findElement(By.xpath("//input[@id='gender-male']")).isSelected();
	 } 
}
