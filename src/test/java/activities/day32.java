package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day32 {

	public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        WebElement dcountry=driver.findElement(By.xpath("//select[@name='fromPort']"));
        Select dcountryy=new Select(dcountry);
        dcountryy.selectByVisibleText("Paris");
        WebElement dicountry=driver.findElement(By.xpath("//select[@name='toPort']"));
        Select dicountryy=new Select(dicountry);
        dicountryy.selectByVisibleText("New York");
        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
        //total no.of rows
        //int t=driver.findElements(By.xpath("//table[@class='table']//tr")).size();
        List<WebElement> values = driver.findElements(
                By.xpath("//table//tbody//tr//td[6]")
        );

        double min = Double.MAX_VALUE;
        int min_row=0;
        for (int i = 0; i < values.size(); i++) {

            String priceText = values.get(i).getText().trim();  
            priceText = priceText.replace("$", ""); 
            double price = Double.parseDouble(priceText);
            if (price < min) {
                min = price;
                min_row=i+1;
            }
        }

        System.out.println("Minimum price: " + min);
        driver.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr["+min_row+"]/td[1]/input[1]")).click();
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Shalini");
      
        driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
        WebElement s=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']"));
        String str=s.getText();
        if(str.contains("Thank you"))
        	System.out.println("Successfull");
	
	}

}
