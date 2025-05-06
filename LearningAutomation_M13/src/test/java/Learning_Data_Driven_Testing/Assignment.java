package Learning_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Clicked on search button");
		
		 List<WebElement> allproducts = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		 
		int count= allproducts.size();
		
		for (int i = 0; i < count; i++) {
			String allmobiles=allproducts.get(i).getText();
			System.out.println(allmobiles);
			
			
			
		}
		//store in excel
		FileInputStream fis= new FileInputStream("./src/test/resources/FlipcartData.xlsx");
		Workbook book=  WorkbookFactory.create(fis);
		book.getSheet("");
	
		FileOutputStream fos = new FileOutputStream("./src/test/resources/FlipcartData.xlsx");
		book.write(fos);
		book.close();
		System.out.println("Fetched the data in excel sheet");
		 
		
	}

	

		
	

}
