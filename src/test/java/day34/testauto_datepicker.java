package day34;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testauto_datepicker {
	public static void main(String[]args)
	{
		WebDriver driver = new ChromeDriver();
        
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        String yr="2021";
	}

}
