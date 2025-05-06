package Learning_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Child_Window2 {

	public static void main(String[] args) throws Exception {


		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();
		Thread.sleep(3000);
		
		
		
		//Fetch the address of all windows. it includes parent address
		Set<String> alladdress = driver.getWindowHandles();
		System.out.println(alladdress);
		
		String expTitle1="Automation Testing Practice";
		String expTitle2="Selenium";
		String expTitle3="Fast and reliable end-to-end testing for modern web apps | Playwright";

		
	
		for (String address : alladdress) {
			
			//Go to the selenium child window
			driver.switchTo().window(address);
			//fetch the text and close
			String actTitle=driver.getTitle();
			
			//Go to the parent window and Fetch the text and close

			if (expTitle1.equals(actTitle)) {
				String text= driver.findElement(By.tagName("h1")).getText();
				System.out.println("Parent window title is: "+text);
				driver.close();
			}
			
			if (expTitle2.equals(actTitle)) {
				String text2= driver.findElement(By.tagName("h1")).getText();
				System.out.println("Chiled window1 title is: "+text2);
				driver.close();

			}
			if (expTitle3.equals(actTitle)) {
				String text3= driver.findElement(By.tagName("h1")).getText();
				System.out.println("Chiled window2 title is: "+text3);
				driver.close();
			}
			
		}
		
		
		
		
		
		
		
		
		


	}

}
