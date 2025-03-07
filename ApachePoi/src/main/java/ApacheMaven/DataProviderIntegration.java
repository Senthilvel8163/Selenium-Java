package ApacheMaven;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderIntegration {

	public static void main(String[] args) {

	}

	public static String[][] getExcelData() throws IOException {

		String fileLocation = "./test-data/Login-data.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		XSSFSheet sheet = wbook.getSheetAt(0);
				

		// Get number of rows excluding header row
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("Number of rows with exclusive header: " + lastRowNum);

		// Get number of rows including header row
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows with inclusive header: " + physicalNumberOfRows);

		// Get number column
		short lastCellNumber = sheet.getRow(0).getLastCellNum();
		System.out.println("Number of Cells: " + lastCellNumber);

		String[][] data = new String[lastRowNum][lastCellNumber];
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNumber; j++) {
				XSSFCell cell = row.getCell(j);

		// Read integer as String(Convert integer into String)
				DataFormatter dft = new DataFormatter();
				String valueOfInteger = dft.formatCellValue(cell);

		// String value = cell.getStringCellValue();
	    // System.out.println(valueOfInteger);
				data[i - 1][j] = valueOfInteger;

			}
			wbook.close();

		}
		return data;
	}

}
