package Learn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetTitle {

	public static void main(String[] args) {
        WebDriver driver=   new ChromeDriver();
        driver.manage().window().maximize();// used to open the site in full window//
        
        driver.get("https://www.zomato.com/");
          String title = driver.getTitle();
          System.out.println(title);
          
          driver.get(" https://www.flipkart.com/");
          String title1 = driver.getTitle();
          System.out.println(title1);
          
          driver.get("https://www.amazon.com/ ");
          String title2 = driver.getTitle();
          System.out.println(title2);
          
          driver.get("https://qspiders.com/ ");
          String title3 = driver.getTitle();
          System.out.println(title3);
          
          driver.get("https://www.myntra.com/ ");
          String title4 = driver.getTitle();
          System.out.println(title4);
          
        // driver.close();// it close one single window//
       // driver.quit(); // it close all the windows//
         
	}

}
