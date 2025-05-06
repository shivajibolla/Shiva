package Learning_Data_Driven_Testing;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handling_Excel_File {

	public static void main(String[] args) throws IOException {


		readSingleData("AccountInformation",1,1);
		System.out.println("Executed");

	}

	
	
	public static void readSingleData(String sheet, int row, int cell) throws IOException {
		//1
		FileInputStream fis=new FileInputStream("./src/test/resources/AutomationExercise.xlsx");

		//2 create input stream need to take
		Workbook book= WorkbookFactory.create(fis);
		
		String data =book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		System.out.println(data);
		
	}

}
