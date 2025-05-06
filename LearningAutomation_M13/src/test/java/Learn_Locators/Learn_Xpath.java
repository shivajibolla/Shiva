package Learn_Locators;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Learn_Xpath {

	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the user name");
		String userName=sc.next();
		System.out.println("Enter the Passwors");
		String password=sc.next();
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
        driver.navigate().back();
		System.out.println("bag");

        
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']")).click();
		driver.findElement(By.xpath("//button[@data-test='add-to-cart']")).click();
		driver.navigate().back();
		System.out.println("bolt tsirt");


		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart']")).click();
		driver.navigate().back();
		System.out.println("Onesie");

		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
		driver.navigate().back();
		System.out.println("bike light");

		
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']")).click();
		driver.findElement(By.xpath("//button[@data-test='add-to-cart']")).click();
		driver.navigate().back();
		System.out.println("jacket");

		
		driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']")).click();
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		//driver.navigate().back();
		System.out.println("red t shirt");

		
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
         
		
		
		
        TakesScreenshot ts = (TakesScreenshot) driver;
	    File temp_path=ts.getScreenshotAs(OutputType.FILE);
		File permanent_path= new File("./Screenshots/SixProductsinCart.png");
		FileHandler.copy(temp_path, permanent_path);
		
		
		
		
		
		System.out.println("Execution done by the author Shiva");
		driver.close();
		
//		 user name : standard_user
//		
//		 Passwors  :secret_sauce
//		
		
	}

}
