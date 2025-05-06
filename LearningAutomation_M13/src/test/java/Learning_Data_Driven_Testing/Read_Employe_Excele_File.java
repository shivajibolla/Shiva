package Learning_Data_Driven_Testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Employe_Excele_File {

	static FileInputStream fis;
	static Workbook book;
	
	public static void initializeExcel(String path) throws IOException {
		
		//Step:1 conver pgysical file in to java understandable file
		fis=new FileInputStream(path);
		
		//Step2: Create work book by suing workbook factory
		book=WorkbookFactory.create(fis);
		
	}
	
	
	public static void readSingleData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {

		String data = book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println("Reading single data is: "+data+" which is present in: "+" row num: "+row+" and column no: "+cell);
		
		
		}
	
	
	public static void read_Nth_Row_Data(String sheet,int row) {
		
		int lastcellnum=book.getSheet(sheet).getRow(row).getLastCellNum();
		System.out.println("lastcellnumis : "+lastcellnum);
		
			for (int i = 0; i < lastcellnum; i++) {
			//printing entire row 1 after finding the nth row
				String row1_Data=book.getSheet(sheet).getRow(row).getCell(i).getStringCellValue();
				System.out.print(row1_Data);
				System.out.print(" ");
			}
		
				System.out.println(" ");

	}
	
	public static void read_Nth_Column_Data(String sheet,int column) {

		int lastRownum = book.getSheet(sheet).getLastRowNum();
		
		for (int i = 0; i < lastRownum; i++) {
			String entireColumnData = book.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();

			System.out.println(entireColumnData);
			System.out.print(" ");
		}
			System.out.println(" ");


	}

	public static void readAllData(String sheet) {
		
		int lastrownum=book.getSheet(sheet).getLastRowNum();
		for (int i = 0; i < lastrownum; i++) {
			int lastcolumnnum=book.getSheet(sheet).getRow(i).getLastCellNum();
			
			for (int j = 0; j < lastcolumnnum; j++) {
				
				String data=book.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
				System.out.print(data);
				System.out.print(" ");
				
				
			}
			System.out.print(" ");

		}
		
	}
	
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {

	// calling 	initializeExcel method and initialising
		initializeExcel("./src/test/resources/Employe_Details.xlsx");
	
		System.out.println("********************************");
	
		// calling 	readSingleData
		readSingleData("Employee_Raw_Data",1,2);
	
		System.out.println("********************************");

	// Calling read_Nth_Row_Data method
		read_Nth_Row_Data("Employee_Raw_Data", 1);
	
		System.out.println("********************************");

	// Calling read_Nth_Column_Data method
		read_Nth_Column_Data("Employee_Raw_Data", 1);
	
		System.out.println("********************************");

	// Calling readAllData method

		readAllData("Employee_Raw_Data");
	
		}

	

}
