package excelOperation;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Test {

	public static void main(String[] args) throws IOException
	{

		
	File f = new File("d://new.txt");
	//output stream to write files, and chaining to previous step
	FileWriter fw = new FileWriter(f);
	
	//Chaining Buffered writer to write in the text file
	BufferedWriter writer = new BufferedWriter(fw);
	
	//writing in the text file
	String name = "nandan";
	String surname = "singh";
	String para = " once upon a time there was a king, simba, who is " +
	"taken care by 'Timon' and 'pumba";
	writer.write(name);
	
	//creating a new line using method of BufferedWriter
	
	writer.newLine();
	writer.write(surname);
	writer.newLine();
	writer.write(para);
	//closing the last stream
	writer.close();
	
	//end of the process for our acknowledge
	System.out.println("file has been created");

	}

}
