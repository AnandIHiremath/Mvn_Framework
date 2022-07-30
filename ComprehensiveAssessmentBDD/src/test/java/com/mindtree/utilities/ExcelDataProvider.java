package com.mindtree.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelDataProvider {

	HSSFWorkbook wb;
	public ExcelDataProvider() {
		File src=new File("C:\\Users\\M1089308\\eclipse-workspace\\ComprehensiveAssessmentBDD\\ExcelData\\Tide.xls");

		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new HSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read Excel File"+e.getMessage());
		}
		
	}
	
	public String getStringData(int sheetindex,int row,int column) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getStringData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public double getNumericData(int sheetindex,int row,int column) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getNumericCellValue();
	}
}
