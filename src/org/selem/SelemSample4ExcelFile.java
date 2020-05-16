package org.selem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SelemSample4ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		System.out.println("STARTED");
		
		File excelFile = new File("C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\TestExcelFile.xlsx");
		//new FileInputStream(excelFile);
		
		FileInputStream excelFis = new FileInputStream("C:\\Users\\ranjana\\Downloads\\Academics\\AutomationDemo\\AutomationDemo\\src\\resources\\TestExcelFile.xlsx");
		
		Workbook wb = WorkbookFactory.create(excelFis);
		
		XSSFWorkbook workbook = new XSSFWorkbook();
				
		System.out.println("Total no of sheets: "+wb.getNumberOfSheets());
		
		Sheet mysheed = wb.getSheet("MyTestData");
		//wb.getSheetAt(0);
				
		System.out.println("Last row number :"+mysheed.getLastRowNum());
		
		Row myRow = mysheed.getRow(0);
		
		System.out.println("Last cell no :"+ myRow.getLastCellNum());
		
		Cell myCell = myRow.getCell(1);
		
		String myCellValue = myCell.getStringCellValue();
		
		System.out.println("MyCellValue is : "+myCellValue);
		
		excelFis.close();
	}
}
