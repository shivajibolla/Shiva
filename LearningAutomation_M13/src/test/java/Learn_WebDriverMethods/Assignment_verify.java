package Learn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// Verify the title //
public class Assignment_verify {

	public static void main(String[] args) {
         
		//Step1:Open the browser
		WebDriver driver=new ChromeDriver();
		
		// step2:Navigate to the website
		driver.get("https://www.zomato.com/");
		
		//Step3 verifying the page using title
		String exp_title="Zomato";
		String actual_Title= driver.getTitle();
		System.out.println(actual_Title);
		
		if (exp_title.equals(actual_Title)) {
			
			System.out.println("Title is verified : PASS");
		}else {
			System.out.println("Title is NOT verified : FAIL");
			
		}
		
		driver.quit();
	}

}
