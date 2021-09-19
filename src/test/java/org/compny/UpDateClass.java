package org.compny;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UpDateClass {

	public static void main(String[] args) throws IOException {
	
		File f = new File("D:\\GREENS\\TRAINNING\\Practice.xlsx");
		
		FileInputStream str = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet sheet = w.getSheet("Sheet1");
		
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
				Cell cell = row.getCell(j);
				
				String text = cell.getStringCellValue();
				
				if(text.equals("Murugan")) {
					cell.setCellValue("sarat");
				}
			}
		}
		
		FileOutputStream str1 = new FileOutputStream(f);
		
		w.write(str1);
	
		
	}	
	
}
