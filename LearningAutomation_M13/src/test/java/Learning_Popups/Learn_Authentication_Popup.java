package Learning_Popups;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Authentication_Popup {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter user name");
		String userName=sc.next();
		System.out.println("Enter password");
		String password=sc.next();

		

		WebDriver driver = new ChromeDriver();
		String customeurl= "http://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		driver.get(customeurl);
		String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		Thread.sleep(3000);
		System.out.println(text);
		
		driver.close();
		
	}

}
