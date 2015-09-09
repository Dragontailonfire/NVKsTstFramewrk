package maincomponents;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataSheet {

	public ReadDataSheet() {
		// TODO Auto-generated constructor stub
	}
	private static XSSFSheet ExcelWorkSheet;
	private static XSSFWorkbook ExcelWorkBook;
	private static XSSFCell ExcelCell;
	//private static XSSFRow ExcelRow;
	
	public static void setExcelFile(String Path, String SheetName) throws Exception{
		
		try {
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWorkBook = new XSSFWorkbook(ExcelFile);
			ExcelWorkSheet = ExcelWorkBook.getSheet(SheetName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getCellData(int rowNum, int colNum) throws Exception{
		try {
			ExcelCell = ExcelWorkSheet.getRow(rowNum).getCell(colNum);
			String CellData = ExcelCell.getStringCellValue();
			return CellData;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "FAIL to read cell data";
		}
	}

}
