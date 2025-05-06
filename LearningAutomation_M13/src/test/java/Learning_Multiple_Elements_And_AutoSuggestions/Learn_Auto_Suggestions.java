package Learning_Multiple_Elements_And_AutoSuggestions;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Auto_Suggestions {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enther the text that you want to search about");
		String productName= sc.next();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(productName);
		Thread.sleep(1000);

		
		List<WebElement> allsuggestion=driver.findElements(By.xpath("//span[contains(text(),'"+productName+"')]"));
		int count=allsuggestion.size();
		
		for (int i = 0; i < count; i++)
		{
			String text=allsuggestion.get(i).getText();
			System.out.println(i+" "+text);
		}
		
		for (int i = 0; i < count; i++) {
			   
			if (i==2) {
				 String result=allsuggestion.get(i).getText();	
				 System.out.println("The result which you are expecting is "+result);

				allsuggestion.get(i).click();			   
				
			}
		}
		
		driver.close();
		
	}

}
