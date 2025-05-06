package Learn_Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_CSS_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc= new Scanner(System.in);
//	      System.out.println("Enter authorname");
//	      String author = sc.next();
	      System.out.println("Enter username");
	      String userName = sc.next();
	      System.out.println("Enter Password");
	      String password = sc.next();
	      
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            
            //by using Tagname[Attribute='Attributevalue']
            driver.findElement(By.cssSelector("input[type='text']")).sendKeys(userName);
            
            //by using #id value
            driver.findElement(By.cssSelector("#password")).sendKeys(password);
            
            //by using Tagname[Attribute='Attributevalue'] for login button
            driver.findElement(By.cssSelector("input[type='submit']")).click();
            
            System.out.println("Succesfully executed");
driver.close();
            
	}

}
