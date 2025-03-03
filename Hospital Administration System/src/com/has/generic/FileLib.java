package com.has.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
		
	/**
	 * This is the generic method reading the data from excel file 	
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		public String getExceldata(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
			FileInputStream fis= new FileInputStream("./data/HAS_Project.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			return data;
			
		}
		
		
	
}
