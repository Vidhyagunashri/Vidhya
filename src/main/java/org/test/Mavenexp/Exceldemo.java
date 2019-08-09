package org.test.Mavenexp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldemo {
	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Admin\\Desktop\\Mavenexp\\fold\\vidhya.xlsx");
		FileInputStream s=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(s);
		Sheet st=w.getSheet("Sheet1");
		
		for(int i=0;i<st.getPhysicalNumberOfRows();i++)
		{
			Row r=st.getRow(i);{
		
			for(int j=0;j<r.getPhysicalNumberOfCells();j++)
			{
			Cell c=r.getCell(j);
			System.out.println(c);
			}
			}
		}
	}
}
		
		
	
