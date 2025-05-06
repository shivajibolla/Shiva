package Learnning_Handling_DisAbled_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import LearningScrollAction.JavascriptExecuter;

public class JsCode_To_Handle_Disabled_Elements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("Shivasms4444@gmail.com");
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='name']"));
		WebElement element1 = driver.findElement(By.xpath("//input[@id='email']"));


		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
				
		js.executeScript("arguments[0].value='Ansh'", element);
		js.executeScript("arguments[0].value='Mouli@gmail.com'", element1);


		driver.close();
		
		
		
		
	}

}
