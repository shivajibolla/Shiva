package Learning_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_By_Xpath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://qspiders.com/");
		
		//Capture webelement screenshot
		
		//1.Identify the element by xpath using attribute //Tagname[@Attributename='Attributevalue']
		driver.findElement(By.id("radix-navigation-menu-v-0-trigger-radix-v-1"));
		
		TakesScreenshot ts =(TakesScreenshot) driver;
		
		File temp=ts.getScreenshotAs(OutputType.FILE);
		
		File permanent = new File("./Screenshot/All course tab");
		
		FileHandler.copy(temp, permanent);
		
		System.out.println("All courses button screenashot has been taken");
		
		driver.close();
		
		
		

	}

}
