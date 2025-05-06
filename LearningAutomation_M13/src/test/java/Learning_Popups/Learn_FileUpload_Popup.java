package Learning_Popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_FileUpload_Popup {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@id='singleFileInput']"));

	//Scroll action to see the uploading
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", chooseFile);
		
		//1.Create object for file class
		File fileObj=	new File("./MyTestFile.txt");
		
		//2.Fetch the absolute path of the file to upload
		String absolutepath= fileObj.getAbsolutePath();
		
		//3.Pass the path through send keys
		chooseFile.sendKeys(absolutepath);
	
	
	
	
	}

}
