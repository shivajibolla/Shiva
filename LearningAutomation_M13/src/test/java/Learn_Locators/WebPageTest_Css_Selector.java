package Learn_Locators;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageTest_Css_Selector {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);

//	      System.out.println("Enter the name");
//	      String userName = sc.next();
	      
//	      System.out.println("Enter the email");
//	      String useremail = sc.next();
//	      
//	      System.out.println("Enter the phone number");
//	      String phone = sc.next();
//		
//		System.out.println("Enter the Address");
//	     String address = sc.next();
//	     
	     System.out.println("Enter the Gendre");
         String userGendre = sc.next();
		 System.out.println("Enter your day");
	       String user_day=sc.next();
		
	      
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
          driver.get("https://testautomationpractice.blogspot.com/");
        
        
        
      // Email text field *** by using Tagname[Attribute='Attributevalue']
        //driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys(userName);
        
      //Phone number text field
        //driver.findElement(By.cssSelector("input[id='phone']")).sendKeys(phone);
        
        //email text field
       //driver.findElement(By.cssSelector("input[placeholder='Enter EMail']")).sendKeys(useremail);
        
       //address text field 
        //driver.findElement(By.cssSelector("textarea[id='textarea']")).sendKeys(address);
        
       
        // Gendre radio button
        /*String gendre="Male"; String gendreF="Female"; 
        if (gendre.equalsIgnoreCase(userGendre)) {
        	driver.findElement(By.cssSelector("input[value='male']")).click();
        	System.out.println("Radio button checked "+driver.findElement(By.cssSelector("input[value='male']")).isSelected());  
        	
		} else if(gendreF.equalsIgnoreCase(userGendre)) {

			driver.findElement(By.cssSelector("input[id='female']")).click();
        	System.out.println("Radio button checked "+driver.findElement(By.cssSelector("input[id='female']")).isSelected());  
        	
		}*/
         
        
        String sunday="Sunday";String monday="Monday";String tuesday="Tuesday";String wednesday="Wednessday"; String thursday="thursday";
        String friday="Friday"; String saturday="Saturday";
       
    	if (user_day.equalsIgnoreCase(sunday)) {
        driver.findElement(By.cssSelector("input[value='sunday']")).click();
       

        } else if(user_day.equalsIgnoreCase(monday)){
            driver.findElement(By.cssSelector("input[value='monday']")).click();
       
        }else if (user_day.equalsIgnoreCase(tuesday)) {
            driver.findElement(By.cssSelector("input[value='tuesday']")).click();
            

             } else if(user_day.equalsIgnoreCase(wednesday)){
                 driver.findElement(By.cssSelector("input[value='wednesday']")).click();
         		   

             }else if(user_day.equalsIgnoreCase(thursday)){
                 driver.findElement(By.cssSelector("input[value='thursday']")).click();
                 
             }else if (user_day.equalsIgnoreCase(friday)) {
                 driver.findElement(By.cssSelector("input[value='friday']")).click();
                 

                  } else if(user_day.equalsIgnoreCase(saturday)){
                      driver.findElement(By.cssSelector("input[value='saturday']")).click();
              		   
                  }else {
					System.out.println("Enter valid Day");
				}
        
        System.out.println("Successfully completed");
        Thread.sleep(3000);
        driver.close();
        
	}

}
