package Learn_WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//Learning get size get position and set size and set position//
//Setsize(new Dimention(1000,10)
//setPosition(new Point(1000, 100));

public class learn_Size_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(500, 500));
		System.out.println("The size of the broser window "+driver.manage().window().getSize());
		
		driver.get("https://www.zomato.com/");
		
		
     	System.out.println("Position of the broser window "+driver.manage().window().getPosition());
    	driver.manage().window().setPosition(new Point(500, 0));
    	
    	//Maximise the browser
    	driver.manage().window().maximize();
    	
    	//Minimise the browser
    	driver.manage().window().minimize();
    	
    	// full screen mode
    	driver.manage().window().fullscreen();
    	
    	//Fetch the size
    	System.out.println("The Size "+driver.manage().window().getSize());
    	
    	//Fetch position
    	driver.manage().window().setPosition(new Point(1000, 100));
    	
    	//Get position
    	System.out.println("The position of the broser window "+driver.manage().window().getPosition());
    	
    	
    	driver.close();
		
		
	}

}
