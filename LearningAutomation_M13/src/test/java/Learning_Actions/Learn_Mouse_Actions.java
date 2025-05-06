package Learning_Actions;

import java.awt.RenderingHints.Key;
import java.time.Duration;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Learn_Mouse_Actions {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebElement userName=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		//WebElement password=driver.findElement(By.xpath("//input[@fdprocessedid='he8qmo']"));


		//Explicit waiting statement
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebElement userName= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='small-searchterms']"))));
		//WebElement password=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Old Password']")));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		
		
		// Create object for Actions class
		Actions actionobj= new Actions(driver);
		
		//Call the respective required Actions method by using ref object variable
		
		//actionobj.sendKeys("Shiva44").perform();
		//actionobj.moveToElement(userName);
		//actionobj.moveToElement(userName).doubleClick();
		actionobj.moveToElement(userName).contextClick();
//		actionobj.moveToElement(userName).dragAndDrop(userName, userName);
//		actionobj.moveToElement(userName).clickAndHold();
//		actionobj.moveToElement(userName).release();
//		actionobj.moveToElement(userName).sendKeys("Shiva");
//		actionobj.moveToElement(userName).keyDown(null);
//		actionobj.moveToElement(userName);
//
//




		
		//obj.moveToElement(password).click().sendKeys("44444").perform();

		System.out.println("Done");
		
		//driver.close();
		
	}

}
