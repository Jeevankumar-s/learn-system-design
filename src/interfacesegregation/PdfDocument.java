package interfacesegregation;

public class PdfDocument implements Document, PrintableDocument {
    @Override
    public void print() {
        System.out.println("Printing Document");

    }

    @Override
    public void save() {
        System.out.println("Saving Document");

    }

    @Override
    public void create() {
        System.out.println("Creating Document");

    }
    
    @Override
    public void delete() {
        System.out.println("Deleting Document");

    }
}
