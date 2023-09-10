import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcel   
{   
public static void main(String[] args)  
{   
//creating an instance of Workbook class   
//HSSFWorkbook workbook=new HSSFWorkbook();
XSSFWorkbook workbook=new XSSFWorkbook();

Sheet sheet=workbook.createSheet("sheet");

Row row=sheet.createRow(1);
Cell cell=row.createCell(1);

cell.setCellValue("Sateesh");

try(FileOutputStream fos=new FileOutputStream("ExcelSheetName.xlsx")){
	
	workbook.write(fos);
	System.out.println("Excel file created successfully.");
	workbook.close();
}
catch (IOException e) {
	e.printStackTrace();
}

}   
}  