package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day31 {
       public static void main(String[]args)
       {
    	   WebDriver driver =new ChromeDriver();
    	   driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   WebElement country=driver.findElement(By.xpath("//select[@id='country-list']"));
    	   Select countryy=new Select(country);
    	   List<WebElement>m=countryy.getOptions();
    	   System.out.println(m.size());
    	   for(WebElement p:m)
    	   {
    		   System.out.println(p.getText());
    	   }
    	  countryy.selectByVisibleText("China");
       }
}
