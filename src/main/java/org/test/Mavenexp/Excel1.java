package org.test.Mavenexp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) throws IOException {
		File loc=new File("C:\\Users\\Admin\\Desktop\\Mavenexp\\fold\\vidhya.xlsx");
		FileInputStream s=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(s);
		Sheet st=w.getSheet("Sheet1");
		for(int i=0; i<st.getPhysicalNumberOfRows();i++)
		{
			Row r=st.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c=r.getCell(j);
			int type=c.getCellType();
		
			if(type==1)
			{
				String StringCellValue=c.getStringCellValue();
				System.out.println(StringCellValue);}
				else if(type==0)
				{
					if(DateUtil.isCellDateFormatted(c))
					{
						Date dateCellValue=c.getDateCellValue();
						SimpleDateFormat sim=new SimpleDateFormat("dd-MMM-yy");
						String format=sim.format(dateCellValue);
						System.out.println(format);
						
					}
					else {
						double n = c.getNumericCellValue();
						long l=(long)n;
						String val=String.valueOf(l);
						System.out.println(val);
						
						
				}
			}
			
		}
		

	}

}
}