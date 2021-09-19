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

public class DateFileWrite {

	public static void main(String[] args) throws IOException {
		
		//Object for file
		File f = new File("D:\\GREENS\\TRAINNING\\practice1.xlsx");
		
		//object for FileInputStream
		
		
		Workbook w = new XSSFWorkbook();
		
		//create a sheet
		Sheet createSheet = w.createSheet("abcd");
		
		//create a row
		Row createRow = createSheet.createRow(0);
		
		//create a cell
		
		Cell createCell = createRow.createCell(0);
		
		//set value for cell
		
		createCell.setCellValue("Java Selenium");
		
		//object for FileOutputStream
		
		FileOutputStream stream1 = new FileOutputStream(f);
		
		w.write(stream1);
		
		System.out.println("done");
		
		
	}
}
