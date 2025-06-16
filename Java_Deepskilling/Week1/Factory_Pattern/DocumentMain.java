public class DocumentMain {
    public static void printDoc(DocumentFactory factory){
        Document doc=factory.createDocument();
        doc.display();
    }
    public static void main(String[] args) {
        
        // ExcelFactory ef=new ExcelFactory();
        // Document excel=ef.createDocument();
        // PdfFactory pf=new PdfFactory();
        // WordFactory wf=new WordFactory();
        // Document pdf=pf.createDocument();
        // Document word=wf.createDocument();
        // excel.display();
        // pdf.display();
        // word.display();

        printDoc(new ExcelFactory());
        printDoc(new PdfFactory());
        printDoc(new WordFactory());
    }
    
}
