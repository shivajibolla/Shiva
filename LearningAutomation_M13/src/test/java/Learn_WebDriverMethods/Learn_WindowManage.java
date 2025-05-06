package Learn_WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_WindowManage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		Options opt=driver.manage();
		Window win = opt.window();
		 win.maximize();// Used to maximise the browser//
		 
		 // OR//
		 driver.manage().window().maximize();
	}

}
