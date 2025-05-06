package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase2_Login_User_Correct_Credentials {

	public static void main(String[] args) {
		

//		1. Launch browser
				WebDriver driver= new ChromeDriver();

//		2. Navigate to url 'http://automationexercise.com'
				driver.get("http://automationexercise.com");
		//2. Navigate to url 'http://automationexercise.com'
				driver.manage().window().maximize();
		//Waiting statements for all methods
				WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

//		3. Verify that home page is visible successfully
				String Act_title=driver.getTitle();
				System.out.println(Act_title);
				String exp_title="Automation Exercise";
				
				if (Act_title.equalsIgnoreCase(exp_title)) {
					System.out.println("Home page is displayed");
				} else {
					System.out.println("Home page is not displayed");
				}
//		4. Click on 'Signup / Login' button
				driver.findElement(By.xpath("//i[@class='fa fa-lock']")).click();
				System.out.println("Clicked on signup/login button");
//		5. Verify 'Login to your account' is visible
				boolean loginEnableStatus = driver.findElement(By.xpath("//button[@data-qa='login-button']")).isEnabled();
				System.out.println("Login button is enable: "+loginEnableStatus);
				
//		6. Enter correct email address and password
				driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("Shivasms6@gmail.com");
				driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("MyPassword");

//		7. Click 'login' button
				driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
//		8. Verify that 'Logged in as username' is visible
				String act_text=driver.findElement(By.xpath("//b[text()='Sean AnSh']")).getText();
				System.out.println(act_text);
				String exp_text="Sean AnSh";
				
				if (act_text.equalsIgnoreCase(exp_text)) {
					System.out.println("Logged in as "+act_text+" acount is verifed");

				} else {
					System.out.println("Not logged in as: "+act_text);

				}
//		9. Click 'Delete Account' button
				driver.findElement(By.xpath("//i[@class='fa fa-trash-o']")).click();
				
				
//		10. Verify that 'ACCOUNT DELETED!' is visible
				String act_deletedText=driver.findElement(By.xpath("//b[text()='Account Deleted!']")).getText();
				String exp_Text="Account Deleted!";
				if (act_deletedText.equalsIgnoreCase(exp_Text)) {
					
					System.out.println("Acount status is : "+act_deletedText);

				} else {
					System.out.println("Acount is not deleted yet ");

				}
				driver.close();
	}

}
