import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import javax.swing.text.StyleConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public class main2 {
    public static final String happySwirl="fonts/HappySwirly-KVB7l.ttf";
    public static final String inflateptx="fonts/InflateptxRegular-Wyg8V.ttf";
    public static void main(String args[]) throws IOException {
        List list1=new List();
        list1.add("Java");
        list1.add("Android");
        list1.add("Kotlin");
        list1.add("AWS");
        String path="C:\\Users\\prajjwal.singh\\Documents\\ITEXT\\Secondthpdf.pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        PdfFont font= PdfFontFactory.createFont(FontConstants.HELVETICA_BOLD);
        PdfFont font1=PdfFontFactory.createFont(happySwirl, true);
        PdfFont font2=PdfFontFactory.createFont(inflateptx, true);
        Text text1=new Text("Hello my name is Prajjwal").setFont(font1).setFontColor(Color.GREEN).setBold();
        Text text2=new Text("\nHappy Birthday").setFont(font2).setFontColor(Color.CYAN).setItalic();
        Paragraph paragraph=new Paragraph()
                .add(text1)
                .add(text2);
        pdfDocument.addNewPage();
        Document document=new Document(pdfDocument);
        document.add(list1.setFont(font));
        document.add(paragraph);
        document.close();
        System.out.println("Document Created");

    }
}
