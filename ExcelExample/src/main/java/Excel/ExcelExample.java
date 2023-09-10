package Excel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelExample {

    public static void main(String[] args) {
        // Create a new XSSFWorkbook (XSSFWorkbook for XLSX format)
      //  try (Workbook workbook = new XSSFWorkbook()) {
        XSSFWorkbook workbook=new XSSFWorkbook();
    	// Create a new sheet in the workbook
            Sheet sheet = workbook.createSheet("MySheet");

            // Create a row and a cell
            Row row = sheet.createRow(1);
            Cell cell = row.createCell(1);

            // Set the cell's value
            cell.setCellValue("Sateesh");

            // Create a FileOutputStream to write the workbook to a file
            try (FileOutputStream fos = new FileOutputStream("ExcelNameB2.xlsx")) {
                workbook.write(fos);
                System.out.println("Excel file created successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         //   catch (IOException e) {
//            e.printStackTrace();
//        }
    
}
