package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase3_LoginUser_Incorrect_Credentials {

	public static void main(String[] args) throws InterruptedException {

		
		//1. Launch browser
		WebDriver driver= new ChromeDriver();

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

		
//		5. Verify 'Login to your account' is visible
		boolean emailTextFieldEnableStatus = driver.findElement(By.xpath("//input[@data-qa='login-email']")).isEnabled();
		boolean passwordTextFieldEnableStatus = driver.findElement(By.xpath("//input[@data-qa='login-password']")).isEnabled();
		boolean loginEnableStatus = driver.findElement(By.xpath("//button[@data-qa='login-button']")).isEnabled();

		if (emailTextFieldEnableStatus&&passwordTextFieldEnableStatus&&loginEnableStatus) {
			System.out.println("Login to your acount is enable : "+loginEnableStatus);
		} else {
			System.out.println("Login to your acount is not enable");

		}
//				
			
//		6. Enter incorrect email address and password
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("ansh@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("123456");

//7. Click 'login' button
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
//8. Verify error 'Your email or password is incorrect!' is visible
		String act_ErrorMsg=driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']")).getText();
		String exp_ErrorMsg="Your email or password is incorrect!";
		if (act_ErrorMsg.equalsIgnoreCase(exp_ErrorMsg)) {
			System.out.println("Error message is displaed");
		} else {

			System.out.println("Error message is not displaed");

		}
		
		driver.close();
		
		System.out.println("TestCase3_LoginUser_Incorrect_Credentials is executed succesfully");
	}

}
