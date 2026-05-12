import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.ListItem;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.FileNotFoundException;

public class main5 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\prajjwal.singh\\Documents\\ITEXT\\NestedTableList.pdf";
        PdfWriter writer = new PdfWriter(path);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        float[] columnWidths = {200f, 200f};
        Table outerTable = new Table(columnWidths);

        // Cell 1: Nested Table
        float[] innerColumnWidths = {100f, 100f};
        Table innerTable = new Table(innerColumnWidths);
        innerTable.addCell(new Cell().add(new Paragraph("Inner 1.1")));
        innerTable.addCell(new Cell().add(new Paragraph("Inner 1.2")));
        innerTable.addCell(new Cell().add(new Paragraph("Inner 2.1")));
        innerTable.addCell(new Cell().add(new Paragraph("Inner 2.2")));

        Cell cell1 = new Cell();
        cell1.add(new Paragraph("Nested Table below:"));
        cell1.add(innerTable);
        outerTable.addCell(cell1);

        // Cell 2: List
        List list = new List();
        list.add(new ListItem("Item 1"));
        list.add(new ListItem("Item 2"));
        list.add(new ListItem("Item 3"));

        Cell cell2 = new Cell();
        cell2.add(new Paragraph("List below:"));
        cell2.add(list);
        outerTable.addCell(cell2);

        document.add(new Paragraph("Example of Nested Table and List inside a Table:"));
        document.add(outerTable);

        document.close();
        System.out.println("main5.java: PDF Created with nested table and list.");
    }
}
