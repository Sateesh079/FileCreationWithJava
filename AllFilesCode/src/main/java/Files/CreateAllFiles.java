package Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAllFiles {
	public static void main(String[] args) {
		String fileName=null;
		 if(args.length<1) {
			 System.out.println("Enter File Name");
			 Scanner sc= new Scanner(System.in);
			 fileName=sc.next();
			 sc.close();
			 
		 }else {
			 fileName=args[0];
		 }
		 XSSFWorkbook workbook=new XSSFWorkbook();
		 Sheet sheet=workbook.createSheet("Sheet1");
		 Row row=sheet.createRow(1);
		 Cell cell=row.createCell(1);
		 cell.setCellValue("Sateesh");
System.out.println("hello hemanth anna");
		 
		 try(FileOutputStream fos=new FileOutputStream(fileName)){
				
				workbook.write(fos);
				System.out.println("Excel file created successfully.");
				workbook.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
