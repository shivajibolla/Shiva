package Learn_WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 1000));
		driver.get("https://www.zomato.com/");
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().to("https://www.myntra.com/");
		
		driver.navigate().refresh();
		driver.navigate().back();//It'll go back to amazon
		driver.navigate().back();// It'll go back to zomato
		
		
		
	}

}
