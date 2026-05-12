import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Main {
    public static void main(String args[]) throws FileNotFoundException, MalformedURLException {
        String path="C:\\Users\\prajjwal.singh\\Documents\\ITEXT\\Firstpdf.pdf";
        String imgSrc="images\\flag.jpg";
        ImageData data = ImageDataFactory.create(imgSrc);
        Image image1 = new Image(data);
        PdfWriter pdfWriter=new PdfWriter(path);
        String ParaText="Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum";
        Paragraph paragraph1=new Paragraph(ParaText);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();
        Document document=new Document(pdfDocument);
        document.add(paragraph1);
        document.add(image1);
        document.close();
        System.out.println("Document Created");

    }
}
