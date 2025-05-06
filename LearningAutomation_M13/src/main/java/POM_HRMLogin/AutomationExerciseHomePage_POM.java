package POM_HRMLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseHomePage_POM {

	//declaration
	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement homebtn;
	
	@FindBy(xpath = "//i[@class='material-icons card_travel']")
	private WebElement productsbtn;
	
	
	//initialization
	public AutomationExerciseHomePage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	//utilization
	public WebElement getHomebtn() {
		return homebtn;
	}


	public WebElement getProductsbtn() {
		return productsbtn;
	}
	
	
	
	
	
}
