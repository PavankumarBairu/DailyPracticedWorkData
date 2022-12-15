package com.Selenium;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\Software & Work\\Selenium\\Test.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet= workbook.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Row count is : "+rowCount);
		for(int i=1;i<rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			int celllength=row.getPhysicalNumberOfCells();
			for(int j=0;j<celllength;j++) {
				XSSFCell cell= row.getCell(j);
				Object cellValue = getCellValue(cell);
				System.out.print("||"+cellValue);
//				System.out.print("||"+cell);
			}
			System.out.println();
		}
		workbook.close();
		fis.close();
	}
	public static String getCellValue(XSSFCell cell) {
		switch(cell.getCellType()) {
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
		case STRING:
			return cell.getStringCellValue();
		default:
			return cell.getStringCellValue();
		}
	}
}
