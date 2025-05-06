package Learning_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_ProperticeFile {

	
	public static void writeData(String key,String value) throws IOException {
		
		FileInputStream fis= new FileInputStream("./src/test/resources/CommanData.properties");
		Properties propertiesobj = new Properties();
		propertiesobj.load(fis);
		propertiesobj.put(key, value);
		
		FileOutputStream fos= new FileOutputStream("./src/test/resources/CommanData.properties");
		propertiesobj.store(fos, "new key is updated");

	}
	
	
	

	public static String readdata(String Key) throws IOException
	{
		//Step1:
		FileInputStream fis= new FileInputStream("./src/test/resources/CommanData.properties");
		//Step2:
		Properties propertiesobj = new Properties();
		
		//Step3 Load the property file
		propertiesobj.load(fis);
		
		String value=propertiesobj.getProperty(Key);
		System.out.println(value);
		
		return value;
		 
		
	}
	

	
	public static void main(String[] args) throws IOException {
		
		//Write method calling
		writeData("url", "https://www.automationexercise.com");
		System.out.println("New url key is updated");
		
		writeData("username", "alekyachittipickles@gmail.com");
		System.out.println("New username key and its value is updated");
		
		writeData("password", "alekyachittipickles");
		System.out.println("New password key and its value is updated");
		
		writeData("name", "Shiva");
		System.out.println("New name key and its value is updated");
		
		
		//read method calling
		String URL=readdata("url");
		String username=readdata("username");
		String password=readdata("password");
		String name=readdata("name");
		
	

		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.partialLinkText("Login")).click();
		System.out.println("Clicked on Signup/ligin buttpm");

		WebElement usernameTextField = driver.findElement(By.xpath("//input[@data-qa='login-email']"));
		usernameTextField.sendKeys(username);
		System.out.println("Entered the email");

		WebElement passwordsTextField = driver.findElement(By.xpath("//input[@data-qa='login-password']"));
		passwordsTextField.sendKeys(password);
		System.out.println("Entered the password");

		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		System.out.println("Clicked on login ");
		
		

		
		
		
		driver.close();
	}

}
