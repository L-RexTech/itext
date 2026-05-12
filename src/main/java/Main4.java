import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Main4 {
    public static void main(String args[]) throws FileNotFoundException, MalformedURLException {
        String path="C:\\Users\\prajjwal.singh\\Documents\\ITEXT\\forthpdf.pdf";
        String image="images\\flag.jpg";
        ImageData imageData=ImageDataFactory.create(image);
        Image image0=new Image(imageData);
        PdfWriter pdfWriter=new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        Document document=new Document(pdfDocument);
        float columnwidth[]={200f,50f,100f};
        Table table=new Table(columnwidth);
        String tableHeader[]={"item","Color","Size"};
        String item[][]={{"Box","RED","BIG"},
                {"Lights","White","Medium"},
                {"Gun","Metal","Concealed"},
                {"Human","Skin","ALIVE"}
                };
        table.addCell(new Cell().add(tableHeader[0]).setBackgroundColor(Color.DARK_GRAY));
        table.addCell(new Cell().add(tableHeader[1]).setBackgroundColor(Color.RED));
        table.addCell(new Cell().add(tableHeader[2]).setBackgroundColor(Color.GREEN));
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i%2==0) {
                    table.addCell(new Cell().add(item[i][j]).setBackgroundColor(Color.PINK));
                }
                else {
                    table.addCell(new Cell().add(item[i][j]).setBackgroundColor(new DeviceRgb(202, 66, 255)));
                }
            }
        }
        table.addCell(new Cell().add("Orange"));
        table.addCell(new Cell().add(image0));
        table.addCell(new Cell().add("No"));

       /* Cell cell_11=new Cell();
        cell_11.add("items");
        table.addCell(cell_11);

        table.addCell(new Cell().add("Qty"));
        table.addCell(new Cell().add("Available"));

        table.addCell(new Cell().add("Mango"));
        table.addCell(new Cell().add("2kg"));
        table.addCell(new Cell().add("Yes"));

        table.addCell(new Cell().add("Orange"));
        table.addCell(new Cell().add("5kg"));
        table.addCell(new Cell().add("No"));
        //table.addCell(new Cell().add("Banana"));*/


        document.add(table);
        document.close();
        System.out.println("Document Created");
    }
}
