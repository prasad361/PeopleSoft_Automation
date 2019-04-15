package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig
{
		XSSFWorkbook wb;
		XSSFSheet Sheet;
		int TotalRows;
		int TotalCols;
		public ExcelDataConfig(String ExcelPath) throws Exception
		{
			try
			{
				File src = new File(ExcelPath);
				FileInputStream fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
				Sheet = wb.getSheet("MCB_TC_01");
				TotalRows = Sheet.getLastRowNum();
				TotalCols = Sheet.getRow(0).getLastCellNum();
			}
			
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
		}
		
		public String GetData(String SheetName, String ColName)
		{
			String data = null;
			try
			{
				int rownum = 1;
				String Col;
				for (int c=0;c<=TotalCols;c++)
				{				
					Col = Sheet.getRow(0).getCell(c).getStringCellValue();
					if (Col == ColName)
					{
						data = Sheet.getRow(rownum).getCell(c).getStringCellValue();
						break;
					}
				}
				wb.close();
				
			}
			catch (Exception e)
			{
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			return data;
			
		}
}
