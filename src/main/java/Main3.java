import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class Main3 {
    public static void main(String args[]) throws FileNotFoundException {
        String path="C:\\Users\\prajjwal.singh\\Documents\\ITEXT\\thirdpdf.pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        Document document=new Document(pdfDocument);
        Style author=new Style();
        author.setFontColor(Color.BLUE)
                        .setFontSize(100f)
                        .setItalic();
        Paragraph paragraph1=new Paragraph();
        paragraph1.add("HELLO HOW ARE U").addStyle(author);
        document.add(paragraph1);
        document.close();
        System.out.println("PDF Created");


    }
}
