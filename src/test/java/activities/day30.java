package activities;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class day30 {
	     public static void main(String[]args)
	     {
	    	 WebDriver driver=new ChromeDriver();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 driver.get("https://ui.vision/demo/webtest/frames/");
	    	 driver.manage().window().maximize();
	    	 
	    	 //frame5
	    	  WebElement f5= driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
	    	 driver.switchTo().frame(f5);
	    	driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Hey Buddy");
             driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
             boolean status=driver.findElement(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();
             System.out.println(status);
	     }
	}
