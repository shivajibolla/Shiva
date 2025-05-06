package Learn_WebDriverMethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the name of the website");
      String title=sc.next();
      
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.zomato.com/");
      String Actualtitle=driver.getTitle();
      
      if (title.equalsIgnoreCase(Actualtitle)) {
		System.out.println("Title matched : PASS");
	}else {
		System.out.println("Title NOT matched : FAIL");
	}
      
      driver.quit();
      
	}

}
