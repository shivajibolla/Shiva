package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_HRMLogin.AutomationExerciseHomePage_POM;

public class TestCase12_AddProductsCart {

	public static void main(String[] args) {

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

				
			
		
//		4. Click 'Productton by using POM class WE
			
			AutomationExerciseHomePage_POM obj1 = new AutomationExerciseHomePage_POM(driver);
			obj1.getProductsbtn().click();
			
			//driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
			System.out.println("Clicked on products button");
			
//		5. Hover over first product and click 'Add to cart'
			WebElement element = driver.findElement(By.xpath("//h2[@class='title text-center']/..//a[@data-product-id='1']"));
			js.executeScript("arguments[0].scrollIntoView(true)", element);
			driver.findElement(By.xpath("//h2[@class='title text-center']/..//a[@data-product-id='1']")).click();

			System.out.println("Scroll down to footer and clicked on add to cart");
			
			
//		6. Click 'Continue Shopping' button
			driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();

			
			
//		7. Hover over second product and click 'Add to cart'
			WebElement element2 = driver.findElement(By.xpath("//a[@data-product-id='2']"));
			js.executeScript("arguments[0].scrollIntoView(true)", element2);

			driver.findElement(By.xpath("//a[@data-product-id='2']")).click();

			System.out.println("Scroll down to footer and clicked on 2nd product and added to cart");

			
//		8. Click 'View Cart' button
			driver.findElement(By.xpath("//u[text()='View Cart']")).click();

			
//		9. Verify both products are added to Cart
			boolean product1=driver.findElement(By.xpath("//a[text()='Blue Top']")).isDisplayed();
			System.out.println(product1);
			boolean product2=driver.findElement(By.xpath("//a[text()='Blue Top']")).isDisplayed();
			System.out.println(product2);
			if (product2&&product1) {
				System.out.println("product1 and product to added to cart: "+" "+product2);

			} else {
				System.out.println("Not Yet added to cart");

}
			
//		10. Verify their prices, quantity and total price

			String Cart_1_Details=driver.findElement(By.xpath("//tr[@id='product-1']")).getText();
			System.out.println(Cart_1_Details);

			
			String Cart_2_Details=driver.findElement(By.xpath("//tr[@id='product-1']")).getText();
			System.out.println(Cart_1_Details);
			
			
			driver.close();
			
	}

}
