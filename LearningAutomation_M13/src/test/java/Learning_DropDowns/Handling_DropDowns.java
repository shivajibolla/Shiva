package Learning_DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Learning_Multiple_Elements_And_AutoSuggestions.Learn_Multiple_WebElements;

public class Handling_DropDowns {

	public static void main(String[] args) throws Exception {


		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	Thread.sleep(10000);
	
	WebElement allcoategory_dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	//Handling dropdown
		//Create one instance for select class and pass the drop down ref to the constructor
		Select selectobj= new Select(allcoategory_dropdown);
		
		//Call the Non static method by using obj ref to perform dropdown action
		
		boolean rs=selectobj.isMultiple();
		if (rs) {
			System.out.println("Dropdown is multiple Select");
		} else {
			System.out.println("Dropdown is Single Select");
			   }
		
		
		selectobj.selectByIndex(10);
		Thread.sleep(3000);
		selectobj.selectByIndex(15);
		Thread.sleep(3000);
		
		selectobj.selectByValue("search-alias=aps");
		Thread.sleep(3000);
		
		selectobj.selectByVisibleText("Automotive");
		
		List<WebElement> alloptions = selectobj.getOptions();
		int count=alloptions.size();
		System.out.println(count);
		
		for (int i = 0; i <count ; i++) {
			String text=alloptions.get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		Thread.sleep(5000);
		driver.close();
		
	}

	private static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

}
