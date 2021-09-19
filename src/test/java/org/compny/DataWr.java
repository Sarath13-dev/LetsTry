package org.compny;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataWr {

	public static void main(String[] args) throws IOException {
		
		File f = new File ("D:\\GREENS\\Sample.xlsx");
		
		Workbook w = new XSSFWorkbook();
		
		Sheet createSheet = w.createSheet("abcd");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(5);
		
		
		createCell.setCellValue("SaratKumar");
		
		
		FileOutputStream str = new FileOutputStream(f);
		
		w.write(str);
		System.out.println("test1");
	}
}
