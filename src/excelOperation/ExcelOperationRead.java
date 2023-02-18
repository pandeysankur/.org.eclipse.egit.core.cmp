package excelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelOperationRead {

	public static void main(String[] args) throws IOException {
		HSSFWorkbook wb =new HSSFWorkbook();
		
	      //creating sheet on work book
			Sheet sheet1=wb.createSheet("Student_details");		
			//create row
			Row row=sheet1.createRow(0);
			
			//create cell
			Cell cell1=row.createCell(0);
			Cell cell2=row.createCell(1);
			
			//set value
			cell1.setCellValue("pune");
			cell2.setCellValue("Mumbai");
			
			
			FileInputStream fis =new FileInputStream("Testing.xls");
			fis.read();
			System.out.println("Location :"+cell1.getStringCellValue().toString());
			System.out.println("Location :"+cell2.getStringCellValue().toString());

	}

}
