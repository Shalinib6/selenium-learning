package activities;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day33 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // Total pages
        List<WebElement> pages = driver.findElements(By.xpath("//ul[@id='pagination']//li"));
        int totalPages = pages.size();
        System.out.println("Total pages: " + totalPages);

        for (int p = 1; p <= totalPages; p++) {

            // Click page number
            if (p > 1) {
                WebElement page = driver.findElement(By.xpath("//ul[@id='pagination']//li/a[text()='" + p + "']"));
                page.click();
                Thread.sleep(2000); // wait for page load
            }

            // Get rows for current page
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
            int totalRows = rows.size();

            // Loop through rows
            for (int r = 1; r <= totalRows; r++) {
                String name = driver.findElement(
                        By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[2]")
                ).getText();

                System.out.println("Page " + p + " Row " + r + " : " + name);
                driver.findElement(
                        By.xpath("//table[@id='productTable']//tbody//tr[" + r + "]//td[4]//input")
                    ).click();
                }
            }
        

       
    }
}
