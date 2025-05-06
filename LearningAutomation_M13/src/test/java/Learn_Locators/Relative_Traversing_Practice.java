package Learn_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Traversing_Practice {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//div[text()='Swag Labs']/..//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//div[text()='Swag Labs']/..//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//div[text()='Swag Labs']/..//input[@id='login-button']")).click();
		
		driver.findElement(By.xpath("//div[text()='Swag Labs']/../../../../../..//div[text()='Sauce Labs Backpack']")).click();
		String name=driver.findElement(By.xpath("//div[text()='Swag Labs']/../../../../../..//div[text()='Sauce Labs Backpack']")).getText();
		String price=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/..//div[@class='inventory_details_price']")).getText();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/..//button[@id='add-to-cart']")).click();
		System.out.println("The name of the product is : "+name+" " + "and" +" The price is : "+price);
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("//div[text()='Swag Labs']/../../../../../..//div[text()='Sauce Labs Bolt T-Shirt']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']/../../..//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
		String name2=driver.findElement(By.xpath("//div[text()='Swag Labs']/../../../../../..//div[text()='Sauce Labs Bolt T-Shirt']")).getText();
		String price2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']/../../..//div[@class='inventory_item_price']")).getText();
		System.out.println("The name of the product is : "+name2+" " + "and" +" The price is : "+price2);
		driver.navigate().back();

		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/../../..//div[@class='inventory_item_price']")).click();
		driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/..//button[@id='add-to-cart']")).click();
		String name3=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/..//div[@class='inventory_details_price']")).getText();
		String price3=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']/..//button[@id='add-to-cart']")).getText();
		System.out.println("The name of the product is : "+name3+" " + "and" +" The price is : "+price3);
		driver.navigate().back();
		
		
		
		driver.close();
		
	}

}
