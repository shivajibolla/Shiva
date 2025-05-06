package Test_Cases_Practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase6_ContactUsForm {

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
//		4. Click on 'Contact Us' button
			driver.findElement(By.xpath("//a[text()=' Contact us']")).click();
			System.out.println("Clicked on Contact us button");
			
//		5. Verify 'GET IN TOUCH' is visible
			String act_text=driver.findElement(By.xpath("//h2[text()='Get In Touch']")).getText();
			String exp_text="Get In Touch";
			if (act_text.equalsIgnoreCase(exp_text)) {
				System.out.println("GET IN TOUCH' is visible");

			} else {
				System.out.println("GET IN TOUCH' is NOT visible");

			}
			
//		6. Enter name, email, subject and message
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Alekyachittipickles");
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("alekyachittipickles@gmail.com");
			driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Regarding Alekyachittipickles business");
			driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("Please buy our costly alekyachittipickes");
			System.out.println("Entered the name, email, subject and message");

			
//		7. Upload file
		
			WebElement chooseFile=driver.findElement(By.xpath("//input[@name='upload_file']"));
			//Create obj for file to get absolute path
			File obj= new File("./MyTestFile.txt");
			
			//Fetch the absolute path to upload the file
			String absolutePath=obj.getAbsolutePath();
			
			//pass the path through send keys
			chooseFile.sendKeys(absolutePath);
			
			System.out.println("File uploaded");
			
			
//			8. Click 'Submit' button
			WebElement element = driver.findElement(By.xpath("//input[@type='submit']"));

			js.executeScript("arguments[0].scrollIntoView(true)",element);
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

			System.out.println("Clicked on submit button");
					
//			 Click OK button
			driver.switchTo().alert().accept();
			System.out.println("Handled the alert");
			
//			10. Verify success message 'Success! Your details have been submitted successfully.' is visible
			String act_Msg=driver.findElement(By.xpath("//div[@class='status alert alert-success']")).getText();
			String exp_Msg="Success! Your details have been submitted successfully.";
			
			if (act_Msg.equalsIgnoreCase(exp_Msg)) {
				System.out.println("Success! is verified");

			} else {
				System.out.println("Success! is NOT verified");

			}
			

//			11. Click 'Home' button and verify that landed to home page successfully
			
			driver.findElement(By.xpath("//i[@class='fa fa-angle-double-left']")).click();
			System.out.println("Clicked on HOME button");
			
			String title=driver.getTitle();
			String expTitle="Automation Exercise";
			if (title.equalsIgnoreCase(expTitle)) {
				System.out.println("Landed in Home page successfully");

			} else {
				System.out.println("NOT Landed in Home page and please click on Home page button");

			}
			
			
			driver.close();
			
	}

}
