package Learning_Screenshot;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Highlighter.Highlight;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zomato_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/mobile");
		
		//Capture webelement screenshot
		
		//1.Identify the element
		driver.findElement(By.tagName("li"));
	    driver.findElement(By.className("sc-3o0n99-5 sc-hmAwuO knXpsb"));
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp_path = ts.getScreenshotAs(OutputType.FILE);
		
		File permanent =new File("./Screenshots/Zomatologinbutton.png");
		
		FileHandler.copy(temp_path, permanent);
		System.out.println("done");
		
		driver.close();
		
		
	
		
	}

	
}
