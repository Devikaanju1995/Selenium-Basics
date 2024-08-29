package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utilities 
{
public	static FileInputStream f;
public	static  XSSFWorkbook w;
public	static XSSFSheet sh;
public static String get_StringData(int row,int column,String sheet) 
{
	try
	{
		
	
	f=new FileInputStream("C:\\Users\\Sathish\\git\\Selenium-Basics\\Selenium_Maven_Project\\src\\test\\resources\\Testdata.xlsx");
	w=new XSSFWorkbook(f); 
	sh=w.getSheet(sheet);
	Row r=sh.getRow(row);
	Cell c=r.getCell(column);
	return c.getStringCellValue();
	}
	catch(Exception e)
	{
		throw new RuntimeException("Excelsheet not found");
	}
	
}
public String get_IntegerData(int row,int column,String sheet) 
{
	try
	{
	f=new FileInputStream("C:\\Users\\Sathish\\git\\Selenium-Basics\\Selenium_Maven_Project\\src\\test\\resources\\Testdata.xlsx");
	w=new XSSFWorkbook(f); 
	sh=w.getSheet(sheet);
	Row r=sh.getRow(row);
	Cell c=r.getCell(column);
	int x=(int) c.getNumericCellValue();
	return String.valueOf(x);
	}
	catch(Exception e)
	{
		throw new RuntimeException("Excelsheet not found");
	}
	
}
}
