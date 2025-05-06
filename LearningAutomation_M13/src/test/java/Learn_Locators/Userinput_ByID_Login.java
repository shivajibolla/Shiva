package Learn_Locators;

import java.util.Iterator;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Userinput_ByID_Login {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	//System.out.println("Enter the author name");
	
//	System.out.println("Enter the name ");
//	String name= sc.next();
//	System.out.println("Enter the Email");
//	String email= sc.next();
//	System.out.println("Enter the phone number");
//	String phone= sc.next();
//	System.out.println("Enter the Address");
//	String address= sc.next();
//	System.out.println("Select the gendre");
//	String gendre= sc.next();
  //  System.out.println("Select the day");
 //   String user_day= sc.next();
	System.out.println("Select the country");
    String country= sc.next();
//	System.out.println("Select the colour");
//	String coulur= sc.next();
//	System.out.println("Select the Sorted list");
//	String sortedList= sc.next();
//	System.out.println("Select the from date");
//	String fromDate= sc.next();
//	System.out.println("Select the to date");
//	String toDate= sc.next();
//	
	


	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	//Identify all the elements by using ID locator
//	WebElement name_Element= driver.findElement(By.id("name"));
//	boolean result=name_Element.isDisplayed();
//	System.out.println("Name text filed is displayed "+ result);
//	name_Element.sendKeys(name);
//	
//	WebElement email_Element= driver.findElement(By.id("email"));
//	boolean result1=email_Element.isDisplayed();
//	System.out.println("Email text field is displayed "+result1);
//	email_Element.sendKeys(email);
//	
//	WebElement phone_Element= driver.findElement(By.id("phone"));
//	boolean result2=phone_Element.isDisplayed();
//	System.out.println("Phon no text field is displayed "+result2);
//	phone_Element.sendKeys(phone);
//	
//	WebElement address_Element= driver.findElement(By.id("textarea"));
//	boolean result3=address_Element.isDisplayed();
//	System.out.println("Address text field is displayed "+result3);
//	address_Element.sendKeys(address);
	
	/*String gendreM="Male";
	String gendreF="Female";
	
	if (gendre.equalsIgnoreCase(gendreM)) {
		WebElement gendre_elementM= driver.findElement(By.id("male"));
		gendre_elementM.click();
		boolean result4=gendre_elementM.isSelected();
		System.out.println("Male gendre radio button is Selected "+result4);
    } 
	
	else if (gendre.equalsIgnoreCase(gendreF)) {
		
		WebElement gendre_ElementF= driver.findElement(By.id("female"));
		gendre_ElementF.click();
		boolean result5=gendre_ElementF.isSelected();
		System.out.println("Female gndre radio button is Selected "+result5);
	} */
	
	
	// User day actions
 /*String sunday="Sunday";String monday="Monday";String tuesday="Tuesday";String wednessday="Wednessday";
 
	if (user_day.equalsIgnoreCase(sunday)) {
    WebElement dayElement= driver.findElement(By.id("sunday"));
    dayElement.click();
	boolean result6=dayElement.isSelected();
	System.out.println("Sunday is checked "+result6);


    } else if(user_day.equalsIgnoreCase(monday)){
		 WebElement dayElement= driver.findElement(By.id("monday"));
		    dayElement.click();
			boolean result7=dayElement.isSelected();
			System.out.println("Monday is checked "+result7);
	}*/

	
	
	
			    



	   
	 
	
	WebElement country_Element= driver.findElement(By.id("country"));
	country_Element.click();
	boolean result8=country_Element.isDisplayed();
	System.out.println("Country drop down displayed "+result8);
	
	
//	WebElement coulur_Element= driver.findElement(By.id("colors"));
//	WebElement sortedList_Element= driver.findElement(By.id("animals"));
//	WebElement fromDate_Element= driver.findElement(By.id("datepicker"));
//	WebElement toDate_Element= driver.findElement(By.id("txtDate"));

	
	

driver.quit();

	
}}
	
	
	


