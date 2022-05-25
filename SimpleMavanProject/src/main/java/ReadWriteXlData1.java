import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteXlData1 {
	
	
	public static void readDataFromXlsxCell(int rowData,int colData,String sheetName,String path) throws IOException {
		FileInputStream fs=new FileInputStream(new File(path));
		XSSFWorkbook workbook=new XSSFWorkbook(fs);// .xlsx
		XSSFSheet sheet=workbook.getSheet(sheetName);
		XSSFRow row=sheet.getRow(rowData);
		XSSFCell cell=row.getCell(colData);
		if(cell.getCellType()== CellType.NUMERIC)
			System.out.println(cell.getNumericCellValue());
		else if(cell.getCellType()== CellType.STRING)
			System.out.println(cell.getStringCellValue());
	}
	public static String ReadFromPropertyFile() throws IOException
	{
		FileInputStream fs=new FileInputStream(new File(".//src//test//resources//Data1.properties"));
		Properties p=new Properties();
		p.load(fs);
	 String value= p.getProperty("XlxsFilename");
		
		
		return value;
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//String path=".//src//test//resources//Dec22Exel.xlsx";
		String filePath= ReadFromPropertyFile();
		
		readDataFromXlsxCell(1,1,"Sheet1",filePath);
	}

}
