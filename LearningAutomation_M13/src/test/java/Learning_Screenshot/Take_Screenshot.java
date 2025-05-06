package Learning_Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Take_Screenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp_path=ts.getScreenshotAs(OutputType.FILE);
		
		File permanent_path= new File("./Screenshots/MyFirstScreenshot.png");
		
		FileHandler.copy(temp_path, permanent_path);
		
		System.out.println("Screenshot has been taken");
		
		driver.close();
		
		
	}

}
