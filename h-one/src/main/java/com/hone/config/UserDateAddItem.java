package com.hone.config;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class UserDateAddItem {
	
	public static void main (String args[]) throws IOException{
		UserDateAddItem addItem =  new UserDateAddItem();
		addItem.writeExcel("./data/userDataAddtem.xlsx","userDataAddtem.xlsx", "sumuduSh");
	
	}


	public void writeExcel(String filePath, String fileName, String sheetName)
			throws IOException {

		// Create an object of File class to open xlsx file
		
		File file = new File("E:\\projects\\H-one\\h-one\\data\\userDataAddtem.xlsx");

		// Create an object of FileInputStream class to read excel file

		FileInputStream inputStream = new FileInputStream(file);

		//Workbook guru99Workbook  = null;

		// Find the file extension by splitting file name in substring and
		// getting only extension name

		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		
		

		// Check condition if the file is xlsx file

		if (fileExtensionName.equals(".xlsx")) {

			// If it is xlsx file then create object of XSSFWorkbook class

			guru99Workbook  = new XSSFWorkbook(inputStream);

		}

		// Check condition if the file is xls file

		else if (fileExtensionName.equals(".xls")) {

			// If it is xls file then create object of XSSFWorkbook class

			guru99Workbook  = new HSSFWorkbook(inputStream);

		}

		// Read excel sheet by sheet name

		Sheet sheet = guru99Workbook .getSheet(sheetName);

		// Get the current count of rows in excel file

		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		List<String> list = null;
		// Get the first row from the sheet
		for (int i = 0; i < rowCount+1; i++) {

	        Row row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");
	            //if (row.getCell(j).getStringCellValue() != null){
	            //	list.add(row.getCell(j).getStringCellValue()+"|| ");
	            //}
	        }

	        System.out.println();
	    } 

		Row row = sheet.getRow(0);
		System.out.println(list);
		// Create a new row and append it at last of sheet

		Row newRow = sheet.createRow(rowCount + 1);

		// Create a loop over the cell of newly created Row

		

		// Close input stream

		inputStream.close();

		

	}

}
