package pdfexample;

import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class CreatePdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName=null;
	      if (args.length < 1) {
	            System.out.println("Enter the File Name");
	  	      Scanner sc= new Scanner(System.in);
	  		fileName=sc.next();	     
	  		}
//	      Scanner sc= new Scanner(System.in);
//		String fileName=sc.next();
		
		PDDocument doc= new PDDocument();
		PDPage page=new PDPage();
		doc.addPage(page);
		
		try(PDPageContentStream content=new PDPageContentStream(doc, page)){
            content.setFont(PDType1Font.HELVETICA_BOLD, 12);

			content.beginText();
            content.newLineAtOffset(0, 0); // Adjust the position (x, y) as needed

			content.showText("My Name is Sateesh");
			content.endText();
			content.close();
			doc.save(fileName);
            System.out.println("PDF created: " + fileName);

		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
