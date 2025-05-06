package LearningScrollAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class LearnScrollAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev");
		WebElement elemenet= driver.findElement(By.xpath("//h2[text()='News']"));

		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		//Using ScrollInBy() method
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

		
		//Using ScrollTo() method
		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(3000);

		js.executeScript("window.scrollTo(0,500)");
		Thread.sleep(3000);


		

		//Using ScrollInToView() method
		js.executeScript("arguments[0].scrollIntoView(true)", elemenet);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", elemenet);
		Thread.sleep(5000);
		
		
		
		driver.close();
		
		System.out.println("Exexution is done");
	}

}
