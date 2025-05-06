package Test_Cases_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase13_ {

	public static void main(String[] args) throws AWTException {


//		1. Launch browser
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			JavascriptExecutor js= (JavascriptExecutor)driver;
			
//		2. Navigate to url 'http://automationexercise.com'
			driver.get("http://automationexercise.com");
			
//		3. Verify that home page is visible successfully
			String Act_title=driver.getTitle();
			System.out.println(Act_title);
			String exp_title="Automation Exercise";
			
			if (Act_title.equalsIgnoreCase(exp_title)) {
				System.out.println("Home page is displayed");
			} else {
				System.out.println("Home page is not displayed");
			}
			
			
//		4. Click on products and  'View Product' for any product on home page
			

				

//		5. Verify product detail is opened
			String text=driver.findElement(By.xpath("//div[@class='product-information']")).getText();
			System.out.println(text);

			
			
//		6. Increase quantity to 4
			WebElement element = driver.findElement(By.xpath("//label[text()='Quantity:']"));
			js.executeScript("arguments[0].ScrollIntoview(true)", element);

			
			Actions actionsobj= new Actions(driver);
			Robot robot= new Robot();
			actionsobj.sendKeys(Keys.TAB).sendKeys("4").perform();
			
			
			
//			WebElement quantityElement = driver.findElement(By.xpath("//input[@id='quantity']"));
//			js.executeScript("arguments[0].value='4'", quantityElement);
//			System.out.println("Increased quauntity to 4");
		
//		7. Click 'Add to cart' button
			driver.findElement(By.xpath("//button[@fdprocessedid='sgbf63']")).click();

			
//		8. Click 'View Cart' button
			driver.findElement(By.xpath("//u[text()='View Cart']")).click();

			
//		9. Verify that product is displayed in cart page with exact quantity
			String quantity=driver.findElement(By.xpath("//button[@fdprocessedid='q5m11o']")).getText();
			System.out.println(quantity);
			String exp_quantity = "4";
			
			if (quantity==exp_quantity) {
				System.out.println("product is displayed in cart page with exact quantity");

			} else {
				System.out.println("Quauntity missmatch");

			}
			
	}

}
