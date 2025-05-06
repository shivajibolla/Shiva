package Learn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_CurrentURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     
     driver.get("https://www.zomato.com/");
     
     String expectedURL="https://www.zomato.com/"; //  given by user to verify the URL//
     String currenturl= driver.getCurrentUrl();
     System.out.println(currenturl);
     
     if (expectedURL.equals(currenturl)) {
		System.out.println("URL is verified : PASS");
	}else {
		System.out.println("URL is NOT verified : FAIL");
	}
     
     
     
     }

}
