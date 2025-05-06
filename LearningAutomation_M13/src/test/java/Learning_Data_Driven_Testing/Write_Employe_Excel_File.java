package Learning_Data_Driven_Testing;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Write_Employe_Excel_File {

	
	static FileInputStream fis;
	static Workbook book;
	
	public static void initializeExcel(String path) throws IOException {
		
		//Step:1 conver pgysical file in to java understandable file
		fis=new FileInputStream(path);
		
		//Step2: Create work book by suing workbook factory
		book=WorkbookFactory.create(fis);
		
	}
	
	
	public static String readSingleData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {

		String data = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println("Reading single data is: "+data+" which is present in: "+" row num: "+row+" and column no: "+cell);
		
		return data;
		}
	

	
	public static void main(String[] args) throws IOException {

		
		// calling 	initializeExcel method and initialising
			initializeExcel("./src/test/resources/Employe_Details.xlsx");
			
			System.out.println("********************************");
			
		// calling 	readSingleData
			String userName=readSingleData("Employee_Raw_Data",1,1);
			
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.automationexercise.com/");

			
		//click on login button
			driver.findElement(By.partialLinkText("Login")).click();
		
		
			
		//Enter user name taken from excell
			WebElement nameTextField = driver.findElement(By.xpath("//button[text()='Signup']/preceding-sibling::input[@data-qa='signup-name']"));
			nameTextField.sendKeys(userName);
			System.out.println("Entered the  name in  name text fied");
			
		
			//Enter user name taken from excell	
			String emailTextField=readSingleData("Employee_Raw_Data",1,2);

			WebElement passwordTextField = driver.findElement(By.xpath("//button[text()='Signup']/preceding-sibling::input[@data-qa='signup-email']"));
			passwordTextField.sendKeys(emailTextField);
			System.out.println("Entered the email in email fied");
			
			
			//click on signup
			WebElement element = driver.findElement(By.xpath("//button[text()='Signup']"));
			driver.findElement(By.xpath("//button[text()='Signup']")).click();
			System.out.println("clicked on signup button");

			
			
			
			
	}










	
}
