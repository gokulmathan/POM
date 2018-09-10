package readexcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataExcel {
	
	public static void main (String [] args) throws IOException {
		//open workbook
		XSSFWorkbook wBook = new XSSFWorkbook("./data/Book1.xlsx");
		//go to sheet
		XSSFSheet sheet = wBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		int columnCount =sheet.getRow(0).getLastCellNum();
		// go to row
		for (int i = 1; i<=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			//go to cell
			for (int j = 0; j<columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//read the data
				String data = cell.getStringCellValue();
				System.out.println(data);
			}
		}
		
		
		
		
	}

}
