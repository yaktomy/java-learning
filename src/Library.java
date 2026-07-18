import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<Integer,Book> bookHashMap = new HashMap<>();
    public Book findBookById(int id){
        return bookHashMap.get(id);
    }
    public void addBookById(int id, Book book){
        bookHashMap.put(id, book);
    }
    public void addBook(Book book){
        books.add(book);
    }
    public Book findBook(String title){
       for (Book book : books){
           if (book.getTitle().equals(title)){
               return book;
           }
       }
       return null;
    }
    public ArrayList<Book> findBookByAuthor(String author){
        ArrayList<Book> booksOneAuthor = new ArrayList<>();
        for (Book book : books){
            if (author.equals(book.getAuthor())){
                booksOneAuthor.add(book);
            }
        }
        if (booksOneAuthor != null){
            System.out.println(booksOneAuthor);
        }
        return null;
    }
    public int getBookCount(){
        return books.size();
    }
    public void removeBook(String title){
        Book bookWillDelete = findBook(title);
        books.remove(bookWillDelete);
    }
    public void printBooks(){
        System.out.println(books);
    }
}
