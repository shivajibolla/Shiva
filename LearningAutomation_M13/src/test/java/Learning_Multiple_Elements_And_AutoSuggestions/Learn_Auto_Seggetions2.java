package Learning_Multiple_Elements_And_AutoSuggestions;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Auto_Seggetions2 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Search for your fav product");
		String userInput=sc.next();


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(userInput);
		Thread.sleep(3000);
		
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//span[contains(text(),'"+userInput+"')]"));
		int count=allsuggestions.size();
		System.out.println("The auto suggestions count is: "+count);
		String text=allsuggestions.get(count-1).getText();
		System.out.println(text);
		allsuggestions.get(count-5).click();
		Thread.sleep(2000);
		
		
		//to print all the auto suggetions//
		for (int i = 0; i < count; i++) {
			String text1=allsuggestions.get(i).getText();
			System.out.println(text1);
		}
		
		//to click on 2nd suggestion//
		for (int i = 0; i < count; i++) {
			if (i==1) {
				String result=allsuggestions.get(i).getText();
				System.out.println("Requred second option is: "+result);
				allsuggestions.get(i).click();
				Thread.sleep(2000);

			}
		}
		
		
		
		driver.close();
	}

}
