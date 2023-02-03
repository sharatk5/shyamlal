package org.basemaven;

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

public class Testmav1 {
	
//	to write a file 
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\REYANSH\\eclipse-workspace\\MavenFramework\\Excel files\\Data2.xlsx");
	
		FileInputStream fin=new FileInputStream(f);
		
		
		Workbook w=new XSSFWorkbook(fin);
		
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(3);
		
		
		String value = c.getStringCellValue();
		
		if (value.contains("zerka")) {
			
			
			c.setCellValue("tobi");
			
		}
		
		FileOutputStream fos=new FileOutputStream(f);
		
		w.write(fos);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Sheet s = w.createSheet("Sheet1");
//		
//		Row r = s.createRow(2);
//		
//		Cell c = r.createCell(3);
//		
//		c.setCellValue("zerka");
//		
//		
//		FileOutputStream fos=new FileOutputStream(f);
//		
//		w.write(fos);
		
		
		
		
		
		
		
		
	
		System.out.println("XIX");
		
		
		
		
		
		
		
	}

}
