package Library;

public class LineItem {

    private BookCode bookCode;
    public static int count;
    public BookCode getBookCode() {
        return bookCode;
    }
    public void setBookCode(BookCode bookCode) {
     this.bookCode = bookCode;   
    }
    LineItem(BookCode bookCode) {
        this.bookCode = bookCode;
        count++;
    }

}
