package Library;


public class Book {
    @Override
    public String toString() {
        return " Mã sách:: " + bookCode + " ,Tên sách:: " + bookTitle + " ,Thể loại:: " + category + " ,Tác giả:: "
                + author + " ,Năm sản xuất:: " + yearOfManufacture + " ,Nhà sản xuất:: " + producer + " ,Số trang:: "
                + numberOfPages ;
    }
    private BookCode bookCode;
    private String bookTitle;
    private Category category;
    private String author;
    private int yearOfManufacture;
    private String producer;
    private int numberOfPages;
    public Book(BookCode bookCode, String bookTitle, Category category, String author, int yearOfManufacture,String producer, int numberOfPages){
        this.bookCode = bookCode;
        this.bookTitle = bookTitle;
        this.category = category;
        this.author = author;
        this.producer = producer;
        this.numberOfPages = numberOfPages;
        this.yearOfManufacture = yearOfManufacture;
    }
    public BookCode getBookCode(){
        return bookCode;
    }
    public void setBookCode(BookCode bookCode){
        this.bookCode = bookCode;
    }
    public String getbookTitle(){
        return bookTitle;
    }
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    public Category getcategory() {
        return category;
    }
    public void setCategory(Category category){
        this.category = category;
    }
    public String getauthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public int getyearOfManufacture(){
        return yearOfManufacture;
    }
    public void setyearOfManufacture(int yearOfManufacture){
        this.yearOfManufacture = yearOfManufacture;
    }
    public String getproduct() {
        return producer;
    }
    public void setProduct(String producer){
        this.producer = producer;
    }
    public int getnumberOfPages(){
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}