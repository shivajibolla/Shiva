package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase11_Subscription_in_Cart_page {

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

		

//		4. Click 'Cart' button
			
		driver.findElement(By.xpath("//a[@href='/view_cart']")).click();

//		5. Scroll down to footer
		WebElement element = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		System.out.println("Scroll down to footer");
		
//		6. Verify text 'SUBSCRIPTION'
		String act_Text=driver.findElement(By.xpath("//h2[text()='Subscription']")).getText();
		String exp_Text="Subscription";
		
		if (act_Text.equalsIgnoreCase(exp_Text)) {
			System.out.println("Text is verified");

		} else {
			System.out.println("Text is NOT verified");

		}
		
		
//		7. Enter email address in input and click arrow button
		driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("aguramnaveen@gmail.com");
		driver.findElement(By.xpath("//button[@id='subscribe']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("click arrow button");

		
//		8. Verify success message 'You have been successfully subscribed!' is visible
		String subscribtionText=driver.findElement(By.xpath("//div[text()='You have been successfully subscribed!']")).getText();
		String exp_subscribtionText="You have been successfully subscribed!";
		
	if (subscribtionText.equalsIgnoreCase(exp_subscribtionText)) {
		System.out.println("You have been successfully subscribed!");

	} else {
		System.out.println("You have NOT been subscribed! yet");

	}
	
	
	}

}
