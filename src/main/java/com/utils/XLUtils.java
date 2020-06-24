package com.utils;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {
	FileInputStream fil;
	XSSFWorkbook workbook;
	 XSSFSheet sheet;
	 XSSFRow row;
	 XSSFCell cell;
	public  String excel_username(int a) throws IOException
	{
		  
		  fil = new FileInputStream(new File("C:\\Users\\itsdi\\Downloads\\FBloginTest.xlsx"));
		  workbook = new XSSFWorkbook(fil);
		  sheet=workbook.getSheet("Sheet3");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		    
			  row =sheet.getRow(a);
			  cell=row.getCell(0);
			  String unanme=cell.getStringCellValue();
			  
            
		return unanme;
}
	
	//To read and return the password
	public  String excel_password(int b) throws IOException {
		  
		  fil = new FileInputStream(new File("C:\\Users\\itsdi\\Downloads\\FBloginTest.xlsx"));
		  workbook = new XSSFWorkbook(fil);
		  sheet=workbook.getSheet("Sheet3");
		  int count=sheet.getLastRowNum();
		  System.out.println(count);
		  
		  row =sheet.getRow(b);
		  cell=row.getCell(1);
		  String pwd=cell.getStringCellValue();
      
	return pwd;
	}
	
	public int getRowCount(String Xlpath,String Sheet) throws IOException {
		File fs = new File(Xlpath);
		fil =  new FileInputStream(fs);
		workbook=new XSSFWorkbook(fil);
		sheet=workbook.getSheet(Sheet);
		int rowcnt = sheet.getLastRowNum();
		
		return rowcnt;
	}
	
	public int getcellCount(String Xlpath,String Sheet,int rownum) throws IOException {
		File fs = new File(Xlpath);
		fil =  new FileInputStream(fs);
		workbook=new XSSFWorkbook(fil);
		sheet=workbook.getSheet(Sheet);
		row= sheet.getRow(rownum);
		int cellcount = row.getLastCellNum();
		return cellcount;
	}
	
	public String getCelldata(String Xlpath,String Sheet,int rownum,int colnum) throws IOException {
		fil=new FileInputStream(Xlpath);
		workbook=new XSSFWorkbook(fil);
		sheet=workbook.getSheet(Sheet);
		row=sheet.getRow(rownum);
		cell=row.getCell(colnum);
		String data;
		try 
		{
			DataFormatter formatter = new DataFormatter();
            String cellData = formatter.formatCellValue(cell);
            return cellData;
		}
		catch (Exception e) 
		{
			data="";
		}
		workbook.close();
		fil.close();
		return data;
		
	}
	

}
