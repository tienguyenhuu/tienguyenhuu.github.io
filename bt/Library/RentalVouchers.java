package Library;

public class RentalVouchers {
    Long id;
    private Readers readers;
    private String dateOfHire;
    private String returnDate;
    private LineItem lineItem;
    
    public RentalVouchers(int i, Readers readers, String dateOfHire, String returnDate, LineItem lineItem) {
        this.readers = readers;
        this.dateOfHire = dateOfHire;
        this.returnDate = returnDate;
        this.lineItem = lineItem;
    }
    public Readers getreaders() {
        return readers;
    }
    public void setreaders(Readers readers) {
        this.readers = readers;
    }
    public String getdateOfHire() {
        return dateOfHire;
    }
    public void setdateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }
    public String getreturnDate() {
        return returnDate;
    }
    public void setreturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    public LineItem getlineItem(){
        return lineItem;
    }
    public void setlineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }
}
