package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase14_PlaceOrder_Register_while_Checkout {

	public static void main(String[] args) {


//		1. Launch browser
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
//	2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		
//	3. Verify that home page is visible successfully
		String Act_title=driver.getTitle();
		System.out.println(Act_title);
		String exp_title="Automation Exercise";
		
		if (Act_title.equalsIgnoreCase(exp_title)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is not displayed");
		}

//		4. Add products to cart
		
		
		//a[@data-product-id='1']

//		5. Click 'Cart' button
//		6. Verify that cart page is displayed
//		7. Click Proceed To Checkout
//		8. Click 'Register / Login' button
//		9. Fill all details in Signup and create account
//		10. Verify 'ACCOUNT CREATED!' and click 'Continue' button
//		11. Verify ' Logged in as username' at top
//		12.Click 'Cart' button
//		13. Click 'Proceed To Checkout' button
//		14. Verify Address Details and Review Your Order
//		15. Enter description in comment text area and click 'Place Order'
//		16. Enter payment details: Name on Card, Card Number, CVC, Expiration date
//		17. Click 'Pay and Confirm Order' button
//		18. Verify success message 'Your order has been placed successfully!'
//		19. Click 'Delete Account' button
//		20. Verify 'ACCOUNT DELETED!' and click 'Continue' button
	}

}
