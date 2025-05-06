package Learn_Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Id_Locator_User_Credentials {

	public static void main(String[] args) throws Exception {


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Author name");
		String authorName=sc.next();


		System.out.println("Enter the user name");
		String userName=sc.next();
		System.out.println("Enter the Passwors");
		String password=sc.next();
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		
		//Identify the element using id locator
		
		 WebElement userName_TextFiled = driver.findElement(By.id("user-name"));
		 WebElement passWord_TextField= driver.findElement(By.id("password"));
		 WebElement loginButton = driver.findElement(By.id("login-button"));
		 
		 //Username text field   validation and action
		boolean result= userName_TextFiled.isDisplayed();
		System.out.println("userName_TextFiled is displayed "+result);
		userName_TextFiled.sendKeys(userName);
		Thread.sleep(2000);
		
		 boolean result2=passWord_TextField.isDisplayed();
		 System.out.println("password_TextFiled is displayed "+result2);
		 passWord_TextField.sendKeys(password);
		Thread.sleep(2000);

		 
		 boolean result3=loginButton.isEnabled();
		 System.out.println("password_TextFiled is displayed "+result3);
		 loginButton.click();

		driver.close();

		 
		
	}

}
