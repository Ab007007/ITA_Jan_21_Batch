package com.ita.selenium.actitime.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FileUtils {
	
	static String configFile = "data/config.properties";
	static String actitime_data = "data/actitime_testdata.xls";
	static File file = null;
	static FileInputStream fis = null;
	static Workbook wb =null;
	static Sheet sheet = null;
	static Row row = null;
	static Cell cell = null;
			
	
 	public static String getPropertyValue(String pn)
	{
		String value = null;
		try
		{
			file = new File(configFile);
			fis = new FileInputStream(file);
			Properties props = new Properties();
			props.load(fis);
			value = props.getProperty(pn);
			System.out.println("--- Value from config file " + pn + " : " + value);
			
		}catch(IOException ex)
		{
			System.out.println("Exception while reading properties file!!!");
		}
		finally
		{
			try 
			{
				fis.close();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return value;
	}
	
 	
 	public static Workbook getWorkbook() throws EncryptedDocumentException, IOException
 	{
	 		file = new File(actitime_data);
			fis = new FileInputStream(file);
			wb = WorkbookFactory.create(fis);
 	
 		return wb;
 	}
	
 	public static Sheet getSheet(String sheetName) throws EncryptedDocumentException, IOException
 	{
 		wb = getWorkbook();
 		sheet = wb.getSheet(sheetName);
 		return sheet;
 	}
 	
 	public static String getCellValue(String sheetName, int rowNum, int columnNum)
 	{
 		String value = null;
 		try {
 			sheet = getSheet(sheetName);
 			row = sheet.getRow(rowNum);
 			cell = row.getCell(columnNum);
 			value = cell.toString();
 		}
 		catch(IOException | EncryptedDocumentException ex)
 		{
 			System.out.println(" Error while creating workbook object");
 		}
 		finally
 		{
 			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		}
 		return value;
 	}
 	
 	public static int getRowCount(String sheetName)
 	{
 		int rowCount = 0;
 		try
 		{
 			sheet = getSheet(sheetName);
 			rowCount = sheet.getLastRowNum()+1;
 		}
 		catch(IOException | EncryptedDocumentException ex)
 		{
 			System.out.println(" Error while creating workbook object");
 		}
 		finally
 		{
 			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 		}
 		return rowCount;
 		
 	}



public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		System.out.println("Sheet count : " + wb.getNumberOfSheets());
		for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			System.out.println(wb.getSheetName(i));
			
		}
		
		sheet = wb.getSheet("create_customer");
		
		System.out.println("Row count : " + sheet.getLastRowNum());
		
		for (int i = 0; i <= sheet.getLastRowNum(); i++) 
		{
			row = sheet.getRow(i);
			System.out.println(row.getCell(0) + " | " + row.getCell(1));
		}
		
		fis.close();
		
		
	}

}
