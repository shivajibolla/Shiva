package POM_HRMLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmLoginPage_WE_POM {


		//**********POM-CLASS Creation********** //
		
		//STEP1://Declaration of WE
		@FindBy(xpath="//input[@name='username']") 
		private WebElement username;
		
		@FindBy(xpath="//input[@name='password']") 
		private WebElement password;
		
		@FindBy(xpath="//button[@type='submit']") 
		private WebElement loginbutton;
		
		
		//STEP2://Initialization of WE
		public OrangeHrmLoginPage_WE_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
			
		}

		
		
		//STEP3:utilization of WE

		public WebElement getUsername() {
			return username;
		}


		public WebElement getPassword() {
			return password;
		}


		public WebElement getLoginbutton() {
			return loginbutton;
		}


}
