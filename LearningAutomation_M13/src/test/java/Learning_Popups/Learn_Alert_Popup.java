package Learning_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Alert_Popup {

	public static void main(String[] args) throws Exception {


		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
		Thread.sleep(3000);
		
		String text=driver.switchTo().alert().getText(); 
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		System.out.println("Alert message is: "+text);
		
		driver.switchTo().alert().sendKeys("Shiva");
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.close();
	}

}
