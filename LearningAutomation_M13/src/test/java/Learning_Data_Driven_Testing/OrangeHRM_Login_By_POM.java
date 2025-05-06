package Learning_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_HRMLogin.OrangeHrmLoginPage_WE_POM;

public class OrangeHRM_Login_By_POM {


	
	
	
	public static void main(String[] args) throws IOException {
		
		OrangeHRM_Login_By_POM("username", "Admin");
		//writeData("url", "https://www.automationexercise.com");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		
		
		
		//OrangeHrmLoginPage_WE_POM obj= new OrangeHrmLoginPage_WE_POM( driver);
		
		
//		obj.getUsername().sendKeys("Admin");
//		obj.getPassword().sendKeys("admin123");
//		obj.getLoginbutton().click();
//		System.out.println("Execution done");
		
		
		driver.close();
	}



	/*private OrangeHRM_Login_By_POM(String newkey, String newvalue) throws IOException {

		// writeing comman data in to the OrangeHRM_CommanData property file to take the inputs from propertyfile to avoid hardcoding
		
		//Step1:Convert physical file into java understandable file
		FileInputStream fis = new FileInputStream("./src/test/resources/OrangeHRM_CommanData.properties");
		
		//Step2:Create object for properties file
		Properties propobj= new Properties();
		
		//Step3: Load the data
		propobj.load(fis);
		
		//Step3: Load the data
		propobj.put(newkey, newvalue);
		
//		Step: Load the data
		FileOutputStream fos= new FileOutputStream("./src/test/resources/OrangeHRM_CommanData.properties");
		propobj.store(fos, "New key and New value are updated..!!");*/
		
		public static void OrangeHRM_Login_By_POM(String key,String value) throws IOException {
			
			FileInputStream fis= new FileInputStream("./src/test/resources/HRMCommanData.propertie");
			Properties propertiesobj = new Properties();
			propertiesobj.load(fis);
			propertiesobj.put(key, value);
			
			FileOutputStream fos= new FileOutputStream("./src/test/resources/HRMCommanData.propertie");
			propertiesobj.store(fos, "new key is updated");

		
	}

}
