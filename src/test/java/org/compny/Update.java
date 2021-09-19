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

public class Update {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\GREENS\\TRAINNING\\practice1.xlsx");
		
		FileInputStream str = new FileInputStream(f);
		
		Workbook w = new XSSFWorkbook(str);
		
		Sheet sheet = w.getSheet("abcd");
		
		Row row = sheet.getRow(0);
		
		Cell cell = row.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();
		
		if(stringCellValue.equals("Sarat")) {
			cell.setCellValue("SaratKumar");
		}
		
		FileOutputStream ou = new FileOutputStream(f);
		
		w.write(ou);
		
	}
	
}
