import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;

public class main6 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\prajjwal.singh\\Documents\\ITEXT\\Invoice.pdf";
        PdfWriter writer = new PdfWriter(path);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        // Header Table
        float[] headerWidths = {300f, 200f};
        Table headerTable = new Table(headerWidths);
        headerTable.addCell(new Cell().add(new Paragraph("COMPANY NAME")).setFontSize(20).setBold().setBorder(Border.NO_BORDER));
        headerTable.addCell(new Cell().add(new Paragraph("INVOICE")).setFontSize(26).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        document.add(headerTable);

        document.add(new Paragraph("\n"));

        // Info Table (Invoice #, Date, Customer)
        float[] infoWidths = {250f, 250f};
        Table infoTable = new Table(infoWidths);
        
        Cell customerCell = new Cell();
        customerCell.add(new Paragraph("BILL TO:").setBold());
        customerCell.add(new Paragraph("John Doe\n123 Street Name\nCity, Country"));
        customerCell.setBorder(Border.NO_BORDER);
        infoTable.addCell(customerCell);

        Cell invoiceDetailsCell = new Cell();
        invoiceDetailsCell.add(new Paragraph("Invoice #: 1001").setTextAlignment(TextAlignment.RIGHT));
        invoiceDetailsCell.add(new Paragraph("Date: 2024-05-12").setTextAlignment(TextAlignment.RIGHT));
        invoiceDetailsCell.setBorder(Border.NO_BORDER);
        infoTable.addCell(invoiceDetailsCell);
        
        document.add(infoTable);
        document.add(new Paragraph("\n"));

        // Items Table
        float[] itemWidths = {300f, 50f, 100f, 100f};
        Table itemTable = new Table(itemWidths);
        
        // Header row
        itemTable.addHeaderCell(new Cell().add(new Paragraph("Description").setBold()));
        itemTable.addHeaderCell(new Cell().add(new Paragraph("Qty").setBold()));
        itemTable.addHeaderCell(new Cell().add(new Paragraph("Unit Price").setBold()));
        itemTable.addHeaderCell(new Cell().add(new Paragraph("Total").setBold()));

        // Item 1
        itemTable.addCell(new Cell().add(new Paragraph("Item Name 1")));
        itemTable.addCell(new Cell().add(new Paragraph("2")));
        itemTable.addCell(new Cell().add(new Paragraph("500.00")));
        itemTable.addCell(new Cell().add(new Paragraph("1000.00")));

        // Item 2
        itemTable.addCell(new Cell().add(new Paragraph("Item Name 2")));
        itemTable.addCell(new Cell().add(new Paragraph("1")));
        itemTable.addCell(new Cell().add(new Paragraph("250.00")));
        itemTable.addCell(new Cell().add(new Paragraph("250.00")));

        document.add(itemTable);

        // Summary Table
        document.add(new Paragraph("\n"));
        float[] summaryWidths = {350f, 150f};
        Table summaryTable = new Table(summaryWidths);
        summaryTable.addCell(new Cell().setBorder(Border.NO_BORDER));
        summaryTable.addCell(new Cell().add(new Paragraph("Subtotal: 1250.00")).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        
        summaryTable.addCell(new Cell().setBorder(Border.NO_BORDER));
        summaryTable.addCell(new Cell().add(new Paragraph("Tax (10%): 125.00")).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));
        
        summaryTable.addCell(new Cell().setBorder(Border.NO_BORDER));
        summaryTable.addCell(new Cell().add(new Paragraph("Total: 1375.00").setBold().setFontSize(14)).setTextAlignment(TextAlignment.RIGHT).setBorder(Border.NO_BORDER));

        document.add(summaryTable);

        document.close();
        System.out.println("main6.java: Invoice PDF Created.");
    }
}
