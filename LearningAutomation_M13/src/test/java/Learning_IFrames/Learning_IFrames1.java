package Learning_IFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_IFrames1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/shiva/Documents/JavaPrograms/LearningAutomation_M13/src/main/resources/EmbededWebpage.html");
		driver.findElement(By.id("email")).sendKeys("shivasms4444@gmail.com");
				
		//Switching driver control main page to frame
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Computer");
		Thread.sleep(5000);
		
		// from frame to main page
		driver.switchTo().defaultContent();
		WebElement nametextfield = driver.findElement(By.xpath("//input[@name='name']"));
		nametextfield.clear();
		nametextfield.sendKeys("Shiva");
		Thread.sleep(2000);

		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		Thread.sleep(2000);
		

		
		
		


		driver.close();
		
		
	}

}
