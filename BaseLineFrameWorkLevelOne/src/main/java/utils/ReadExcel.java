package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	static Object[][] data;
	public static Object[][] readData(String dataSheetName) {
		//Enter Workbook
		XSSFWorkbook wbook;
		try {
			wbook = new XSSFWorkbook("./Data/"+dataSheetName+".xlsx");
		
		XSSFSheet sheet = wbook.getSheet("Sheet1"); 		//Entering sheet
		
		int rowCount = sheet.getLastRowNum();				//Getting row count
		System.out.println("Row count "+rowCount);				
		int colCount = sheet.getRow(0).getLastCellNum();	//Getting Cell Count for header row
		System.out.println("Column Count "+colCount);
		
		data = new Object[rowCount][colCount];   //Object[][] 
		
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);					//Entering row
			for (int j = 0; j < colCount; j++) {			//Enter Cell
				XSSFCell cell = row.getCell(j);				//Getting value from cell		
				
				data[i-1][j] = cell.getStringCellValue();
			}						
		}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return data;
		
		
		
		
		
		
	}

}