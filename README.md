# iText 7 PDF Generation Examples

This project demonstrates various ways to generate PDF documents using the **iText 7** library in Java. It covers everything from basic text and images to complex nested tables and invoice generation.

## Getting Started

### Prerequisites
* **Java 17** or higher
* **Maven** for dependency management

### Dependencies
The project uses the following iText 7 modules:
* `kernel`: Core PDF engine
* `io`: Low-level I/O operations
* `layout`: High-level layout API (Tables, Paragraphs, Lists)
* `forms`, `pdfa`, `sign`, `barcodes`: Additional specialized modules

## Project Structure

| File | Description |
| :--- | :--- |
| `Main.java` | Basic PDF with Paragraphs and Images. |
| `main2.java` | Working with Custom Fonts (`.ttf`) and simple Lists. |
| `Main3.java` | Using `Style` objects to reuse formatting across elements. |
| `Main4.java` | Creating Tables with background colors and multi-column layouts. |
| `main5.java` | **Advanced Layout**: Nested tables and Lists inside table cells. |
| `main6.java` | **Invoice Generator**: A real-world example of creating a professional invoice. |

## How to Run

1.  **Clone the repository** (if applicable).
2.  **Build the project**:
    ```bash
    mvn clean compile
    ```
3.  **Run an example**:
    You can run any of the `main` classes. For example, to generate an invoice:
    ```bash
    mvn exec:java -Dexec.mainClass="main6"
    ```

> [!IMPORTANT]
> Some files use absolute paths for output (e.g., `C:\Users\...\Documents\ITEXT\`). Ensure these directories exist or modify the `path` variable in the Java files before running.

## Key Features Demonstrated
* **Text Formatting**: Bold, Italic, Font Colors, and Custom Fonts.
* **Tables**: Cell borders, background colors, and nested tables.
* **Lists**: Unordered lists and lists inside tables.
* **Images**: Adding images from the local filesystem.
* **Professional Layouts**: Document headers, footers, and complex alignments for invoices.

---
*Created as a learning resource for iText 7 PDF generation.*
