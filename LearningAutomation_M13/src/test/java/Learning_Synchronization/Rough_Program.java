package Learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Rough_Program {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		//2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		
		//17. Click 'Delete Account' button
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-trash-o']"))).click();
		System.out.println("Clicked on delet acount button");

		//18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		String actualuText="Account Deleted!";
		String deletedAcountText = driver.switchTo().alert().getText();
		System.out.println(deletedAcountText);

		if (actualuText.equals(deletedAcountText)) {
			System.out.println(deletedAcountText);
			driver.switchTo().alert().accept();

		} else {
			System.out.println("Account is not deleted yet...!!");

		}

	}

}
