package Learn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_Url {

	public static void main(String[] args) {

		  WebDriver driver = new ChromeDriver();
		  
   	      driver.get("https://www.zomato.com/");
	      String title = driver.getTitle();
     	  System.out.println("The title of the website is "+title);
		  
		  String currenturl= driver.getCurrentUrl();
		  System.out.println("The URL of the website is  "+currenturl);
		  
		  
		 String pagesource= driver.getPageSource();
		 System.out.println("The page sorce code of website is "+pagesource);
		 
		 driver.quit();
	}

}
