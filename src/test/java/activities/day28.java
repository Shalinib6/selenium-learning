package activities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day28 {
    public static void main(String[]args)throws InterruptedException
    
    {
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://testautomationpractice.blogspot.com/");
    	driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("selenium");
    	driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
    	Thread.sleep(3000);
    	WebElement div=driver.findElement(By.id("Wikipedia1_wikipedia-search-results"));
    	List<WebElement> links = div.findElements(By.tagName("a"));
        int linkCount = links.size();
        System.out.println("Total number of links: " + linkCount);
        Actions actions = new Actions(driver);

        for (WebElement link : links) {
            actions.keyDown(Keys.CONTROL)
                   .click(link)
                   .keyUp(Keys.CONTROL)
                   .build()
                   .perform();

            Thread.sleep(2000);
        }
        String mainTab = driver.getWindowHandle();

        for (String tab : driver.getWindowHandles()) {

            driver.switchTo().window(tab);

            String title = driver.getTitle();

            if (title.contains("Selenium in biology")) {
                driver.close(); 
            }
        }

      
        driver.switchTo().window(mainTab);
    }
}
