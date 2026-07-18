import java.util.*;

public class Main {



    public static void main(String[] args) {
        Library library = new Library();
        library.addBookById(1, new Book("dfjkjf", 2873, "jskak"));
        library.addBookById(2, new Book("s;l", 2873, "alkn"));
        library.addBookById(3, new Book("k", 2873, "a"));
        Book foundBook = library.findBookById(3);
        System.out.println(foundBook);
    }

}
