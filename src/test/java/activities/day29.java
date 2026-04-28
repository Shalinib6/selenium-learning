package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day29 {
   public static void main(String[]args)
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://testautomationpractice.blogspot.com/");
	   List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr"));
	   for(WebElement row : rows) {

           String product = row.findElement(By.xpath("./td[2]")).getText();

           if(product.equalsIgnoreCase("Smartphone")) {

               
               WebElement checkbox = row.findElement(By.xpath("./td[4]/input"));
               checkbox.click();
           }
   }
}
}
