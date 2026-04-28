package day34;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
        //switch to the frame
		driver.switchTo().frame(0);
		
		//Method 1:Using sendkeys
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("30/03/2006");
		
		//Method 2:using data picker 
		String year="2026";
		String month="December";
		String date="30";
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		while(true)
		{
			String s=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		    String t=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		    if(s.equals(month)&&t.equals(year))
		    {
		    	break;
		    }
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		     
		}
		List<WebElement>s=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		for(WebElement st:s)
		{
			if(st.getText().equals(date))
			{
				st.click();
				break;
			}
		}
		
		
		
		
	}

}
