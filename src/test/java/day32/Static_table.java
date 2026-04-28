package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize(); 
		//1.total no.of.rows
		int t=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(t);
       
        
		
		//total no.of.columns
		int c=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(c);
		
		//
		
		//read data from specific row and colm
		/*String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3 ]")).getText();
	    System.out.println(data);
	    */
		
		//read data from all row
		/*for(int i=2;i<=t;i++)
		{
			for(int j=1;j<=c;j++)
			{
			   String data =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
			   System.out.print(data+"\t");
			}
			System.out.println();
		}*/
		
		//conditional retriving
		/*for(int i=2;i<=t;i++)
		{
			String s=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			if(s.equals("Mukesh"))
			{
				
				String r=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
			System.out.println(r);
			}
		}*/
		int sum=0;
		for(int i=2;i<=t;i++)
		{
			 String s=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
		      sum+=Integer.parseInt(s);
		}
		System.out.println(sum);
	}

}
