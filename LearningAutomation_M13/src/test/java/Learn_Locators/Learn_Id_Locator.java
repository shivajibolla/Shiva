package Learn_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Id_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.saucedemo.com/");
		
		//Identify the element using id locator
		
		 WebElement element = driver.findElement(By.id("user-name"));
		
		// Validation
		boolean result= element.isDisplayed();
		System.out.println("Element is Displayed "+result);
		
		//Perform action
		element.sendKeys("standard_user");
		
		//Password text field
		WebElement element1 = driver.findElement(By.id("password"));
		boolean result1= element.isDisplayed();//Validation by enabled method
		System.out.println("Password text field is displayed"+result1);
		
		element1.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		
		//Login button action
		WebElement element2 = driver.findElement(By.id("login-button"));
		boolean result2= element.isDisplayed();//Validation
		System.out.println("Login in button is displayed"+result2);
		element2.click();
		
		Thread.sleep(5000);

		driver.close();
		
		
		
		
	
		
	}

}
