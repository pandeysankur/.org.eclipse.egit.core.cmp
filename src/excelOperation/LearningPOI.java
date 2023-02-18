  package excelOperation;

import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LearningPOI {

	public static void main(String[] args) throws IOException {

		try (
		HSSFWorkbook workbook = new HSSFWorkbook()) {
			
			HSSFSheet sheet1 = workbook.createSheet("firstSheet");
		
			Row row0 = sheet1.createRow(0);
			
			Cell cellA = row0.createCell(0);
			
			cellA.setCellValue("Name");
			
			Cell cellB = row0.createCell(1);
			
			cellB.setCellValue("email");
			
			Cell cellC = row0.createCell(2);
			
			cellC.setCellValue("mobile Number");
		
			File f = new File("d:/new.xls");
			
			FileOutputStream fo = new FileOutputStream(f);
		
			try {
				workbook.write(fo);
				fo.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			// closing stream
		}
		System.out.println("excel file is writtern");

	}

}
