package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase9_Search_Products {

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
			driver.findElement(By.xpath("//i[@class='material-icons card_travel']")).click();
			System.out.println("Clicked on products button");

			
			
			
			
//		5. Verify user is navigated to ALL PRODUCTS page successfully
			String title=driver.getTitle();
			System.out.println(title);
			String exp_titleProductPage="Automation Exercise - All Products";
			if (title.equalsIgnoreCase(exp_titleProductPage)) {
				System.out.println("user is navigated to ALL PRODUCTS page successfully");

			} else {
				System.out.println("user is NOT YET navigated to ALL PRODUCTS page ");

			}
			
			
			
			
//		6. Enter product name in search input and click search button
			driver.findElement(By.xpath("//input[@id='search_product']")).sendKeys("Dress");

			
//		7. Verify 'SEARCHED PRODUCTS' is visible
			driver.findElement(By.xpath("//button[@id='submit_search']")).click();
			System.out.println("clicked on search button");

			//button[@id='submit_search']
			
			
			
//		8. Verify all the products related to search are visible

			String titleDress=driver.getCurrentUrl();
			System.out.println(titleDress);
	
	
	
	
	
	
	
	
	
	}

}
