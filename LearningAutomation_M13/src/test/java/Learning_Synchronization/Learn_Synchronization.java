package Learning_Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn_Synchronization {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//Implicit wait statements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//driver.findElement(By.xpath("//img[@alt='Headsets']")).click();
		
		//explicit wait statements
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Keyboards']"))).click();
		
		driver.close();
		
	}

}
