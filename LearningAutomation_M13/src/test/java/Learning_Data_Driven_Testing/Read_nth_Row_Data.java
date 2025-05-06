package Learning_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_nth_Row_Data {

	
	
	public static void main(String[] args) throws IOException {
		readSingleData("Employee_Raw_Data", 1,1);
		ReadAllData("Employee_Raw_Data");
		
		System.out.println("Execution done");
	}
	
	
	
	public static void readSingleData(String sheet, int row, int cell) throws IOException {
		//1
		FileInputStream fis=new FileInputStream("./src/test/resources/Employe_Details.xlsx");

		//2 create input stream need to take
		Workbook book= WorkbookFactory.create(fis);
		
		String data =book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println("SIngle data: "+data);
	}
	
	

	public static void ReadAllData(String sheet) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Employe_Details.xlsx");

		//2 create input stream need to take
		Workbook book= WorkbookFactory.create(fis);
		
		
		int lastrownum=book.getSheet(sheet).getLastRowNum();
		
		for (int i = 0; i <lastrownum ; i++) {
			
			int lastcellnum = book.getSheet(sheet).getRow(i).getLastCellNum();
			
			for (int j = 0; j < lastcellnum; j++) {
				
				String data=book.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
				System.out.print(data);
				System.out.print(" ");
				
			}
			  System.out.println(" ");
			
		}
		
		
	}
			
	
	
	


}
