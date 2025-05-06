package Learn_Robot_Class;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learn_Robot_Class {

	public static void main(String[] args) throws AWTException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		Actions actionobj=new Actions(driver);
		Robot robotobj= new Robot();
		
		actionobj.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB).perform();
		
		robotobj.keyPress(KeyEvent.VK_C);
		robotobj.keyRelease(KeyEvent.VK_C);
		
		robotobj.keyPress(KeyEvent.VK_O);
		robotobj.keyRelease(KeyEvent.VK_O);
		
		robotobj.keyPress(KeyEvent.VK_M);
		robotobj.keyRelease(KeyEvent.VK_M);
		
		robotobj.keyPress(KeyEvent.VK_P);
		robotobj.keyRelease(KeyEvent.VK_P);
		
		robotobj.keyPress(KeyEvent.VK_U);
		robotobj.keyRelease(KeyEvent.VK_U);
		
		robotobj.keyPress(KeyEvent.VK_T);
		robotobj.keyRelease(KeyEvent.VK_T);
		
		robotobj.keyPress(KeyEvent.VK_E);
		robotobj.keyRelease(KeyEvent.VK_E);
		
		robotobj.keyPress(KeyEvent.VK_R);
		robotobj.keyRelease(KeyEvent.VK_R);
		
		System.out.println("Entered computer in search box");
		driver.close();
		
		
		
	}

}
