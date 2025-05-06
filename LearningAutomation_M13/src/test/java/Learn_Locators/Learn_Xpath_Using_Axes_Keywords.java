package Learn_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Xpath_Using_Axes_Keywords {

	public static void main(String[] args) {

//***************X-path by using axes keywords***********
		
//1.following*******//tagname or exp /follwong::tagname or exp****
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		//traversing from swag lab to user name in forward direction by using following keyword//
		driver.findElement(By.xpath("//div[text()='Swag Labs']/following::input[@id='user-name']")).sendKeys("standard_user");
		
		//traversing from swag lab to password in forward direction by using following keyword//
		driver.findElement(By.xpath("//div[text()='Swag Labs']/following::input[@id='password']")).sendKeys("secret_sauce");

		//traversing from swag lab to login button in forward direction by using following keyword//
		driver.findElement(By.xpath("//div[text()='Swag Labs']/following::input[@id='login-button']")).click();
		
		System.out.println("Travelled in forward direction by following keyword");
		
		//2.preceding*******//tagname or exp /preceding::tagname or exp****
		String element= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/../../..//div[@class='inventory_item_price']/preceding::div[text()='Swag Labs']")).getText();
		System.out.println("Traveled from product name to price and price to"+" "+element+ " "+ "in backword direction");


		//Following Sibling*******//tagname or exp /foloowing-sibling::tagname or exp****
		String description=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/following::div[contains(text(),'carry.allTheThings() with the sleek')]")).getText();
		System.out.println("Following-sibling keyword : Description of the product is "+description);
		
		
		
		
		//Preceding-Sibling*******//tagname or exp /preceding-sibling::tagname or exp****
		String username=driver.findElement(By.xpath("//input[@id='login-button']/preceding-sibling::div/input[@id='user-name']")).getText();
		System.out.println("prceding-sibling keyword : travellrd from login button to user name and entered UN is "+username);

		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();

		
		
		
		

	}

}
