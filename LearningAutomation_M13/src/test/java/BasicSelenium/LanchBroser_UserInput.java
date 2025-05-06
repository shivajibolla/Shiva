package BasicSelenium;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LanchBroser_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WAJP to launch the browser based on user choise
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name");
		String user=sc.next();
		String user2=user.toLowerCase();
	    
		
	    if (user2.equals("chrome")) {
			new ChromeDriver();
		}
		else if (user2.equals("edge")) {
			new EdgeDriver();
		}
		
	
	
		
	}

}
