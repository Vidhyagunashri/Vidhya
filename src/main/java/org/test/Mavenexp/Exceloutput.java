package org.test.Mavenexp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceloutput {

	public static void main(String[] args) throws IOException {
		File lo=new File("C:\\Users\\Admin\\Desktop\\Mavenexp\\fold\\velu.xlsx");
		FileInputStream f=new FileInputStream(lo);
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String s1=c.getStringCellValue();
		if(s1.contentEquals("farith"))
		{
			c.setCellValue("vidhya");
		}
		FileOutputStream o=new FileOutputStream(lo);
		w.write(o);
		System.out.println("Done");
		

	}

}
