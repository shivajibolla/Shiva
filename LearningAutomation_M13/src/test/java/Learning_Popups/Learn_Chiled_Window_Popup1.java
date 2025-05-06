package Learning_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Chiled_Window_Popup1 {

	public static void main(String[] args) throws Exception {

		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Popup Windows']")).click();
		
		
		
		//Fetch the address of all windows. it includes parent address
		Set<String> alladdress = driver.getWindowHandles();
		System.out.println(alladdress);
		
		String exptitle1="Automation Testing Practice";
		String exptitle2="Selenium";
		
		
		for (String address : alladdress) {
			//switched the driver controll to the window
			driver.switchTo().window(address);
			
			//fetch the title
			String acttitle=driver.getTitle();
			
			if ((exptitle2.equals(acttitle))){
				String text=driver.findElement(By.tagName("h1")).getText();
				System.out.println("Child1 text is : "+text);
				driver.close();
					
			}
			
			if ((exptitle1.equals(acttitle))){
				String text1=driver.findElement(By.tagName("h1")).getText();
				System.out.println("Parent text is : "+text1);
				driver.close();
			}
			
			
		
		}
			
			
			
		

	}

}
