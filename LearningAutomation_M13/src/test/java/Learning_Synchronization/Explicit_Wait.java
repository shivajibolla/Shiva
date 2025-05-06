package Learning_Synchronization;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		String text1=driver.switchTo().alert().getText();
		System.out.println("I'm a Simple alert : "+text1);
		driver.switchTo().alert().accept();
		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='confirmBtn']"))).click();
		String text2=driver.switchTo().alert().getText();
		System.out.println("I'm a confirmation alert : "+text2);
		driver.switchTo().alert().accept();
		
		driver.close();
	}

}
