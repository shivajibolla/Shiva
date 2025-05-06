package Test_Cases_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sign_up {

	public static void main(String[] args) throws Exception {
		//1. Launch browser
		WebDriver driver= new ChromeDriver();
		//2. Navigate to url 'http://automationexercise.com'
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		
		//Waiting statements for all methods
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));

		
		//3. Verify that home page is visible successfully
		String exp_url="https://automationexercise.com/";
		String act_url=driver.getCurrentUrl();
		System.out.println(act_url);

		if (exp_url.equals(act_url)) {
			System.out.println("Page is visible succesfully");
		} else {
			System.out.println("Page is Not visible ");

		}
		


//		4. Click on 'Signup / Login' button
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		
		
		
//		5. Verify 'New User Signup!' is visible
		boolean visble=driver.findElement(By.xpath("//a[@href='/login']")).isEnabled();
		System.out.println("The user signup is visible : "+visble);

		
//		6. Enter name and email address
		driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("alekyachittipickles@gmail.com");


		//7. Click 'Signup' button
		driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

		//8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
		Boolean acntDetails= driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isEnabled();
		System.out.println("ENTER ACCOUNT INFORMATION is visible : "+acntDetails);

		
		
//		9. Fill details: Title, Name, Email, Password, Date of birth
		driver.findElement(By.xpath("//label[@for='id_gender1']")).click();
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));

		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		js.executeScript("arguments[0].value='Sean AnSh'", name);//Handling dis-able elements
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].value='alekyachittipickles@gmail.com'", email);//Handling dis-able elements
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("alekyachittipickles");
		System.out.println("Details changed by using disabled method and js code");


		//Date of birth is a dropdown
		WebElement dropdownDay = driver.findElement(By.xpath("//select[@id='days']"));
		WebElement dropdownMonth = driver.findElement(By.xpath("//select[@id='months']"));
		WebElement dropdownYear = driver.findElement(By.xpath("//select[@id='years']"));


		

		Select selectobj=new Select(dropdownDay);
		//selectobj.selectByIndex(0);
		selectobj.selectByVisibleText("4");
		Select selectMonth=new Select(dropdownMonth);
		selectMonth.selectByVisibleText("April");
		
		Select selectYear=new Select(dropdownYear);
		selectYear.selectByVisibleText("1994");

		System.out.println("Drop down handled and updated the DOB");

///	10. Select checkbox 'Sign up for our newsletter!'
		/*WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='newsletter']"));
		//driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(checkbox1)).click();
		System.out.println("Checked Sign up for our newsletter");

		
//		11. Select checkbox 'Receive special offers from our partners!'
		WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='optin']"));
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='optin']"))).click();
		js.executeScript("arguments[0].scrollIntoView(true)", checkbox2);
		System.out.println("checked Receive special offers from our partners!");*/

//		12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
		
		
//		 WebElement stateElement=driver.findElement(By.xpath("//input[@id='state']"));
//		 js.executeScript("arguments[0].scrollIntoView(true)", stateElement);

		 
		 //Waiting statement and find element nd action
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='first_name']"))).sendKeys("Shiva");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='last_name']"))).sendKeys("Sean");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='company']"))).sendKeys("TechMahindra");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='address1']"))).sendKeys("7-94 hyderabad");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='address2']"))).sendKeys("7-95 Secunderabad");
		 
		 //Country drop down - we have to create obj for select class
		WebElement countryDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//Select[@id='country']")));
		
		Select countryobj=new Select(countryDropDown);
		countryobj.selectByVisibleText("India");
		 js.executeScript("arguments[0].scrollIntoView(true)", countryDropDown);
		 System.out.println("India selected in Country Dropdown");

		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='state']"))).sendKeys("Telangana");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='city']"))).sendKeys("Hyderabad");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='zipcode']"))).sendKeys("500059");
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='mobile_number']"))).sendKeys("9989830299");

		

//		13. Click 'Create Account button'
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Create Account']"))).click();

		 
//		14. Verify that 'ACCOUNT CREATED!' is visible
		String text1 = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		System.out.println(text1);
		
//		15. Click 'Continue' button
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[(text()='Continue')]"))).click();
//		
		//16. Verify that 'Logged in as username' is visible

		boolean loggedInUserName = driver.findElement(By.xpath("//i[(@class='fa fa-user')]")).isDisplayed();
		//String text2 = driver.findElement(By.xpath("//b[text()='shiva']")).getText();
		System.out.println("Successfully logged in as: "+""+loggedInUserName);
		
	}

}
