package Learning_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Screenshot1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		driver.findElement(By.id("login_field")).click();
		driver.findElement(By.className("header-logo"));
		driver.findElement(By.name("password"));
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File temp_path=ts.getScreenshotAs(OutputType.FILE);
		
		File permanent_path = new File("./Screenshots/Github login screenshot.png");
		
		
		try {
			org.openqa.selenium.io.FileHandler.copy(temp_path, permanent_path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Github screenshot has been take");
		driver.close();
		
	}

	private static void highlight(WebElement element) {
		// TODO Auto-generated method stub
		
	}

}
