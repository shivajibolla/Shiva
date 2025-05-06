package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase4_Logout_User {

	public static void main(String[] args) throws InterruptedException {


//1. Launch browser
		WebDriver driver= new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
//Waiting statements for all methods
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

//3. Verify that home page is visible successfully
		String Act_title=driver.getTitle();
		System.out.println(Act_title);
		String exp_title="Automation Exercise";
		
		if (Act_title.equalsIgnoreCase(exp_title)) {
			System.out.println("Home page is displayed");
		} else {
			System.out.println("Home page is not displayed");
		}
		
		
//4. Click on 'Signup / Login' button
			driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
			System.out.println("Clicked on signup button");
//4.1. Enter name and email address and password
		
			driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Shiva");
			driver.findElement(By.xpath("//input[@data-qa='signup-email']"));

//4.2. Click 'Signup' button
				/*driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				//4.3 Clicking on back navigation
				driver.navigate().back();*/

				
				
						
				
//5. Verify 'Login to your account' is visible
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			boolean loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']")).isDisplayed();
			
			if (loginText) {
				System.out.println("Login to your account is visible: "+loginText);
			} else {
				System.out.println("Login to your account is Not visible: "+loginText);
			}
			
			
			
//6. Enter correct email address and password
			driver.findElement(By.xpath("//button[text()='Login']/..//input[@data-qa='login-email']")).sendKeys("alekyachittipickles@gmail.com");
			driver.findElement(By.xpath("//h2[text()='Login to your account']/..//input[@data-qa='login-password']")).sendKeys("alekyachittipickles");

//7.Click 'login' button
			driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
			
//	8. Verify that 'Logged in as username' is visible
			String act_text=driver.findElement(By.xpath("//b[text()='Sean AnSh']")).getText();
			System.out.println(act_text);
			String exp_text="Sean AnSh";
			
			if (act_text.equalsIgnoreCase(exp_text)) {
				System.out.println("Logged in as "+act_text+" acount is verifed");

			} else {
				System.out.println("Not logged in as: "+act_text);

			}
			
			
//		9. Click 'Logout' button
			driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();

			
			
//		10. Verify that user is navigated to login page
			String Title=driver.getTitle();
			System.out.println(Title);
			String act_Title="Automation Exercise - Signup / Login";
			
			if (Title.equalsIgnoreCase(act_Title)) {
				System.out.println("User navigated to login page: "+Title);

			} else {
				System.out.println("User is not navigated to login page");

			}
			
			


}
}