import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static Object [][] readdata(String file)  throws IOException {
		// work book
		XSSFWorkbook Workbook = new XSSFWorkbook("./ExcelData/"+file+".xlsx");

		//work sheet Sheet1
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		//get row count
		int rowcount = sheet.getLastRowNum();
		//get column count
		int colcount = sheet.getRow(0).getLastCellNum();
		Object [][]  data = new Object[rowcount][colcount];
		for (int i = 1; i <= rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colcount; j++) {

				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();

			}
		}
		return data;

	}

}
