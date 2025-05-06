package Learn_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//div[text()='Swag Labs']/..//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//div[text()='Swag Labs']/..//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//div[text()='Swag Labs']/..//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("//div[text()='Swag Labs']/../../../../../..//div[text()='Sauce Labs Onesie']")).click();
		
		String productName=driver.findElement(By.xpath("//div[text()='Swag Labs']/../../../../../..//div[text()='Sauce Labs Onesie']")).getText();
		String price=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/..//div[@data-test='inventory-item-price']")).getText();
		
		System.out.println("The Name of the product is : "+productName);
		System.out.println("The price of the product is : "+price);

		driver.close();

		
		
		
	}

}
