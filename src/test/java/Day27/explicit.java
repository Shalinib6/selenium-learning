package Day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class explicit {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement txtusername = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.name("username"))
        );

        txtusername.sendKeys("Admin");
        Thread.sleep(3000);
        driver.quit();
    }
}