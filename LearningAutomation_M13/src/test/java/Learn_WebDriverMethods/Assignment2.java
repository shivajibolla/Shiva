package Learn_WebDriverMethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your browser name");
		String browser=sc.next();
		
		String browser1= "Chrome";
		String browser2= "Edge";
		String browser3= "Firefox";
		
		if (browser1.equalsIgnoreCase(browser)) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.zomato.com/");
			String title=driver.getTitle();
			System.out.println("The title of the website is "+title);
			String url=driver.getCurrentUrl();
			System.out.println("The URL of the website is "+url);
			driver.manage().window().maximize();
			driver.close();
			
	
		}else if (browser2.equalsIgnoreCase(browser)) {
			WebDriver driver1 = new EdgeDriver();
			driver1.get("https://www.swiggy.com/restaurants");
			String title1=driver1.getTitle();
			System.out.println("The title of the website is "+title1);
			String url1=driver1.getCurrentUrl();
			System.out.println("The URL of the website is "+url1);
			driver1.manage().window().maximize();

			
		} else if (browser3.equalsIgnoreCase(browser)) {
			WebDriver driver2 =new FirefoxDriver();
			driver2.get("https://qspiders.com/");
			String title2=driver2.getTitle();
			System.out.println("The title of the website is "+title2);
			String url2=driver2.getCurrentUrl();
			System.out.println("The URL of the website is "+url2);
			driver2.manage().window().maximize();


			
		} 
		
		else
		   System.out.println("Please choose the valid browser name");
		
		
		
		
		
		
	}

}
