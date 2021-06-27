package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
List<Book> books = new ArrayList<Book>();
public void addBook(Book book) {
    books.add(book);
}
public static Library LifeOfPi() {
    Library book = new Library();
    book.addBook(new Book(BookCode.a1, "Life Of Pi", Category.ActionAndAdventure, "YannMartel", 2001, "Knopf Canada", 326));
    return book;
}
public static Library LittleWomen() {
    Library book = new Library();
    book.addBook(new Book(BookCode.a2, "Little Women", Category.Classics, "Louisa May Alcott", 1868, "Roberts Brothers", 759));
    return book;
}
public static Library Watchmen() {
    Library book = new Library();
    book.addBook(new Book(BookCode.a3, "Watchmen", Category.ComicBookOrGraphicNovel, "Alan Moore", 1986, "DC Comics", 416));
    return book;
}
public void showAllBooks(){
    for (Book book : books) {
        System.out.println(book);
}
}

List<Readers> readers = new ArrayList<Readers>();
public void addReader(Readers reader) {
    readers.add(reader);
}
public static Library khoa(){
    Library reader = new Library();
    reader.addReader(new Readers("01","Khoa","khoa@mail.com","0123450","hanoi"));
    return reader;
}
public static Library trung(){
    Library reader = new Library();
    reader.addReader(new Readers("02","Trung","trung@mail.com","0123451","hanoi"));
    return reader;
}
public static Library tot(){
    Library reader = new Library();
    reader.addReader(new Readers("03","Tốt","tot@mail.com","0123452","hanoi"));
    return reader;
}
public static Library Long(){
    Library reader = new Library();
    reader.addReader(new Readers("04","Long","long@mail.com","0123453","hanoi"));
    return reader;
}public static Library an(){
    Library reader = new Library();
    reader.addReader(new Readers("05","An","an@mail.com","0123454","hanoi"));
    return reader;
}
public void showDetails(){
    for(Readers reader: readers){
        System.out.println(reader);
    }
}
}
