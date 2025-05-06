package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5_RegisterUserWithExistingEmail {

	public static void main(String[] args) throws Exception {


//	1. Launch browser
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

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
//	4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		System.out.println("Clicked on signup/login button");
		
//	6. Enter name and already registered email address
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("alekyachittipickles@gmail.com");
		System.out.println("ENTERED name and already registered email address");

//	7. Click 'Signup' button
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		System.out.println("Clicked on signup button");
		
//	8. Verify error 'Email Address already exist!' is visible
		driver.findElement(By.xpath("//p[text()='Email Address already exist!']")).click();
		System.out.println("Verified the error 'Email Address already exist!' is visible");

		driver.close();
		
	}

}
