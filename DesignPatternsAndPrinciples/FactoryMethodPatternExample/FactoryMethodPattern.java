
// Document interface
interface Document {
    void open();
}

// Concrete Word Document
class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word Document.");
    }
}

// Concrete PDF Document
class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}

// Concrete Excel Document
class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Document.");
    }
}

// Abstract Factory
abstract class DocumentFactory {
    public abstract Document createDocument();
}

// Concrete Factory for Word
class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

// Concrete Factory for PDF
class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

// Concrete Factory for Excel
class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

// Test class
public class FactoryMethodPattern {
    public static void main(String[] args) {
        // Create Word document
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        // Create PDF document
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        // Create Excel document
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
