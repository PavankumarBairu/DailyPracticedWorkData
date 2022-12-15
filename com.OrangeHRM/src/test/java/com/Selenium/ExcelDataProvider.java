package com.Selenium;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	
	public static void main(String[] args) throws Exception {
		
		
		File file = new File("D:\\Software & Work\\Selenium\\Excel1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		System.out.println("Excel file found :"+file.exists());
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet 		  = workbook.getSheetAt(0);
		int rows 			  = sheet.getPhysicalNumberOfRows();
		int cells			  =sheet.getRow(0).getLastCellNum();
		System.out.println("No of Rows :"+rows);
		System.out.println("No of Columns :"+cells);
		
		
		// converting it into array type
		
//		String[][] data = new String[rows-1][cells];
		
		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				
				System.out.println(sheet.getRow(i).getCell(j));
			}
			
		}
		
		workbook.close();
		fis.close();
		
		
		
	}

}
