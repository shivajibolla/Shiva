package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase8_Product_And_ProductDetailsPage {

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
		
		
		
		

//		4. Click on 'Products' button
			driver.findElement(By.xpath("//a[@href='/products']")).click();
			System.out.println("Clicked on Products button");
			
			
//		5. Verify user is navigated to ALL PRODUCTS page successfully
			String title=driver.getTitle();
			System.out.println(title);
			String exp_titleProductPage="Automation Exercise - All Products";
			if (title.equalsIgnoreCase(exp_titleProductPage)) {
				System.out.println("user is navigated to ALL PRODUCTS page successfully");

			} else {
				System.out.println("user is NOT YET navigated to ALL PRODUCTS page ");

			}
			
			
			
//		6. The products list is visible
			boolean productList = driver.findElement(By.xpath("//div[@class='features_items']")).isDisplayed();
			System.out.println("Product list is visible: "+productList);
			
			
			
//		7. Click on 'View Product' of first product
			//driver.findElement(By.xpath("//a[@href='/product_details/1']")).click();
			System.out.println("Clicked on view product");

			
//		8. User is landed to product detail page
			String productsDetailsTitle=driver.getTitle();
			System.out.println(productsDetailsTitle);
			String exp_Text="Automation Exercise - All Products";
			
			if (productsDetailsTitle.equalsIgnoreCase(exp_Text)) {
				System.out.println("landed to product detail page");
			} else {
				System.out.println("NOT YET landed to product detail page");

			}
//		9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
			//String name=driver.findElement(By.xpath("//h2[text()='Blue Top']")).getText();
			//System.out.println("name "+name);
			
			String category=driver.findElement(By.xpath("//p[text()='Category: Women > Tops']")).getText();
			System.out.println("category"+category);

			String price=driver.findElement(By.xpath("//span[text()='Rs. 500']")).getText();
			System.out.println("price "+price);

			String availability=driver.findElement(By.xpath("//b[text()='Availability:']")).getText();
			System.out.println("availability "+availability);

			String condition=driver.findElement(By.xpath("//b[text()='Condition:']")).getText();
			System.out.println("condition "+condition);

			String brand=driver.findElement(By.xpath("//b[text()='Brand:']")).getText();
			System.out.println("brand: "+brand);

			

			

			
		
	}

}
