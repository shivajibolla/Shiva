package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7_VerifyTestCasePage {

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
//		4. Click on 'Test Cases' button
			driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
			System.out.println("Clicked on Test case button");
		
		
		
//		5. Verify user is navigated to test cases page successfully
			String act_Title=driver.getTitle();
			System.out.println(act_Title);
			String exp_Title="Automation Exercise";
			if (act_Title.equalsIgnoreCase(exp_Title)) {
				System.out.println("navigated to test cases page successfully");
			} else {
				System.out.println("User has not yet navigated to test cases page");

			}
			
			driver.close();
	}

}
