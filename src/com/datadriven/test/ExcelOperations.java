package com.datadriven.test;

import com.Excel.utility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader(
				"E:\\JavaSessions\\SeleniumTestSessions\\src\\com\\Testdata\\DummyRegistrationData.xlsx");
		
		//reader.addSheet("HomePage");
		//We can use apache POI api for the various purposes to work with the Excel Sheet.
		//retrieve column values and row values 
		//add column and row to the excel sheet 
		//excel utility is important. Just use the library Xls_reader.java class.
		
		
		if (reader.isSheetExist("HomePage"))
		{
			System.out.println("Sheet present");
		}

	}

}
