package Learn_Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Name_Locator {

	public static void main(String[] args) {

      Scanner sc= new Scanner(System.in);
      System.out.println("Enter authorname");
      String author = sc.next();
      System.out.println("Enter username");
      String userName = sc.next();
      System.out.println("Enter Password");
      String password = sc.next();
      
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.findElements(By.name("user-name"))+"Display status "+userName);
	    driver.findElement(By.name("user-name")).sendKeys(userName);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("login-button")).click();
	    
	    driver.close();
	    
	    System.out.println("Done");


		
		
				
	}

}
