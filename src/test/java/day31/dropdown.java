package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
   public static void main(String[]args)
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://testautomationpractice.blogspot.com/");
	   driver.manage().window().maximize();
       WebElement country =driver.findElement(By.xpath("//select[@id='country']"));
       Select countryy=new Select(country);
       //1.select option from the dropdown
       //countryy.selectByVisibleText("India");
       //countryy.selectByvalue("India");
       //countryy.selectByIndex(2);
       
       List<WebElement> m=countryy.getOptions();
       System.out.println(m.size());
       for(WebElement n:m)
       {
    	   System.out.println(n.getText());
       }
       
   }
}
