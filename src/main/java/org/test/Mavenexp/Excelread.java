package org.test.Mavenexp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

	public static void main(String[] args) throws IOException {
		File lo=new File("C:\\Users\\Admin\\Desktop\\Mavenexp\\fold\\velu.xlsx");
		Workbook w=new XSSFWorkbook();
		Sheet s=w.createSheet("vidhya");
		Row r=s.createRow(5);
		Cell c=r.createCell(2);
		c.setCellValue("Vidhya");
	
		FileOutputStream f=new FileOutputStream(lo);
		
		w.write(f);
		System.out.println("Done");
		

	}

}
