package Learning_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Child_Window_Popup {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();
		
		
		//fetch the address of parent window
		String parentaddress=driver.getWindowHandle();
		System.out.println(parentaddress);
		
		//Fetch the address of all windows. it includes parent address
		Set<String> alladdress = driver.getWindowHandles();
		System.out.println(alladdress);
		
		//Scenario:1 close all windows without using quit() method
		
		/*for (String address : alladdress) {
			driver.switchTo().window(address);
			driver.close();
		}*/

		
		//Scenario:2 close all child windows only without using quit
		
		/*for (String address : alladdress) {
			driver.switchTo().window(address);
			if (!address.equals(parentaddress)) {
				driver.close();
			}
		}*/

		//Scenario:3 close only parent windows
		for (String address : alladdress) {
			driver.switchTo().window(address);
			if (address.equals(parentaddress)) {
				driver.close();
			}
		}

		
		
		
		
		
		
	}

}
