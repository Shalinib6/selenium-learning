package day21;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestcase {

    public static void main(String[] args) {

        // Step 1: Launch browser
        WebDriver driver = new ChromeDriver();

        // Step 2: Open website
        driver.get("https://demo.opencart.com/");

        // Step 3: Expected title
        String expected_title = "Just a moment...";

        // Step 4: Actual title
        String actual_title = driver.getTitle();


        if (actual_title.equals(expected_title)) {
            System.out.println("Test Passed ✅");
        } else {
            System.out.println("Test Failed ❌");
            System.out.println("Expected: " + expected_title);
            System.out.println("Actual: " + actual_title);
        }

        // Step 6: Close browser
        driver.quit();
    }
}
