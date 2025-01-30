package com.cgi.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ZDemo2Excel {

	public static void main(String[] args) throws IOException {
		
		//location - read or write
		FileInputStream file=new FileInputStream("test-data/orange-test-data.xlsx");
		
		//Open
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		//sheet
		XSSFSheet sheet= book.getSheet("invalidLoginTest");
		
		
		String value= sheet.getRow(0).getCell(2).getStringCellValue();
		System.out.println(value);
		
		//print all cell values 
		
		
		book.close();
		file.close();
	}

}
