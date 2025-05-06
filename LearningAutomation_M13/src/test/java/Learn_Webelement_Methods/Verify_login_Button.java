package Learn_Webelement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_login_Button {
    
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		WebElement element= driver.findElement(By.xpath("//input[@id='login-button']"));
		
		//*************Validation***********
		
//		if (element.isDisplayed()) {
//			System.out.println("Displayed");
//		} else {
//			System.out.println("Not Displayed");
//		}
//		//Display status
//		Boolean status=driver.findElement(By.xpath("//input[@id='login-button']")).isDisplayed();
//		System.out.println("Display status is "+status);
//		//enable status
//		Boolean Enable_Status=driver.findElement(By.xpath("//input[@id='login-button']")).isEnabled();
//		System.out.println("Enabled status is "+Enable_Status);
//
//		
//		//.Fetch property
//		//1.Fetch tagname and print
//		String tagname=element.getTagName();
//		System.out.println("The tagname is : "+tagname);
//		
//		//2.atrribute name and print
//		String attribute = element.getAttribute("id");
//		System.out.println("The attribute name is : "+attribute);
//		
//		//3.fetch css value and pring
//		String cssValue=element.getCssValue("background-color");
//		System.out.println("The CSS value is "+cssValue);
//		
//		//4.Fetch size and print
//		Dimension size=element.getSize();
//		System.out.println("The size is "+size);
//		
//		//4.1 fetch the height and print
//		int height=element.getSize().getHeight();
//		System.out.println("The height is "+height);
//		
//		//4.2 fetch width
//		int width=element.getSize().getWidth();
//		System.out.println("The width is "+width);
//		
//		//4.3 location
//		Point location=element.getLocation();
//		System.out.println("The Location is "+location);
//		
//		//4.4 x-offset
//		
//		int xoffset=element.getLocation().getX();
//		System.out.println("The location of x coordinate is "+xoffset);
//		
//		//4.5 y-offset
//		int yoffset=element.getLocation().getY();
//		System.out.println("The location of y coordinate is "+yoffset);
		
		
		//5.Verify the login button is properly alligned or not position
		//Verify the position
		Dimension size1=element.getSize();
		System.out.println("The size of the button is "+size1);
		int width1=element.getSize().getWidth();
		int height1=element.getSize().getHeight();
		
		
		Dimension act_dim=ActualSize(292,49);
		if (size1.equals(act_dim)) {
			
			System.out.println("Login button is properly alligned in terms of size");
		} else {
			System.out.println("Login button is Not properly alligned in terms of size");

		}
		
		
		Point exp_position=element.getLocation();
		System.out.println("The position of the W.E is : "+element.getLocation());
		int x=element.getLocation().getX();
		int Y=element.getLocation().getY();
		
		Point act_loc=Act_position(622,300);
		
		if (exp_position.equals(act_loc)) {
			System.out.println("Login button is properly alligned in terms of Position");

		} else {
			System.out.println("Login button is Not properly alligned in terms of Position");

		}

		
		
		//******Perform action********
		//Using submit

		element.submit();
		System.out.println("Clicked on submit");
		
		System.out.println("All methods used succesfully by author: Shiva");
		driver.close();
	}

	private static Point Act_position(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Dimension ActualSize(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}
}
