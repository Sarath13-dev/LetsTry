package org.compny;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFiles {

	public static void main(String[] args) throws IOException {
		
		//create object for file
		File f = new File("D:\\GREENS\\TRAINNING\\Book3.xlsx");
		
		//to read file
		FileInputStream str = new FileInputStream(f);
		
		//to read workbook
		Workbook w = new XSSFWorkbook(str);
		
		
		//to get sheet
		Sheet sheet = w.getSheet("Sheet1");
		
		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			//seperating each row
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				String stringCellValue = cell.getStringCellValue();
				
				System.out.println(stringCellValue);
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
