package Learn_Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_CSSSelector_Locators1 {

	public static void main(String[] args) {

		//try with practice website//
		
		Scanner sc= new Scanner(System.in);

	      System.out.println("Enter the name");
	      String userName = sc.next();
	   
	      
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
          driver.get("https://testautomationpractice.blogspot.com/");
          
   //Identifying the W.E by using #id locator
         //driver.findElement(By.cssSelector("#name")).sendKeys(userName);
          
   // By using .Class value locator
         // driver.findElement(By.cssSelector(".form-control")).sendKeys(userName);
          
   // By using Tagname locator
           //driver.findElement(By.cssSelector("input")).sendKeys(userName);
          
       //by using Tagname[Attribute='Attributevalue']
          //driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys(userName);
          
          
          
          System.out.println("Succesfully Executed");
          //driver.close();
          
          
          
	}

}
