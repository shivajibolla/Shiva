package Learning_Screenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Capture webelement screenshot
		
		//1.Identify the element
		driver.findElement(By.id("login-button"));
		
		//2.Call the screenshot method
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//3.Store the screesnhot in temp path
		File temp_path=ts.getScreenshotAs(OutputType.FILE);

		//4.create new permanent patgh for screenshot
		File permanent_path=new File("./Screenshots/WebElementScreenshot.png");
		
		//5.copy the screenshot from temp_pth to permannent path
		FileHandler.copy(temp_path, permanent_path);
		
		
		System.out.println("Web element screenshot has been taken");
		
		driver.quit();
	}

}
