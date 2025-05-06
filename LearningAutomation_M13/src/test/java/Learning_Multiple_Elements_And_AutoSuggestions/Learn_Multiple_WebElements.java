package Learning_Multiple_Elements_And_AutoSuggestions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Multiple_WebElements {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver= new ChromeDriver();
		driver.get("https://qspiders.com");
		
		Thread.sleep(1000);
		
		List<WebElement> alllinks= driver.findElements(By.xpath("//a"));
		
		int count=alllinks.size();
		System.out.println(count);
		
		for (int i = 0; i < count; i++) {
			String text=alllinks.get(i).getText();
			System.out.println(text);
			
		}
		
		driver.close();

		
		
		
	}

}
